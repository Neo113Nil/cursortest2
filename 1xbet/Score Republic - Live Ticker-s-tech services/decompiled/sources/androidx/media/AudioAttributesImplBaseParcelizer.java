package androidx.media;

import p000.jh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(jh1 jh1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f571a = jh1Var.m2864f(audioAttributesImplBase.f571a, 1);
        audioAttributesImplBase.f572b = jh1Var.m2864f(audioAttributesImplBase.f572b, 2);
        audioAttributesImplBase.f573c = jh1Var.m2864f(audioAttributesImplBase.f573c, 3);
        audioAttributesImplBase.f574d = jh1Var.m2864f(audioAttributesImplBase.f574d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, jh1 jh1Var) {
        jh1Var.getClass();
        jh1Var.m2868j(audioAttributesImplBase.f571a, 1);
        jh1Var.m2868j(audioAttributesImplBase.f572b, 2);
        jh1Var.m2868j(audioAttributesImplBase.f573c, 3);
        jh1Var.m2868j(audioAttributesImplBase.f574d, 4);
    }
}
