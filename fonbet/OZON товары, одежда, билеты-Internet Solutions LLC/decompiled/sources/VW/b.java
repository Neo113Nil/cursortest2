package VW;

import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;
import ru.ozon.uni.atoms.data.text.TextDTO;
import w3.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28466d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i11) {
        this.f28463a = i11;
        this.f28464b = obj;
        this.f28465c = obj2;
        this.f28466d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28463a) {
            case 0:
                StickyBubbleViewHolder.expandBubble$lambda$12((StickyBubbleView) this.f28464b, (TextDTO) this.f28465c, (StickyBubbleViewHolder) this.f28466d);
                break;
            default:
                i.a aVar = (i.a) this.f28464b;
                int i11 = aVar.f103476a;
                ((i) this.f28465c).q(i11, aVar.f103477b, (Exception) this.f28466d);
                break;
        }
    }
}
