package Ve;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.fo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4251fo extends Kp {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31056b;

    /* renamed from: c, reason: collision with root package name */
    public final Y0 f31057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4251fo(boolean z11, Y0 cardPositionListener) {
        super(Dn.f28880a);
        Intrinsics.checkNotNullParameter(cardPositionListener, "cardPositionListener");
        this.f31056b = z11;
        this.f31057c = cardPositionListener;
    }

    @Override // Ve.Kp
    public final Integer a(Object obj) {
        C4608s6 c4608s6 = (C4608s6) obj;
        Intrinsics.checkNotNullParameter(c4608s6, "<this>");
        return Integer.valueOf(c4608s6.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        String string;
        Sc sc2 = (Sc) aVar;
        C4608s6 item = (C4608s6) obj;
        Intrinsics.checkNotNullParameter(sc2, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = sc2.f29963b.getContext();
        CardView spayRicsCvCardItem = sc2.f29965d;
        Intrinsics.checkNotNullExpressionValue(spayRicsCvCardItem, "spayRicsCvCardItem");
        Intrinsics.checkNotNullParameter(spayRicsCvCardItem, "<this>");
        spayRicsCvCardItem.setCardBackgroundColor(androidx.core.content.res.g.b(spayRicsCvCardItem.getResources(), item.f32014k, null));
        AppCompatImageView spayRicsIvStatus = sc2.f29966e;
        Intrinsics.checkNotNullExpressionValue(spayRicsIvStatus, "spayRicsIvStatus");
        Intrinsics.checkNotNullParameter(spayRicsIvStatus, "<this>");
        spayRicsIvStatus.setImageResource(item.f32015l);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        sc2.f29968g.setText(E.f(item.f32020q, context));
        String str = item.f32021r;
        boolean z11 = item.f32023t;
        String str2 = item.f32018o;
        int i11 = item.f32016m;
        Integer num = item.f32017n;
        if (num != null) {
            int intValue = num.intValue();
            Resources resources = context.getResources();
            Integer num2 = item.f32019p;
            String quantityString = resources.getQuantityString(intValue, AbstractC4656tp.a(num2), Integer.valueOf(AbstractC4656tp.a(num2)));
            string = z11 ? context.getString(i11, str2, quantityString) : context.getString(i11, str, str2, quantityString);
        } else {
            string = z11 ? context.getString(i11, str2) : context.getString(i11, str, str2);
        }
        sc2.f29967f.setText(string);
        sc2.f29963b.a(item.f32022s);
        sc2.f29969h.a(AbstractC4656tp.a(item.f32024u), this.f31056b);
        ConstraintLayout constraintLayout = sc2.f29964c;
        constraintLayout.setClickable(true);
        constraintLayout.setFocusable(true);
        constraintLayout.setOnClickListener(new Eq.b(1, this, item));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof C4608s6;
    }
}
