package BU;

import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.OffsetHelper;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.OffsetHelper$show$1;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3298c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f3296a = i11;
        this.f3297b = obj;
        this.f3298c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3296a) {
            case 0:
                DebouncedTextWatcher.onTextChanged$lambda$0((DebouncedTextWatcher) this.f3297b, (CharSequence) this.f3298c);
                break;
            case 1:
                HeaderAtom.onConfigureView$lambda$7((HeaderAtom) this.f3297b, (HeaderAtom.Configuration) this.f3298c);
                break;
            default:
                OffsetHelper$show$1.onScrolled$lambda$1$lambda$0((OffsetHelper) this.f3297b, (CurtainCustomVO) this.f3298c);
                break;
        }
    }
}
