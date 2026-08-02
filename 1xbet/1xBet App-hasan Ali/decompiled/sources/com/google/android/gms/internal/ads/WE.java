package com.google.android.gms.internal.ads;

import android.media.AudioProfile;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class WE {
    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ AudioProfile d(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder k() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder l() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder p(AutofillId autofillId, long j5) {
        return new ViewTranslationRequest.Builder(autofillId, j5);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse r(Object obj) {
        return (ViewTranslationResponse) obj;
    }
}
