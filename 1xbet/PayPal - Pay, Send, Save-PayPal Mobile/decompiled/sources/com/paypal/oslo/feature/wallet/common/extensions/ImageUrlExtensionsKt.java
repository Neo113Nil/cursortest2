package com.paypal.oslo.feature.wallet.common.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00002\u001a\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "baseCdnLinkPath", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "buildCardArtUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Lkotlin/Pair;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY, "extractThumbnailUrl", "(Ljava/util/List;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImageUrlExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r4 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String buildCardArtUrl(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String substringAfterLast$default;
        if (str == null) {
            return null;
        }
        if (str2 != null && (substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(str2, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null)) != null) {
            str3 = substringAfterLast$default.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        }
        str3 = "JPG";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/$_2.");
        sb.append(str3);
        return sb.toString();
    }

    public static final java.lang.String extractThumbnailUrl(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.Pair pair;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.Pair) obj2).getFirst(), "THUMBNAIL")) {
                    break;
                }
            }
            kotlin.Pair pair2 = (kotlin.Pair) obj2;
            if (pair2 != null && (str = (java.lang.String) pair2.getSecond()) != null) {
                return str;
            }
        }
        if (list != null) {
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.Pair) obj).getFirst(), "PRIMARY")) {
                    break;
                }
            }
            kotlin.Pair pair3 = (kotlin.Pair) obj;
            if (pair3 != null) {
                return (java.lang.String) pair3.getSecond();
            }
        }
        if (list == null || (pair = (kotlin.Pair) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) {
            return null;
        }
        return (java.lang.String) pair.getSecond();
    }
}
