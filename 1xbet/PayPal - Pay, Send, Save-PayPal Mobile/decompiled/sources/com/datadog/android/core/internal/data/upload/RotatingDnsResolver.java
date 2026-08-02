package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver;", "Lokhttp3/Dns;", "delegate", "Lkotlin/time/Duration;", "ttl", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lokhttp3/Dns;JLcom/datadog/android/internal/time/TimeProvider;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Ljava/util/List;", "Lokhttp3/Dns;", "getHighResolutionOutputSizeshNQ4ISI", "", "Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/internal/time/TimeProvider;", "getHighSpeedVideoSizes", "J", "Companion", "ResolvedHost"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RotatingDnsResolver implements okhttp3.Dns {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.data.upload.RotatingDnsResolver.Companion INSTANCE = new com.datadog.android.core.internal.data.upload.RotatingDnsResolver.Companion(null);
    private static final long TTL_30_MIN;
    private final com.datadog.android.internal.time.TimeProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.Dns getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoSizes;

    private RotatingDnsResolver(okhttp3.Dns dns, long j, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dns;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = timeProvider;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    }

    public /* synthetic */ RotatingDnsResolver(okhttp3.Dns dns, long j, com.datadog.android.internal.time.TimeProvider timeProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.Dns.SYSTEM : dns, (i & 2) != 0 ? TTL_30_MIN : j, timeProvider, null);
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u0014\u0010'\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "", "", "hostname", "", "Ljava/net/InetAddress;", "addresses", "", "resolutionTimestamp", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;J)Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "other", "", "equals", "(Ljava/lang/Object;)Z", "currentTime", "Lkotlin/time/Duration;", "getAge-5sfh64U", "(J)J", "getAge", "", "hashCode", "()I", "", "rotate", "()V", "toString", "Ljava/util/List;", "getAddresses", "Ljava/lang/String;", "getHostname", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResolvedHost {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor;
        private final java.util.List<java.net.InetAddress> addresses;
        private final java.lang.String hostname;

        public ResolvedHost(java.lang.String str, java.util.List<java.net.InetAddress> list, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.hostname = str;
            this.addresses = list;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        public final java.lang.String getHostname() {
            return this.hostname;
        }

        public final java.util.List<java.net.InetAddress> getAddresses() {
            return this.addresses;
        }

        /* renamed from: getAge-5sfh64U, reason: not valid java name */
        public final long m10005getAge5sfh64U(long currentTime) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            return kotlin.time.DurationKt.toDuration(currentTime - this.getHighSpeedVideoFpsRangesFor, kotlin.time.DurationUnit.NANOSECONDS);
        }

        public final void rotate() {
            synchronized (this.addresses) {
                java.net.InetAddress inetAddress = (java.net.InetAddress) kotlin.collections.CollectionsKt.removeFirstOrNull(this.addresses);
                if (inetAddress != null) {
                    this.addresses.add(inetAddress);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.hostname;
            java.util.List<java.net.InetAddress> list = this.addresses;
            long j = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvedHost(hostname=");
            sb.append(str);
            sb.append(", addresses=");
            sb.append(list);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.hostname.hashCode() * 31) + this.addresses.hashCode()) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost)) {
                return false;
            }
            com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost resolvedHost = (com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.hostname, resolvedHost.hostname) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, resolvedHost.addresses) && this.getHighSpeedVideoFpsRangesFor == resolvedHost.getHighSpeedVideoFpsRangesFor;
        }

        public final com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost copy(java.lang.String hostname, java.util.List<java.net.InetAddress> addresses, long resolutionTimestamp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            return new com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost(hostname, addresses, resolutionTimestamp);
        }

        public final java.util.List<java.net.InetAddress> component2() {
            return this.addresses;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost copy$default(com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost resolvedHost, java.lang.String str, java.util.List list, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resolvedHost.hostname;
            }
            if ((i & 2) != 0) {
                list = resolvedHost.addresses;
            }
            if ((i & 4) != 0) {
                j = resolvedHost.getHighSpeedVideoFpsRangesFor;
            }
            return resolvedHost.copy(str, list, j);
        }
    }

    @Override // okhttp3.Dns
    public final java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost resolvedHost = this.getHighSpeedVideoFpsRangesFor.get(hostname);
        if (resolvedHost != null && kotlin.time.Duration.m23941compareToLRDsOJo(resolvedHost.m10005getAge5sfh64U(this.Camera2StreamConfigurationMap.getDeviceElapsedTimeNanos()), this.getHighSpeedVideoSizes) < 0 && !resolvedHost.getAddresses().isEmpty()) {
            resolvedHost.rotate();
            return getHighSpeedVideoFpsRangesFor(resolvedHost.getAddresses());
        }
        java.util.List<java.net.InetAddress> lookup = this.getHighResolutionOutputSizeshNQ4ISI.lookup(hostname);
        this.getHighSpeedVideoFpsRangesFor.put(hostname, new com.datadog.android.core.internal.data.upload.RotatingDnsResolver.ResolvedHost(hostname, kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) lookup), this.Camera2StreamConfigurationMap.getDeviceElapsedTimeNanos()));
        return getHighSpeedVideoFpsRangesFor(lookup);
    }

    private static java.util.List<java.net.InetAddress> getHighSpeedVideoFpsRangesFor(java.util.List<? extends java.net.InetAddress> p0) {
        java.util.List<java.net.InetAddress> list;
        synchronized (p0) {
            list = kotlin.collections.CollectionsKt.toList(p0);
        }
        return list;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$Companion;", "", "<init>", "()V", "Lkotlin/time/Duration;", "TTL_30_MIN", "J", "getTTL_30_MIN-UwyO8pc", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getTTL_30_MIN-UwyO8pc, reason: not valid java name */
        public final long m10004getTTL_30_MINUwyO8pc() {
            return com.datadog.android.core.internal.data.upload.RotatingDnsResolver.TTL_30_MIN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        TTL_30_MIN = kotlin.time.DurationKt.toDuration(30, kotlin.time.DurationUnit.MINUTES);
    }

    public /* synthetic */ RotatingDnsResolver(okhttp3.Dns dns, long j, com.datadog.android.internal.time.TimeProvider timeProvider, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dns, j, timeProvider);
    }
}
