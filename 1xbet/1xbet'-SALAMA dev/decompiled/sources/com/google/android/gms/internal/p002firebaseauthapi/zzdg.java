package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzdg extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzb zze;
    private final zzc zzf;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zzc zze;
        private zzb zzf;

        public final zza zza(int i7) throws InvalidAlgorithmParameterException {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zza zzb(int i7) throws InvalidAlgorithmParameterException {
            if (i7 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i7)));
            }
            this.zzb = Integer.valueOf(i7);
            return this;
        }

        public final zza zzc(int i7) throws GeneralSecurityException {
            if (i7 < 12 || i7 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i7)));
            }
            this.zzc = Integer.valueOf(i7);
            return this;
        }

        public final zza zzd(int i7) throws GeneralSecurityException {
            if (i7 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
            }
            this.zzd = Integer.valueOf(i7);
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzb.zzc;
        }

        public final zza zza(zzc zzcVar) {
            this.zze = zzcVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzf = zzbVar;
            return this;
        }

        public final zzdg zza() throws GeneralSecurityException {
            if (this.zza != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        Integer num = this.zzd;
                        if (num != null) {
                            if (this.zze != null) {
                                if (this.zzf != null) {
                                    int iIntValue = num.intValue();
                                    zzc zzcVar = this.zze;
                                    if (zzcVar == zzc.zza) {
                                        if (iIntValue > 20) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                        }
                                    } else if (zzcVar == zzc.zzb) {
                                        if (iIntValue > 28) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                        }
                                    } else if (zzcVar == zzc.zzc) {
                                        if (iIntValue > 32) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                        }
                                    } else if (zzcVar == zzc.zzd) {
                                        if (iIntValue > 48) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                        }
                                    } else {
                                        if (zzcVar != zzc.zze) {
                                            throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                        }
                                        if (iIntValue > 64) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                        }
                                    }
                                    return new zzdg(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
                                }
                                throw new GeneralSecurityException("variant is not set");
                            }
                            throw new GeneralSecurityException("hash type is not set");
                        }
                        throw new GeneralSecurityException("tag size is not set");
                    }
                    throw new GeneralSecurityException("iv size is not set");
                }
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            throw new GeneralSecurityException("AES key size is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("SHA1");
        public static final zzc zzb = new zzc("SHA224");
        public static final zzc zzc = new zzc("SHA256");
        public static final zzc zzd = new zzc("SHA384");
        public static final zzc zze = new zzc("SHA512");
        private final String zzf;

        private zzc(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static zza zzf() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdg)) {
            return false;
        }
        zzdg zzdgVar = (zzdg) obj;
        return zzdgVar.zza == this.zza && zzdgVar.zzb == this.zzb && zzdgVar.zzc == this.zzc && zzdgVar.zzd == this.zzd && zzdgVar.zze == this.zze && zzdgVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzdg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(this.zzf);
        int i7 = this.zzc;
        int i8 = this.zzd;
        int i9 = this.zza;
        int i10 = this.zzb;
        StringBuilder sbL = k.l("AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", ");
        sbL.append(i7);
        sbL.append("-byte IV, and ");
        sbL.append(i8);
        sbL.append("-byte tags, and ");
        sbL.append(i9);
        sbL.append("-byte AES key, and ");
        sbL.append(i10);
        sbL.append("-byte HMAC key)");
        return sbL.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zze != zzb.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzc zzg() {
        return this.zzf;
    }

    public final zzb zzh() {
        return this.zze;
    }

    private zzdg(int i7, int i8, int i9, int i10, zzb zzbVar, zzc zzcVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = zzbVar;
        this.zzf = zzcVar;
    }
}
