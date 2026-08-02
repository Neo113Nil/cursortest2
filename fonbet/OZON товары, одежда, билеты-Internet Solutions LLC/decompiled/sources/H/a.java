package H;

import W.K;
import android.os.Process;
import androidx.camera.core.impl.W;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.noui.CommentsScrollViewHolder;
import vZ.C10287b;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10329b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f10328a = i11;
        this.f10329b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10328a) {
            case 0:
                Process.setThreadPriority(-16);
                ((Runnable) this.f10329b).run();
                break;
            case 1:
                CommentsScrollViewHolder.bind$lambda$0((CommentsScrollViewHolder) this.f10329b);
                break;
            case 2:
                ((W) this.f10329b).e();
                break;
            case 3:
                K.j((K) this.f10329b);
                break;
            case 4:
                ((Function0) this.f10329b).invoke();
                break;
            case 5:
                C10287b.a((C10287b) this.f10329b);
                break;
            default:
                WidgetImagePlaceholderViewHolderDelegateImpl.clickViewRunnable$lambda$0((WidgetImagePlaceholderViewHolderDelegateImpl) this.f10329b);
                break;
        }
    }
}
