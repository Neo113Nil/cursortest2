package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzbe implements com.google.firebase.encoders.ObjectEncoderContext {
    private static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("UTF-8");
    private static final com.google.firebase.encoders.FieldDescriptor zzb;
    private static final com.google.firebase.encoders.FieldDescriptor zzc;
    private static final com.google.firebase.encoders.ObjectEncoder zzd;
    private java.io.OutputStream zze;
    private final java.util.Map zzf;
    private final java.util.Map zzg;
    private final com.google.firebase.encoders.ObjectEncoder zzh;
    private final com.google.android.gms.internal.mlkit_common.zzbi zzi = new com.google.android.gms.internal.mlkit_common.zzbi(this);

    static {
        com.google.firebase.encoders.FieldDescriptor.Builder builder = com.google.firebase.encoders.FieldDescriptor.builder("key");
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(1);
        zzb = builder.withProperty(zzayVar.zzb()).build();
        com.google.firebase.encoders.FieldDescriptor.Builder builder2 = com.google.firebase.encoders.FieldDescriptor.builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        com.google.android.gms.internal.mlkit_common.zzay zzayVar2 = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar2.zza(2);
        zzc = builder2.withProperty(zzayVar2.zzb()).build();
        zzd = new com.google.firebase.encoders.ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) {
                com.google.android.gms.internal.mlkit_common.zzbe.zzg((java.util.Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    zzbe(java.io.OutputStream outputStream, java.util.Map map, java.util.Map map2, com.google.firebase.encoders.ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    static /* synthetic */ void zzg(java.util.Map.Entry entry, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) {
        com.google.android.gms.internal.mlkit_common.zzbc zzbcVar = (com.google.android.gms.internal.mlkit_common.zzbc) fieldDescriptor.getProperty(com.google.android.gms.internal.mlkit_common.zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        throw new com.google.firebase.encoders.EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(com.google.firebase.encoders.ObjectEncoder objectEncoder, java.lang.Object obj) throws java.io.IOException {
        com.google.android.gms.internal.mlkit_common.zzaz zzazVar = new com.google.android.gms.internal.mlkit_common.zzaz();
        try {
            java.io.OutputStream outputStream = this.zze;
            this.zze = zzazVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long zza2 = zzazVar.zza();
                zzazVar.close();
                return zza2;
            } catch (java.lang.Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                zzazVar.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static com.google.android.gms.internal.mlkit_common.zzbc zzj(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) {
        com.google.android.gms.internal.mlkit_common.zzbc zzbcVar = (com.google.android.gms.internal.mlkit_common.zzbc) fieldDescriptor.getProperty(com.google.android.gms.internal.mlkit_common.zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        throw new com.google.firebase.encoders.EncodingException("Field has no @Protobuf config");
    }

    private final com.google.android.gms.internal.mlkit_common.zzbe zzk(com.google.firebase.encoders.ObjectEncoder objectEncoder, com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj, boolean z) throws java.io.IOException {
        long zzi = zzi(objectEncoder, obj);
        if (z && zzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(zzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private final com.google.android.gms.internal.mlkit_common.zzbe zzl(com.google.firebase.encoders.ValueEncoder valueEncoder, com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj, boolean z) throws java.io.IOException {
        this.zzi.zza(fieldDescriptor, z);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private static java.nio.ByteBuffer zzm(int i) {
        return java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) throws java.io.IOException {
        while (true) {
            int i2 = i & 127;
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                this.zze.write(i2);
                return;
            } else {
                this.zze.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void zzo(long j) throws java.io.IOException {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.zze.write(i);
                return;
            } else {
                this.zze.write(i | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d) throws java.io.IOException {
        zza(fieldDescriptor, d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext inline(java.lang.Object obj) throws java.io.IOException {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext nested(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) throws java.io.IOException {
        throw new com.google.firebase.encoders.EncodingException("nested() is not implemented for protobuf encoding.");
    }

    final com.google.firebase.encoders.ObjectEncoderContext zza(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d, boolean z) throws java.io.IOException {
        if (z && d == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    final com.google.firebase.encoders.ObjectEncoderContext zzb(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f, boolean z) throws java.io.IOException {
        if (z && f == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    final com.google.firebase.encoders.ObjectEncoderContext zzc(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj, boolean z) throws java.io.IOException {
        if (obj != null) {
            if (obj instanceof java.lang.CharSequence) {
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof java.util.Collection) {
                java.util.Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof java.util.Map) {
                java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, fieldDescriptor, (java.util.Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof java.lang.Double) {
                    zza(fieldDescriptor, ((java.lang.Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof java.lang.Float) {
                    zzb(fieldDescriptor, ((java.lang.Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof java.lang.Number) {
                    zze(fieldDescriptor, ((java.lang.Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof java.lang.Boolean) {
                    zzd(fieldDescriptor, ((java.lang.Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    com.google.firebase.encoders.ObjectEncoder objectEncoder = (com.google.firebase.encoders.ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        zzk(objectEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    com.google.firebase.encoders.ValueEncoder valueEncoder = (com.google.firebase.encoders.ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    if (obj instanceof com.google.android.gms.internal.mlkit_common.zzba) {
                        zzd(fieldDescriptor, ((com.google.android.gms.internal.mlkit_common.zzba) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof java.lang.Enum) {
                        zzd(fieldDescriptor, ((java.lang.Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final com.google.android.gms.internal.mlkit_common.zzbe zzd(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i, boolean z) throws java.io.IOException {
        if (!z || i != 0) {
            com.google.android.gms.internal.mlkit_common.zzbc zzj = zzj(fieldDescriptor);
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzn(i);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    final com.google.android.gms.internal.mlkit_common.zzbe zze(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j, boolean z) throws java.io.IOException {
        if (!z || j != 0) {
            com.google.android.gms.internal.mlkit_common.zzbc zzj = zzj(fieldDescriptor);
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzo(j);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    final com.google.android.gms.internal.mlkit_common.zzbe zzf(java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            return this;
        }
        com.google.firebase.encoders.ObjectEncoder objectEncoder = (com.google.firebase.encoders.ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new com.google.firebase.encoders.EncodingException("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f) throws java.io.IOException {
        zzb(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException {
        return nested(com.google.firebase.encoders.FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i) throws java.io.IOException {
        zzd(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j) throws java.io.IOException {
        zze(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj) throws java.io.IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) throws java.io.IOException {
        zzd(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, double d) throws java.io.IOException {
        zza(com.google.firebase.encoders.FieldDescriptor.of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, int i) throws java.io.IOException {
        zzd(com.google.firebase.encoders.FieldDescriptor.of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, long j) throws java.io.IOException {
        zze(com.google.firebase.encoders.FieldDescriptor.of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        zzc(com.google.firebase.encoders.FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, boolean z) throws java.io.IOException {
        zzd(com.google.firebase.encoders.FieldDescriptor.of(str), z ? 1 : 0, true);
        return this;
    }
}
