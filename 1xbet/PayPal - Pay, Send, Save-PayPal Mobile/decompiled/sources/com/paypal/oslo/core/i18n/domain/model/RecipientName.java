package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/RecipientName;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class RecipientName implements com.paypal.oslo.core.i18n.domain.model.Field {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.RecipientName.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.RecipientName.Companion(null);
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/RecipientName$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/RecipientName;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.RecipientName> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.RecipientName$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ RecipientName(java.lang.String str) {
        this.value = str;
    }

    @Override // com.paypal.oslo.core.i18n.domain.model.Field
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m11474unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m11473toStringimpl(this.value);
    }

    public final int hashCode() {
        return m11472hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m11470equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m11473toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecipientName(value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11472hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11471equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11470equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.paypal.oslo.core.i18n.domain.model.RecipientName) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.paypal.oslo.core.i18n.domain.model.RecipientName) obj).m11474unboximpl());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m11469constructorimpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.RecipientName m11468boximpl(java.lang.String str) {
        return new com.paypal.oslo.core.i18n.domain.model.RecipientName(str);
    }
}
