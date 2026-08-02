package Dp;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;

/* renamed from: Dp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2877a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6767b;

    public /* synthetic */ C2877a(Function1 function1, int i11) {
        this.f6766a = i11;
        this.f6767b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6766a) {
            case 0:
                this.f6767b.invoke(obj);
                break;
            case 1:
                this.f6767b.invoke(obj);
                break;
            case 2:
            case 3:
            default:
                this.f6767b.invoke(obj);
                break;
            case 4:
                this.f6767b.invoke(obj);
                break;
            case 5:
                this.f6767b.invoke(obj);
                break;
            case 6:
                this.f6767b.invoke(obj);
                break;
            case 7:
                this.f6767b.invoke(obj);
                break;
            case 8:
                this.f6767b.invoke(obj);
                break;
            case 9:
                this.f6767b.invoke(obj);
                break;
            case 10:
                this.f6767b.invoke(obj);
                break;
            case 11:
                this.f6767b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Boolean loadResources$lambda$3;
        Boolean onComposerInitialized$lambda$1;
        switch (this.f6766a) {
            case 2:
                loadResources$lambda$3 = LocalStateActualizer.loadResources$lambda$3(this.f6767b, obj);
                return loadResources$lambda$3;
            default:
                onComposerInitialized$lambda$1 = NotificationsSettingsConfigurator.onComposerInitialized$lambda$1(this.f6767b, obj);
                return onComposerInitialized$lambda$1;
        }
    }
}
