package Ve;

import Ae.InterfaceC2397i;
import Bl0.C2660v;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class W2 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30240b;

    public /* synthetic */ W2(Object obj, int i11) {
        this.f30239a = i11;
        this.f30240b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4604s2 c4604s2;
        int i11;
        switch (this.f30239a) {
            case 0:
                if (dVar instanceof C4604s2) {
                    c4604s2 = (C4604s2) dVar;
                    int i12 = c4604s2.f32001e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4604s2.f32001e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4604s2.f32000d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4604s2.f32001e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            if (((Fh) obj).f29004a instanceof Bq) {
                                c4604s2.f32001e = 1;
                                if (((InterfaceC2397i) this.f30240b).emit(obj, c4604s2) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c4604s2 = new C4604s2(this, dVar);
                Object obj22 = c4604s2.f32000d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4604s2.f32001e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            case 1:
                String str = (String) obj;
                X4.a aVar3 = ((Kd) this.f30240b).f28693b;
                if (aVar3 == null) {
                    throw M7.f29463a;
                }
                ((Oq) aVar3).f29649c.setText(str);
                return Unit.f71690a;
            case 2:
                String str2 = (String) obj;
                C4592rj c4592rj = (C4592rj) this.f30240b;
                String c11 = G.g.c(str2, "&returnDomain=", Wk.f30290b == 1 ? "platiecom.ru" : "ift.platiecom.ru");
                C2660v block = new C2660v(c11, 1);
                Intrinsics.checkNotNullParameter(block, "block");
                X4.a aVar4 = c4592rj.f28693b;
                if (aVar4 == null) {
                    throw M7.f29463a;
                }
                P7 p72 = (P7) aVar4;
                WebView webView = p72.f29680c;
                webView.setVisibility(4);
                ProgressBar spayTdsBindingLoading = p72.f29679b;
                Intrinsics.checkNotNullExpressionValue(spayTdsBindingLoading, "spayTdsBindingLoading");
                spayTdsBindingLoading.setVisibility(0);
                webView.setWebViewClient(new Oi(c4592rj, c4592rj.requireContext()));
                webView.loadUrl(c11);
                return Unit.f71690a;
            default:
                String str3 = (String) obj;
                X4.a aVar5 = ((C4625sn) this.f30240b).f28693b;
                if (aVar5 == null) {
                    throw M7.f29463a;
                }
                ((E5) aVar5).f28906b.setText(str3);
                return Unit.f71690a;
        }
    }
}
