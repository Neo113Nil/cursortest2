package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.x0 f3688a;
    public final com.fyber.inneractive.sdk.flow.endcard.m b;
    public final boolean c;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b d;
    public final com.fyber.inneractive.sdk.flow.endcard.h e;
    public final int f;

    public k(android.content.Context context, com.fyber.inneractive.sdk.flow.t0 t0Var) {
        com.fyber.inneractive.sdk.flow.x0 x0Var = new com.fyber.inneractive.sdk.flow.x0(context, t0Var);
        com.fyber.inneractive.sdk.flow.endcard.m mVar = new com.fyber.inneractive.sdk.flow.endcard.m();
        this.b = mVar;
        this.f3688a = x0Var;
        this.c = !android.text.TextUtils.equals(x0Var.d.B, "1");
        com.fyber.inneractive.sdk.flow.endcard.h hVar = new com.fyber.inneractive.sdk.flow.endcard.h();
        this.e = hVar;
        this.f = hVar.b;
        this.d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(x0Var, mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0.c >= 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.flow.endcard.b a() {
        com.fyber.inneractive.sdk.flow.endcard.m mVar = this.b;
        int size = mVar.f3697a.size();
        int i = mVar.c;
        while (true) {
            i++;
            if (i >= size) {
                break;
            }
            com.fyber.inneractive.sdk.flow.endcard.b bVar = (com.fyber.inneractive.sdk.flow.endcard.b) mVar.f3697a.get(i);
            if (bVar.l()) {
                if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
                    int size2 = mVar.b.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            if (((com.fyber.inneractive.sdk.flow.endcard.b) mVar.b.get(size2)) instanceof com.fyber.inneractive.sdk.flow.endcard.o) {
                                break;
                            }
                            size2--;
                        }
                    }
                } else if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                    int i2 = i + 1;
                    for (int size3 = mVar.f3697a.size() - 1; size3 >= i2; size3--) {
                        com.fyber.inneractive.sdk.flow.endcard.b bVar2 = (com.fyber.inneractive.sdk.flow.endcard.b) mVar.f3697a.get(size3);
                        if (bVar2 instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                            bVar2.destroy();
                            mVar.f3697a.remove(size3);
                        }
                    }
                }
                mVar.c = i;
                mVar.b.add(bVar);
                bVar.e = mVar.b.size();
                return bVar;
            }
        }
        return null;
    }
}
