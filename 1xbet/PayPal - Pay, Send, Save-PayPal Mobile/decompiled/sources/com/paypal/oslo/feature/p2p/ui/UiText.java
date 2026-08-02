package com.paypal.oslo.feature.p2p.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/UiText;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "asString", "(Landroid/content/Context;)Ljava/lang/String;", "StringResource", "DynamicString", "Lcom/paypal/oslo/feature/p2p/ui/UiText$DynamicString;", "Lcom/paypal/oslo/feature/p2p/ui/UiText$StringResource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UiText {
    public static final int $stable = 0;

    private UiText() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/UiText$StringResource;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "", "resId", "", "", "args", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/UiText$StringResource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId", "Ljava/util/List;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StringResource extends com.paypal.oslo.feature.p2p.ui.UiText {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Object> args;
        private final int resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringResource(int i, java.util.List<? extends java.lang.Object> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.resId = i;
            this.args = list;
        }

        public final int getResId() {
            return this.resId;
        }

        public /* synthetic */ StringResource(int i, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<java.lang.Object> getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            int i = this.resId;
            java.util.List<java.lang.Object> list = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StringResource(resId=");
            sb.append(i);
            sb.append(", args=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.resId) * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.UiText.StringResource)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.UiText.StringResource stringResource = (com.paypal.oslo.feature.p2p.ui.UiText.StringResource) other;
            return this.resId == stringResource.resId && kotlin.jvm.internal.Intrinsics.areEqual(this.args, stringResource.args);
        }

        public final com.paypal.oslo.feature.p2p.ui.UiText.StringResource copy(int resId, java.util.List<? extends java.lang.Object> args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(resId, args);
        }

        public final java.util.List<java.lang.Object> component2() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.UiText.StringResource copy$default(com.paypal.oslo.feature.p2p.ui.UiText.StringResource stringResource, int i, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stringResource.resId;
            }
            if ((i2 & 2) != 0) {
                list = stringResource.args;
            }
            return stringResource.copy(i, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/UiText$DynamicString;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/UiText$DynamicString;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DynamicString extends com.paypal.oslo.feature.p2p.ui.UiText {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicString(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicString(value=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.UiText.DynamicString) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.p2p.ui.UiText.DynamicString) other).value);
        }

        public final com.paypal.oslo.feature.p2p.ui.UiText.DynamicString copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.UiText.DynamicString copy$default(com.paypal.oslo.feature.p2p.ui.UiText.DynamicString dynamicString, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dynamicString.value;
            }
            return dynamicString.copy(str);
        }
    }

    public final java.lang.String asString(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this instanceof com.paypal.oslo.feature.p2p.ui.UiText.StringResource) {
            com.paypal.oslo.feature.p2p.ui.UiText.StringResource stringResource = (com.paypal.oslo.feature.p2p.ui.UiText.StringResource) this;
            if (stringResource.getArgs().isEmpty()) {
                java.lang.String string = context.getString(stringResource.getResId());
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return string;
            }
            int resId = stringResource.getResId();
            java.lang.Object[] array = stringResource.getArgs().toArray(new java.lang.Object[0]);
            java.lang.String string2 = context.getString(resId, java.util.Arrays.copyOf(array, array.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (this instanceof com.paypal.oslo.feature.p2p.ui.UiText.DynamicString) {
            return ((com.paypal.oslo.feature.p2p.ui.UiText.DynamicString) this).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ UiText(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
