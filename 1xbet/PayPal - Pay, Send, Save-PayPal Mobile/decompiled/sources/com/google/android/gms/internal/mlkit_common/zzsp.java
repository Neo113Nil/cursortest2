package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzsp implements com.google.android.gms.internal.mlkit_common.zzrz {
    private com.google.firebase.inject.Provider zza;
    private final com.google.firebase.inject.Provider zzb;
    private final com.google.android.gms.internal.mlkit_common.zzsb zzc;

    public zzsp(android.content.Context context, com.google.android.gms.internal.mlkit_common.zzsb zzsbVar) {
        this.zzc = zzsbVar;
        com.google.android.datatransport.cct.CCTDestination cCTDestination = com.google.android.datatransport.cct.CCTDestination.INSTANCE;
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
        final com.google.android.datatransport.TransportFactory newFactory = com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(com.google.android.datatransport.Encoding.of("json"))) {
            this.zza = new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // com.google.firebase.inject.Provider
                public final java.lang.Object get() {
                    return com.google.android.datatransport.TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, com.google.android.datatransport.Encoding.of("json"), new com.google.android.datatransport.Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // com.google.android.datatransport.Transformer
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.android.datatransport.TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, com.google.android.datatransport.Encoding.of("proto"), new com.google.android.datatransport.Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // com.google.android.datatransport.Transformer
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static com.google.android.datatransport.Event zzb(com.google.android.gms.internal.mlkit_common.zzsb zzsbVar, com.google.android.gms.internal.mlkit_common.zzry zzryVar) {
        return com.google.android.datatransport.Event.ofTelemetry(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(com.google.android.gms.internal.mlkit_common.zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((com.google.android.datatransport.Transport) this.zzb.get()).send(zzb(this.zzc, zzryVar));
            return;
        }
        com.google.firebase.inject.Provider provider = this.zza;
        if (provider != null) {
            ((com.google.android.datatransport.Transport) provider.get()).send(zzb(this.zzc, zzryVar));
        }
    }
}
