package com.paypal.oslo.core.navigation.result;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes4.dex */
public final class NavResultRequestId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.navigation.result.NavResultRequestId.Companion INSTANCE = new com.paypal.oslo.core.navigation.result.NavResultRequestId.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.core.navigation.result.NavResultRequestId, java.lang.String> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, com.paypal.oslo.core.navigation.result.NavResultRequestId, java.lang.String>() { // from class: com.paypal.oslo.core.navigation.result.NavResultRequestId$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.String invoke(androidx.compose.runtime.saveable.SaverScope saverScope, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
            java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
            return m11592unboximpl;
        }
    }, new kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.core.navigation.result.NavResultRequestId>() { // from class: com.paypal.oslo.core.navigation.result.NavResultRequestId$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultRequestId invoke(java.lang.String str) {
            java.lang.String str2 = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String m11593fromValuekh8nfeM = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11593fromValuekh8nfeM(str2);
            if (m11593fromValuekh8nfeM != null) {
                return com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(m11593fromValuekh8nfeM);
            }
            return null;
        }
    });
    private final java.lang.String value;

    /* renamed from: access$constructor-impl, reason: not valid java name */
    public static final /* synthetic */ java.lang.String m11586access$constructorimpl(java.lang.String str) {
        return str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m11591toStringimpl(java.lang.String str) {
        return str;
    }

    private /* synthetic */ NavResultRequestId(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/navigation/result/NavResultRequestId$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "generate-QDVFmTU", "()Ljava/lang/String;", "generate", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "fromValue-kh8nfeM", "(Ljava/lang/String;)Ljava/lang/String;", "fromValue", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: generate-QDVFmTU, reason: not valid java name */
        public final java.lang.String m11594generateQDVFmTU() {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return com.paypal.oslo.core.navigation.result.NavResultRequestId.m11586access$constructorimpl(obj);
        }

        /* renamed from: fromValue-kh8nfeM, reason: not valid java name */
        public final java.lang.String m11593fromValuekh8nfeM(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return com.paypal.oslo.core.navigation.result.NavResultRequestId.m11586access$constructorimpl(value);
        }

        public final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.core.navigation.result.NavResultRequestId, java.lang.String> getSaver() {
            return com.paypal.oslo.core.navigation.result.NavResultRequestId.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m11591toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m11592unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m11590hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m11588equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11590hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11589equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11588equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.paypal.oslo.core.navigation.result.NavResultRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.paypal.oslo.core.navigation.result.NavResultRequestId) obj).m11592unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl(java.lang.String str) {
        return new com.paypal.oslo.core.navigation.result.NavResultRequestId(str);
    }
}
