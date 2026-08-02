package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class MultiFlavorDetectorCreator {
    private final java.util.Map zza = new java.util.HashMap();

    public interface DetectorCreator<DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> {
        DetectorT create(OptionsT optionst);
    }

    public interface DetectorOptions<DetectorT> {
    }

    public interface MultiFlavorDetector {
    }

    MultiFlavorDetectorCreator(java.util.Set set) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration registration = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration) it.next();
            java.lang.Class zzc = registration.zzc();
            if (!this.zza.containsKey(zzc) || registration.zza() >= ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.Integer) hashMap.get(zzc))).intValue()) {
                this.zza.put(zzc, registration.zzb());
                hashMap.put(zzc, java.lang.Integer.valueOf(registration.zza()));
            }
        }
    }

    public static com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator getInstance() {
        com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator multiFlavorDetectorCreator;
        synchronized (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class) {
            multiFlavorDetectorCreator = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator) com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().get(com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class);
        }
        return multiFlavorDetectorCreator;
    }

    public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> DetectorT create(OptionsT optionst) {
        return (DetectorT) ((com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator) ((com.google.firebase.inject.Provider) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.firebase.inject.Provider) this.zza.get(optionst.getClass()))).get()).create(optionst);
    }

    public static class Registration {
        private final java.lang.Class zza;
        private final com.google.firebase.inject.Provider zzb;
        private final int zzc;

        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(java.lang.Class<? extends OptionsT> cls, com.google.firebase.inject.Provider<? extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator<DetectorT, OptionsT>> provider) {
            this(cls, provider, 100);
        }

        final java.lang.Class zzc() {
            return this.zza;
        }

        final com.google.firebase.inject.Provider zzb() {
            return this.zzb;
        }

        final int zza() {
            return this.zzc;
        }

        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(java.lang.Class<? extends OptionsT> cls, com.google.firebase.inject.Provider<? extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator<DetectorT, OptionsT>> provider, int i) {
            this.zza = cls;
            this.zzb = provider;
            this.zzc = i;
        }
    }
}
