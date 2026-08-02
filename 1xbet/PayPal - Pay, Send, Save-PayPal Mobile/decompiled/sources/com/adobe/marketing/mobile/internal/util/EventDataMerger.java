package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/EventDataMerger;", "", "<init>", "()V", "", "", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", "overwrite", "merge", "(Ljava/util/Map;Ljava/util/Map;Z)Ljava/util/Map;", "p0", "p1", "p2", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EventDataMerger {
    public static final com.adobe.marketing.mobile.internal.util.EventDataMerger INSTANCE = new com.adobe.marketing.mobile.internal.util.EventDataMerger();

    private EventDataMerger() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.Object> merge(java.util.Map<java.lang.String, ? extends java.lang.Object> from, java.util.Map<java.lang.String, ? extends java.lang.Object> to, final boolean overwrite) {
        kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> function2 = new kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object>() { // from class: com.adobe.marketing.mobile.internal.util.EventDataMerger$merge$1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.util.Map highSpeedVideoSizes;
                if (!(obj instanceof java.util.Map) || !(obj2 instanceof java.util.Map)) {
                    return !overwrite ? obj2 : ((obj instanceof java.util.Collection) && (obj2 instanceof java.util.Collection)) ? com.adobe.marketing.mobile.internal.util.EventDataMerger.access$mergeCollection(com.adobe.marketing.mobile.internal.util.EventDataMerger.INSTANCE, (java.util.Collection) obj, (java.util.Collection) obj2) : obj;
                }
                com.adobe.marketing.mobile.internal.util.EventDataMerger eventDataMerger = com.adobe.marketing.mobile.internal.util.EventDataMerger.INSTANCE;
                highSpeedVideoSizes = com.adobe.marketing.mobile.internal.util.EventDataMerger.getHighSpeedVideoSizes((java.util.Map) obj, (java.util.Map) obj2, overwrite);
                return highSpeedVideoSizes;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        };
        java.util.HashMap hashMap = new java.util.HashMap();
        if (to != null) {
            hashMap.putAll(to);
        }
        if (from != null) {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : from.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (hashMap.containsKey(key)) {
                    java.lang.Object invoke = function2.invoke(value, hashMap.get(key));
                    if (invoke != null) {
                        hashMap.put(key, invoke);
                    } else {
                        hashMap.remove(key);
                    }
                } else if (kotlin.text.StringsKt.endsWith$default(key, "[*]", false, 2, (java.lang.Object) null)) {
                    if (value instanceof java.util.Map) {
                        java.util.Map map = (java.util.Map) value;
                        java.lang.String dropLast = kotlin.text.StringsKt.dropLast(key, 3);
                        java.lang.Object obj = hashMap.get(dropLast);
                        if (obj instanceof java.util.Collection) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                                java.util.Map map2 = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
                                if (map2 != null) {
                                    arrayList.add(getHighSpeedVideoSizes(map, map2, overwrite));
                                } else {
                                    arrayList.add(obj2);
                                }
                            }
                            hashMap.put(dropLast, arrayList);
                        }
                    }
                } else {
                    hashMap.put(key, value);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<?, ?> getHighSpeedVideoSizes(java.util.Map<?, ?> p0, java.util.Map<?, ?> p1, boolean p2) {
        if ((p0 != null && !com.adobe.marketing.mobile.internal.util.SetExtensionsKt.isAllString(p0.keySet())) || (p1 != null && !com.adobe.marketing.mobile.internal.util.SetExtensionsKt.isAllString(p1.keySet()))) {
            return p1;
        }
        if (p0 == null) {
            p0 = null;
        }
        try {
            return merge(p0, p1 != null ? p1 : null, p2);
        } catch (java.lang.Exception unused) {
            return p1;
        }
    }

    public static final /* synthetic */ java.util.Collection access$mergeCollection(com.adobe.marketing.mobile.internal.util.EventDataMerger eventDataMerger, final java.util.Collection collection, final java.util.Collection collection2) {
        return new java.util.ArrayList<java.lang.Object>(collection, collection2) { // from class: com.adobe.marketing.mobile.internal.util.EventDataMerger$mergeCollection$1
            {
                if (collection != null) {
                    addAll(collection);
                }
                if (collection2 != null) {
                    addAll(collection2);
                }
            }

            public final int getSize() {
                return super.size();
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final java.lang.Object remove(int i) {
                return removeAt(i);
            }

            public final java.lang.Object removeAt(int i) {
                return super.remove(i);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return getSize();
            }
        };
    }
}
