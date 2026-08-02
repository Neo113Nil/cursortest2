package com.amplitude.android.internal.locators;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d {
    public static final Lazy a = LazyKt.lazy(a.a);

    public static final class a extends Lambda implements Function0<Function1<? super com.amplitude.common.a, ? extends List<b>>> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Function1<? super com.amplitude.common.a, ? extends List<b>> invoke() {
            return c.a;
        }
    }
}
