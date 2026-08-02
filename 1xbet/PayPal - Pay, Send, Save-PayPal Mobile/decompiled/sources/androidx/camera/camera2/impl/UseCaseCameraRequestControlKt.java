package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/impl/TagBundle;", "", "", "", "toMap", "(Landroidx/camera/core/impl/TagBundle;)Ljava/util/Map;", "", "DEFAULT_REQUEST_TEMPLATE", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseCameraRequestControlKt {
    public static final int DEFAULT_REQUEST_TEMPLATE = 1;

    public static final java.util.Map<java.lang.String, java.lang.Object> toMap(androidx.camera.core.impl.TagBundle tagBundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tagBundle, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set<java.lang.String> listKeys = tagBundle.listKeys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listKeys, "");
        for (java.lang.String str : listKeys) {
            java.lang.Object tag = tagBundle.getTag(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(tag, "");
            linkedHashMap.put(str, tag);
        }
        return linkedHashMap;
    }
}
