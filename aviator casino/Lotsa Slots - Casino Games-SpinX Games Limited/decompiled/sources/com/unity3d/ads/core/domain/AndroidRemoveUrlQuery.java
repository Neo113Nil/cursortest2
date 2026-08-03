package com.unity3d.ads.core.domain;

/* compiled from: AndroidRemoveUrlQuery.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRemoveUrlQuery;", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidRemoveUrlQuery implements com.unity3d.ads.core.domain.RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public java.lang.String invoke(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String uri = android.net.Uri.parse(url).buildUpon().clearQuery().build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "parse(url).buildUpon().c…uery().build().toString()");
        return uri;
    }
}
