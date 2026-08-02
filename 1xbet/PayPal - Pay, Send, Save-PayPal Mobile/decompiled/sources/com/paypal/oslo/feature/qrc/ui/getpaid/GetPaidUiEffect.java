package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "DownloadQrCode", "InfoQrCode", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$DownloadQrCode;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$InfoQrCode;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class GetPaidUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.NavigateBack();

        public final int hashCode() {
            return -1366698456;
        }

        private NavigateBack() {
            super("GetPaidUiEffect.NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private GetPaidUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$DownloadQrCode;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$DownloadQrCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadQrCode extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadQrCode(android.graphics.Bitmap bitmap) {
            super("GetPaidUiEffect.DownloadQrCode", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.bitmap = bitmap;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadQrCode(bitmap=");
            sb.append(bitmap);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bitmap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode) other).bitmap);
        }

        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode copy(android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode copy$default(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode downloadQrCode, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = downloadQrCode.bitmap;
            }
            return downloadQrCode.copy(bitmap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$InfoQrCode;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect$InfoQrCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InfoQrCode extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoQrCode(android.graphics.Bitmap bitmap) {
            super("GetPaidUiEffect.InfoQrCode", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.bitmap = bitmap;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InfoQrCode(bitmap=");
            sb.append(bitmap);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bitmap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode) other).bitmap);
        }

        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode copy(android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode copy$default(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode infoQrCode, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = infoQrCode.bitmap;
            }
            return infoQrCode.copy(bitmap);
        }
    }

    public /* synthetic */ GetPaidUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
