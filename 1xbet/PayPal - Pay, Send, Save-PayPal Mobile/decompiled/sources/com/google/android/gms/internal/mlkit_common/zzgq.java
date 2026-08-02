package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzgq implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzgq zza = new com.google.android.gms.internal.mlkit_common.zzgq();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;
    private static final com.google.firebase.encoders.FieldDescriptor zzg;
    private static final com.google.firebase.encoders.FieldDescriptor zzh;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("options");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("roughDownloadDurationMs");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        zzc = builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("errorCode");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        zzd = builder3.withProperty(zzayVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("exactDownloadDurationMs");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar4 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar4.zza(4);
        zze = builder4.withProperty(zzayVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("downloadStatus");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar5 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar5.zza(5);
        zzf = builder5.withProperty(zzayVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("downloadFailureStatus");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar6 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar6.zza(6);
        zzg = builder6.withProperty(zzayVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder("mddDownloadErrorCodes");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar7 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar7.zza(7);
        zzh = builder7.withProperty(zzayVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_common.zznc zzncVar = (com.google.android.gms.internal.mlkit_common.zznc) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzncVar.zzc());
        objectEncoderContext2.add(zzc, zzncVar.zzf());
        objectEncoderContext2.add(zzd, zzncVar.zza());
        objectEncoderContext2.add(zze, zzncVar.zze());
        objectEncoderContext2.add(zzf, zzncVar.zzb());
        objectEncoderContext2.add(zzg, zzncVar.zzd());
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
    }

    private zzgq() {
    }
}
