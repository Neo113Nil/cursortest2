package coil3.content.cachecontrol.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\"\b\u0000\u0018\u0000 22\u00020\u0001:\u00012Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u001c\u0010.\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcoil3/network/cachecontrol/internal/CacheControl;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "", "p12", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "noCache", "Z", "getNoCache", "()Z", "noStore", "getNoStore", "maxAgeSeconds", com.visa.cbp.getEncExpo.warmup, "getMaxAgeSeconds", "()I", "sMaxAgeSeconds", "getSMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "getMustRevalidate", "maxStaleSeconds", "getMaxStaleSeconds", "minFreshSeconds", "getMinFreshSeconds", "onlyIfCached", "getOnlyIfCached", "noTransform", "getNoTransform", "immutable", "getImmutable", "headerValue", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheControl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.content.cachecontrol.internal.CacheControl.Companion INSTANCE = new coil3.content.cachecontrol.internal.CacheControl.Companion(null);
    private final java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, java.lang.String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public final boolean getNoCache() {
        return this.noCache;
    }

    public final boolean getNoStore() {
        return this.noStore;
    }

    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean getNoTransform() {
        return this.noTransform;
    }

    public final boolean getImmutable() {
        return this.immutable;
    }

    public final java.lang.String getHeaderValue() {
        return this.headerValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcoil3/network/cachecontrol/internal/CacheControl$Companion;", "", "<init>", "()V", "Lcoil3/network/NetworkHeaders;", "headers", "Lcoil3/network/cachecontrol/internal/CacheControl;", "parse", "(Lcoil3/network/NetworkHeaders;)Lcoil3/network/cachecontrol/internal/CacheControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final coil3.content.cachecontrol.internal.CacheControl parse(coil3.content.NetworkHeaders headers) {
            int i;
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it;
            int i2;
            java.lang.String str;
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it2 = headers.asMap().entrySet().iterator();
            boolean z = true;
            boolean z2 = true;
            java.lang.String str2 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = -1;
            int i4 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i5 = -1;
            int i6 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (it2.hasNext()) {
                java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it2.next();
                java.lang.String key = next.getKey();
                java.lang.String str3 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) next.getValue());
                if (str3 != null) {
                    if (kotlin.text.StringsKt.equals(key, "Cache-Control", z)) {
                        if (str2 == null) {
                            str2 = str3;
                            i = 0;
                            while (i < str3.length()) {
                                int indexOfElement = coil3.content.cachecontrol.internal.UtilsKt.indexOfElement(str3, "=,;", i);
                                java.lang.String substring = str3.substring(i, indexOfElement);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                java.lang.String obj = kotlin.text.StringsKt.trim(substring).toString();
                                if (indexOfElement != str3.length()) {
                                    it = it2;
                                    if (str3.charAt(indexOfElement) != ',' && str3.charAt(indexOfElement) != ';') {
                                        int indexOfNonWhitespace = coil3.content.cachecontrol.internal.UtilsKt.indexOfNonWhitespace(str3, indexOfElement + 1);
                                        if (indexOfNonWhitespace < str3.length() && str3.charAt(indexOfNonWhitespace) == '\"') {
                                            int i7 = indexOfNonWhitespace + 1;
                                            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '\"', i7, false, 4, (java.lang.Object) null);
                                            str = str3.substring(i7, indexOf$default);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                                            i2 = indexOf$default + 1;
                                        } else {
                                            i2 = coil3.content.cachecontrol.internal.UtilsKt.indexOfElement(str3, ",;", indexOfNonWhitespace);
                                            java.lang.String substring2 = str3.substring(indexOfNonWhitespace, i2);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                                            str = kotlin.text.StringsKt.trim(substring2).toString();
                                        }
                                        if (!kotlin.text.StringsKt.equals("no-cache", obj, true)) {
                                            z3 = true;
                                        } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.NO_STORE, obj, true)) {
                                            z4 = true;
                                        } else {
                                            if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MAX_AGE, obj, true)) {
                                                i3 = coil3.content.cachecontrol.internal.UtilsKt.toNonNegativeInt(str, -1);
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.S_MAX_AGE, obj, true)) {
                                                i4 = coil3.content.cachecontrol.internal.UtilsKt.toNonNegativeInt(str, -1);
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.PRIVATE, obj, true)) {
                                                z5 = true;
                                            } else if (kotlin.text.StringsKt.equals("public", obj, true)) {
                                                z6 = true;
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MUST_REVALIDATE, obj, true)) {
                                                z7 = true;
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MAX_STALE, obj, true)) {
                                                i5 = coil3.content.cachecontrol.internal.UtilsKt.toNonNegativeInt(str, Integer.MAX_VALUE);
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MIN_FRESH, obj, true)) {
                                                i6 = coil3.content.cachecontrol.internal.UtilsKt.toNonNegativeInt(str, -1);
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.ONLY_IF_CACHED, obj, true)) {
                                                z8 = true;
                                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.NO_TRANSFORM, obj, true)) {
                                                z9 = true;
                                            } else if (kotlin.text.StringsKt.equals("immutable", obj, true)) {
                                                z10 = true;
                                            }
                                            i = i2;
                                            z = true;
                                            it2 = it;
                                        }
                                        i = i2;
                                        z = true;
                                        it2 = it;
                                    }
                                } else {
                                    it = it2;
                                }
                                i2 = indexOfElement + 1;
                                str = null;
                                if (!kotlin.text.StringsKt.equals("no-cache", obj, true)) {
                                }
                                i = i2;
                                z = true;
                                it2 = it;
                            }
                        }
                    } else if (kotlin.text.StringsKt.equals(key, com.google.common.net.HttpHeaders.PRAGMA, z)) {
                    }
                    z2 = false;
                    i = 0;
                    while (i < str3.length()) {
                    }
                }
                z = z;
                it2 = it2;
            }
            return new coil3.content.cachecontrol.internal.CacheControl(z3, z4, i3, i4, z5, z6, z7, i5, i6, z8, z9, z10, !z2 ? null : str2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
