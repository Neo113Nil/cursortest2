package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: com.google.android.gms.internal.ads.rF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512rF extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fx f15286a;

    public C1512rF(Fx fx) {
        this.f15286a = fx;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(((C1557sF) this.f15286a.f9144l).f15468p);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((C1557sF) this.f15286a.f9144l).f15468p)) {
            ((C1557sF) this.f15286a.f9144l).f15442M = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(((C1557sF) this.f15286a.f9144l).f15468p);
    }
}
