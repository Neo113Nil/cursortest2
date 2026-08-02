package P2;

import F2.C0254t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdpy;
import java.util.concurrent.ScheduledExecutorService;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5538a;

    /* renamed from: b, reason: collision with root package name */
    public final A f5539b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5540c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f5541d;

    /* renamed from: e, reason: collision with root package name */
    public final PackageInfo f5542e;

    public o(Context context, long j, PackageInfo packageInfo, A a2, ScheduledExecutorService scheduledExecutorService) {
        this.f5538a = context;
        this.f5540c = j;
        this.f5542e = packageInfo;
        this.f5539b = a2;
        this.f5541d = scheduledExecutorService;
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7++) {
            charArray[i7] = (char) (charArray[i7] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i7 % 555));
        }
        return new String(charArray);
    }

    public static final void c(Bundle bundle, zzdpy zzdpyVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhD)).booleanValue()) {
            AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpyVar.zza());
        }
    }

    public static final void d(int i7, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i7 - 1);
    }

    public final boolean b() {
        return this.f5539b.b().size() >= ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzhC)).intValue();
    }
}
