package com.amplitude.android.internal.locators;

import android.view.View;
import com.amplitude.android.internal.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/amplitude/android/internal/locators/ComposeViewTargetLocator;", "Lcom/amplitude/android/internal/locators/b;", "Companion", "a", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeViewTargetLocator implements com.amplitude.android.internal.locators.b {
    public final com.amplitude.common.a a;
    public final Lazy b;

    public static final class b extends Lambda implements Function0<defpackage.a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final defpackage.a invoke() {
            return new defpackage.a(ComposeViewTargetLocator.this.a);
        }
    }

    public ComposeViewTargetLocator(com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = logger;
        this.b = LazyKt.lazy(new b());
    }

    @Override // com.amplitude.android.internal.locators.b
    public final com.amplitude.android.internal.c a(View view, Pair targetPosition) {
        c.a targetType = c.a.a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        return null;
    }
}
