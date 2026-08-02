package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class QD implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f11191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RD f11192b;

    public QD(RD rd, Handler handler) {
        this.f11192b = rd;
        this.f11191a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f11191a.post(new RunnableC0920e5(i, 4, this));
    }
}
