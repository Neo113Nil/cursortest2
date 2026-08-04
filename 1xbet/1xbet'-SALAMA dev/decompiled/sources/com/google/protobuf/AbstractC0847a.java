package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0847a {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = K.f12112a;
        list.getClass();
        if (list instanceof Q) {
            List listB = ((Q) list).b();
            Q q7 = (Q) list2;
            int size = list2.size();
            for (Object obj : listB) {
                if (obj == null) {
                    String str = "Element at index " + (q7.size() - size) + " is null.";
                    for (int size2 = q7.size() - 1; size2 >= size; size2--) {
                        q7.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0867k) {
                    q7.h((AbstractC0867k) obj);
                } else {
                    q7.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC0870l0) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    public abstract int c(InterfaceC0881r0 interfaceC0881r0);

    public final byte[] d() {
        try {
            int iC = ((C) this).c(null);
            byte[] bArr = new byte[iC];
            Logger logger = AbstractC0879q.f12259d;
            C0875o c0875o = new C0875o(bArr, 0, iC);
            e(c0875o);
            if (c0875o.P0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void e(AbstractC0879q abstractC0879q);
}
