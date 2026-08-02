package com.paypal.oslo.feature.cryptocurrency.ui.common.qr;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector;", "", "<init>", "()V", "Lcom/google/zxing/common/BitMatrix;", "matrix", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;", "detectPositionMarkers", "(Lcom/google/zxing/common/BitMatrix;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;", "", "x", "y", "markers", "", "isPositionMarker", "(IILcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;)Z", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "region", "isInMarkerRegion", "(IILcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;)Z", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMark;", "getPositionMark", "(IILcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMark;", "POSITION_MARKER_SIZE", com.visa.cbp.getEncExpo.warmup, "PositionMark", "PositionMarkers", "MarkerRegion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QRCodePositionDetector {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector();
    public static final int POSITION_MARKER_SIZE = 7;

    private QRCodePositionDetector() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMark;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PositionMark {
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark BOTTOM_LEFT;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark TOP_LEFT;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark TOP_RIGHT;
        private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private PositionMark(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark positionMark = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark("TOP_LEFT", 0);
            TOP_LEFT = positionMark;
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark positionMark2 = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark("TOP_RIGHT", 1);
            TOP_RIGHT = positionMark2;
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark positionMark3 = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark("BOTTOM_LEFT", 2);
            BOTTOM_LEFT = positionMark3;
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark[] positionMarkArr = {positionMark, positionMark2, positionMark3};
            getHighSpeedVideoFpsRanges = positionMarkArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(positionMarkArr);
        }

        public static com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark[] values() {
            return (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "topLeft", "topRight", "bottomLeft", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "getTopLeft", "getTopRight", "getBottomLeft"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PositionMarkers {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion bottomLeft;
        private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion topLeft;
        private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion topRight;

        public PositionMarkers(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion2, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerRegion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerRegion2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerRegion3, "");
            this.topLeft = markerRegion;
            this.topRight = markerRegion2;
            this.bottomLeft = markerRegion3;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getTopLeft() {
            return this.topLeft;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getTopRight() {
            return this.topRight;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getBottomLeft() {
            return this.bottomLeft;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion = this.topLeft;
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion2 = this.topRight;
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion3 = this.bottomLeft;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PositionMarkers(topLeft=");
            sb.append(markerRegion);
            sb.append(", topRight=");
            sb.append(markerRegion2);
            sb.append(", bottomLeft=");
            sb.append(markerRegion3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomLeft.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers positionMarkers = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.topLeft, positionMarkers.topLeft) && kotlin.jvm.internal.Intrinsics.areEqual(this.topRight, positionMarkers.topRight) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomLeft, positionMarkers.bottomLeft);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers copy(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion topLeft, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion topRight, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion bottomLeft) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topLeft, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topRight, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomLeft, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers(topLeft, topRight, bottomLeft);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getBottomLeft() {
            return this.bottomLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getTopRight() {
            return this.topRight;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion getTopLeft() {
            return this.topLeft;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers positionMarkers, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion2, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                markerRegion = positionMarkers.topLeft;
            }
            if ((i & 2) != 0) {
                markerRegion2 = positionMarkers.topRight;
            }
            if ((i & 4) != 0) {
                markerRegion3 = positionMarkers.bottomLeft;
            }
            return positionMarkers.copy(markerRegion, markerRegion2, markerRegion3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "", "", "startX", "startY", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStartX", "getStartY", "getSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MarkerRegion {
        public static final int $stable = 0;
        private final int size;
        private final int startX;
        private final int startY;

        public MarkerRegion(int i, int i2, int i3) {
            this.startX = i;
            this.startY = i2;
            this.size = i3;
        }

        public /* synthetic */ MarkerRegion(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i4 & 4) != 0 ? 7 : i3);
        }

        public final int getStartX() {
            return this.startX;
        }

        public final int getStartY() {
            return this.startY;
        }

        public final int getSize() {
            return this.size;
        }

        public final java.lang.String toString() {
            int i = this.startX;
            int i2 = this.startY;
            int i3 = this.size;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkerRegion(startX=");
            sb.append(i);
            sb.append(", startY=");
            sb.append(i2);
            sb.append(", size=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.startX) * 31) + java.lang.Integer.hashCode(this.startY)) * 31) + java.lang.Integer.hashCode(this.size);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion) other;
            return this.startX == markerRegion.startX && this.startY == markerRegion.startY && this.size == markerRegion.size;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion copy(int startX, int startY, int size) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion(startX, startY, size);
        }

        /* renamed from: component3, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStartY() {
            return this.startY;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStartX() {
            return this.startX;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = markerRegion.startX;
            }
            if ((i4 & 2) != 0) {
                i2 = markerRegion.startY;
            }
            if ((i4 & 4) != 0) {
                i3 = markerRegion.size;
            }
            return markerRegion.copy(i, i2, i3);
        }
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers detectPositionMarkers(com.google.zxing.common.BitMatrix matrix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matrix, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers(new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion(0, 0, 0, 4, null), new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion(matrix.getWidth() - 7, 0, 0, 4, null), new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion(0, matrix.getHeight() - 7, 0, 4, null));
    }

    public final boolean isPositionMarker(int x, int y, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers markers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markers, "");
        return isInMarkerRegion(x, y, markers.getTopLeft()) || isInMarkerRegion(x, y, markers.getTopRight()) || isInMarkerRegion(x, y, markers.getBottomLeft());
    }

    public final boolean isInMarkerRegion(int x, int y, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "");
        return x >= region.getStartX() && x < region.getStartX() + region.getSize() && y >= region.getStartY() && y < region.getStartY() + region.getSize();
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark getPositionMark(int x, int y, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers markers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markers, "");
        if (isInMarkerRegion(x, y, markers.getTopLeft())) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.TOP_LEFT;
        }
        if (isInMarkerRegion(x, y, markers.getTopRight())) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.TOP_RIGHT;
        }
        if (isInMarkerRegion(x, y, markers.getBottomLeft())) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.BOTTOM_LEFT;
        }
        return null;
    }
}
