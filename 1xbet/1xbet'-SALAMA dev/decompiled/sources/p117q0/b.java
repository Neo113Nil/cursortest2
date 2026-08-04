package p117q0;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static AudioFocusRequest a(int i7, AudioAttributes audioAttributes, boolean z4, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i7).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z4).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
