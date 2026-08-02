package io.sentry.flutter;

import f6.C1116i;
import io.sentry.android.core.SentryAndroidOptions;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$25 extends i implements Function1 {
    final /* synthetic */ SentryAndroidOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$25(SentryAndroidOptions sentryAndroidOptions) {
        super(1);
        this.$options = sentryAndroidOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C1116i.f13008a;
    }

    public final void invoke(int i7) {
        this.$options.setConnectionTimeoutMillis(i7);
    }
}
