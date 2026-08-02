package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718vx implements InterfaceC0911dx {

    /* renamed from: a, reason: collision with root package name */
    public final Fx f16067a;

    public C1718vx(Fx fx) {
        this.f16067a = fx;
        if (((My) fx.f9144l).f10756a.isEmpty()) {
            return;
        }
        Ry ry = (Ry) Sy.f11604b.f11606a.get();
        ry = ry == null ? Sy.f11605c : ry;
        AbstractC1400ot.j(fx);
        ry.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        HashMap hashMap = (HashMap) this.f16067a.f9145m;
        if (length > 5) {
            List list = (List) hashMap.get(C1419pB.a(Arrays.copyOf(bArr, 5)));
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    return ((InterfaceC0911dx) ((C1048gz) it.next()).f13686a).a(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        List list2 = (List) hashMap.get(C1419pB.a(AbstractC1668us.f15920e));
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                return ((InterfaceC0911dx) ((C1048gz) it2.next()).f13686a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
