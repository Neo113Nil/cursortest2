package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzibz extends java.io.Writer {
    private final java.lang.Appendable zza;
    private final com.google.android.gms.internal.ads.zziby zzb = new com.google.android.gms.internal.ads.zziby(null);

    zzibz(java.lang.Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence) throws java.io.IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws java.io.IOException {
    }

    @Override // java.io.Writer
    public final void write(int i) throws java.io.IOException {
        this.zza.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(java.lang.String str, int i, int i2) throws java.io.IOException {
        java.util.Objects.requireNonNull(str);
        this.zza.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        this.zza.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zziby zzibyVar = this.zzb;
        zzibyVar.zza(cArr);
        this.zza.append(zzibyVar, i, i2 + i);
    }
}
