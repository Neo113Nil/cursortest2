package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\tR*\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR*\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\tR\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\t"}, d2 = {"Landroidx/navigation/serialization/InternalNavType;", "", "<init>", "()V", "Landroidx/navigation/NavType;", "", "IntNullableType", "Landroidx/navigation/NavType;", "getIntNullableType", "()Landroidx/navigation/NavType;", "", "BoolNullableType", "getBoolNullableType", "", "DoubleType", "getDoubleType", "DoubleNullableType", "getDoubleNullableType", "", "FloatNullableType", "getFloatNullableType", "", "LongNullableType", "getLongNullableType", "", "StringNonNullableType", "getStringNonNullableType", "", "StringNullableArrayType", "getStringNullableArrayType", "", "StringNullableListType", "getStringNullableListType", "", "DoubleArrayType", "getDoubleArrayType", "DoubleListType", "getDoubleListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalNavType {
    public static final androidx.view.serialization.InternalNavType INSTANCE = new androidx.view.serialization.InternalNavType();
    private static final androidx.view.NavType<java.lang.Integer> IntNullableType = new androidx.view.NavType<java.lang.Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Integer parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return androidx.view.NavType.IntType.parseValue(value);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.Integer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
            } else {
                androidx.view.NavType.IntType.put(bundle, key, value);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Integer get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return java.lang.Integer.valueOf(androidx.view.SavedStateReader.m9327getIntimpl(m9296constructorimpl, key));
        }
    };
    private static final androidx.view.NavType<java.lang.Boolean> BoolNullableType = new androidx.view.NavType<java.lang.Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Boolean parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return androidx.view.NavType.BoolType.parseValue(value);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.Boolean value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
            } else {
                androidx.view.NavType.BoolType.put(bundle, key, value);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Boolean get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return java.lang.Boolean.valueOf(androidx.view.SavedStateReader.m9305getBooleanimpl(m9296constructorimpl, key));
        }
    };
    private static final androidx.view.NavType<java.lang.Double> DoubleType = new androidx.view.NavType<java.lang.Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        @Override // androidx.view.NavType
        public final /* synthetic */ void put(android.os.Bundle bundle, java.lang.String str, java.lang.Double d) {
            put(bundle, str, d.doubleValue());
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Double parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(value));
        }

        public final void put(android.os.Bundle bundle, java.lang.String key, double value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            androidx.view.SavedStateWriter.m9395putDoubleimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Double get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return java.lang.Double.valueOf(androidx.view.SavedStateReader.m9319getDoubleimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key));
        }
    };
    private static final androidx.view.NavType<java.lang.Double> DoubleNullableType = new androidx.view.NavType<java.lang.Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Double parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return androidx.view.serialization.InternalNavType.INSTANCE.getDoubleType().parseValue(value);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.Double value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
            } else {
                androidx.view.serialization.InternalNavType.INSTANCE.getDoubleType().put(bundle, key, value);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Double get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return java.lang.Double.valueOf(androidx.view.SavedStateReader.m9319getDoubleimpl(m9296constructorimpl, key));
        }
    };
    private static final androidx.view.NavType<java.lang.Float> FloatNullableType = new androidx.view.NavType<java.lang.Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Float parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return androidx.view.NavType.FloatType.parseValue(value);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.Float value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
            } else {
                androidx.view.NavType.FloatType.put(bundle, key, value);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Float get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return java.lang.Float.valueOf(androidx.view.SavedStateReader.m9323getFloatimpl(m9296constructorimpl, key));
        }
    };
    private static final androidx.view.NavType<java.lang.Long> LongNullableType = new androidx.view.NavType<java.lang.Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Long parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return androidx.view.NavType.LongType.parseValue(value);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.Long value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
            } else {
                androidx.view.NavType.LongType.put(bundle, key, value);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Long get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return java.lang.Long.valueOf(androidx.view.SavedStateReader.m9337getLongimpl(m9296constructorimpl, key));
        }
    };
    private static final androidx.view.NavType<java.lang.String> StringNonNullableType = new androidx.view.NavType<java.lang.String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.view.NavType
        public final java.lang.String serializeAsValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return androidx.view.NavUriUtils.encode$default(androidx.view.NavUriUtils.INSTANCE, value, null, 2, null);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            androidx.view.SavedStateWriter.m9415putStringimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, value);
        }

        @Override // androidx.view.NavType
        public final java.lang.String get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            return (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) ? "null" : androidx.view.SavedStateReader.m9367getStringimpl(m9296constructorimpl, key);
        }

        @Override // androidx.view.NavType
        public final java.lang.String parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return value;
        }
    };
    private static final androidx.view.NavType<java.lang.String[]> StringNullableArrayType = new androidx.view.CollectionNavType<java.lang.String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.view.NavType
        public final java.lang.String[] parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new java.lang.String[]{androidx.view.NavType.StringType.parseValue(value)};
        }

        @Override // androidx.view.NavType
        public final java.lang.String[] parseValue(java.lang.String value, java.lang.String[] previousValue) {
            java.lang.String[] strArr;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return (previousValue == null || (strArr = (java.lang.String[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) previousValue, (java.lang.Object[]) parseValue(value))) == null) ? parseValue(value) : strArr;
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(java.lang.String[] value, java.lang.String[] other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value, other);
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.String[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(value.length);
            for (java.lang.String str : value) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            androidx.view.SavedStateWriter.m9416putStringArrayimpl(m9382constructorimpl, key, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        }

        @Override // androidx.view.NavType
        public final java.lang.String[] get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            java.lang.String[] m9368getStringArrayimpl = androidx.view.SavedStateReader.m9368getStringArrayimpl(m9296constructorimpl, key);
            java.util.ArrayList arrayList = new java.util.ArrayList(m9368getStringArrayimpl.length);
            for (java.lang.String str : m9368getStringArrayimpl) {
                arrayList.add(androidx.view.NavType.StringType.parseValue(str));
            }
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<java.lang.String> serializeAsValues(java.lang.String[] value) {
            java.lang.String str;
            if (value == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(value.length);
            for (java.lang.String str2 : value) {
                if (str2 == null || (str = androidx.view.NavUriUtils.encode$default(androidx.view.NavUriUtils.INSTANCE, str2, null, 2, null)) == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            return arrayList;
        }

        @Override // androidx.view.CollectionNavType
        public final java.lang.String[] emptyCollection() {
            return new java.lang.String[0];
        }
    };
    private static final androidx.view.NavType<java.util.List<java.lang.String>> StringNullableListType = new androidx.view.CollectionNavType<java.util.List<? extends java.lang.String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.view.CollectionNavType
        public final /* bridge */ /* synthetic */ java.util.List serializeAsValues(java.util.List<? extends java.lang.String> list) {
            return serializeAsValues2((java.util.List<java.lang.String>) list);
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "List<String?>";
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.String> parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return kotlin.collections.CollectionsKt.listOf(androidx.view.NavType.StringType.parseValue(value));
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.String> parseValue(java.lang.String value, java.util.List<java.lang.String> previousValue) {
            java.util.List<java.lang.String> plus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return (previousValue == null || (plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) previousValue, (java.lang.Iterable) parseValue(value))) == null) ? parseValue(value) : plus;
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(java.util.List<java.lang.String> value, java.util.List<java.lang.String> other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value != null ? (java.lang.String[]) value.toArray(new java.lang.String[0]) : null, other != null ? (java.lang.String[]) other.toArray(new java.lang.String[0]) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public final java.util.List<java.lang.String> serializeAsValues2(java.util.List<java.lang.String> value) {
            java.lang.String str;
            if (value != null) {
                java.util.List<java.lang.String> list = value;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (java.lang.String str2 : list) {
                    if (str2 == null || (str = androidx.view.NavUriUtils.encode$default(androidx.view.NavUriUtils.INSTANCE, str2, null, 2, null)) == null) {
                        str = "null";
                    }
                    arrayList.add(str);
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<? extends java.lang.String> emptyCollection() {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.util.List<java.lang.String> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
                return;
            }
            java.util.List<java.lang.String> list = value;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (java.lang.String str : list) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            androidx.view.SavedStateWriter.m9416putStringArrayimpl(m9382constructorimpl, key, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.String> get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            java.util.List list = kotlin.collections.ArraysKt.toList(androidx.view.SavedStateReader.m9368getStringArrayimpl(m9296constructorimpl, key));
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.view.NavType.StringType.parseValue((java.lang.String) it.next()));
            }
            return arrayList;
        }
    };
    private static final androidx.view.NavType<double[]> DoubleArrayType = new androidx.view.CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "double[]";
        }

        @Override // androidx.view.NavType
        public final double[] parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new double[]{androidx.view.serialization.InternalNavType.INSTANCE.getDoubleType().parseValue(value).doubleValue()};
        }

        @Override // androidx.view.NavType
        public final double[] parseValue(java.lang.String value, double[] previousValue) {
            double[] plus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return (previousValue == null || (plus = kotlin.collections.ArraysKt.plus(previousValue, parseValue(value))) == null) ? parseValue(value) : plus;
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(double[] value, double[] other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value != null ? kotlin.collections.ArraysKt.toTypedArray(value) : null, other != null ? kotlin.collections.ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<java.lang.String> serializeAsValues(double[] value) {
            java.util.List<java.lang.Double> list;
            if (value == null || (list = kotlin.collections.ArraysKt.toList(value)) == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<java.lang.Double> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, double[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
            } else {
                androidx.view.SavedStateWriter.m9396putDoubleArrayimpl(m9382constructorimpl, key, value);
            }
        }

        @Override // androidx.view.NavType
        public final double[] get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return androidx.view.SavedStateReader.m9320getDoubleArrayimpl(m9296constructorimpl, key);
        }

        @Override // androidx.view.CollectionNavType
        public final double[] emptyCollection() {
            return new double[0];
        }
    };
    private static final androidx.view.NavType<java.util.List<java.lang.Double>> DoubleListType = new androidx.view.CollectionNavType<java.util.List<? extends java.lang.Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.view.CollectionNavType
        public final /* bridge */ /* synthetic */ java.util.List serializeAsValues(java.util.List<? extends java.lang.Double> list) {
            return serializeAsValues2((java.util.List<java.lang.Double>) list);
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return "List<Double>";
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.Double> parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return kotlin.collections.CollectionsKt.listOf(androidx.view.serialization.InternalNavType.INSTANCE.getDoubleType().parseValue(value));
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.Double> parseValue(java.lang.String value, java.util.List<java.lang.Double> previousValue) {
            java.util.List<java.lang.Double> plus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return (previousValue == null || (plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) previousValue, (java.lang.Iterable) parseValue(value))) == null) ? parseValue(value) : plus;
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(java.util.List<java.lang.Double> value, java.util.List<java.lang.Double> other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value != null ? (java.lang.Double[]) value.toArray(new java.lang.Double[0]) : null, other != null ? (java.lang.Double[]) other.toArray(new java.lang.Double[0]) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public final java.util.List<java.lang.String> serializeAsValues2(java.util.List<java.lang.Double> value) {
            if (value != null) {
                java.util.List<java.lang.Double> list = value;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).doubleValue()));
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<? extends java.lang.Double> emptyCollection() {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.util.List<java.lang.Double> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
            if (value == null) {
                androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
            } else {
                androidx.view.SavedStateWriter.m9396putDoubleArrayimpl(m9382constructorimpl, key, kotlin.collections.CollectionsKt.toDoubleArray(value));
            }
        }

        @Override // androidx.view.NavType
        public final java.util.List<java.lang.Double> get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
                return null;
            }
            return kotlin.collections.ArraysKt.toList(androidx.view.SavedStateReader.m9320getDoubleArrayimpl(m9296constructorimpl, key));
        }
    };

    private InternalNavType() {
    }

    public final androidx.view.NavType<java.lang.Integer> getIntNullableType() {
        return IntNullableType;
    }

    public final androidx.view.NavType<java.lang.Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    public final androidx.view.NavType<java.lang.Double> getDoubleType() {
        return DoubleType;
    }

    public final androidx.view.NavType<java.lang.Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    public final androidx.view.NavType<java.lang.Float> getFloatNullableType() {
        return FloatNullableType;
    }

    public final androidx.view.NavType<java.lang.Long> getLongNullableType() {
        return LongNullableType;
    }

    public final androidx.view.NavType<java.lang.String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    public final androidx.view.NavType<java.lang.String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    public final androidx.view.NavType<java.util.List<java.lang.String>> getStringNullableListType() {
        return StringNullableListType;
    }

    public final androidx.view.NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    public final androidx.view.NavType<java.util.List<java.lang.Double>> getDoubleListType() {
        return DoubleListType;
    }
}
