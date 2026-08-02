package com.paypal.oslo.core.commonui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "<init>", "()V", "Res", "Plural", "Raw", "Lcom/paypal/oslo/core/commonui/utils/RefText$Plural;", "Lcom/paypal/oslo/core/commonui/utils/RefText$Raw;", "Lcom/paypal/oslo/core/commonui/utils/RefText$Res;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RefText {
    public static final int $stable = 0;

    private RefText() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/commonui/utils/RefText$Res;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "resId", "", "", "args", "<init>", "(I[Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId", "[Ljava/lang/Object;", "getArgs", "()[Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Res extends com.paypal.oslo.core.commonui.utils.RefText {
        public static final int $stable = 8;
        private final java.lang.Object[] args;
        private final int resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Res(int i, java.lang.Object[] objArr) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
            this.resId = i;
            this.args = objArr;
        }

        public final int getResId() {
            return this.resId;
        }

        public /* synthetic */ Res(int i, java.lang.Object[] objArr, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? new java.lang.Object[0] : objArr);
        }

        public final java.lang.Object[] getArgs() {
            return this.args;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.commonui.utils.RefText.Res)) {
                return false;
            }
            com.paypal.oslo.core.commonui.utils.RefText.Res res = (com.paypal.oslo.core.commonui.utils.RefText.Res) other;
            return this.resId == res.resId && java.util.Arrays.equals(this.args, res.args);
        }

        public final int hashCode() {
            return (this.resId * 31) + java.util.Arrays.hashCode(this.args);
        }

        public final java.lang.String toString() {
            int i = this.resId;
            java.lang.String arrays = java.util.Arrays.toString(this.args);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Res(resId=");
            sb.append(i);
            sb.append(", args=");
            sb.append(arrays);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/commonui/utils/RefText$Plural;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "resId", "quantity", "", "", "args", "<init>", "(II[Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId", "getQuantity", "[Ljava/lang/Object;", "getArgs", "()[Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Plural extends com.paypal.oslo.core.commonui.utils.RefText {
        public static final int $stable = 8;
        private final java.lang.Object[] args;
        private final int quantity;
        private final int resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Plural(int i, int i2, java.lang.Object[] objArr) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
            this.resId = i;
            this.quantity = i2;
            this.args = objArr;
        }

        public final int getResId() {
            return this.resId;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public /* synthetic */ Plural(int i, int i2, java.lang.Object[] objArr, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? new java.lang.Object[0] : objArr);
        }

        public final java.lang.Object[] getArgs() {
            return this.args;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.commonui.utils.RefText.Plural)) {
                return false;
            }
            com.paypal.oslo.core.commonui.utils.RefText.Plural plural = (com.paypal.oslo.core.commonui.utils.RefText.Plural) other;
            return this.resId == plural.resId && this.quantity == plural.quantity && java.util.Arrays.equals(this.args, plural.args);
        }

        public final int hashCode() {
            return (((this.resId * 31) + this.quantity) * 31) + java.util.Arrays.hashCode(this.args);
        }

        public final java.lang.String toString() {
            int i = this.resId;
            int i2 = this.quantity;
            java.lang.String arrays = java.util.Arrays.toString(this.args);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Plural(resId=");
            sb.append(i);
            sb.append(", quantity=");
            sb.append(i2);
            sb.append(", args=");
            sb.append(arrays);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/commonui/utils/RefText$Raw;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText$Raw;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Raw extends com.paypal.oslo.core.commonui.utils.RefText {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Raw(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Raw(value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.commonui.utils.RefText.Raw) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.core.commonui.utils.RefText.Raw) other).value);
        }

        public final com.paypal.oslo.core.commonui.utils.RefText.Raw copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.core.commonui.utils.RefText.Raw(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.core.commonui.utils.RefText.Raw copy$default(com.paypal.oslo.core.commonui.utils.RefText.Raw raw, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = raw.value;
            }
            return raw.copy(str);
        }
    }

    public /* synthetic */ RefText(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
