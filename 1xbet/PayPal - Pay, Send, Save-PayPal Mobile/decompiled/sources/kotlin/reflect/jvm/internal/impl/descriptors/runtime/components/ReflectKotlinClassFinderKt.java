package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectKotlinClassFinderKt {
    public static final /* synthetic */ java.lang.String access$toRuntimeFqName(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(classId.getRelativeClassName().asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null);
        if (classId.getPackageFqName().isRoot()) {
            return replace$default;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(classId.getPackageFqName());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(replace$default);
        return sb.toString();
    }
}
