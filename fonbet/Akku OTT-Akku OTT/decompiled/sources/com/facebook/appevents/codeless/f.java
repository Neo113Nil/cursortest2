package com.facebook.appevents.codeless;

import com.facebook.E;
import com.facebook.G;
import com.facebook.internal.u;
import com.facebook.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements z.b {
    @Override // com.facebook.z.b
    public final void a(E it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u.a aVar = u.Companion;
        String a = g.a();
        aVar.getClass();
        u.a.a(G.d, a, "App index sent to FB!");
    }
}
