package com.amplitude.core.platform;

import com.amplitude.core.platform.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j implements k {
    public final k.a a = k.a.e;

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }

    public abstract void h(String str);

    public abstract void i(String str);
}
