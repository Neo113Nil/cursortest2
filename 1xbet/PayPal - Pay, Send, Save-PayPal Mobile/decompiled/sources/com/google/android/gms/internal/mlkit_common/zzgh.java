package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzgh implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzgh zza = new com.google.android.gms.internal.mlkit_common.zzgh();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("modelType");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("isDownloaded");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        zzc = builder2.withProperty(zzayVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("modelName");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar3 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar3.zza(3);
        zzd = builder3.withProperty(zzayVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_common.zzmj zzmjVar = (com.google.android.gms.internal.mlkit_common.zzmj) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmjVar.zza());
        objectEncoderContext2.add(zzc, zzmjVar.zzb());
        objectEncoderContext2.add(zzd, (java.lang.Object) null);
    }

    private zzgh() {
    }
}
