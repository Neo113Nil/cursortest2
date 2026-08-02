package androidx.view.ui;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes7.dex */
public final /* synthetic */ class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function0 getHighSpeedVideoSizes;

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        return ((java.lang.Boolean) this.getHighSpeedVideoSizes.invoke()).booleanValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = function0;
    }
}
