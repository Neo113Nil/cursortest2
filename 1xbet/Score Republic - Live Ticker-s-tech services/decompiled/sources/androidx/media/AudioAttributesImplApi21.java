package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f569a;

    /* JADX INFO: renamed from: b */
    public int f570b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f569a.equals(((AudioAttributesImplApi21) obj).f569a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f569a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f569a;
    }
}
