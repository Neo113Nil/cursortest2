package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class ConstUtil {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil();

    private ConstUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canBeUsedForConstVal(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.ConstUtilKt.canBeUsedForConstVal(kotlinType);
    }
}
