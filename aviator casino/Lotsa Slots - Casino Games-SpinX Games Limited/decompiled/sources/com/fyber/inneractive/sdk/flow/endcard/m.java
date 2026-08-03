package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3697a = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public int c = -1;
    public final com.fyber.inneractive.sdk.flow.endcard.g d = new com.fyber.inneractive.sdk.flow.endcard.g();

    public final com.fyber.inneractive.sdk.flow.endcard.b a() {
        int i = this.c;
        if (i >= 0) {
            return (com.fyber.inneractive.sdk.flow.endcard.b) this.f3697a.get(i);
        }
        return null;
    }

    public final com.fyber.inneractive.sdk.flow.endcard.b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.flow.endcard.b bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        if (((bVar instanceof com.fyber.inneractive.sdk.flow.endcard.o) || (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.d)) && this.f3697a.contains(bVar)) {
            return;
        }
        this.f3697a.add(bVar);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.f3697a.sort(this.d);
        } else {
            java.util.Collections.sort(this.f3697a, this.d);
        }
    }
}
