package okhttp3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 (2\u00020\u0001:\u0002)(Bs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b\f\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b\u000e\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u000f\u0010\u0015R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'"}, d2 = {"Lokhttp3/CacheControl;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "-deprecated_noCache", "()Z", "-deprecated_noStore", "-deprecated_maxAgeSeconds", "()I", "-deprecated_sMaxAgeSeconds", "-deprecated_mustRevalidate", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_onlyIfCached", "-deprecated_noTransform", "-deprecated_immutable", "toString", "()Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/String;", "getHeaderValue$okhttp", "setHeaderValue$okhttp", "(Ljava/lang/String;)V", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheControl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CacheControl.Companion INSTANCE;
    public static final okhttp3.CacheControl FORCE_CACHE;
    public static final okhttp3.CacheControl FORCE_NETWORK;
    private java.lang.String headerValue;
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

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, java.lang.String str) {
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

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int sMaxAgeSeconds() {
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

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    /* renamed from: getHeaderValue$okhttp, reason: from getter */
    public final java.lang.String getHeaderValue() {
        return this.headerValue;
    }

    public final void setHeaderValue$okhttp(java.lang.String str) {
        this.headerValue = str;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    /* renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    /* renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    /* renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    /* renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    public final java.lang.String toString() {
        return okhttp3.internal._CacheControlCommonKt.commonToString(this);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000b\u0010\u0015J\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00198\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010!\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010\u0007\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\"\u0010\b\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u0010\t\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "<init>", "()V", "noCache", "()Lokhttp3/CacheControl$Builder;", "noStore", "onlyIfCached", "noTransform", "immutable", "Lkotlin/time/Duration;", "maxAge", "maxAge-LRDsOJo", "(J)Lokhttp3/CacheControl$Builder;", "maxStale", "maxStale-LRDsOJo", "minFresh", "minFresh-LRDsOJo", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/CacheControl$Builder;", "Lokhttp3/CacheControl;", "build", "()Lokhttp3/CacheControl;", "", "Z", "getNoCache$okhttp", "()Z", "setNoCache$okhttp", "(Z)V", "getNoStore$okhttp", "setNoStore$okhttp", "maxAgeSeconds", com.visa.cbp.getEncExpo.warmup, "getMaxAgeSeconds$okhttp", "()I", "setMaxAgeSeconds$okhttp", "(I)V", "maxStaleSeconds", "getMaxStaleSeconds$okhttp", "setMaxStaleSeconds$okhttp", "minFreshSeconds", "getMinFreshSeconds$okhttp", "setMinFreshSeconds$okhttp", "getOnlyIfCached$okhttp", "setOnlyIfCached$okhttp", "getNoTransform$okhttp", "setNoTransform$okhttp", "getImmutable$okhttp", "setImmutable$okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        /* renamed from: getNoCache$okhttp, reason: from getter */
        public final boolean getNoCache() {
            return this.noCache;
        }

        public final void setNoCache$okhttp(boolean z) {
            this.noCache = z;
        }

        /* renamed from: getNoStore$okhttp, reason: from getter */
        public final boolean getNoStore() {
            return this.noStore;
        }

        public final void setNoStore$okhttp(boolean z) {
            this.noStore = z;
        }

        /* renamed from: getMaxAgeSeconds$okhttp, reason: from getter */
        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        public final void setMaxAgeSeconds$okhttp(int i) {
            this.maxAgeSeconds = i;
        }

        /* renamed from: getMaxStaleSeconds$okhttp, reason: from getter */
        public final int getMaxStaleSeconds() {
            return this.maxStaleSeconds;
        }

        public final void setMaxStaleSeconds$okhttp(int i) {
            this.maxStaleSeconds = i;
        }

        /* renamed from: getMinFreshSeconds$okhttp, reason: from getter */
        public final int getMinFreshSeconds() {
            return this.minFreshSeconds;
        }

        public final void setMinFreshSeconds$okhttp(int i) {
            this.minFreshSeconds = i;
        }

        /* renamed from: getOnlyIfCached$okhttp, reason: from getter */
        public final boolean getOnlyIfCached() {
            return this.onlyIfCached;
        }

        public final void setOnlyIfCached$okhttp(boolean z) {
            this.onlyIfCached = z;
        }

        /* renamed from: getNoTransform$okhttp, reason: from getter */
        public final boolean getNoTransform() {
            return this.noTransform;
        }

        public final void setNoTransform$okhttp(boolean z) {
            this.noTransform = z;
        }

        /* renamed from: getImmutable$okhttp, reason: from getter */
        public final boolean getImmutable() {
            return this.immutable;
        }

        public final void setImmutable$okhttp(boolean z) {
            this.immutable = z;
        }

        public final okhttp3.CacheControl.Builder noCache() {
            return okhttp3.internal._CacheControlCommonKt.commonNoCache(this);
        }

        public final okhttp3.CacheControl.Builder noStore() {
            return okhttp3.internal._CacheControlCommonKt.commonNoStore(this);
        }

        public final okhttp3.CacheControl.Builder onlyIfCached() {
            return okhttp3.internal._CacheControlCommonKt.commonOnlyIfCached(this);
        }

        public final okhttp3.CacheControl.Builder noTransform() {
            return okhttp3.internal._CacheControlCommonKt.commonNoTransform(this);
        }

        public final okhttp3.CacheControl.Builder immutable() {
            return okhttp3.internal._CacheControlCommonKt.commonImmutable(this);
        }

        /* renamed from: maxAge-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m24294maxAgeLRDsOJo(long maxAge) {
            long m23956getInWholeSecondsimpl = kotlin.time.Duration.m23956getInWholeSecondsimpl(maxAge);
            if (m23956getInWholeSecondsimpl < 0) {
                throw new java.lang.IllegalArgumentException("maxAge < 0: ".concat(java.lang.String.valueOf(m23956getInWholeSecondsimpl)).toString());
            }
            this.maxAgeSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(m23956getInWholeSecondsimpl);
            return this;
        }

        /* renamed from: maxStale-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m24295maxStaleLRDsOJo(long maxStale) {
            long m23956getInWholeSecondsimpl = kotlin.time.Duration.m23956getInWholeSecondsimpl(maxStale);
            if (m23956getInWholeSecondsimpl < 0) {
                throw new java.lang.IllegalArgumentException("maxStale < 0: ".concat(java.lang.String.valueOf(m23956getInWholeSecondsimpl)).toString());
            }
            this.maxStaleSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(m23956getInWholeSecondsimpl);
            return this;
        }

        /* renamed from: minFresh-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m24296minFreshLRDsOJo(long minFresh) {
            long m23956getInWholeSecondsimpl = kotlin.time.Duration.m23956getInWholeSecondsimpl(minFresh);
            if (m23956getInWholeSecondsimpl < 0) {
                throw new java.lang.IllegalArgumentException("minFresh < 0: ".concat(java.lang.String.valueOf(m23956getInWholeSecondsimpl)).toString());
            }
            this.minFreshSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(m23956getInWholeSecondsimpl);
            return this;
        }

        public final okhttp3.CacheControl.Builder maxAge(int maxAge, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            if (maxAge < 0) {
                throw new java.lang.IllegalArgumentException("maxAge < 0: ".concat(java.lang.String.valueOf(maxAge)).toString());
            }
            this.maxAgeSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(maxAge));
            return this;
        }

        public final okhttp3.CacheControl.Builder maxStale(int maxStale, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            if (maxStale < 0) {
                throw new java.lang.IllegalArgumentException("maxStale < 0: ".concat(java.lang.String.valueOf(maxStale)).toString());
            }
            this.maxStaleSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final okhttp3.CacheControl.Builder minFresh(int minFresh, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            if (minFresh < 0) {
                throw new java.lang.IllegalArgumentException("minFresh < 0: ".concat(java.lang.String.valueOf(minFresh)).toString());
            }
            this.minFreshSeconds = okhttp3.internal._CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(minFresh));
            return this;
        }

        public final okhttp3.CacheControl build() {
            return okhttp3.internal._CacheControlCommonKt.commonBuild(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "parse", "(Lokhttp3/Headers;)Lokhttp3/CacheControl;", "FORCE_NETWORK", "Lokhttp3/CacheControl;", "FORCE_CACHE"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.CacheControl parse(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            return okhttp3.internal._CacheControlCommonKt.commonParse(this, headers);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.CacheControl.Companion companion = new okhttp3.CacheControl.Companion(null);
        INSTANCE = companion;
        FORCE_NETWORK = okhttp3.internal._CacheControlCommonKt.commonForceNetwork(companion);
        FORCE_CACHE = okhttp3.internal._CacheControlCommonKt.commonForceCache(companion);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.CacheControl parse(okhttp3.Headers headers) {
        return INSTANCE.parse(headers);
    }
}
