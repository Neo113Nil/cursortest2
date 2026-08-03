package com.inmobi.media.ads.network.inmobiJson.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/Title;", "", "<init>", "()V", "text", "", "getText", "()Ljava/lang/String;", "required", "", "getRequired", "()Z", "link", "Lcom/inmobi/media/ads/network/inmobiJson/model/Link;", "getLink", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Link;", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "getTrackers", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Title {
    private final com.inmobi.media.ads.network.inmobiJson.model.Link link;
    private final boolean required;
    private final java.lang.String text = "";
    private final java.util.List<com.inmobi.media.ads.network.common.model.TrackingInfo> trackers = new java.util.ArrayList();

    public final com.inmobi.media.ads.network.inmobiJson.model.Link getLink() {
        return this.link;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.util.List<com.inmobi.media.ads.network.common.model.TrackingInfo> getTrackers() {
        return this.trackers;
    }
}
