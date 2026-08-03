package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1536f6 implements android.media.AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04133r A00;

    public C1536f6(com.facebook.ads.redexgen.core.C04133r c04133r) {
        this.A00 = c04133r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C0648Dl(this, i));
    }
}
