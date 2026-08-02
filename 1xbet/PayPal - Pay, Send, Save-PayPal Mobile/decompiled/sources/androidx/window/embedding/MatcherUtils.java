package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "<init>", "()V", "Landroidx/window/core/ActivityComponentInfo;", "activityComponent", "ruleComponent", "", "areComponentsMatching$window_release", "(Landroidx/window/core/ActivityComponentInfo;Landroidx/window/core/ActivityComponentInfo;)Z", "Landroid/app/Activity;", "activity", "isActivityMatching$window_release", "(Landroid/app/Activity;Landroidx/window/core/ActivityComponentInfo;)Z", "Landroid/content/Intent;", "intent", "isIntentMatching$window_release", "(Landroid/content/Intent;Landroidx/window/core/ActivityComponentInfo;)Z", "", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;)Z", com.visa.cbp.ConsumerInfo.setSignature, "className", "", "validateComponentName$window_release", "(Ljava/lang/String;Ljava/lang/String;)V", "sDebugMatchers", "Z", "sMatchersTag", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MatcherUtils {
    public static final androidx.window.embedding.MatcherUtils INSTANCE = new androidx.window.embedding.MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final java.lang.String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    public final boolean areComponentsMatching$window_release(androidx.window.core.ActivityComponentInfo activityComponent, androidx.window.core.ActivityComponentInfo ruleComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleComponent, "");
        if (activityComponent == null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(ruleComponent.getPackageName(), "*") && kotlin.jvm.internal.Intrinsics.areEqual(ruleComponent.getClassName(), "*");
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) activityComponent.toString(), (java.lang.CharSequence) "*", false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        return (kotlin.jvm.internal.Intrinsics.areEqual(activityComponent.getPackageName(), ruleComponent.getPackageName()) || getHighSpeedVideoSizes(activityComponent.getPackageName(), ruleComponent.getPackageName())) && (kotlin.jvm.internal.Intrinsics.areEqual(activityComponent.getClassName(), ruleComponent.getClassName()) || getHighSpeedVideoSizes(activityComponent.getClassName(), ruleComponent.getClassName()));
    }

    public final boolean isActivityMatching$window_release(android.app.Activity activity, androidx.window.core.ActivityComponentInfo ruleComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleComponent, "");
        android.content.ComponentName componentName = activity.getComponentName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentName, "");
        if (areComponentsMatching$window_release(new androidx.window.core.ActivityComponentInfo(componentName), ruleComponent)) {
            return true;
        }
        android.content.Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window_release(intent, ruleComponent);
        }
        return false;
    }

    public final boolean isIntentMatching$window_release(android.content.Intent intent, androidx.window.core.ActivityComponentInfo ruleComponent) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleComponent, "");
        android.content.ComponentName component = intent.getComponent();
        if (areComponentsMatching$window_release(component != null ? new androidx.window.core.ActivityComponentInfo(component) : null, ruleComponent)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (kotlin.jvm.internal.Intrinsics.areEqual(str, ruleComponent.getPackageName()) || getHighSpeedVideoSizes(str, ruleComponent.getPackageName())) && kotlin.jvm.internal.Intrinsics.areEqual(ruleComponent.getClassName(), "*");
        }
        return false;
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1) {
        java.lang.String str = p1;
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "*", false, 2, (java.lang.Object) null)) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, "*")) {
            return true;
        }
        if (kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "*", 0, false, 6, (java.lang.Object) null) != kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, "*", 0, false, 6, (java.lang.Object) null) || !kotlin.text.StringsKt.endsWith$default(p1, "*", false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        java.lang.String substring = p1.substring(0, p1.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return kotlin.text.StringsKt.startsWith$default(p0, substring, false, 2, (java.lang.Object) null);
    }

    public final void validateComponentName$window_release(java.lang.String packageName, java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "");
        java.lang.String str = packageName;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Package name must not be empty".toString());
        }
        java.lang.String str2 = className;
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Activity class name must not be empty".toString());
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "*", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "*", 0, false, 6, (java.lang.Object) null) != packageName.length() - 1) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "*", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, "*", 0, false, 6, (java.lang.Object) null) != className.length() - 1) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }
}
