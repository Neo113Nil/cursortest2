package sg.bigo.ads.d1;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.d1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5066b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12727a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ C5067c g;

    public ViewOnClickListenerC5066b(C5067c c5067c, String str, String str2, String str3, String str4, String str5, String str6) {
        this.g = c5067c;
        this.f12727a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        sg.bigo.ads.N.a aVar = this.g.f12728a;
        String str2 = this.f12727a;
        String str3 = this.b;
        String str4 = this.c;
        String str5 = this.d;
        String str6 = this.e;
        String str7 = this.f;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
            return;
        }
        C5070f c5070f = new C5070f(aVar);
        c5070f.f12729a = str2;
        c5070f.b = str3;
        c5070f.c = str4;
        c5070f.d = str5;
        c5070f.e = str6;
        c5070f.f = str7;
        n nVar = new n(c5070f);
        Activity a2 = AbstractC4956m.a(aVar);
        if (a2 == null) {
            str = "Cannot find Activity from container view";
        } else {
            if (!n.b) {
                m mVar = new m(nVar, a2);
                if (I.a((CharSequence) c5070f.f12729a) && I.a((CharSequence) c5070f.b) && I.a((CharSequence) c5070f.c) && I.a((CharSequence) c5070f.d) && I.a((CharSequence) c5070f.e) && I.a((CharSequence) c5070f.f)) {
                    return;
                }
                mVar.show();
                n.b = true;
                return;
            }
            str = "Feedback dialog is showing. Cannot show again.";
        }
        AbstractC5496a.b("Feedback", str);
    }
}
