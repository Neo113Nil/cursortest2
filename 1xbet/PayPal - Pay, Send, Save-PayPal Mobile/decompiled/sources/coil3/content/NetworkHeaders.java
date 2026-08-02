package coil3.content;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB#\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcoil3/network/NetworkHeaders;", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "key", "get", "(Ljava/lang/String;)Ljava/lang/String;", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "asMap", "()Ljava/util/Map;", "Lcoil3/network/NetworkHeaders$Builder;", "newBuilder", "()Lcoil3/network/NetworkHeaders$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkHeaders {
    public static final coil3.content.NetworkHeaders EMPTY = new coil3.network.NetworkHeaders.Builder().build();
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    private NetworkHeaders(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public final java.lang.String get(java.lang.String key) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String lowerCase = key.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.List<java.lang.String> list = map.get(lowerCase);
        if (list != null) {
            return (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
        }
        return null;
    }

    public final java.util.List<java.lang.String> getAll(java.lang.String key) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String lowerCase = key.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.List<java.lang.String> list = map.get(lowerCase);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> asMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final coil3.network.NetworkHeaders.Builder newBuilder() {
        return new coil3.network.NetworkHeaders.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J \u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcoil3/network/NetworkHeaders$Builder;", "", "<init>", "()V", "Lcoil3/network/NetworkHeaders;", "headers", "(Lcoil3/network/NetworkHeaders;)V", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set", "(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/NetworkHeaders$Builder;", "", "values", "(Ljava/lang/String;Ljava/util/List;)Lcoil3/network/NetworkHeaders$Builder;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "build", "()Lcoil3/network/NetworkHeaders;", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHighSpeedVideoFpsRangesFor;

        public Builder() {
            this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        }

        public Builder(coil3.content.NetworkHeaders networkHeaders) {
            java.util.Map map = networkHeaders.getHighSpeedVideoFpsRangesFor;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) entry.getValue()));
            }
            this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
        }

        public final coil3.network.NetworkHeaders.Builder set(java.lang.String key, java.lang.String value) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String lowerCase = key.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put(lowerCase, kotlin.collections.CollectionsKt.mutableListOf(value));
            return this;
        }

        public final coil3.network.NetworkHeaders.Builder set(java.lang.String key, java.util.List<java.lang.String> values) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String lowerCase = key.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put(lowerCase, kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) values));
            return this;
        }

        public final coil3.network.NetworkHeaders.Builder add(java.lang.String key, java.lang.String value) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String lowerCase = key.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.util.ArrayList arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map.put(lowerCase, arrayList);
            }
            arrayList.add(value);
            return this;
        }

        public final coil3.content.NetworkHeaders build() {
            return new coil3.content.NetworkHeaders(kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRangesFor), null);
        }
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkHeaders(data=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.content.NetworkHeaders) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((coil3.content.NetworkHeaders) other).getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ NetworkHeaders(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
