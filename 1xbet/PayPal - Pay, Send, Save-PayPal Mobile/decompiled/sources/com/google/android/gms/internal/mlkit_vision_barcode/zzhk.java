package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzhk implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzhk zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzhk();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("logEventKey");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        zzb = builder.withProperty(zzfaVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("eventCount");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar2.zza(2);
        zzc = builder2.withProperty(zzfaVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("inferenceDurationStats");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar3.zza(3);
        zzd = builder3.withProperty(zzfaVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfv zzfvVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzfv) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzfvVar.zza());
        objectEncoderContext2.add(zzc, zzfvVar.zzc());
        objectEncoderContext2.add(zzd, zzfvVar.zzb());
    }

    private zzhk() {
    }
}
