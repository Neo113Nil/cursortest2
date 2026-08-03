package androidx.core.location;

/* loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    private static java.lang.reflect.Method sGnssRequestBuilderBuildMethod;
    private static java.lang.Class<?> sGnssRequestBuilderClass;
    static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> sLocationListeners = new java.util.WeakHashMap<>();
    private static java.lang.reflect.Method sRegisterGnssMeasurementsCallbackMethod;

    public static boolean isLocationEnabled(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static boolean hasProvider(android.location.LocationManager locationManager, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    @java.lang.Deprecated
    public static void getCurrentLocation(android.location.LocationManager locationManager, java.lang.String str, androidx.core.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.core.util.Consumer<android.location.Location> consumer) {
        getCurrentLocation(locationManager, str, cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, executor, consumer);
    }

    public static void getCurrentLocation(android.location.LocationManager locationManager, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<android.location.Location> consumer) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && android.os.SystemClock.elapsedRealtime() - androidx.core.location.LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final androidx.core.location.LocationManagerCompat.CancellableLocationListener cancellableLocationListener = new androidx.core.location.LocationManagerCompat.CancellableLocationListener(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, cancellableLocationListener, android.os.Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.cancel();
                }
            });
        }
        cancellableLocationListener.startTimeout(30000L);
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, java.util.concurrent.Executor executor, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30 || !androidx.core.location.LocationManagerCompat.Api30Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = new androidx.core.location.LocationManagerCompat.LocationListenerTransport(new androidx.core.location.LocationManagerCompat.LocationListenerKey(str, locationListenerCompat), executor);
            if (androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerTransport)) {
                return;
            }
            synchronized (sLocationListeners) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, android.os.Looper.getMainLooper());
                registerLocationListenerTransport(locationManager, locationListenerTransport);
            }
        }
    }

    static void registerLocationListenerTransport(android.location.LocationManager locationManager, androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport) {
        java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport> put = sLocationListeners.put(locationListenerTransport.getKey(), new java.lang.ref.WeakReference<>(locationListenerTransport));
        androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport2 = put != null ? put.get() : null;
        if (locationListenerTransport2 != null) {
            locationListenerTransport2.unregister();
            locationManager.removeUpdates(locationListenerTransport2);
        }
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationListenerCompat locationListenerCompat, android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), androidx.core.os.ExecutorCompat.create(new android.os.Handler(looper)), locationListenerCompat);
        } else {
            if (androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }

    public static void removeUpdates(android.location.LocationManager locationManager, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> weakHashMap = sLocationListeners;
        synchronized (weakHashMap) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> it = weakHashMap.values().iterator();
            java.util.ArrayList arrayList = null;
            while (it.hasNext()) {
                androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = it.next().get();
                if (locationListenerTransport != null) {
                    androidx.core.location.LocationManagerCompat.LocationListenerKey key = locationListenerTransport.getKey();
                    if (key.mListener == locationListenerCompat) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(key);
                        locationListenerTransport.unregister();
                        locationManager.removeUpdates(locationListenerTransport);
                    }
                }
            }
            if (arrayList != null) {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sLocationListeners.remove((androidx.core.location.LocationManagerCompat.LocationListenerKey) it2.next());
                }
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    public static java.lang.String getGnssHardwareModelName(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    private static class GnssListenersHolder {
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = new androidx.collection.SimpleArrayMap<>();
        static final androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = new androidx.collection.SimpleArrayMap<>();

        private GnssListenersHolder() {
        }
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT > 30) {
            return androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler);
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, androidx.core.os.ExecutorCompat.create(handler), callback);
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners) {
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners.put(callback, callback);
            return true;
        }
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT > 30) {
            return androidx.core.location.LocationManagerCompat.Api31Impl.registerGnssMeasurementsCallback(locationManager, executor, callback);
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, executor, callback);
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners) {
            androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport gnssMeasurementsTransport = new androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport(callback, executor);
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(locationManager, gnssMeasurementsTransport)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners.put(callback, gnssMeasurementsTransport);
            return true;
        }
    }

    public static void unregisterGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(locationManager, callback);
            return;
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners) {
            android.location.GnssMeasurementsEvent.Callback remove = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners.remove(callback);
            if (remove != null) {
                if (remove instanceof androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) {
                    ((androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) remove).unregister();
                }
                androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(locationManager, remove);
            }
        }
    }

    private static boolean registerGnssMeasurementsCallbackOnR(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT == 30) {
            try {
                if (sGnssRequestBuilderClass == null) {
                    sGnssRequestBuilderClass = java.lang.Class.forName("android.location.GnssRequest$Builder");
                }
                if (sGnssRequestBuilderBuildMethod == null) {
                    java.lang.reflect.Method declaredMethod = sGnssRequestBuilderClass.getDeclaredMethod("build", new java.lang.Class[0]);
                    sGnssRequestBuilderBuildMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (sRegisterGnssMeasurementsCallbackMethod == null) {
                    java.lang.reflect.Method declaredMethod2 = android.location.LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", java.lang.Class.forName("android.location.GnssRequest"), java.util.concurrent.Executor.class, android.location.GnssMeasurementsEvent.Callback.class);
                    sRegisterGnssMeasurementsCallbackMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                java.lang.Object invoke = sRegisterGnssMeasurementsCallbackMethod.invoke(locationManager, sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), new java.lang.Object[0]), executor, callback);
                if (invoke != null) {
                    return ((java.lang.Boolean) invoke).booleanValue();
                }
                return false;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return false;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, androidx.core.os.ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, new androidx.core.location.LocationManagerCompat.InlineHandlerExecutor(handler), callback);
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, callback);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            myLooper = android.os.Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new android.os.Handler(myLooper), executor, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:57:0x00a8, B:58:0x00be, B:45:0x00c1, B:47:0x00c9, B:49:0x00d1, B:50:0x00d7, B:51:0x00d8, B:52:0x00dd, B:53:0x00de, B:54:0x00e4, B:40:0x0097), top: B:22:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:57:0x00a8, B:58:0x00be, B:45:0x00c1, B:47:0x00c9, B:49:0x00d1, B:50:0x00d7, B:51:0x00d8, B:52:0x00dd, B:53:0x00de, B:54:0x00e4, B:40:0x0097), top: B:22:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean registerGnssStatusCallback(final android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(locationManager, handler, executor, callback);
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(locationManager, handler, executor, callback);
        }
        boolean z = true;
        androidx.core.util.Preconditions.checkArgument(handler != null);
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners) {
            final androidx.core.location.LocationManagerCompat.GpsStatusTransport gpsStatusTransport = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.get(callback);
            if (gpsStatusTransport == null) {
                gpsStatusTransport = new androidx.core.location.LocationManagerCompat.GpsStatusTransport(locationManager, callback);
            } else {
                gpsStatusTransport.unregister();
            }
            gpsStatusTransport.register(executor);
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean valueOf;
                    valueOf = java.lang.Boolean.valueOf(locationManager.addGpsStatusListener(gpsStatusTransport));
                    return valueOf;
                }
            });
            if (android.os.Looper.myLooper() == handler.getLooper()) {
                futureTask.run();
            } else if (!handler.post(futureTask)) {
                throw new java.lang.IllegalStateException(handler + " is shutting down");
            }
            try {
                try {
                    long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(5L);
                    long nanoTime = java.lang.System.nanoTime() + nanos;
                    boolean z2 = false;
                    while (((java.lang.Boolean) futureTask.get(nanos, java.util.concurrent.TimeUnit.NANOSECONDS)).booleanValue()) {
                        try {
                            try {
                                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.put(callback, gpsStatusTransport);
                                if (z2) {
                                    java.lang.Thread.currentThread().interrupt();
                                }
                                return true;
                            } catch (java.util.concurrent.ExecutionException e) {
                                e = e;
                                if (!(e.getCause() instanceof java.lang.RuntimeException)) {
                                    throw ((java.lang.RuntimeException) e.getCause());
                                }
                                if (e.getCause() instanceof java.lang.Error) {
                                    throw ((java.lang.Error) e.getCause());
                                }
                                throw new java.lang.IllegalStateException(e);
                            } catch (java.util.concurrent.TimeoutException e2) {
                                e = e2;
                                throw new java.lang.IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                            }
                        } catch (java.lang.InterruptedException unused) {
                            nanos = nanoTime - java.lang.System.nanoTime();
                            z2 = true;
                        } catch (java.util.concurrent.ExecutionException e3) {
                            e = e3;
                            if (!(e.getCause() instanceof java.lang.RuntimeException)) {
                            }
                        } catch (java.util.concurrent.TimeoutException e4) {
                            e = e4;
                            throw new java.lang.IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            z = z2;
                            if (z) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (z2) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    return false;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.util.concurrent.ExecutionException e5) {
                e = e5;
            } catch (java.util.concurrent.TimeoutException e6) {
                e = e6;
            } catch (java.lang.Throwable th3) {
                th = th3;
                z = false;
            }
        }
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners) {
                java.lang.Object remove = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.remove(callback);
                if (remove != null) {
                    androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssStatusCallback(locationManager, remove);
                }
            }
            return;
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners) {
            androidx.core.location.LocationManagerCompat.GpsStatusTransport gpsStatusTransport = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.remove(callback);
            if (gpsStatusTransport != null) {
                gpsStatusTransport.unregister();
                locationManager.removeGpsStatusListener(gpsStatusTransport);
            }
        }
    }

    private LocationManagerCompat() {
    }

    private static class LocationListenerKey {
        final androidx.core.location.LocationListenerCompat mListener;
        final java.lang.String mProvider;

        LocationListenerKey(java.lang.String str, androidx.core.location.LocationListenerCompat locationListenerCompat) {
            this.mProvider = (java.lang.String) androidx.core.util.ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.mListener = (androidx.core.location.LocationListenerCompat) androidx.core.util.ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = (androidx.core.location.LocationManagerCompat.LocationListenerKey) obj;
            return this.mProvider.equals(locationListenerKey.mProvider) && this.mListener.equals(locationListenerKey.mListener);
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.mProvider, this.mListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor mExecutor;
        volatile androidx.core.location.LocationManagerCompat.LocationListenerKey mKey;

        LocationListenerTransport(androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey, java.util.concurrent.Executor executor) {
            this.mKey = locationListenerKey;
            this.mExecutor = executor;
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getKey() {
            return (androidx.core.location.LocationManagerCompat.LocationListenerKey) androidx.core.util.ObjectsCompat.requireNonNull(this.mKey);
        }

        public void unregister() {
            this.mKey = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final android.location.Location location) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4750xa8d50b3d(location);
                }
            });
        }

        /* renamed from: lambda$onLocationChanged$0$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4750xa8d50b3d(android.location.Location location) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onLocationChanged(location);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final java.util.List<android.location.Location> list) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4751x2b1fc01c(list);
                }
            });
        }

        /* renamed from: lambda$onLocationChanged$1$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4751x2b1fc01c(java.util.List list) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onLocationChanged((java.util.List<android.location.Location>) list);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4749xf04cfe9d(i);
                }
            });
        }

        /* renamed from: lambda$onFlushComplete$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4749xf04cfe9d(int i) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onFlushComplete(i);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final java.lang.String str, final int i, final android.os.Bundle bundle) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4754xdbe6a717(str, i, bundle);
                }
            });
        }

        /* renamed from: lambda$onStatusChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4754xdbe6a717(java.lang.String str, int i, android.os.Bundle bundle) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onStatusChanged(str, i, bundle);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final java.lang.String str) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4753x5a2a7b08(str);
                }
            });
        }

        /* renamed from: lambda$onProviderEnabled$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4753x5a2a7b08(java.lang.String str) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onProviderEnabled(str);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final java.lang.String str) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m4752x442abc92(str);
                }
            });
        }

        /* renamed from: lambda$onProviderDisabled$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m4752x442abc92(java.lang.String str) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onProviderDisabled(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GnssMeasurementsTransport extends android.location.GnssMeasurementsEvent.Callback {
        final android.location.GnssMeasurementsEvent.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        GnssMeasurementsTransport(android.location.GnssMeasurementsEvent.Callback callback, java.util.concurrent.Executor executor) {
            this.mCallback = callback;
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final android.location.GnssMeasurementsEvent gnssMeasurementsEvent) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport.this.m4743xb1484c70(executor, gnssMeasurementsEvent);
                }
            });
        }

        /* renamed from: lambda$onGnssMeasurementsReceived$0$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m4743xb1484c70(java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport.this.m4744xdc872524(executor, i);
                }
            });
        }

        /* renamed from: lambda$onStatusChanged$1$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m4744xdc872524(java.util.concurrent.Executor executor, int i) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStatusChanged(i);
        }
    }

    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.mCallback.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
            this.mCallback.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void register(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkArgument(executor != null, "invalid null executor");
            androidx.core.util.Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m4757x7ba12b9c(executor);
                }
            });
        }

        /* renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m4757x7ba12b9c(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m4758x80a5cd6f(executor);
                }
            });
        }

        /* renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m4758x80a5cd6f(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m4755x4191f1e(executor, i);
                }
            });
        }

        /* renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m4755x4191f1e(java.util.concurrent.Executor executor, int i) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final android.location.GnssStatus gnssStatus) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m4756xdecf6cdb(executor, gnssStatus);
                }
            });
        }

        /* renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m4756xdecf6cdb(java.util.concurrent.Executor executor, android.location.GnssStatus gnssStatus) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        GpsStatusTransport(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        public void register(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            android.location.GpsStatus gpsStatus;
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m4745x75e92221(executor);
                    }
                });
                return;
            }
            if (i == 2) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m4746xc3a89a22(executor);
                    }
                });
                return;
            }
            if (i != 3) {
                if (i == 4 && (gpsStatus = this.mLocationManager.getGpsStatus(null)) != null) {
                    final androidx.core.location.GnssStatusCompat wrap = androidx.core.location.GnssStatusCompat.wrap(gpsStatus);
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m4748x5f278a24(executor, wrap);
                        }
                    });
                    return;
                }
                return;
            }
            android.location.GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m4747x11681223(executor, timeToFirstFix);
                    }
                });
            }
        }

        /* renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m4745x75e92221(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStarted();
        }

        /* renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m4746xc3a89a22(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStopped();
        }

        /* renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m4747x11681223(java.util.concurrent.Executor executor, int i) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onFirstFix(i);
        }

        /* renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m4748x5f278a24(java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat gnssStatusCompat) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onSatelliteStatusChanged(gnssStatusCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.lang.Runnable mTimeoutRunnable;
        private boolean mTriggered;

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
        }

        CancellableLocationListener(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, androidx.core.util.Consumer<android.location.Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        public void cancel() {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                cleanup();
            }
        }

        public void startTimeout(long j) {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.m4742x40ccd759();
                    }
                };
                this.mTimeoutRunnable = runnable;
                this.mTimeoutHandler.postDelayed(runnable, j);
            }
        }

        /* renamed from: lambda$startTimeout$0$androidx-core-location-LocationManagerCompat$CancellableLocationListener, reason: not valid java name */
        /* synthetic */ void m4742x40ccd759() {
            this.mTimeoutRunnable = null;
            onLocationChanged((android.location.Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String str) {
            onLocationChanged((android.location.Location) null);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final android.location.Location location) {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                final androidx.core.util.Consumer<android.location.Location> consumer = this.mConsumer;
                this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.util.Consumer.this.accept(location);
                    }
                });
                cleanup();
            }
        }

        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            java.lang.Runnable runnable = this.mTimeoutRunnable;
            if (runnable != null) {
                this.mTimeoutHandler.removeCallbacks(runnable);
                this.mTimeoutRunnable = null;
            }
        }
    }

    private static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(android.os.Handler handler) {
            this.mHandler = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (android.os.Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else {
                if (this.mHandler.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static boolean hasProvider(android.location.LocationManager locationManager, java.lang.String str) {
            return locationManager.hasProvider(str);
        }

        static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, android.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, android.location.LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }
    }

    private static class Api30Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        static void getCurrentLocation(android.location.LocationManager locationManager, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<android.location.Location> consumer) {
            java.util.Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.core.util.Consumer.this.accept((android.location.Location) obj);
                }
            });
        }

        public static boolean tryRequestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, java.util.concurrent.Executor executor, androidx.core.location.LocationListenerCompat locationListenerCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = java.lang.Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesExecutorMethod == null) {
                        java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, java.util.concurrent.Executor.class, android.location.LocationListener.class);
                        sRequestLocationUpdatesExecutorMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesExecutorMethod.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
                }
            }
            return false;
        }

        public static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
            synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners) {
                androidx.core.location.LocationManagerCompat.GnssStatusTransport gnssStatusTransport = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.get(callback);
                if (gnssStatusTransport == null) {
                    gnssStatusTransport = new androidx.core.location.LocationManagerCompat.GnssStatusTransport(callback);
                }
                if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                    return false;
                }
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.put(callback, gnssStatusTransport);
                return true;
            }
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isLocationEnabled(android.location.LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }

        static java.lang.String getGnssHardwareModelName(android.location.LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int getGnssYearOfHardware(android.location.LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
    }

    static class Api19Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, android.location.LocationListener.class, android.os.Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (androidx.core.location.LocationManagerCompat.sLocationListeners) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerTransport, android.os.Looper.getMainLooper());
                        androidx.core.location.LocationManagerCompat.registerLocationListenerTransport(locationManager, locationListenerTransport);
                    }
                    return true;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            }
            return false;
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationListenerCompat locationListenerCompat, android.os.Looper looper) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, android.location.LocationListener.class, android.os.Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            }
            return false;
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback, android.os.Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        static void unregisterGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(handler != null);
            synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners) {
                androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.get(callback);
                if (preRGnssStatusTransport == null) {
                    preRGnssStatusTransport = new androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport(callback);
                } else {
                    preRGnssStatusTransport.unregister();
                }
                preRGnssStatusTransport.register(executor);
                if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                    return false;
                }
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners.put(callback, preRGnssStatusTransport);
                return true;
            }
        }

        static void unregisterGnssStatusCallback(android.location.LocationManager locationManager, java.lang.Object obj) {
            if (obj instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) {
                ((androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) obj).unregister();
            }
            locationManager.unregisterGnssStatusCallback((android.location.GnssStatus.Callback) obj);
        }
    }
}
