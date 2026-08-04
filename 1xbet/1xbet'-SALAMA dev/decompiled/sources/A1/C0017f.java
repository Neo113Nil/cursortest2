package A1;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: A1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017f implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0019g f351b;

    public C0017f(C0019g c0019g, Handler handler) {
        this.f351b = c0019g;
        this.f350a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f350a.post(new RunnableC0015e(this, i7, 0));
    }
}
