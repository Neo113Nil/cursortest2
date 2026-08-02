package androidx.media;

/* loaded from: classes8.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f43444a = (AudioAttributesImpl) aVar.t(audioAttributesCompat.f43444a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        aVar.getClass();
        aVar.H(audioAttributesCompat.f43444a);
    }
}
