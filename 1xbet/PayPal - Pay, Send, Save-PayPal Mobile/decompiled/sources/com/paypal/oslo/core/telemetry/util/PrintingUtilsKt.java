package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aC\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\n\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "", "", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "only", "(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;", "", "indent", "keyWidth", "prettyPrint", "(Ljava/util/Map;II)Ljava/lang/String;", "attrs", "", "logEvent", "(Ljava/util/Map;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PrintingUtilsKt {
    public static /* synthetic */ java.lang.String prettyPrint$default(java.util.Map map, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 30;
        }
        return prettyPrint(map, i, i2);
    }

    public static final java.lang.String prettyPrint(java.util.Map<java.lang.String, ? extends java.lang.Object> map, int i, final int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        final java.lang.String repeat = kotlin.text.StringsKt.repeat(" ", i);
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.sortedWith(map.entrySet(), new java.util.Comparator() { // from class: com.paypal.oslo.core.telemetry.util.PrintingUtilsKt$prettyPrint$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.String) ((java.util.Map.Entry) t).getKey(), (java.lang.String) ((java.util.Map.Entry) t2).getKey());
            }
        }), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.telemetry.util.PrintingUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.telemetry.util.PrintingUtilsKt.$r8$lambda$E4pwc79NCKbnqcyGP8mgbMmZbzw(i2, repeat, (java.util.Map.Entry) obj);
            }
        }, 30, null);
    }

    public static final void logEvent(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        com.paypal.oslo.core.telemetry.util.TelemetryLogBuffer.INSTANCE.add$telemetry_release("Firing event to analytics:\n".concat(java.lang.String.valueOf(prettyPrint$default(only(map, new java.lang.String[0]), 0, 0, 3, null))));
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> only(java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            if (kotlin.collections.ArraysKt.toSet(strArr).contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$E4pwc79NCKbnqcyGP8mgbMmZbzw(int i, java.lang.String str, java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String str2 = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        java.lang.String padEnd = kotlin.text.StringsKt.padEnd(str2, i, ' ');
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(padEnd);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(value);
        return sb.toString();
    }
}
