package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzon implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzon zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzon();
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
    private static final com.google.firebase.encoders.FieldDescriptor zzl;
    private static final com.google.firebase.encoders.FieldDescriptor zzm;
    private static final com.google.firebase.encoders.FieldDescriptor zzn;
    private static final com.google.firebase.encoders.FieldDescriptor zzo;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("appId");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(1);
        zzb = builder.withProperty(zzfaVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("appVersion");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar2.zza(2);
        zzc = builder2.withProperty(zzfaVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("firebaseProjectId");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar3.zza(3);
        zzd = builder3.withProperty(zzfaVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkVersion");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar4 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar4.zza(4);
        zze = builder4.withProperty(zzfaVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("tfliteSchemaVersion");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar5 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar5.zza(5);
        zzf = builder5.withProperty(zzfaVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("gcmSenderId");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar6 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar6.zza(6);
        zzg = builder6.withProperty(zzfaVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder(com.visa.cbp.sdk.facade.data.Constants.API_KEY);
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar7 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar7.zza(7);
        zzh = builder7.withProperty(zzfaVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("languages");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar8 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar8.zza(8);
        zzi = builder8.withProperty(zzfaVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkInstanceId");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar9.zza(9);
        zzj = builder9.withProperty(zzfaVar9.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder10 = com.google.firebase.encoders.FieldDescriptor.builder("isClearcutClient");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar10.zza(10);
        zzk = builder10.withProperty(zzfaVar10.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder11 = com.google.firebase.encoders.FieldDescriptor.builder("isStandaloneMlkit");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar11 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar11.zza(11);
        zzl = builder11.withProperty(zzfaVar11.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder12 = com.google.firebase.encoders.FieldDescriptor.builder("isJsonLogging");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar12 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar12.zza(12);
        zzm = builder12.withProperty(zzfaVar12.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder13 = com.google.firebase.encoders.FieldDescriptor.builder("buildLevel");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar13 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar13.zza(13);
        zzn = builder13.withProperty(zzfaVar13.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder14 = com.google.firebase.encoders.FieldDescriptor.builder("optionalModuleVersion");
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar14 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar14.zza(14);
        zzo = builder14.withProperty(zzfaVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzvd zzvdVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzvd) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzvdVar.zzg());
        objectEncoderContext2.add(zzc, zzvdVar.zzh());
        objectEncoderContext2.add(zzd, (java.lang.Object) null);
        objectEncoderContext2.add(zze, zzvdVar.zzj());
        objectEncoderContext2.add(zzf, zzvdVar.zzk());
        objectEncoderContext2.add(zzg, (java.lang.Object) null);
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
        objectEncoderContext2.add(zzi, zzvdVar.zza());
        objectEncoderContext2.add(zzj, zzvdVar.zzi());
        objectEncoderContext2.add(zzk, zzvdVar.zzb());
        objectEncoderContext2.add(zzl, zzvdVar.zzd());
        objectEncoderContext2.add(zzm, zzvdVar.zzc());
        objectEncoderContext2.add(zzn, zzvdVar.zze());
        objectEncoderContext2.add(zzo, zzvdVar.zzf());
    }

    private zzon() {
    }
}
