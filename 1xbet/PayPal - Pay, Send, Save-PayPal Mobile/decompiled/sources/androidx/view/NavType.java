package androidx.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b&\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006%&'()*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\nH¦\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J)\u0010\u0016\u001a\u00028\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0016\u001a\u00028\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\u0004\u0010!R\u001a\u0010\"\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001f"}, d2 = {"Landroidx/navigation/NavType;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "valueEquals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "Companion", "ParcelableType", "ParcelableArrayType", "SerializableType", "EnumType", "SerializableArrayType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final java.lang.String name = "nav_type";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.NavType.Companion INSTANCE = new androidx.view.NavType.Companion(null);
    public static final androidx.view.NavType<java.lang.Integer> IntType = new androidx.view.IntNavType();
    public static final androidx.view.NavType<java.lang.Integer> ReferenceType = new androidx.view.NavType<java.lang.Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.view.NavType
        public final /* synthetic */ void put(android.os.Bundle bundle, java.lang.String str, java.lang.Integer num) {
            put(bundle, str, num.intValue());
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            return androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Integer parseValue(java.lang.String value) {
            int parseInt;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.text.StringsKt.startsWith$default(value, "0x", false, 2, (java.lang.Object) null)) {
                java.lang.String substring = value.substring(2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                parseInt = java.lang.Integer.parseInt(substring, kotlin.text.CharsKt.checkRadix(16));
            } else {
                parseInt = java.lang.Integer.parseInt(value);
            }
            return java.lang.Integer.valueOf(parseInt);
        }

        public final void put(android.os.Bundle bundle, java.lang.String key, int value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            androidx.view.SavedStateWriter.m9399putIntimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.NavType
        public final java.lang.Integer get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return java.lang.Integer.valueOf(androidx.view.SavedStateReader.m9327getIntimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key));
        }
    };
    public static final androidx.view.NavType<int[]> IntArrayType = new androidx.view.IntArrayNavType();
    public static final androidx.view.NavType<java.util.List<java.lang.Integer>> IntListType = new androidx.view.IntListNavType();
    public static final androidx.view.NavType<java.lang.Long> LongType = new androidx.view.LongNavType();
    public static final androidx.view.NavType<long[]> LongArrayType = new androidx.view.LongArrayNavType();
    public static final androidx.view.NavType<java.util.List<java.lang.Long>> LongListType = new androidx.view.LongListNavType();
    public static final androidx.view.NavType<java.lang.Float> FloatType = new androidx.view.FloatNavType();
    public static final androidx.view.NavType<float[]> FloatArrayType = new androidx.view.FloatArrayNavType();
    public static final androidx.view.NavType<java.util.List<java.lang.Float>> FloatListType = new androidx.view.FloatListNavType();
    public static final androidx.view.NavType<java.lang.Boolean> BoolType = new androidx.view.BoolNavType();
    public static final androidx.view.NavType<boolean[]> BoolArrayType = new androidx.view.BoolArrayNavType();
    public static final androidx.view.NavType<java.util.List<java.lang.Boolean>> BoolListType = new androidx.view.BoolListNavType();
    public static final androidx.view.NavType<java.lang.String> StringType = new androidx.view.StringNavType();
    public static final androidx.view.NavType<java.lang.String[]> StringArrayType = new androidx.view.StringArrayNavType();
    public static final androidx.view.NavType<java.util.List<java.lang.String>> StringListType = new androidx.view.StringListNavType();

    public abstract T get(android.os.Bundle bundle, java.lang.String key);

    public abstract T parseValue(java.lang.String value);

    public abstract void put(android.os.Bundle bundle, java.lang.String key, T value);

    public NavType(boolean z) {
        this.isNullableAllowed = z;
    }

    /* renamed from: isNullableAllowed, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    public T parseValue(java.lang.String value, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return parseValue(value);
    }

    public final T parseAndPut(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (T) androidx.view.NavTypeKt.navTypeParseAndPut(this, bundle, key, value);
    }

    public final T parseAndPut(android.os.Bundle bundle, java.lang.String key, java.lang.String value, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (T) androidx.view.NavTypeKt.navTypeParseAndPut(this, bundle, key, value, previousValue);
    }

    public java.lang.String serializeAsValue(T value) {
        return java.lang.String.valueOf(value);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public boolean valueEquals(T value, T other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(value, other);
    }

    public java.lang.String toString() {
        return getName();
    }

    @kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00078\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b0\u00078\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00078\u0006¢\u0006\u0006\n\u0004\b \u0010\u0017R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b0\u00078\u0006¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00078\u0006¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b0\u00078\u0006¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0019\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00078\u0006¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b0\u00078\u0006¢\u0006\u0006\n\u0004\b*\u0010\u0017R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006¢\u0006\u0006\n\u0004\b+\u0010\u0017R\u001f\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,0\u00078\u0006¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u001f\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b0\u00078\u0006¢\u0006\u0006\n\u0004\b.\u0010\u0017"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "<init>", "()V", "", "type", com.visa.cbp.ConsumerInfo.setSignature, "Landroidx/navigation/NavType;", "fromArgType", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "Ljava/lang/Class;", "clazz", "", "isArray", "parseSerializableOrParcelableType$navigation_common_release", "(Ljava/lang/Class;Z)Landroidx/navigation/NavType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "inferFromValue", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "inferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "", "IntType", "Landroidx/navigation/NavType;", "ReferenceType", "", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "LongListType", "", "FloatType", "", "FloatArrayType", "FloatListType", "BoolType", "", "BoolArrayType", "BoolListType", "StringType", "", "StringArrayType", "StringListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.NavType<?> fromArgType(java.lang.String type, java.lang.String packageName) {
            java.lang.String str;
            androidx.view.NavType<?> navTypeFromArgType = androidx.view.NavTypeKt.navTypeFromArgType(type);
            if (navTypeFromArgType != null) {
                return navTypeFromArgType;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.view.NavType.ReferenceType.getName(), type)) {
                return androidx.view.NavType.ReferenceType;
            }
            java.lang.String str2 = type;
            if (str2 != null && str2.length() != 0) {
                try {
                    if (!kotlin.text.StringsKt.startsWith$default(type, ".", false, 2, (java.lang.Object) null) || packageName == null) {
                        str = type;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(packageName);
                        sb.append(type);
                        str = sb.toString();
                    }
                    boolean endsWith$default = kotlin.text.StringsKt.endsWith$default(type, okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, (java.lang.Object) null);
                    if (endsWith$default) {
                        str = str.substring(0, str.length() - 2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    }
                    java.lang.Class<?> cls = java.lang.Class.forName(str);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                    androidx.view.NavType<?> parseSerializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(cls, endsWith$default);
                    if (parseSerializableOrParcelableType$navigation_common_release != null) {
                        return parseSerializableOrParcelableType$navigation_common_release;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(" is not Serializable or Parcelable.");
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
            return androidx.view.NavType.StringType;
        }

        public final androidx.view.NavType<?> parseSerializableOrParcelableType$navigation_common_release(java.lang.Class<?> clazz, boolean isArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
            if (android.os.Parcelable.class.isAssignableFrom(clazz)) {
                if (isArray) {
                    return new androidx.navigation.NavType.ParcelableArrayType(clazz);
                }
                return new androidx.navigation.NavType.ParcelableType(clazz);
            }
            if (java.lang.Enum.class.isAssignableFrom(clazz) && !isArray) {
                return new androidx.navigation.NavType.EnumType(clazz);
            }
            if (!java.io.Serializable.class.isAssignableFrom(clazz)) {
                return null;
            }
            if (isArray) {
                return new androidx.navigation.NavType.SerializableArrayType(clazz);
            }
            return new androidx.navigation.NavType.SerializableType(clazz);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.NavType<java.lang.Object> inferFromValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return androidx.view.NavTypeKt.navTypeInferFromValue(value);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.NavType<java.lang.Object> inferFromValueType(java.lang.Object value) {
            androidx.view.NavType<java.lang.Object> navTypeInferFromValueType = androidx.view.NavTypeKt.navTypeInferFromValueType(value);
            if (navTypeInferFromValueType != null) {
                return navTypeInferFromValueType;
            }
            if ((value instanceof java.lang.Object[]) && (((java.lang.Object[]) value) instanceof java.lang.String[])) {
                androidx.view.NavType<java.lang.String[]> navType = androidx.view.NavType.StringArrayType;
                kotlin.jvm.internal.Intrinsics.checkNotNull(navType, "");
                return navType;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            if (value.getClass().isArray()) {
                java.lang.Class<?> componentType = value.getClass().getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    java.lang.Class<?> componentType2 = value.getClass().getComponentType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(componentType2, "");
                    return new androidx.navigation.NavType.ParcelableArrayType(componentType2);
                }
            }
            if (value.getClass().isArray()) {
                java.lang.Class<?> componentType3 = value.getClass().getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(componentType3);
                if (java.io.Serializable.class.isAssignableFrom(componentType3)) {
                    java.lang.Class<?> componentType4 = value.getClass().getComponentType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(componentType4, "");
                    return new androidx.navigation.NavType.SerializableArrayType(componentType4);
                }
            }
            if (value instanceof android.os.Parcelable) {
                return new androidx.navigation.NavType.ParcelableType(value.getClass());
            }
            if (value instanceof java.lang.Enum) {
                return new androidx.navigation.NavType.EnumType(value.getClass());
            }
            if (value instanceof java.io.Serializable) {
                return new androidx.navigation.NavType.SerializableType(value.getClass());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Object of type ");
            sb.append(value.getClass().getName());
            sb.append(" is not supported for navigation arguments.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00012\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Ljava/lang/Class;", "getHighSpeedVideoFpsRangesFor", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ParcelableType<D> extends androidx.view.NavType<D> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.Class<D> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!android.os.Parcelable.class.isAssignableFrom(cls) && !java.io.Serializable.class.isAssignableFrom(cls)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Parcelable or Serializable.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighSpeedVideoFpsRangesFor = cls;
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.String name2 = this.getHighSpeedVideoFpsRangesFor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, D value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighSpeedVideoFpsRangesFor.cast(value);
            if (value == null || (value instanceof android.os.Parcelable)) {
                bundle.putParcelable(key, (android.os.Parcelable) value);
            } else if (value instanceof java.io.Serializable) {
                bundle.putSerializable(key, (java.io.Serializable) value);
            }
        }

        @Override // androidx.view.NavType
        public final D get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (D) bundle.get(key);
        }

        @Override // androidx.view.NavType
        public final D parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            throw new java.lang.UnsupportedOperationException("Parcelables don't support default values.");
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((androidx.navigation.NavType.ParcelableType) other).getHighSpeedVideoFpsRangesFor);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRangesFor.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00182\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "Camera2StreamConfigurationMap", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ParcelableArrayType<D extends android.os.Parcelable> extends androidx.view.NavType<D[]> {
        private final java.lang.Class<D[]> Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!android.os.Parcelable.class.isAssignableFrom(cls)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Parcelable.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[L");
                sb2.append(cls.getName());
                sb2.append(';');
                java.lang.Class<D[]> cls2 = (java.lang.Class<D[]>) java.lang.Class.forName(sb2.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls2, "");
                this.Camera2StreamConfigurationMap = cls2;
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.String name2 = this.Camera2StreamConfigurationMap.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, D[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.cast(value);
            bundle.putParcelableArray(key, value);
        }

        @Override // androidx.view.NavType
        public final D[] get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (D[]) ((android.os.Parcelable[]) bundle.get(key));
        }

        @Override // androidx.view.NavType
        public final D[] parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            throw new java.lang.UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.navigation.NavType.ParcelableArrayType) other).Camera2StreamConfigurationMap);
        }

        public final int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode();
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(D[] value, D[] other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value, other);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u0004\u0018\u00018\u00012\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Class;", "Camera2StreamConfigurationMap", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static class SerializableType<D extends java.io.Serializable> extends androidx.view.NavType<D> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Class<D> Camera2StreamConfigurationMap;

        @Override // androidx.view.NavType
        public java.lang.String getName() {
            java.lang.String name2 = this.Camera2StreamConfigurationMap.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!java.io.Serializable.class.isAssignableFrom(cls)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (cls.isEnum()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(cls);
                sb2.append(" is an Enum. You should use EnumType instead.");
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
            this.Camera2StreamConfigurationMap = cls;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z, java.lang.Class<D> cls) {
            super(z);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!java.io.Serializable.class.isAssignableFrom(cls)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.Camera2StreamConfigurationMap = cls;
        }

        @Override // androidx.view.NavType
        public void put(android.os.Bundle bundle, java.lang.String key, D value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // androidx.view.NavType
        public D get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (D) bundle.get(key);
        }

        @Override // androidx.view.NavType
        public D parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            throw new java.lang.UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof androidx.navigation.NavType.SerializableType) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.navigation.NavType.SerializableType) other).Camera2StreamConfigurationMap);
            }
            return false;
        }

        public int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parseValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Class;", "Camera2StreamConfigurationMap", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class EnumType<D extends java.lang.Enum<?>> extends androidx.navigation.NavType.SerializableType<D> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.Class<D> Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(java.lang.Class<D> cls) {
            super(false, cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!cls.isEnum()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" is not an Enum type.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.Camera2StreamConfigurationMap = cls;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.String name2 = this.Camera2StreamConfigurationMap.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.view.NavType
        public final D parseValue(java.lang.String value) {
            D d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            D[] enumConstants = this.Camera2StreamConfigurationMap.getEnumConstants();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enumConstants, "");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (kotlin.text.StringsKt.equals(d.name(), value, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enum value ");
            sb.append(value);
            sb.append(" not found for type ");
            sb.append(this.Camera2StreamConfigurationMap.getName());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00182\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "Camera2StreamConfigurationMap", "Ljava/lang/Class;", "getHighSpeedVideoFpsRangesFor", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SerializableArrayType<D extends java.io.Serializable> extends androidx.view.NavType<D[]> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.Class<D[]> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!java.io.Serializable.class.isAssignableFrom(cls)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[L");
                sb2.append(cls.getName());
                sb2.append(';');
                java.lang.Class<D[]> cls2 = (java.lang.Class<D[]>) java.lang.Class.forName(sb2.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls2, "");
                this.getHighSpeedVideoFpsRangesFor = cls2;
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.String name2 = this.getHighSpeedVideoFpsRangesFor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, D[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighSpeedVideoFpsRangesFor.cast(value);
            bundle.putSerializable(key, (java.io.Serializable) value);
        }

        @Override // androidx.view.NavType
        public final D[] get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (D[]) ((java.io.Serializable[]) bundle.get(key));
        }

        @Override // androidx.view.NavType
        public final D[] parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            throw new java.lang.UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((androidx.navigation.NavType.SerializableArrayType) other).getHighSpeedVideoFpsRangesFor);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(D[] value, D[] other) {
            return kotlin.collections.ArraysKt.contentDeepEquals(value, other);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.NavType<java.lang.Object> inferFromValueType(java.lang.Object obj) {
        return INSTANCE.inferFromValueType(obj);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.NavType<java.lang.Object> inferFromValue(java.lang.String str) {
        return INSTANCE.inferFromValue(str);
    }

    @kotlin.jvm.JvmStatic
    public static androidx.view.NavType<?> fromArgType(java.lang.String str, java.lang.String str2) {
        return INSTANCE.fromArgType(str, str2);
    }
}
