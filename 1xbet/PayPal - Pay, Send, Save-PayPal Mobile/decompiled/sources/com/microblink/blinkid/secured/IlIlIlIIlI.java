package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIlIlIIlI extends com.microblink.blinkid.secured.IIllIllIIl {
    public java.util.HashMap IllIIIIllI;
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIIIlll lIlIIIIlIl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IlIlIlIIlI(com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll, com.microblink.blinkid.secured.IlllIIIllI illlIIIllI, int i) {
        super(illlIIIllI, i);
        this.lIlIIIIlIl = ilIIIIIlll;
        this.IllIIIIllI = null;
        this.IllIIIIllI = new java.util.HashMap(i);
    }

    public final void finalize() {
        java.util.HashMap hashMap = this.IllIIIIllI;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                ((com.microblink.blinkid.hardware.camera.Camera1Frame) this.IllIIIIllI.get((byte[]) it.next())).lIlIIIIlIl();
            }
            this.IllIIIIllI.clear();
        }
        this.IllIIIIllI = null;
        super.finalize();
    }

    @Override // com.microblink.blinkid.secured.IIllIllIIl
    public final com.microblink.blinkid.secured.lIllIlIlII llIIlIlIIl() {
        com.microblink.blinkid.hardware.camera.Camera1Frame camera1Frame;
        synchronized (this) {
            camera1Frame = (com.microblink.blinkid.hardware.camera.Camera1Frame) super.llIIlIlIIl();
            this.IllIIIIllI.put(camera1Frame.llIIlIlIIl, camera1Frame);
            com.microblink.blinkid.util.Log.d(this.lIlIIIIlIl, "Creating new camera preview frame", new java.lang.Object[0]);
        }
        return camera1Frame;
    }
}
