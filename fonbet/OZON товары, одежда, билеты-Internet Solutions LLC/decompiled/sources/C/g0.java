package C;

import C.s0;
import android.view.Window;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageListViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;

/* loaded from: classes8.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4191c;

    public /* synthetic */ g0(int i11, Object obj, Object obj2) {
        this.f4189a = i11;
        this.f4190b = obj;
        this.f4191c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4189a) {
            case 0:
                ((s0.e) this.f4190b).c((s0.d) this.f4191c);
                break;
            case 1:
                AddressEditMapViewWrapper.bottomSheetComposerLayoutChangeListener$lambda$6$lambda$5$lambda$4((AddressEditMapViewWrapper) this.f4190b, (FrameLayout) this.f4191c);
                break;
            case 2:
                C2.r callback = (C2.r) this.f4190b;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Object exception = this.f4191c;
                Intrinsics.checkNotNullParameter(exception, "$exception");
                callback.a(exception);
                break;
            case 3:
                J2.a this$0 = (J2.a) this.f4190b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                D2.o e11 = (D2.o) this.f4191c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.l().a(e11);
                break;
            case 4:
                L30.i.b((Window) this.f4190b, (L30.i) this.f4191c);
                break;
            default:
                AspectsV4ImageListViewHolder.bind$lambda$0((AspectsV4ImageListViewHolder) this.f4190b, (AspectsV4ImageVO) this.f4191c);
                break;
        }
    }
}
