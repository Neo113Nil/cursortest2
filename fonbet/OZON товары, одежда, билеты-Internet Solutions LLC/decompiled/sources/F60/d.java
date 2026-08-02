package F60;

import I0.C3173b;
import Sc.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10737n;

/* loaded from: classes3.dex */
final class d implements Function1<Boolean, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9101a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9102b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FintechWebView f9103c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10737n f9104d;

    d(String str, String str2, FintechWebView fintechWebView, C10737n c10737n) {
        this.f9101a = str;
        this.f9102b = str2;
        this.f9103c = fintechWebView;
        this.f9104d = c10737n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C10737n c10737n = this.f9104d;
        if (booleanValue) {
            String str = this.f9102b;
            if (str == null) {
                str = "";
            }
            String c11 = C3173b.c(new StringBuilder(), this.f9101a, "(", str, ")");
            FintechWebView fintechWebView = this.f9103c;
            if (fintechWebView != null) {
                fintechWebView.evaluateJavascript(c11, new c(c10737n));
            } else {
                r.Companion companion = r.INSTANCE;
                c10737n.resumeWith(Boolean.FALSE);
            }
        } else {
            r.Companion companion2 = r.INSTANCE;
            c10737n.resumeWith(Boolean.FALSE);
        }
        return Unit.f71690a;
    }
}
