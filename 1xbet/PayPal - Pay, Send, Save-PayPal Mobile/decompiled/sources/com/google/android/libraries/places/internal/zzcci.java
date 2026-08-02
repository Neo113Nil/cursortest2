package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcci {
    private final java.lang.String zza;
    private final int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private char[] zzg;

    public zzcci(javax.security.auth.x500.X500Principal x500Principal) {
        java.lang.String name2 = x500Principal.getName("RFC2253");
        this.zza = name2;
        this.zzb = name2.length();
    }

    private final java.lang.String zzb() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        while (true) {
            i = this.zzc;
            i2 = this.zzb;
            if (i >= i2 || this.zzg[i] != ' ') {
                break;
            }
            this.zzc = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.zzd = i;
        this.zzc = i + 1;
        while (true) {
            i3 = this.zzc;
            if (i3 >= i2 || (c5 = this.zzg[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.zzc = i3 + 1;
        }
        if (i3 >= i2) {
            throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.zza)));
        }
        this.zze = i3;
        if (this.zzg[i3] == ' ') {
            while (true) {
                i3 = this.zzc;
                if (i3 >= i2 || (c4 = this.zzg[i3]) == '=' || c4 != ' ') {
                    break;
                }
                this.zzc = i3 + 1;
            }
            if (this.zzg[i3] != '=' || i3 == i2) {
                throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.zza)));
            }
        }
        do {
            i3++;
            this.zzc = i3;
            if (i3 >= i2) {
                break;
            }
        } while (this.zzg[i3] == ' ');
        int i4 = this.zze;
        int i5 = this.zzd;
        if (i4 - i5 > 4) {
            char[] cArr = this.zzg;
            if (cArr[i5 + 3] == '.' && (((c = cArr[i5]) == 'O' || c == 'o') && (((c2 = cArr[i5 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i5 + 2]) == 'D' || c3 == 'd')))) {
                i5 += 4;
                this.zzd = i5;
            }
        }
        return new java.lang.String(this.zzg, i5, i4 - i5);
    }

    private final char zzc() {
        int i;
        int i2;
        int i3 = this.zzc + 1;
        this.zzc = i3;
        int i4 = this.zzb;
        if (i3 == i4) {
            throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.zza)));
        }
        char c = this.zzg[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int zzd = zzd(i3);
                            this.zzc++;
                            if (zzd >= 128) {
                                if (zzd >= 192 && zzd <= 247) {
                                    if (zzd <= 223) {
                                        i = zzd & 31;
                                        i2 = 1;
                                    } else if (zzd <= 239) {
                                        i = zzd & 15;
                                        i2 = 2;
                                    } else {
                                        i = zzd & 7;
                                        i2 = 3;
                                    }
                                    for (int i5 = 0; i5 < i2; i5++) {
                                        int i6 = this.zzc;
                                        int i7 = i6 + 1;
                                        this.zzc = i7;
                                        if (i7 != i4 && this.zzg[i7] == '\\') {
                                            int i8 = i6 + 2;
                                            this.zzc = i8;
                                            int zzd2 = zzd(i8);
                                            this.zzc++;
                                            if ((zzd2 & 192) == 128) {
                                                i = (i << 6) + (zzd2 & 63);
                                            }
                                        }
                                    }
                                    zzd = (char) i;
                                }
                                zzd = 63;
                            }
                            return (char) zzd;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    private final int zzd(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.zzb) {
            throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.zza)));
        }
        char[] cArr = this.zzg;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.zza)));
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.zza)));
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0081, code lost:
    
        r3 = r14.zzd;
        r6 = new java.lang.String(r5, r3, r14.zze - r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String zza(java.lang.String str) {
        java.lang.String str2;
        int i;
        char[] cArr;
        char c;
        int i2;
        char c2;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        java.lang.String str3 = this.zza;
        this.zzg = str3.toCharArray();
        java.lang.String zzb = zzb();
        if (zzb == null) {
            return null;
        }
        do {
            int i3 = this.zzc;
            int i4 = this.zzb;
            if (i3 == i4) {
                return null;
            }
            char c3 = this.zzg[i3];
            if (c3 == '\"') {
                int i5 = i3 + 1;
                this.zzc = i5;
                this.zzd = i5;
                this.zze = i5;
                while (true) {
                    int i6 = this.zzc;
                    if (i6 == i4) {
                        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                    }
                    char[] cArr2 = this.zzg;
                    char c4 = cArr2[i6];
                    if (c4 == '\"') {
                        this.zzc = i6 + 1;
                        while (true) {
                            int i7 = this.zzc;
                            if (i7 >= i4 || this.zzg[i7] != ' ') {
                                break;
                            }
                            this.zzc = i7 + 1;
                        }
                        char[] cArr3 = this.zzg;
                        int i8 = this.zzd;
                        str2 = new java.lang.String(cArr3, i8, this.zze - i8);
                    } else {
                        if (c4 == '\\') {
                            cArr2[this.zze] = zzc();
                        } else {
                            cArr2[this.zze] = c4;
                        }
                        this.zzc++;
                        this.zze++;
                    }
                }
            } else if (c3 != '#') {
                if (c3 == '+' || c3 == ',' || c3 == ';') {
                    str2 = "";
                } else {
                    this.zzd = i3;
                    this.zze = i3;
                    while (true) {
                        int i9 = this.zzc;
                        if (i9 >= i4) {
                            char[] cArr4 = this.zzg;
                            int i10 = this.zzd;
                            str2 = new java.lang.String(cArr4, i10, this.zze - i10);
                            break;
                        }
                        char[] cArr5 = this.zzg;
                        char c5 = cArr5[i9];
                        if (c5 == ' ') {
                            int i11 = this.zze;
                            this.zzf = i11;
                            this.zzc = i9 + 1;
                            this.zze = i11 + 1;
                            cArr5[i11] = ' ';
                            while (true) {
                                i2 = this.zzc;
                                if (i2 >= i4) {
                                    break;
                                }
                                char[] cArr6 = this.zzg;
                                if (cArr6[i2] != ' ') {
                                    break;
                                }
                                int i12 = this.zze;
                                this.zze = i12 + 1;
                                cArr6[i12] = ' ';
                                this.zzc = i2 + 1;
                            }
                            if (i2 == i4 || (c2 = this.zzg[i2]) == ',' || c2 == '+' || c2 == ';') {
                                break;
                            }
                        } else {
                            if (c5 == ';') {
                                break;
                            }
                            if (c5 == '\\') {
                                int i13 = this.zze;
                                this.zze = i13 + 1;
                                cArr5[i13] = zzc();
                                this.zzc++;
                            } else {
                                if (c5 == '+' || c5 == ',') {
                                    break;
                                }
                                int i14 = this.zze;
                                this.zze = i14 + 1;
                                cArr5[i14] = c5;
                                this.zzc = i9 + 1;
                            }
                        }
                    }
                    char[] cArr7 = this.zzg;
                    int i15 = this.zzd;
                    str2 = new java.lang.String(cArr7, i15, this.zzf - i15);
                }
            } else {
                if (i3 + 4 >= i4) {
                    throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                }
                this.zzd = i3;
                this.zzc = i3 + 1;
                while (true) {
                    i = this.zzc;
                    if (i == i4 || (c = (cArr = this.zzg)[i]) == '+' || c == ',' || c == ';') {
                        break;
                    }
                    int i16 = i + 1;
                    if (c == ' ') {
                        this.zze = i;
                        this.zzc = i16;
                        while (true) {
                            int i17 = this.zzc;
                            if (i17 >= i4 || this.zzg[i17] != ' ') {
                                break;
                            }
                            this.zzc = i17 + 1;
                        }
                    } else {
                        if (c >= 'A' && c <= 'F') {
                            cArr[i] = (char) (c + ' ');
                        }
                        this.zzc = i16;
                    }
                }
                this.zze = i;
                int i18 = this.zze;
                int i19 = this.zzd;
                int i20 = i18 - i19;
                if (i20 < 5 || (i20 & 1) == 0) {
                    throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                }
                int i21 = i20 >> 1;
                int i22 = i19 + 1;
                byte[] bArr = new byte[i21];
                int i23 = 0;
                while (i23 < i21) {
                    bArr[i23] = (byte) zzd(i22);
                    i23++;
                    i22 += 2;
                }
                str2 = new java.lang.String(this.zzg, this.zzd, i20);
            }
            if ("cn".equalsIgnoreCase(zzb)) {
                return str2;
            }
            int i24 = this.zzc;
            if (i24 >= i4) {
                return null;
            }
            char c6 = this.zzg[i24];
            if (c6 != ',' && c6 != ';' && c6 != '+') {
                throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(str3)));
            }
            this.zzc = i24 + 1;
            zzb = zzb();
        } while (zzb != null);
        throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(str3)));
    }
}
