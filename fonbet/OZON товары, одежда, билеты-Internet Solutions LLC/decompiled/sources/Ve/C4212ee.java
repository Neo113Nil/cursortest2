package Ve;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.ee, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4212ee extends Jg {

    /* renamed from: b, reason: collision with root package name */
    public final C4325ib f30925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4212ee(C4325ib viewBinding) {
        super(viewBinding);
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        this.f30925b = viewBinding;
    }

    @Override // Ve.Jg
    public final void e(Object obj) {
        Vc item = (Vc) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = item.f30192a;
        C4325ib c4325ib = this.f30925b;
        if (z11) {
            AppCompatImageView spaySribgsSection = c4325ib.f31280b;
            Intrinsics.checkNotNullExpressionValue(spaySribgsSection, "spaySribgsSection");
            int i11 = R.drawable.spay_ic_bnpl_payment_current_section;
            Intrinsics.checkNotNullParameter(spaySribgsSection, "<this>");
            spaySribgsSection.setImageDrawable(androidx.core.content.res.g.d(spaySribgsSection.getResources(), i11, null));
            return;
        }
        AppCompatImageView spaySribgsSection2 = c4325ib.f31280b;
        Intrinsics.checkNotNullExpressionValue(spaySribgsSection2, "spaySribgsSection");
        int i12 = R.drawable.spay_ic_bnpl_payment_section;
        Intrinsics.checkNotNullParameter(spaySribgsSection2, "<this>");
        spaySribgsSection2.setImageDrawable(androidx.core.content.res.g.d(spaySribgsSection2.getResources(), i12, null));
    }
}
