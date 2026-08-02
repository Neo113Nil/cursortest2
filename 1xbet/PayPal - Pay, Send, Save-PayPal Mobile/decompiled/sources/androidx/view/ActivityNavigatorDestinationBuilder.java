package androidx.view;

@androidx.view.NavDestinationDsl
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB>\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR,\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001f\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010)8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e"}, d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "", "route", "(Landroidx/navigation/ActivityNavigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/ActivityNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "build", "()Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "targetPackage", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "activityClass", "Lkotlin/reflect/KClass;", "getActivityClass", "()Lkotlin/reflect/KClass;", "setActivityClass", "(Lkotlin/reflect/KClass;)V", "action", "getAction", "setAction", "Landroid/net/Uri;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityNavigatorDestinationBuilder extends androidx.view.NavDestinationBuilder<androidx.navigation.ActivityNavigator.Destination> {
    private java.lang.String action;
    private kotlin.reflect.KClass<? extends android.app.Activity> activityClass;
    private android.net.Uri data;
    private java.lang.String dataPattern;
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @kotlin.ReplaceWith(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(androidx.view.ActivityNavigator activityNavigator, int i) {
        super(activityNavigator, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityNavigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(androidx.view.ActivityNavigator activityNavigator, java.lang.String str) {
        super(activityNavigator, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityNavigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(androidx.view.ActivityNavigator activityNavigator, kotlin.reflect.KClass<? extends java.lang.Object> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map) {
        super(activityNavigator, kClass, map);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityNavigator.getContext();
    }

    public final java.lang.String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setTargetPackage(java.lang.String str) {
        this.targetPackage = str;
    }

    public final kotlin.reflect.KClass<? extends android.app.Activity> getActivityClass() {
        return this.activityClass;
    }

    public final void setActivityClass(kotlin.reflect.KClass<? extends android.app.Activity> kClass) {
        this.activityClass = kClass;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final void setAction(java.lang.String str) {
        this.action = str;
    }

    public final android.net.Uri getData() {
        return this.data;
    }

    public final void setData(android.net.Uri uri) {
        this.data = uri;
    }

    public final java.lang.String getDataPattern() {
        return this.dataPattern;
    }

    public final void setDataPattern(java.lang.String str) {
        this.dataPattern = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.NavDestinationBuilder
    public final androidx.navigation.ActivityNavigator.Destination build() {
        androidx.navigation.ActivityNavigator.Destination destination = (androidx.navigation.ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        kotlin.reflect.KClass<? extends android.app.Activity> kClass = this.activityClass;
        if (kClass != null) {
            destination.setComponentName(new android.content.ComponentName(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Class<?>) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }
}
