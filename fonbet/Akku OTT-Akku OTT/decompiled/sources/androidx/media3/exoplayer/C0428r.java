package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* renamed from: androidx.media3.exoplayer.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0428r implements BackgroundThreadStateHandler.StateChangeListener, MediaPeriodHolder.Factory {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0428r(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j) {
        MediaPeriodHolder createMediaPeriodHolder;
        createMediaPeriodHolder = ((ExoPlayerImplInternal) this.a).createMediaPeriodHolder(mediaPeriodInfo, j);
        return createMediaPeriodHolder;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0((SuitableOutputChecker.Callback) this.a, (Boolean) obj, (Boolean) obj2);
    }
}
