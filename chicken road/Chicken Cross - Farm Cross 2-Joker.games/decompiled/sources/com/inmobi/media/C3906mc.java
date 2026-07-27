package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.UnityAdsConstants;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3906mc implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public static final C3906mc f7246a = new C3906mc();
    public static final LocationManager b;
    public static final HandlerThread c;
    public static GoogleApiClient d;
    public static final String e;
    public static boolean f;
    public static final Mutex g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        e = "mc";
        g = MutexKt.Mutex$default(false, 1, null);
        AbstractC3787i7.a(handlerThread, "LThread");
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = AbstractC3914mk.f7252a;
            Intrinsics.checkNotNull(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            return lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e2) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "Handling getLocationFromGoogleApiClient encountered an unexpected error. " + e2;
            return null;
        }
    }

    public static boolean d() {
        try {
            if (Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i;
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i = 0;
        }
        return i != 0;
    }

    public static boolean f() {
        try {
            Reflection.getOrCreateKotlinClass(GoogleApiClient.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(FusedLocationProviderClient.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(9:5|6|(1:(1:9)(2:29|30))(2:31|(1:33)(1:34))|10|11|(2:15|(1:17))|19|20|21))|10|11|(3:13|15|(0))|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r2 = com.inmobi.media.C3906mc.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        r0 = "SDK encountered unexpected error in initializing location collection; " + r7.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0064, Exception -> 0x0066, TRY_LEAVE, TryCatch #1 {Exception -> 0x0066, blocks: (B:11:0x0047, B:13:0x004f, B:15:0x0055, B:17:0x005e), top: B:10:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3876lc c3876lc;
        int i;
        Mutex mutex;
        C3906mc c3906mc;
        try {
            if (continuationImpl instanceof C3876lc) {
                c3876lc = (C3876lc) continuationImpl;
                int i2 = c3876lc.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3876lc.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3876lc.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3876lc.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = g;
                        c3876lc.f7223a = mutex2;
                        c3876lc.d = 1;
                        if (mutex2.lock(null, c3876lc) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c3876lc.f7223a;
                        ResultKt.throwOnFailure(obj);
                    }
                    c3906mc = f7246a;
                    if (d() && e()) {
                        c3906mc.b();
                        if (!f()) {
                            a(AbstractC3914mk.f7252a);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c3906mc = f7246a;
            if (d()) {
                c3906mc.b();
                if (!f()) {
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c3876lc = new C3876lc(this, continuationImpl);
        Object obj2 = c3876lc.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3876lc.d;
        if (i != 0) {
        }
    }

    public final void b() {
        LocationManager locationManager = b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                Intrinsics.checkNotNullExpressionValue(e, "TAG");
                String str = "Trying to get location fix. Provider being used:" + bestProvider;
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
        Unit unit = Unit.INSTANCE;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "location changed. ts:" + location.getTime() + " lat:" + location.getLatitude() + ServerSentEventKt.COLON + location.getLongitude() + " accu:" + location.getAccuracy();
            if (!d() || (locationManager = b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            U9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNull(context);
                GoogleApiClient build = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3848kc()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: com.inmobi.media.mc$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C3906mc.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                d = build;
                if (build != null) {
                    build.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e2) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            String str = "Error in connecting to GooglePlayServices API : (" + e2.getMessage() + ")";
        }
    }

    public static final void a(ConnectionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f = false;
    }

    public static Location a() {
        Location location;
        Location location2;
        Location location3;
        try {
        } catch (Exception e2) {
            e = e2;
            location = null;
        }
        if (e() && d()) {
            location2 = f ? c() : null;
            try {
                if (b != null && Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_COARSE_LOCATION")) {
                    location3 = a(2, 2);
                }
            } catch (Exception e3) {
                location = location2;
                e = e3;
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                String str = "SDK encountered unexpected error in getting a location fix; " + e.getMessage();
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
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return null;
        }
        return a(location2, location3);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "Location info provided by Android Api client:" + location2 + " ts : " + (location2 != null ? Long.valueOf(location2.getTime()) : null);
            return location2;
        }
        if (location2 == null) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            String str2 = "Location info provided by Google Api client:" + location + " ts : " + location.getTime();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            String TAG3 = e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            String str3 = "Location info provided by Google Api client:" + location + " ts : " + location.getTime();
            return location;
        }
        if (z2) {
            String TAG4 = e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            String str4 = "Location info provided by Android Api client:" + location2 + " ts : " + location2.getTime();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (!z5 && (!z3 || (z4 && z6))) {
            String TAG5 = e;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            String str5 = "Location info provided by Android Api client:" + location2 + " ts : " + location2.getTime();
            return location2;
        }
        String TAG6 = e;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        String str6 = "Location info provided by Google Api client:" + location + " ts : " + location.getTime();
        return location;
    }

    public static Location a(int i, int i2) {
        String bestProvider;
        Location location;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = b;
        Location location2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                location = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                location = null;
            }
            if (location != null || i == 1) {
                location2 = location;
            } else {
                LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    Intrinsics.checkNotNull(locationManager2);
                    List<String> providers = locationManager2.getProviders(true);
                    Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        location2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (location2 != null) {
                                        break;
                                    }
                                }
                            } catch (Exception unused3) {
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
        String TAG = e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str2 = "Location info provided by Location manager:" + (location2 != null);
        return location2;
    }

    public static HashMap a(Location location, boolean z, Location location2) {
        HashMap hashMap = new HashMap();
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                hashMap.put("u-latlong-accu", a(location));
                hashMap.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
            }
            Oi oi = Kk.f6677a;
            Context context2 = AbstractC3914mk.f7252a;
            String str = null;
            if (context2 != null) {
                Intrinsics.checkNotNullParameter(context2, "context");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context2, "coppa_store");
                Intrinsics.checkNotNullParameter("im_accid", "key");
                str = a2.f6510a.getString("im_accid", null);
            }
            if (str == null || Kk.a().getLocationEnabled()) {
                hashMap.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                hashMap.put("u-latlong-accu-fine", a(location2));
                hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (Og.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    hashMap.put("loc-granularity", "coarse");
                }
            } else {
                hashMap.put("loc-granularity", "none");
                return hashMap;
            }
        }
        return hashMap;
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }
}
