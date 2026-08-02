package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/core/app/ActivityOptionsCompat;", "p0", "", "p1", "Landroidx/navigation/ActivityNavigator$Extras;", "ActivityNavigatorExtras", "(Landroidx/core/app/ActivityOptionsCompat;I)Landroidx/navigation/ActivityNavigator$Extras;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ActivityNavigatorExtrasKt")
/* loaded from: classes7.dex */
final /* synthetic */ class ActivityNavigatorExtrasKt__ActivityNavigatorExtras_androidKt {
    public static /* synthetic */ androidx.navigation.ActivityNavigator.Extras ActivityNavigatorExtras$default(androidx.core.app.ActivityOptionsCompat activityOptionsCompat, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return androidx.view.ActivityNavigatorExtrasKt.ActivityNavigatorExtras(activityOptionsCompat, i);
    }

    public static final androidx.navigation.ActivityNavigator.Extras ActivityNavigatorExtras(androidx.core.app.ActivityOptionsCompat activityOptionsCompat, int i) {
        androidx.navigation.ActivityNavigator.Extras.Builder builder = new androidx.navigation.ActivityNavigator.Extras.Builder();
        if (activityOptionsCompat != null) {
            builder.setActivityOptions(activityOptionsCompat);
        }
        builder.addFlags(i);
        return builder.build();
    }
}
