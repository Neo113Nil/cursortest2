package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zziw implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zziw zza = new com.google.android.gms.internal.mlkit_vision_barcode.zziw();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("format");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        zzb = builder.withProperty(zzfaVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        objectEncoderContext.add(zzb, ((com.google.android.gms.internal.mlkit_vision_barcode.zzvz) obj).zza());
    }

    private zziw() {
    }
}
