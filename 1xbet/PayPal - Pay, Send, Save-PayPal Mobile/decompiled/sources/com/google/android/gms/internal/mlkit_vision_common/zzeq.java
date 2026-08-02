package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzeq implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzeq zza = new com.google.android.gms.internal.mlkit_vision_common.zzeq();
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
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("version");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar2 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("source");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar3 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar3.zza(3);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("uri");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar4 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar4.zza(4);
        zze = builder4.withProperty(zzaeVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("hash");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar5 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar5.zza(5);
        zzf = builder5.withProperty(zzaeVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("modelType");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar6 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar6.zza(6);
        zzg = builder6.withProperty(zzaeVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder(io.ktor.http.ContentDisposition.Parameters.Size);
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar7 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar7.zza(7);
        zzh = builder7.withProperty(zzaeVar7.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder8 = com.google.firebase.encoders.FieldDescriptor.builder("hasLabelMap");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar8 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar8.zza(8);
        zzi = builder8.withProperty(zzaeVar8.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder9 = com.google.firebase.encoders.FieldDescriptor.builder("isManifestModel");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar9 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar9.zza(9);
        zzj = builder9.withProperty(zzaeVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzeq() {
    }
}
