package sg.bigo.ads.m;

import android.util.Pair;
import android.widget.TextView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.E1;

/* renamed from: sg.bigo.ads.m.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5329h implements E1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E1 f13082a = null;
    public final /* synthetic */ e0 b;

    public C5329h(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // sg.bigo.ads.h.E1
    public final Pair a(TextView textView, String str, String str2) {
        if (textView.getTag() == 2 && sg.bigo.ads.K0.I.a((CharSequence) str2)) {
            str2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.b.d.e())).c();
        }
        E1 e1 = this.f13082a;
        return e1 != null ? e1.a(textView, str, str2) : Pair.create(str, str2);
    }
}
