package kotlinx.serialization.internal;

/* compiled from: PluginHelperInterfaces.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0017\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004H&¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/GeneratedSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes6.dex */
public interface GeneratedSerializer<T> extends kotlinx.serialization.KSerializer<T> {
    kotlinx.serialization.KSerializer<?>[] childSerializers();

    kotlinx.serialization.KSerializer<?>[] typeParametersSerializers();

    /* compiled from: PluginHelperInterfaces.kt */
    /* renamed from: kotlinx.serialization.internal.GeneratedSerializer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static kotlinx.serialization.KSerializer[] $default$typeParametersSerializers(kotlinx.serialization.internal.GeneratedSerializer _this) {
            return kotlinx.serialization.internal.PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    /* compiled from: PluginHelperInterfaces.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> kotlinx.serialization.KSerializer<?>[] typeParametersSerializers(kotlinx.serialization.internal.GeneratedSerializer<T> generatedSerializer) {
            return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(generatedSerializer);
        }
    }
}
