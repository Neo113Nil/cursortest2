package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzku extends zzacd<zzku> {
    private static volatile zzku[] zzavg;
    public Integer zzavh = null;
    public zzkr[] zzavi = zzkr.zzly();
    public zzkx[] zzavj = zzkx.zzmc();
    public Long zzavk = null;
    public Long zzavl = null;
    public Long zzavm = null;
    public Long zzavn = null;
    public Long zzavo = null;
    public String zzavp = null;
    public String zzavq = null;
    public String zzavr = null;
    public String zzahd = null;
    public Integer zzavs = null;
    public String zzafh = null;
    public String zzth = null;
    public String zztg = null;
    public Long zzavt = null;
    public Long zzavu = null;
    public String zzavv = null;
    public Boolean zzavw = null;
    public String zzaez = null;
    public Long zzavx = null;
    public Integer zzavy = null;
    public String zzafy = null;
    public String zzafa = null;
    public Boolean zzavz = null;
    public zzkp[] zzawa = zzkp.zzlw();
    public String zzafc = null;
    public Integer zzawb = null;
    private Integer zzawc = null;
    private Integer zzawd = null;
    public String zzawe = null;
    public Long zzawf = null;
    public Long zzawg = null;
    public String zzawh = null;
    private String zzawi = null;
    public Integer zzawj = null;
    private String zzawk = null;

    public zzku() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzku[] zzma() {
        if (zzavg == null) {
            synchronized (zzach.zzbzn) {
                if (zzavg == null) {
                    zzavg = new zzku[0];
                }
            }
        }
        return zzavg;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzku)) {
            return false;
        }
        zzku zzkuVar = (zzku) obj;
        Integer num = this.zzavh;
        if (num == null) {
            if (zzkuVar.zzavh != null) {
                return false;
            }
        } else if (!num.equals(zzkuVar.zzavh)) {
            return false;
        }
        if (!zzach.equals(this.zzavi, zzkuVar.zzavi) || !zzach.equals(this.zzavj, zzkuVar.zzavj)) {
            return false;
        }
        Long l = this.zzavk;
        if (l == null) {
            if (zzkuVar.zzavk != null) {
                return false;
            }
        } else if (!l.equals(zzkuVar.zzavk)) {
            return false;
        }
        Long l2 = this.zzavl;
        if (l2 == null) {
            if (zzkuVar.zzavl != null) {
                return false;
            }
        } else if (!l2.equals(zzkuVar.zzavl)) {
            return false;
        }
        Long l3 = this.zzavm;
        if (l3 == null) {
            if (zzkuVar.zzavm != null) {
                return false;
            }
        } else if (!l3.equals(zzkuVar.zzavm)) {
            return false;
        }
        Long l4 = this.zzavn;
        if (l4 == null) {
            if (zzkuVar.zzavn != null) {
                return false;
            }
        } else if (!l4.equals(zzkuVar.zzavn)) {
            return false;
        }
        Long l5 = this.zzavo;
        if (l5 == null) {
            if (zzkuVar.zzavo != null) {
                return false;
            }
        } else if (!l5.equals(zzkuVar.zzavo)) {
            return false;
        }
        String str = this.zzavp;
        if (str == null) {
            if (zzkuVar.zzavp != null) {
                return false;
            }
        } else if (!str.equals(zzkuVar.zzavp)) {
            return false;
        }
        String str2 = this.zzavq;
        if (str2 == null) {
            if (zzkuVar.zzavq != null) {
                return false;
            }
        } else if (!str2.equals(zzkuVar.zzavq)) {
            return false;
        }
        String str3 = this.zzavr;
        if (str3 == null) {
            if (zzkuVar.zzavr != null) {
                return false;
            }
        } else if (!str3.equals(zzkuVar.zzavr)) {
            return false;
        }
        String str4 = this.zzahd;
        if (str4 == null) {
            if (zzkuVar.zzahd != null) {
                return false;
            }
        } else if (!str4.equals(zzkuVar.zzahd)) {
            return false;
        }
        Integer num2 = this.zzavs;
        if (num2 == null) {
            if (zzkuVar.zzavs != null) {
                return false;
            }
        } else if (!num2.equals(zzkuVar.zzavs)) {
            return false;
        }
        String str5 = this.zzafh;
        if (str5 == null) {
            if (zzkuVar.zzafh != null) {
                return false;
            }
        } else if (!str5.equals(zzkuVar.zzafh)) {
            return false;
        }
        String str6 = this.zzth;
        if (str6 == null) {
            if (zzkuVar.zzth != null) {
                return false;
            }
        } else if (!str6.equals(zzkuVar.zzth)) {
            return false;
        }
        String str7 = this.zztg;
        if (str7 == null) {
            if (zzkuVar.zztg != null) {
                return false;
            }
        } else if (!str7.equals(zzkuVar.zztg)) {
            return false;
        }
        Long l6 = this.zzavt;
        if (l6 == null) {
            if (zzkuVar.zzavt != null) {
                return false;
            }
        } else if (!l6.equals(zzkuVar.zzavt)) {
            return false;
        }
        Long l7 = this.zzavu;
        if (l7 == null) {
            if (zzkuVar.zzavu != null) {
                return false;
            }
        } else if (!l7.equals(zzkuVar.zzavu)) {
            return false;
        }
        String str8 = this.zzavv;
        if (str8 == null) {
            if (zzkuVar.zzavv != null) {
                return false;
            }
        } else if (!str8.equals(zzkuVar.zzavv)) {
            return false;
        }
        Boolean bool = this.zzavw;
        if (bool == null) {
            if (zzkuVar.zzavw != null) {
                return false;
            }
        } else if (!bool.equals(zzkuVar.zzavw)) {
            return false;
        }
        String str9 = this.zzaez;
        if (str9 == null) {
            if (zzkuVar.zzaez != null) {
                return false;
            }
        } else if (!str9.equals(zzkuVar.zzaez)) {
            return false;
        }
        Long l8 = this.zzavx;
        if (l8 == null) {
            if (zzkuVar.zzavx != null) {
                return false;
            }
        } else if (!l8.equals(zzkuVar.zzavx)) {
            return false;
        }
        Integer num3 = this.zzavy;
        if (num3 == null) {
            if (zzkuVar.zzavy != null) {
                return false;
            }
        } else if (!num3.equals(zzkuVar.zzavy)) {
            return false;
        }
        String str10 = this.zzafy;
        if (str10 == null) {
            if (zzkuVar.zzafy != null) {
                return false;
            }
        } else if (!str10.equals(zzkuVar.zzafy)) {
            return false;
        }
        String str11 = this.zzafa;
        if (str11 == null) {
            if (zzkuVar.zzafa != null) {
                return false;
            }
        } else if (!str11.equals(zzkuVar.zzafa)) {
            return false;
        }
        Boolean bool2 = this.zzavz;
        if (bool2 == null) {
            if (zzkuVar.zzavz != null) {
                return false;
            }
        } else if (!bool2.equals(zzkuVar.zzavz)) {
            return false;
        }
        if (!zzach.equals(this.zzawa, zzkuVar.zzawa)) {
            return false;
        }
        String str12 = this.zzafc;
        if (str12 == null) {
            if (zzkuVar.zzafc != null) {
                return false;
            }
        } else if (!str12.equals(zzkuVar.zzafc)) {
            return false;
        }
        Integer num4 = this.zzawb;
        if (num4 == null) {
            if (zzkuVar.zzawb != null) {
                return false;
            }
        } else if (!num4.equals(zzkuVar.zzawb)) {
            return false;
        }
        Integer num5 = this.zzawc;
        if (num5 == null) {
            if (zzkuVar.zzawc != null) {
                return false;
            }
        } else if (!num5.equals(zzkuVar.zzawc)) {
            return false;
        }
        Integer num6 = this.zzawd;
        if (num6 == null) {
            if (zzkuVar.zzawd != null) {
                return false;
            }
        } else if (!num6.equals(zzkuVar.zzawd)) {
            return false;
        }
        String str13 = this.zzawe;
        if (str13 == null) {
            if (zzkuVar.zzawe != null) {
                return false;
            }
        } else if (!str13.equals(zzkuVar.zzawe)) {
            return false;
        }
        Long l9 = this.zzawf;
        if (l9 == null) {
            if (zzkuVar.zzawf != null) {
                return false;
            }
        } else if (!l9.equals(zzkuVar.zzawf)) {
            return false;
        }
        Long l10 = this.zzawg;
        if (l10 == null) {
            if (zzkuVar.zzawg != null) {
                return false;
            }
        } else if (!l10.equals(zzkuVar.zzawg)) {
            return false;
        }
        String str14 = this.zzawh;
        if (str14 == null) {
            if (zzkuVar.zzawh != null) {
                return false;
            }
        } else if (!str14.equals(zzkuVar.zzawh)) {
            return false;
        }
        String str15 = this.zzawi;
        if (str15 == null) {
            if (zzkuVar.zzawi != null) {
                return false;
            }
        } else if (!str15.equals(zzkuVar.zzawi)) {
            return false;
        }
        Integer num7 = this.zzawj;
        if (num7 == null) {
            if (zzkuVar.zzawj != null) {
                return false;
            }
        } else if (!num7.equals(zzkuVar.zzawj)) {
            return false;
        }
        String str16 = this.zzawk;
        if (str16 == null) {
            if (zzkuVar.zzawk != null) {
                return false;
            }
        } else if (!str16.equals(zzkuVar.zzawk)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkuVar.zzbzd == null || zzkuVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkuVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzavh;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zzach.hashCode(this.zzavi)) * 31) + zzach.hashCode(this.zzavj)) * 31;
        Long l = this.zzavk;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.zzavl;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.zzavm;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.zzavn;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.zzavo;
        int hashCode7 = (hashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.zzavp;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzavq;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzavr;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzahd;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.zzavs;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.zzafh;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzth;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zztg;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.zzavt;
        int hashCode16 = (hashCode15 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.zzavu;
        int hashCode17 = (hashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.zzavv;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.zzavw;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.zzaez;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l8 = this.zzavx;
        int hashCode21 = (hashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num3 = this.zzavy;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.zzafy;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.zzafa;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.zzavz;
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + zzach.hashCode(this.zzawa)) * 31;
        String str12 = this.zzafc;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.zzawb;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.zzawc;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.zzawd;
        int hashCode29 = (hashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.zzawe;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l9 = this.zzawf;
        int hashCode31 = (hashCode30 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.zzawg;
        int hashCode32 = (hashCode31 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str14 = this.zzawh;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.zzawi;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.zzawj;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str16 = this.zzawk;
        int hashCode36 = (hashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode36 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzavh;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        zzkr[] zzkrVarArr = this.zzavi;
        int i = 0;
        if (zzkrVarArr != null && zzkrVarArr.length > 0) {
            int i2 = zza;
            int i3 = 0;
            while (true) {
                zzkr[] zzkrVarArr2 = this.zzavi;
                if (i3 >= zzkrVarArr2.length) {
                    break;
                }
                zzkr zzkrVar = zzkrVarArr2[i3];
                if (zzkrVar != null) {
                    i2 += zzacb.zzb(2, zzkrVar);
                }
                i3++;
            }
            zza = i2;
        }
        zzkx[] zzkxVarArr = this.zzavj;
        if (zzkxVarArr != null && zzkxVarArr.length > 0) {
            int i4 = zza;
            int i5 = 0;
            while (true) {
                zzkx[] zzkxVarArr2 = this.zzavj;
                if (i5 >= zzkxVarArr2.length) {
                    break;
                }
                zzkx zzkxVar = zzkxVarArr2[i5];
                if (zzkxVar != null) {
                    i4 += zzacb.zzb(3, zzkxVar);
                }
                i5++;
            }
            zza = i4;
        }
        Long l = this.zzavk;
        if (l != null) {
            zza += zzacb.zzc(4, l.longValue());
        }
        Long l2 = this.zzavl;
        if (l2 != null) {
            zza += zzacb.zzc(5, l2.longValue());
        }
        Long l3 = this.zzavm;
        if (l3 != null) {
            zza += zzacb.zzc(6, l3.longValue());
        }
        Long l4 = this.zzavo;
        if (l4 != null) {
            zza += zzacb.zzc(7, l4.longValue());
        }
        String str = this.zzavp;
        if (str != null) {
            zza += zzacb.zzc(8, str);
        }
        String str2 = this.zzavq;
        if (str2 != null) {
            zza += zzacb.zzc(9, str2);
        }
        String str3 = this.zzavr;
        if (str3 != null) {
            zza += zzacb.zzc(10, str3);
        }
        String str4 = this.zzahd;
        if (str4 != null) {
            zza += zzacb.zzc(11, str4);
        }
        Integer num2 = this.zzavs;
        if (num2 != null) {
            zza += zzacb.zzf(12, num2.intValue());
        }
        String str5 = this.zzafh;
        if (str5 != null) {
            zza += zzacb.zzc(13, str5);
        }
        String str6 = this.zzth;
        if (str6 != null) {
            zza += zzacb.zzc(14, str6);
        }
        String str7 = this.zztg;
        if (str7 != null) {
            zza += zzacb.zzc(16, str7);
        }
        Long l5 = this.zzavt;
        if (l5 != null) {
            zza += zzacb.zzc(17, l5.longValue());
        }
        Long l6 = this.zzavu;
        if (l6 != null) {
            zza += zzacb.zzc(18, l6.longValue());
        }
        String str8 = this.zzavv;
        if (str8 != null) {
            zza += zzacb.zzc(19, str8);
        }
        Boolean bool = this.zzavw;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(20) + 1;
        }
        String str9 = this.zzaez;
        if (str9 != null) {
            zza += zzacb.zzc(21, str9);
        }
        Long l7 = this.zzavx;
        if (l7 != null) {
            zza += zzacb.zzc(22, l7.longValue());
        }
        Integer num3 = this.zzavy;
        if (num3 != null) {
            zza += zzacb.zzf(23, num3.intValue());
        }
        String str10 = this.zzafy;
        if (str10 != null) {
            zza += zzacb.zzc(24, str10);
        }
        String str11 = this.zzafa;
        if (str11 != null) {
            zza += zzacb.zzc(25, str11);
        }
        Long l8 = this.zzavn;
        if (l8 != null) {
            zza += zzacb.zzc(26, l8.longValue());
        }
        Boolean bool2 = this.zzavz;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += zzacb.zzaq(28) + 1;
        }
        zzkp[] zzkpVarArr = this.zzawa;
        if (zzkpVarArr != null && zzkpVarArr.length > 0) {
            while (true) {
                zzkp[] zzkpVarArr2 = this.zzawa;
                if (i >= zzkpVarArr2.length) {
                    break;
                }
                zzkp zzkpVar = zzkpVarArr2[i];
                if (zzkpVar != null) {
                    zza += zzacb.zzb(29, zzkpVar);
                }
                i++;
            }
        }
        String str12 = this.zzafc;
        if (str12 != null) {
            zza += zzacb.zzc(30, str12);
        }
        Integer num4 = this.zzawb;
        if (num4 != null) {
            zza += zzacb.zzf(31, num4.intValue());
        }
        Integer num5 = this.zzawc;
        if (num5 != null) {
            zza += zzacb.zzf(32, num5.intValue());
        }
        Integer num6 = this.zzawd;
        if (num6 != null) {
            zza += zzacb.zzf(33, num6.intValue());
        }
        String str13 = this.zzawe;
        if (str13 != null) {
            zza += zzacb.zzc(34, str13);
        }
        Long l9 = this.zzawf;
        if (l9 != null) {
            zza += zzacb.zzc(35, l9.longValue());
        }
        Long l10 = this.zzawg;
        if (l10 != null) {
            zza += zzacb.zzc(36, l10.longValue());
        }
        String str14 = this.zzawh;
        if (str14 != null) {
            zza += zzacb.zzc(37, str14);
        }
        String str15 = this.zzawi;
        if (str15 != null) {
            zza += zzacb.zzc(38, str15);
        }
        Integer num7 = this.zzawj;
        if (num7 != null) {
            zza += zzacb.zzf(39, num7.intValue());
        }
        String str16 = this.zzawk;
        return str16 != null ? zza + zzacb.zzc(41, str16) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzavh;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        zzkr[] zzkrVarArr = this.zzavi;
        int i = 0;
        if (zzkrVarArr != null && zzkrVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkr[] zzkrVarArr2 = this.zzavi;
                if (i2 >= zzkrVarArr2.length) {
                    break;
                }
                zzkr zzkrVar = zzkrVarArr2[i2];
                if (zzkrVar != null) {
                    zzacbVar.zza(2, zzkrVar);
                }
                i2++;
            }
        }
        zzkx[] zzkxVarArr = this.zzavj;
        if (zzkxVarArr != null && zzkxVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzkx[] zzkxVarArr2 = this.zzavj;
                if (i3 >= zzkxVarArr2.length) {
                    break;
                }
                zzkx zzkxVar = zzkxVarArr2[i3];
                if (zzkxVar != null) {
                    zzacbVar.zza(3, zzkxVar);
                }
                i3++;
            }
        }
        Long l = this.zzavk;
        if (l != null) {
            zzacbVar.zzb(4, l.longValue());
        }
        Long l2 = this.zzavl;
        if (l2 != null) {
            zzacbVar.zzb(5, l2.longValue());
        }
        Long l3 = this.zzavm;
        if (l3 != null) {
            zzacbVar.zzb(6, l3.longValue());
        }
        Long l4 = this.zzavo;
        if (l4 != null) {
            zzacbVar.zzb(7, l4.longValue());
        }
        String str = this.zzavp;
        if (str != null) {
            zzacbVar.zzb(8, str);
        }
        String str2 = this.zzavq;
        if (str2 != null) {
            zzacbVar.zzb(9, str2);
        }
        String str3 = this.zzavr;
        if (str3 != null) {
            zzacbVar.zzb(10, str3);
        }
        String str4 = this.zzahd;
        if (str4 != null) {
            zzacbVar.zzb(11, str4);
        }
        Integer num2 = this.zzavs;
        if (num2 != null) {
            zzacbVar.zze(12, num2.intValue());
        }
        String str5 = this.zzafh;
        if (str5 != null) {
            zzacbVar.zzb(13, str5);
        }
        String str6 = this.zzth;
        if (str6 != null) {
            zzacbVar.zzb(14, str6);
        }
        String str7 = this.zztg;
        if (str7 != null) {
            zzacbVar.zzb(16, str7);
        }
        Long l5 = this.zzavt;
        if (l5 != null) {
            zzacbVar.zzb(17, l5.longValue());
        }
        Long l6 = this.zzavu;
        if (l6 != null) {
            zzacbVar.zzb(18, l6.longValue());
        }
        String str8 = this.zzavv;
        if (str8 != null) {
            zzacbVar.zzb(19, str8);
        }
        Boolean bool = this.zzavw;
        if (bool != null) {
            zzacbVar.zza(20, bool.booleanValue());
        }
        String str9 = this.zzaez;
        if (str9 != null) {
            zzacbVar.zzb(21, str9);
        }
        Long l7 = this.zzavx;
        if (l7 != null) {
            zzacbVar.zzb(22, l7.longValue());
        }
        Integer num3 = this.zzavy;
        if (num3 != null) {
            zzacbVar.zze(23, num3.intValue());
        }
        String str10 = this.zzafy;
        if (str10 != null) {
            zzacbVar.zzb(24, str10);
        }
        String str11 = this.zzafa;
        if (str11 != null) {
            zzacbVar.zzb(25, str11);
        }
        Long l8 = this.zzavn;
        if (l8 != null) {
            zzacbVar.zzb(26, l8.longValue());
        }
        Boolean bool2 = this.zzavz;
        if (bool2 != null) {
            zzacbVar.zza(28, bool2.booleanValue());
        }
        zzkp[] zzkpVarArr = this.zzawa;
        if (zzkpVarArr != null && zzkpVarArr.length > 0) {
            while (true) {
                zzkp[] zzkpVarArr2 = this.zzawa;
                if (i >= zzkpVarArr2.length) {
                    break;
                }
                zzkp zzkpVar = zzkpVarArr2[i];
                if (zzkpVar != null) {
                    zzacbVar.zza(29, zzkpVar);
                }
                i++;
            }
        }
        String str12 = this.zzafc;
        if (str12 != null) {
            zzacbVar.zzb(30, str12);
        }
        Integer num4 = this.zzawb;
        if (num4 != null) {
            zzacbVar.zze(31, num4.intValue());
        }
        Integer num5 = this.zzawc;
        if (num5 != null) {
            zzacbVar.zze(32, num5.intValue());
        }
        Integer num6 = this.zzawd;
        if (num6 != null) {
            zzacbVar.zze(33, num6.intValue());
        }
        String str13 = this.zzawe;
        if (str13 != null) {
            zzacbVar.zzb(34, str13);
        }
        Long l9 = this.zzawf;
        if (l9 != null) {
            zzacbVar.zzb(35, l9.longValue());
        }
        Long l10 = this.zzawg;
        if (l10 != null) {
            zzacbVar.zzb(36, l10.longValue());
        }
        String str14 = this.zzawh;
        if (str14 != null) {
            zzacbVar.zzb(37, str14);
        }
        String str15 = this.zzawi;
        if (str15 != null) {
            zzacbVar.zzb(38, str15);
        }
        Integer num7 = this.zzawj;
        if (num7 != null) {
            zzacbVar.zze(39, num7.intValue());
        }
        String str16 = this.zzawk;
        if (str16 != null) {
            zzacbVar.zzb(41, str16);
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        while (true) {
            int zzvl = zzacaVar.zzvl();
            switch (zzvl) {
                case 0:
                    return this;
                case 8:
                    this.zzavh = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 18:
                    int zzb = zzacm.zzb(zzacaVar, 18);
                    zzkr[] zzkrVarArr = this.zzavi;
                    int length = zzkrVarArr == null ? 0 : zzkrVarArr.length;
                    zzkr[] zzkrVarArr2 = new zzkr[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzavi, 0, zzkrVarArr2, 0, length);
                    }
                    while (length < zzkrVarArr2.length - 1) {
                        zzkrVarArr2[length] = new zzkr();
                        zzacaVar.zza(zzkrVarArr2[length]);
                        zzacaVar.zzvl();
                        length++;
                    }
                    zzkrVarArr2[length] = new zzkr();
                    zzacaVar.zza(zzkrVarArr2[length]);
                    this.zzavi = zzkrVarArr2;
                    break;
                case 26:
                    int zzb2 = zzacm.zzb(zzacaVar, 26);
                    zzkx[] zzkxVarArr = this.zzavj;
                    int length2 = zzkxVarArr == null ? 0 : zzkxVarArr.length;
                    zzkx[] zzkxVarArr2 = new zzkx[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzavj, 0, zzkxVarArr2, 0, length2);
                    }
                    while (length2 < zzkxVarArr2.length - 1) {
                        zzkxVarArr2[length2] = new zzkx();
                        zzacaVar.zza(zzkxVarArr2[length2]);
                        zzacaVar.zzvl();
                        length2++;
                    }
                    zzkxVarArr2[length2] = new zzkx();
                    zzacaVar.zza(zzkxVarArr2[length2]);
                    this.zzavj = zzkxVarArr2;
                    break;
                case 32:
                    this.zzavk = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 40:
                    this.zzavl = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 48:
                    this.zzavm = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 56:
                    this.zzavo = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 66:
                    this.zzavp = zzacaVar.readString();
                    break;
                case 74:
                    this.zzavq = zzacaVar.readString();
                    break;
                case 82:
                    this.zzavr = zzacaVar.readString();
                    break;
                case 90:
                    this.zzahd = zzacaVar.readString();
                    break;
                case 96:
                    this.zzavs = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 106:
                    this.zzafh = zzacaVar.readString();
                    break;
                case 114:
                    this.zzth = zzacaVar.readString();
                    break;
                case 130:
                    this.zztg = zzacaVar.readString();
                    break;
                case 136:
                    this.zzavt = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 144:
                    this.zzavu = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 154:
                    this.zzavv = zzacaVar.readString();
                    break;
                case 160:
                    this.zzavw = Boolean.valueOf(zzacaVar.zzvm());
                    break;
                case 170:
                    this.zzaez = zzacaVar.readString();
                    break;
                case 176:
                    this.zzavx = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 184:
                    this.zzavy = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 194:
                    this.zzafy = zzacaVar.readString();
                    break;
                case 202:
                    this.zzafa = zzacaVar.readString();
                    break;
                case 208:
                    this.zzavn = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 224:
                    this.zzavz = Boolean.valueOf(zzacaVar.zzvm());
                    break;
                case 234:
                    int zzb3 = zzacm.zzb(zzacaVar, 234);
                    zzkp[] zzkpVarArr = this.zzawa;
                    int length3 = zzkpVarArr == null ? 0 : zzkpVarArr.length;
                    zzkp[] zzkpVarArr2 = new zzkp[zzb3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzawa, 0, zzkpVarArr2, 0, length3);
                    }
                    while (length3 < zzkpVarArr2.length - 1) {
                        zzkpVarArr2[length3] = new zzkp();
                        zzacaVar.zza(zzkpVarArr2[length3]);
                        zzacaVar.zzvl();
                        length3++;
                    }
                    zzkpVarArr2[length3] = new zzkp();
                    zzacaVar.zza(zzkpVarArr2[length3]);
                    this.zzawa = zzkpVarArr2;
                    break;
                case 242:
                    this.zzafc = zzacaVar.readString();
                    break;
                case 248:
                    this.zzawb = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 256:
                    this.zzawc = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 264:
                    this.zzawd = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 274:
                    this.zzawe = zzacaVar.readString();
                    break;
                case 280:
                    this.zzawf = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 288:
                    this.zzawg = Long.valueOf(zzacaVar.zzvo());
                    break;
                case 298:
                    this.zzawh = zzacaVar.readString();
                    break;
                case 306:
                    this.zzawi = zzacaVar.readString();
                    break;
                case 312:
                    this.zzawj = Integer.valueOf(zzacaVar.zzvn());
                    break;
                case 330:
                    this.zzawk = zzacaVar.readString();
                    break;
                default:
                    if (!super.zza(zzacaVar, zzvl)) {
                        return this;
                    }
                    break;
            }
        }
    }
}
