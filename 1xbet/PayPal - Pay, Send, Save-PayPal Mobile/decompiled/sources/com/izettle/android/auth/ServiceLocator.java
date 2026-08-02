package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001c\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0007\u0010\u000bJ.\u0010\u000f\u001a\u00020\u0004\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/izettle/android/auth/ServiceLocator;", "", "<init>", "()V", "", "clear", "T", "locate", "()Ljava/lang/Object;", "Ljava/lang/Class;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "service", "", "priority", "registerService", "(Ljava/lang/Object;I)V", "unregisterService", "(Ljava/lang/Object;)V", "", "Lcom/izettle/android/auth/ServiceInfo;", "unregisterServiceOfType", "()Ljava/util/List;", "", com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Services, "Ljava/util/Map;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServiceLocator {
    public static final com.izettle.android.auth.ServiceLocator INSTANCE = new com.izettle.android.auth.ServiceLocator();
    private static final java.util.Map<java.lang.Class<?>, java.util.List<com.izettle.android.auth.ServiceInfo>> services = new java.util.LinkedHashMap();

    private ServiceLocator() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void unregisterService(java.lang.Object service) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        java.util.Iterator<T> it = services.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.Iterator it2 = ((java.lang.Iterable) ((java.util.Map.Entry) next).getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (((com.izettle.android.auth.ServiceInfo) next2).getService() == service) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry != null) {
            java.util.Map<java.lang.Class<?>, java.util.List<com.izettle.android.auth.ServiceInfo>> map = services;
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : iterable) {
                if (((com.izettle.android.auth.ServiceInfo) obj2).getService() != service) {
                    arrayList.add(obj2);
                }
            }
            map.put(key, kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList));
        }
    }

    public final void clear() {
        services.clear();
    }

    public final /* synthetic */ <T> java.util.List<com.izettle.android.auth.ServiceInfo> unregisterServiceOfType() {
        java.util.Map map = services;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (java.util.List) map.remove(java.lang.Object.class);
    }

    public static /* synthetic */ void registerService$default(com.izettle.android.auth.ServiceLocator serviceLocator, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        com.izettle.android.auth.ServiceInfo serviceInfo = new com.izettle.android.auth.ServiceInfo(i, obj);
        java.util.Map map = services;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        if (!map.containsKey(java.lang.Object.class)) {
            java.util.Map map2 = services;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            map2.put(java.lang.Object.class, new java.util.ArrayList());
        }
        java.util.Map map3 = services;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.List list = (java.util.List) map3.get(java.lang.Object.class);
        if (list != null) {
            list.add(serviceInfo);
        }
    }

    public final /* synthetic */ <T> void registerService(T service, int priority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        com.izettle.android.auth.ServiceInfo serviceInfo = new com.izettle.android.auth.ServiceInfo(priority, service);
        java.util.Map map = services;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        if (!map.containsKey(java.lang.Object.class)) {
            java.util.Map map2 = services;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            map2.put(java.lang.Object.class, new java.util.ArrayList());
        }
        java.util.Map map3 = services;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.List list = (java.util.List) map3.get(java.lang.Object.class);
        if (list != null) {
            list.add(serviceInfo);
        }
    }

    public final <T> T locate(java.lang.Class<T> type) {
        T next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        java.util.List<com.izettle.android.auth.ServiceInfo> list = services.get(type);
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int priority = ((com.izettle.android.auth.ServiceInfo) next).getPriority();
                    do {
                        T next2 = it.next();
                        int priority2 = ((com.izettle.android.auth.ServiceInfo) next2).getPriority();
                        if (priority < priority2) {
                            next = next2;
                            priority = priority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = (T) null;
            }
            com.izettle.android.auth.ServiceInfo serviceInfo = next;
            if (serviceInfo != null) {
                obj = serviceInfo.getService();
            }
        }
        T cast = type.cast(obj);
        if (cast != null) {
            return cast;
        }
        throw new java.lang.IllegalArgumentException("No service found for type ".concat(java.lang.String.valueOf(type)));
    }

    public final /* synthetic */ <T> T locate() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) locate(java.lang.Object.class);
    }
}
