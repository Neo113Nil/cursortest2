package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\r0\f*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r0\f*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u000f\u001a%\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u0013*\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"T", "Landroidx/camera/camera2/pipe/Request;", "Landroidx/camera/camera2/pipe/Metadata$Key;", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroidx/camera/camera2/pipe/Request;Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/hardware/camera2/CaptureRequest$Key;", "(Landroidx/camera/camera2/pipe/Request;Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "formatForLogs", "(Landroidx/camera/camera2/pipe/Request;)Ljava/lang/String;", "", "", "filterToCaptureRequestParameters", "(Ljava/util/Map;)Ljava/util/Map;", "filterToMetadataParameters", "Landroid/hardware/camera2/CaptureRequest$Builder;", "parameters", "", "writeParameters", "(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "writeParameter", "(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/lang/Object;Ljava/lang/Object;)V", "", "metadata", "putAllMetadata", "(Ljava/util/Map;Ljava/util/Map;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestsKt {
    public static final <T> T getOrDefault(androidx.camera.camera2.pipe.Request request, androidx.camera.camera2.pipe.Metadata.Key<T> key, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t2 = (T) request.get(key);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrDefault(androidx.camera.camera2.pipe.Request request, android.hardware.camera2.CaptureRequest.Key<T> key, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t2 = (T) request.get(key);
        return t2 == null ? t : t2;
    }

    public static final java.lang.String formatForLogs(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(");
        sb.append(request.getStreams());
        sb.append(")@");
        sb.append(java.lang.Integer.toHexString(request.hashCode()));
        return sb.toString();
    }

    public static final void writeParameters(android.hardware.camera2.CaptureRequest.Builder builder, java.util.Map<?, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        for (java.util.Map.Entry<?, ? extends java.lang.Object> entry : map.entrySet()) {
            writeParameter(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final void writeParameter(android.hardware.camera2.CaptureRequest.Builder builder, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        if (obj == null || !(obj instanceof android.hardware.camera2.CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((android.hardware.camera2.CaptureRequest.Key) obj, obj2);
        } catch (java.lang.IllegalArgumentException e) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                ((android.hardware.camera2.CaptureRequest.Key) obj).getName();
                java.util.Objects.toString(obj2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void putAllMetadata(java.util.Map<java.lang.Object, java.lang.Object> map, java.util.Map<?, ? extends java.lang.Object> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        map.putAll(map2);
    }

    public static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> filterToCaptureRequestParameters(java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.Object, ? extends java.lang.Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof android.hardware.camera2.CaptureRequest.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
            linkedHashMap3.put((android.hardware.camera2.CaptureRequest.Key) key, entry2.getValue());
        }
        return linkedHashMap3;
    }

    public static final java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, java.lang.Object> filterToMetadataParameters(java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.Object, ? extends java.lang.Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof androidx.camera.camera2.pipe.Metadata.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
            linkedHashMap3.put((androidx.camera.camera2.pipe.Metadata.Key) key, entry2.getValue());
        }
        return linkedHashMap3;
    }
}
