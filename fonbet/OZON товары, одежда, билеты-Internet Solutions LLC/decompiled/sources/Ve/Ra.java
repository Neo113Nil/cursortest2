package Ve;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.SPaySdkApp;
import v5.C10234h;

/* loaded from: classes10.dex */
public final class Ra extends Kp {

    /* renamed from: b, reason: collision with root package name */
    public final X2 f29841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(X2 helpersItemClickActionListener) {
        super(L9.f29395a);
        Intrinsics.checkNotNullParameter(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f29841b = helpersItemClickActionListener;
    }

    @Override // Ve.Kp
    public final Integer a(Object obj) {
        C4399l c4399l = (C4399l) obj;
        Intrinsics.checkNotNullParameter(c4399l, "<this>");
        return Integer.valueOf(c4399l.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        C4097ae c4097ae = (C4097ae) aVar;
        C4399l item = (C4399l) obj;
        Intrinsics.checkNotNullParameter(c4097ae, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            Sh a11 = ((Yj) sdkComponent).a();
            String str = item.f31481d;
            AppCompatImageView targetView = c4097ae.f30665b;
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
        c4097ae.f30667d.setText(item.f31478a);
        c4097ae.f30666c.setText(item.f31479b);
        ConstraintLayout spaySrihClRoot = c4097ae.f30668e;
        Intrinsics.checkNotNullExpressionValue(spaySrihClRoot, "spaySrihClRoot");
        spaySrihClRoot.setOnClickListener(new ViewOnClickListenerC4526pa(new kotlin.jvm.internal.L(), this, item));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof C4399l;
    }
}
