package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "UserDetailsLoaded", "QrCodeGenerated", "DoneClicked", "DownloadClicked", "InfoClicked", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$DoneClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$InfoClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$QrCodeGenerated;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$UserDetailsLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class GetPaidEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.LoadScreen INSTANCE = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.LoadScreen();

        public final int hashCode() {
            return -1981738369;
        }

        private LoadScreen() {
            super("GetPaidEvent.LoadScreen", null);
        }

        public final java.lang.String toString() {
            return "LoadScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.LoadScreen)) {
                return false;
            }
            return true;
        }
    }

    private GetPaidEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$UserDetailsLoaded;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;)Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$UserDetailsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserDetailsLoaded extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDetailsLoaded(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel) {
            super("GetPaidEvent.UserDetailsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidUiModel, "");
            this.uiModel = getPaidUiModel;
        }

        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDetailsLoaded(uiModel=");
            sb.append(getPaidUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded copy(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded copy$default(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded userDetailsLoaded, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                getPaidUiModel = userDetailsLoaded.uiModel;
            }
            return userDetailsLoaded.copy(getPaidUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$QrCodeGenerated;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$QrCodeGenerated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QrCodeGenerated extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrCodeGenerated(android.graphics.Bitmap bitmap) {
            super("GetPaidEvent.QrCodeGenerated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.bitmap = bitmap;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeGenerated(bitmap=");
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
            return (other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated) && kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated) other).bitmap);
        }

        public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated copy(android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated copy$default(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated qrCodeGenerated, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = qrCodeGenerated.bitmap;
            }
            return qrCodeGenerated.copy(bitmap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$DoneClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DoneClicked extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DoneClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DoneClicked();

        public final int hashCode() {
            return -1158759848;
        }

        private DoneClicked() {
            super("GetPaidEvent.DoneClicked", null);
        }

        public final java.lang.String toString() {
            return "DoneClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DoneClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadClicked extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DownloadClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DownloadClicked();

        public final int hashCode() {
            return -1050918638;
        }

        private DownloadClicked() {
            super("GetPaidEvent.DownloadClicked", null);
        }

        public final java.lang.String toString() {
            return "DownloadClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DownloadClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent$InfoClicked;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InfoClicked extends com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.InfoClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.InfoClicked();

        public final int hashCode() {
            return 465899436;
        }

        private InfoClicked() {
            super("GetPaidEvent.InfoClicked", null);
        }

        public final java.lang.String toString() {
            return "InfoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.InfoClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ GetPaidEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
