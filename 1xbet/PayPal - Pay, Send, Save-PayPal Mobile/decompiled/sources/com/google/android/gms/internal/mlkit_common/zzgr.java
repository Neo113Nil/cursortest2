package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzgr implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzgr zza = new com.google.android.gms.internal.mlkit_common.zzgr();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;
    private static final com.google.firebase.encoders.FieldDescriptor zzg;
    private static final com.google.firebase.encoders.FieldDescriptor zzh;
    private static final com.google.firebase.encoders.FieldDescriptor zzi;
    private static final com.google.firebase.encoders.FieldDescriptor zzj;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("name");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("version");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        zzc = builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("source");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        zzd = builder3.withProperty(zzayVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("uri");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar4 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar4.zza(4);
        zze = builder4.withProperty(zzayVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("hash");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar5 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar5.zza(5);
        zzf = builder5.withProperty(zzayVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("modelType");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar6 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar6.zza(6);
        zzg = builder6.withProperty(zzayVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder(io.ktor.http.ContentDisposition.Parameters.Size);
        com.google.android.gms.internal.mlkit_common.zzay zzayVar7 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar7.zza(7);
        zzh = builder7.withProperty(zzayVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("hasLabelMap");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar8 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar8.zza(8);
        zzi = builder8.withProperty(zzayVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("isManifestModel");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar9 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar9.zza(9);
        zzj = builder9.withProperty(zzayVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_common.zznh zznhVar = (com.google.android.gms.internal.mlkit_common.zznh) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznhVar.zzd());
        objectEncoderContext2.add(zzc, (java.lang.Object) null);
        objectEncoderContext2.add(zzd, zznhVar.zzb());
        objectEncoderContext2.add(zze, (java.lang.Object) null);
        objectEncoderContext2.add(zzf, zznhVar.zzc());
        objectEncoderContext2.add(zzg, zznhVar.zza());
        objectEncoderContext2.add(zzh, (java.lang.Object) null);
        objectEncoderContext2.add(zzi, (java.lang.Object) null);
        objectEncoderContext2.add(zzj, (java.lang.Object) null);
    }

    private zzgr() {
    }
}
