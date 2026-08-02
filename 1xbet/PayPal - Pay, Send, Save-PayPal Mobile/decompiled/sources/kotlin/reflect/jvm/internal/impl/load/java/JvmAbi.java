package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JvmAbi {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JvmAbi INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.JvmAbi();
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId JVM_FIELD_ANNOTATION_CLASS_ID;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JVM_FIELD_ANNOTATION_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoSizes;

    private JvmAbi() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        JVM_FIELD_ANNOTATION_CLASS_ID = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName);
        getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return getHighSpeedVideoFpsRanges;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isGetterName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.startsWith$default(str, "get", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "is", false, 2, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isSetterName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.startsWith$default(str, "set", false, 2, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getterName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (startsWithIsPrefix(str)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("get");
        sb.append(kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return sb.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String setterName(java.lang.String str) {
        java.lang.String capitalizeAsciiOnly;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("set");
        if (startsWithIsPrefix(str)) {
            capitalizeAsciiOnly = str.substring(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(capitalizeAsciiOnly, "");
        } else {
            capitalizeAsciiOnly = kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
        }
        sb.append(capitalizeAsciiOnly);
        return sb.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean startsWithIsPrefix(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!kotlin.text.StringsKt.startsWith$default(str, "is", false, 2, (java.lang.Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return kotlin.jvm.internal.Intrinsics.compare(97, (int) charAt) > 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) > 0;
    }
}
