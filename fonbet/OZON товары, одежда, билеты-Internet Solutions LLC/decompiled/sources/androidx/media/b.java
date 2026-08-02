package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b {

    private static class a {
        static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static void a(@NonNull AudioManager audioManager, @NonNull androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        a.a(audioManager, aVar.a());
    }

    public static void b(@NonNull AudioManager audioManager, @NonNull androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        a.b(audioManager, aVar.a());
    }
}
