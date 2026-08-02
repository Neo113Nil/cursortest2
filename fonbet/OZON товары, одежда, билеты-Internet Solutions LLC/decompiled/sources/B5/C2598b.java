package B5;

import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import s6.InterfaceC9602b;

/* renamed from: B5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C2598b implements OnErrorPlayerControllerListener, InterfaceC9602b, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2725a;

    public /* synthetic */ C2598b(Object obj) {
        this.f2725a = obj;
    }

    @Override // s6.InterfaceC9602b
    public void a(Number number, Number number2) {
        OpenRangeFilterView.setUpSeekbar$lambda$6$lambda$5((OpenRangeFilterView) this.f2725a, number, number2);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o(((io.sentry.android.replay.capture.q) this.f2725a).g());
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$3((MediaCentricVideoViewHolder) this.f2725a, str, exc, bool);
    }
}
