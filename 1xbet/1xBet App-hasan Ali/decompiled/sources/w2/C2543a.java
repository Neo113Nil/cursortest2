package w2;

import L4.v;
import L4.z;
import a.AbstractC0444a;
import android.os.StatFs;
import java.io.File;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2543a {

    /* renamed from: a, reason: collision with root package name */
    public z f20490a;

    /* renamed from: b, reason: collision with root package name */
    public v f20491b;

    /* renamed from: c, reason: collision with root package name */
    public double f20492c;

    /* renamed from: d, reason: collision with root package name */
    public long f20493d;

    /* renamed from: e, reason: collision with root package name */
    public long f20494e;
    public w4.d f;

    public final C2551i a() {
        long j5;
        z zVar = this.f20490a;
        if (zVar == null) {
            throw new IllegalStateException("directory == null");
        }
        double d5 = this.f20492c;
        if (d5 > 0.0d) {
            try {
                File e3 = zVar.e();
                e3.mkdir();
                StatFs statFs = new StatFs(e3.getAbsolutePath());
                j5 = AbstractC0444a.u((long) (d5 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f20493d, this.f20494e);
            } catch (Exception unused) {
                j5 = this.f20493d;
            }
        } else {
            j5 = 0;
        }
        return new C2551i(j5, this.f20491b, zVar, this.f);
    }
}
