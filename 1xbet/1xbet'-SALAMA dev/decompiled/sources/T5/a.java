package T5;

import A5.f;
import A5.s;
import android.content.Context;
import p155w1.P2;
import p159w5.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f6368a;

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        h.e(bVar, "binding");
        f fVar = bVar.f18083c;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = bVar.f18081a;
        h.d(context, "getApplicationContext(...)");
        this.f6368a = new s(fVar, "PonnamKarthik/fluttertoast");
        P2 p5 = new P2(20, (char) 0);
        p5.f17514b = context;
        s sVar = this.f6368a;
        if (sVar != null) {
            sVar.b(p5);
        }
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        h.e(bVar, "p0");
        s sVar = this.f6368a;
        if (sVar != null) {
            sVar.b(null);
        }
        this.f6368a = null;
    }
}
