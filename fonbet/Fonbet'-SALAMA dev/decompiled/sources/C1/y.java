package C1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class y extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f1565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f1566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(E e7, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f1566b = e7;
        this.f1565a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        E e7 = this.f1566b;
        AudioTrack audioTrack = this.f1565a;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            e7.f1375h.open();
        }
    }
}
