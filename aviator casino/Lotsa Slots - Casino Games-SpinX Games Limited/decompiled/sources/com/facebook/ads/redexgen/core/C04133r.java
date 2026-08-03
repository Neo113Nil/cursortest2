package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04133r extends com.facebook.ads.redexgen.core.E2 {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04123q A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C04133r(com.facebook.ads.redexgen.core.C04123q c04123q) {
        this.A00 = c04123q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.get() == null) goto L6;
     */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
        java.lang.ref.WeakReference weakReference;
        java.lang.ref.WeakReference weakReference2;
        java.lang.ref.WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new java.lang.ref.WeakReference(new com.facebook.ads.redexgen.core.C1536f6(this));
        android.media.AudioManager audioManager = (android.media.AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71));
        weakReference2 = this.A00.A00;
        audioManager.requestAudioFocus((android.media.AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}
