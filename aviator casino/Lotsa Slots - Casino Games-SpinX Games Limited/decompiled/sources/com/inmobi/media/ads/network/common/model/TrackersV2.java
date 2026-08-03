package com.inmobi.media.ads.network.common.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/TrackersV2;", "", "<init>", "()V", "type", "", "getType$annotations", "getType", "()Ljava/lang/String;", "url", "", "getUrl", "()Ljava/util/List;", "imExts", "getImExts", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrackersV2 {
    private final java.lang.String type;
    private final java.util.List<java.lang.String> url = new java.util.ArrayList();
    private final java.util.List<java.lang.String> imExts = new java.util.ArrayList();

    public static /* synthetic */ void getType$annotations() {
    }

    public final java.util.List<java.lang.String> getImExts() {
        return this.imExts;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.util.List<java.lang.String> getUrl() {
        return this.url;
    }
}
