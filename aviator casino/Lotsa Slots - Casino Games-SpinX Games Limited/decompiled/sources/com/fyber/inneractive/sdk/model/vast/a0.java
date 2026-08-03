package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class a0 extends com.fyber.inneractive.sdk.model.vast.g {
    public java.lang.String i;

    public a0() {
        this.f = 1;
    }

    public static com.fyber.inneractive.sdk.model.vast.a0 c(org.w3c.dom.Node node) {
        com.fyber.inneractive.sdk.model.vast.a0 a0Var = new com.fyber.inneractive.sdk.model.vast.a0();
        super.b(node);
        a0Var.i = com.fyber.inneractive.sdk.util.w1.a(com.fyber.inneractive.sdk.util.w1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g));
        return a0Var;
    }
}
