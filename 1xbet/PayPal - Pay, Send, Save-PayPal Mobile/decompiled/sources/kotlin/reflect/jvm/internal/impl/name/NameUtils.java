package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class NameUtils {
    public static final kotlin.reflect.jvm.internal.impl.name.NameUtils INSTANCE = new kotlin.reflect.jvm.internal.impl.name.NameUtils();
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("[^\\p{L}\\p{Digit}]");
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "$context_receiver";

    private NameUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sanitizeAsJavaIdentifier(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoSizes.replace(str, "_");
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.name.Name contextReceiverName(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoFpsRangesFor);
        sb.append('_');
        sb.append(i);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return identifier;
    }
}
