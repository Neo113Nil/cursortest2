package N;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.ReturnTextAreaButtonViewHolder;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes8.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18259b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f18258a = i11;
        this.f18259b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FintechWebView fintechWebView;
        switch (this.f18258a) {
            case 0:
                y yVar = (y) this.f18259b;
                yVar.getClass();
                H.c.e().execute(new I.f(yVar, 1));
                break;
            case 1:
                androidx.appcompat.app.j.c((Context) this.f18259b);
                break;
            case 2:
                ReturnTextAreaButtonViewHolder.callback$lambda$0((ReturnTextAreaButtonViewHolder) this.f18259b);
                break;
            case 3:
                ((Function0) this.f18259b).invoke();
                break;
            default:
                WeakReference weakReference = (WeakReference) this.f18259b;
                if (weakReference != null && (fintechWebView = (FintechWebView) weakReference.get()) != null) {
                    fintechWebView.clearCache(true);
                    break;
                }
                break;
        }
    }
}
