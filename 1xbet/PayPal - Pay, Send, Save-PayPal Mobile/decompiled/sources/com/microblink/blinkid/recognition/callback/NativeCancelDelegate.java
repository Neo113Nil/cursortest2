package com.microblink.blinkid.recognition.callback;

/* loaded from: classes.dex */
public class NativeCancelDelegate {
    public boolean IlIllIlIIl = true;
    public long llIIlIlIIl;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public NativeCancelDelegate() {
        this.llIIlIlIIl = 0L;
        this.llIIlIlIIl = nativeConstruct();
    }

    private native long nativeConstruct();

    private static native void nativeDestruct(long j);

    private static native void nativeSetPaused(long j, boolean z);

    public final void finalize() {
        super.finalize();
        long j = this.llIIlIlIIl;
        if (j != 0) {
            nativeDestruct(j);
            this.llIIlIlIIl = 0L;
        }
    }

    public final void llIIlIlIIl(boolean z) {
        this.IlIllIlIIl = z;
        nativeSetPaused(this.llIIlIlIIl, z);
    }
}
