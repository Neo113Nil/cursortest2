package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidRemoveUrlQuery.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRemoveUrlQuery;", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "<init>", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
