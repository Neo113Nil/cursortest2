package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class zzkf extends zzke {
    @Override // com.google.android.recaptcha.internal.zzke
    public final int zza(Map.Entry entry) {
        return ((zzkp) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final zzki zzb(Object obj) {
        return ((zzko) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final zzki zzc(Object obj) {
        return ((zzko) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final Object zzd(zzkd zzkdVar, zzlx zzlxVar, int i7) {
        return zzkdVar.zza(zzlxVar, i7);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final Object zze(Object obj, zzmj zzmjVar, Object obj2, zzkd zzkdVar, zzki zzkiVar, Object obj3, zznb zznbVar) {
        Object zze;
        zzkq zzkqVar = (zzkq) obj2;
        zznm zznmVar = zzkqVar.zza.zzb;
        Object obj4 = null;
        if (zznmVar == zznm.zzn) {
            zzmjVar.zzg();
            throw null;
        }
        switch (zznmVar.ordinal()) {
            case 0:
                obj4 = Double.valueOf(zzmjVar.zza());
                break;
            case 1:
                obj4 = Float.valueOf(zzmjVar.zzb());
                break;
            case 2:
                obj4 = Long.valueOf(zzmjVar.zzl());
                break;
            case 3:
                obj4 = Long.valueOf(zzmjVar.zzo());
                break;
            case 4:
                obj4 = Integer.valueOf(zzmjVar.zzg());
                break;
            case 5:
                obj4 = Long.valueOf(zzmjVar.zzk());
                break;
            case 6:
                obj4 = Integer.valueOf(zzmjVar.zzf());
                break;
            case 7:
                obj4 = Boolean.valueOf(zzmjVar.zzN());
                break;
            case 8:
                obj4 = zzmjVar.zzr();
                break;
            case 9:
                Object zze2 = zzkiVar.zze(zzkqVar.zza);
                if (!(zze2 instanceof zzks)) {
                    throw null;
                }
                zzmk zzb = zzmg.zza().zzb(zze2.getClass());
                if (!((zzks) zze2).zzI()) {
                    Object zze3 = zzb.zze();
                    zzb.zzg(zze3, zze2);
                    zzkiVar.zzi(zzkqVar.zza, zze3);
                    zze2 = zze3;
                }
                zzmjVar.zzt(zze2, zzb, zzkdVar);
                return obj3;
            case 10:
                Object zze4 = zzkiVar.zze(zzkqVar.zza);
                if (!(zze4 instanceof zzks)) {
                    throw null;
                }
                zzmk zzb2 = zzmg.zza().zzb(zze4.getClass());
                if (!((zzks) zze4).zzI()) {
                    Object zze5 = zzb2.zze();
                    zzb2.zzg(zze5, zze4);
                    zzkiVar.zzi(zzkqVar.zza, zze5);
                    zze4 = zze5;
                }
                zzmjVar.zzu(zze4, zzb2, zzkdVar);
                return obj3;
            case 11:
                obj4 = zzmjVar.zzp();
                break;
            case 12:
                obj4 = Integer.valueOf(zzmjVar.zzj());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                obj4 = Integer.valueOf(zzmjVar.zzh());
                break;
            case 15:
                obj4 = Long.valueOf(zzmjVar.zzm());
                break;
            case 16:
                obj4 = Integer.valueOf(zzmjVar.zzi());
                break;
            case 17:
                obj4 = Long.valueOf(zzmjVar.zzn());
                break;
        }
        int ordinal = zzkqVar.zza.zzb.ordinal();
        if ((ordinal == 9 || ordinal == 10) && (zze = zzkiVar.zze(zzkqVar.zza)) != null) {
            byte[] bArr = zzla.zzb;
            obj4 = ((zzlx) zze).zzab().zzc((zzlx) obj4).zzk();
        }
        zzkiVar.zzi(zzkqVar.zza, obj4);
        return obj3;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zzf(Object obj) {
        ((zzko) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zzg(zzmj zzmjVar, Object obj, zzkd zzkdVar, zzki zzkiVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zzh(zziv zzivVar, Object obj, zzkd zzkdVar, zzki zzkiVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zzi(zzno zznoVar, Map.Entry entry) {
        zzkp zzkpVar = (zzkp) entry.getKey();
        zznm zznmVar = zznm.zza;
        switch (zzkpVar.zzb.ordinal()) {
            case 0:
                zznoVar.zzf(zzkpVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zznoVar.zzo(zzkpVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zznoVar.zzt(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zznoVar.zzK(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zznoVar.zzm(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zznoVar.zzk(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zznoVar.zzb(zzkpVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zznoVar.zzG(zzkpVar.zza, (String) entry.getValue());
                break;
            case 9:
                zznoVar.zzq(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zznoVar.zzv(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zznoVar.zzd(zzkpVar.zza, (zziv) entry.getValue());
                break;
            case 12:
                zznoVar.zzI(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zznoVar.zzx(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zznoVar.zzz(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zznoVar.zzB(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zznoVar.zzD(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final boolean zzj(zzlx zzlxVar) {
        return zzlxVar instanceof zzko;
    }
}
