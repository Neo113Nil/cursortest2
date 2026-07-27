package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes.dex */
public interface Ha extends SimpleAdvertisingIdGetter, InterfaceC0735om {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Li li);

    @Override // io.appmetrica.analytics.impl.InterfaceC0735om
    /* synthetic */ void a(C0605jm c0605jm);

    void b(boolean z3);

    void c(boolean z3);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
