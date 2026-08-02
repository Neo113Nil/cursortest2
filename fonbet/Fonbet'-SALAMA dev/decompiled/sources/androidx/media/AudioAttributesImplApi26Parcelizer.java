package androidx.media;

import Q0.b;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f9651a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f9651a, 1);
        audioAttributesImplApi26.f9652b = bVar.f(audioAttributesImplApi26.f9652b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f9651a, 1);
        bVar.j(audioAttributesImplApi26.f9652b, 2);
    }
}
