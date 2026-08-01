package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Zj {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6995a;
    public final MainLink b;
    public final List c;

    public Zj(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        Intrinsics.checkNotNullParameter(assetIdToLinkMap, "assetIdToLinkMap");
        Intrinsics.checkNotNullParameter(responseClickTrackers, "responseClickTrackers");
        this.f6995a = assetIdToLinkMap;
        this.b = mainLink;
        this.c = responseClickTrackers;
    }
}
