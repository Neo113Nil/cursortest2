package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzfk implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzfk zza = new com.google.android.gms.internal.mlkit_vision_common.zzfk();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("inferenceCommonLogEvent");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("imageInfo");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar2 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("captionCount");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar3 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar3.zza(4);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("highestScore");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar4 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar4.zza(5);
        zze = builder4.withProperty(zzaeVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("imageType");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar5 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar5.zza(6);
        zzf = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzfk() {
    }
}
