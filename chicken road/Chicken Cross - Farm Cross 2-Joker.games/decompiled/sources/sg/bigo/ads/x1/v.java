package sg.bigo.ads.x1;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class v implements sg.bigo.ads.w1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13405a;
    public final /* synthetic */ w b;

    public v(w wVar, Context context) {
        this.b = wVar;
        this.f13405a = context;
    }

    @Override // sg.bigo.ads.w1.c
    public final void a() {
        w wVar = this.b;
        String str = wVar.c;
        w.a(wVar.d);
    }

    @Override // sg.bigo.ads.w1.c
    public final void b() {
        w wVar = this.b;
        String str = wVar.c;
        w.a(wVar.d);
        w wVar2 = this.b;
        Context context = this.f13405a;
        if (TextUtils.equals("va_show", wVar2.c) || TextUtils.equals("va_cli", wVar2.c) || TextUtils.equals("va_cpn_imp", wVar2.c) || TextUtils.equals("va_cpn_cli", wVar2.c)) {
            int i = wVar2.g + 1;
            wVar2.g = i;
            wVar2.a(context, i);
        }
    }

    @Override // sg.bigo.ads.w1.c
    public final boolean a(int i) {
        sg.bigo.ads.P.u uVar = this.b.b;
        if (uVar != null) {
            return i >= 100 ? uVar.b.contains(String.valueOf(i)) : false;
        }
        return false;
    }
}
