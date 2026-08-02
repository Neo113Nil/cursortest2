package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "name", "Lcom/paypal/pds/analytics/TypedKey;", "typedKey", "(Ljava/lang/String;)Lcom/paypal/pds/analytics/TypedKey;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TypedKeyKt {
    public static final /* synthetic */ <T> com.paypal.pds.analytics.TypedKey<T> typedKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new com.paypal.pds.analytics.TypedKey<>(str, java.lang.Object.class);
    }
}
