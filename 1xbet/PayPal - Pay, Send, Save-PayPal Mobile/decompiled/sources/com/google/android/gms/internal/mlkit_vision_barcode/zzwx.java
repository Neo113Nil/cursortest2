package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzwx implements com.google.android.gms.internal.mlkit_vision_barcode.zzwf {
    private com.google.firebase.inject.Provider zza;
    private final com.google.firebase.inject.Provider zzb;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzc;

    public zzwx(android.content.Context context, com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzwhVar) {
        this.zzc = zzwhVar;
        com.google.android.datatransport.cct.CCTDestination cCTDestination = com.google.android.datatransport.cct.CCTDestination.INSTANCE;
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
        final com.google.android.datatransport.TransportFactory newFactory = com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(com.google.android.datatransport.Encoding.of("json"))) {
            this.zza = new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // com.google.firebase.inject.Provider
                public final java.lang.Object get() {
                    return com.google.android.datatransport.TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, com.google.android.datatransport.Encoding.of("json"), new com.google.android.datatransport.Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // com.google.android.datatransport.Transformer
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.android.datatransport.TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, com.google.android.datatransport.Encoding.of("proto"), new com.google.android.datatransport.Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // com.google.android.datatransport.Transformer
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static com.google.android.datatransport.Event zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzwhVar, com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar) {
        int zza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? com.google.android.datatransport.Event.ofData(zzweVar.zze(zza, false)) : com.google.android.datatransport.Event.ofTelemetry(zzweVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((com.google.android.datatransport.Transport) this.zzb.get()).send(zzb(this.zzc, zzweVar));
            return;
        }
        com.google.firebase.inject.Provider provider = this.zza;
        if (provider != null) {
            ((com.google.android.datatransport.Transport) provider.get()).send(zzb(this.zzc, zzweVar));
        }
    }
}
