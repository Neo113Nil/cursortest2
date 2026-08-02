package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "Landroidx/window/core/ActivityComponentInfo;", "activityComponentInfo", "", "intentAction", "<init>", "(Landroidx/window/core/ActivityComponentInfo;Ljava/lang/String;)V", "Landroid/content/ComponentName;", "componentName", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "matchesIntent", "(Landroid/content/Intent;)Z", "Landroid/app/Activity;", "activity", "matchesActivity", "(Landroid/app/Activity;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/window/core/ActivityComponentInfo;", "getActivityComponentInfo$window_release", "()Landroidx/window/core/ActivityComponentInfo;", "Ljava/lang/String;", "getIntentAction", "getComponentName", "()Landroid/content/ComponentName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityFilter {
    private final androidx.window.core.ActivityComponentInfo activityComponentInfo;
    private final java.lang.String intentAction;

    public ActivityFilter(androidx.window.core.ActivityComponentInfo activityComponentInfo, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComponentInfo, "");
        this.activityComponentInfo = activityComponentInfo;
        this.intentAction = str;
        androidx.window.embedding.MatcherUtils.INSTANCE.validateComponentName$window_release(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
    }

    /* renamed from: getActivityComponentInfo$window_release, reason: from getter */
    public final androidx.window.core.ActivityComponentInfo getActivityComponentInfo() {
        return this.activityComponentInfo;
    }

    public final java.lang.String getIntentAction() {
        return this.intentAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityFilter(android.content.ComponentName componentName, java.lang.String str) {
        this(new androidx.window.core.ActivityComponentInfo(componentName), str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
    }

    public final boolean matchesIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.isIntentMatching$window_release(intent, this.activityComponentInfo)) {
            return false;
        }
        java.lang.String str = this.intentAction;
        return str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, intent.getAction());
    }

    public final boolean matchesActivity(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.isActivityMatching$window_release(activity, this.activityComponentInfo)) {
            return false;
        }
        java.lang.String str = this.intentAction;
        if (str == null) {
            return true;
        }
        android.content.Intent intent = activity.getIntent();
        return kotlin.jvm.internal.Intrinsics.areEqual(str, intent != null ? intent.getAction() : null);
    }

    public final android.content.ComponentName getComponentName() {
        return new android.content.ComponentName(this.activityComponentInfo.getPackageName(), this.activityComponentInfo.getClassName());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ActivityFilter)) {
            return false;
        }
        androidx.window.embedding.ActivityFilter activityFilter = (androidx.window.embedding.ActivityFilter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activityComponentInfo, activityFilter.activityComponentInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentAction, activityFilter.intentAction);
    }

    public final int hashCode() {
        int hashCode = this.activityComponentInfo.hashCode();
        java.lang.String str = this.intentAction;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityFilter(componentName=");
        sb.append(this.activityComponentInfo);
        sb.append(", intentAction=");
        sb.append(this.intentAction);
        sb.append(')');
        return sb.toString();
    }
}
