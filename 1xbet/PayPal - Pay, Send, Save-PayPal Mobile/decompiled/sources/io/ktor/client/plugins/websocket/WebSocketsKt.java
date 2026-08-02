package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "Lio/ktor/websocket/WebSocketExtension;", "getHighSpeedVideoSizes", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRanges", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketsKt {
    private static final org.slf4j.Logger LOGGER;
    private static final io.ktor.util.AttributeKey<java.util.List<io.ktor.websocket.WebSocketExtension<?>>> getHighSpeedVideoSizes;

    public static final org.slf4j.Logger getLOGGER() {
        return LOGGER;
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.websocket.WebSocketExtension.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR())));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        getHighSpeedVideoSizes = new io.ktor.util.AttributeKey<>("Websocket extensions", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.websocket.WebSockets");
    }
}
