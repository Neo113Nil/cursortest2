package Bl0;

import Ui.C4069c;
import com.detmir.recycli.adapters.RecyclerAdapter;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3972b;

    public /* synthetic */ g0(Object obj, int i11) {
        this.f3971a = i11;
        this.f3972b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3971a) {
            case 0:
                ((Function0) this.f3972b).invoke();
                break;
            case 1:
                ((C4069c) this.f3972b).a0().f12568d.scrollToPosition(0);
                break;
            case 2:
                ViewExtKt.gone((StickyBubbleView) this.f3972b);
                break;
            case 3:
                RecyclerAdapter.scrollChecker$lambda$0((RecyclerAdapter) this.f3972b);
                break;
            default:
                ru.ozon.android.messenger.framework.presentation.chatdetail.k.a((ru.ozon.android.messenger.framework.presentation.chatdetail.k) this.f3972b);
                break;
        }
    }
}
