package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zziee<MessageType extends com.google.android.gms.internal.ads.zziee<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzidy<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzicj<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.ads.zziee<?, ?>> zzd = new java.util.concurrent.ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected com.google.android.gms.internal.ads.zzigu zzt = com.google.android.gms.internal.ads.zzigu.zza();

    static java.lang.reflect.Method zzbA(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.String name = cls.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 43 + java.lang.String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    static java.lang.Object zzbB(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static com.google.android.gms.internal.ads.zziem zzbC() {
        return com.google.android.gms.internal.ads.zzief.zzd();
    }

    protected static com.google.android.gms.internal.ads.zziem zzbD(com.google.android.gms.internal.ads.zziem zziemVar) {
        int size = zziemVar.size();
        return zziemVar.zzh(size + size);
    }

    protected static com.google.android.gms.internal.ads.zziep zzbE() {
        return com.google.android.gms.internal.ads.zzifd.zzg();
    }

    protected static com.google.android.gms.internal.ads.zziep zzbF(com.google.android.gms.internal.ads.zziep zziepVar) {
        int size = zziepVar.size();
        return zziepVar.zzh(size + size);
    }

    protected static com.google.android.gms.internal.ads.zziel zzbG() {
        return com.google.android.gms.internal.ads.zzidv.zzd();
    }

    protected static com.google.android.gms.internal.ads.zziel zzbH(com.google.android.gms.internal.ads.zziel zzielVar) {
        int size = zzielVar.size();
        return zzielVar.zzh(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzieh zzbI() {
        return com.google.android.gms.internal.ads.zzidl.zzd();
    }

    protected static com.google.android.gms.internal.ads.zzieh zzbJ(com.google.android.gms.internal.ads.zzieh zziehVar) {
        int size = zziehVar.size();
        return zziehVar.zzh(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzieg zzbK() {
        return com.google.android.gms.internal.ads.zzicq.zzd();
    }

    protected static com.google.android.gms.internal.ads.zzieg zzbL(com.google.android.gms.internal.ads.zzieg zziegVar) {
        int size = zziegVar.size();
        return zziegVar.zzh(size + size);
    }

    protected static <E> com.google.android.gms.internal.ads.zzieq<E> zzbM() {
        return com.google.android.gms.internal.ads.zziga.zzd();
    }

    protected static <E> com.google.android.gms.internal.ads.zzieq<E> zzbN(com.google.android.gms.internal.ads.zzieq<E> zzieqVar) {
        int size = zzieqVar.size();
        return zzieqVar.zzh(size + size);
    }

    static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbO(T t, com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) t.zzbg();
        try {
            com.google.android.gms.internal.ads.zzigh zzb2 = com.google.android.gms.internal.ads.zzifz.zza().zzb(t2.getClass());
            zzb2.zzg(t2, com.google.android.gms.internal.ads.zzidf.zza(zzideVar), zzidoVar);
            zzb2.zzk(t2);
            return t2;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            if (e.zzb()) {
                throw new com.google.android.gms.internal.ads.zziet(e);
            }
            throw e;
        } catch (com.google.android.gms.internal.ads.zzigs e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.ads.zziet) {
                throw ((com.google.android.gms.internal.ads.zziet) e3.getCause());
            }
            throw new com.google.android.gms.internal.ads.zziet(e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.android.gms.internal.ads.zziet) {
                throw ((com.google.android.gms.internal.ads.zziet) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbP(T t, com.google.android.gms.internal.ads.zzide zzideVar) throws com.google.android.gms.internal.ads.zziet {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        return (T) zzbO(t, zzideVar, com.google.android.gms.internal.ads.zzido.zza);
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbQ(T t, java.nio.ByteBuffer byteBuffer, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        com.google.android.gms.internal.ads.zzide zzI;
        int i = com.google.android.gms.internal.ads.zzide.zze;
        if (byteBuffer.hasArray()) {
            zzI = com.google.android.gms.internal.ads.zzide.zzI(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzI = com.google.android.gms.internal.ads.zzide.zzI(bArr, 0, remaining, true);
        }
        T t2 = (T) zzbZ(t, zzI, zzidoVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbR(T t, java.nio.ByteBuffer byteBuffer) throws com.google.android.gms.internal.ads.zziet {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        return (T) zzbQ(t, byteBuffer, com.google.android.gms.internal.ads.zzido.zza);
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbS(T t, com.google.android.gms.internal.ads.zzida zzidaVar) throws com.google.android.gms.internal.ads.zziet {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        T t2 = (T) zzbT(t, zzidaVar, com.google.android.gms.internal.ads.zzido.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbT(T t, com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) zzj(t, zzidaVar, zzidoVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbU(T t, byte[] bArr) throws com.google.android.gms.internal.ads.zziet {
        int length = bArr.length;
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        T t2 = (T) zzh(t, bArr, 0, length, com.google.android.gms.internal.ads.zzido.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbV(T t, byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzidoVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbW(T t, java.io.InputStream inputStream) throws com.google.android.gms.internal.ads.zziet {
        com.google.android.gms.internal.ads.zzide zzH = com.google.android.gms.internal.ads.zzide.zzH(inputStream, 4096);
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        T t2 = (T) zzbO(t, zzH, com.google.android.gms.internal.ads.zzido.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbX(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) zzbO(t, com.google.android.gms.internal.ads.zzide.zzH(inputStream, 4096), zzidoVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbY(T t, com.google.android.gms.internal.ads.zzide zzideVar) throws com.google.android.gms.internal.ads.zziet {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        return (T) zzbZ(t, zzideVar, com.google.android.gms.internal.ads.zzido.zza);
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzbZ(T t, com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) zzbO(t, zzideVar, zzidoVar);
        zzi(t2);
        return t2;
    }

    static <T extends com.google.android.gms.internal.ads.zziee> T zzbt(java.lang.Class<T> cls) {
        java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.ads.zziee<?, ?>> map = zzd;
        com.google.android.gms.internal.ads.zziee<?, ?> zzieeVar = map.get(cls);
        if (zzieeVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzieeVar = map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzieeVar == null) {
            zzieeVar = ((com.google.android.gms.internal.ads.zziee) com.google.android.gms.internal.ads.zziha.zzb(cls)).zzbw();
            if (zzieeVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzieeVar);
        }
        return zzieeVar;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee> void zzbu(java.lang.Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static java.lang.Object zzbv(com.google.android.gms.internal.ads.zzifp zzifpVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.ads.zzigb(zzifpVar, str, objArr);
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzifp, Type> com.google.android.gms.internal.ads.zziec<ContainingType, Type> zzby(ContainingType containingtype, Type type, com.google.android.gms.internal.ads.zzifp zzifpVar, com.google.android.gms.internal.ads.zziej zziejVar, int i, com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zziec<>(containingtype, type, zzifpVar, new com.google.android.gms.internal.ads.zzieb(zziejVar, i, zzihgVar, false, false), cls);
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzifp, Type> com.google.android.gms.internal.ads.zziec<ContainingType, Type> zzbz(ContainingType containingtype, com.google.android.gms.internal.ads.zzifp zzifpVar, com.google.android.gms.internal.ads.zziej zziejVar, int i, com.google.android.gms.internal.ads.zzihg zzihgVar, boolean z, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zziec<>(containingtype, com.google.android.gms.internal.ads.zziga.zzd(), zzifpVar, new com.google.android.gms.internal.ads.zzieb(zziejVar, i, zzihgVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == com.google.android.gms.internal.ads.zzigu.zza()) {
            this.zzt = com.google.android.gms.internal.ads.zzigu.zzb();
        }
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzca(T t, java.io.InputStream inputStream) throws com.google.android.gms.internal.ads.zziet {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        T t2 = (T) zzk(t, inputStream, com.google.android.gms.internal.ads.zzido.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzcb(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        T t2 = (T) zzk(t, inputStream, zzidoVar);
        zzi(t2);
        return t2;
    }

    private int zzd(com.google.android.gms.internal.ads.zzigh<?> zzighVar) {
        if (zzighVar != null) {
            return zzighVar.zze(this);
        }
        return com.google.android.gms.internal.ads.zzifz.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends com.google.android.gms.internal.ads.zziea<MessageType, BuilderType>, BuilderType, T> com.google.android.gms.internal.ads.zziec<MessageType, T> zze(com.google.android.gms.internal.ads.zzidm<MessageType, T> zzidmVar) {
        return (com.google.android.gms.internal.ads.zziec) zzidmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends com.google.android.gms.internal.ads.zziee<T, ?>> boolean zzg(T t, boolean z) {
        byte byteValue = ((java.lang.Byte) t.zzdc(com.google.android.gms.internal.ads.zzied.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = com.google.android.gms.internal.ads.zzifz.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(com.google.android.gms.internal.ads.zzied.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, null);
        }
        return zzl;
    }

    private static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            com.google.android.gms.internal.ads.zzigh zzb2 = com.google.android.gms.internal.ads.zzifz.zza().zzb(t2.getClass());
            zzb2.zzj(t2, bArr, i, i + i2, new com.google.android.gms.internal.ads.zzico(zzidoVar));
            zzb2.zzk(t2);
            return t2;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            if (e.zzb()) {
                throw new com.google.android.gms.internal.ads.zziet(e);
            }
            throw e;
        } catch (com.google.android.gms.internal.ads.zzigs e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.ads.zziet) {
                throw ((com.google.android.gms.internal.ads.zziet) e3.getCause());
            }
            throw new com.google.android.gms.internal.ads.zziet(e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzi(T t) throws com.google.android.gms.internal.ads.zziet {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzj(T t, com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        com.google.android.gms.internal.ads.zzide zzm = zzidaVar.zzm();
        T t2 = (T) zzbO(t, zzm, zzidoVar);
        zzm.zzb(0);
        return t2;
    }

    private static <T extends com.google.android.gms.internal.ads.zziee<T, ?>> T zzk(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            com.google.android.gms.internal.ads.zzide zzH = com.google.android.gms.internal.ads.zzide.zzH(new com.google.android.gms.internal.ads.zzich(inputStream, com.google.android.gms.internal.ads.zzide.zzO(read, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzH, zzidoVar);
            zzH.zzb(0);
            return t2;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            if (e.zzb()) {
                throw new com.google.android.gms.internal.ads.zziet(e);
            }
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.ads.zziet(e2);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.ads.zzifz.zza().zzb(getClass()).zzb(this, (com.google.android.gms.internal.ads.zziee) obj);
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

    public java.lang.String toString() {
        return com.google.android.gms.internal.ads.zzifr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    final int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    int zzaT(com.google.android.gms.internal.ads.zzigh zzighVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int zzd2 = zzd(zzighVar);
            zzaR(zzd2);
            return zzd2;
        }
        int zzd3 = zzd(zzighVar);
        if (zzd3 >= 0) {
            return zzd3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzd3).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(zzd3);
        throw new java.lang.IllegalStateException(sb.toString());
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

    @Override // com.google.android.gms.internal.ads.zzifp
    public final com.google.android.gms.internal.ads.zzifx<MessageType> zzbd() {
        return (com.google.android.gms.internal.ads.zzifx) zzdc(com.google.android.gms.internal.ads.zzied.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(com.google.android.gms.internal.ads.zzied.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(com.google.android.gms.internal.ads.zzied.NEW_BUILDER, null, null);
    }

    final MessageType zzbg() {
        return (MessageType) zzdc(com.google.android.gms.internal.ads.zzied.NEW_MUTABLE_INSTANCE, null, null);
    }

    final int zzbh() {
        return com.google.android.gms.internal.ads.zzifz.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected final boolean zzbj(int i, com.google.android.gms.internal.ads.zzide zzideVar) throws java.io.IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zzideVar);
    }

    protected final void zzbk(int i, int i2) {
        zzc();
        com.google.android.gms.internal.ads.zzigu zziguVar = this.zzt;
        zziguVar.zze();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        zziguVar.zzk(i << 3, java.lang.Long.valueOf(i2));
    }

    protected final void zzbl(int i, com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzc();
        com.google.android.gms.internal.ads.zzigu zziguVar = this.zzt;
        zziguVar.zze();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        zziguVar.zzk((i << 3) | 2, zzidaVar);
    }

    protected final void zzbm() {
        com.google.android.gms.internal.ads.zzifz.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends com.google.android.gms.internal.ads.zziee<MessageType2, BuilderType2>, BuilderType2 extends com.google.android.gms.internal.ads.zzidy<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(com.google.android.gms.internal.ads.zzied.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends com.google.android.gms.internal.ads.zziee<MessageType2, BuilderType2>, BuilderType2 extends com.google.android.gms.internal.ads.zzidy<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(com.google.android.gms.internal.ads.zzied.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    final void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public int zzbr() {
        return zzaT(null);
    }

    final java.lang.Object zzbs() throws java.lang.Exception {
        return zzdc(com.google.android.gms.internal.ads.zzied.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(com.google.android.gms.internal.ads.zzigu zziguVar) {
        this.zzt = com.google.android.gms.internal.ads.zzigu.zzc(this.zzt, zziguVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public void zzcX(com.google.android.gms.internal.ads.zzidj zzidjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzifz.zza().zzb(getClass()).zzf(this, com.google.android.gms.internal.ads.zzidk.zza(zzidjVar));
    }

    protected abstract java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2);
}
