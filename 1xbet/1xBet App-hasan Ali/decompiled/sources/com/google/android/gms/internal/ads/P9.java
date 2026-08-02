package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import q3.AbstractC2309b;

/* loaded from: classes.dex */
public final class P9 implements InterfaceC1680v3 {

    /* renamed from: k, reason: collision with root package name */
    public final Object f11071k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f11072l;

    public P9(Context context) {
        this.f11071k = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1680v3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1815y3 d(A3 a32) {
        K9 k9;
        K9 k92;
        Map c5 = a32.c();
        int size = c5.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i5 = 0;
        for (Map.Entry entry : c5.entrySet()) {
            strArr[i5] = (String) entry.getKey();
            strArr2[i5] = (String) entry.getValue();
            i5++;
        }
        J9 j9 = new J9(a32.f7521m, strArr, strArr2);
        P2.o oVar = P2.o.f4767B;
        oVar.f4776j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C0634Ld c0634Ld = new C0634Ld();
            C1390oj c1390oj = new C1390oj(8, this, c0634Ld, objArr2 == true ? 1 : 0);
            O9 o9 = new O9(c0634Ld);
            Context context = (Context) this.f11071k;
            Looper n5 = oVar.f4785s.n();
            int i6 = AbstractC1697vc.f16009a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f11072l = new C1414p6(166, applicationContext, n5, c1390oj, o9);
            ((C1414p6) this.f11072l).n();
            N9 n9 = new N9((int) (objArr == true ? 1 : 0), (Object) j9);
            C0606Hd c0606Hd = AbstractC0613Id.f9539a;
            E3.a l02 = AbstractC1400ot.l0(AbstractC1400ot.j0(c0634Ld, n9, c0606Hd), ((Integer) Q2.r.f5053d.f5056c.a(F7.f8882p4)).intValue(), TimeUnit.MILLISECONDS, AbstractC0613Id.f9542d);
            l02.a(new K4(11, this), c0606Hd);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) l02.get();
            oVar.f4776j.getClass();
            T2.G.m("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            Parcelable.Creator<K9> creator = K9.CREATOR;
            if (parcelFileDescriptor == null) {
                U2.j.f("File descriptor is empty, returning null.");
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int readInt = dataInputStream.readInt();
                        byte[] bArr = new byte[readInt];
                        dataInputStream.readFully(bArr, 0, readInt);
                        AbstractC2309b.c(dataInputStream);
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.unmarshall(bArr, 0, readInt);
                            obtain.setDataPosition(0);
                            K9 createFromParcel = creator.createFromParcel(obtain);
                            obtain.recycle();
                            k9 = createFromParcel;
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    } catch (IOException e3) {
                        U2.j.g("Could not read from parcel file descriptor", e3);
                        AbstractC2309b.c(dataInputStream);
                    }
                    k92 = k9;
                    if (k92 != null) {
                        return null;
                    }
                    if (k92.f10132k) {
                        throw new C3(k92.f10133l);
                    }
                    if (k92.f10136o.length != k92.f10137p.length) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String[] strArr3 = k92.f10136o;
                        if (i >= strArr3.length) {
                            return new C1815y3(k92.f10134m, k92.f10135n, hashMap, C1815y3.a(hashMap), k92.f10138q);
                        }
                        hashMap.put(strArr3[i], k92.f10137p[i]);
                        i++;
                    }
                } catch (Throwable th2) {
                    AbstractC2309b.c(dataInputStream);
                    throw th2;
                }
            }
            k9 = null;
            k92 = k9;
            if (k92 != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            P2.o.f4767B.f4776j.getClass();
            T2.G.m("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th3) {
            P2.o.f4767B.f4776j.getClass();
            T2.G.m("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th3;
        }
    }

    public P9() {
        this.f11071k = new CopyOnWriteArraySet();
    }
}
