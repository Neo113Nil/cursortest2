package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0018R\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b'\u0010&"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "Landroidx/window/core/ActivityComponentInfo;", "_primaryActivityName", "_secondaryActivityName", "", "secondaryActivityIntentAction", "<init>", "(Landroidx/window/core/ActivityComponentInfo;Landroidx/window/core/ActivityComponentInfo;Ljava/lang/String;)V", "Landroid/content/ComponentName;", "primaryActivityName", "secondaryActivityName", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "matchesActivityPair", "(Landroid/app/Activity;Landroid/app/Activity;)Z", "Landroid/content/Intent;", "secondaryActivityIntent", "matchesActivityIntentPair", "(Landroid/app/Activity;Landroid/content/Intent;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/core/ActivityComponentInfo;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getSecondaryActivityIntentAction", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityName"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitPairFilter {
    private final androidx.window.core.ActivityComponentInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.window.core.ActivityComponentInfo getHighSpeedVideoFpsRanges;
    private final java.lang.String secondaryActivityIntentAction;

    public SplitPairFilter(androidx.window.core.ActivityComponentInfo activityComponentInfo, androidx.window.core.ActivityComponentInfo activityComponentInfo2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComponentInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComponentInfo2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityComponentInfo;
        this.getHighSpeedVideoFpsRanges = activityComponentInfo2;
        this.secondaryActivityIntentAction = str;
        androidx.window.embedding.MatcherUtils.INSTANCE.validateComponentName$window_release(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
        androidx.window.embedding.MatcherUtils.INSTANCE.validateComponentName$window_release(activityComponentInfo2.getPackageName(), activityComponentInfo2.getClassName());
    }

    public final java.lang.String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitPairFilter(android.content.ComponentName componentName, android.content.ComponentName componentName2, java.lang.String str) {
        this(new androidx.window.core.ActivityComponentInfo(componentName), new androidx.window.core.ActivityComponentInfo(componentName2), str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName2, "");
    }

    public final android.content.ComponentName getPrimaryActivityName() {
        return new android.content.ComponentName(this.getHighResolutionOutputSizeshNQ4ISI.getPackageName(), this.getHighResolutionOutputSizeshNQ4ISI.getClassName());
    }

    public final android.content.ComponentName getSecondaryActivityName() {
        return new android.content.ComponentName(this.getHighSpeedVideoFpsRanges.getPackageName(), this.getHighSpeedVideoFpsRanges.getClassName());
    }

    public final boolean matchesActivityPair(android.app.Activity primaryActivity, android.app.Activity secondaryActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivity, "");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.isActivityMatching$window_release(primaryActivity, this.getHighResolutionOutputSizeshNQ4ISI) || !androidx.window.embedding.MatcherUtils.INSTANCE.isActivityMatching$window_release(secondaryActivity, this.getHighSpeedVideoFpsRanges)) {
            return false;
        }
        java.lang.String str = this.secondaryActivityIntentAction;
        if (str == null) {
            return true;
        }
        android.content.Intent intent = secondaryActivity.getIntent();
        return kotlin.jvm.internal.Intrinsics.areEqual(str, intent != null ? intent.getAction() : null);
    }

    public final boolean matchesActivityIntentPair(android.app.Activity primaryActivity, android.content.Intent secondaryActivityIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivityIntent, "");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.isActivityMatching$window_release(primaryActivity, this.getHighResolutionOutputSizeshNQ4ISI) || !androidx.window.embedding.MatcherUtils.INSTANCE.isIntentMatching$window_release(secondaryActivityIntent, this.getHighSpeedVideoFpsRanges)) {
            return false;
        }
        java.lang.String str = this.secondaryActivityIntentAction;
        return str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, secondaryActivityIntent.getAction());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitPairFilter{primaryActivityName=");
        sb.append(getPrimaryActivityName());
        sb.append(", secondaryActivityName=");
        sb.append(getSecondaryActivityName());
        sb.append(", secondaryActivityAction=");
        sb.append(this.secondaryActivityIntentAction);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.window.embedding.SplitPairFilter splitPairFilter = (androidx.window.embedding.SplitPairFilter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, splitPairFilter.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, splitPairFilter.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        java.lang.String str = this.secondaryActivityIntentAction;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }
}
