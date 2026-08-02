package Hl;

import kotlin.jvm.functions.Function1;
import qc.g;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;

/* renamed from: Hl.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3166b implements OnErrorPlayerControllerListener, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11209a;

    public /* synthetic */ C3166b(Object obj) {
        this.f11209a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f11209a).invoke(obj);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        AdvVideoBannerV2PlayerBinder.playerListener$lambda$5$lambda$2((AdvVideoBannerV2PlayerBinder) this.f11209a, str, exc, bool);
    }
}
