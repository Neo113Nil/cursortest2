package F90;

import Me.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9158b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f9157a = i11;
        this.f9158b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit attachWebViewClient$lambda$21$lambda$13;
        switch (this.f9157a) {
            case 0:
                return e.g0((e) this.f9158b);
            case 1:
                attachWebViewClient$lambda$21$lambda$13 = FintechWebView.attachWebViewClient$lambda$21$lambda$13((FintechWebView) this.f9158b, (String) obj);
                return attachWebViewClient$lambda$21$lambda$13;
            default:
                return h.h((h) this.f9158b, ((Integer) obj).intValue());
        }
    }
}
