package Ve;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.SPaySdkApp;
import v5.C10234h;

/* renamed from: Ve.hd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4298hd extends Kp {

    /* renamed from: b, reason: collision with root package name */
    public final Ml0.e f31183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4298hd(Ml0.e helpersItemClickActionListener) {
        super(C4095ac.f30659a);
        Intrinsics.checkNotNullParameter(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f31183b = helpersItemClickActionListener;
    }

    @Override // Ve.Kp
    public final Integer a(Object obj) {
        C4728wb c4728wb = (C4728wb) obj;
        Intrinsics.checkNotNullParameter(c4728wb, "<this>");
        return Integer.valueOf(c4728wb.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        Lb lb2 = (Lb) aVar;
        C4728wb item = (C4728wb) obj;
        Intrinsics.checkNotNullParameter(lb2, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            Sh a11 = ((Yj) sdkComponent).a();
            String str = item.f32358d;
            AppCompatImageView targetView = lb2.f29400b;
            Intrinsics.checkNotNullExpressionValue(targetView, "spaySrihAcivHelperIcon");
            C4590rh imageRequestBuilder = C4590rh.f31978b;
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
            C10234h.a aVar2 = new C10234h.a(a11.f29980a);
            aVar2.b(str);
            aVar2.h(targetView);
            imageRequestBuilder.invoke(aVar2);
            a11.f29981b.a(aVar2.a());
        }
        lb2.f29402d.setText(item.f32355a);
        lb2.f29401c.setText(item.f32356b);
        ConstraintLayout spaySrihClRoot = lb2.f29403e;
        Intrinsics.checkNotNullExpressionValue(spaySrihClRoot, "spaySrihClRoot");
        spaySrihClRoot.setOnClickListener(new Dc(new kotlin.jvm.internal.L(), this, item));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof C4728wb;
    }
}
