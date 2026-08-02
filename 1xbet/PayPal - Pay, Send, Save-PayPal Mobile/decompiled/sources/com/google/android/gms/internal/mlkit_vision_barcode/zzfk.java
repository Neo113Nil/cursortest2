package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzfk implements com.google.firebase.encoders.ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private com.google.firebase.encoders.FieldDescriptor zzc;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzfg zzd;

    private final void zzb() {
        if (this.zza) {
            throw new com.google.firebase.encoders.EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(double d) throws java.io.IOException {
        zzb();
        this.zzd.zza(this.zzc, d, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(float f) throws java.io.IOException {
        zzb();
        this.zzd.zzb(this.zzc, f, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(int i) throws java.io.IOException {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(long j) throws java.io.IOException {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(java.lang.String str) throws java.io.IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(boolean z) throws java.io.IOException {
        zzb();
        this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final com.google.firebase.encoders.ValueEncoderContext add(byte[] bArr) throws java.io.IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }

    final void zza(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z;
    }

    zzfk(com.google.android.gms.internal.mlkit_vision_barcode.zzfg zzfgVar) {
        this.zzd = zzfgVar;
    }
}
