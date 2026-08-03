package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ki {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f4801a;
    public final com.inmobi.media.ads.network.inmobiJson.model.MainLink b;
    public final java.util.List c;

    public Ki(java.util.LinkedHashMap assetIdToLinkMap, com.inmobi.media.ads.network.inmobiJson.model.MainLink mainLink, java.util.List responseClickTrackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetIdToLinkMap, "assetIdToLinkMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseClickTrackers, "responseClickTrackers");
        this.f4801a = assetIdToLinkMap;
        this.b = mainLink;
        this.c = responseClickTrackers;
    }
}
