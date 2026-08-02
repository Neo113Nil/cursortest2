package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;
import e1.k;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznc zzc = zznc.zzc();

    public static zzkz zzA(zzkz zzkzVar) {
        int size = zzkzVar.size();
        return zzkzVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzC(zzlx zzlxVar, String str, Object[] objArr) {
        return new zzmi(zzlxVar, str, objArr);
    }

    public static void zzF(Class cls, zzks zzksVar) {
        zzksVar.zzE();
        zzb.put(cls, zzksVar);
    }

    public static final boolean zzH(zzks zzksVar, boolean z4) {
        byte byteValue = ((Byte) zzksVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzmg.zza().zzb(zzksVar.getClass()).zzl(zzksVar);
        if (z4) {
            zzksVar.zzh(2, true != zzl ? null : zzksVar, null);
        }
        return zzl;
    }

    private final int zzf(zzmk zzmkVar) {
        return zzmg.zza().zzb(getClass()).zza(this);
    }

    private static zzks zzg(zzks zzksVar) {
        if (zzksVar == null || zzksVar.zzo()) {
            return zzksVar;
        }
        throw new zzna(zzksVar).zza();
    }

    private static zzks zzi(zzks zzksVar, byte[] bArr, int i7, int i8, zzkd zzkdVar) {
        if (i8 == 0) {
            return zzksVar;
        }
        zzks zzt = zzksVar.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzi(zzt, bArr, 0, i8, new zzik(zzkdVar));
            zzb2.zzf(zzt);
            return zzt;
        } catch (zzlc e7) {
            if (e7.zzk()) {
                throw new zzlc(e7);
            }
            throw e7;
        } catch (zzna e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzlc) {
                throw ((zzlc) e9.getCause());
            }
            throw new zzlc(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlc.zzi();
        }
    }

    public static zzkq zzr(zzlx zzlxVar, Object obj, zzlx zzlxVar2, zzkv zzkvVar, int i7, zznm zznmVar, Class cls) {
        return new zzkq(zzlxVar, "", null, new zzkp(null, i7, zznmVar, false, false), cls);
    }

    public static zzks zzs(Class cls) {
        Map map = zzb;
        zzks zzksVar = (zzks) map.get(cls);
        if (zzksVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzksVar = (zzks) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzksVar == null) {
            zzksVar = (zzks) ((zzks) zzni.zze(cls)).zzh(6, null, null);
            if (zzksVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzksVar);
        }
        return zzksVar;
    }

    public static zzks zzu(zzks zzksVar, InputStream inputStream) {
        zzjb zzizVar;
        if (inputStream == null) {
            byte[] bArr = zzla.zzb;
            int length = bArr.length;
            zzizVar = zzjb.zzH(bArr, 0, 0, false);
        } else {
            zzizVar = new zziz(inputStream, 4096, null);
        }
        zzkd zzkdVar = zzkd.zza;
        zzks zzt = zzksVar.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzh(zzt, zzjc.zzq(zzizVar), zzkdVar);
            zzb2.zzf(zzt);
            zzg(zzt);
            return zzt;
        } catch (zzlc e7) {
            if (e7.zzk()) {
                throw new zzlc(e7);
            }
            throw e7;
        } catch (zzna e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzlc) {
                throw ((zzlc) e9.getCause());
            }
            throw new zzlc(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzlc) {
                throw ((zzlc) e10.getCause());
            }
            throw e10;
        }
    }

    public static zzks zzv(zzks zzksVar, byte[] bArr) {
        zzks zzi = zzi(zzksVar, bArr, 0, bArr.length, zzkd.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzkx zzw() {
        return zzkt.zzf();
    }

    public static zzkx zzx(zzkx zzkxVar) {
        int size = zzkxVar.size();
        return zzkxVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzky zzy() {
        return zzlm.zzf();
    }

    public static zzkz zzz() {
        return zzmh.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmg.zza().zzb(getClass()).zzk(this, (zzks) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzm();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzlz.zza(this, super.toString());
    }

    public final void zzD() {
        zzmg.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    public final void zzE() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzG(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzig
    public final int zza(zzmk zzmkVar) {
        if (zzI()) {
            int zza = zzmkVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(k.d(zza, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & f.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int zza2 = zzmkVar.zza(this);
        if (zza2 < 0) {
            throw new IllegalStateException(k.d(zza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
        return zza2;
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzaa() {
        return (zzkm) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzab() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final /* synthetic */ zzlx zzac() {
        return (zzks) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final void zze(zzjg zzjgVar) {
        zzmg.zza().zzb(getClass()).zzj(this, zzjh.zza(zzjgVar));
    }

    public abstract Object zzh(int i7, Object obj, Object obj2);

    public final int zzm() {
        return zzmg.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final int zzn() {
        int i7;
        if (zzI()) {
            i7 = zzf(null);
            if (i7 < 0) {
                throw new IllegalStateException(k.d(i7, "serialized size must be non-negative, was "));
            }
        } else {
            i7 = this.zzd & f.API_PRIORITY_OTHER;
            if (i7 == Integer.MAX_VALUE) {
                i7 = zzf(null);
                if (i7 < 0) {
                    throw new IllegalStateException(k.d(i7, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i7;
            }
        }
        return i7;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final boolean zzo() {
        return zzH(this, true);
    }

    public final zzkm zzp() {
        return (zzkm) zzh(5, null, null);
    }

    public final zzkm zzq() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    public final zzks zzt() {
        return (zzks) zzh(4, null, null);
    }
}
