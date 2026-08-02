package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface EnumEntriesDeserializationSupport {
    java.lang.Boolean canSynthesizeEnumEntries();

    public static final class Default implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport.Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
        public final java.lang.Boolean canSynthesizeEnumEntries() {
            return null;
        }

        private Default() {
        }
    }
}
