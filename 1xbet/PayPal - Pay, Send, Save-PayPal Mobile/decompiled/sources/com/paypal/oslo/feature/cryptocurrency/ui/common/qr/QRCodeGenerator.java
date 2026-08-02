package com.paypal.oslo.feature.cryptocurrency.ui.common.qr;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeGenerator;", "", "<init>", "()V", "Lcom/google/zxing/common/BitMatrix;", "matrix", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeGenerator$QRVersion;", "getVersion", "(Lcom/google/zxing/common/BitMatrix;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeGenerator$QRVersion;", "", "content", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "errorCorrection", "generateQRCode", "(Ljava/lang/String;ILcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;)Lcom/google/zxing/common/BitMatrix;", "QRVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QRCodeGenerator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator();

    private QRCodeGenerator() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeGenerator$QRVersion;", "", "", "version", "moduleCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeGenerator$QRVersion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", com.visa.cbp.getEncExpo.warmup, "getVersion", "getModuleCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QRVersion {
        public static final int $stable = 0;
        private final int moduleCount;
        private final int version;

        public QRVersion(int i, int i2) {
            this.version = i;
            this.moduleCount = i2;
        }

        public final int getVersion() {
            return this.version;
        }

        public final int getModuleCount() {
            return this.moduleCount;
        }

        public final java.lang.String toString() {
            int i = this.version;
            int i2 = this.moduleCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Version ");
            sb.append(i);
            sb.append(" (");
            sb.append(i2);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.MULTIPLIER_SIGN);
            sb.append(i2);
            sb.append(" modules)");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.version) * 31) + java.lang.Integer.hashCode(this.moduleCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion qRVersion = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion) other;
            return this.version == qRVersion.version && this.moduleCount == qRVersion.moduleCount;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion copy(int version, int moduleCount) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion(version, moduleCount);
        }

        /* renamed from: component2, reason: from getter */
        public final int getModuleCount() {
            return this.moduleCount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion qRVersion, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = qRVersion.version;
            }
            if ((i3 & 2) != 0) {
                i2 = qRVersion.moduleCount;
            }
            return qRVersion.copy(i, i2);
        }
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion getVersion(com.google.zxing.common.BitMatrix matrix) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matrix, "");
        int width = matrix.getWidth();
        if (width != matrix.getHeight()) {
            return null;
        }
        int i2 = width - 21;
        if (i2 % 4 == 0 && (i = (i2 / 4) + 1) > 0 && i < 41) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.QRVersion(i, width);
        }
        return null;
    }

    public static /* synthetic */ com.google.zxing.common.BitMatrix generateQRCode$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator qRCodeGenerator, java.lang.String str, int i, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            errorCorrectionLevel = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.M;
        }
        return qRCodeGenerator.generateQRCode(str, i, errorCorrectionLevel);
    }

    public final com.google.zxing.common.BitMatrix generateQRCode(java.lang.String content, int size, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCorrection, "");
        if (kotlin.text.StringsKt.isBlank(content)) {
            return null;
        }
        try {
            return new com.google.zxing.MultiFormatWriter().encode(content, com.google.zxing.BarcodeFormat.QR_CODE, size, size, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.ERROR_CORRECTION, errorCorrection), kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.MARGIN, 0)));
        } catch (com.google.zxing.WriterException | java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
