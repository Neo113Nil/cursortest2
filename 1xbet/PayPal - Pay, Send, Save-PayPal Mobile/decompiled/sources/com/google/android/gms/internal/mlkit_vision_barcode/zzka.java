package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzka implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzka zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzka();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;
    private static final com.google.firebase.encoders.FieldDescriptor zzg;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("maxMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        zzb = builder.withProperty(zzfaVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("minMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar2.zza(2);
        zzc = builder2.withProperty(zzfaVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("avgMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar3.zza(3);
        zzd = builder3.withProperty(zzfaVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("firstQuartileMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar4 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar4.zza(4);
        zze = builder4.withProperty(zzfaVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("medianMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar5 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar5.zza(5);
        zzf = builder5.withProperty(zzfaVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("thirdQuartileMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar6 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar6.zza(6);
        zzg = builder6.withProperty(zzfaVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzqd zzqdVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzqd) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzqdVar.zzc());
        objectEncoderContext2.add(zzc, zzqdVar.zze());
        objectEncoderContext2.add(zzd, zzqdVar.zza());
        objectEncoderContext2.add(zze, zzqdVar.zzb());
        objectEncoderContext2.add(zzf, zzqdVar.zzd());
        objectEncoderContext2.add(zzg, zzqdVar.zzf());
    }

    private zzka() {
    }
}
