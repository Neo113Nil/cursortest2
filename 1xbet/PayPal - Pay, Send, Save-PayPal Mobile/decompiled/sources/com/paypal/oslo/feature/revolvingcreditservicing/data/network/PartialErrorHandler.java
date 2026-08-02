package com.paypal.oslo.feature.revolvingcreditservicing.data.network;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialError;", "partialErrors", "<init>", "(Ljava/util/List;)V", "", "", "paths", "", "contains", "([Ljava/lang/String;)Z", "containsAny", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PartialErrorHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;

    public PartialErrorHandler(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.HashSet hashSet = new java.util.HashSet(list.size());
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String fullPath = ((com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError) it.next()).getFullPath();
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = fullPath.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            hashSet.add(lowerCase);
        }
        this.getHighSpeedVideoFpsRanges = hashSet;
    }

    public /* synthetic */ PartialErrorHandler(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final boolean contains(java.lang.String... paths) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
        for (java.lang.String str : paths) {
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRanges;
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!set.contains(lowerCase)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAny(java.lang.String... paths) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
        for (java.lang.String str : paths) {
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRanges;
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (set.contains(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartialErrorHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
