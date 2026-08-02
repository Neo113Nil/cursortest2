package androidx.media;

import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements W4.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f43443b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f43444a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final AudioAttributesImpl.a f43445a;

        public a() {
            int i11 = AudioAttributesCompat.f43443b;
            this.f43445a = new AudioAttributesImplApi26.a();
        }

        public final AudioAttributesCompat a() {
            return new AudioAttributesCompat(new AudioAttributesImplApi26(((AudioAttributesImplApi26.a) this.f43445a).f43448a.build()));
        }

        public final void b() {
            ((AudioAttributesImplApi21.a) this.f43445a).f43448a.setContentType(3);
        }

        public final void c() {
            ((AudioAttributesImplApi26.a) this.f43445a).f43448a.setUsage(1);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    static int b(int i11, int i12) {
        if ((i11 & 1) == 1) {
            return 7;
        }
        if ((i11 & 4) == 4) {
            return 6;
        }
        switch (i12) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f43444a;
        return audioAttributesImpl == null ? audioAttributesCompat.f43444a == null : audioAttributesImpl.equals(audioAttributesCompat.f43444a);
    }

    public final int hashCode() {
        return this.f43444a.hashCode();
    }

    public final String toString() {
        return this.f43444a.toString();
    }

    AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.f43444a = audioAttributesImplApi26;
    }
}
