package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H ¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058!X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Array", "", "<init>", "()V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "build$kotlinx_serialization_core", "()Ljava/lang/Object;", "getPosition$kotlinx_serialization_core", "()I", com.daon.sdk.face.license.License.FEATURE_POSITION}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PrimitiveArrayBuilder<Array> {
    public abstract Array build$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int requiredCapacity);

    public abstract int getPosition$kotlinx_serialization_core();

    public static /* synthetic */ void ensureCapacity$kotlinx_serialization_core$default(kotlinx.serialization.internal.PrimitiveArrayBuilder primitiveArrayBuilder, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = primitiveArrayBuilder.getPosition$kotlinx_serialization_core() + 1;
        }
        primitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core(i);
    }
}
