package io.appmetrica.analytics.gpllibrary.internal;

import P0.j;
import Q0.b;
import Q0.e;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import f1.AbstractC0298b;
import f1.C0297a;
import i1.C0337g;
import i1.C0341k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final C0297a f5527a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f5528b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f5529c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f5530d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5531e;
    private final long f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5532a;

        static {
            int[] iArr = new int[Priority.values().length];
            f5532a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5532a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5532a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f5533a;

        public ClientProvider(Context context) {
            this.f5533a = context;
        }

        public final C0297a a() {
            return new C0297a(this.f5533a, AbstractC0298b.f4880a, b.f1157a, new e(new j(16), Looper.getMainLooper()));
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j3) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j3);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void startLocationUpdates(Priority priority) throws Throwable {
        C0297a c0297a = this.f5527a;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f2871i = true;
        long j3 = this.f;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        }
        locationRequest.f2865b = j3;
        if (!locationRequest.f2867d) {
            locationRequest.f2866c = (long) (j3 / 6.0d);
        }
        int i3 = AnonymousClass1.f5532a[priority.ordinal()];
        int i4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? 105 : 100 : 102 : 104;
        if (i4 == 100 || i4 == 102 || i4 == 104 || i4 == 105) {
            locationRequest.f2864a = i4;
            c0297a.requestLocationUpdates(locationRequest, this.f5529c, this.f5530d);
        } else {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("invalid quality: ");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f5527a.removeLocationUpdates(this.f5529c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void updateLastKnownLocation() throws Throwable {
        Task lastLocation = this.f5527a.getLastLocation();
        Executor executor = this.f5531e;
        GplOnSuccessListener gplOnSuccessListener = new GplOnSuccessListener(this.f5528b);
        C0341k c0341k = (C0341k) lastLocation;
        c0341k.getClass();
        c0341k.f5023b.d(new C0337g(executor, gplOnSuccessListener));
        c0341k.g();
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j3) {
        this.f5527a = clientProvider.a();
        this.f5528b = locationListener;
        this.f5530d = looper;
        this.f5531e = executor;
        this.f = j3;
        this.f5529c = new GplLocationCallback(locationListener);
    }
}
