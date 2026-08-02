package com.amplitude.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function0<com.amplitude.core.remoteconfig.a> {
    public final /* synthetic */ com.amplitude.android.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amplitude.android.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.amplitude.core.remoteconfig.a invoke() {
        com.amplitude.android.a aVar = this.a;
        com.amplitude.android.h hVar = aVar.a;
        return new com.amplitude.core.remoteconfig.a(hVar.a, hVar.m, aVar.c, aVar.e, aVar.f, aVar.j(), new com.amplitude.core.utilities.http.d(hVar, aVar.i()), aVar.i());
    }
}
