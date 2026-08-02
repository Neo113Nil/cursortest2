package H30;

import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$setUpKeyboardAnimationCallback$1;
import ru.ozon.app.android.storage.adult.AdultStateImpl;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10563b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f10562a = i11;
        this.f10563b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10562a) {
            case 0:
                ((Function0) this.f10563b).invoke();
                break;
            case 1:
                N.l.e((N.l) this.f10563b);
                break;
            case 2:
                AdultStateImpl.save$lambda$0((AdultStateImpl) this.f10563b);
                break;
            case 3:
                SearchBarViewDelegate$setUpKeyboardAnimationCallback$1.onEnd$lambda$0((SearchBarViewDelegate) this.f10563b);
                break;
            default:
                ((BaseDotsIndicator) this.f10563b).refreshDots();
                break;
        }
    }
}
