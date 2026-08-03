package com.facebook.share.internal;

/* compiled from: ShareDialogFeature.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/share/internal/ShareDialogFeature;", "", "Lcom/facebook/internal/DialogFeature;", "minVersion", "", "(Ljava/lang/String;II)V", "getAction", "", "getMinVersion", "SHARE_DIALOG", com.facebook.share.internal.ShareConstants.PHOTOS, com.facebook.share.internal.ShareConstants.VIDEO_URL, "MULTIMEDIA", com.facebook.share.internal.ShareConstants.HASHTAG, "LINK_SHARE_QUOTES", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum ShareDialogFeature implements com.facebook.internal.DialogFeature {
    SHARE_DIALOG(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20130618),
    PHOTOS(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20140204),
    VIDEO(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20141028),
    MULTIMEDIA(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20160327),
    HASHTAG(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20160327),
    LINK_SHARE_QUOTES(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20160327);

    private final int minVersion;

    ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.DialogFeature
    public java.lang.String getAction() {
        return com.facebook.internal.NativeProtocol.ACTION_FEED_DIALOG;
    }

    @Override // com.facebook.internal.DialogFeature
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.share.internal.ShareDialogFeature[] valuesCustom() {
        com.facebook.share.internal.ShareDialogFeature[] valuesCustom = values();
        return (com.facebook.share.internal.ShareDialogFeature[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
