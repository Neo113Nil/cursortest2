package T5;

import A5.f;
import A5.s;
import android.content.Context;
import t6.h;
import w1.P2;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public s f6368a;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        f fVar = c1782b.f18077c;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = c1782b.f18075a;
        h.d(context, "getApplicationContext(...)");
        this.f6368a = new s(fVar, "PonnamKarthik/fluttertoast");
        P2 p22 = new P2(20, (char) 0);
        p22.f17508b = context;
        s sVar = this.f6368a;
        if (sVar != null) {
            sVar.b(p22);
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "p0");
        s sVar = this.f6368a;
        if (sVar != null) {
            sVar.b(null);
        }
        this.f6368a = null;
    }
}
