package E;

import C.I;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInput;

/* loaded from: classes8.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6886c;

    public /* synthetic */ c0(int i11, Object obj, Object obj2) {
        this.f6884a = i11;
        this.f6885b = obj;
        this.f6886c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6884a) {
            case 0:
                I.f g10 = ((d0) this.f6885b).g();
                Objects.requireNonNull(g10);
                I.h hVar = (I.h) this.f6886c;
                Objects.requireNonNull(hVar);
                g10.onImageSaved(hVar);
                break;
            case 1:
                SelectionFormInput.clearError$lambda$0((SelectionFormInput) this.f6885b, (String) this.f6886c);
                break;
            default:
                PromoStickyBubbleView.fadeOut$lambda$12$lambda$11((PromoStickyBubbleView) this.f6885b, (Function0) this.f6886c);
                break;
        }
    }
}
