package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "p1", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SerializerAlreadyRegisteredException extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SerializerAlreadyRegisteredException(kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2) {
        this(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Serializer for ");
        sb.append(kClass2);
        sb.append(" already registered in the scope of ");
        sb.append(kClass);
    }
}
