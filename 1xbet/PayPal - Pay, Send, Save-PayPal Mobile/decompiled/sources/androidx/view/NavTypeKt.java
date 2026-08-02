package androidx.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u001f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "navTypeParseAndPut", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "type", "navTypeFromArgType", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "", "navTypeInferFromValue", "navTypeInferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavTypeKt {
    public static final <T> T navTypeParseAndPut(androidx.view.NavType<T> navType, android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        T parseValue = navType.parseValue(str2);
        navType.put(bundle, str, parseValue);
        return parseValue;
    }

    public static final androidx.view.NavType<?> navTypeFromArgType(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.IntType.getName(), str)) {
            return androidx.view.NavType.IntType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.IntArrayType.getName(), str)) {
            return androidx.view.NavType.IntArrayType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.IntListType.getName(), str)) {
            return androidx.view.NavType.IntListType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.LongType.getName(), str)) {
            return androidx.view.NavType.LongType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.LongArrayType.getName(), str)) {
            return androidx.view.NavType.LongArrayType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.LongListType.getName(), str)) {
            return androidx.view.NavType.LongListType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.BoolType.getName(), str)) {
            return androidx.view.NavType.BoolType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.BoolArrayType.getName(), str)) {
            return androidx.view.NavType.BoolArrayType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.BoolListType.getName(), str)) {
            return androidx.view.NavType.BoolListType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.StringType.getName(), str)) {
            return androidx.view.NavType.StringType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.StringArrayType.getName(), str)) {
            return androidx.view.NavType.StringArrayType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.StringListType.getName(), str)) {
            return androidx.view.NavType.StringListType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.FloatType.getName(), str)) {
            return androidx.view.NavType.FloatType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.FloatArrayType.getName(), str)) {
            return androidx.view.NavType.FloatArrayType;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.FloatListType.getName(), str)) {
            return androidx.view.NavType.FloatListType;
        }
        return null;
    }

    public static final androidx.view.NavType<java.lang.Object> navTypeInferFromValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                try {
                    try {
                        androidx.view.NavType.IntType.parseValue(str);
                        androidx.view.NavType<java.lang.Integer> navType = androidx.view.NavType.IntType;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(navType, "");
                        return navType;
                    } catch (java.lang.IllegalArgumentException unused) {
                        androidx.view.NavType.LongType.parseValue(str);
                        androidx.view.NavType<java.lang.Long> navType2 = androidx.view.NavType.LongType;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(navType2, "");
                        return navType2;
                    }
                } catch (java.lang.IllegalArgumentException unused2) {
                    androidx.view.NavType<java.lang.String> navType3 = androidx.view.NavType.StringType;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(navType3, "");
                    return navType3;
                }
            } catch (java.lang.IllegalArgumentException unused3) {
                androidx.view.NavType.FloatType.parseValue(str);
                androidx.view.NavType<java.lang.Float> navType4 = androidx.view.NavType.FloatType;
                kotlin.jvm.internal.Intrinsics.checkNotNull(navType4, "");
                return navType4;
            }
        } catch (java.lang.IllegalArgumentException unused4) {
            androidx.view.NavType.BoolType.parseValue(str);
            androidx.view.NavType<java.lang.Boolean> navType5 = androidx.view.NavType.BoolType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType5, "");
            return navType5;
        }
    }

    public static final androidx.view.NavType<java.lang.Object> navTypeInferFromValueType(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            androidx.view.NavType<java.lang.Integer> navType = androidx.view.NavType.IntType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType, "");
            return navType;
        }
        if (obj instanceof int[]) {
            androidx.view.NavType<int[]> navType2 = androidx.view.NavType.IntArrayType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType2, "");
            return navType2;
        }
        if (obj instanceof java.lang.Long) {
            androidx.view.NavType<java.lang.Long> navType3 = androidx.view.NavType.LongType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType3, "");
            return navType3;
        }
        if (obj instanceof long[]) {
            androidx.view.NavType<long[]> navType4 = androidx.view.NavType.LongArrayType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType4, "");
            return navType4;
        }
        if (obj instanceof java.lang.Float) {
            androidx.view.NavType<java.lang.Float> navType5 = androidx.view.NavType.FloatType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType5, "");
            return navType5;
        }
        if (obj instanceof float[]) {
            androidx.view.NavType<float[]> navType6 = androidx.view.NavType.FloatArrayType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType6, "");
            return navType6;
        }
        if (obj instanceof java.lang.Boolean) {
            androidx.view.NavType<java.lang.Boolean> navType7 = androidx.view.NavType.BoolType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType7, "");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            androidx.view.NavType<boolean[]> navType8 = androidx.view.NavType.BoolArrayType;
            kotlin.jvm.internal.Intrinsics.checkNotNull(navType8, "");
            return navType8;
        }
        if (!(obj instanceof java.lang.String) && obj != null) {
            return null;
        }
        androidx.view.NavType<java.lang.String> navType9 = androidx.view.NavType.StringType;
        kotlin.jvm.internal.Intrinsics.checkNotNull(navType9, "");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(androidx.view.NavType<T> navType, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!androidx.view.SavedStateReader.m9297containsimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), str)) {
            throw new java.lang.IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str2 == null) {
            return t;
        }
        T parseValue = navType.parseValue(str2, t);
        navType.put(bundle, str, parseValue);
        return parseValue;
    }
}
