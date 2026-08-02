package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderId;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes17.dex */
public final class ReaderId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.headless.readers.ReaderId.Companion INSTANCE = new com.zettle.sdk.headless.readers.ReaderId.Companion(null);
    private final java.lang.String value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23205toStringimpl(java.lang.String str) {
        return str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderId$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/headless/readers/ReaderId;", "fromString-CxbYxdE", "(Ljava/lang/String;)Ljava/lang/String;", "fromString", "generate-6QNqO6s", "()Ljava/lang/String;", "generate"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: generate-6QNqO6s, reason: not valid java name */
        public final java.lang.String m23208generate6QNqO6s() {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return com.zettle.sdk.headless.readers.ReaderId.m23201constructorimpl(obj);
        }

        /* renamed from: fromString-CxbYxdE, reason: not valid java name */
        public final java.lang.String m23207fromStringCxbYxdE(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return com.zettle.sdk.headless.readers.ReaderId.m23201constructorimpl(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ReaderId(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m23205toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m23206unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m23204hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m23202equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23204hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23203equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23202equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.zettle.sdk.headless.readers.ReaderId) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.zettle.sdk.headless.readers.ReaderId) obj).m23206unboximpl());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m23201constructorimpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.zettle.sdk.headless.readers.ReaderId m23200boximpl(java.lang.String str) {
        return new com.zettle.sdk.headless.readers.ReaderId(str);
    }
}
