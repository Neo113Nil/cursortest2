package com.datadog.android.core.internal.net;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001bRH\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "hosts", "<init>", "(Ljava/util/Map;)V", "", "", "addKnownHosts$dd_sdk_android_core_release", "(Ljava/util/List;)V", "hostsWithHeaderTypes", "addKnownHostsWithHeaderTypes$dd_sdk_android_core_release", "getAllHeaderTypes", "()Ljava/util/Set;", "url", "headerTypesForUrl", "(Ljava/lang/String;)Ljava/util/Set;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Ljava/util/Set;", "", "isEmpty", "()Z", "isFirstPartyUrl", "(Ljava/lang/String;)Z", "(Lokhttp3/HttpUrl;)Z", "p0", "knownHosts", "Ljava/util/Map;", "getKnownHosts$dd_sdk_android_core_release", "()Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultFirstPartyHostHeaderTypeResolver implements com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver {
    private java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> knownHosts;

    public DefaultFirstPartyHostHeaderTypeResolver(java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Set<java.util.Map.Entry<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>>> entrySet = map.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            kotlin.Pair pair = kotlin.TuplesKt.to(lowerCase, entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.knownHosts = linkedHashMap;
    }

    public final java.util.Map<java.lang.String, java.util.Set<com.datadog.android.trace.TracingHeaderType>> getKnownHosts$dd_sdk_android_core_release() {
        return this.knownHosts;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final boolean isFirstPartyUrl(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String host = url.host();
        java.util.Set<java.lang.String> keySet = this.knownHosts.keySet();
        if ((keySet instanceof java.util.Collection) && keySet.isEmpty()) {
            return false;
        }
        for (java.lang.String str : keySet) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "*") || kotlin.jvm.internal.Intrinsics.areEqual(host, str) || kotlin.text.StringsKt.endsWith$default(host, ".".concat(java.lang.String.valueOf(str)), false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final boolean isFirstPartyUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(url);
        if (parse == null) {
            return false;
        }
        return isFirstPartyUrl(parse);
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final java.util.Set<com.datadog.android.trace.TracingHeaderType> headerTypesForUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(url);
        return parse == null ? kotlin.collections.SetsKt.emptySet() : headerTypesForUrl(parse);
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final java.util.Set<com.datadog.android.trace.TracingHeaderType> headerTypesForUrl(okhttp3.HttpUrl url) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String host = url.host();
        java.util.Set<com.datadog.android.trace.TracingHeaderType> set = (java.util.Set) this.knownHosts.get(host);
        if (set != null) {
            return set;
        }
        java.util.Iterator<T> it = this.knownHosts.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.endsWith$default(host, ".".concat(java.lang.String.valueOf(((java.util.Map.Entry) obj).getKey())), false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Set<com.datadog.android.trace.TracingHeaderType> set2 = entry != null ? (java.util.Set) entry.getValue() : null;
        if (set2 != null) {
            return set2;
        }
        java.util.Set<com.datadog.android.trace.TracingHeaderType> set3 = (java.util.Set) this.knownHosts.get("*");
        return set3 == null ? kotlin.collections.SetsKt.emptySet() : set3;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final java.util.Set<com.datadog.android.trace.TracingHeaderType> getAllHeaderTypes() {
        return kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.flatten(this.knownHosts.values()));
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public final boolean isEmpty() {
        return this.knownHosts.isEmpty();
    }

    public final void addKnownHosts$dd_sdk_android_core_release(java.util.List<java.lang.String> hosts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hosts, "");
        java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> map = this.knownHosts;
        java.util.List<java.lang.String> list = hosts;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.String str : list) {
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            kotlin.Pair pair = kotlin.TuplesKt.to(lowerCase, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.trace.TracingHeaderType[]{com.datadog.android.trace.TracingHeaderType.DATADOG, com.datadog.android.trace.TracingHeaderType.TRACECONTEXT}));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.knownHosts = kotlin.collections.MapsKt.plus(map, linkedHashMap);
    }

    public final void addKnownHostsWithHeaderTypes$dd_sdk_android_core_release(java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> hostsWithHeaderTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostsWithHeaderTypes, "");
        java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> map = this.knownHosts;
        java.util.Set<java.util.Map.Entry<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>>> entrySet = hostsWithHeaderTypes.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            kotlin.Pair pair = kotlin.TuplesKt.to(lowerCase, entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.knownHosts = kotlin.collections.MapsKt.plus(map, linkedHashMap);
    }
}
