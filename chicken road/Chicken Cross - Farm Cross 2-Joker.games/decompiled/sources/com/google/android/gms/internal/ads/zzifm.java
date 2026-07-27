package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzifm<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidr<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zzifm<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zziib zzt = zziib.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzifu zzbC() {
        return zzifn.zzd();
    }

    protected static zzifu zzbD(zzifu zzifuVar) {
        int size = zzifuVar.size();
        return zzifuVar.zzh(size + size);
    }

    protected static zzifx zzbE() {
        return zzigk.zzg();
    }

    protected static zzifx zzbF(zzifx zzifxVar) {
        int size = zzifxVar.size();
        return zzifxVar.zzh(size + size);
    }

    protected static zzift zzbG() {
        return zzifd.zzd();
    }

    protected static zzift zzbH(zzift zziftVar) {
        int size = zziftVar.size();
        return zziftVar.zzh(size + size);
    }

    protected static zzifp zzbI() {
        return zziet.zzd();
    }

    protected static zzifp zzbJ(zzifp zzifpVar) {
        int size = zzifpVar.size();
        return zzifpVar.zzh(size + size);
    }

    protected static zzifo zzbK() {
        return zzidy.zzd();
    }

    protected static zzifo zzbL(zzifo zzifoVar) {
        int size = zzifoVar.size();
        return zzifoVar.zzh(size + size);
    }

    protected static <E> zzify<E> zzbM() {
        return zzihh.zzd();
    }

    protected static <E> zzify<E> zzbN(zzify<E> zzifyVar) {
        int size = zzifyVar.size();
        return zzifyVar.zzh(size + size);
    }

    static <T extends zzifm<T, ?>> T zzbO(T t, zziem zziemVar, zziew zziewVar) throws zzige {
        T t2 = (T) t.zzbg();
        try {
            zziho zzb2 = zzihg.zza().zzb(t2.getClass());
            zzb2.zzg(t2, zzien.zza(zziemVar), zziewVar);
            zzb2.zzk(t2);
            return t2;
        } catch (zzige e) {
            if (e.zzb()) {
                throw new zzige(e);
            }
            throw e;
        } catch (zzihz e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzige) {
                throw ((zzige) e3.getCause());
            }
            throw new zzige(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzige) {
                throw ((zzige) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzifm<T, ?>> T zzbP(T t, zziem zziemVar) throws zzige {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        return (T) zzbO(t, zziemVar, zziew.zza);
    }

    protected static <T extends zzifm<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zziew zziewVar) throws zzige {
        zziem zzI;
        int i = zziem.zze;
        if (byteBuffer.hasArray()) {
            zzI = zziem.zzI(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzI = zziem.zzI(bArr, 0, remaining, true);
        }
        T t2 = (T) zzbZ(t, zzI, zziewVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzige {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        return (T) zzbQ(t, byteBuffer, zziew.zza);
    }

    protected static <T extends zzifm<T, ?>> T zzbS(T t, zziei zzieiVar) throws zzige {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        T t2 = (T) zzbT(t, zzieiVar, zziew.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbT(T t, zziei zzieiVar, zziew zziewVar) throws zzige {
        T t2 = (T) zzj(t, zzieiVar, zziewVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbU(T t, byte[] bArr) throws zzige {
        int length = bArr.length;
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zziew.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbV(T t, byte[] bArr, zziew zziewVar) throws zzige {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zziewVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbW(T t, InputStream inputStream) throws zzige {
        zziem zzH = zziem.zzH(inputStream, 4096);
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        T t2 = (T) zzbO(t, zzH, zziew.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbX(T t, InputStream inputStream, zziew zziewVar) throws zzige {
        T t2 = (T) zzbO(t, zziem.zzH(inputStream, 4096), zziewVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzbY(T t, zziem zziemVar) throws zzige {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        return (T) zzbZ(t, zziemVar, zziew.zza);
    }

    protected static <T extends zzifm<T, ?>> T zzbZ(T t, zziem zziemVar, zziew zziewVar) throws zzige {
        T t2 = (T) zzbO(t, zziemVar, zziewVar);
        zzi(t2);
        return t2;
    }

    static <T extends zzifm> T zzbt(Class<T> cls) {
        Map<Class<?>, zzifm<?, ?>> map = zzd;
        zzifm<?, ?> zzifmVar = map.get(cls);
        if (zzifmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzifmVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzifmVar == null) {
            zzifmVar = ((zzifm) zziih.zza(cls)).zzbw();
            if (zzifmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzifmVar);
        }
        return zzifmVar;
    }

    protected static <T extends zzifm> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static Object zzbv(zzigw zzigwVar, String str, Object[] objArr) {
        return new zzihi(zzigwVar, str, objArr);
    }

    public static <ContainingType extends zzigw, Type> zzifk<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzigw zzigwVar, zzifr zzifrVar, int i, zziin zziinVar, Class cls) {
        return new zzifk<>(containingtype, type, zzigwVar, new zzifj(zzifrVar, i, zziinVar, false, false), cls);
    }

    public static <ContainingType extends zzigw, Type> zzifk<ContainingType, Type> zzbz(ContainingType containingtype, zzigw zzigwVar, zzifr zzifrVar, int i, zziin zziinVar, boolean z, Class cls) {
        return new zzifk<>(containingtype, zzihh.zzd(), zzigwVar, new zzifj(zzifrVar, i, zziinVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zziib.zza()) {
            this.zzt = zziib.zzb();
        }
    }

    protected static <T extends zzifm<T, ?>> T zzca(T t, InputStream inputStream) throws zzige {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        T t2 = (T) zzk(t, inputStream, zziew.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzifm<T, ?>> T zzcb(T t, InputStream inputStream, zziew zziewVar) throws zzige {
        T t2 = (T) zzk(t, inputStream, zziewVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zziho<?> zzihoVar) {
        if (zzihoVar != null) {
            return zzihoVar.zze(this);
        }
        return zzihg.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzifi<MessageType, BuilderType>, BuilderType, T> zzifk<MessageType, T> zze(zzieu<MessageType, T> zzieuVar) {
        return (zzifk) zzieuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzifm<T, ?>> boolean zzg(T t, boolean z) {
        byte byteValue = ((Byte) t.zzdd(zzifl.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzihg.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdd(zzifl.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, null);
        }
        return zzl;
    }

    private static <T extends zzifm<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zziew zziewVar) throws zzige {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zziho zzb2 = zzihg.zza().zzb(t2.getClass());
            zzb2.zzj(t2, bArr, i, i + i2, new zzidw(zziewVar));
            zzb2.zzk(t2);
            return t2;
        } catch (zzige e) {
            if (e.zzb()) {
                throw new zzige(e);
            }
            throw e;
        } catch (zzihz e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzige) {
                throw ((zzige) e3.getCause());
            }
            throw new zzige(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzifm<T, ?>> T zzi(T t) throws zzige {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzifm<T, ?>> T zzj(T t, zziei zzieiVar, zziew zziewVar) throws zzige {
        zziem zzm = zzieiVar.zzm();
        T t2 = (T) zzbO(t, zzm, zziewVar);
        zzm.zzb(0);
        return t2;
    }

    private static <T extends zzifm<T, ?>> T zzk(T t, InputStream inputStream, zziew zziewVar) throws zzige {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zziem zzH = zziem.zzH(new zzidp(inputStream, zziem.zzO(read, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzH, zziewVar);
            zzH.zzb(0);
            return t2;
        } catch (zzige e) {
            if (e.zzb()) {
                throw new zzige(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzige(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzihg.zza().zzb(getClass()).zzb(this, (zzifm) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzigy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    final int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    int zzaT(zziho zzihoVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int zzd2 = zzd(zzihoVar);
            zzaR(zzd2);
            return zzd2;
        }
        int zzd3 = zzd(zzihoVar);
        if (zzd3 >= 0) {
            return zzd3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzd3).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(zzd3);
        throw new IllegalStateException(sb.toString());
    }

    final boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    final void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    final int zzaZ() {
        return this.zzq;
    }

    final void zzba(int i) {
        this.zzq = i;
    }

    final void zzbb() {
        this.zzq = 0;
    }

    final boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final zzihe<MessageType> zzbd() {
        return (zzihe) zzdd(zzifl.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdd(zzifl.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdd(zzifl.NEW_BUILDER, null, null);
    }

    final MessageType zzbg() {
        return (MessageType) zzdd(zzifl.NEW_MUTABLE_INSTANCE, null, null);
    }

    final int zzbh() {
        return zzihg.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected final boolean zzbj(int i, zziem zziemVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zziemVar);
    }

    protected final void zzbk(int i, int i2) {
        zzc();
        zziib zziibVar = this.zzt;
        zziibVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziibVar.zzk(i << 3, Long.valueOf(i2));
    }

    protected final void zzbl(int i, zziei zzieiVar) {
        zzc();
        zziib zziibVar = this.zzt;
        zziibVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziibVar.zzk((i << 3) | 2, zzieiVar);
    }

    protected final void zzbm() {
        zzihg.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzifm<MessageType2, BuilderType2>, BuilderType2 extends zzifg<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdd(zzifl.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzifm<MessageType2, BuilderType2>, BuilderType2 extends zzifg<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdd(zzifl.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    final void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public int zzbr() {
        return zzaT(null);
    }

    final Object zzbs() throws Exception {
        return zzdd(zzifl.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zziib zziibVar) {
        this.zzt = zziib.zzc(this.zzt, zziibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public void zzcX(zzier zzierVar) throws IOException {
        zzihg.zza().zzb(getClass()).zzf(this, zzies.zza(zzierVar));
    }

    protected abstract Object zzdd(zzifl zziflVar, Object obj, Object obj2);
}
