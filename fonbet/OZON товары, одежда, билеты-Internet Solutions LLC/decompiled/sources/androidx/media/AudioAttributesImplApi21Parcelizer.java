package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes8.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f43446a = (AudioAttributes) aVar.p(audioAttributesImplApi21.f43446a, 1);
        audioAttributesImplApi21.f43447b = aVar.n(audioAttributesImplApi21.f43447b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, androidx.versionedparcelable.a aVar) {
        aVar.getClass();
        aVar.E(audioAttributesImplApi21.f43446a, 1);
        aVar.C(audioAttributesImplApi21.f43447b, 2);
    }
}
