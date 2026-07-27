package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2830f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C17073r A00;

    public C2830f6(C17073r c17073r) {
        this.A00 = c17073r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C1942Dl(this, i));
    }
}
