package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzcc implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzcc zza = new com.google.android.gms.internal.mlkit_vision_common.zzcc();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("logEventKey");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("eventCount");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar2 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("inferenceDurationStats");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar3 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar3.zza(3);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw null;
    }

    private zzcc() {
    }
}
