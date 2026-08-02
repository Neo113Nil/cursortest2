package androidx.media;

import p000.jh1;
import p000.lh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(jh1 jh1Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        lh1 lh1VarM2866h = audioAttributesCompat.f568a;
        if (jh1Var.mo2863e(1)) {
            lh1VarM2866h = jh1Var.m2866h();
        }
        audioAttributesCompat.f568a = (AudioAttributesImpl) lh1VarM2866h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, jh1 jh1Var) {
        jh1Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f568a;
        jh1Var.mo2867i(1);
        jh1Var.m2869k(audioAttributesImpl);
    }
}
