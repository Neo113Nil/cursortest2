package com.amplitude.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function0<com.amplitude.common.a> {
    public final /* synthetic */ com.amplitude.android.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amplitude.android.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.amplitude.common.a invoke() {
        com.amplitude.android.a aVar = this.a;
        return aVar.a.h.a(aVar);
    }
}
