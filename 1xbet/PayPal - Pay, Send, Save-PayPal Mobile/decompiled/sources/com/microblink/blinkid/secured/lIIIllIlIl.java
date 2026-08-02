package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIIllIlIl implements android.animation.TypeEvaluator {
    public final android.animation.ArgbEvaluator llIIlIlIIl = new android.animation.ArgbEvaluator();

    public lIIIllIlIl(com.microblink.blinkid.view.viewfinder.points.PointSetView pointSetView) {
    }

    @Override // android.animation.TypeEvaluator
    public final java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        com.microblink.blinkid.secured.IlIllIIIIl ilIllIIIIl = (com.microblink.blinkid.secured.IlIllIIIIl) obj;
        com.microblink.blinkid.secured.IlIllIIIIl ilIllIIIIl2 = (com.microblink.blinkid.secured.IlIllIIIIl) obj2;
        return new com.microblink.blinkid.secured.IlIllIIIIl(((java.lang.Integer) this.llIIlIlIIl.evaluate(f, java.lang.Integer.valueOf(ilIllIIIIl.llIIlIlIIl), java.lang.Integer.valueOf(ilIllIIIIl2.llIIlIlIIl))).intValue(), ((java.lang.Integer) this.llIIlIlIIl.evaluate(f, java.lang.Integer.valueOf(ilIllIIIIl.IlIllIlIIl), java.lang.Integer.valueOf(ilIllIIIIl2.IlIllIlIIl))).intValue());
    }
}
