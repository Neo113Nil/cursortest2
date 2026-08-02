package androidx.media;

import android.media.AudioAttributes;
import p000.jh1;
import p000.kh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(jh1 jh1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f569a = (AudioAttributes) jh1Var.m2865g(audioAttributesImplApi21.f569a, 1);
        audioAttributesImplApi21.f570b = jh1Var.m2864f(audioAttributesImplApi21.f570b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, jh1 jh1Var) {
        jh1Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f569a;
        jh1Var.mo2867i(1);
        ((kh1) jh1Var).f4376e.writeParcelable(audioAttributes, 0);
        jh1Var.m2868j(audioAttributesImplApi21.f570b, 2);
    }
}
