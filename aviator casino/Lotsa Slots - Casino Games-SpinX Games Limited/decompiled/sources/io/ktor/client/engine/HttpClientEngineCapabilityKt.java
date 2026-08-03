package io.ktor.client.engine;

/* compiled from: HttpClientEngineCapability.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\"0\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"!\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "", "ENGINE_CAPABILITIES_KEY", "Lio/ktor/util/AttributeKey;", "getENGINE_CAPABILITIES_KEY", "()Lio/ktor/util/AttributeKey;", "", "DEFAULT_CAPABILITIES", "Ljava/util/Set;", "getDEFAULT_CAPABILITIES", "()Ljava/util/Set;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientEngineCapabilityKt {
    private static final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> DEFAULT_CAPABILITIES;
    private static final io.ktor.util.AttributeKey<java.util.Map<io.ktor.client.engine.HttpClientEngineCapability<?>, java.lang.Object>> ENGINE_CAPABILITIES_KEY;

    public static final io.ktor.util.AttributeKey<java.util.Map<io.ktor.client.engine.HttpClientEngineCapability<?>, java.lang.Object>> getENGINE_CAPABILITIES_KEY() {
        return ENGINE_CAPABILITIES_KEY;
    }

    public static final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getDEFAULT_CAPABILITIES() {
        return DEFAULT_CAPABILITIES;
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.class);
        try {
            kType = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.engine.HttpClientEngineCapability.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR())), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class))));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        ENGINE_CAPABILITIES_KEY = new io.ktor.util.AttributeKey<>("EngineCapabilities", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        DEFAULT_CAPABILITIES = kotlin.collections.SetsKt.setOf(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
    }
}
