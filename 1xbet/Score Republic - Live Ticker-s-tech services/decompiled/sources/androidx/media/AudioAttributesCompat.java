package androidx.media;

import android.util.SparseIntArray;
import p000.lh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements lh1 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f567b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f568a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f568a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f568a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.f568a.hashCode();
    }

    public final String toString() {
        return this.f568a.toString();
    }
}
