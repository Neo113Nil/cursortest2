package androidx.media;

import Q0.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9653a = bVar.f(audioAttributesImplBase.f9653a, 1);
        audioAttributesImplBase.f9654b = bVar.f(audioAttributesImplBase.f9654b, 2);
        audioAttributesImplBase.f9655c = bVar.f(audioAttributesImplBase.f9655c, 3);
        audioAttributesImplBase.f9656d = bVar.f(audioAttributesImplBase.f9656d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f9653a, 1);
        bVar.j(audioAttributesImplBase.f9654b, 2);
        bVar.j(audioAttributesImplBase.f9655c, 3);
        bVar.j(audioAttributesImplBase.f9656d, 4);
    }
}
