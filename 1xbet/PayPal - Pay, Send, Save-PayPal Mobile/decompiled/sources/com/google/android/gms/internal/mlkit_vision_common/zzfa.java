package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzfa implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzfa zza = new com.google.android.gms.internal.mlkit_vision_common.zzfa();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("errorCode");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzfa() {
    }
}
