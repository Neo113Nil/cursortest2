package com.google.android.gms.internal.ads;

import A0.d;
import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzgvg;
import com.google.android.gms.internal.ads.zzgvh;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import w1.L;

/* loaded from: classes.dex */
public abstract class zzgvg<MessageType extends zzgvh<MessageType, BuilderType>, BuilderType extends zzgvg<MessageType, BuilderType>> implements zzgyq {
    private String zza(String str) {
        return L.j("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzgzc) {
                ((zzgzc) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            d dVar = (Object) list2.get(i7);
            if (dVar == null) {
                zzc(list, size2);
            }
            list.add(dVar);
        }
    }

    public static zzgzv zzbb(zzgyr zzgyrVar) {
        return new zzgzv(zzgyrVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgxt.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzgyd)) {
            if (iterable instanceof zzgza) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzgyd) iterable).zza();
        zzgyd zzgydVar = (zzgyd) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                String f7 = AbstractC0486a1.f(zzgydVar.size() - size, "Element at index ", " is null.");
                int size2 = zzgydVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(f7);
                    }
                    zzgydVar.remove(size2);
                }
            } else if (obj instanceof zzgvy) {
                zzgydVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgvy.zzv(bArr2, 0, bArr2.length);
                zzgydVar.zzb();
            } else {
                zzgydVar.add((String) obj);
            }
        }
    }

    private static void zzc(List<?> list, int i7) {
        String f7 = AbstractC0486a1.f(list.size() - i7, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i7) {
                throw new NullPointerException(f7);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgvy zzgvyVar) {
        try {
            zzgwe zzl = zzgvyVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgxv e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException(zza("ByteString"), e8);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgwe zzgweVar) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        return zzaW(zzgweVar, zzgwq.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzgyr zzgyrVar) {
        if (zzbt().getClass().isInstance(zzgyrVar)) {
            return (BuilderType) zzaD((zzgvh) zzgyrVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) {
        zzgwe zzG = zzgwe.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        try {
            zzgwe zzl = zzgvyVar.zzl();
            zzaW(zzl, zzgwqVar);
            zzl.zzy(0);
            return this;
        } catch (zzgxv e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException(zza("ByteString"), e8);
        }
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgwe zzgweVar, zzgwq zzgwqVar);

    public BuilderType zzaL(InputStream inputStream, zzgwq zzgwqVar) {
        zzgwe zzG = zzgwe.zzG(inputStream, 4096);
        zzaW(zzG, zzgwqVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgwq zzgwqVar) {
        return zzba(bArr, 0, bArr.length, zzgwqVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i7, int i8) {
        try {
            zzgwe zzH = zzgwe.zzH(bArr, i7, i8, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgxv e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException(zza("byte array"), e8);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i7, int i8, zzgwq zzgwqVar) {
        try {
            zzgwe zzH = zzgwe.zzH(bArr, i7, i8, false);
            zzaW(zzH, zzgwqVar);
            zzH.zzy(0);
            return this;
        } catch (zzgxv e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException(zza("byte array"), e8);
        }
    }

    public /* bridge */ /* synthetic */ zzgyq zzaQ(zzgvy zzgvyVar) {
        zzaE(zzgvyVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgyq zzaT(InputStream inputStream) {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgyq zzaV(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        zzaJ(zzgvyVar, zzgwqVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgyq zzaX(InputStream inputStream, zzgwq zzgwqVar) {
        zzaL(inputStream, zzgwqVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) {
        int i7 = zzgwq.zzb;
        int i8 = zzgzb.zza;
        return zzbf(inputStream, zzgwq.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgwq zzgwqVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgvf(inputStream, zzgwe.zzE(read, inputStream)), zzgwqVar);
        return true;
    }
}
