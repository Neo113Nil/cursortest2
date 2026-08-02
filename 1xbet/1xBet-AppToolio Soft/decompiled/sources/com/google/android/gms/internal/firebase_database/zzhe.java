package com.google.android.gms.internal.firebase_database;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhe {
    public static final zzhe zzph = new zzhe();
    private Integer zzpi;
    private int zzpj;
    private zzja zzpk = null;
    private zzid zzpl = null;
    private zzja zzpm = null;
    private zzid zzpn = null;
    private zzis zzpd = zzjf.zzgf();
    private String zzpo = null;

    private static zzja zze(zzja zzjaVar) {
        if ((zzjaVar instanceof zzji) || (zzjaVar instanceof zzic) || (zzjaVar instanceof zziq) || (zzjaVar instanceof zzir)) {
            return zzjaVar;
        }
        if (zzjaVar instanceof zziy) {
            return new zziq(Double.valueOf(((Long) zzjaVar.getValue()).doubleValue()), zzir.zzfv());
        }
        String valueOf = String.valueOf(zzjaVar.getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Unexpected value passed to normalizeValue: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final zzhe zzeh() {
        zzhe zzheVar = new zzhe();
        zzheVar.zzpi = this.zzpi;
        zzheVar.zzpk = this.zzpk;
        zzheVar.zzpl = this.zzpl;
        zzheVar.zzpm = this.zzpm;
        zzheVar.zzpn = this.zzpn;
        zzheVar.zzpj = this.zzpj;
        zzheVar.zzpd = this.zzpd;
        return zzheVar;
    }

    public static zzhe zzh(Map<String, Object> map) {
        zzis zzjeVar;
        zzhe zzheVar = new zzhe();
        zzheVar.zzpi = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            zzheVar.zzpk = zze(zzjd.zza(map.get("sp"), zzir.zzfv()));
            String str = (String) map.get("sn");
            if (str != null) {
                zzheVar.zzpl = zzid.zzt(str);
            }
        }
        if (map.containsKey("ep")) {
            zzheVar.zzpm = zze(zzjd.zza(map.get("ep"), zzir.zzfv()));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                zzheVar.zzpn = zzid.zzt(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            zzheVar.zzpj = str3.equals("l") ? zzhg.zzpq : zzhg.zzpr;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            if (str4.equals(".value")) {
                zzjeVar = zzjk.zzgg();
            } else if (str4.equals(".key")) {
                zzjeVar = zziu.zzgb();
            } else {
                if (str4.equals(".priority")) {
                    throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
                }
                zzjeVar = new zzje(new zzch(str4));
            }
            zzheVar.zzpd = zzjeVar;
        }
        return zzheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhe zzheVar = (zzhe) obj;
        Integer num = this.zzpi;
        if (num == null ? zzheVar.zzpi != null : !num.equals(zzheVar.zzpi)) {
            return false;
        }
        zzis zzisVar = this.zzpd;
        if (zzisVar == null ? zzheVar.zzpd != null : !zzisVar.equals(zzheVar.zzpd)) {
            return false;
        }
        zzid zzidVar = this.zzpn;
        if (zzidVar == null ? zzheVar.zzpn != null : !zzidVar.equals(zzheVar.zzpn)) {
            return false;
        }
        zzja zzjaVar = this.zzpm;
        if (zzjaVar == null ? zzheVar.zzpm != null : !zzjaVar.equals(zzheVar.zzpm)) {
            return false;
        }
        zzid zzidVar2 = this.zzpl;
        if (zzidVar2 == null ? zzheVar.zzpl != null : !zzidVar2.equals(zzheVar.zzpl)) {
            return false;
        }
        zzja zzjaVar2 = this.zzpk;
        if (zzjaVar2 == null ? zzheVar.zzpk == null : zzjaVar2.equals(zzheVar.zzpk)) {
            return zzei() == zzheVar.zzei();
        }
        return false;
    }

    public final int getLimit() {
        if (zzee()) {
            return this.zzpi.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public final int hashCode() {
        Integer num = this.zzpi;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (zzei() ? 1231 : 1237)) * 31;
        zzja zzjaVar = this.zzpk;
        int hashCode = (intValue + (zzjaVar != null ? zzjaVar.hashCode() : 0)) * 31;
        zzid zzidVar = this.zzpl;
        int hashCode2 = (hashCode + (zzidVar != null ? zzidVar.hashCode() : 0)) * 31;
        zzja zzjaVar2 = this.zzpm;
        int hashCode3 = (hashCode2 + (zzjaVar2 != null ? zzjaVar2.hashCode() : 0)) * 31;
        zzid zzidVar2 = this.zzpn;
        int hashCode4 = (hashCode3 + (zzidVar2 != null ? zzidVar2.hashCode() : 0)) * 31;
        zzis zzisVar = this.zzpd;
        return hashCode4 + (zzisVar != null ? zzisVar.hashCode() : 0);
    }

    public final boolean isDefault() {
        return zzek() && this.zzpd.equals(zzjf.zzgf());
    }

    public final String toString() {
        return zzej().toString();
    }

    public final zzhe zza(zzis zzisVar) {
        zzhe zzeh = zzeh();
        zzeh.zzpd = zzisVar;
        return zzeh;
    }

    public final zzhe zza(zzja zzjaVar, zzid zzidVar) {
        zzkq.zzf(!(zzjaVar instanceof zziy));
        zzhe zzeh = zzeh();
        zzeh.zzpk = zzjaVar;
        zzeh.zzpl = zzidVar;
        return zzeh;
    }

    public final zzhe zzb(zzja zzjaVar, zzid zzidVar) {
        zzkq.zzf(!(zzjaVar instanceof zziy));
        zzhe zzeh = zzeh();
        zzeh.zzpm = zzjaVar;
        zzeh.zzpn = zzidVar;
        return zzeh;
    }

    public final zzhe zzc(int i) {
        zzhe zzeh = zzeh();
        zzeh.zzpi = Integer.valueOf(i);
        zzeh.zzpj = zzhg.zzpq;
        return zzeh;
    }

    public final zzhe zzd(int i) {
        zzhe zzeh = zzeh();
        zzeh.zzpi = Integer.valueOf(i);
        zzeh.zzpj = zzhg.zzpr;
        return zzeh;
    }

    public final boolean zzdy() {
        return this.zzpk != null;
    }

    public final zzja zzdz() {
        if (zzdy()) {
            return this.zzpk;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public final zzid zzea() {
        if (!zzdy()) {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        zzid zzidVar = this.zzpl;
        return zzidVar != null ? zzidVar : zzid.zzfc();
    }

    public final boolean zzeb() {
        return this.zzpm != null;
    }

    public final zzja zzec() {
        if (zzeb()) {
            return this.zzpm;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public final zzid zzed() {
        if (!zzeb()) {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        zzid zzidVar = this.zzpn;
        return zzidVar != null ? zzidVar : zzid.zzfd();
    }

    public final boolean zzee() {
        return this.zzpi != null;
    }

    public final boolean zzef() {
        return zzee() && this.zzpj != 0;
    }

    public final zzis zzeg() {
        return this.zzpd;
    }

    public final boolean zzei() {
        int i = this.zzpj;
        return i != 0 ? i == zzhg.zzpq : zzdy();
    }

    public final Map<String, Object> zzej() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (zzdy()) {
            hashMap.put("sp", this.zzpk.getValue());
            zzid zzidVar = this.zzpl;
            if (zzidVar != null) {
                hashMap.put("sn", zzidVar.zzfg());
            }
        }
        if (zzeb()) {
            hashMap.put("ep", this.zzpm.getValue());
            zzid zzidVar2 = this.zzpn;
            if (zzidVar2 != null) {
                hashMap.put("en", zzidVar2.zzfg());
            }
        }
        Integer num = this.zzpi;
        if (num != null) {
            hashMap.put("l", num);
            int i = this.zzpj;
            if (i == 0) {
                i = zzdy() ? zzhg.zzpq : zzhg.zzpr;
            }
            switch (zzhf.zzpp[i - 1]) {
                case 1:
                    str = "vf";
                    str2 = "l";
                    break;
                case 2:
                    str = "vf";
                    str2 = "r";
                    break;
            }
            hashMap.put(str, str2);
        }
        if (!this.zzpd.equals(zzjf.zzgf())) {
            hashMap.put("i", this.zzpd.zzfx());
        }
        return hashMap;
    }

    public final boolean zzek() {
        return (zzdy() || zzeb() || zzee()) ? false : true;
    }

    public final String zzel() {
        if (this.zzpo == null) {
            try {
                this.zzpo = zzke.zze(zzej());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.zzpo;
    }

    public final zzht zzem() {
        return zzek() ? new zzhr(this.zzpd) : zzee() ? new zzhs(this) : new zzhv(this);
    }
}
