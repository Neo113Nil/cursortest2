package YJ;

import Z.w;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.sentry.ShutdownHookIntegration;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder;
import u3.t;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34871b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f34870a = i11;
        this.f34871b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34870a) {
            case 0:
                ((CollapsingToolbarLayout) this.f34871b).requestLayout();
                break;
            case 1:
                ((w) this.f34871b).h();
                break;
            case 2:
                RecyclerAdapter.tryInfinity$lambda$11((RecyclerAdapter) this.f34871b);
                break;
            case 3:
                WholesaleInputButtonWidgetViewHolder.scrollRunnable$lambda$0((WholesaleInputButtonWidgetViewHolder) this.f34871b);
                break;
            case 4:
                r0.f66741a.removeShutdownHook(((ShutdownHookIntegration) this.f34871b).f66742b);
                break;
            default:
                t.h0((t) this.f34871b);
                break;
        }
    }
}
