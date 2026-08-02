package QI;

import C.S;
import android.content.Context;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import d0.InterfaceC5999j;
import d0.J;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.metrics.d;
import ru.ozon.app.android.abtool.utils.ApplicationUtilsKt;
import ru.ozon.app.android.search.databinding.ActiveSearchbarBinding;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23126b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f23125a = i11;
        this.f23126b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23125a) {
            case 0:
                ActiveSearchBarViewHolder.setupSearch$lambda$11((ActiveSearchbarBinding) this.f23126b);
                break;
            case 1:
                S.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    InterfaceC5999j interfaceC5999j = (InterfaceC5999j) this.f23126b;
                    if (interfaceC5999j instanceof J) {
                        ((J) interfaceC5999j).B();
                        break;
                    }
                }
                break;
            case 2:
                ApplicationUtilsKt.restartApp$lambda$0((Context) this.f23126b);
                break;
            case 3:
                r0.s(((SystemEventsBreadcrumbsIntegration) this.f23126b).f66992c);
                break;
            case 4:
                r0.f68093d.c(((d) this.f23126b).f68090a.getShutdownTimeoutMillis());
                break;
            default:
                ExpandableTextAtomView.changeSelectableState$lambda$6((ExpandableTextAtomView) this.f23126b);
                break;
        }
    }
}
