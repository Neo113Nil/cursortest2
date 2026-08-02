package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcg implements zzeu {
    private int tag;
    private final zzcd zznb;
    private int zznc;
    private int zznd = 0;

    private zzcg(zzcd zzcdVar) {
        this.zznb = (zzcd) zzdd.zza(zzcdVar, "input");
        this.zznb.zzmt = this;
    }

    public static zzcg zza(zzcd zzcdVar) {
        return zzcdVar.zzmt != null ? zzcdVar.zzmt : new zzcg(zzcdVar);
    }

    private final Object zza(zzgd zzgdVar, Class<?> cls, zzco zzcoVar) throws IOException {
        switch (zzch.zzne[zzgdVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzci());
            case 2:
                return zzck();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzcm());
            case 5:
                return Integer.valueOf(zzch());
            case 6:
                return Long.valueOf(zzcg());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzcf());
            case 9:
                return Long.valueOf(zzce());
            case 10:
                zzs(2);
                return zzc(zzes.zzfg().zzf(cls), zzcoVar);
            case 11:
                return Integer.valueOf(zzcn());
            case 12:
                return Long.valueOf(zzco());
            case 13:
                return Integer.valueOf(zzcp());
            case 14:
                return Long.valueOf(zzcq());
            case 15:
                return zzcj();
            case 16:
                return Integer.valueOf(zzcl());
            case 17:
                return Long.valueOf(zzcd());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final void zza(List<String> list, boolean z) throws IOException {
        int zzcc;
        int zzcc2;
        if ((this.tag & 7) != 2) {
            throw zzdh.zzei();
        }
        if (!(list instanceof zzdq) || z) {
            do {
                list.add(z ? zzcj() : readString());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzdq zzdqVar = (zzdq) list;
        do {
            zzdqVar.zzc(zzck());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    private final <T> T zzc(zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        int zzcl = this.zznb.zzcl();
        if (this.zznb.zzmq >= this.zznb.zzmr) {
            throw zzdh.zzej();
        }
        int zzp = this.zznb.zzp(zzcl);
        T newInstance = zzevVar.newInstance();
        this.zznb.zzmq++;
        zzevVar.zza(newInstance, this, zzcoVar);
        zzevVar.zze(newInstance);
        this.zznb.zzm(0);
        zzcd zzcdVar = this.zznb;
        zzcdVar.zzmq--;
        this.zznb.zzq(zzp);
        return newInstance;
    }

    private final <T> T zzd(zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        int i = this.zznc;
        this.zznc = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzevVar.newInstance();
            zzevVar.zza(newInstance, this, zzcoVar);
            zzevVar.zze(newInstance);
            if (this.tag == this.zznc) {
                return newInstance;
            }
            throw zzdh.zzek();
        } finally {
            this.zznc = i;
        }
    }

    private final void zzs(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzdh.zzei();
        }
    }

    private static void zzt(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzdh.zzek();
        }
    }

    private static void zzu(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzdh.zzek();
        }
    }

    private final void zzv(int i) throws IOException {
        if (this.zznb.zzct() != i) {
            throw zzdh.zzee();
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final double readDouble() throws IOException {
        zzs(1);
        return this.zznb.readDouble();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final float readFloat() throws IOException {
        zzs(5);
        return this.zznb.readFloat();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final String readString() throws IOException {
        zzs(2);
        return this.zznb.readString();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final <T> T zza(zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        zzs(2);
        return (T) zzc(zzevVar, zzcoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final <T> void zza(List<T> list, zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        int zzcc;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzdh.zzei();
        }
        do {
            list.add(zzc(zzevVar, zzcoVar));
            if (this.zznb.zzcs() || this.zznd != 0) {
                return;
            } else {
                zzcc = this.zznb.zzcc();
            }
        } while (zzcc == i);
        this.zznd = zzcc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final <K, V> void zza(Map<K, V> map, zzea<K, V> zzeaVar, zzco zzcoVar) throws IOException {
        int zzda;
        zzs(2);
        int zzp = this.zznb.zzp(this.zznb.zzcl());
        Object obj = zzeaVar.zztc;
        Object obj2 = zzeaVar.zzte;
        while (true) {
            try {
                zzda = zzda();
            } finally {
                this.zznb.zzq(zzp);
            }
            if (zzda != Integer.MAX_VALUE && !this.zznb.zzcs()) {
                switch (zzda) {
                    case 1:
                        obj = zza(zzeaVar.zztb, (Class<?>) null, (zzco) null);
                        continue;
                    case 2:
                        obj2 = zza(zzeaVar.zztd, zzeaVar.zzte.getClass(), zzcoVar);
                        continue;
                    default:
                        try {
                        } catch (zzdi unused) {
                            if (!zzdb()) {
                                throw new zzdh("Unable to parse map entry.");
                            }
                        }
                        if (!zzdb()) {
                            throw new zzdh("Unable to parse map entry.");
                            break;
                        } else {
                            continue;
                        }
                }
                this.zznb.zzq(zzp);
            }
        }
        map.put(obj, obj2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final <T> T zzb(zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        zzs(3);
        return (T) zzd(zzevVar, zzcoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final <T> void zzb(List<T> list, zzev<T> zzevVar, zzco zzcoVar) throws IOException {
        int zzcc;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzdh.zzei();
        }
        do {
            list.add(zzd(zzevVar, zzcoVar));
            if (this.zznb.zzcs() || this.zznd != 0) {
                return;
            } else {
                zzcc = this.zznb.zzcc();
            }
        } while (zzcc == i);
        this.zznd = zzcc;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzc(List<Double> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzcl)) {
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzcl = this.zznb.zzcl();
                    zzt(zzcl);
                    int zzct = this.zznb.zzct() + zzcl;
                    do {
                        list.add(Double.valueOf(this.zznb.readDouble()));
                    } while (this.zznb.zzct() < zzct);
                    return;
                default:
                    throw zzdh.zzei();
            }
            do {
                list.add(Double.valueOf(this.zznb.readDouble()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzcl zzclVar = (zzcl) list;
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzcl2 = this.zznb.zzcl();
                zzt(zzcl2);
                int zzct2 = this.zznb.zzct() + zzcl2;
                do {
                    zzclVar.zzc(this.zznb.readDouble());
                } while (this.zznb.zzct() < zzct2);
                return;
            default:
                throw zzdh.zzei();
        }
        do {
            zzclVar.zzc(this.zznb.readDouble());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final long zzcd() throws IOException {
        zzs(0);
        return this.zznb.zzcd();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final long zzce() throws IOException {
        zzs(0);
        return this.zznb.zzce();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzcf() throws IOException {
        zzs(0);
        return this.zznb.zzcf();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final long zzcg() throws IOException {
        zzs(1);
        return this.zznb.zzcg();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzch() throws IOException {
        zzs(5);
        return this.zznb.zzch();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final boolean zzci() throws IOException {
        zzs(0);
        return this.zznb.zzci();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final String zzcj() throws IOException {
        zzs(2);
        return this.zznb.zzcj();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final zzbu zzck() throws IOException {
        zzs(2);
        return this.zznb.zzck();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzcl() throws IOException {
        zzs(0);
        return this.zznb.zzcl();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzcm() throws IOException {
        zzs(0);
        return this.zznb.zzcm();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzcn() throws IOException {
        zzs(5);
        return this.zznb.zzcn();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final long zzco() throws IOException {
        zzs(1);
        return this.zznb.zzco();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzcp() throws IOException {
        zzs(0);
        return this.zznb.zzcp();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final long zzcq() throws IOException {
        zzs(0);
        return this.zznb.zzcq();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzd(List<Float> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzcy)) {
            int i = this.tag & 7;
            if (i == 2) {
                int zzcl = this.zznb.zzcl();
                zzu(zzcl);
                int zzct = this.zznb.zzct() + zzcl;
                do {
                    list.add(Float.valueOf(this.zznb.readFloat()));
                } while (this.zznb.zzct() < zzct);
                return;
            }
            if (i != 5) {
                throw zzdh.zzei();
            }
            do {
                list.add(Float.valueOf(this.zznb.readFloat()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzcy zzcyVar = (zzcy) list;
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzcl2 = this.zznb.zzcl();
            zzu(zzcl2);
            int zzct2 = this.zznb.zzct() + zzcl2;
            do {
                zzcyVar.zzc(this.zznb.readFloat());
            } while (this.zznb.zzct() < zzct2);
            return;
        }
        if (i2 != 5) {
            throw zzdh.zzei();
        }
        do {
            zzcyVar.zzc(this.zznb.readFloat());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final int zzda() throws IOException {
        int i = this.zznd;
        if (i != 0) {
            this.tag = i;
            this.zznd = 0;
        } else {
            this.tag = this.zznb.zzcc();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zznc) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final boolean zzdb() throws IOException {
        int i;
        if (this.zznb.zzcs() || (i = this.tag) == this.zznc) {
            return false;
        }
        return this.zznb.zzn(i);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zze(List<Long> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdv)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zznb.zzcd()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Long.valueOf(this.zznb.zzcd()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdv zzdvVar = (zzdv) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdvVar.zzl(this.zznb.zzcd());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdvVar.zzl(this.zznb.zzcd());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzf(List<Long> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdv)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zznb.zzce()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Long.valueOf(this.zznb.zzce()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdv zzdvVar = (zzdv) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdvVar.zzl(this.zznb.zzce());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdvVar.zzl(this.zznb.zzce());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzg(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zznb.zzcf()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Integer.valueOf(this.zznb.zzcf()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdcVar.zzal(this.zznb.zzcf());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdcVar.zzal(this.zznb.zzcf());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzh(List<Long> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdv)) {
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzcl = this.zznb.zzcl();
                    zzt(zzcl);
                    int zzct = this.zznb.zzct() + zzcl;
                    do {
                        list.add(Long.valueOf(this.zznb.zzcg()));
                    } while (this.zznb.zzct() < zzct);
                    return;
                default:
                    throw zzdh.zzei();
            }
            do {
                list.add(Long.valueOf(this.zznb.zzcg()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzdv zzdvVar = (zzdv) list;
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzcl2 = this.zznb.zzcl();
                zzt(zzcl2);
                int zzct2 = this.zznb.zzct() + zzcl2;
                do {
                    zzdvVar.zzl(this.zznb.zzcg());
                } while (this.zznb.zzct() < zzct2);
                return;
            default:
                throw zzdh.zzei();
        }
        do {
            zzdvVar.zzl(this.zznb.zzcg());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzi(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 2) {
                int zzcl = this.zznb.zzcl();
                zzu(zzcl);
                int zzct = this.zznb.zzct() + zzcl;
                do {
                    list.add(Integer.valueOf(this.zznb.zzch()));
                } while (this.zznb.zzct() < zzct);
                return;
            }
            if (i != 5) {
                throw zzdh.zzei();
            }
            do {
                list.add(Integer.valueOf(this.zznb.zzch()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzcl2 = this.zznb.zzcl();
            zzu(zzcl2);
            int zzct2 = this.zznb.zzct() + zzcl2;
            do {
                zzdcVar.zzal(this.zznb.zzch());
            } while (this.zznb.zzct() < zzct2);
            return;
        }
        if (i2 != 5) {
            throw zzdh.zzei();
        }
        do {
            zzdcVar.zzal(this.zznb.zzch());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzj(List<Boolean> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzbs)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.zznb.zzci()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Boolean.valueOf(this.zznb.zzci()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzbs zzbsVar = (zzbs) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzbsVar.addBoolean(this.zznb.zzci());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzbsVar.addBoolean(this.zznb.zzci());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzk(List<String> list) throws IOException {
        zza(list, true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzl(List<zzbu> list) throws IOException {
        int zzcc;
        if ((this.tag & 7) != 2) {
            throw zzdh.zzei();
        }
        do {
            list.add(zzck());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc = this.zznb.zzcc();
            }
        } while (zzcc == this.tag);
        this.zznd = zzcc;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzm(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zznb.zzcl()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Integer.valueOf(this.zznb.zzcl()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdcVar.zzal(this.zznb.zzcl());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdcVar.zzal(this.zznb.zzcl());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzn(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zznb.zzcm()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Integer.valueOf(this.zznb.zzcm()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdcVar.zzal(this.zznb.zzcm());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdcVar.zzal(this.zznb.zzcm());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzo(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 2) {
                int zzcl = this.zznb.zzcl();
                zzu(zzcl);
                int zzct = this.zznb.zzct() + zzcl;
                do {
                    list.add(Integer.valueOf(this.zznb.zzcn()));
                } while (this.zznb.zzct() < zzct);
                return;
            }
            if (i != 5) {
                throw zzdh.zzei();
            }
            do {
                list.add(Integer.valueOf(this.zznb.zzcn()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzcl2 = this.zznb.zzcl();
            zzu(zzcl2);
            int zzct2 = this.zznb.zzct() + zzcl2;
            do {
                zzdcVar.zzal(this.zznb.zzcn());
            } while (this.zznb.zzct() < zzct2);
            return;
        }
        if (i2 != 5) {
            throw zzdh.zzei();
        }
        do {
            zzdcVar.zzal(this.zznb.zzcn());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzp(List<Long> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdv)) {
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzcl = this.zznb.zzcl();
                    zzt(zzcl);
                    int zzct = this.zznb.zzct() + zzcl;
                    do {
                        list.add(Long.valueOf(this.zznb.zzco()));
                    } while (this.zznb.zzct() < zzct);
                    return;
                default:
                    throw zzdh.zzei();
            }
            do {
                list.add(Long.valueOf(this.zznb.zzco()));
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc = this.zznb.zzcc();
                }
            } while (zzcc == this.tag);
            this.zznd = zzcc;
            return;
        }
        zzdv zzdvVar = (zzdv) list;
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzcl2 = this.zznb.zzcl();
                zzt(zzcl2);
                int zzct2 = this.zznb.zzct() + zzcl2;
                do {
                    zzdvVar.zzl(this.zznb.zzco());
                } while (this.zznb.zzct() < zzct2);
                return;
            default:
                throw zzdh.zzei();
        }
        do {
            zzdvVar.zzl(this.zznb.zzco());
            if (this.zznb.zzcs()) {
                return;
            } else {
                zzcc2 = this.zznb.zzcc();
            }
        } while (zzcc2 == this.tag);
        this.zznd = zzcc2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzq(List<Integer> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdc)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zznb.zzcp()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Integer.valueOf(this.zznb.zzcp()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdc zzdcVar = (zzdc) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdcVar.zzal(this.zznb.zzcp());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdcVar.zzal(this.zznb.zzcp());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeu
    public final void zzr(List<Long> list) throws IOException {
        int zzcc;
        int zzcc2;
        if (!(list instanceof zzdv)) {
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zznb.zzcq()));
                    if (this.zznb.zzcs()) {
                        return;
                    } else {
                        zzcc = this.zznb.zzcc();
                    }
                } while (zzcc == this.tag);
                this.zznd = zzcc;
                return;
            }
            if (i != 2) {
                throw zzdh.zzei();
            }
            int zzct = this.zznb.zzct() + this.zznb.zzcl();
            do {
                list.add(Long.valueOf(this.zznb.zzcq()));
            } while (this.zznb.zzct() < zzct);
            zzv(zzct);
            return;
        }
        zzdv zzdvVar = (zzdv) list;
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                zzdvVar.zzl(this.zznb.zzcq());
                if (this.zznb.zzcs()) {
                    return;
                } else {
                    zzcc2 = this.zznb.zzcc();
                }
            } while (zzcc2 == this.tag);
            this.zznd = zzcc2;
            return;
        }
        if (i2 != 2) {
            throw zzdh.zzei();
        }
        int zzct2 = this.zznb.zzct() + this.zznb.zzcl();
        do {
            zzdvVar.zzl(this.zznb.zzcq());
        } while (this.zznb.zzct() < zzct2);
        zzv(zzct2);
    }
}
