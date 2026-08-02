package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzka implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzka zza = new com.google.android.gms.internal.mlkit_common.zzka();

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("errorCode");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzka() {
    }
}
