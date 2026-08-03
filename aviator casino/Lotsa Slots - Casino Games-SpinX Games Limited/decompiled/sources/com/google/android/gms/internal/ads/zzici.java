package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzici<MessageType extends com.google.android.gms.internal.ads.zzicj<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzici<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzifo {
    private java.lang.String zza(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 16 + java.lang.String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static com.google.android.gms.internal.ads.zzigs zzaR(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        return new com.google.android.gms.internal.ads.zzigs(zzifpVar);
    }

    @java.lang.Deprecated
    protected static <T> void zzaS(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        zzaT(iterable, (java.util.List) collection);
    }

    protected static <T> void zzaT(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof com.google.android.gms.internal.ads.zzifa)) {
            if (iterable instanceof com.google.android.gms.internal.ads.zzify) {
                list.addAll((java.util.Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        java.util.List zza = ((com.google.android.gms.internal.ads.zzifa) iterable).zza();
        com.google.android.gms.internal.ads.zzifa zzifaVar = (com.google.android.gms.internal.ads.zzifa) list;
        int size = list.size();
        for (java.lang.Object obj : zza) {
            if (obj == null) {
                int size2 = zzifaVar.size() - size;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                java.lang.String sb2 = sb.toString();
                int size3 = zzifaVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new java.lang.NullPointerException(sb2);
                    }
                    zzifaVar.remove(size3);
                }
            } else if (obj instanceof com.google.android.gms.internal.ads.zzida) {
                zzifaVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                com.google.android.gms.internal.ads.zzida.zzt(bArr, 0, bArr.length);
                zzifaVar.zzb();
            } else {
                zzifaVar.add((java.lang.String) obj);
            }
        }
    }

    private static <T> void zzb(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof com.google.android.gms.internal.ads.zziga) {
                ((com.google.android.gms.internal.ads.zziga) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            android.R r = (java.lang.Object) list2.get(i);
            if (r == null) {
                zzc(list, size2);
            }
            list.add(r);
        }
    }

    private static void zzc(java.util.List<?> list, int i) {
        int size = list.size() - i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        java.lang.String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new java.lang.NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(com.google.android.gms.internal.ads.zzide zzideVar) throws java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        return zzbd(zzideVar, com.google.android.gms.internal.ads.zzido.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException;

    public BuilderType zzaF(com.google.android.gms.internal.ads.zzida zzidaVar) throws com.google.android.gms.internal.ads.zziet {
        try {
            com.google.android.gms.internal.ads.zzide zzm = zzidaVar.zzm();
            zzbe(zzm);
            zzm.zzb(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        try {
            com.google.android.gms.internal.ads.zzide zzm = zzidaVar.zzm();
            zzbd(zzm, zzidoVar);
            zzm.zzb(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws com.google.android.gms.internal.ads.zziet {
        return zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zziet {
        try {
            com.google.android.gms.internal.ads.zzide zzI = com.google.android.gms.internal.ads.zzide.zzI(bArr, i, i2, false);
            zzbe(zzI);
            zzI.zzb(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return zzaX(bArr, 0, bArr.length, zzidoVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        try {
            com.google.android.gms.internal.ads.zzide zzI = com.google.android.gms.internal.ads.zzide.zzI(bArr, i, i2, false);
            zzbd(zzI, zzidoVar);
            zzI.zzb(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(java.io.InputStream inputStream) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzide zzH = com.google.android.gms.internal.ads.zzide.zzH(inputStream, 4096);
        zzbe(zzH);
        zzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzide zzH = com.google.android.gms.internal.ads.zzide.zzH(inputStream, 4096);
        zzbd(zzH, zzidoVar);
        zzH.zzb(0);
        return this;
    }

    public boolean zzaN(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new com.google.android.gms.internal.ads.zzich(inputStream, com.google.android.gms.internal.ads.zzide.zzO(read, inputStream)), zzidoVar);
        return true;
    }

    public boolean zzaO(java.io.InputStream inputStream) throws java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        return zzaN(inputStream, com.google.android.gms.internal.ads.zzido.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        if (zzbw().getClass().isInstance(zzifpVar)) {
            return (BuilderType) zzaQ((com.google.android.gms.internal.ads.zzicj) zzifpVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzaV(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzaM(inputStream, zzidoVar);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzaW(java.io.InputStream inputStream) throws java.io.IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzbb(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        zzaG(zzidaVar, zzidoVar);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzbc(com.google.android.gms.internal.ads.zzida zzidaVar) throws com.google.android.gms.internal.ads.zziet {
        zzaF(zzidaVar);
        return this;
    }
}
