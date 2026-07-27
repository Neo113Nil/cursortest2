package com.google.android.gms.internal.ads;

import io.ktor.sse.ServerSentEventKt;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzidn implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzicm zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzict zzk;
    private String zzl;

    static {
        for (int i = 0; i <= 31; i++) {
            zzb[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzidn(Writer writer) {
        boolean z = false;
        zzm(6);
        this.zzk = zzict.LEGACY_STRICT;
        this.zzd = (Writer) Objects.requireNonNull(writer, "out == null");
        zzicm zzicmVar = (zzicm) Objects.requireNonNull(zzicm.zza);
        this.zzg = zzicmVar;
        this.zzi = ",";
        if (zzicmVar.zzc()) {
            this.zzh = ": ";
            if (zzicmVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ServerSentEventKt.COLON;
        }
        if (zzicmVar.zza().isEmpty() && zzicmVar.zzb().isEmpty()) {
            z = true;
        }
        this.zzj = z;
    }

    private final zzidn zzk(int i, char c) throws IOException {
        zzs();
        zzm(i);
        this.zzd.write(c);
        return this;
    }

    private final zzidn zzl(int i, int i2, char c) throws IOException {
        int zzn = zzn();
        if (zzn != i2 && zzn != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
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
            this.zze = Arrays.copyOf(iArr, i2 + i2);
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
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i) {
        this.zze[this.zzf - 1] = i;
    }

    private final void zzp() throws IOException {
        if (this.zzl != null) {
            int zzn = zzn();
            if (zzn == 5) {
                this.zzd.write(this.zzi);
            } else if (zzn != 3) {
                throw new IllegalStateException("Nesting problem.");
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
    private final void zzq(String str) throws IOException {
        int i;
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
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

    private final void zzr() throws IOException {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzicm zzicmVar = this.zzg;
        writer.write(zzicmVar.zza());
        int i = this.zzf;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(zzicmVar.zzb());
        }
    }

    private final void zzs() throws IOException {
        int zzn = zzn();
        if (zzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (zzn == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzr();
        } else {
            if (zzn == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (zzn != 6) {
                if (zzn != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzict.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i = this.zzf;
        if (i > 1 || (i == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(zzict zzictVar) {
        this.zzk = (zzict) Objects.requireNonNull(zzictVar);
    }

    public final zzidn zzb() throws IOException {
        zzp();
        zzk(1, AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    public final zzidn zzc() throws IOException {
        zzl(1, 2, AbstractJsonLexerKt.END_LIST);
        return this;
    }

    public final zzidn zzd() throws IOException {
        zzp();
        zzk(3, AbstractJsonLexerKt.BEGIN_OBJ);
        return this;
    }

    public final zzidn zze() throws IOException {
        zzl(3, 5, AbstractJsonLexerKt.END_OBJ);
        return this;
    }

    public final zzidn zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int zzn = zzn();
        if (zzn != 3 && zzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzidn zzg(String str) throws IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzidn zzh(boolean z) throws IOException {
        zzp();
        zzs();
        this.zzd.write(true != z ? "false" : "true");
        return this;
    }

    public final zzidn zzi(Number number) throws IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.zzk != zzict.LENIENT) {
                    String.valueOf(obj);
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(obj)));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(obj).matches()) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(obj).length());
                sb.append("String created by ");
                sb.append(valueOf);
                sb.append(" is not a valid JSON number: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        zzs();
        this.zzd.append((CharSequence) obj);
        return this;
    }

    public final zzidn zzj() throws IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write("null");
        return this;
    }
}
