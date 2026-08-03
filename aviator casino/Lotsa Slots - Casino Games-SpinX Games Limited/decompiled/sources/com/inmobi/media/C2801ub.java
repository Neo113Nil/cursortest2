package com.inmobi.media;

/* renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2801ub implements android.location.LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2801ub f5486a = new com.inmobi.media.C2801ub();
    public static final android.location.LocationManager b;
    public static final android.os.HandlerThread c;
    public static com.google.android.gms.common.api.GoogleApiClient d;
    public static final java.lang.String e;
    public static boolean f;
    public static final kotlinx.coroutines.sync.Mutex g;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("LThread");
        c = handlerThread;
        e = "ub";
        g = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        com.inmobi.media.L6.a(handlerThread, "LThread");
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.lang.Object systemService = context.getSystemService(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
            b = systemService instanceof android.location.LocationManager ? (android.location.LocationManager) systemService : null;
        }
    }

    public static android.location.Location c() {
        try {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            com.google.android.gms.tasks.Task<android.location.Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            return lastLocation.getResult();
        } catch (java.lang.Exception unused) {
            return null;
        } catch (java.lang.IncompatibleClassChangeError e2) {
            java.lang.String TAG = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            e2.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            if (com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (java.lang.Exception unused) {
            java.lang.String TAG = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.location.LocationManager locationManager = b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            return android.provider.Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (android.provider.Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public static boolean f() {
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.common.api.GoogleApiClient.class).getSimpleName();
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.location.FusedLocationProviderClient.class).getSimpleName();
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.location.LocationServices.class).getSimpleName();
            return false;
        } catch (java.lang.NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(9:5|6|(1:(1:9)(2:29|30))(2:31|(1:33)(1:34))|10|11|(2:15|(1:17))|19|20|21))|10|11|(3:13|15|(0))|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r1 = com.inmobi.media.C2801ub.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "TAG");
        r6.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x0062, Exception -> 0x0064, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:11:0x0045, B:13:0x004d, B:15:0x0053, B:17:0x005c), top: B:10:0x0045, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2774tb c2774tb;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.inmobi.media.C2801ub c2801ub;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2774tb) {
                c2774tb = (com.inmobi.media.C2774tb) continuationImpl;
                int i2 = c2774tb.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2774tb.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2774tb.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2774tb.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = g;
                        c2774tb.f5463a = mutex2;
                        c2774tb.d = 1;
                        if (mutex2.lock(null, c2774tb) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2774tb.f5463a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    c2801ub = f5486a;
                    if (d() && e()) {
                        c2801ub.b();
                        if (!f()) {
                            a(com.inmobi.media.Xi.f5051a);
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            c2801ub = f5486a;
            if (d()) {
                c2801ub.b();
                if (!f()) {
                }
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2774tb = new com.inmobi.media.C2774tb(this, continuationImpl);
        java.lang.Object obj2 = c2774tb.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2774tb.d;
        if (i != 0) {
        }
    }

    public final void b() {
        android.location.LocationManager locationManager = b;
        if (locationManager != null) {
            android.location.Criteria criteria = new android.location.Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            java.lang.String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                java.lang.String TAG = e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(android.location.Location location) {
        android.location.LocationManager locationManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        try {
            java.lang.String TAG = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(java.lang.String provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(java.lang.String provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
    }

    public static void a(android.content.Context context) {
        try {
            com.google.android.gms.common.api.GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                java.lang.String TAG = e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                kotlin.jvm.internal.Intrinsics.checkNotNull(context);
                com.google.android.gms.common.api.GoogleApiClient build = new com.google.android.gms.common.api.GoogleApiClient.Builder(context).addConnectionCallbacks(new com.inmobi.media.C2746sb()).addOnConnectionFailedListener(new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
                        com.inmobi.media.C2801ub.a(connectionResult);
                    }
                }).addApi(com.google.android.gms.location.LocationServices.API).build();
                d = build;
                if (build != null) {
                    build.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (java.lang.Exception e2) {
            java.lang.String TAG2 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            e2.getMessage();
        }
    }

    public static final void a(com.google.android.gms.common.ConnectionResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        f = false;
    }

    public static android.location.Location a() {
        android.location.Location location;
        android.location.Location location2;
        android.location.Location location3;
        try {
        } catch (java.lang.Exception e2) {
            e = e2;
            location = null;
        }
        if (e() && d()) {
            location2 = f ? c() : null;
            try {
                if (b != null && com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_COARSE_LOCATION")) {
                    location3 = a(2, 2);
                }
            } catch (java.lang.Exception e3) {
                location = location2;
                e = e3;
                java.lang.String TAG = e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                e.getMessage();
                location2 = location;
                location3 = null;
                if (location2 != null) {
                }
                return a(location2, location3);
            }
            location3 = null;
        } else {
            location2 = null;
            location3 = null;
        }
        if (location2 != null && location3 == null) {
            java.lang.String TAG2 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return null;
        }
        return a(location2, location3);
    }

    public static android.location.Location a(android.location.Location location, android.location.Location location2) {
        if (location == null) {
            java.lang.String TAG = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            java.lang.Long valueOf = location2 != null ? java.lang.Long.valueOf(location2.getTime()) : null;
            java.util.Objects.toString(location2);
            java.util.Objects.toString(valueOf);
            return location2;
        }
        if (location2 == null) {
            java.lang.String TAG2 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            location.getTime();
            java.util.Objects.toString(location);
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            java.lang.String TAG3 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            location.getTime();
            java.util.Objects.toString(location);
            return location;
        }
        if (z2) {
            java.lang.String TAG4 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            location2.getTime();
            java.util.Objects.toString(location2);
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (!z5 && (!z3 || (z4 && z6))) {
            java.lang.String TAG5 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            location2.getTime();
            java.util.Objects.toString(location2);
            return location2;
        }
        java.lang.String TAG6 = e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        location.getTime();
        java.util.Objects.toString(location);
        return location;
    }

    public static android.location.Location a(int i, int i2) {
        java.lang.String bestProvider;
        android.location.Location location;
        android.location.Criteria criteria = new android.location.Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        android.location.LocationManager locationManager = b;
        android.location.Location location2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                location = locationManager.getLastKnownLocation(bestProvider);
            } catch (java.lang.Exception unused) {
                location = null;
            }
            if (location != null || i == 1) {
                location2 = location;
            } else {
                android.location.LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(locationManager2);
                    java.util.List<java.lang.String> providers = locationManager2.getProviders(true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            java.lang.String str = providers.get(size);
                            try {
                                android.location.LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        location2 = locationManager3.getLastKnownLocation(str);
                                    } catch (java.lang.SecurityException unused2) {
                                    }
                                    if (location2 != null) {
                                        break;
                                    }
                                }
                            } catch (java.lang.Exception unused3) {
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                }
            }
        }
        java.lang.String TAG = e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return location2;
    }

    public static java.util.HashMap a(android.location.Location location, boolean z, android.location.Location location2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    hashMap.put("u-ll-ts", java.lang.Long.valueOf(location.getTime()));
                }
                hashMap.put("u-latlong-accu", a(location));
                hashMap.put("sdk-collected", java.lang.Integer.valueOf(z ? 1 : 0));
            }
            com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
            if (com.inmobi.media.Xi.b() == null || com.inmobi.media.AbstractC2676pj.a().getLocationEnabled()) {
                hashMap.put("loc-allowed", java.lang.Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                hashMap.put("u-latlong-accu-fine", a(location2));
                hashMap.put("u-ll-ts-fine", java.lang.Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (com.inmobi.media.Sf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    hashMap.put("loc-granularity", "coarse");
                }
            } else {
                hashMap.put("loc-granularity", "none");
                return hashMap;
            }
        }
        return hashMap;
    }

    public static java.lang.String a(android.location.Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }
}
