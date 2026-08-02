package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzgu implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzgu zza = new com.google.android.gms.internal.mlkit_vision_common.zzgu();
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
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("appVersion");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar2 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("firebaseProjectId");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar3 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar3.zza(3);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkVersion");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar4 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar4.zza(4);
        zze = builder4.withProperty(zzaeVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("tfliteSchemaVersion");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar5 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar5.zza(5);
        zzf = builder5.withProperty(zzaeVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("gcmSenderId");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar6 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar6.zza(6);
        zzg = builder6.withProperty(zzaeVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder(com.visa.cbp.sdk.facade.data.Constants.API_KEY);
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar7 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar7.zza(7);
        zzh = builder7.withProperty(zzaeVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("languages");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar8 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar8.zza(8);
        zzi = builder8.withProperty(zzaeVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("mlSdkInstanceId");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar9 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar9.zza(9);
        zzj = builder9.withProperty(zzaeVar9.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder10 = com.google.firebase.encoders.FieldDescriptor.builder("isClearcutClient");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar10 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar10.zza(10);
        zzk = builder10.withProperty(zzaeVar10.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder11 = com.google.firebase.encoders.FieldDescriptor.builder("isStandaloneMlkit");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar11 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar11.zza(11);
        zzl = builder11.withProperty(zzaeVar11.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder12 = com.google.firebase.encoders.FieldDescriptor.builder("isJsonLogging");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar12 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar12.zza(12);
        zzm = builder12.withProperty(zzaeVar12.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder13 = com.google.firebase.encoders.FieldDescriptor.builder("buildLevel");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar13 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar13.zza(13);
        zzn = builder13.withProperty(zzaeVar13.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder14 = com.google.firebase.encoders.FieldDescriptor.builder("optionalModuleVersion");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar14 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar14.zza(14);
        zzo = builder14.withProperty(zzaeVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_common.zzla zzlaVar = (com.google.android.gms.internal.mlkit_vision_common.zzla) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlaVar.zzg());
        objectEncoderContext2.add(zzc, zzlaVar.zzh());
        objectEncoderContext2.add(zzd, (java.lang.Object) null);
        objectEncoderContext2.add(zze, zzlaVar.zzj());
        objectEncoderContext2.add(zzf, zzlaVar.zzk());
        objectEncoderContext2.add(zzg, (java.lang.Object) null);
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
        objectEncoderContext2.add(zzi, zzlaVar.zza());
        objectEncoderContext2.add(zzj, zzlaVar.zzi());
        objectEncoderContext2.add(zzk, zzlaVar.zzb());
        objectEncoderContext2.add(zzl, zzlaVar.zzd());
        objectEncoderContext2.add(zzm, zzlaVar.zzc());
        objectEncoderContext2.add(zzn, zzlaVar.zze());
        objectEncoderContext2.add(zzo, zzlaVar.zzf());
    }

    private zzgu() {
    }
}
