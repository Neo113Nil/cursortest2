package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class PropertiesConventionUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.name.Name propertyNameBySetMethodName(kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return getHighSpeedVideoFpsRanges(name2, "set", true, z ? "is" : null);
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> propertyNamesBySetMethodName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{propertyNameBySetMethodName(name2, false), propertyNameBySetMethodName(name2, true)});
    }

    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str, boolean z, java.lang.String str2) {
        if (name2.isSpecial()) {
            return null;
        }
        java.lang.String identifier = name2.getIdentifier();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        if (!kotlin.text.StringsKt.startsWith$default(identifier, str, false, 2, (java.lang.Object) null) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(kotlin.text.StringsKt.removePrefix(identifier, (java.lang.CharSequence) str));
            return kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        }
        if (!z) {
            return name2;
        }
        java.lang.String decapitalizeSmartForCompiler = kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(kotlin.text.StringsKt.removePrefix(identifier, (java.lang.CharSequence) str), true);
        if (kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
            return kotlin.reflect.jvm.internal.impl.name.Name.identifier(decapitalizeSmartForCompiler);
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getPropertyNamesCandidatesByAccessorName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String asString = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isGetterName(asString)) {
            return kotlin.collections.CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name2));
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(asString)) {
            return propertyNamesBySetMethodName(name2);
        }
        return kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name2);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name propertyNameByGetMethodName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.name.Name highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(name2, "get", true, null);
        return highSpeedVideoFpsRanges == null ? getHighSpeedVideoFpsRanges(name2, "is", false, null) : highSpeedVideoFpsRanges;
    }
}
