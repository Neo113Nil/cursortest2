package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzju implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzju zza = new com.google.android.gms.internal.mlkit_common.zzju();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("deviceInfo");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("nnapiInfo");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("gpuInfo");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        builder3.withProperty(zzayVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("pipelineIdentifier");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar4 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar4.zza(4);
        builder4.withProperty(zzayVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("acceptedConfigurations");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar5 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar5.zza(5);
        builder5.withProperty(zzayVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("action");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar6 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar6.zza(6);
        builder6.withProperty(zzayVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder("status");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar7 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar7.zza(7);
        builder7.withProperty(zzayVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("customErrors");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar8 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar8.zza(8);
        builder8.withProperty(zzayVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("benchmarkStatus");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar9 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar9.zza(9);
        builder9.withProperty(zzayVar9.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder10 = com.google.firebase.encoders.FieldDescriptor.builder("validationTestResult");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar10 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar10.zza(10);
        builder10.withProperty(zzayVar10.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder11 = com.google.firebase.encoders.FieldDescriptor.builder("timestampUs");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar11 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar11.zza(11);
        builder11.withProperty(zzayVar11.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder12 = com.google.firebase.encoders.FieldDescriptor.builder("elapsedUs");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar12 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar12.zza(12);
        builder12.withProperty(zzayVar12.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzju() {
    }
}
