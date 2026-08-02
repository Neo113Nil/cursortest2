package Ve;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Op extends Kp {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Op(boolean z11, E1 cardPositionListener) {
        super(C4338ip.f31323a);
        Intrinsics.checkNotNullParameter(cardPositionListener, "cardPositionListener");
        this.f29646b = z11;
    }

    @Override // Ve.Kp
    public final Integer a(Object obj) {
        Ak ak = (Ak) obj;
        Intrinsics.checkNotNullParameter(ak, "<this>");
        return Integer.valueOf(ak.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        String string;
        Sc sc2 = (Sc) aVar;
        Ak item = (Ak) obj;
        Intrinsics.checkNotNullParameter(sc2, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = sc2.f29963b.getContext();
        int color = androidx.core.content.a.getColor(context, R.color.spay_listcards_inactive_text_color);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.spay_shake);
        CardView spayRicsCvCardItem = sc2.f29965d;
        Intrinsics.checkNotNullExpressionValue(spayRicsCvCardItem, "spayRicsCvCardItem");
        Intrinsics.checkNotNullParameter(spayRicsCvCardItem, "<this>");
        spayRicsCvCardItem.setCardBackgroundColor(androidx.core.content.res.g.b(spayRicsCvCardItem.getResources(), item.f28618k, null));
        AppCompatImageView spayRicsIvStatus = sc2.f29966e;
        Intrinsics.checkNotNullExpressionValue(spayRicsIvStatus, "spayRicsIvStatus");
        Intrinsics.checkNotNullParameter(spayRicsIvStatus, "<this>");
        spayRicsIvStatus.setImageResource(item.f28619l);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String f7 = E.f(item.f28624q, context);
        SPayTextView sPayTextView = sc2.f29968g;
        sPayTextView.setText(f7);
        sPayTextView.setTextColor(color);
        String str = item.f28625r;
        boolean z11 = item.f28627t;
        String str2 = item.f28622o;
        int i11 = item.f28620m;
        Integer num = item.f28621n;
        if (num != null) {
            int intValue = num.intValue();
            Resources resources = context.getResources();
            Integer num2 = item.f28623p;
            String quantityString = resources.getQuantityString(intValue, AbstractC4656tp.a(num2), Integer.valueOf(AbstractC4656tp.a(num2)));
            string = z11 ? context.getString(i11, str2, quantityString) : context.getString(i11, str, str2, quantityString);
        } else {
            string = z11 ? context.getString(i11, str2) : context.getString(i11, str, str2);
        }
        SPayTextView sPayTextView2 = sc2.f29967f;
        sPayTextView2.setText(string);
        sPayTextView2.setTextColor(color);
        CardLogoCompositeView cardLogoCompositeView = sc2.f29963b;
        cardLogoCompositeView.a(item.f28626s);
        cardLogoCompositeView.setAlpha(0.3f);
        sc2.f29969h.a(AbstractC4656tp.a(item.f28628u), this.f29646b);
        ConstraintLayout constraintLayout = sc2.f29964c;
        constraintLayout.setOnClickListener(new LB.a(2, constraintLayout, loadAnimation));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof Ak;
    }
}
