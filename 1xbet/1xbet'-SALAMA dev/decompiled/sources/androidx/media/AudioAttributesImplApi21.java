package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f9651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9652b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i7 = this.f9652b;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(this.f9651a.getFlags(), this.f9651a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f9651a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9651a.equals(((AudioAttributesImplApi21) obj).f9651a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9651a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9651a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f9651a = audioAttributes;
    }
}
