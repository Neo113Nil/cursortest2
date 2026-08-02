package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Failed;", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Loading;", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
abstract class ThumbnailState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Loading;", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading();

        public final int hashCode() {
            return 868322840;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private ThumbnailState() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Success;", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(android.graphics.Bitmap bitmap) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.bitmap = bitmap;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(bitmap=");
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
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, ((com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success) other).bitmap);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success copy(android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return new com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success copy$default(com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success success, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = success.bitmap;
            }
            return success.copy(bitmap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState$Failed;", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed();

        public final int hashCode() {
            return -17900575;
        }

        private Failed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Failed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ThumbnailState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
