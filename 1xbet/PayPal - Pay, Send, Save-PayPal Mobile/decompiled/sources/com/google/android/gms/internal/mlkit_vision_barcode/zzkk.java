package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzkk implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzkk zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzkk();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;
    private static final com.google.firebase.encoders.FieldDescriptor zzg;
    private static final com.google.firebase.encoders.FieldDescriptor zzh;
    private static final com.google.firebase.encoders.FieldDescriptor zzi;
    private static final com.google.firebase.encoders.FieldDescriptor zzj;
    private static final com.google.firebase.encoders.FieldDescriptor zzk;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("durationMs");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        zzb = builder.withProperty(zzfaVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("errorCode");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar2.zza(2);
        zzc = builder2.withProperty(zzfaVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("isColdCall");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar3.zza(3);
        zzd = builder3.withProperty(zzfaVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("autoManageModelOnBackground");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar4 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar4.zza(4);
        zze = builder4.withProperty(zzfaVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("autoManageModelOnLowMemory");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar5 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar5.zza(5);
        zzf = builder5.withProperty(zzfaVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("isNnApiEnabled");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar6 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar6.zza(6);
        zzg = builder6.withProperty(zzfaVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder("eventsCount");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar7 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar7.zza(7);
        zzh = builder7.withProperty(zzfaVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("otherErrors");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar8 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar8.zza(8);
        zzi = builder8.withProperty(zzfaVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("remoteConfigValueForAcceleration");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar9.zza(9);
        zzj = builder9.withProperty(zzfaVar9.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder10 = com.google.firebase.encoders.FieldDescriptor.builder("isAccelerated");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar10.zza(10);
        zzk = builder10.withProperty(zzfaVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzqq zzqqVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzqq) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzqqVar.zze());
        objectEncoderContext2.add(zzc, zzqqVar.zza());
        objectEncoderContext2.add(zzd, zzqqVar.zzd());
        objectEncoderContext2.add(zze, zzqqVar.zzb());
        objectEncoderContext2.add(zzf, zzqqVar.zzc());
        objectEncoderContext2.add(zzg, (java.lang.Object) null);
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
        objectEncoderContext2.add(zzi, (java.lang.Object) null);
        objectEncoderContext2.add(zzj, (java.lang.Object) null);
        objectEncoderContext2.add(zzk, (java.lang.Object) null);
    }

    private zzkk() {
    }
}
