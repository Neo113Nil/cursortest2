package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzej implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_common.zzej zza = new com.google.android.gms.internal.mlkit_vision_common.zzej();
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.FieldDescriptor zzd;
    private static final com.google.firebase.encoders.FieldDescriptor zze;
    private static final com.google.firebase.encoders.FieldDescriptor zzf;
    private static final com.google.firebase.encoders.FieldDescriptor zzg;
    private static final com.google.firebase.encoders.FieldDescriptor zzh;

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("durationMs");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder("imageSource");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar2 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder3 = com.google.firebase.encoders.FieldDescriptor.builder("imageFormat");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar3 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar3.zza(3);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder4 = com.google.firebase.encoders.FieldDescriptor.builder("imageByteSize");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar4 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar4.zza(4);
        zze = builder4.withProperty(zzaeVar4.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder5 = com.google.firebase.encoders.FieldDescriptor.builder("imageWidth");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar5 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar5.zza(5);
        zzf = builder5.withProperty(zzaeVar5.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder6 = com.google.firebase.encoders.FieldDescriptor.builder("imageHeight");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar6 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar6.zza(6);
        zzg = builder6.withProperty(zzaeVar6.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder7 = com.google.firebase.encoders.FieldDescriptor.builder("rotationDegrees");
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar7 = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar7.zza(7);
        zzh = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_vision_common.zziq zziqVar = (com.google.android.gms.internal.mlkit_vision_common.zziq) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zziqVar.zzg());
        objectEncoderContext2.add(zzc, zziqVar.zzb());
        objectEncoderContext2.add(zzd, zziqVar.zza());
        objectEncoderContext2.add(zze, zziqVar.zzc());
        objectEncoderContext2.add(zzf, zziqVar.zze());
        objectEncoderContext2.add(zzg, zziqVar.zzd());
        objectEncoderContext2.add(zzh, zziqVar.zzf());
    }

    private zzej() {
    }
}
