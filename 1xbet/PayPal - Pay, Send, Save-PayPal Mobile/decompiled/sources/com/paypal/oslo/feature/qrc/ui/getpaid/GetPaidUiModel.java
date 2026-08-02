package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "", "", "userName", "userInitials", "Landroid/graphics/Bitmap;", "qrCodeBitmap", "qrCodeData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/graphics/Bitmap;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUserName", "getUserInitials", "Landroid/graphics/Bitmap;", "getQrCodeBitmap", "getQrCodeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetPaidUiModel {
    public static final int $stable = 8;
    private final android.graphics.Bitmap qrCodeBitmap;
    private final java.lang.String qrCodeData;
    private final java.lang.String userInitials;
    private final java.lang.String userName;

    public GetPaidUiModel(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.userName = str;
        this.userInitials = str2;
        this.qrCodeBitmap = bitmap;
        this.qrCodeData = str3;
    }

    public /* synthetic */ GetPaidUiModel(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? "" : str3);
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public final java.lang.String getUserInitials() {
        return this.userInitials;
    }

    public final android.graphics.Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public final java.lang.String getQrCodeData() {
        return this.qrCodeData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userName;
        java.lang.String str2 = this.userInitials;
        android.graphics.Bitmap bitmap = this.qrCodeBitmap;
        java.lang.String str3 = this.qrCodeData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPaidUiModel(userName=");
        sb.append(str);
        sb.append(", userInitials=");
        sb.append(str2);
        sb.append(", qrCodeBitmap=");
        sb.append(bitmap);
        sb.append(", qrCodeData=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.userName.hashCode();
        int hashCode2 = this.userInitials.hashCode();
        android.graphics.Bitmap bitmap = this.qrCodeBitmap;
        return (((((hashCode * 31) + hashCode2) * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.qrCodeData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userName, getPaidUiModel.userName) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInitials, getPaidUiModel.userInitials) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeBitmap, getPaidUiModel.qrCodeBitmap) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeData, getPaidUiModel.qrCodeData);
    }

    public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel copy(java.lang.String userName, java.lang.String userInitials, android.graphics.Bitmap qrCodeBitmap, java.lang.String qrCodeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInitials, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeData, "");
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel(userName, userInitials, qrCodeBitmap, qrCodeData);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getQrCodeData() {
        return this.qrCodeData;
    }

    /* renamed from: component3, reason: from getter */
    public final android.graphics.Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUserInitials() {
        return this.userInitials;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel copy$default(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getPaidUiModel.userName;
        }
        if ((i & 2) != 0) {
            str2 = getPaidUiModel.userInitials;
        }
        if ((i & 4) != 0) {
            bitmap = getPaidUiModel.qrCodeBitmap;
        }
        if ((i & 8) != 0) {
            str3 = getPaidUiModel.qrCodeData;
        }
        return getPaidUiModel.copy(str, str2, bitmap, str3);
    }

    public GetPaidUiModel() {
        this(null, null, null, null, 15, null);
    }
}
