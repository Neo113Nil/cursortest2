package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes6.dex */
public final class Fe implements InterfaceC3675e9 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3675e9 f6557a;

    public Fe(CoroutineScope scope, Vc mrC50Model, MutableStateFlow lifecycleObserver) {
        InterfaceC3675e9 je;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        if (mrC50Model instanceof C3870l6) {
            je = new Ee(scope, (C3870l6) mrC50Model, lifecycleObserver);
        } else {
            if (!(mrC50Model instanceof C3608bp)) {
                throw new NoWhenBranchMatchedException();
            }
            je = new Je((C3608bp) mrC50Model);
        }
        this.f6557a = je;
    }

    @Override // com.inmobi.media.InterfaceC3675e9
    public final void a() {
        this.f6557a.a();
    }

    @Override // com.inmobi.media.InterfaceC3675e9
    public final Flow b() {
        return this.f6557a.b();
    }
}
