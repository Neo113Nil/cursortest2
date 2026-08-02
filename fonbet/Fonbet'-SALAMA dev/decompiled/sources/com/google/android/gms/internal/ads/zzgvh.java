package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvg;
import com.google.android.gms.internal.ads.zzgvh;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import w1.L;

/* loaded from: classes.dex */
public abstract class zzgvh<MessageType extends zzgvh<MessageType, BuilderType>, BuilderType extends zzgvg<MessageType, BuilderType>> implements zzgyr {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgvg.zzbd(iterable, list);
    }

    public static void zzaR(zzgvy zzgvyVar) {
        if (!zzgvyVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdF(String str) {
        return L.j("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzgzk zzgzkVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public zzgvy zzaN() {
        try {
            int zzaY = zzaY();
            zzgvy zzgvyVar = zzgvy.zzb;
            byte[] bArr = new byte[zzaY];
            int i7 = zzgwl.zzf;
            zzgwh zzgwhVar = new zzgwh(bArr, 0, zzaY);
            zzcY(zzgwhVar);
            zzgwhVar.zzF();
            return new zzgvv(bArr);
        } catch (IOException e7) {
            throw new RuntimeException(zzdF("ByteString"), e7);
        }
    }

    public zzgyw zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzgzv zzaP() {
        return new zzgzv(this);
    }

    public void zzaS(int i7) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) {
        int zzaY = zzaY();
        zzgwj zzgwjVar = new zzgwj(outputStream, zzgwl.zzB(zzgwl.zzD(zzaY) + zzaY));
        zzgwjVar.zzu(zzaY);
        zzcY(zzgwjVar);
        zzgwjVar.zzK();
    }

    public void zzaU(OutputStream outputStream) {
        zzgwj zzgwjVar = new zzgwj(outputStream, zzgwl.zzB(zzaY()));
        zzcY(zzgwjVar);
        zzgwjVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            int i7 = zzgwl.zzf;
            zzgwh zzgwhVar = new zzgwh(bArr, 0, zzaY);
            zzcY(zzgwhVar);
            zzgwhVar.zzF();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(zzdF("byte array"), e7);
        }
    }
}
