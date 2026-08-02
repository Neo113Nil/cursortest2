package io.sentry.flutter;

import f6.C1116i;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$21 extends i implements Function1 {
    final /* synthetic */ SentryFlutter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$21(SentryFlutter sentryFlutter) {
        super(1);
        this.this$0 = sentryFlutter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C1116i.f13008a;
    }

    public final void invoke(boolean z4) {
        if (z4) {
            this.this$0.setAutoPerformanceTracingEnabled(true);
        }
    }
}
