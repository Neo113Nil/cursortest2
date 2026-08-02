package io.sentry.flutter;

import f6.C1116i;
import io.sentry.android.core.SentryAndroidOptions;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$11 extends i implements Function1 {
    final /* synthetic */ SentryAndroidOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$11(SentryAndroidOptions sentryAndroidOptions) {
        super(1);
        this.$options = sentryAndroidOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C1116i.f13008a;
    }

    public final void invoke(boolean z4) {
        this.$options.setEnableActivityLifecycleBreadcrumbs(z4);
        this.$options.setEnableAppLifecycleBreadcrumbs(z4);
        this.$options.setEnableSystemEventBreadcrumbs(z4);
        this.$options.setEnableAppComponentBreadcrumbs(z4);
        this.$options.setEnableUserInteractionBreadcrumbs(z4);
    }
}
