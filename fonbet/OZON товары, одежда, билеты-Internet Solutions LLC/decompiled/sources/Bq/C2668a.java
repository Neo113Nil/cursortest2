package Bq;

import UZ.d;
import WZ.e;
import WZ.g;
import java.util.Map;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkHandler$handle$broadcastReceiver$1;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;

/* renamed from: Bq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2668a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4031b;

    public /* synthetic */ C2668a(Object obj, int i11) {
        this.f4030a = i11;
        this.f4031b = obj;
    }

    @Override // WZ.e
    public final g modifyParams(UZ.a aVar, g gVar) {
        g onReceive$lambda$0;
        g showCancelSheet$lambda$12$lambda$11;
        g trackDefaultStateClickEvent$lambda$11$lambda$10;
        switch (this.f4030a) {
            case 0:
                onReceive$lambda$0 = ShareLinkHandler$handle$broadcastReceiver$1.onReceive$lambda$0((String) this.f4031b, (d) aVar, gVar);
                return onReceive$lambda$0;
            case 1:
                showCancelSheet$lambda$12$lambda$11 = SelectionFormHeaderVH.showCancelSheet$lambda$12$lambda$11((Map) this.f4031b, (d) aVar, gVar);
                return showCancelSheet$lambda$12$lambda$11;
            default:
                trackDefaultStateClickEvent$lambda$11$lambda$10 = StickyBubbleViewHolder.trackDefaultStateClickEvent$lambda$11$lambda$10((StickyBubbleViewHolder) this.f4031b, (d) aVar, gVar);
                return trackDefaultStateClickEvent$lambda$11$lambda$10;
        }
    }
}
