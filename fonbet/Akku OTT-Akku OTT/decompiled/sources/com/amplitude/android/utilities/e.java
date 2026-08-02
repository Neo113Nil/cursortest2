package com.amplitude.android.utilities;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class e {
    public final Lazy a = LazyKt.lazy(a.a);

    public static final class a extends Lambda implements Function0<com.amplitude.common.android.b> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final com.amplitude.common.android.b invoke() {
            return new com.amplitude.common.android.b();
        }
    }

    public final com.amplitude.common.a a(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        return (com.amplitude.common.a) this.a.getValue();
    }
}
