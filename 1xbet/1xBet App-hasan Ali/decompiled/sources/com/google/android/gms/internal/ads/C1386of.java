package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import y4.C2673a;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386of {

    /* renamed from: a, reason: collision with root package name */
    public Object f14809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14810b;

    /* renamed from: c, reason: collision with root package name */
    public long f14811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14812d;

    public boolean a(C2673a c2673a, C4.i iVar, List list, boolean z3) {
        kotlin.jvm.internal.l.f("call", iVar);
        Iterator it = ((ConcurrentLinkedQueue) this.f14812d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C4.k kVar = (C4.k) it.next();
            kotlin.jvm.internal.l.e("connection", kVar);
            synchronized (kVar) {
                if (z3) {
                    if (!(kVar.f896g != null)) {
                        continue;
                    }
                }
                if (kVar.i(c2673a, list)) {
                    iVar.b(kVar);
                    return true;
                }
            }
        }
    }

    public int b(C4.k kVar, long j5) {
        byte[] bArr = z4.b.f21979a;
        ArrayList arrayList = kVar.f904p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + kVar.f892b.f21282a.f21298h + " was leaked. Did you forget to close a response body?";
                G4.n nVar = G4.n.f2016a;
                G4.n.f2016a.j(str, ((C4.g) reference).f874a);
                arrayList.remove(i);
                kVar.f898j = true;
                if (arrayList.isEmpty()) {
                    kVar.f905q = j5 - this.f14811c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
