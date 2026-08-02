package I;

import N.y;
import androidx.concurrent.futures.b;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;

/* loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11261b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f11260a = i11;
        this.f11261b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11260a) {
            case 0:
                ((b.a) this.f11261b).c(null);
                break;
            case 1:
                y.a((y) this.f11261b);
                break;
            default:
                StickyBubbleView.shrinkAndHide$lambda$5((StickyBubbleView) this.f11261b);
                break;
        }
    }
}
