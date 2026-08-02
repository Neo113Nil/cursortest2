package androidx.activity;

import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.ui.PlayerControlView;

/* renamed from: androidx.activity.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0177j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0177j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0((ComponentActivity) this.b);
                break;
            case 1:
                ((SsMediaSource) this.b).startLoadingManifest();
                break;
            default:
                ((PlayerControlView) this.b).updateProgress();
                break;
        }
    }
}
