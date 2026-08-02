package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "name", "", "isImage", "datadog", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "instrumentedDatadog", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "DatadogSemanticsPropertyKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDatadogSemanticsPropertyKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogModifierKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.datadog.android.compose.DatadogModifierKt.class, "datadog", "getDatadog(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> DatadogSemanticsPropertyKey = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("_dd_semantics", new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String>() { // from class: com.datadog.android.compose.DatadogModifierKt$DatadogSemanticsPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return str;
        }
    });

    public static /* synthetic */ androidx.compose.ui.Modifier datadog$default(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return datadog(modifier, str, z);
    }

    public static final androidx.compose.ui.Modifier datadog(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.datadog.android.compose.internal.TelemetryKt.sendTelemetry$default(false, com.datadog.android.compose.internal.InstrumentationType.Semantics, null, null, 12, null);
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new com.datadog.android.compose.DatadogModifierKt$datadogSemantics$1(str, z), 1, null);
    }

    public static final androidx.compose.ui.Modifier instrumentedDatadog(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.datadog.android.compose.internal.TelemetryKt.sendTelemetry$default(true, com.datadog.android.compose.internal.InstrumentationType.Semantics, null, null, 12, null);
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new com.datadog.android.compose.DatadogModifierKt$datadogSemantics$1(str, z), 1, null);
    }

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getDatadogSemanticsPropertyKey() {
        return DatadogSemanticsPropertyKey;
    }
}
