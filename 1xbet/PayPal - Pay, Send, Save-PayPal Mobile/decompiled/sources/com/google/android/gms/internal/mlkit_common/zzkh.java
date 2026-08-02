package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzkh implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzkh zza = new com.google.android.gms.internal.mlkit_common.zzkh();
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
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("appVersion");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        zzc = builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("firebaseProjectId");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        zzd = builder3.withProperty(zzayVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkVersion");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar4 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar4.zza(4);
        zze = builder4.withProperty(zzayVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("tfliteSchemaVersion");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar5 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar5.zza(5);
        zzf = builder5.withProperty(zzayVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("gcmSenderId");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar6 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar6.zza(6);
        zzg = builder6.withProperty(zzayVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder(com.visa.cbp.sdk.facade.data.Constants.API_KEY);
        com.google.android.gms.internal.mlkit_common.zzay zzayVar7 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar7.zza(7);
        zzh = builder7.withProperty(zzayVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("languages");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar8 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar8.zza(8);
        zzi = builder8.withProperty(zzayVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkInstanceId");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar9 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar9.zza(9);
        zzj = builder9.withProperty(zzayVar9.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder10 = com.google.firebase.encoders.FieldDescriptor.builder("isClearcutClient");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar10 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar10.zza(10);
        zzk = builder10.withProperty(zzayVar10.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder11 = com.google.firebase.encoders.FieldDescriptor.builder("isStandaloneMlkit");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar11 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar11.zza(11);
        zzl = builder11.withProperty(zzayVar11.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder12 = com.google.firebase.encoders.FieldDescriptor.builder("isJsonLogging");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar12 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar12.zza(12);
        zzm = builder12.withProperty(zzayVar12.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder13 = com.google.firebase.encoders.FieldDescriptor.builder("buildLevel");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar13 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar13.zza(13);
        zzn = builder13.withProperty(zzayVar13.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder14 = com.google.firebase.encoders.FieldDescriptor.builder("optionalModuleVersion");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar14 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar14.zza(14);
        zzo = builder14.withProperty(zzayVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_common.zzqv zzqvVar = (com.google.android.gms.internal.mlkit_common.zzqv) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzqvVar.zzg());
        objectEncoderContext2.add(zzc, zzqvVar.zzh());
        objectEncoderContext2.add(zzd, (java.lang.Object) null);
        objectEncoderContext2.add(zze, zzqvVar.zzj());
        objectEncoderContext2.add(zzf, zzqvVar.zzk());
        objectEncoderContext2.add(zzg, (java.lang.Object) null);
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
        objectEncoderContext2.add(zzi, zzqvVar.zza());
        objectEncoderContext2.add(zzj, zzqvVar.zzi());
        objectEncoderContext2.add(zzk, zzqvVar.zzb());
        objectEncoderContext2.add(zzl, zzqvVar.zzd());
        objectEncoderContext2.add(zzm, zzqvVar.zzc());
        objectEncoderContext2.add(zzn, zzqvVar.zze());
        objectEncoderContext2.add(zzo, zzqvVar.zzf());
    }

    private zzkh() {
    }
}
