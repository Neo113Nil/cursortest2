package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class l extends com.digitalturbine.ignite.authenticator.IgniteManager {
    public l(android.content.Context context, com.fyber.inneractive.sdk.ignite.k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z, boolean z2, boolean z3, com.fyber.inneractive.sdk.ignite.h hVar) {
        super(kVar, aVar);
        com.digitalturbine.ignite.authenticator.decorator.e eVar = new com.digitalturbine.ignite.authenticator.decorator.e(context);
        this.f3496a = (z && z2) ? new com.digitalturbine.ignite.authenticator.decorator.h(new com.digitalturbine.ignite.authenticator.decorator.g(eVar, hVar), true, z3, hVar, this) : z ? new com.digitalturbine.ignite.authenticator.decorator.h(eVar, false, z3, hVar, this) : z2 ? new com.digitalturbine.ignite.authenticator.decorator.g(eVar, hVar) : new com.digitalturbine.ignite.authenticator.decorator.i(eVar, hVar);
    }
}
