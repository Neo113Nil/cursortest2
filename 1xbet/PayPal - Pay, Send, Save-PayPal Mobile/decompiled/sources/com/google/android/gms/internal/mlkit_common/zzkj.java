package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzkj implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzkj zza = new com.google.android.gms.internal.mlkit_common.zzkj();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("detectionType");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzkj() {
    }
}
