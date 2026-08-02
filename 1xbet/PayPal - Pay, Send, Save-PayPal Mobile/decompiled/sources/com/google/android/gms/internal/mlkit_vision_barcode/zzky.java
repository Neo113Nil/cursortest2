package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzky implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzky zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzky();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("modelInfo");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        builder.withProperty(zzfaVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("initialDownloadConditions");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar2.zza(2);
        builder2.withProperty(zzfaVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("updateDownloadConditions");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar3.zza(3);
        builder3.withProperty(zzfaVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("isModelUpdateEnabled");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar4 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar4.zza(4);
        builder4.withProperty(zzfaVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzky() {
    }
}
