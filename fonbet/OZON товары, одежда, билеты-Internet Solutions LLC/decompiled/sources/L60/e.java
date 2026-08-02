package L60;

import fd.InterfaceC6511n;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FintechWebView f16584a;

    public /* synthetic */ e(FintechWebView fintechWebView) {
        this.f16584a = fintechWebView;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        return FintechWebView.attachWebViewClient$lambda$21$lambda$15(this.f16584a, (String) obj, booleanValue, booleanValue2);
    }
}
