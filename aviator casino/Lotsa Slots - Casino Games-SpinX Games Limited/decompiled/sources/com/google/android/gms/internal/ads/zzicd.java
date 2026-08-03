package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzicd implements java.io.Closeable {
    private final java.io.Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private java.lang.String[] zzm;
    private int[] zzn;
    private com.google.android.gms.internal.ads.zzibl zzc = com.google.android.gms.internal.ads.zzibl.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        com.google.android.gms.internal.ads.zzibn.zza = new com.google.android.gms.internal.ads.zzicc();
    }

    public zzicd(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new java.lang.String[32];
        this.zzn = new int[32];
        this.zzb = (java.io.Reader) java.util.Objects.requireNonNull(reader, "in == null");
    }

    private final boolean zzn(char c) throws java.io.IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String zzo(char c) throws java.io.IOException {
        int i;
        java.lang.StringBuilder sb = null;
        loop0: do {
            int i2 = this.zze;
            int i3 = this.zzf;
            int i4 = i2;
            while (true) {
                char[] cArr = this.zzd;
                if (i2 >= i3) {
                    break;
                }
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                com.google.android.gms.internal.ads.zzibl zziblVar = this.zzc;
                com.google.android.gms.internal.ads.zzibl zziblVar2 = com.google.android.gms.internal.ads.zzibl.STRICT;
                if (zziblVar == zziblVar2 && c2 < ' ') {
                    throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if (c2 == c) {
                    int i6 = (i5 - i4) - 1;
                    this.zze = i5;
                    if (sb == null) {
                        return new java.lang.String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = '\n';
                if (c2 == '\\') {
                    int i7 = i5 - i4;
                    int i8 = i7 - 1;
                    this.zze = i5;
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i4, i8);
                    if (this.zze == this.zzf && !zzr(1)) {
                        throw zzv("Unterminated escape sequence");
                    }
                    int i9 = this.zze;
                    int i10 = i9 + 1;
                    this.zze = i10;
                    char c4 = cArr[i9];
                    if (c4 != '\n') {
                        if (c4 != '\"') {
                            if (c4 != '\'') {
                                if (c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                    } else if (c4 == 'f') {
                                        c3 = '\f';
                                    } else if (c4 != 'n') {
                                        if (c4 == 'r') {
                                            c3 = '\r';
                                        } else if (c4 == 't') {
                                            c3 = '\t';
                                        } else {
                                            if (c4 != 'u') {
                                                throw zzv("Invalid escape sequence");
                                            }
                                            if (i9 + 5 > this.zzf && !zzr(4)) {
                                                throw zzv("Unterminated escape sequence");
                                            }
                                            int i11 = this.zze;
                                            int i12 = i11 + 4;
                                            int i13 = 0;
                                            while (i11 < i12) {
                                                int i14 = i13 << 4;
                                                char c5 = cArr[i11];
                                                if (c5 >= '0' && c5 <= '9') {
                                                    i = c5 - '0';
                                                } else if (c5 >= 'a' && c5 <= 'f') {
                                                    i = c5 - 'W';
                                                } else {
                                                    if (c5 < 'A' || c5 > 'F') {
                                                        break loop0;
                                                    }
                                                    i = c5 - '7';
                                                }
                                                i13 = i14 + i;
                                                i11++;
                                            }
                                            this.zze += 4;
                                            c3 = (char) i13;
                                        }
                                    }
                                    sb.append(c3);
                                    i4 = this.zze;
                                    i3 = this.zzf;
                                    i2 = i4;
                                }
                            }
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.zze;
                        i3 = this.zzf;
                        i2 = i4;
                    } else {
                        if (this.zzc == zziblVar2) {
                            throw zzv("Cannot escape a newline character in strict mode");
                        }
                        this.zzg++;
                        this.zzh = i10;
                    }
                    if (this.zzc == zziblVar2) {
                        throw zzv("Invalid escaped character \"'\" in strict mode");
                    }
                    c3 = c4;
                    sb.append(c3);
                    i4 = this.zze;
                    i3 = this.zzf;
                    i2 = i4;
                } else {
                    if (c2 == '\n') {
                        this.zzg++;
                        this.zzh = i5;
                    }
                    i2 = i5;
                }
            }
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String zzp() throws java.io.IOException {
        java.lang.String sb;
        int i = 0;
        java.lang.StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.zze + i2;
                if (i3 < this.zzf) {
                    char c = this.zzd[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb2.append(this.zzd, this.zze, i2);
                    this.zze += i2;
                } else if (zzr(i2 + 1)) {
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new java.lang.String(this.zzd, this.zze, i);
            } else {
                sb2.append(this.zzd, this.zze, i);
                sb = sb2.toString();
            }
            this.zze += i;
            return sb;
        } while (zzr(1));
        if (sb2 != null) {
        }
        this.zze += i;
        return sb;
    }

    private final void zzq(int i) throws com.google.android.gms.internal.ads.zzicg {
        int i2 = this.zzl;
        if (i2 - 1 >= 1280) {
            java.lang.String zzl = zzl();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zzl.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(zzl);
            throw new com.google.android.gms.internal.ads.zzicg(sb.toString());
        }
        int[] iArr = this.zzk;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzk = java.util.Arrays.copyOf(iArr, i3);
            this.zzn = java.util.Arrays.copyOf(this.zzn, i3);
            this.zzm = (java.lang.String[]) java.util.Arrays.copyOf(this.zzm, i3);
        }
        int[] iArr2 = this.zzk;
        int i4 = this.zzl;
        this.zzl = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzr(int i) throws java.io.IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zze;
        this.zzh = i3 - i4;
        char[] cArr = this.zzd;
        int i5 = this.zzf;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zzf = i6;
            java.lang.System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            java.io.Reader reader = this.zzb;
            int i7 = this.zzf;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zzf + read;
            this.zzf = i2;
            if (this.zzg == 0 && this.zzh == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final int zzs(boolean z) throws java.io.IOException {
        int i;
        int i2 = this.zze;
        int i3 = this.zzf;
        while (true) {
            if (i2 == i3) {
                this.zze = i2;
                if (!zzr(1)) {
                    if (z) {
                        throw new java.io.EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i2 = this.zze;
                i3 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zze = i4;
                    if (i4 == i3) {
                        this.zze = i2;
                        boolean zzr = zzr(2);
                        this.zze++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i5 = this.zze;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.zze = i5 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i6 = this.zze;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.zze + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.zze + 2;
                                i3 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i6 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.zze = i5 + 1;
                        zzu();
                        i2 = this.zze;
                        i3 = this.zzf;
                    }
                } else {
                    if (c != '#') {
                        this.zze = i4;
                        return c;
                    }
                    this.zze = i4;
                    zzt();
                    zzu();
                    i2 = this.zze;
                    i3 = this.zzf;
                }
            }
            i2 = i4;
        }
    }

    private final void zzt() throws com.google.android.gms.internal.ads.zzicg {
        if (this.zzc != com.google.android.gms.internal.ads.zzibl.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws java.io.IOException {
        char c;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            c = cArr[i];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i2;
                return;
            }
        } while (c != '\r');
    }

    private final com.google.android.gms.internal.ads.zzicg zzv(java.lang.String str) throws com.google.android.gms.internal.ads.zzicg {
        java.lang.String zzl = zzl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + zzl.length() + 79);
        sb.append(str);
        sb.append(zzl);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new com.google.android.gms.internal.ads.zzicg(sb.toString());
    }

    private final java.lang.IllegalStateException zzw(java.lang.String str) throws java.io.IOException {
        int zzm = zzm();
        java.lang.String zza = com.google.android.gms.internal.ads.zzice.zza(zzm());
        java.lang.String zzl = zzl();
        int length = str.length() + 18 + zza.length() + zzl.length();
        java.lang.String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(zzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 5 + concat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(zza);
        sb.append(zzl);
        sb.append("\nSee ");
        sb.append(concat);
        return new java.lang.IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.String zzl = zzl();
        java.lang.String.valueOf(simpleName);
        return java.lang.String.valueOf(simpleName).concat(zzl);
    }

    public final void zza(com.google.android.gms.internal.ads.zzibl zziblVar) {
        java.util.Objects.requireNonNull(zziblVar);
        this.zzc = zziblVar;
    }

    public final void zzb() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0211, code lost:
    
        if (zzn(r1) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x029d, code lost:
    
        if (r4 == 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a0, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0214, code lost:
    
        if (r9 != 2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0216, code lost:
    
        if (r15 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021c, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021e, code lost:
    
        if (r16 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0227, code lost:
    
        if (r11 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0229, code lost:
    
        if (r14 != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022f, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0230, code lost:
    
        r21.zzi = r11;
        r21.zze += r10;
        r21.zza = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022c, code lost:
    
        if (r14 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0221, code lost:
    
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023e, code lost:
    
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0240, code lost:
    
        if (r9 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r9 == 4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r9 != 7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r21.zzj = r10;
        r14 = 16;
        r21.zza = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0299 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzg() throws java.io.IOException {
        int zzs;
        int zzs2;
        java.lang.String str;
        java.lang.String str2;
        int i;
        char c;
        long j;
        int i2;
        int[] iArr = this.zzk;
        int i3 = this.zzl - 1;
        int i4 = iArr[i3];
        int i5 = 3;
        boolean z = true;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 5) {
                    iArr[i3] = 4;
                    if (i4 == 5 && (zzs = zzs(true)) != 44) {
                        if (zzs != 59) {
                            if (zzs != 125) {
                                throw zzv("Unterminated object");
                            }
                            i5 = 2;
                        } else {
                            zzt();
                        }
                    }
                    int zzs3 = zzs(true);
                    if (zzs3 == 34) {
                        i5 = 13;
                    } else {
                        if (zzs3 == 39) {
                            zzt();
                            this.zza = 12;
                            return 12;
                        }
                        if (zzs3 != 125) {
                            zzt();
                            this.zze--;
                            if (!zzn((char) zzs3)) {
                                throw zzv("Expected name");
                            }
                            i5 = 14;
                        } else {
                            if (i4 == 5) {
                                throw zzv("Expected name");
                            }
                            i5 = 2;
                        }
                    }
                } else if (i4 == 4) {
                    iArr[i3] = 5;
                    int zzs4 = zzs(true);
                    if (zzs4 != 58) {
                        if (zzs4 != 61) {
                            throw zzv("Expected ':'");
                        }
                        zzt();
                        if (this.zze < this.zzf || zzr(1)) {
                            char[] cArr = this.zzd;
                            int i6 = this.zze;
                            if (cArr[i6] == '>') {
                                this.zze = i6 + 1;
                            }
                        }
                    }
                } else if (i4 == 6) {
                    if (this.zzc == com.google.android.gms.internal.ads.zzibl.LENIENT) {
                        zzs(true);
                        int i7 = this.zze;
                        this.zze = i7 - 1;
                        if (i7 + 4 <= this.zzf || zzr(5)) {
                            int i8 = this.zze;
                            char[] cArr2 = this.zzd;
                            if (cArr2[i8] == ')' && cArr2[i8 + 1] == ']' && cArr2[i8 + 2] == '}' && cArr2[i8 + 3] == '\'' && cArr2[i8 + 4] == '\n') {
                                this.zze = i8 + 5;
                            }
                        }
                    }
                    this.zzk[this.zzl - 1] = 7;
                } else {
                    if (i4 == 7) {
                        if (zzs(false) == -1) {
                            i5 = 17;
                        } else {
                            zzt();
                            this.zze--;
                        }
                    } else if (i4 == 8) {
                        throw new java.lang.IllegalStateException("JsonReader is closed");
                    }
                    zzs2 = zzs(true);
                    if (zzs2 == 34) {
                        if (zzs2 == 39) {
                            zzt();
                            this.zza = 8;
                            return 8;
                        }
                        if (zzs2 != 44 && zzs2 != 59) {
                            if (zzs2 != 91) {
                                if (zzs2 != 93) {
                                    if (zzs2 != 123) {
                                        int i9 = this.zze - 1;
                                        this.zze = i9;
                                        char[] cArr3 = this.zzd;
                                        char c2 = cArr3[i9];
                                        if (c2 == 't' || c2 == 'T') {
                                            str = "TRUE";
                                            str2 = "true";
                                            i = 5;
                                        } else if (c2 == 'f' || c2 == 'F') {
                                            str = "FALSE";
                                            str2 = "false";
                                            i = 6;
                                        } else {
                                            if (c2 == 'n' || c2 == 'N') {
                                                str = "NULL";
                                                str2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
                                                i = 7;
                                            }
                                            i = 0;
                                            if (i == 0) {
                                                return i;
                                            }
                                            int i10 = this.zze;
                                            int i11 = this.zzf;
                                            long j2 = 0;
                                            long j3 = 0;
                                            char c3 = 0;
                                            int i12 = 0;
                                            boolean z2 = true;
                                            boolean z3 = false;
                                            while (true) {
                                                if (i10 + i12 == i11) {
                                                    if (i12 == 1024) {
                                                        break;
                                                    }
                                                    if (!zzr(i12 + 1)) {
                                                        break;
                                                    }
                                                    int i13 = this.zze;
                                                    i11 = this.zzf;
                                                    i10 = i13;
                                                }
                                                char c4 = cArr3[i10 + i12];
                                                if (c4 != '+') {
                                                    if (c4 == 'E' || c4 == 'e') {
                                                        j = j2;
                                                        if (c3 != 2 && c3 != 4) {
                                                            break;
                                                        }
                                                        c3 = 5;
                                                        i12++;
                                                        j2 = j;
                                                    } else if (c4 == '-') {
                                                        j = j2;
                                                        if (c3 == 0) {
                                                            c3 = 1;
                                                            z3 = true;
                                                            i12++;
                                                            j2 = j;
                                                        } else {
                                                            if (c3 != 5) {
                                                                break;
                                                            }
                                                            c3 = 6;
                                                            i12++;
                                                            j2 = j;
                                                        }
                                                    } else if (c4 == '.') {
                                                        j = j2;
                                                        if (c3 != 2) {
                                                            break;
                                                        }
                                                        c3 = 3;
                                                        i12++;
                                                        j2 = j;
                                                    } else {
                                                        if (c4 < '0' || c4 > '9') {
                                                            break;
                                                        }
                                                        if (c3 == 1 || c3 == 0) {
                                                            j3 = -(c4 - '0');
                                                            c3 = 2;
                                                        } else if (c3 == 2) {
                                                            if (j3 == j2) {
                                                                break;
                                                            }
                                                            long j4 = (10 * j3) - (c4 - '0');
                                                            z2 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                            j3 = j4;
                                                        } else if (c3 == 3) {
                                                            c3 = 4;
                                                        } else if (c3 == 5 || c3 == 6) {
                                                            c3 = 7;
                                                        }
                                                        j = 0;
                                                        i12++;
                                                        j2 = j;
                                                    }
                                                    if (i2 == 0) {
                                                        return i2;
                                                    }
                                                    if (!zzn(cArr3[this.zze])) {
                                                        throw zzv("Expected value");
                                                    }
                                                    zzt();
                                                    this.zza = 10;
                                                    return 10;
                                                }
                                                j = j2;
                                                if (c3 != 5) {
                                                    break;
                                                }
                                                c3 = 6;
                                                i12++;
                                                j2 = j;
                                            }
                                            i2 = 0;
                                            if (i2 == 0) {
                                            }
                                        }
                                        com.google.android.gms.internal.ads.zzibl zziblVar = this.zzc;
                                        com.google.android.gms.internal.ads.zzibl zziblVar2 = com.google.android.gms.internal.ads.zzibl.STRICT;
                                        int i14 = 0;
                                        while (true) {
                                            int length = str2.length();
                                            if (i14 < length) {
                                                if ((this.zze + i14 >= this.zzf && !zzr(i14 + 1)) || ((c = cArr3[this.zze + i14]) != str2.charAt(i14) && (zziblVar == zziblVar2 || c != str.charAt(i14)))) {
                                                    break;
                                                }
                                                i14++;
                                            } else if ((this.zze + length >= this.zzf && !zzr(length + 1)) || !zzn(cArr3[this.zze + length])) {
                                                this.zze += length;
                                                this.zza = i;
                                            }
                                        }
                                        i = 0;
                                        if (i == 0) {
                                        }
                                    } else {
                                        i5 = 1;
                                    }
                                }
                            }
                        }
                        if (i4 != 1 && i4 != 2) {
                            throw zzv("Unexpected value");
                        }
                        zzt();
                        this.zze--;
                        this.zza = 7;
                        return 7;
                    }
                    i5 = 9;
                }
                this.zza = i5;
                return i5;
            }
            int zzs5 = zzs(true);
            if (zzs5 != 44) {
                if (zzs5 != 59) {
                    if (zzs5 != 93) {
                        throw zzv("Unterminated array");
                    }
                    i5 = 4;
                    this.zza = i5;
                    return i5;
                }
                zzt();
            }
        }
        zzs2 = zzs(true);
        if (zzs2 == 34) {
        }
        this.zza = i5;
        return i5;
    }

    public final java.lang.String zzh() throws java.io.IOException {
        java.lang.String zzo;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 14) {
            zzo = zzp();
        } else if (i == 12) {
            zzo = zzo('\'');
        } else {
            if (i != 13) {
                throw zzw("a name");
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = zzo;
        return zzo;
    }

    public final java.lang.String zzi() throws java.io.IOException {
        java.lang.String str;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 10) {
            str = zzp();
        } else if (i == 8) {
            str = zzo('\'');
        } else if (i == 9) {
            str = zzo('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = java.lang.Long.toString(this.zzi);
        } else {
            if (i != 16) {
                throw zzw("a string");
            }
            java.lang.String str2 = new java.lang.String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            str = str2;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean zzj() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 7) {
            throw zzw(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    final java.lang.String zzl() {
        int i = this.zzg + 1;
        int i2 = this.zze - this.zzh;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        for (int i3 = 0; i3 < this.zzl; i3++) {
            int i4 = this.zzk[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.zzn[i3];
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i5);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    java.lang.String str = this.zzm[i3];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i4);
                    throw new java.lang.AssertionError(sb2.toString());
            }
        }
        int i6 = i2 + 1;
        java.lang.String sb3 = sb.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17 + java.lang.String.valueOf(i6).length() + 6 + sb3.length());
        sb4.append(" at line ");
        sb4.append(i);
        sb4.append(" column ");
        sb4.append(i6);
        sb4.append(" path ");
        sb4.append(sb3);
        return sb4.toString();
    }

    public final int zzm() throws java.io.IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
