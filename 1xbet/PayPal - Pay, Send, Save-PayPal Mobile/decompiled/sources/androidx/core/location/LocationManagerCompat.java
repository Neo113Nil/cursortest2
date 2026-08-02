package androidx.core.location;

/* loaded from: classes7.dex */
public final class LocationManagerCompat {
    static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> getHighResolutionOutputSizeshNQ4ISI = new java.util.WeakHashMap<>();
    private static java.lang.Class<?> getHighSpeedVideoFpsRanges;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    public static boolean isLocationEnabled(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getHighSpeedVideoFpsRangesFor(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static boolean hasProvider(android.location.LocationManager locationManager, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.location.LocationManagerCompat.Api31Impl.getHighSpeedVideoFpsRangesFor(locationManager, str);
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
            androidx.core.location.LocationManagerCompat.Api30Impl.getHighSpeedVideoFpsRanges(locationManager, str, cancellationSignal, executor, consumer);
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
                    androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.getHighSpeedVideoSizes();
                }
            });
        }
        cancellableLocationListener.getHighResolutionOutputSizeshNQ4ISI(30000L);
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, java.util.concurrent.Executor executor, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.bT_(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30 || !androidx.core.location.LocationManagerCompat.Api30Impl.Camera2StreamConfigurationMap(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = new androidx.core.location.LocationManagerCompat.LocationListenerTransport(new androidx.core.location.LocationManagerCompat.LocationListenerKey(str, locationListenerCompat), executor);
            if (androidx.core.location.LocationManagerCompat.Api19Impl.getHighResolutionOutputSizeshNQ4ISI(locationManager, str, locationRequestCompat, locationListenerTransport)) {
                return;
            }
            synchronized (getHighResolutionOutputSizeshNQ4ISI) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, android.os.Looper.getMainLooper());
                getHighSpeedVideoFpsRangesFor(locationManager, locationListenerTransport);
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor(android.location.LocationManager locationManager, androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport) {
        java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport> put = getHighResolutionOutputSizeshNQ4ISI.put(locationListenerTransport.getHighSpeedVideoSizes(), new java.lang.ref.WeakReference<>(locationListenerTransport));
        androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport2 = put != null ? put.get() : null;
        if (locationListenerTransport2 != null) {
            locationListenerTransport2.getHighResolutionOutputSizeshNQ4ISI();
            locationManager.removeUpdates(locationListenerTransport2);
        }
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationListenerCompat locationListenerCompat, android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.bT_(locationManager, str, locationRequestCompat.toLocationRequest(), androidx.core.os.ExecutorCompat.create(new android.os.Handler(looper)), locationListenerCompat);
        } else {
            if (androidx.core.location.LocationManagerCompat.Api19Impl.getHighSpeedVideoFpsRangesFor(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }

    public static void removeUpdates(android.location.LocationManager locationManager, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> weakHashMap = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (weakHashMap) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> it = weakHashMap.values().iterator();
            java.util.ArrayList arrayList = null;
            while (it.hasNext()) {
                androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = it.next().get();
                if (locationListenerTransport != null) {
                    androidx.core.location.LocationManagerCompat.LocationListenerKey highSpeedVideoSizes = locationListenerTransport.getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes.getHighSpeedVideoFpsRanges == locationListenerCompat) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(highSpeedVideoSizes);
                        locationListenerTransport.getHighResolutionOutputSizeshNQ4ISI();
                        locationManager.removeUpdates(locationListenerTransport);
                    }
                }
            }
            if (arrayList != null) {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    getHighResolutionOutputSizeshNQ4ISI.remove((androidx.core.location.LocationManagerCompat.LocationListenerKey) it2.next());
                }
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    public static java.lang.String getGnssHardwareModelName(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.Camera2StreamConfigurationMap(locationManager);
        }
        return 0;
    }

    static class GnssListenersHolder {
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> Camera2StreamConfigurationMap = new androidx.collection.SimpleArrayMap<>();
        static final androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> getHighSpeedVideoFpsRanges = new androidx.collection.SimpleArrayMap<>();

        private GnssListenersHolder() {
        }
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT > 30) {
            return androidx.core.location.LocationManagerCompat.Api24Impl.Camera2StreamConfigurationMap(locationManager, callback, handler);
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            return getHighSpeedVideoSizes(locationManager, androidx.core.os.ExecutorCompat.create(handler), callback);
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges) {
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!androidx.core.location.LocationManagerCompat.Api24Impl.Camera2StreamConfigurationMap(locationManager, callback, handler)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges.put(callback, callback);
            return true;
        }
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT > 30) {
            return androidx.core.location.LocationManagerCompat.Api31Impl.getHighSpeedVideoFpsRangesFor(locationManager, executor, callback);
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            return getHighSpeedVideoSizes(locationManager, executor, callback);
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges) {
            androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport gnssMeasurementsTransport = new androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport(callback, executor);
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!androidx.core.location.LocationManagerCompat.Api24Impl.Camera2StreamConfigurationMap(locationManager, (android.location.GnssMeasurementsEvent.Callback) gnssMeasurementsTransport)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges.put(callback, gnssMeasurementsTransport);
            return true;
        }
    }

    public static void unregisterGnssMeasurementsCallback(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.location.LocationManagerCompat.Api24Impl.getHighSpeedVideoSizes(locationManager, callback);
            return;
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges) {
            android.location.GnssMeasurementsEvent.Callback remove = androidx.core.location.LocationManagerCompat.GnssListenersHolder.getHighSpeedVideoFpsRanges.remove(callback);
            if (remove != null) {
                if (remove instanceof androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) {
                    ((androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) remove).getHighSpeedVideoFpsRanges();
                }
                androidx.core.location.LocationManagerCompat.Api24Impl.getHighSpeedVideoSizes(locationManager, remove);
            }
        }
    }

    private static boolean getHighSpeedVideoSizes(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT == 30) {
            try {
                if (getHighSpeedVideoFpsRanges == null) {
                    getHighSpeedVideoFpsRanges = java.lang.Class.forName("android.location.GnssRequest$Builder");
                }
                if (getHighSpeedVideoFpsRangesFor == null) {
                    java.lang.reflect.Method declaredMethod = getHighSpeedVideoFpsRanges.getDeclaredMethod("build", new java.lang.Class[0]);
                    getHighSpeedVideoFpsRangesFor = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (getHighSpeedVideoSizes == null) {
                    java.lang.reflect.Method declaredMethod2 = android.location.LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", java.lang.Class.forName("android.location.GnssRequest"), java.util.concurrent.Executor.class, android.location.GnssMeasurementsEvent.Callback.class);
                    getHighSpeedVideoSizes = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                java.lang.Object invoke = getHighSpeedVideoSizes.invoke(locationManager, getHighSpeedVideoFpsRangesFor.invoke(getHighSpeedVideoFpsRanges.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), new java.lang.Object[0]), executor, callback);
                if (invoke != null) {
                    if (((java.lang.Boolean) invoke).booleanValue()) {
                        return true;
                    }
                }
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            return false;
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
            return getHighSpeedVideoFpsRanges(locationManager, null, executor, callback);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            myLooper = android.os.Looper.getMainLooper();
        }
        return getHighSpeedVideoFpsRanges(locationManager, new android.os.Handler(myLooper), executor, callback);
    }

    private static boolean getHighSpeedVideoFpsRanges(android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.LocationManagerCompat.Api30Impl.getHighSpeedVideoSizes(locationManager, handler, executor, callback);
        }
        return androidx.core.location.LocationManagerCompat.Api24Impl.getHighSpeedVideoFpsRanges(locationManager, handler, executor, callback);
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback) {
        synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap) {
            java.lang.Object remove = androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap.remove(callback);
            if (remove != null) {
                androidx.core.location.LocationManagerCompat.Api24Impl.Camera2StreamConfigurationMap(locationManager, remove);
            }
        }
    }

    private LocationManagerCompat() {
    }

    static class LocationListenerKey {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final androidx.core.location.LocationListenerCompat getHighSpeedVideoFpsRanges;

        LocationListenerKey(java.lang.String str, androidx.core.location.LocationListenerCompat locationListenerCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = (java.lang.String) androidx.core.util.ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.getHighSpeedVideoFpsRanges = (androidx.core.location.LocationListenerCompat) androidx.core.util.ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey)) {
                return false;
            }
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = (androidx.core.location.LocationManagerCompat.LocationListenerKey) obj;
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(locationListenerKey.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges.equals(locationListenerKey.getHighSpeedVideoFpsRanges);
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        }
    }

    static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        volatile androidx.core.location.LocationManagerCompat.LocationListenerKey getHighSpeedVideoFpsRanges;

        LocationListenerTransport(androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey, java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRanges = locationListenerKey;
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getHighSpeedVideoSizes() {
            return (androidx.core.location.LocationManagerCompat.LocationListenerKey) androidx.core.util.ObjectsCompat.requireNonNull(this.getHighSpeedVideoFpsRanges);
        }

        public void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoFpsRanges = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final android.location.Location location) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.getHighSpeedVideoFpsRangesFor(location);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onLocationChanged(location);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final java.util.List<android.location.Location> list) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.Camera2StreamConfigurationMap(list);
                }
            });
        }

        /* synthetic */ void Camera2StreamConfigurationMap(java.util.List list) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onLocationChanged((java.util.List<android.location.Location>) list);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.getHighSpeedVideoFpsRangesFor(i);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onFlushComplete(i);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final java.lang.String str, final int i, final android.os.Bundle bundle) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.getHighSpeedVideoFpsRangesFor(str, i, bundle);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, android.os.Bundle bundle) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onStatusChanged(str, i, bundle);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final java.lang.String str) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.getHighSpeedVideoSizes(str);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoSizes(java.lang.String str) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onProviderEnabled(str);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final java.lang.String str) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.getHighResolutionOutputSizeshNQ4ISI(str);
                }
            });
        }

        /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            androidx.core.location.LocationManagerCompat.LocationListenerKey locationListenerKey = this.getHighSpeedVideoFpsRanges;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.getHighSpeedVideoFpsRanges.onProviderDisabled(str);
        }
    }

    static class GnssMeasurementsTransport extends android.location.GnssMeasurementsEvent.Callback {
        volatile java.util.concurrent.Executor Camera2StreamConfigurationMap;
        final android.location.GnssMeasurementsEvent.Callback getHighSpeedVideoFpsRangesFor;

        GnssMeasurementsTransport(android.location.GnssMeasurementsEvent.Callback callback, java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = callback;
            this.Camera2StreamConfigurationMap = executor;
        }

        public void getHighSpeedVideoFpsRanges() {
            this.Camera2StreamConfigurationMap = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final android.location.GnssMeasurementsEvent gnssMeasurementsEvent) {
            final java.util.concurrent.Executor executor = this.Camera2StreamConfigurationMap;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport.this.getHighSpeedVideoFpsRanges(executor, gnssMeasurementsEvent);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRanges(java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.Camera2StreamConfigurationMap != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            final java.util.concurrent.Executor executor = this.Camera2StreamConfigurationMap;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport.this.getHighSpeedVideoFpsRangesFor(executor, i);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.concurrent.Executor executor, int i) {
            if (this.Camera2StreamConfigurationMap != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onStatusChanged(i);
        }
    }

    static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback Camera2StreamConfigurationMap;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.Camera2StreamConfigurationMap = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.Camera2StreamConfigurationMap.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.Camera2StreamConfigurationMap.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.Camera2StreamConfigurationMap.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
            this.Camera2StreamConfigurationMap.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        volatile java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
        final androidx.core.location.GnssStatusCompat.Callback getHighSpeedVideoFpsRangesFor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.getHighSpeedVideoFpsRangesFor = callback;
        }

        public void Camera2StreamConfigurationMap(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkArgument(executor != null, "invalid null executor");
            androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoFpsRanges == null);
            this.getHighSpeedVideoFpsRanges = executor;
        }

        public void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoFpsRanges = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.getHighResolutionOutputSizeshNQ4ISI(executor);
                }
            });
        }

        /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor) {
            if (this.getHighSpeedVideoFpsRanges != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.getHighSpeedVideoFpsRangesFor(executor);
                }
            });
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.concurrent.Executor executor) {
            if (this.getHighSpeedVideoFpsRanges != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.Camera2StreamConfigurationMap(executor, i);
                }
            });
        }

        /* synthetic */ void Camera2StreamConfigurationMap(java.util.concurrent.Executor executor, int i) {
            if (this.getHighSpeedVideoFpsRanges != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final android.location.GnssStatus gnssStatus) {
            final java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.getHighResolutionOutputSizeshNQ4ISI(executor, gnssStatus);
                }
            });
        }

        /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, android.location.GnssStatus gnssStatus) {
            if (this.getHighSpeedVideoFpsRanges != executor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback Camera2StreamConfigurationMap;
        private final android.location.LocationManager getHighResolutionOutputSizeshNQ4ISI;
        volatile java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            android.location.GpsStatus gpsStatus;
            final java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
            if (executor != null) {
                if (i == 1) {
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.getHighResolutionOutputSizeshNQ4ISI(executor);
                        }
                    });
                    return;
                }
                if (i == 2) {
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.getHighSpeedVideoFpsRangesFor(executor);
                        }
                    });
                    return;
                }
                if (i != 3) {
                    if (i != 4 || (gpsStatus = this.getHighResolutionOutputSizeshNQ4ISI.getGpsStatus(null)) == null) {
                        return;
                    }
                    final androidx.core.location.GnssStatusCompat wrap = androidx.core.location.GnssStatusCompat.wrap(gpsStatus);
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.getHighSpeedVideoFpsRanges(executor, wrap);
                        }
                    });
                    return;
                }
                android.location.GpsStatus gpsStatus2 = this.getHighResolutionOutputSizeshNQ4ISI.getGpsStatus(null);
                if (gpsStatus2 != null) {
                    final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.getHighResolutionOutputSizeshNQ4ISI(executor, timeToFirstFix);
                        }
                    });
                }
            }
        }

        /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor) {
            if (this.getHighSpeedVideoFpsRangesFor != executor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onStarted();
        }

        /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.concurrent.Executor executor) {
            if (this.getHighSpeedVideoFpsRangesFor != executor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onStopped();
        }

        /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, int i) {
            if (this.getHighSpeedVideoFpsRangesFor != executor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onFirstFix(i);
        }

        /* synthetic */ void getHighSpeedVideoFpsRanges(java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat gnssStatusCompat) {
            if (this.getHighSpeedVideoFpsRangesFor != executor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onSatelliteStatusChanged(gnssStatusCompat);
        }
    }

    static final class CancellableLocationListener implements android.location.LocationListener {
        java.lang.Runnable Camera2StreamConfigurationMap;
        private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        private final android.location.LocationManager getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
        private androidx.core.util.Consumer<android.location.Location> getHighSpeedVideoSizes;
        private boolean getOutputFormats;

        @Override // android.location.LocationListener
        public final void onProviderEnabled(java.lang.String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
        }

        CancellableLocationListener(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, androidx.core.util.Consumer<android.location.Location> consumer) {
            this.getHighSpeedVideoFpsRanges = locationManager;
            this.getHighSpeedVideoFpsRangesFor = executor;
            this.getHighSpeedVideoSizes = consumer;
        }

        public final void getHighSpeedVideoSizes() {
            synchronized (this) {
                if (this.getOutputFormats) {
                    return;
                }
                this.getOutputFormats = true;
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            synchronized (this) {
                if (this.getOutputFormats) {
                    return;
                }
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.getHighSpeedVideoFpsRanges();
                    }
                };
                this.Camera2StreamConfigurationMap = runnable;
                this.getHighResolutionOutputSizeshNQ4ISI.postDelayed(runnable, j);
            }
        }

        final /* synthetic */ void getHighSpeedVideoFpsRanges() {
            this.Camera2StreamConfigurationMap = null;
            onLocationChanged((android.location.Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(java.lang.String str) {
            onLocationChanged((android.location.Location) null);
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(final android.location.Location location) {
            synchronized (this) {
                if (this.getOutputFormats) {
                    return;
                }
                this.getOutputFormats = true;
                final androidx.core.util.Consumer<android.location.Location> consumer = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.util.Consumer.this.accept(location);
                    }
                });
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges.removeUpdates(this);
            java.lang.Runnable runnable = this.Camera2StreamConfigurationMap;
            if (runnable != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(runnable);
                this.Camera2StreamConfigurationMap = null;
            }
        }
    }

    static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighSpeedVideoSizes;

        InlineHandlerExecutor(android.os.Handler handler) {
            this.getHighSpeedVideoSizes = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            if (android.os.Looper.myLooper() == this.getHighSpeedVideoSizes.getLooper()) {
                runnable.run();
            } else {
                if (this.getHighSpeedVideoSizes.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(" is shutting down");
                throw new java.util.concurrent.RejectedExecutionException(sb.toString());
            }
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.location.LocationManager locationManager, java.lang.String str) {
            return locationManager.hasProvider(str);
        }

        static void bT_(android.location.LocationManager locationManager, java.lang.String str, android.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, android.location.LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, android.location.GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }
    }

    static class Api30Impl {
        private static java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
        private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;

        private Api30Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.location.LocationManager locationManager, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<android.location.Location> consumer) {
            java.util.Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.core.util.Consumer.this.accept((android.location.Location) obj);
                }
            });
        }

        public static boolean Camera2StreamConfigurationMap(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, java.util.concurrent.Executor executor, androidx.core.location.LocationListenerCompat locationListenerCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                try {
                    if (getHighResolutionOutputSizeshNQ4ISI == null) {
                        getHighResolutionOutputSizeshNQ4ISI = java.lang.Class.forName("android.location.LocationRequest");
                    }
                    if (getHighSpeedVideoFpsRanges == null) {
                        java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", getHighResolutionOutputSizeshNQ4ISI, java.util.concurrent.Executor.class, android.location.LocationListener.class);
                        getHighSpeedVideoFpsRanges = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        getHighSpeedVideoFpsRanges.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
                }
            }
            return false;
        }

        public static boolean getHighSpeedVideoSizes(android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
            synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap) {
                androidx.core.location.LocationManagerCompat.GnssStatusTransport gnssStatusTransport = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap.get(callback);
                if (gnssStatusTransport == null) {
                    gnssStatusTransport = new androidx.core.location.LocationManagerCompat.GnssStatusTransport(callback);
                }
                if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                    return false;
                }
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap.put(callback, gnssStatusTransport);
                return true;
            }
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.location.LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.location.LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int Camera2StreamConfigurationMap(android.location.LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
    }

    static class Api19Impl {
        private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
        private static java.lang.Class<?> getHighSpeedVideoSizes;

        private Api19Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport) {
            try {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (getHighSpeedVideoFpsRanges == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", getHighSpeedVideoSizes, android.location.LocationListener.class, android.os.Looper.class);
                    getHighSpeedVideoFpsRanges = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (androidx.core.location.LocationManagerCompat.getHighResolutionOutputSizeshNQ4ISI) {
                        getHighSpeedVideoFpsRanges.invoke(locationManager, locationRequest, locationListenerTransport, android.os.Looper.getMainLooper());
                        androidx.core.location.LocationManagerCompat.getHighSpeedVideoFpsRangesFor(locationManager, locationListenerTransport);
                    }
                    return true;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            }
            return false;
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationListenerCompat locationListenerCompat, android.os.Looper looper) {
            try {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (getHighSpeedVideoFpsRanges == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", getHighSpeedVideoSizes, android.location.LocationListener.class, android.os.Looper.class);
                    getHighSpeedVideoFpsRanges = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    getHighSpeedVideoFpsRanges.invoke(locationManager, locationRequest, locationListenerCompat, looper);
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

        static boolean Camera2StreamConfigurationMap(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        static boolean Camera2StreamConfigurationMap(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback, android.os.Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        static void getHighSpeedVideoSizes(android.location.LocationManager locationManager, android.location.GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static boolean getHighSpeedVideoFpsRanges(android.location.LocationManager locationManager, android.os.Handler handler, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(handler != null);
            synchronized (androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap) {
                androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap.get(callback);
                if (preRGnssStatusTransport == null) {
                    preRGnssStatusTransport = new androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport(callback);
                } else {
                    preRGnssStatusTransport.getHighResolutionOutputSizeshNQ4ISI();
                }
                preRGnssStatusTransport.Camera2StreamConfigurationMap(executor);
                if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                    return false;
                }
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.Camera2StreamConfigurationMap.put(callback, preRGnssStatusTransport);
                return true;
            }
        }

        static void Camera2StreamConfigurationMap(android.location.LocationManager locationManager, java.lang.Object obj) {
            if (obj instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) {
                ((androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) obj).getHighResolutionOutputSizeshNQ4ISI();
            }
            locationManager.unregisterGnssStatusCallback((android.location.GnssStatus.Callback) obj);
        }
    }
}
