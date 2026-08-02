package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzgxa;
import com.google.android.gms.internal.ads.zzgxg;
import e1.k;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w1.L;

/* loaded from: classes.dex */
public abstract class zzgxg<MessageType extends zzgxg<MessageType, BuilderType>, BuilderType extends zzgxa<MessageType, BuilderType>> extends zzgvh<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgxg<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzgzx zzt = zzgzx.zzc();

    public static zzgxi zzbA() {
        return zzgvo.zzd();
    }

    public static zzgxi zzbB(zzgxi zzgxiVar) {
        int size = zzgxiVar.size();
        return zzgxiVar.zzf(size + size);
    }

    public static zzgxj zzbC() {
        return zzgwn.zze();
    }

    public static zzgxj zzbD(zzgxj zzgxjVar) {
        int size = zzgxjVar.size();
        return zzgxjVar.zzf(size + size);
    }

    public static zzgxn zzbE() {
        return zzgwx.zze();
    }

    public static zzgxn zzbF(zzgxn zzgxnVar) {
        int size = zzgxnVar.size();
        return zzgxnVar.zzf(size + size);
    }

    public static zzgxo zzbG() {
        return zzgxh.zzg();
    }

    public static zzgxo zzbH(zzgxo zzgxoVar) {
        int size = zzgxoVar.size();
        return zzgxoVar.zzf(size + size);
    }

    public static zzgxr zzbI() {
        return zzgyg.zzh();
    }

    public static zzgxr zzbJ(zzgxr zzgxrVar) {
        int size = zzgxrVar.size();
        return zzgxrVar.zzf(size + size);
    }

    public static <E> zzgxs<E> zzbK() {
        return zzgzc.zzd();
    }

    public static <E> zzgxs<E> zzbL(zzgxs<E> zzgxsVar) {
        int size = zzgxsVar.size();
        return zzgxsVar.zzf(size + size);
    }

    public static Object zzbP(Method method, Object obj, Object... objArr) {
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

    public static Object zzbQ(zzgyr zzgyrVar, String str, Object[] objArr) {
        return new zzgzd(zzgyrVar, str, objArr);
    }

    public static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(L.j("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e7);
        }
    }

    public static <T extends zzgxg> void zzbZ(Class<T> cls, T t7) {
        t7.zzbV();
        zzc.put(cls, t7);
    }

    public static <ContainingType extends zzgyr, Type> zzgxe<ContainingType, Type> zzbe(ContainingType containingtype, zzgyr zzgyrVar, zzgxl zzgxlVar, int i7, zzhaj zzhajVar, boolean z4, Class cls) {
        return new zzgxe<>(containingtype, zzgzc.zzd(), zzgyrVar, new zzgxd(zzgxlVar, i7, zzhajVar, true, z4), cls);
    }

    public static <ContainingType extends zzgyr, Type> zzgxe<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgyr zzgyrVar, zzgxl zzgxlVar, int i7, zzhaj zzhajVar, Class cls) {
        return new zzgxe<>(containingtype, type, zzgyrVar, new zzgxd(zzgxlVar, i7, zzhajVar, false, false), cls);
    }

    public static <T extends zzgxg> T zzbh(Class<T> cls) {
        zzgxg<?, ?> zzgxgVar = zzc.get(cls);
        if (zzgxgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgxgVar = zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzgxgVar == null) {
            zzgxgVar = ((zzgxg) zzhad.zzg(cls)).zzbt();
            if (zzgxgVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzgxgVar);
        }
        return zzgxgVar;
    }

    public static <T extends zzgxg<T, ?>> T zzbk(T t7, InputStream inputStream) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        T t8 = (T) zzg(t7, inputStream, zzgwq.zza);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbl(T t7, InputStream inputStream, zzgwq zzgwqVar) {
        T t8 = (T) zzg(t7, inputStream, zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbm(T t7, zzgvy zzgvyVar) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        T t8 = (T) zzbr(t7, zzgvyVar, zzgwq.zza);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbn(T t7, zzgwe zzgweVar) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        return (T) zzbs(t7, zzgweVar, zzgwq.zza);
    }

    public static <T extends zzgxg<T, ?>> T zzbo(T t7, InputStream inputStream) {
        zzgwe zzG = zzgwe.zzG(inputStream, 4096);
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        T t8 = (T) zzbz(t7, zzG, zzgwq.zza);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbp(T t7, ByteBuffer byteBuffer) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        return (T) zzbv(t7, byteBuffer, zzgwq.zza);
    }

    public static <T extends zzgxg<T, ?>> T zzbq(T t7, byte[] bArr) {
        int length = bArr.length;
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        T t8 = (T) zzi(t7, bArr, 0, length, zzgwq.zza);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbr(T t7, zzgvy zzgvyVar, zzgwq zzgwqVar) {
        T t8 = (T) zzh(t7, zzgvyVar, zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbs(T t7, zzgwe zzgweVar, zzgwq zzgwqVar) {
        T t8 = (T) zzbz(t7, zzgweVar, zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbu(T t7, InputStream inputStream, zzgwq zzgwqVar) {
        T t8 = (T) zzbz(t7, zzgwe.zzG(inputStream, 4096), zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbv(T t7, ByteBuffer byteBuffer, zzgwq zzgwqVar) {
        zzgwe zzH;
        boolean z4 = false;
        if (byteBuffer.hasArray()) {
            zzH = zzgwe.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhad.zzB()) {
            zzH = new zzgwc(byteBuffer, z4, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzgwe.zzH(bArr, 0, remaining, true);
        }
        T t8 = (T) zzbs(t7, zzH, zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzbx(T t7, byte[] bArr, zzgwq zzgwqVar) {
        T t8 = (T) zzi(t7, bArr, 0, bArr.length, zzgwqVar);
        zzf(t8);
        return t8;
    }

    public static <T extends zzgxg<T, ?>> T zzby(T t7, zzgwe zzgweVar) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        return (T) zzbz(t7, zzgweVar, zzgwq.zza);
    }

    public static <T extends zzgxg<T, ?>> T zzbz(T t7, zzgwe zzgweVar, zzgwq zzgwqVar) {
        T t8 = (T) t7.zzbj();
        try {
            zzgzk zzb2 = zzgzb.zza().zzb(t8.getClass());
            zzb2.zzh(t8, zzgwf.zzq(zzgweVar), zzgwqVar);
            zzb2.zzf(t8);
            return t8;
        } catch (zzgxv e7) {
            if (e7.zzb()) {
                throw new zzgxv(e7);
            }
            throw e7;
        } catch (zzgzv e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzgxv) {
                throw ((zzgxv) e9.getCause());
            }
            throw new zzgxv(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzgxv) {
                throw ((zzgxv) e10.getCause());
            }
            throw e10;
        }
    }

    private int zzc(zzgzk<?> zzgzkVar) {
        if (zzgzkVar != null) {
            return zzgzkVar.zza(this);
        }
        return zzgzb.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgxc<MessageType, BuilderType>, BuilderType, T> zzgxe<MessageType, T> zzd(zzgwo<MessageType, T> zzgwoVar) {
        return (zzgxe) zzgwoVar;
    }

    private static <T extends zzgxg<T, ?>> T zzf(T t7) {
        if (t7 == null || t7.zzbw()) {
            return t7;
        }
        throw t7.zzaP().zza();
    }

    private static <T extends zzgxg<T, ?>> T zzg(T t7, InputStream inputStream, zzgwq zzgwqVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgwe zzG = zzgwe.zzG(new zzgvf(inputStream, zzgwe.zzE(read, inputStream)), 4096);
            T t8 = (T) zzbz(t7, zzG, zzgwqVar);
            zzG.zzy(0);
            return t8;
        } catch (zzgxv e7) {
            if (e7.zzb()) {
                throw new zzgxv(e7);
            }
            throw e7;
        } catch (IOException e8) {
            throw new zzgxv(e8);
        }
    }

    private static <T extends zzgxg<T, ?>> T zzh(T t7, zzgvy zzgvyVar, zzgwq zzgwqVar) {
        zzgwe zzl = zzgvyVar.zzl();
        T t8 = (T) zzbz(t7, zzl, zzgwqVar);
        zzl.zzy(0);
        return t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgxg<T, ?>> T zzi(T t7, byte[] bArr, int i7, int i8, zzgwq zzgwqVar) {
        if (i8 == 0) {
            return t7;
        }
        T t8 = (T) t7.zzbj();
        try {
            zzgzk zzb2 = zzgzb.zza().zzb(t8.getClass());
            zzb2.zzi(t8, bArr, i7, i7 + i8, new zzgvm(zzgwqVar));
            zzb2.zzf(t8);
            return t8;
        } catch (zzgxv e7) {
            if (e7.zzb()) {
                throw new zzgxv(e7);
            }
            throw e7;
        } catch (zzgzv e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzgxv) {
                throw ((zzgxv) e9.getCause());
            }
            throw new zzgxv(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzgzx.zzc()) {
            this.zzt = zzgzx.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzgxg<T, ?>> boolean zzk(T t7, boolean z4) {
        byte byteValue = ((Byte) t7.zzdc(zzgxf.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzgzb.zza().zzb(t7.getClass()).zzl(t7);
        if (z4) {
            t7.zzdc(zzgxf.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t7, null);
        }
        return zzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgzb.zza().zzb(getClass()).zzk(this, (zzgxg) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgyt.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public int zzaL() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public int zzaM(zzgzk zzgzkVar) {
        if (zzcd()) {
            int zzc2 = zzc(zzgzkVar);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException(k.d(zzc2, "serialized size must be non-negative, was "));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int zzc3 = zzc(zzgzkVar);
        zzaS(zzc3);
        return zzc3;
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public zzgyw zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public void zzaS(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(k.d(i7, "serialized size must be non-negative, was "));
        }
        this.zzd = i7 | (this.zzd & zza);
    }

    public int zzaW() {
        return zzgzb.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzgxg<MessageType, BuilderType>, BuilderType extends zzgxa<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzdc(zzgxf.NEW_BUILDER, null, null);
    }

    public final zzgyz<MessageType> zzbN() {
        return (zzgyz) zzdc(zzgxf.GET_PARSER, null, null);
    }

    public Object zzbO() {
        return zzdc(zzgxf.BUILD_MESSAGE_INFO, null, null);
    }

    public void zzbS() {
        this.zzq = 0;
    }

    public void zzbT() {
        zzaS(f.API_PRIORITY_OTHER);
    }

    public void zzbU() {
        zzgzb.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    public void zzbV() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public void zzbW(int i7, zzgvy zzgvyVar) {
        zzj();
        zzgzx zzgzxVar = this.zzt;
        zzgzxVar.zzg();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzgzxVar.zzj((i7 << 3) | 2, zzgvyVar);
    }

    public final void zzbX(zzgzx zzgzxVar) {
        this.zzt = zzgzx.zze(this.zzt, zzgzxVar);
    }

    public void zzbY(int i7, int i8) {
        zzj();
        zzgzx zzgzxVar = this.zzt;
        zzgzxVar.zzg();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzgzxVar.zzj(i7 << 3, Long.valueOf(i8));
    }

    public final <MessageType extends zzgxg<MessageType, BuilderType>, BuilderType extends zzgxa<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcX() {
        return (BuilderType) zzdc(zzgxf.NEW_BUILDER, null, null);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdc(zzgxf.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzdc(zzgxf.GET_DEFAULT_INSTANCE, null, null);
    }

    public MessageType zzbj() {
        return (MessageType) zzdc(zzgxf.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public void zzcY(zzgwl zzgwlVar) {
        zzgzb.zza().zzb(getClass()).zzj(this, zzgwm.zza(zzgwlVar));
    }

    public void zzca(int i7) {
        this.zzq = i7;
    }

    public boolean zzcc() {
        return zzaX() == 0;
    }

    public boolean zzcd() {
        return (this.zzd & zza) != 0;
    }

    public boolean zzce(int i7, zzgwe zzgweVar) {
        if ((i7 & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i7, zzgweVar);
    }

    public abstract Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2);
}
