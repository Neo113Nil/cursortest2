package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/ComponentName;", "", "resolveViewUrl", "(Landroid/content/ComponentName;)Ljava/lang/String;", "", "(Ljava/lang/Object;)Ljava/lang/String;", "UNKNOWN_DESTINATION_URL", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewUtilsKt {
    public static final java.lang.String UNKNOWN_DESTINATION_URL = "Unknown";

    public static final java.lang.String resolveViewUrl(java.lang.Object obj) {
        java.lang.String resolveViewUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof androidx.navigation.fragment.FragmentNavigator.Destination) {
            return ((androidx.navigation.fragment.FragmentNavigator.Destination) obj).getClassName();
        }
        if (obj instanceof androidx.navigation.fragment.DialogFragmentNavigator.Destination) {
            return ((androidx.navigation.fragment.DialogFragmentNavigator.Destination) obj).getClassName();
        }
        if (obj instanceof androidx.navigation.ActivityNavigator.Destination) {
            android.content.ComponentName component = ((androidx.navigation.ActivityNavigator.Destination) obj).getComponent();
            return (component == null || (resolveViewUrl = resolveViewUrl(component)) == null) ? "Unknown" : resolveViewUrl;
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = obj.getClass().getSimpleName();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "");
        return canonicalName;
    }

    public static final java.lang.String resolveViewUrl(android.content.ComponentName componentName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        java.lang.String packageName = componentName.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
        if (packageName.length() == 0) {
            java.lang.String className = componentName.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
            return className;
        }
        java.lang.String className2 = componentName.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "");
        java.lang.String packageName2 = componentName.getPackageName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(packageName2);
        sb.append(".");
        if (kotlin.text.StringsKt.startsWith$default(className2, sb.toString(), false, 2, (java.lang.Object) null)) {
            java.lang.String className3 = componentName.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className3, "");
            return className3;
        }
        java.lang.String className4 = componentName.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className4, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className4, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 2, (java.lang.Object) null)) {
            java.lang.String className5 = componentName.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className5, "");
            return className5;
        }
        java.lang.String packageName3 = componentName.getPackageName();
        java.lang.String className6 = componentName.getClassName();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(packageName3);
        sb2.append(".");
        sb2.append(className6);
        return sb2.toString();
    }
}
