package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class O0 extends AbstractC0190g1 {
    private static final O0 zzb;
    private InterfaceC0202k1 zzd = B1.f2603e;

    static {
        O0 o02 = new O0();
        zzb = o02;
        AbstractC0190g1.k(O0.class, o02);
    }

    public static N0 n() {
        return (N0) zzb.f();
    }

    public static void o(O0 o02, Iterable iterable) {
        InterfaceC0202k1 interfaceC0202k1 = o02.zzd;
        if (!((T0) interfaceC0202k1).f2681a) {
            int size = interfaceC0202k1.size();
            o02.zzd = interfaceC0202k1.a(size + size);
        }
        List list = o02.zzd;
        Charset charset = AbstractC0205l1.f2772a;
        iterable.getClass();
        if (iterable instanceof InterfaceC0246z1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size2);
            }
            if (list instanceof B1) {
                B1 b12 = (B1) list;
                int i3 = ((B1) list).f2605c + size2;
                int length = b12.f2604b.length;
                if (i3 > length) {
                    if (length != 0) {
                        while (length < i3) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        b12.f2604b = Arrays.copyOf(b12.f2604b, length);
                    } else {
                        b12.f2604b = new Object[Math.max(i3, 10)];
                    }
                }
            }
        }
        int size3 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC0187f1.a(size3, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Object obj2 = list2.get(i4);
            if (obj2 == null) {
                AbstractC0187f1.a(size3, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", M0.class});
        }
        if (i4 == 3) {
            return new O0();
        }
        if (i4 == 4) {
            return new N0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
