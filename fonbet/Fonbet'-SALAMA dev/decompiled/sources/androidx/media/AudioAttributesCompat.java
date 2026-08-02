package androidx.media;

import Q0.d;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9649b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f9650a;

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

    public static int c(int i7, int i8) {
        if ((i7 & 1) == 1) {
            return 7;
        }
        if ((i7 & 4) == 4) {
            return 6;
        }
        switch (i8) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
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
            case 13:
                return 1;
            case 15:
            default:
                return 3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f9650a;
        return audioAttributesImpl == null ? audioAttributesCompat.f9650a == null : audioAttributesImpl.equals(audioAttributesCompat.f9650a);
    }

    public final int hashCode() {
        return this.f9650a.hashCode();
    }

    public final String toString() {
        return this.f9650a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f9650a = audioAttributesImpl;
    }
}
