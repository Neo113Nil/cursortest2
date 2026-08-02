package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1464qB {
    protected int zzq;

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(AbstractCollection abstractCollection, List list) {
        Charset charset = VB.f11871a;
        abstractCollection.getClass();
        if (abstractCollection instanceof InterfaceC1240lC) {
            list.addAll(abstractCollection);
            return;
        }
        int size = abstractCollection.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C1330nC) {
            C1330nC c1330nC = (C1330nC) list;
            int i = ((C1330nC) list).f14600m + size;
            int length = c1330nC.f14599l.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c1330nC.f14599l = Arrays.copyOf(c1330nC.f14599l, length);
                } else {
                    c1330nC.f14599l = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list.size();
        if (!(abstractCollection instanceof List) || !(abstractCollection instanceof RandomAccess)) {
            for (Object obj : abstractCollection) {
                if (obj == null) {
                    KB.g(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) abstractCollection;
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Object obj2 = list2.get(i5);
            if (obj2 == null) {
                KB.g(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public abstract int a(InterfaceC1554sC interfaceC1554sC);

    public final C1733wB b() {
        try {
            int a5 = ((MB) this).a(null);
            C1733wB c1733wB = AbstractC1823yB.f16414l;
            byte[] bArr = new byte[a5];
            CB cb = new CB(a5, bArr);
            ((MB) this).q(cb);
            if (a5 - cb.f7970q == 0) {
                return new C1733wB(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            throw new RuntimeException(e("ByteString"), e3);
        }
    }

    public final byte[] d() {
        try {
            int a5 = ((MB) this).a(null);
            byte[] bArr = new byte[a5];
            CB cb = new CB(a5, bArr);
            ((MB) this).q(cb);
            if (a5 - cb.f7970q == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            throw new RuntimeException(e("byte array"), e3);
        }
    }

    public final String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }
}
