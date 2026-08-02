package com.zettle.o11y.android.core;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class O11YDataDogManager$sam$com_datadog_android_event_EventMapper$0 implements com.datadog.android.event.EventMapper, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;

    @Override // com.datadog.android.event.EventMapper
    public final /* synthetic */ java.lang.Object map(java.lang.Object obj) {
        return this.getHighSpeedVideoFpsRanges.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof com.datadog.android.event.EventMapper) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    O11YDataDogManager$sam$com_datadog_android_event_EventMapper$0(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
