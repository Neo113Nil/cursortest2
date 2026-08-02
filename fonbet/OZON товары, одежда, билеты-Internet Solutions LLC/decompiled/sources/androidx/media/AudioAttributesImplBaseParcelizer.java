package androidx.media;

/* loaded from: classes8.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f43449a = aVar.n(audioAttributesImplBase.f43449a, 1);
        audioAttributesImplBase.f43450b = aVar.n(audioAttributesImplBase.f43450b, 2);
        audioAttributesImplBase.f43451c = aVar.n(audioAttributesImplBase.f43451c, 3);
        audioAttributesImplBase.f43452d = aVar.n(audioAttributesImplBase.f43452d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.getClass();
        aVar.C(audioAttributesImplBase.f43449a, 1);
        aVar.C(audioAttributesImplBase.f43450b, 2);
        aVar.C(audioAttributesImplBase.f43451c, 3);
        aVar.C(audioAttributesImplBase.f43452d, 4);
    }
}
