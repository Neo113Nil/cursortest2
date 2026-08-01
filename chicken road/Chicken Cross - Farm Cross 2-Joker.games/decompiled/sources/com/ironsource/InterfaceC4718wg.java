package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4718wg {
    void a() throws C4591pe;

    default void a(boolean z, Function0<? extends IronSourceError> lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!z) {
            throw new C4591pe(lazyError.invoke());
        }
    }
}
