package coil3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001dB!\b\u0002\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/Extras;", "", "", "Lcoil3/Extras$Key;", "p0", "<init>", "(Ljava/util/Map;)V", "T", "key", "get", "(Lcoil3/Extras$Key;)Ljava/lang/Object;", "asMap", "()Ljava/util/Map;", "Lcoil3/Extras$Builder;", "newBuilder", "()Lcoil3/Extras$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "Key", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Extras {
    public static final coil3.Extras EMPTY = new coil3.Extras.Builder().build();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<coil3.Extras.Key<?>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    private Extras(java.util.Map<coil3.Extras.Key<?>, ? extends java.lang.Object> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public final <T> T get(coil3.Extras.Key<T> key) {
        return (T) this.getHighResolutionOutputSizeshNQ4ISI.get(key);
    }

    public final java.util.Map<coil3.Extras.Key<?>, java.lang.Object> asMap() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final coil3.Extras.Builder newBuilder() {
        return new coil3.Extras.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcoil3/Extras$Key;", "T", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getDefault", "()Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final coil3.Extras.Key.Companion INSTANCE = new coil3.Extras.Key.Companion(null);
        private final T default;

        public Key(T t) {
            this.default = t;
        }

        public final T getDefault() {
            return this.default;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/Extras$Key$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\nJ.\u0010\u000e\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcoil3/Extras$Builder;", "", "<init>", "()V", "", "Lcoil3/Extras$Key;", "map", "(Ljava/util/Map;)V", "Lcoil3/Extras;", "extras", "(Lcoil3/Extras;)V", "T", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set", "(Lcoil3/Extras$Key;Ljava/lang/Object;)Lcoil3/Extras$Builder;", "setAll", "(Lcoil3/Extras;)Lcoil3/Extras$Builder;", "build", "()Lcoil3/Extras;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.Map<coil3.Extras.Key<?>, java.lang.Object> getHighSpeedVideoSizes;

        public Builder() {
            this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
        }

        public Builder(java.util.Map<coil3.Extras.Key<?>, ? extends java.lang.Object> map) {
            this.getHighSpeedVideoSizes = kotlin.collections.MapsKt.toMutableMap(map);
        }

        public Builder(coil3.Extras extras) {
            this.getHighSpeedVideoSizes = kotlin.collections.MapsKt.toMutableMap(extras.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final <T> coil3.Extras.Builder set(coil3.Extras.Key<T> key, T value) {
            if (value != null) {
                this.getHighSpeedVideoSizes.put(key, value);
                return this;
            }
            this.getHighSpeedVideoSizes.remove(key);
            return this;
        }

        public final coil3.Extras.Builder setAll(coil3.Extras extras) {
            for (java.util.Map.Entry entry : extras.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
                coil3.Extras.Key key = (coil3.Extras.Key) entry.getKey();
                java.lang.Object value = entry.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
                set(key, value);
            }
            return this;
        }

        public final coil3.Extras build() {
            return new coil3.Extras(coil3.content.Collections_jvmCommonKt.toImmutableMap(this.getHighSpeedVideoSizes), null);
        }
    }

    public final java.lang.String toString() {
        java.util.Map<coil3.Extras.Key<?>, java.lang.Object> map = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Extras(data=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.Extras) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((coil3.Extras) other).getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ Extras(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
