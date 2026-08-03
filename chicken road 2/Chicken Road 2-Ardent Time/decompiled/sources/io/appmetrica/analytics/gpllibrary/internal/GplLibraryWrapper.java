package io.appmetrica.analytics.gpllibrary.internal;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper {
    public static final java.lang.String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.location.FusedLocationProviderClient f3847a;

    /* renamed from: b, reason: collision with root package name */
    private final android.location.LocationListener f3848b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.location.LocationCallback f3849c;

    /* renamed from: d, reason: collision with root package name */
    private final android.os.Looper f3850d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f3851e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3852f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3853a;

        static {
            int[] iArr = new int[io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority.values().length];
            f3853a = iArr;
            try {
                iArr[io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3853a[io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3853a[io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final android.content.Context f3854a;

        public ClientProvider(android.content.Context context) {
            this.f3854a = context;
        }

        public final com.google.android.gms.location.FusedLocationProviderClient a() {
            return com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(this.f3854a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(android.content.Context context, android.location.LocationListener locationListener, android.os.Looper looper, java.util.concurrent.Executor executor, long j2) {
        this(new io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.ClientProvider(context), locationListener, looper, executor, j2);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @android.annotation.SuppressLint({"MissingPermission"})
    public void startLocationUpdates(io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority priority) {
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = this.f3847a;
        com.google.android.gms.location.LocationRequest interval = com.google.android.gms.location.LocationRequest.create().setInterval(this.f3852f);
        int i2 = io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.AnonymousClass1.f3853a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i2 != 1 ? i2 != 2 ? i2 != 3 ? 105 : 100 : 102 : 104), this.f3849c, this.f3850d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        this.f3847a.removeLocationUpdates(this.f3849c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @android.annotation.SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() {
        this.f3847a.getLastLocation().a(this.f3851e, new io.appmetrica.analytics.gpllibrary.internal.GplOnSuccessListener(this.f3848b));
    }

    public GplLibraryWrapper(io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.ClientProvider clientProvider, android.location.LocationListener locationListener, android.os.Looper looper, java.util.concurrent.Executor executor, long j2) {
        this.f3847a = clientProvider.a();
        this.f3848b = locationListener;
        this.f3850d = looper;
        this.f3851e = executor;
        this.f3852f = j2;
        this.f3849c = new io.appmetrica.analytics.gpllibrary.internal.GplLocationCallback(locationListener);
    }
}
