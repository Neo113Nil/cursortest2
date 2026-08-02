package Ve;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.SPaySdkApp;
import v5.C10234h;

/* renamed from: Ve.pc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4528pc extends Kp {

    /* renamed from: b, reason: collision with root package name */
    public final C4372k1 f31773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4528pc(C4372k1 helpersItemClickActionListener) {
        super(C4296hb.f31180a);
        Intrinsics.checkNotNullParameter(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f31773b = helpersItemClickActionListener;
    }

    @Override // Ve.Kp
    public final Integer a(Object obj) {
        Rc rc2 = (Rc) obj;
        Intrinsics.checkNotNullParameter(rc2, "<this>");
        return Integer.valueOf(rc2.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        Hf hf2 = (Hf) aVar;
        Rc item = (Rc) obj;
        Intrinsics.checkNotNullParameter(hf2, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            Sh a11 = ((Yj) sdkComponent).a();
            String str = item.f29846d;
            AppCompatImageView targetView = hf2.f29157b;
            Intrinsics.checkNotNullExpressionValue(targetView, "spaySrishAcivHelperIcon");
            C4590rh imageRequestBuilder = C4590rh.f31978b;
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
            C10234h.a aVar2 = new C10234h.a(a11.f29980a);
            aVar2.b(str);
            aVar2.h(targetView);
            imageRequestBuilder.invoke(aVar2);
            a11.f29981b.a(aVar2.a());
        }
        hf2.f29159d.setText(item.f29843a);
        hf2.f29158c.setText(item.f29844b);
        ConstraintLayout spaySrishClRoot = hf2.f29160e;
        Intrinsics.checkNotNullExpressionValue(spaySrishClRoot, "spaySrishClRoot");
        spaySrishClRoot.setOnClickListener(new Kb(new kotlin.jvm.internal.L(), this, item));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof Rc;
    }
}
