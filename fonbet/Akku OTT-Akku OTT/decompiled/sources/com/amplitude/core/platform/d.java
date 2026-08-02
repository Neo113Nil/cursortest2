package com.amplitude.core.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function0<com.amplitude.core.utilities.http.h> {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(0);
        this.a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.amplitude.core.utilities.http.h invoke() {
        b bVar = this.a;
        com.amplitude.core.k kVar = bVar.e;
        com.amplitude.core.b bVar2 = bVar.a;
        return kVar.g(bVar, bVar2.a, bVar.f, bVar2.f);
    }
}
