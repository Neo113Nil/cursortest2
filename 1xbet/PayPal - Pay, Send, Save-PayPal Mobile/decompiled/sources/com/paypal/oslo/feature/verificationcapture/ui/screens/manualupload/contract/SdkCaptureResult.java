package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/SdkCaptureResult;", "", "", "imageData", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "([BLjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()[B", "component2", "()Ljava/lang/String;", "copy", "([BLjava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/SdkCaptureResult;", "toString", "[B", "getImageData", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SdkCaptureResult {
    public static final int $stable = 8;
    private final byte[] imageData;
    private final java.lang.String mimeType;

    public SdkCaptureResult(byte[] bArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.imageData = bArr;
        this.mimeType = str;
    }

    public final byte[] getImageData() {
        return this.imageData;
    }

    public /* synthetic */ SdkCaptureResult(byte[] bArr, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? "image/jpeg" : str);
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult sdkCaptureResult = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult) other;
        return java.util.Arrays.equals(this.imageData, sdkCaptureResult.imageData) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, sdkCaptureResult.mimeType);
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.imageData) * 31) + this.mimeType.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.imageData);
        java.lang.String str = this.mimeType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkCaptureResult(imageData=");
        sb.append(arrays);
        sb.append(", mimeType=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult copy(byte[] imageData, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult(imageData, mimeType);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getImageData() {
        return this.imageData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult sdkCaptureResult, byte[] bArr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = sdkCaptureResult.imageData;
        }
        if ((i & 2) != 0) {
            str = sdkCaptureResult.mimeType;
        }
        return sdkCaptureResult.copy(bArr, str);
    }
}
