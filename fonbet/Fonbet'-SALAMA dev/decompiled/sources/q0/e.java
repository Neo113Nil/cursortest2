package q0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class e {
    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
