package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzcfj implements java.io.Serializable, java.lang.Comparable {
    public static final com.google.android.libraries.places.internal.zzcfj zza = new com.google.android.libraries.places.internal.zzcfj(new byte[0]);
    private final byte[] zzb;
    private transient int zzc;
    private transient java.lang.String zzd;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzcfj zzcfjVar = (com.google.android.libraries.places.internal.zzcfj) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfjVar, "");
        int zzj = zzj();
        int zzj2 = zzcfjVar.zzj();
        int min = java.lang.Math.min(zzj, zzj2);
        for (int i = 0; i < min; i++) {
            int zzi = zzi(i) & 255;
            int zzi2 = zzcfjVar.zzi(i) & 255;
            if (zzi != zzi2) {
                return zzi >= zzi2 ? 1 : -1;
            }
        }
        if (zzj == zzj2) {
            return 0;
        }
        return zzj >= zzj2 ? 1 : -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzcfj) {
            com.google.android.libraries.places.internal.zzcfj zzcfjVar = (com.google.android.libraries.places.internal.zzcfj) obj;
            int zzj = zzcfjVar.zzj();
            byte[] bArr = this.zzb;
            int length = bArr.length;
            return zzj == length && zzcfjVar.zzo(0, bArr, 0, length);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = java.util.Arrays.hashCode(this.zzb);
        this.zzc = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00db, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0092, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0068, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0083, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0058, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00bd, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b2, code lost:
    
        if (r6 != 64) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00d7, code lost:
    
        if (r6 != 64) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String toString() {
        int i;
        byte[] bArr = this.zzb;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b = bArr[i3];
            if (b >= 0) {
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b != 10 && b != 13 && (b < 32 || b >= Byte.MAX_VALUE)) {
                    break;
                }
                i2++;
                i3++;
                while (i3 < length) {
                    byte b2 = bArr[i3];
                    if (b2 < 0) {
                        break;
                    }
                    i3++;
                    if (i != 64) {
                        if (b2 != 10 && b2 != 13 && (b2 < 32 || b2 >= Byte.MAX_VALUE)) {
                            break loop0;
                        }
                        i2++;
                        i++;
                    } else {
                        break loop0;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                i4 = i;
            } else if ((b >> 5) == -2) {
                int i5 = i3 + 1;
                if (length > i5) {
                    byte b3 = bArr[i5];
                    if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        int i6 = (b << 6) ^ (b3 ^ 3968);
                        if (i6 >= 128) {
                            i = i4 + 1;
                            if (i4 != 64) {
                                if (i6 < 160 || i6 == 65533) {
                                    break;
                                }
                                i3 += 2;
                                i2 += i6 < 65536 ? 1 : 2;
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                i4 = i;
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else if ((b >> 4) == -2) {
                int i7 = i3 + 2;
                if (length > i7) {
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        byte b5 = bArr[i7];
                        if ((b5 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i8 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b << com.google.common.base.Ascii.FF);
                            if (i8 >= 2048) {
                                if (i8 < 55296 || i8 >= 57344) {
                                    int i9 = i4 + 1;
                                    if (i4 != 64) {
                                        if (i8 == 65533) {
                                            break;
                                        }
                                        i3 += 3;
                                        i2 += i8 < 65536 ? 1 : 2;
                                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                        i4 = i9;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((b >> 3) == -2) {
                int i10 = i3 + 3;
                if (length > i10) {
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        byte b7 = bArr[i3 + 2];
                        if ((b7 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF)) ^ (b << 18);
                                if (i11 <= 1114111) {
                                    if (i11 < 55296 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            int i12 = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            i2 += 2;
                                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                            i3 += 4;
                                            i4 = i12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            int length2 = bArr.length;
            if (length2 <= 64) {
                java.lang.String zzg = zzg();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzg).length() + 6);
                sb.append("[hex=");
                sb.append(zzg);
                sb.append("]");
                return sb.toString();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
            java.lang.String zzg2 = new com.google.android.libraries.places.internal.zzcfj(kotlin.collections.ArraysKt.copyOfRange(bArr, 0, 64)).zzg();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(length2).length() + 11 + java.lang.String.valueOf(zzg2).length() + 2);
            sb2.append("[size=");
            sb2.append(length2);
            sb2.append(" hex=");
            sb2.append(zzg2);
            sb2.append("…]");
            return sb2.toString();
        }
        java.lang.String zze = zze();
        java.lang.String substring = zze.substring(0, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
        if (i2 >= zze.length()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(replace$default).length() + 7);
            sb3.append("[text=");
            sb3.append(replace$default);
            sb3.append("]");
            return sb3.toString();
        }
        int length3 = bArr.length;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(length3).length() + 12 + java.lang.String.valueOf(replace$default).length() + 2);
        sb4.append("[size=");
        sb4.append(length3);
        sb4.append(" text=");
        sb4.append(replace$default);
        sb4.append("…]");
        return sb4.toString();
    }

    public final java.lang.String zze() {
        java.lang.String str = this.zzd;
        if (str != null) {
            return str;
        }
        java.lang.String zza2 = com.google.android.libraries.places.internal.zzcfy.zza(zzl());
        this.zzd = zza2;
        return zza2;
    }

    public final java.lang.String zzf() {
        return com.google.android.libraries.places.internal.zzcfa.zza(this.zzb, null, 1, null);
    }

    public java.lang.String zzg() {
        byte[] bArr = this.zzb;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = com.google.android.libraries.places.internal.zzcga.zza()[(b >> 4) & 15];
            cArr[i + 1] = com.google.android.libraries.places.internal.zzcga.zza()[b & com.google.common.base.Ascii.SI];
            i += 2;
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public com.google.android.libraries.places.internal.zzcfj zzh() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = java.util.Arrays.copyOf(bArr, length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[i] = (byte) (b + 32);
                while (i2 < copyOf.length) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                    i2++;
                }
                return new com.google.android.libraries.places.internal.zzcfj(copyOf);
            }
            i = i2;
        }
    }

    public byte zzi(int i) {
        return this.zzb[i];
    }

    public int zzj() {
        return this.zzb.length;
    }

    public byte[] zzk() {
        byte[] bArr = this.zzb;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public boolean zzn(int i, com.google.android.libraries.places.internal.zzcfj zzcfjVar, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfjVar, "");
        return zzcfjVar.zzo(0, this.zzb, 0, i3);
    }

    public boolean zzo(int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.zzb;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.google.android.libraries.places.internal.zzcfb.zzb(bArr2, i, bArr, i2, i3);
    }

    public final boolean zzp(com.google.android.libraries.places.internal.zzcfj zzcfjVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfjVar, "");
        return zzn(0, zzcfjVar, 0, zzcfjVar.zzb.length);
    }

    public void zzm(com.google.android.libraries.places.internal.zzcff zzcffVar, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        zzcffVar.zzz(this.zzb, 0, i2);
    }

    public byte[] zzl() {
        return this.zzb;
    }

    public final void zzd(java.lang.String str) {
        this.zzd = str;
    }

    public final void zzc(int i) {
        this.zzc = i;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final byte[] zza() {
        return this.zzb;
    }

    public zzcfj(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.zzb = bArr;
    }
}
