package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class CharValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Character> {
    public CharValue(char c) {
        super(java.lang.Character.valueOf(c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charType, "");
        return charType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.String str;
        char charValue = getValue().charValue();
        char charValue2 = getValue().charValue();
        switch (charValue2) {
            case '\b':
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) java.lang.Character.getType(charValue2);
                if (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) {
                    str = com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
                    break;
                } else {
                    str = java.lang.String.valueOf(charValue2);
                    break;
                }
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        java.lang.String format = java.lang.String.format("\\u%04X ('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(charValue), str}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
