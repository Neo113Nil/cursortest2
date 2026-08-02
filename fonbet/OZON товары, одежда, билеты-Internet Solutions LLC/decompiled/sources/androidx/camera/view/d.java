package androidx.camera.view;

import C.InterfaceC2694n;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.H;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class d implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f38523a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2694n f38524b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f38525c;

    d(InterfaceC2694n interfaceC2694n, f fVar, ArrayList arrayList) {
        this.f38525c = fVar;
        this.f38523a = arrayList;
        this.f38524b = interfaceC2694n;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        this.f38525c.f38532e = null;
        ArrayList arrayList = this.f38523a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((H) this.f38524b).f((AbstractC5111p) it.next());
        }
        arrayList.clear();
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        this.f38525c.f38532e = null;
    }
}
