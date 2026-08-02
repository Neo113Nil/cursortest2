package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: cd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094cd implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1219a;

    /* JADX INFO: renamed from: b */
    public final C0742tu f1220b;

    public /* synthetic */ C0094cd(C0742tu c0742tu, int i) {
        this.f1219a = i;
        this.f1220b = c0742tu;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        switch (this.f1219a) {
            case 0:
                C0742tu c0742tu = this.f1220b;
                return c0742tu.m4848a(new qd0((ByteBuffer) obj, c0742tu.f7599d, c0742tu.f7598c, 22), i, i2, uu0Var, C0742tu.f7594j);
            default:
                C0742tu c0742tu2 = this.f1220b;
                return c0742tu2.m4848a(new qd0((ParcelFileDescriptor) obj, c0742tu2.f7599d, c0742tu2.f7598c), i, i2, uu0Var, C0742tu.f7594j);
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) {
        switch (this.f1219a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
