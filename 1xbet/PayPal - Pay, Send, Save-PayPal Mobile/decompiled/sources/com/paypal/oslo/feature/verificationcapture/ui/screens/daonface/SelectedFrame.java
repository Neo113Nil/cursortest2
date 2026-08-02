package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SelectedFrame;", "", "Lcom/daon/sdk/face/YUV;", "image", "Lcom/daon/sdk/face/Result;", "result", "", "eyeOpenScore", "", "collectedFrames", "<init>", "(Lcom/daon/sdk/face/YUV;Lcom/daon/sdk/face/Result;FI)V", "component1", "()Lcom/daon/sdk/face/YUV;", "component2", "()Lcom/daon/sdk/face/Result;", "component3", "()F", "component4", "()I", "copy", "(Lcom/daon/sdk/face/YUV;Lcom/daon/sdk/face/Result;FI)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SelectedFrame;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/daon/sdk/face/YUV;", "getImage", "Lcom/daon/sdk/face/Result;", "getResult", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getEyeOpenScore", com.visa.cbp.getEncExpo.warmup, "getCollectedFrames"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectedFrame {
    public static final int $stable = 8;
    private final int collectedFrames;
    private final float eyeOpenScore;
    private final com.daon.sdk.face.YUV image;
    private final com.daon.sdk.face.Result result;

    public SelectedFrame(com.daon.sdk.face.YUV yuv, com.daon.sdk.face.Result result, float f, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.image = yuv;
        this.result = result;
        this.eyeOpenScore = f;
        this.collectedFrames = i;
    }

    public final com.daon.sdk.face.YUV getImage() {
        return this.image;
    }

    public final com.daon.sdk.face.Result getResult() {
        return this.result;
    }

    public final float getEyeOpenScore() {
        return this.eyeOpenScore;
    }

    public final int getCollectedFrames() {
        return this.collectedFrames;
    }

    public final java.lang.String toString() {
        com.daon.sdk.face.YUV yuv = this.image;
        com.daon.sdk.face.Result result = this.result;
        float f = this.eyeOpenScore;
        int i = this.collectedFrames;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedFrame(image=");
        sb.append(yuv);
        sb.append(", result=");
        sb.append(result);
        sb.append(", eyeOpenScore=");
        sb.append(f);
        sb.append(", collectedFrames=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.image.hashCode() * 31) + this.result.hashCode()) * 31) + java.lang.Float.hashCode(this.eyeOpenScore)) * 31) + java.lang.Integer.hashCode(this.collectedFrames);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame selectedFrame = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, selectedFrame.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, selectedFrame.result) && java.lang.Float.compare(this.eyeOpenScore, selectedFrame.eyeOpenScore) == 0 && this.collectedFrames == selectedFrame.collectedFrames;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame copy(com.daon.sdk.face.YUV image, com.daon.sdk.face.Result result, float eyeOpenScore, int collectedFrames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame(image, result, eyeOpenScore, collectedFrames);
    }

    /* renamed from: component4, reason: from getter */
    public final int getCollectedFrames() {
        return this.collectedFrames;
    }

    /* renamed from: component3, reason: from getter */
    public final float getEyeOpenScore() {
        return this.eyeOpenScore;
    }

    /* renamed from: component2, reason: from getter */
    public final com.daon.sdk.face.Result getResult() {
        return this.result;
    }

    /* renamed from: component1, reason: from getter */
    public final com.daon.sdk.face.YUV getImage() {
        return this.image;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame selectedFrame, com.daon.sdk.face.YUV yuv, com.daon.sdk.face.Result result, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            yuv = selectedFrame.image;
        }
        if ((i2 & 2) != 0) {
            result = selectedFrame.result;
        }
        if ((i2 & 4) != 0) {
            f = selectedFrame.eyeOpenScore;
        }
        if ((i2 & 8) != 0) {
            i = selectedFrame.collectedFrames;
        }
        return selectedFrame.copy(yuv, result, f, i);
    }
}
