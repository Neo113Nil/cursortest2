package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\"\u0010\tR\u001a\u0010#\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e"}, d2 = {"Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "", "", "prefix", "suffix", "separator", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "component1", "()Ljava/lang/CharSequence;", "component2", "component3", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "getPrefix", "", "prefixBytes", "[B", "getPrefixBytes", "()[B", "getSeparator", "separatorBytes", "getSeparatorBytes", "getSuffix", "suffixBytes", "getSuffixBytes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayloadDecoration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.PayloadDecoration.Companion INSTANCE = new com.datadog.android.core.internal.persistence.PayloadDecoration.Companion(null);
    private static final com.datadog.android.core.internal.persistence.PayloadDecoration JSON_ARRAY_DECORATION = new com.datadog.android.core.internal.persistence.PayloadDecoration("[", "]", ",");
    private static final com.datadog.android.core.internal.persistence.PayloadDecoration NEW_LINE_DECORATION = new com.datadog.android.core.internal.persistence.PayloadDecoration("", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
    private final java.lang.CharSequence prefix;
    private final byte[] prefixBytes;
    private final java.lang.CharSequence separator;
    private final byte[] separatorBytes;
    private final java.lang.CharSequence suffix;
    private final byte[] suffixBytes;

    public PayloadDecoration(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        this.prefix = charSequence;
        this.suffix = charSequence2;
        this.separator = charSequence3;
        byte[] bytes = charSequence3.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.separatorBytes = bytes;
        byte[] bytes2 = charSequence.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
        this.prefixBytes = bytes2;
        byte[] bytes3 = charSequence2.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
        this.suffixBytes = bytes3;
    }

    public final java.lang.CharSequence getPrefix() {
        return this.prefix;
    }

    public final java.lang.CharSequence getSuffix() {
        return this.suffix;
    }

    public final java.lang.CharSequence getSeparator() {
        return this.separator;
    }

    public final byte[] getSeparatorBytes() {
        return this.separatorBytes;
    }

    public final byte[] getPrefixBytes() {
        return this.prefixBytes;
    }

    public final byte[] getSuffixBytes() {
        return this.suffixBytes;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/PayloadDecoration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "JSON_ARRAY_DECORATION", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "getJSON_ARRAY_DECORATION", "()Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "NEW_LINE_DECORATION", "getNEW_LINE_DECORATION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.core.internal.persistence.PayloadDecoration getJSON_ARRAY_DECORATION() {
            return com.datadog.android.core.internal.persistence.PayloadDecoration.JSON_ARRAY_DECORATION;
        }

        public final com.datadog.android.core.internal.persistence.PayloadDecoration getNEW_LINE_DECORATION() {
            return com.datadog.android.core.internal.persistence.PayloadDecoration.NEW_LINE_DECORATION;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.prefix;
        java.lang.CharSequence charSequence2 = this.suffix;
        java.lang.CharSequence charSequence3 = this.separator;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayloadDecoration(prefix=");
        sb.append((java.lang.Object) charSequence);
        sb.append(", suffix=");
        sb.append((java.lang.Object) charSequence2);
        sb.append(", separator=");
        sb.append((java.lang.Object) charSequence3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.prefix.hashCode() * 31) + this.suffix.hashCode()) * 31) + this.separator.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.internal.persistence.PayloadDecoration)) {
            return false;
        }
        com.datadog.android.core.internal.persistence.PayloadDecoration payloadDecoration = (com.datadog.android.core.internal.persistence.PayloadDecoration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, payloadDecoration.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, payloadDecoration.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.separator, payloadDecoration.separator);
    }

    public final com.datadog.android.core.internal.persistence.PayloadDecoration copy(java.lang.CharSequence prefix, java.lang.CharSequence suffix, java.lang.CharSequence separator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        return new com.datadog.android.core.internal.persistence.PayloadDecoration(prefix, suffix, separator);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.CharSequence getSeparator() {
        return this.separator;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.CharSequence getSuffix() {
        return this.suffix;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.CharSequence getPrefix() {
        return this.prefix;
    }

    public static /* synthetic */ com.datadog.android.core.internal.persistence.PayloadDecoration copy$default(com.datadog.android.core.internal.persistence.PayloadDecoration payloadDecoration, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = payloadDecoration.prefix;
        }
        if ((i & 2) != 0) {
            charSequence2 = payloadDecoration.suffix;
        }
        if ((i & 4) != 0) {
            charSequence3 = payloadDecoration.separator;
        }
        return payloadDecoration.copy(charSequence, charSequence2, charSequence3);
    }
}
