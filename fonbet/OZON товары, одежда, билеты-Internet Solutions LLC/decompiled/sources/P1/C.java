package P1;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(int i11, @NotNull Object obj, @NotNull InterfaceC3808o interfaceC3808o, @NotNull F f7, int i12) {
        boolean z11;
        boolean z12;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z13 = false;
        if ((i11 == 1 || i11 == 2) && !Intrinsics.d(interfaceC3808o.getWeight(), f7)) {
            int i13 = F.f21515m;
            if (f7.compareTo(C3799f.a()) >= 0 && interfaceC3808o.getWeight().compareTo(C3799f.a()) < 0) {
                z11 = true;
                z12 = (i11 == 1 || i11 == 3) && i12 != interfaceC3808o.b();
                if (z12 && !z11) {
                    return obj;
                }
                if (Build.VERSION.SDK_INT < 28) {
                    if (z12 && i12 == 1) {
                        z13 = true;
                    }
                    return Typeface.create((Typeface) obj, C3799f.b(z11, z13));
                }
                int l11 = z11 ? f7.l() : interfaceC3808o.getWeight().l();
                if (!z12 ? interfaceC3808o.b() == 1 : i12 == 1) {
                    z13 = true;
                }
                return V.f21527a.a((Typeface) obj, l11, z13);
            }
        }
        z11 = false;
        if (i11 == 1) {
            if (z12) {
            }
            if (Build.VERSION.SDK_INT < 28) {
            }
        }
        if (z12) {
        }
        if (Build.VERSION.SDK_INT < 28) {
        }
    }
}
