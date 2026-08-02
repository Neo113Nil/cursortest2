package androidx.camera.core.impl;

import C.InterfaceC2693m;
import C.InterfaceC2694n;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5108n0 implements InterfaceC2693m {

    /* renamed from: b, reason: collision with root package name */
    private final int f38367b;

    public C5108n0(int i11) {
        this.f38367b = i11;
    }

    @Override // C.InterfaceC2693m
    @NonNull
    public final ArrayList a(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2694n interfaceC2694n = (InterfaceC2694n) it.next();
            x2.i.a("The camera info doesn't contain internal implementation.", interfaceC2694n instanceof H);
            if (interfaceC2694n.e() == this.f38367b) {
                arrayList.add(interfaceC2694n);
            }
        }
        return arrayList;
    }

    public final int b() {
        return this.f38367b;
    }
}
