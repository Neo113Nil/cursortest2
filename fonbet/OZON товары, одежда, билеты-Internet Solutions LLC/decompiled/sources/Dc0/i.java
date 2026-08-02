package Dc0;

import C.f0;
import C2.h0;
import androidx.appcompat.widget.AppCompatTextView;
import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6482c;

    public /* synthetic */ i(int i11, Object obj, Object obj2) {
        this.f6480a = i11;
        this.f6481b = obj;
        this.f6482c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6480a) {
            case 0:
                Jb0.g gVar = (Jb0.g) this.f6482c;
                int c11 = C6915b.c(gVar.f14431p.getMeasuredWidth() * 0.9f);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f6481b;
                appCompatTextView.setMaxWidth(c11);
                appCompatTextView.setTranslationY(gVar.f14423h.getHeight() * 2.0f);
                break;
            case 1:
                M2.a this$0 = (M2.a) this.f6481b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0 response = (h0) this.f6482c;
                Intrinsics.checkNotNullParameter(response, "$response");
                this$0.m().onResult(response);
                break;
            case 2:
                O.k.g((O.k) this.f6481b, (f0) this.f6482c);
                break;
            default:
                CartButtonV5WidgetViewHolder.postRunnableBind$lambda$2$lambda$1$lambda$0((CartButtonV5WidgetViewHolder) this.f6481b, (CartButtonV5VO) this.f6482c);
                break;
        }
    }
}
