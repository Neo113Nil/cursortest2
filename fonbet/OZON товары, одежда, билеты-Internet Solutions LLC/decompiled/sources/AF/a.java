package AF;

import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.cart.domain.delegate.UpdateCartOnStartDelegate;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements qc.g, q, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f608b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f607a = i11;
        this.f608b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f607a) {
            case 0:
                this.f608b.invoke(obj);
                break;
            case 1:
                this.f608b.invoke(obj);
                break;
            case 2:
            case 3:
            case 4:
            default:
                this.f608b.invoke(obj);
                break;
            case 5:
                this.f608b.invoke(obj);
                break;
            case 6:
                this.f608b.invoke(obj);
                break;
            case 7:
                this.f608b.invoke(obj);
                break;
            case 8:
                this.f608b.invoke(obj);
                break;
            case 9:
                this.f608b.invoke(obj);
                break;
            case 10:
                this.f608b.invoke(obj);
                break;
            case 11:
                this.f608b.invoke(obj);
                break;
            case 12:
                this.f608b.invoke(obj);
                break;
            case 13:
                this.f608b.invoke(obj);
                break;
            case 14:
                this.f608b.invoke(obj);
                break;
            case 15:
                this.f608b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        LocalStateActualizer.ActualizingResult loadResources$lambda$5;
        loadResources$lambda$5 = LocalStateActualizer.loadResources$lambda$5(this.f608b, obj);
        return loadResources$lambda$5;
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean updateCartDisposable$lambda$0;
        boolean onComposerInitialized$lambda$3;
        switch (this.f607a) {
            case 2:
                updateCartDisposable$lambda$0 = UpdateCartOnStartDelegate.updateCartDisposable$lambda$0(this.f608b, obj);
                return updateCartDisposable$lambda$0;
            default:
                onComposerInitialized$lambda$3 = NotificationsSettingsConfigurator.onComposerInitialized$lambda$3(this.f608b, obj);
                return onComposerInitialized$lambda$3;
        }
    }
}
