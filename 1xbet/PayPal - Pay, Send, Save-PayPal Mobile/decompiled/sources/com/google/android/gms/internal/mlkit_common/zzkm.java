package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzkm implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzkm zza = new com.google.android.gms.internal.mlkit_common.zzkm();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY);
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("durationMs");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("errorCode");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        builder3.withProperty(zzayVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzkm() {
    }
}
