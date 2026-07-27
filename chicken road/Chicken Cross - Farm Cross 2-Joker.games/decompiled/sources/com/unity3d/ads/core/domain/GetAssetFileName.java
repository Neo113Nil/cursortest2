package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: GetAssetFileName.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAssetFileName;", "", "<init>", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAssetFileName {
    public final String invoke(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String substringAfterLast = StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null), FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), '.', "");
        if (!StringsKt.isBlank(substringAfterLast)) {
            return StringExtensionsKt.getSHA256Hash(url) + '.' + substringAfterLast;
        }
        return StringExtensionsKt.getSHA256Hash(url);
    }
}
