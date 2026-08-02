package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BackgroundActivityStartMode {
    }

    public android.graphics.Rect getLaunchBounds() {
        return null;
    }

    public int getLaunchDisplayId() {
        return -1;
    }

    public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
        return this;
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchDisplayId(int i) {
        return this;
    }

    public androidx.core.app.ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i) {
        return this;
    }

    public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
        return this;
    }

    public android.os.Bundle toBundle() {
        return null;
    }

    public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context context, int i, int i2) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View view, android.graphics.Bitmap bitmap, int i, int i2) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, android.view.View view, java.lang.String str) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, androidx.core.util.Pair<android.view.View, java.lang.String>... pairArr) {
        android.util.Pair[] pairArr2;
        if (pairArr != null) {
            pairArr2 = new android.util.Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                pairArr2[i] = android.util.Pair.create(pairArr[i].first, pairArr[i].second);
            }
        } else {
            pairArr2 = null;
        }
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeSceneTransitionAnimation(activity, pairArr2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeTaskLaunchBehind());
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeBasic());
    }

    /* loaded from: classes7.dex */
    static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions getHighSpeedVideoFpsRanges;

        ActivityOptionsCompatImpl(android.app.ActivityOptions activityOptions) {
            this.getHighSpeedVideoFpsRanges = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
            return this.getHighSpeedVideoFpsRanges.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) {
                this.getHighSpeedVideoFpsRanges.update(((androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) activityOptionsCompat).getHighSpeedVideoFpsRanges);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
            this.getHighSpeedVideoFpsRanges.requestUsageTimeReport(pendingIntent);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(this.getHighSpeedVideoFpsRanges.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
            return this.getHighSpeedVideoFpsRanges.getLaunchBounds();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
            return android.os.Build.VERSION.SDK_INT < 34 ? this : new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(this.getHighSpeedVideoFpsRanges.setShareIdentityEnabled(z));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                this.getHighSpeedVideoFpsRanges.setPendingIntentBackgroundActivityStartMode(i);
                return this;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.getHighSpeedVideoFpsRanges.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
            }
            return this;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public int getLaunchDisplayId() {
            return this.getHighSpeedVideoFpsRanges.getLaunchDisplayId();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchDisplayId(int i) {
            this.getHighSpeedVideoFpsRanges.setLaunchDisplayId(i);
            return this;
        }
    }

    protected ActivityOptionsCompat() {
    }
}
