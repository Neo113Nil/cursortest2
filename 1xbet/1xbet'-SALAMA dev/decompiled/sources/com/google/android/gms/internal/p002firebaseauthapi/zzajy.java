package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.firebase-auth-api.zzajy.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzajy<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaif<MessageType, BuilderType> {
    private static Map<Class<?>, zzajy<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamn zzb = zzamn.zzc();

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajy<MessageType, BuilderType> implements zzale {
        protected zzajr<zze> zzc = zzajr.zzb();

        public final zzajr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class zzc<T extends zzajy<T, ?>> extends zzaig<T> {
        public zzc(T t7) {
        }
    }

    public static class zzd<ContainingType extends zzalc, Type> extends zzajl<ContainingType, Type> {
    }

    public static final class zze implements zzajt<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzamw zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzand zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzalf zza(zzalf zzalfVar, zzalc zzalcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzall zza(zzall zzallVar, zzall zzallVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static final enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzalr.zza().zza(this).zzb(this);
    }

    private final int zzb(zzalv<?> zzalvVar) {
        return zzalvVar == null ? zzalr.zza().zza(this).zza(this) : zzalvVar.zza(this);
    }

    public static <E> zzakc<E> zzp() {
        return zzalq.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalr.zza().zza(this).zzb(this, (zzajy) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzalh.zza(this, super.toString());
    }

    public abstract Object zza(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final /* synthetic */ zzalc zzg() {
        return (zzajy) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    public final int zzi() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final boolean zzj() {
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final int zzl() {
        return zza((zzalv) null);
    }

    public final <MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final void zzs() {
        zzalr.zza().zza(this).zzd(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    public final int zza(zzalv zzalvVar) {
        if (zzu()) {
            int iZzb = zzb((zzalv<?>) zzalvVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException(k.d(iZzb, "serialized size must be non-negative, was "));
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int iZzb2 = zzb((zzalv<?>) zzalvVar);
        zzb(iZzb2);
        return iZzb2;
    }

    private static <T extends zzajy<T, ?>> T zzb(T t7, zzaip zzaipVar, zzajk zzajkVar) {
        zzajb zzajbVarZzc = zzaipVar.zzc();
        T t8 = (T) zza(t7, zzajbVarZzc, zzajkVar);
        zzajbVarZzc.zzb(0);
        return t8;
    }

    public static abstract class zza<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaie<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzf();
            return zzaVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        /* JADX INFO: renamed from: zzb */
        public final /* synthetic */ zzaie clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (zzajy.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzaml(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final /* synthetic */ zzalc zzg() {
            return this.zzb;
        }

        public final void zzh() {
            if (this.zza.zzu()) {
                return;
            }
            zzi();
        }

        public void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final boolean zzj() {
            return zzajy.zza(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalr.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    public final void zzb(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(k.d(i7, "serialized size must be non-negative, was "));
    }

    private static <T extends zzajy<T, ?>> T zza(T t7) throws zzakf {
        if (t7 == null || zza((zzajy) t7, true)) {
            return t7;
        }
        zzakf zzakfVarZza = new zzaml(t7).zza();
        zzakfVarZza.getClass();
        throw zzakfVarZza;
    }

    public static <T extends zzajy<?, ?>> T zza(Class<T> cls) {
        zzajy<?, ?> zzajyVar = zzc.get(cls);
        if (zzajyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajyVar = zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzajyVar == null) {
            zzajyVar = (T) ((zzajy) zzamp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzajyVar != null) {
                zzc.put((Class<?>) cls, zzajyVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzajyVar;
    }

    public static <T extends zzajy<T, ?>> T zza(T t7, zzaip zzaipVar, zzajk zzajkVar) {
        return (T) zza(zzb(t7, zzaipVar, zzajkVar));
    }

    public static <T extends zzajy<T, ?>> T zza(T t7, InputStream inputStream, zzajk zzajkVar) {
        zzajb zzajdVar;
        if (inputStream == null) {
            byte[] bArr = zzakb.zzb;
            zzajdVar = zzajb.zza(bArr, 0, bArr.length, false);
        } else {
            zzajdVar = new zzajd(inputStream);
        }
        return (T) zza(zza(t7, zzajdVar, zzajkVar));
    }

    public static <T extends zzajy<T, ?>> T zza(T t7, byte[] bArr, zzajk zzajkVar) {
        return (T) zza(zza(t7, bArr, 0, bArr.length, zzajkVar));
    }

    private static <T extends zzajy<T, ?>> T zza(T t7, zzajb zzajbVar, zzajk zzajkVar) throws zzakf {
        T t8 = (T) t7.zzo();
        try {
            zzalv zzalvVarZza = zzalr.zza().zza(t8);
            zzalvVarZza.zza(t8, zzajf.zza(zzajbVar), zzajkVar);
            zzalvVarZza.zzd(t8);
            return t8;
        } catch (zzakf e7) {
            if (e7.zzl()) {
                throw new zzakf(e7);
            }
            throw e7;
        } catch (zzaml e8) {
            zzakf zzakfVarZza = e8.zza();
            zzakfVarZza.getClass();
            throw zzakfVarZza;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzakf) {
                throw ((zzakf) e9.getCause());
            }
            throw new zzakf(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzakf) {
                throw ((zzakf) e10.getCause());
            }
            throw e10;
        }
    }

    private static <T extends zzajy<T, ?>> T zza(T t7, byte[] bArr, int i7, int i8, zzajk zzajkVar) throws zzakf {
        if (i8 == 0) {
            return t7;
        }
        T t8 = (T) t7.zzo();
        try {
            zzalv zzalvVarZza = zzalr.zza().zza(t8);
            zzalvVarZza.zza(t8, bArr, 0, i8, new zzaik(zzajkVar));
            zzalvVarZza.zzd(t8);
            return t8;
        } catch (zzakf e7) {
            if (e7.zzl()) {
                throw new zzakf(e7);
            }
            throw e7;
        } catch (zzaml e8) {
            zzakf zzakfVarZza = e8.zza();
            zzakfVarZza.getClass();
            throw zzakfVarZza;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzakf) {
                throw ((zzakf) e9.getCause());
            }
            throw new zzakf(e9);
        } catch (IndexOutOfBoundsException unused) {
            zzakf zzakfVarZzj = zzakf.zzj();
            zzakfVarZzj.getClass();
            throw zzakfVarZzj;
        }
    }

    public static <E> zzakc<E> zza(zzakc<E> zzakcVar) {
        return zzakcVar.zza(zzakcVar.size() << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzalc zzalcVar, String str, Object[] objArr) {
        return new zzalt(zzalcVar, str, objArr);
    }

    public static <T extends zzajy<?, ?>> void zza(Class<T> cls, T t7) {
        t7.zzt();
        zzc.put(cls, t7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zza(zzajg zzajgVar) {
        zzalr.zza().zza(this).zza(this, zzajj.zza(zzajgVar));
    }

    public static final <T extends zzajy<T, ?>> boolean zza(T t7, boolean z4) {
        byte bByteValue = ((Byte) t7.zza(zzf.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzalr.zza().zza(t7).zze(t7);
        if (z4) {
            t7.zza(zzf.zzb, zZze ? t7 : null, null);
        }
        return zZze;
    }
}
