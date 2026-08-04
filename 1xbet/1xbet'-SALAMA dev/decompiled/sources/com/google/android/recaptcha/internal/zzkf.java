package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
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
        Object objZze;
        zzkq zzkqVar = (zzkq) obj2;
        zznm zznmVar = zzkqVar.zza.zzb;
        Object objZzk = null;
        if (zznmVar == zznm.zzn) {
            zzmjVar.zzg();
            throw null;
        }
        switch (zznmVar.ordinal()) {
            case 0:
                objZzk = Double.valueOf(zzmjVar.zza());
                break;
            case 1:
                objZzk = Float.valueOf(zzmjVar.zzb());
                break;
            case 2:
                objZzk = Long.valueOf(zzmjVar.zzl());
                break;
            case 3:
                objZzk = Long.valueOf(zzmjVar.zzo());
                break;
            case 4:
                objZzk = Integer.valueOf(zzmjVar.zzg());
                break;
            case 5:
                objZzk = Long.valueOf(zzmjVar.zzk());
                break;
            case 6:
                objZzk = Integer.valueOf(zzmjVar.zzf());
                break;
            case 7:
                objZzk = Boolean.valueOf(zzmjVar.zzN());
                break;
            case 8:
                objZzk = zzmjVar.zzr();
                break;
            case 9:
                Object objZze2 = zzkiVar.zze(zzkqVar.zza);
                if (!(objZze2 instanceof zzks)) {
                    throw null;
                }
                zzmk zzmkVarZzb = zzmg.zza().zzb(objZze2.getClass());
                if (!((zzks) objZze2).zzI()) {
                    Object objZze3 = zzmkVarZzb.zze();
                    zzmkVarZzb.zzg(objZze3, objZze2);
                    zzkiVar.zzi(zzkqVar.zza, objZze3);
                    objZze2 = objZze3;
                }
                zzmjVar.zzt(objZze2, zzmkVarZzb, zzkdVar);
                return obj3;
            case 10:
                Object objZze4 = zzkiVar.zze(zzkqVar.zza);
                if (!(objZze4 instanceof zzks)) {
                    throw null;
                }
                zzmk zzmkVarZzb2 = zzmg.zza().zzb(objZze4.getClass());
                if (!((zzks) objZze4).zzI()) {
                    Object objZze5 = zzmkVarZzb2.zze();
                    zzmkVarZzb2.zzg(objZze5, objZze4);
                    zzkiVar.zzi(zzkqVar.zza, objZze5);
                    objZze4 = objZze5;
                }
                zzmjVar.zzu(objZze4, zzmkVarZzb2, zzkdVar);
                return obj3;
            case 11:
                objZzk = zzmjVar.zzp();
                break;
            case 12:
                objZzk = Integer.valueOf(zzmjVar.zzj());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                objZzk = Integer.valueOf(zzmjVar.zzh());
                break;
            case 15:
                objZzk = Long.valueOf(zzmjVar.zzm());
                break;
            case 16:
                objZzk = Integer.valueOf(zzmjVar.zzi());
                break;
            case 17:
                objZzk = Long.valueOf(zzmjVar.zzn());
                break;
        }
        int iOrdinal = zzkqVar.zza.zzb.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objZze = zzkiVar.zze(zzkqVar.zza)) != null) {
            byte[] bArr = zzla.zzb;
            objZzk = ((zzlx) objZze).zzab().zzc((zzlx) objZzk).zzk();
        }
        zzkiVar.zzi(zzkqVar.zza, objZzk);
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
