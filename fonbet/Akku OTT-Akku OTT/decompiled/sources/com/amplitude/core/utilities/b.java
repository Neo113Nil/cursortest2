package com.amplitude.core.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements com.amplitude.id.f {
    public final com.amplitude.core.j a;

    public b(com.amplitude.core.j state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = state;
    }

    @Override // com.amplitude.id.f
    public final void a(String str) {
        com.amplitude.core.j jVar = this.a;
        jVar.b = str;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((com.amplitude.core.platform.j) it.next()).h(str);
        }
    }

    @Override // com.amplitude.id.f
    public final void b(String str) {
        com.amplitude.core.j jVar = this.a;
        jVar.a = str;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((com.amplitude.core.platform.j) it.next()).i(str);
        }
    }

    @Override // com.amplitude.id.f
    public final void c(com.amplitude.id.c identity, com.amplitude.id.i updateType) {
        com.amplitude.core.j jVar = this.a;
        ArrayList arrayList = jVar.c;
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        if (updateType == com.amplitude.id.i.a) {
            String str = identity.a;
            jVar.a = str;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.amplitude.core.platform.j) it.next()).i(str);
            }
            String str2 = identity.b;
            jVar.b = str2;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.amplitude.core.platform.j) it2.next()).h(str2);
            }
        }
    }
}
