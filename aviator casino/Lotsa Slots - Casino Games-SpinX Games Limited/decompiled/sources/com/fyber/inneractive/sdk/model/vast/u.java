package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3812a;
    public java.util.ArrayList b;

    public static com.fyber.inneractive.sdk.model.vast.u a(org.w3c.dom.Node node) {
        com.fyber.inneractive.sdk.model.vast.f fVar;
        com.fyber.inneractive.sdk.model.vast.u uVar = new com.fyber.inneractive.sdk.model.vast.u();
        uVar.f3812a = com.fyber.inneractive.sdk.util.w1.b(node, "version");
        java.util.ArrayList c = com.fyber.inneractive.sdk.util.w1.c(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d);
        if (!c.isEmpty()) {
            uVar.b = new java.util.ArrayList();
            java.util.Iterator it = c.iterator();
            while (it.hasNext()) {
                org.w3c.dom.Node node2 = (org.w3c.dom.Node) it.next();
                if (node2 == null) {
                    fVar = null;
                } else {
                    com.fyber.inneractive.sdk.model.vast.f fVar2 = new com.fyber.inneractive.sdk.model.vast.f();
                    fVar2.f3802a = com.fyber.inneractive.sdk.util.w1.b(node2, "id");
                    org.w3c.dom.Node d = com.fyber.inneractive.sdk.util.w1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f);
                    if (d != null) {
                        fVar2.b = com.fyber.inneractive.sdk.model.vast.a0.c(d);
                    }
                    org.w3c.dom.Node d2 = com.fyber.inneractive.sdk.util.w1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
                    if (d2 != null) {
                        fVar2.c = com.fyber.inneractive.sdk.model.vast.p.c(d2);
                    }
                    fVar = fVar2;
                }
                uVar.b.add(fVar);
            }
        }
        return uVar;
    }

    public final java.lang.String toString() {
        return new java.lang.StringBuilder("Vast: version - " + this.f3812a + "\nAds: ").toString();
    }
}
