package androidx.media3.exoplayer;

import android.media.AudioManager;

/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0399d implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AudioFocusManager a;

    public /* synthetic */ C0399d(AudioFocusManager audioFocusManager) {
        this.a = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.handlePlatformAudioFocusChange(i);
    }
}
