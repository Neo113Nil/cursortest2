package com.izettle.android.net;

@com.izettle.android.net.RequestDsl
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0012\u001a\u00020\u000f2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u000f2\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u0016"}, d2 = {"Lcom/izettle/android/net/Headers;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "<init>", "()V", "key", "", "containsKey", "(Ljava/lang/String;)Z", "get", "(Ljava/lang/String;)Ljava/util/List;", "Lkotlin/Function1;", "Lcom/izettle/android/net/Header$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "from", "putAll", "(Ljava/util/Map;)V", "putIfAbsent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Headers extends java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (kotlin.jvm.internal.TypeIntrinsics.isMutableList(obj)) {
            return containsValue((java.util.List<java.lang.String>) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(java.util.List<java.lang.String> list) {
        return super.containsValue((java.lang.Object) list);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.List<java.lang.String> get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> getEntries() {
        return super.entrySet();
    }

    public final java.util.Set<java.lang.String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : getOrDefault((java.lang.String) obj, (java.util.List<java.lang.String>) obj2);
    }

    public final /* bridge */ java.util.List getOrDefault(java.lang.Object obj, java.util.List list) {
        return !(obj instanceof java.lang.String) ? list : getOrDefault((java.lang.String) obj, (java.util.List<java.lang.String>) list);
    }

    public final /* bridge */ java.util.List<java.lang.String> getOrDefault(java.lang.String str, java.util.List<java.lang.String> list) {
        return (java.util.List) super.getOrDefault((java.lang.Object) str, (java.lang.String) list);
    }

    public final int getSize() {
        return super.size();
    }

    public final java.util.Collection<java.util.List<java.lang.String>> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.List<java.lang.String> remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    public final /* bridge */ java.util.List<java.lang.String> remove(java.lang.String str) {
        return (java.util.List) super.remove((java.lang.Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && kotlin.jvm.internal.TypeIntrinsics.isMutableList(obj2)) {
            return remove((java.lang.String) obj, (java.util.List<java.lang.String>) obj2);
        }
        return false;
    }

    public final /* bridge */ boolean remove(java.lang.String str, java.util.List<java.lang.String> list) {
        return super.remove((java.lang.Object) str, (java.lang.Object) list);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Collection<java.util.List<java.lang.String>> values() {
        return getValues();
    }

    public final java.util.List<java.lang.String> get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.izettle.android.net.Headers headers = this;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headers.size()));
        java.util.Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = key.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return (java.util.List) linkedHashMap.get(lowerCase2);
    }

    public final boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.izettle.android.net.Headers headers = this;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headers.size()));
        java.util.Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = key.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return linkedHashMap.containsKey(lowerCase2);
    }

    public final void header(kotlin.jvm.functions.Function1<? super com.izettle.android.net.Header.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.izettle.android.net.Header.Builder builder = new com.izettle.android.net.Header.Builder();
        block.invoke(builder);
        com.izettle.android.net.Header build = builder.build();
        if (containsKey((java.lang.Object) build.getName())) {
            java.util.List<java.lang.String> list = get((java.lang.Object) build.getName());
            if (list != null) {
                list.add(build.getValue());
                return;
            }
            return;
        }
        put(build.getName(), kotlin.collections.CollectionsKt.mutableListOf(build.getValue()));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.List<java.lang.String> put(java.lang.String key, java.util.List<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (java.util.List) super.put((com.izettle.android.net.Headers) key, (java.lang.String) value);
    }

    @Override // java.util.HashMap, java.util.Map
    public final java.util.List<java.lang.String> putIfAbsent(java.lang.String key, java.util.List<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (java.util.List) super.putIfAbsent((com.izettle.android.net.Headers) key, (java.lang.String) value);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends java.util.List<java.lang.String>> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<? extends java.lang.String, ? extends java.util.List<java.lang.String>> entry : from.entrySet()) {
            if (entry.getKey() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        super.putAll(linkedHashMap);
    }
}
