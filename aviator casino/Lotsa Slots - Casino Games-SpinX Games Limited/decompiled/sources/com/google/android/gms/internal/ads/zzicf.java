package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzicf implements java.io.Closeable, java.io.Flushable {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final java.lang.String[] zzb = new java.lang.String[128];
    private static final java.lang.String[] zzc;
    private final java.io.Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final com.google.android.gms.internal.ads.zzibe zzg;
    private final java.lang.String zzh;
    private java.lang.String zzi;
    private final boolean zzj;
    private com.google.android.gms.internal.ads.zzibl zzk;
    private java.lang.String zzl;

    static {
        for (int i = 0; i <= 31; i++) {
            zzb[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzicf(java.io.Writer writer) {
        boolean z = false;
        zzm(6);
        this.zzk = com.google.android.gms.internal.ads.zzibl.LEGACY_STRICT;
        this.zzd = (java.io.Writer) java.util.Objects.requireNonNull(writer, "out == null");
        com.google.android.gms.internal.ads.zzibe zzibeVar = (com.google.android.gms.internal.ads.zzibe) java.util.Objects.requireNonNull(com.google.android.gms.internal.ads.zzibe.zza);
        this.zzg = zzibeVar;
        this.zzi = ",";
        if (zzibeVar.zzc()) {
            this.zzh = ": ";
            if (zzibeVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        if (zzibeVar.zza().isEmpty() && zzibeVar.zzb().isEmpty()) {
            z = true;
        }
        this.zzj = z;
    }

    private final com.google.android.gms.internal.ads.zzicf zzk(int i, char c) throws java.io.IOException {
        zzs();
        zzm(i);
        this.zzd.write(c);
        return this;
    }

    private final com.google.android.gms.internal.ads.zzicf zzl(int i, int i2, char c) throws java.io.IOException {
        int zzn = zzn();
        if (zzn != i2 && zzn != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        java.lang.String str = this.zzl;
        if (str != null) {
            throw new java.lang.IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (zzn == i2) {
            zzr();
        }
        this.zzd.write(c);
        return this;
    }

    private final void zzm(int i) {
        int i2 = this.zzf;
        int[] iArr = this.zze;
        if (i2 == iArr.length) {
            this.zze = java.util.Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.zze;
        int i3 = this.zzf;
        this.zzf = i3 + 1;
        iArr2[i3] = i;
    }

    private final int zzn() {
        int i = this.zzf;
        if (i != 0) {
            return this.zze[i - 1];
        }
        throw new java.lang.IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i) {
        this.zze[this.zzf - 1] = i;
    }

    private final void zzp() throws java.io.IOException {
        if (this.zzl != null) {
            int zzn = zzn();
            if (zzn == 5) {
                this.zzd.write(this.zzi);
            } else if (zzn != 3) {
                throw new java.lang.IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq(java.lang.String str) throws java.io.IOException {
        int i;
        java.lang.String str2;
        java.io.Writer writer = this.zzd;
        java.lang.String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i3 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i3;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i3;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    private final void zzr() throws java.io.IOException {
        if (this.zzj) {
            return;
        }
        java.io.Writer writer = this.zzd;
        com.google.android.gms.internal.ads.zzibe zzibeVar = this.zzg;
        writer.write(zzibeVar.zza());
        int i = this.zzf;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(zzibeVar.zzb());
        }
    }

    private final void zzs() throws java.io.IOException {
        int zzn = zzn();
        if (zzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (zzn == 2) {
            this.zzd.append((java.lang.CharSequence) this.zzi);
            zzr();
        } else {
            if (zzn == 4) {
                this.zzd.append((java.lang.CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (zzn != 6) {
                if (zzn != 7) {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
                if (this.zzk != com.google.android.gms.internal.ads.zzibl.LENIENT) {
                    throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zzd.close();
        int i = this.zzf;
        if (i > 1 || (i == 1 && this.zze[0] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.zzf == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(com.google.android.gms.internal.ads.zzibl zziblVar) {
        this.zzk = (com.google.android.gms.internal.ads.zzibl) java.util.Objects.requireNonNull(zziblVar);
    }

    public final com.google.android.gms.internal.ads.zzicf zzb() throws java.io.IOException {
        zzp();
        zzk(1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzc() throws java.io.IOException {
        zzl(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzd() throws java.io.IOException {
        zzp();
        zzk(3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zze() throws java.io.IOException {
        zzl(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzf(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new java.lang.IllegalStateException("Already wrote a name, expecting a value.");
        }
        int zzn = zzn();
        if (zzn != 3 && zzn != 5) {
            throw new java.lang.IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzg(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzh(boolean z) throws java.io.IOException {
        zzp();
        zzs();
        this.zzd.write(true != z ? "false" : "true");
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzi(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        java.lang.String obj = number.toString();
        java.lang.Class<?> cls = number.getClass();
        if (cls != java.lang.Integer.class && cls != java.lang.Long.class && cls != java.lang.Byte.class && cls != java.lang.Short.class && cls != java.math.BigDecimal.class && cls != java.math.BigInteger.class && cls != java.util.concurrent.atomic.AtomicInteger.class && cls != java.util.concurrent.atomic.AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.zzk != com.google.android.gms.internal.ads.zzibl.LENIENT) {
                    java.lang.String.valueOf(obj);
                    throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(obj)));
                }
            } else if (cls != java.lang.Float.class && cls != java.lang.Double.class && !zza.matcher(obj).matches()) {
                java.lang.String valueOf = java.lang.String.valueOf(cls);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47 + java.lang.String.valueOf(obj).length());
                sb.append("String created by ");
                sb.append(valueOf);
                sb.append(" is not a valid JSON number: ");
                sb.append(obj);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        zzs();
        this.zzd.append((java.lang.CharSequence) obj);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzicf zzj() throws java.io.IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        return this;
    }
}
