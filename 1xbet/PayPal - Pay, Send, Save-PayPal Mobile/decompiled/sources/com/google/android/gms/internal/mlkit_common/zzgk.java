package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzgk implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzgk zza = new com.google.android.gms.internal.mlkit_common.zzgk();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest);
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        objectEncoderContext.add(zzb, ((com.google.android.gms.internal.mlkit_common.zzmp) obj).zza());
    }

    private zzgk() {
    }
}
