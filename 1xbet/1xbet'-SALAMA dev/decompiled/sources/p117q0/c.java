package p117q0;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f15729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p043f5.c f15730b;

    public c(p043f5.c cVar, Handler handler) {
        this.f15730b = cVar;
        this.f15729a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f15730b.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        Handler handler = this.f15729a;
        handler.sendMessage(Message.obtain(handler, 2782386, i7, 0));
    }
}
