package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType;", "", "<init>", "()V", "EnumNullableType", "SerializableNullableType", "EnumListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalAndroidNavType {
    public static final androidx.view.serialization.InternalAndroidNavType INSTANCE = new androidx.view.serialization.InternalAndroidNavType();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType;", "", "D", "Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parseValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumNullableType<D extends java.lang.Enum<?>> extends androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType<D> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Class<D> getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(java.lang.Class<D> cls) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            if (!cls.isEnum()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls);
                sb.append(" is not an Enum type.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighSpeedVideoSizes = cls;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.String name2 = this.getHighSpeedVideoSizes.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.view.NavType
        public final D parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            D d = null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
                return null;
            }
            D[] enumConstants = this.getHighSpeedVideoSizes.getEnumConstants();
            kotlin.jvm.internal.Intrinsics.checkNotNull(enumConstants);
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                D d2 = enumConstants[i];
                D d3 = d2;
                kotlin.jvm.internal.Intrinsics.checkNotNull(d3);
                if (kotlin.text.StringsKt.equals(d3.name(), value, true)) {
                    d = d2;
                    break;
                }
                i++;
            }
            D d4 = d;
            if (d4 != null) {
                return d4;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enum value ");
            sb.append(value);
            sb.append(" not found for type ");
            sb.append(this.getHighSpeedVideoSizes.getName());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private InternalAndroidNavType() {
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u0004\u0018\u00018\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SerializableNullableType<D extends java.io.Serializable> extends androidx.view.NavType<D> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Class<D> getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            this.getHighSpeedVideoSizes = cls;
            if (java.io.Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Serializable.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        @Override // androidx.view.NavType
        public java.lang.String getName() {
            java.lang.String name2 = this.getHighSpeedVideoSizes.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        @Override // androidx.view.NavType
        public void put(android.os.Bundle bundle, java.lang.String key, D value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            bundle.putSerializable(key, this.getHighSpeedVideoSizes.cast(value));
        }

        @Override // androidx.view.NavType
        public D get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            java.lang.Object obj = bundle.get(key);
            if (obj instanceof java.io.Serializable) {
                return (D) obj;
            }
            return null;
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
            if (other instanceof androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType) other).getHighSpeedVideoSizes);
            }
            return false;
        }

        public int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J/\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumListType;", "", "D", "Landroidx/navigation/CollectionNavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/navigation/NavType$EnumType;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/NavType$EnumType;", "getHighSpeedVideoFpsRanges", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumListType<D extends java.lang.Enum<?>> extends androidx.view.CollectionNavType<java.util.List<? extends D>> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.navigation.NavType.EnumType<D> getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(java.lang.Class<D> cls) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            this.getHighSpeedVideoFpsRanges = new androidx.navigation.NavType.EnumType<>(cls);
        }

        @Override // androidx.view.NavType
        public final java.lang.String getName() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("List<");
            sb.append(this.getHighSpeedVideoFpsRanges.getName());
            sb.append("}>");
            return sb.toString();
        }

        @Override // androidx.view.NavType
        public final void put(android.os.Bundle bundle, java.lang.String key, java.util.List<? extends D> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            bundle.putSerializable(key, value != null ? new java.util.ArrayList(value) : null);
        }

        @Override // androidx.view.NavType
        public final java.util.List<D> get(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            java.lang.Object obj = bundle.get(key);
            if (obj instanceof java.util.List) {
                return (java.util.List) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public final java.util.List<D> parseValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRanges.parseValue(value));
        }

        @Override // androidx.view.NavType
        public final java.util.List<D> parseValue(java.lang.String value, java.util.List<? extends D> previousValue) {
            java.util.List<D> plus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return (previousValue == null || (plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) previousValue, (java.lang.Iterable) parseValue(value))) == null) ? parseValue(value) : plus;
        }

        @Override // androidx.view.NavType
        public final boolean valueEquals(java.util.List<? extends D> value, java.util.List<? extends D> other) {
            return kotlin.jvm.internal.Intrinsics.areEqual(value != null ? new java.util.ArrayList(value) : null, other != null ? new java.util.ArrayList(other) : null);
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<java.lang.String> serializeAsValues(java.util.List<? extends D> value) {
            if (value != null) {
                java.util.List<? extends D> list = value;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((java.lang.Enum) it.next()).toString());
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // androidx.view.CollectionNavType
        public final java.util.List<D> emptyCollection() {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof androidx.navigation.serialization.InternalAndroidNavType.EnumListType) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((androidx.navigation.serialization.InternalAndroidNavType.EnumListType) other).getHighSpeedVideoFpsRanges);
            }
            return false;
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }
    }
}
