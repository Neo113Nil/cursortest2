package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB[\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ(\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJj\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\fR2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "gates", "", "configs", "layers", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)V", "component1", "()Ljava/util/concurrent/ConcurrentHashMap;", "component2", "component3", "copy", "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)Lcom/statsig/androidsdk/StatsigOverrides;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "getConfigs", "getGates", "getLayers", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatsigOverrides {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.StatsigOverrides.Companion INSTANCE = new com.statsig.androidsdk.StatsigOverrides.Companion(null);

    @com.google.gson.annotations.SerializedName("configs")
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> configs;

    @com.google.gson.annotations.SerializedName("gates")
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> gates;

    @com.google.gson.annotations.SerializedName("layers")
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> layers;

    public StatsigOverrides(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap2, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap3, "");
        this.gates = concurrentHashMap;
        this.configs = concurrentHashMap2;
        this.layers = concurrentHashMap3;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> getGates() {
        return this.gates;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getConfigs() {
        return this.configs;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getLayers() {
        return this.layers;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides$Companion;", "", "<init>", "()V", "Lcom/statsig/androidsdk/StatsigOverrides;", "empty", "()Lcom/statsig/androidsdk/StatsigOverrides;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final com.statsig.androidsdk.StatsigOverrides empty() {
            return new com.statsig.androidsdk.StatsigOverrides(new java.util.concurrent.ConcurrentHashMap(), new java.util.concurrent.ConcurrentHashMap(), new java.util.concurrent.ConcurrentHashMap());
        }

        public static /* synthetic */ void Camera2StreamConfigurationMap(com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StatsigOverrides() {
    }

    public final java.lang.String toString() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap = this.gates;
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap2 = this.configs;
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap3 = this.layers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsigOverrides(gates=");
        sb.append(concurrentHashMap);
        sb.append(", configs=");
        sb.append(concurrentHashMap2);
        sb.append(", layers=");
        sb.append(concurrentHashMap3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.gates.hashCode() * 31) + this.configs.hashCode()) * 31) + this.layers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.StatsigOverrides)) {
            return false;
        }
        com.statsig.androidsdk.StatsigOverrides statsigOverrides = (com.statsig.androidsdk.StatsigOverrides) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.gates, statsigOverrides.gates) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, statsigOverrides.configs) && kotlin.jvm.internal.Intrinsics.areEqual(this.layers, statsigOverrides.layers);
    }

    public final com.statsig.androidsdk.StatsigOverrides copy(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> gates, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> configs, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> layers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layers, "");
        return new com.statsig.androidsdk.StatsigOverrides(gates, configs, layers);
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> component3() {
        return this.layers;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> component2() {
        return this.configs;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> component1() {
        return this.gates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.StatsigOverrides copy$default(com.statsig.androidsdk.StatsigOverrides statsigOverrides, java.util.concurrent.ConcurrentHashMap concurrentHashMap, java.util.concurrent.ConcurrentHashMap concurrentHashMap2, java.util.concurrent.ConcurrentHashMap concurrentHashMap3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = statsigOverrides.gates;
        }
        if ((i & 2) != 0) {
            concurrentHashMap2 = statsigOverrides.configs;
        }
        if ((i & 4) != 0) {
            concurrentHashMap3 = statsigOverrides.layers;
        }
        return statsigOverrides.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }
}
