package coil3.memory;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003 !\"J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u00020\u000e8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u000e8'X¦\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/memory/MemoryCache;", "", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/memory/MemoryCache$Value;)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "", io.ktor.http.ContentDisposition.Parameters.Size, "trimToSize", "(J)V", "clear", "()V", "getSize", "()J", "getMaxSize", "setMaxSize", "maxSize", "getInitialMaxSize", "getInitialMaxSize$annotations", "initialMaxSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Key", "Value", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MemoryCache {
    static /* synthetic */ void getInitialMaxSize$annotations() {
    }

    void clear();

    coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key);

    long getInitialMaxSize();

    java.util.Set<coil3.memory.MemoryCache.Key> getKeys();

    long getMaxSize();

    long getSize();

    boolean remove(coil3.memory.MemoryCache.Key key);

    void set(coil3.memory.MemoryCache.Key key, coil3.memory.MemoryCache.Value value);

    void setMaxSize(long j);

    void trimToSize(long size);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcoil3/memory/MemoryCache$Key;", "", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcoil3/memory/MemoryCache$Key;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getKey", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Key {
        private final java.util.Map<java.lang.String, java.lang.String> extras;
        private final java.lang.String key;

        public Key(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            this.key = str;
            this.extras = coil3.content.Collections_jvmCommonKt.toImmutableMap(map);
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public /* synthetic */ Key(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
            return this.extras;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ coil3.memory.MemoryCache.Key copy$default(coil3.memory.MemoryCache.Key key, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = key.key;
            }
            if ((i & 2) != 0) {
                map = key.extras;
            }
            return key.copy(str, map);
        }

        public final coil3.memory.MemoryCache.Key copy(java.lang.String key, java.util.Map<java.lang.String, java.lang.String> extras) {
            return new coil3.memory.MemoryCache.Key(key, extras);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof coil3.memory.MemoryCache.Key)) {
                return false;
            }
            coil3.memory.MemoryCache.Key key = (coil3.memory.MemoryCache.Key) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, key.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, key.extras);
        }

        public final int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.util.Map<java.lang.String, java.lang.String> map = this.extras;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(key=");
            sb.append(str);
            sb.append(", extras=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(java.lang.String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcoil3/memory/MemoryCache$Value;", "", "Lcoil3/Image;", "image", "", "", "extras", "<init>", "(Lcoil3/Image;Ljava/util/Map;)V", "copy", "(Lcoil3/Image;Ljava/util/Map;)Lcoil3/memory/MemoryCache$Value;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Value {
        private final java.util.Map<java.lang.String, java.lang.Object> extras;
        private final coil3.Image image;

        public Value(coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.image = image;
            this.extras = coil3.content.Collections_jvmCommonKt.toImmutableMap(map);
        }

        public final coil3.Image getImage() {
            return this.image;
        }

        public /* synthetic */ Value(coil3.Image image, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(image, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getExtras() {
            return this.extras;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ coil3.memory.MemoryCache.Value copy$default(coil3.memory.MemoryCache.Value value, coil3.Image image, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                image = value.image;
            }
            if ((i & 2) != 0) {
                map = value.extras;
            }
            return value.copy(image, map);
        }

        public final coil3.memory.MemoryCache.Value copy(coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras) {
            return new coil3.memory.MemoryCache.Value(image, extras);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof coil3.memory.MemoryCache.Value)) {
                return false;
            }
            coil3.memory.MemoryCache.Value value = (coil3.memory.MemoryCache.Value) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, value.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, value.extras);
        }

        public final int hashCode() {
            return (this.image.hashCode() * 31) + this.extras.hashCode();
        }

        public final java.lang.String toString() {
            coil3.Image image = this.image;
            java.util.Map<java.lang.String, java.lang.Object> map = this.extras;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(image=");
            sb.append(image);
            sb.append(", extras=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Value(coil3.Image image) {
            this(image, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0006\u0010\tJ#\u0010\u000f\u001a\u00020\u00002\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lcoil3/memory/MemoryCache$Builder;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "maxSizeBytes", "(J)Lcoil3/memory/MemoryCache$Builder;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcoil3/memory/MemoryCache$Builder;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "", "percent", "maxSizePercent", "(Landroid/content/Context;D)Lcoil3/memory/MemoryCache$Builder;", "", "enable", "strongReferencesEnabled", "(Z)Lcoil3/memory/MemoryCache$Builder;", "weakReferencesEnabled", "Lcoil3/memory/MemoryCache;", "build", "()Lcoil3/memory/MemoryCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function0<java.lang.Long> getHighSpeedVideoSizes;
        private boolean Camera2StreamConfigurationMap = true;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor = true;

        /* renamed from: $r8$lambda$-norV6OGUuUHP0TMHGXQkgg28nc, reason: not valid java name */
        public static /* synthetic */ long m9774$r8$lambda$norV6OGUuUHP0TMHGXQkgg28nc(long j) {
            return j;
        }

        public final coil3.memory.MemoryCache.Builder maxSizeBytes(final long size) {
            this.getHighSpeedVideoSizes = new kotlin.jvm.functions.Function0() { // from class: coil3.memory.MemoryCache$Builder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Long.valueOf(coil3.memory.MemoryCache.Builder.m9774$r8$lambda$norV6OGUuUHP0TMHGXQkgg28nc(size));
                }
            };
            return this;
        }

        public final coil3.memory.MemoryCache.Builder maxSizeBytes(kotlin.jvm.functions.Function0<java.lang.Long> size) {
            this.getHighSpeedVideoSizes = size;
            return this;
        }

        public static /* synthetic */ coil3.memory.MemoryCache.Builder maxSizePercent$default(coil3.memory.MemoryCache.Builder builder, android.content.Context context, double d, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                d = coil3.content.C0302ContextsKt.defaultMemoryCacheSizePercent(context);
            }
            return builder.maxSizePercent(context, d);
        }

        public final coil3.memory.MemoryCache.Builder maxSizePercent(final android.content.Context context, final double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new java.lang.IllegalArgumentException("percent must be in the range [0.0, 1.0].".toString());
            }
            this.getHighSpeedVideoSizes = new kotlin.jvm.functions.Function0() { // from class: coil3.memory.MemoryCache$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    long highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = coil3.memory.MemoryCache.Builder.getHighResolutionOutputSizeshNQ4ISI(percent, context);
                    return java.lang.Long.valueOf(highResolutionOutputSizeshNQ4ISI);
                }
            };
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long getHighResolutionOutputSizeshNQ4ISI(double d, android.content.Context context) {
            return (long) (d * coil3.content.C0302ContextsKt.totalAvailableMemoryBytes(context));
        }

        public final coil3.memory.MemoryCache.Builder strongReferencesEnabled(boolean enable) {
            this.Camera2StreamConfigurationMap = enable;
            return this;
        }

        public final coil3.memory.MemoryCache.Builder weakReferencesEnabled(boolean enable) {
            this.getHighSpeedVideoFpsRangesFor = enable;
            return this;
        }

        public final coil3.memory.MemoryCache build() {
            coil3.memory.EmptyWeakMemoryCache emptyWeakMemoryCache;
            coil3.memory.EmptyStrongMemoryCache emptyStrongMemoryCache;
            if (this.getHighSpeedVideoFpsRangesFor) {
                emptyWeakMemoryCache = new coil3.memory.RealWeakMemoryCache();
            } else {
                emptyWeakMemoryCache = new coil3.memory.EmptyWeakMemoryCache();
            }
            if (this.Camera2StreamConfigurationMap) {
                kotlin.jvm.functions.Function0<java.lang.Long> function0 = this.getHighSpeedVideoSizes;
                if (function0 == null) {
                    throw new java.lang.IllegalStateException("maxSizeBytesFactory == null".toString());
                }
                emptyStrongMemoryCache = new coil3.memory.RealStrongMemoryCache(function0.invoke().longValue(), emptyWeakMemoryCache);
            } else {
                emptyStrongMemoryCache = new coil3.memory.EmptyStrongMemoryCache(emptyWeakMemoryCache);
            }
            return new coil3.memory.RealMemoryCache(emptyStrongMemoryCache, emptyWeakMemoryCache);
        }
    }
}
