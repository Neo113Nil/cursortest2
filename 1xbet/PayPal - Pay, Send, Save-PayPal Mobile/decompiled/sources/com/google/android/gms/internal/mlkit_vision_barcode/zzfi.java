package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzfi implements com.google.firebase.encoders.config.EncoderConfig {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.firebase.encoders.ObjectEncoder zzb = new com.google.firebase.encoders.ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzfh
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) {
            int i = com.google.android.gms.internal.mlkit_vision_barcode.zzfi.zza;
            throw new com.google.firebase.encoders.EncodingException("Couldn't find encoder for type ".concat(java.lang.String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private final com.google.firebase.encoders.ObjectEncoder zze = zzb;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public final /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(java.lang.Class cls, com.google.firebase.encoders.ObjectEncoder objectEncoder) {
        this.zzc.put(cls, objectEncoder);
        this.zzd.remove(cls);
        return this;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzfj zza() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzfj(new java.util.HashMap(this.zzc), new java.util.HashMap(this.zzd), this.zze);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public final /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(java.lang.Class cls, com.google.firebase.encoders.ValueEncoder valueEncoder) {
        this.zzd.put(cls, valueEncoder);
        this.zzc.remove(cls);
        return this;
    }
}
