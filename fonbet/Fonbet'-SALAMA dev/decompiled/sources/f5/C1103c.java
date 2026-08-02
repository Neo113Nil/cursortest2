package f5;

import U5.C0436c;
import android.media.AudioManager;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1103c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0436c f12987a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        C0436c c0436c = this.f12987a;
        if (i7 == -1) {
            c0436c.a();
        }
        c0436c.e("onAudioFocusChanged", Integer.valueOf(i7));
    }
}
