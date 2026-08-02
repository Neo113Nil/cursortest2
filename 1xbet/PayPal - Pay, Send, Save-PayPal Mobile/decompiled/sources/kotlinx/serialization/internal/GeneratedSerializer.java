package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/GeneratedSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes3.dex */
public interface GeneratedSerializer<T> extends kotlinx.serialization.KSerializer<T> {
    kotlinx.serialization.KSerializer<?>[] childSerializers();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> kotlinx.serialization.KSerializer<?>[] typeParametersSerializers(kotlinx.serialization.internal.GeneratedSerializer<T> generatedSerializer) {
            return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
        }
    }

    default kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
