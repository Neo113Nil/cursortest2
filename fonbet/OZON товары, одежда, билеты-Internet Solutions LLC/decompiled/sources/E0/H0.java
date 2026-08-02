package E0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC8823a;
import p0.C8824b;

/* loaded from: classes8.dex */
final class H0 extends AbstractC7737t implements Function2<androidx.compose.ui.platform.G0, androidx.compose.ui.platform.H0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H0(F0 f02) {
        super(2);
        this.f7035b = f02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(androidx.compose.ui.platform.G0 g02, androidx.compose.ui.platform.H0 h02) {
        String str;
        androidx.compose.ui.platform.G0 g03 = g02;
        F0 f02 = this.f7035b;
        F0.N1(f02);
        f02.e2().A();
        int itemCount = g03.a().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount; i11++) {
            z11 = z11 || g03.a().getItemAt(i11).getText() != null;
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            int itemCount2 = g03.a().getItemCount();
            boolean z12 = false;
            for (int i12 = 0; i12 < itemCount2; i12++) {
                CharSequence text = g03.a().getItemAt(i12).getText();
                if (text != null) {
                    if (z12) {
                        sb2.append("\n");
                    }
                    sb2.append(text);
                    z12 = true;
                }
            }
            str = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        } else {
            str = null;
        }
        AbstractC8823a a11 = C8824b.a(f02);
        if (a11 != null) {
            a11.a();
            throw null;
        }
        if (str != null) {
            c1.q(f02.f2(), str, null, 6);
        }
        return Boolean.TRUE;
    }
}
