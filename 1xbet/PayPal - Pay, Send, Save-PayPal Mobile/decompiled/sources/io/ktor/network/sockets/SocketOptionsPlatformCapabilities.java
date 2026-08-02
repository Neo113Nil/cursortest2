package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "<init>", "()V", "Ljava/nio/channels/SocketChannel;", "channel", "", "setReusePort", "(Ljava/nio/channels/SocketChannel;)V", "Ljava/nio/channels/ServerSocketChannel;", "(Ljava/nio/channels/ServerSocketChannel;)V", "Ljava/nio/channels/DatagramChannel;", "(Ljava/nio/channels/DatagramChannel;)V", "", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Field;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SocketOptionsPlatformCapabilities {
    private static final java.lang.reflect.Method Camera2StreamConfigurationMap;
    public static final io.ktor.network.sockets.SocketOptionsPlatformCapabilities INSTANCE = new io.ktor.network.sockets.SocketOptionsPlatformCapabilities();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.lang.reflect.Method getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, java.lang.reflect.Field> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;

    private SocketOptionsPlatformCapabilities() {
    }

    static {
        java.util.Map emptyMap;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.reflect.Field[] fields;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("java.net.StandardSocketOptions");
            if (cls == null || (fields = cls.getFields()) == null) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.reflect.Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers) && java.lang.reflect.Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                emptyMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (java.lang.Object obj : arrayList2) {
                    java.lang.String name2 = ((java.lang.reflect.Field) obj).getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    emptyMap.put(name2, obj);
                }
            }
        } catch (java.lang.Throwable unused) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        getHighSpeedVideoFpsRangesFor = emptyMap;
        java.lang.reflect.Method method6 = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("java.net.SocketOption");
            java.lang.Class<?> cls3 = java.lang.Class.forName("java.nio.channels.SocketChannel");
            java.lang.reflect.Method[] methods = cls3.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods, "");
            java.lang.reflect.Method[] methodArr = methods;
            int length = methodArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method5 = null;
                    break;
                }
                method5 = methodArr[i];
                java.lang.reflect.Method method7 = method5;
                int modifiers2 = method7.getModifiers();
                if (java.lang.reflect.Modifier.isPublic(modifiers2) && !java.lang.reflect.Modifier.isStatic(modifiers2) && kotlin.jvm.internal.Intrinsics.areEqual(method7.getName(), "setOption") && method7.getParameterTypes().length == 2 && kotlin.jvm.internal.Intrinsics.areEqual(method7.getReturnType(), cls3) && kotlin.jvm.internal.Intrinsics.areEqual(method7.getParameterTypes()[0], cls2) && kotlin.jvm.internal.Intrinsics.areEqual(method7.getParameterTypes()[1], java.lang.Object.class)) {
                    break;
                } else {
                    i++;
                }
            }
            method = method5;
        } catch (java.lang.Throwable unused2) {
            method = null;
        }
        Camera2StreamConfigurationMap = method;
        try {
            java.lang.Class<?> cls4 = java.lang.Class.forName("java.net.SocketOption");
            java.lang.Class<?> cls5 = java.lang.Class.forName("java.nio.channels.ServerSocketChannel");
            java.lang.reflect.Method[] methods2 = cls5.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods2, "");
            java.lang.reflect.Method[] methodArr2 = methods2;
            int length2 = methodArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method4 = null;
                    break;
                }
                method4 = methodArr2[i2];
                java.lang.reflect.Method method8 = method4;
                int modifiers3 = method8.getModifiers();
                if (java.lang.reflect.Modifier.isPublic(modifiers3) && !java.lang.reflect.Modifier.isStatic(modifiers3) && kotlin.jvm.internal.Intrinsics.areEqual(method8.getName(), "setOption") && method8.getParameterTypes().length == 2 && kotlin.jvm.internal.Intrinsics.areEqual(method8.getReturnType(), cls5) && kotlin.jvm.internal.Intrinsics.areEqual(method8.getParameterTypes()[0], cls4) && kotlin.jvm.internal.Intrinsics.areEqual(method8.getParameterTypes()[1], java.lang.Object.class)) {
                    break;
                } else {
                    i2++;
                }
            }
            method2 = method4;
        } catch (java.lang.Throwable unused3) {
            method2 = null;
        }
        getHighSpeedVideoFpsRanges = method2;
        try {
            java.lang.Class<?> cls6 = java.lang.Class.forName("java.net.SocketOption");
            java.lang.Class<?> cls7 = java.lang.Class.forName("java.nio.channels.DatagramChannel");
            java.lang.reflect.Method[] methods3 = cls7.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods3, "");
            java.lang.reflect.Method[] methodArr3 = methods3;
            int length3 = methodArr3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    method3 = null;
                    break;
                }
                method3 = methodArr3[i3];
                java.lang.reflect.Method method9 = method3;
                int modifiers4 = method9.getModifiers();
                if (java.lang.reflect.Modifier.isPublic(modifiers4) && !java.lang.reflect.Modifier.isStatic(modifiers4) && kotlin.jvm.internal.Intrinsics.areEqual(method9.getName(), "setOption") && method9.getParameterTypes().length == 2 && kotlin.jvm.internal.Intrinsics.areEqual(method9.getReturnType(), cls7) && kotlin.jvm.internal.Intrinsics.areEqual(method9.getParameterTypes()[0], cls6) && kotlin.jvm.internal.Intrinsics.areEqual(method9.getParameterTypes()[1], java.lang.Object.class)) {
                    break;
                } else {
                    i3++;
                }
            }
            method6 = method3;
        } catch (java.lang.Throwable unused4) {
        }
        getHighSpeedVideoSizes = method6;
    }

    public final void setReusePort(java.nio.channels.SocketChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap("SO_REUSEPORT");
        java.lang.reflect.Method method = Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        method.invoke(channel, Camera2StreamConfigurationMap2, java.lang.Boolean.TRUE);
    }

    public final void setReusePort(java.nio.channels.ServerSocketChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap("SO_REUSEPORT");
        java.lang.reflect.Method method = getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        method.invoke(channel, Camera2StreamConfigurationMap2, java.lang.Boolean.TRUE);
    }

    public final void setReusePort(java.nio.channels.DatagramChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap("SO_REUSEPORT");
        java.lang.reflect.Method method = getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        method.invoke(channel, Camera2StreamConfigurationMap2, java.lang.Boolean.TRUE);
    }

    private static java.lang.Object Camera2StreamConfigurationMap(java.lang.String p0) {
        java.lang.Object obj;
        java.lang.reflect.Field field = getHighSpeedVideoFpsRangesFor.get(p0);
        if (field != null && (obj = field.get(null)) != null) {
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Socket option ");
        sb.append(p0);
        sb.append(" is not supported");
        throw new java.io.IOException(sb.toString());
    }
}
