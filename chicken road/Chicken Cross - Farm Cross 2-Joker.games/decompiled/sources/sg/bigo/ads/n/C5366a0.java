package sg.bigo.ads.n;

import android.util.Pair;
import android.widget.TextView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.m.C5329h;

/* renamed from: sg.bigo.ads.n.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5366a0 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E1 f13158a;
    public final /* synthetic */ U0 b;

    public C5366a0(U0 u0, C5329h c5329h) {
        this.b = u0;
        this.f13158a = c5329h;
    }

    @Override // sg.bigo.ads.h.E1
    public final Pair a(TextView textView, String str, String str2) {
        if (textView.getTag() == 2 && sg.bigo.ads.K0.I.a((CharSequence) str2)) {
            str2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.b.d.e())).c();
        }
        E1 e1 = this.f13158a;
        return e1 != null ? e1.a(textView, str, str2) : Pair.create(str, str2);
    }
}
