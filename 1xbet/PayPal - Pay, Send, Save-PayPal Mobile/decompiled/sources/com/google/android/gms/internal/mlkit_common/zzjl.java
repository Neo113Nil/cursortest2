package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzjl implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzjl zza = new com.google.android.gms.internal.mlkit_common.zzjl();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("inferenceCommonLogEvent");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("imageInfo");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("subjectSegmenterOptions");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        builder3.withProperty(zzayVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("subjectInfos");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar4 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar4.zza(4);
        builder4.withProperty(zzayVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("qualityScores");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar5 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar5.zza(5);
        builder5.withProperty(zzayVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzjl() {
    }
}
