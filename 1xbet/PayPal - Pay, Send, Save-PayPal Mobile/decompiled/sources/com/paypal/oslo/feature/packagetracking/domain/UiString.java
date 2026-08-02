package com.paypal.oslo.feature.packagetracking.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "", "<init>", "()V", "Companion", "PlainString", "StringResource", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString$PlainString;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UiString {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.domain.UiString.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.UiString.Companion(null);

    private UiString() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/UiString$PlainString;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/UiString$PlainString;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlainString extends com.paypal.oslo.feature.packagetracking.domain.UiString {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlainString(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlainString(value=");
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) other).value);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString copy$default(com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString plainString, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = plainString.value;
            }
            return plainString.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "", "resId", "", "", "args", "<init>", "(I[Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "component1", "component2", "()[Ljava/lang/Object;", "copy", "(I[Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;", com.visa.cbp.getEncExpo.warmup, "getResId", "[Ljava/lang/Object;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StringResource extends com.paypal.oslo.feature.packagetracking.domain.UiString {
        public static final int $stable = 8;
        private final java.lang.Object[] args;
        private final int resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringResource(int i, java.lang.Object[] objArr) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
            this.resId = i;
            this.args = objArr;
        }

        public /* synthetic */ StringResource(int i, java.lang.Object[] objArr, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? new java.lang.Object[0] : objArr);
        }

        public final java.lang.Object[] getArgs() {
            return this.args;
        }

        public final int getResId() {
            return this.resId;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource = (com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource) other;
            return this.resId == stringResource.resId && java.util.Arrays.equals(this.args, stringResource.args);
        }

        public final int hashCode() {
            return (this.resId * 31) + java.util.Arrays.hashCode(this.args);
        }

        public final java.lang.String toString() {
            int i = this.resId;
            java.lang.String arrays = java.util.Arrays.toString(this.args);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StringResource(resId=");
            sb.append(i);
            sb.append(", args=");
            sb.append(arrays);
            sb.append(")");
            return sb.toString();
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource copy(int resId, java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource(resId, args);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object[] getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource copy$default(com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource, int i, java.lang.Object[] objArr, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stringResource.resId;
            }
            if ((i2 & 2) != 0) {
                objArr = stringResource.args;
            }
            return stringResource.copy(i, objArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/UiString$Companion;", "", "<init>", "()V", "", "resId", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;", "invoke", "(I)Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke(int resId) {
            return new com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource(resId, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UiString(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
