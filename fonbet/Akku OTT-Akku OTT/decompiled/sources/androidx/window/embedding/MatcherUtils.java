package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ActivityComponentInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areComponentsMatching", "activityComponent", "Landroidx/window/core/ActivityComponentInfo;", "ruleComponent", "areComponentsMatching$window_release", "isActivityMatching", "activity", "Landroid/app/Activity;", "isActivityMatching$window_release", "isIntentMatching", "intent", "Landroid/content/Intent;", "isIntentMatching$window_release", "validateComponentName", "", "packageName", "className", "validateComponentName$window_release", "wildcardMatch", "name", "pattern", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMatcherUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherUtils.kt\nandroidx/window/embedding/MatcherUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes3.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String name, String pattern) {
        boolean contains$default;
        int indexOf$default;
        int lastIndexOf$default;
        boolean endsWith$default;
        boolean startsWith$default;
        contains$default = StringsKt__StringsKt.contains$default(pattern, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null);
        if (!contains$default) {
            return false;
        }
        if (Intrinsics.areEqual(pattern, ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        indexOf$default = StringsKt__StringsKt.indexOf$default(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null);
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) pattern, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null);
        if (indexOf$default == lastIndexOf$default) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(pattern, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, null);
            if (endsWith$default) {
                String substring = pattern.substring(0, pattern.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, substring, false, 2, null);
                return startsWith$default;
            }
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean areComponentsMatching$window_release(ActivityComponentInfo activityComponent, ActivityComponentInfo ruleComponent) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return Intrinsics.areEqual(ruleComponent.getPackageName(), ProxyConfig.MATCH_ALL_SCHEMES) && Intrinsics.areEqual(ruleComponent.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        contains$default = StringsKt__StringsKt.contains$default(activityComponent.toString(), ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null);
        if (contains$default) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.");
        }
        boolean z = Intrinsics.areEqual(activityComponent.getPackageName(), ruleComponent.getPackageName()) || wildcardMatch(activityComponent.getPackageName(), ruleComponent.getPackageName());
        boolean z2 = Intrinsics.areEqual(activityComponent.getClassName(), ruleComponent.getClassName()) || wildcardMatch(activityComponent.getClassName(), ruleComponent.getClassName());
        if (!z || !z2) {
        }
    }

    public final boolean isActivityMatching$window_release(Activity activity, ActivityComponentInfo ruleComponent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        ComponentName componentName = activity.getComponentName();
        Intrinsics.checkNotNullExpressionValue(componentName, "activity.componentName");
        if (areComponentsMatching$window_release(new ActivityComponentInfo(componentName), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window_release(intent, ruleComponent);
        }
        return false;
    }

    public final boolean isIntentMatching$window_release(Intent intent, ActivityComponentInfo ruleComponent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        ComponentName component = intent.getComponent();
        if (areComponentsMatching$window_release(component != null ? new ActivityComponentInfo(component) : null, ruleComponent)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (Intrinsics.areEqual(str, ruleComponent.getPackageName()) || wildcardMatch(str, ruleComponent.getPackageName())) && Intrinsics.areEqual(ruleComponent.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return false;
    }

    public final void validateComponentName$window_release(String packageName, String className) {
        boolean contains$default;
        boolean contains$default2;
        int indexOf$default;
        int indexOf$default2;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(className, "className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty");
        }
        contains$default = StringsKt__StringsKt.contains$default(packageName, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null);
        if (contains$default) {
            indexOf$default2 = StringsKt__StringsKt.indexOf$default(packageName, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null);
            if (indexOf$default2 != packageName.length() - 1) {
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
            }
        }
        contains$default2 = StringsKt__StringsKt.contains$default(className, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null);
        if (contains$default2) {
            indexOf$default = StringsKt__StringsKt.indexOf$default(className, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null);
            if (indexOf$default != className.length() - 1) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
            }
        }
    }
}
