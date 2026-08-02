package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "", "DefaultLightScrim", com.visa.cbp.getEncExpo.warmup, "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultDarkScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "Landroidx/activity/EdgeToEdgeImpl;", "getHighSpeedVideoFpsRangesFor", "Landroidx/activity/EdgeToEdgeImpl;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EdgeToEdge {
    private static androidx.view.EdgeToEdgeImpl getHighSpeedVideoFpsRangesFor;
    private static final int DefaultLightScrim = android.graphics.Color.argb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);
    private static final int DefaultDarkScrim = android.graphics.Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static /* synthetic */ void enable$default(androidx.view.ComponentActivity componentActivity, androidx.view.SystemBarStyle systemBarStyle, androidx.view.SystemBarStyle systemBarStyle2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            systemBarStyle = androidx.view.SystemBarStyle.Companion.auto$default(androidx.view.SystemBarStyle.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = androidx.view.SystemBarStyle.Companion.auto$default(androidx.view.SystemBarStyle.INSTANCE, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final void enable(final androidx.view.ComponentActivity componentActivity, final androidx.view.SystemBarStyle systemBarStyle, final androidx.view.SystemBarStyle systemBarStyle2) {
        androidx.view.EdgeToEdgeApi26 edgeToEdgeApi26;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemBarStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemBarStyle2, "");
        final android.view.View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        androidx.view.EdgeToEdgeImpl edgeToEdgeImpl = getHighSpeedVideoFpsRangesFor;
        if (edgeToEdgeImpl == null) {
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                edgeToEdgeApi26 = new androidx.view.EdgeToEdgeApi35();
            } else if (android.os.Build.VERSION.SDK_INT >= 30) {
                edgeToEdgeApi26 = new androidx.view.EdgeToEdgeApi30();
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                edgeToEdgeApi26 = new androidx.view.EdgeToEdgeApi29();
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                edgeToEdgeApi26 = new androidx.view.EdgeToEdgeApi28();
            } else {
                edgeToEdgeApi26 = new androidx.view.EdgeToEdgeApi26();
            }
            edgeToEdgeImpl = edgeToEdgeApi26;
            getHighSpeedVideoFpsRangesFor = edgeToEdgeImpl;
        }
        final androidx.view.EdgeToEdgeImpl edgeToEdgeImpl2 = edgeToEdgeImpl;
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.EdgeToEdge.$r8$lambda$Yz0In1bzyBFjSE_9Sysnc9_l6Fw(androidx.view.EdgeToEdgeImpl.this, systemBarStyle, systemBarStyle2, componentActivity, decorView);
            }
        };
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        java.util.Iterator<android.view.View> it = androidx.core.view.ViewGroupKt.getChildren(viewGroup).iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getTag() instanceof androidx.view.EdgeToEdgeImpl) {
                    break;
                }
            } else {
                final android.content.Context context = viewGroup.getContext();
                android.view.View view = new android.view.View(context) { // from class: androidx.activity.EdgeToEdge$enableEdgeToEdge$1$2
                    @Override // android.view.View
                    protected final void onConfigurationChanged(android.content.res.Configuration newConfig) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "");
                        runnable.run();
                    }
                };
                view.setTag(edgeToEdgeImpl2);
                view.setVisibility(8);
                view.setWillNotDraw(true);
                viewGroup.addView(view);
                break;
            }
        }
        runnable.run();
        android.view.Window window = componentActivity.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
        edgeToEdgeImpl2.getHighSpeedVideoFpsRanges(window);
    }

    public static /* synthetic */ void $r8$lambda$Yz0In1bzyBFjSE_9Sysnc9_l6Fw(androidx.view.EdgeToEdgeImpl edgeToEdgeImpl, androidx.view.SystemBarStyle systemBarStyle, androidx.view.SystemBarStyle systemBarStyle2, androidx.view.ComponentActivity componentActivity, android.view.View view) {
        android.view.Window window = componentActivity.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
        kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> detectDarkMode$activity = systemBarStyle.getDetectDarkMode$activity();
        android.content.res.Resources resources = view.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        boolean booleanValue = detectDarkMode$activity.invoke(resources).booleanValue();
        kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> detectDarkMode$activity2 = systemBarStyle2.getDetectDarkMode$activity();
        android.content.res.Resources resources2 = view.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "");
        edgeToEdgeImpl.getHighSpeedVideoFpsRangesFor(systemBarStyle, systemBarStyle2, window, view, booleanValue, detectDarkMode$activity2.invoke(resources2).booleanValue());
    }

    public static final void enable(androidx.view.ComponentActivity componentActivity, androidx.view.SystemBarStyle systemBarStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemBarStyle, "");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    public static final void enable(androidx.view.ComponentActivity componentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        enable$default(componentActivity, null, null, 3, null);
    }
}
