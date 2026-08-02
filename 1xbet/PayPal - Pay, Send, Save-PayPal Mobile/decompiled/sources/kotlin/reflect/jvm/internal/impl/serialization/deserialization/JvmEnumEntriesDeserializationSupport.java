package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class JvmEnumEntriesDeserializationSupport implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport();

    private JvmEnumEntriesDeserializationSupport() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
    public final java.lang.Boolean canSynthesizeEnumEntries() {
        return java.lang.Boolean.TRUE;
    }
}
