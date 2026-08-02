package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class G extends AbstractC7737t implements Function1<D1.H, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final G f40644b = new G(1);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r3.e(I1.u.e()) != false) goto L10;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(D1.H h11) {
        boolean z11;
        I1.l B11 = h11.B();
        if (B11 != null) {
            z11 = true;
            if (B11.o()) {
                int i11 = I1.u.f11751H;
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
