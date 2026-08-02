package kotlinx.serialization.internal;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Inserted into generated code and should not be used directly")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/SerializerFactory;", "", "", "Lkotlinx/serialization/KSerializer;", "typeParamsSerializers", "serializer", "([Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SerializerFactory {
    kotlinx.serialization.KSerializer<?> serializer(kotlinx.serialization.KSerializer<?>... typeParamsSerializers);
}
