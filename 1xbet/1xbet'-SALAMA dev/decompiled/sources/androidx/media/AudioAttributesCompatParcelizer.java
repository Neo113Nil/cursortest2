package androidx.media;

import Q0.b;
import Q0.d;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVarH = audioAttributesCompat.f9650a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f9650a = (AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f9650a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
