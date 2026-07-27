package com.google.android.gms.internal.ads;

import android.R;
import com.google.android.gms.internal.ads.zzidq;
import com.google.android.gms.internal.ads.zzidr;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzidq<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidq<MessageType, BuilderType>> implements zzigv {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static zzihz zzaR(zzigw zzigwVar) {
        return new zzihz(zzigwVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof zzigh)) {
            if (iterable instanceof zzihf) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzigh) iterable).zza();
        zzigh zzighVar = (zzigh) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                int size2 = zzighVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = zzighVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb2);
                    }
                    zzighVar.remove(size3);
                }
            } else if (obj instanceof zziei) {
                zzighVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                zziei.zzt(bArr, 0, bArr.length);
                zzighVar.zzb();
            } else {
                zzighVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzihh) {
                ((zzihh) list).zze(list.size() + size);
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
        for (int i = 0; i < size3; i++) {
            R r = (Object) list2.get(i);
            if (r == null) {
                zzc(list, size2);
            }
            list.add(r);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziem zziemVar) throws IOException {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        return zzbd(zziemVar, zziew.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziem zziemVar, zziew zziewVar) throws IOException;

    public BuilderType zzaF(zziei zzieiVar) throws zzige {
        try {
            zziem zzm = zzieiVar.zzm();
            zzbe(zzm);
            zzm.zzb(0);
            return this;
        } catch (zzige e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(zziei zzieiVar, zziew zziewVar) throws zzige {
        try {
            zziem zzm = zzieiVar.zzm();
            zzbd(zzm, zziewVar);
            zzm.zzb(0);
            return this;
        } catch (zzige e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzige {
        return zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzige {
        try {
            zziem zzI = zziem.zzI(bArr, i, i2, false);
            zzbe(zzI);
            zzI.zzb(0);
            return this;
        } catch (zzige e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zziew zziewVar) throws zzige {
        return zzaX(bArr, 0, bArr.length, zziewVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, zziew zziewVar) throws zzige {
        try {
            zziem zzI = zziem.zzI(bArr, i, i2, false);
            zzbd(zzI, zziewVar);
            zzI.zzb(0);
            return this;
        } catch (zzige e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zziem zzH = zziem.zzH(inputStream, 4096);
        zzbe(zzH);
        zzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zziew zziewVar) throws IOException {
        zziem zzH = zziem.zzH(inputStream, 4096);
        zzbd(zzH, zziewVar);
        zzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zziew zziewVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new zzidp(inputStream, zziem.zzO(read, inputStream)), zziewVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
        return zzaN(inputStream, zziew.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzigw zzigwVar) {
        if (zzbw().getClass().isInstance(zzigwVar)) {
            return (BuilderType) zzaQ((zzidr) zzigwVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzigv zzaV(InputStream inputStream, zziew zziewVar) throws IOException {
        zzaM(inputStream, zziewVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzbb(zziei zzieiVar, zziew zziewVar) throws zzige {
        zzaG(zzieiVar, zziewVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzbc(zziei zzieiVar) throws zzige {
        zzaF(zzieiVar);
        return this;
    }
}
