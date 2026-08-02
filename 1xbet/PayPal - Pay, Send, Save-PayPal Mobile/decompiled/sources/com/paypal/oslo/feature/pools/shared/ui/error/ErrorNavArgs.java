package com.paypal.oslo.feature.pools.shared.ui.error;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "", "titleRes", "descriptionRes", "primaryButtonRes", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-QDVFmTU", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Ljava/lang/Integer;", "component4", "copy-uLJ83ew", "(Ljava/lang/String;ILjava/lang/Integer;I)Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "Ljava/lang/String;", "getRequestId-QDVFmTU", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "getPrimaryButtonRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ErrorNavArgs {
    public static final int $stable = 0;
    private final java.lang.Integer descriptionRes;
    private final int primaryButtonRes;
    private final java.lang.String requestId;
    private final int titleRes;

    private ErrorNavArgs(java.lang.String str, int i, java.lang.Integer num, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
        this.titleRes = i;
        this.descriptionRes = num;
        this.primaryButtonRes = i2;
    }

    public /* synthetic */ ErrorNavArgs(java.lang.String str, int i, java.lang.Integer num, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU() : str, i, (i3 & 4) != 0 ? null : num, i2, null);
    }

    /* renamed from: getRequestId-QDVFmTU, reason: not valid java name */
    public final java.lang.String m17654getRequestIdQDVFmTU() {
        return this.requestId;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final java.lang.Integer getDescriptionRes() {
        return this.descriptionRes;
    }

    public final int getPrimaryButtonRes() {
        return this.primaryButtonRes;
    }

    public final java.lang.String toString() {
        java.lang.String m11591toStringimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.requestId);
        int i = this.titleRes;
        java.lang.Integer num = this.descriptionRes;
        int i2 = this.primaryButtonRes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorNavArgs(requestId=");
        sb.append(m11591toStringimpl);
        sb.append(", titleRes=");
        sb.append(i);
        sb.append(", descriptionRes=");
        sb.append(num);
        sb.append(", primaryButtonRes=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int m11590hashCodeimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11590hashCodeimpl(this.requestId);
        int hashCode = java.lang.Integer.hashCode(this.titleRes);
        java.lang.Integer num = this.descriptionRes;
        return (((((m11590hashCodeimpl * 31) + hashCode) * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.primaryButtonRes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs)) {
            return false;
        }
        com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs = (com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs) other;
        return com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.requestId, errorNavArgs.requestId) && this.titleRes == errorNavArgs.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, errorNavArgs.descriptionRes) && this.primaryButtonRes == errorNavArgs.primaryButtonRes;
    }

    /* renamed from: copy-uLJ83ew, reason: not valid java name */
    public final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs m17653copyuLJ83ew(java.lang.String requestId, int titleRes, java.lang.Integer descriptionRes, int primaryButtonRes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        return new com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs(requestId, titleRes, descriptionRes, primaryButtonRes, null);
    }

    /* renamed from: component4, reason: from getter */
    public final int getPrimaryButtonRes() {
        return this.primaryButtonRes;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getDescriptionRes() {
        return this.descriptionRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component1-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    /* renamed from: copy-uLJ83ew$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs m17651copyuLJ83ew$default(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs, java.lang.String str, int i, java.lang.Integer num, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = errorNavArgs.requestId;
        }
        if ((i3 & 2) != 0) {
            i = errorNavArgs.titleRes;
        }
        if ((i3 & 4) != 0) {
            num = errorNavArgs.descriptionRes;
        }
        if ((i3 & 8) != 0) {
            i2 = errorNavArgs.primaryButtonRes;
        }
        return errorNavArgs.m17653copyuLJ83ew(str, i, num, i2);
    }

    public /* synthetic */ ErrorNavArgs(java.lang.String str, int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, num, i2);
    }
}
