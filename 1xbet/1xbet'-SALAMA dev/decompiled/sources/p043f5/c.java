package p043f5;

import U5.C0436c;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0436c f12993a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        C0436c c0436c = this.f12993a;
        if (i7 == -1) {
            c0436c.a();
        }
        c0436c.e("onAudioFocusChanged", Integer.valueOf(i7));
    }
}
