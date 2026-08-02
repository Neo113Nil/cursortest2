package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Landroidx/navigation/NavType;", "parseEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Landroidx/navigation/NavType;", "parseNullableEnum", "parseEnumList", "Ljava/lang/Class;", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Class;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavTypeConverter_androidKt {
    public static final androidx.view.NavType<?> parseEnum(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        androidx.view.NavType<?> parseSerializableOrParcelableType$navigation_common_release = androidx.view.NavType.INSTANCE.parseSerializableOrParcelableType$navigation_common_release(getHighSpeedVideoFpsRangesFor(serialDescriptor), false);
        return parseSerializableOrParcelableType$navigation_common_release == null ? androidx.view.serialization.UNKNOWN.INSTANCE : parseSerializableOrParcelableType$navigation_common_release;
    }

    public static final androidx.view.NavType<?> parseNullableEnum(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.lang.Class<?> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(serialDescriptor);
        if (java.lang.Enum.class.isAssignableFrom(highSpeedVideoFpsRangesFor)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor, "");
            return new androidx.navigation.serialization.InternalAndroidNavType.EnumNullableType(highSpeedVideoFpsRangesFor);
        }
        return androidx.view.serialization.UNKNOWN.INSTANCE;
    }

    public static final androidx.view.NavType<?> parseEnumList(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.lang.Class<?> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(serialDescriptor.getElementDescriptor(0));
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor, "");
        return new androidx.navigation.serialization.InternalAndroidNavType.EnumListType(highSpeedVideoFpsRangesFor);
    }

    private static final java.lang.Class<?> getHighSpeedVideoFpsRangesFor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(serialDescriptor.getGetHighSpeedVideoSizes(), com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "", false, 4, (java.lang.Object) null);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(replace$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
            return cls;
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.String str = replace$default;
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ".", false, 2, (java.lang.Object) null)) {
                java.lang.Class<?> cls2 = java.lang.Class.forName(new kotlin.text.Regex("(\\.+)(?!.*\\.)").replace(str, "\\$"));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls2, "");
                return cls2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find class with name \"");
            sb.append(serialDescriptor.getGetHighSpeedVideoSizes());
            sb.append("\". Ensure that the serialName for this argument is the default fully qualified name");
            java.lang.String obj = sb.toString();
            if (serialDescriptor.getKind() instanceof kotlinx.serialization.descriptors.SerialKind.ENUM) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
                obj = sb2.toString();
            }
            throw new java.lang.IllegalArgumentException(obj);
        }
    }
}
