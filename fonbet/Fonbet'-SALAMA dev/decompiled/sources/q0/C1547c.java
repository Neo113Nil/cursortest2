package q0;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import f5.C1103c;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15723a;

    /* renamed from: b, reason: collision with root package name */
    public final C1103c f15724b;

    public C1547c(C1103c c1103c, Handler handler) {
        this.f15724b = c1103c;
        this.f15723a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f15724b.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        Handler handler = this.f15723a;
        handler.sendMessage(Message.obtain(handler, 2782386, i7, 0));
    }
}
