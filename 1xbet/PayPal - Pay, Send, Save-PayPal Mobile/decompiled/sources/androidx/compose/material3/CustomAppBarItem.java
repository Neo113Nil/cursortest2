package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R%\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/material3/CustomAppBarItem;", "Landroidx/compose/material3/AppBarItem;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "appbarContent", "Lkotlin/Function1;", "Landroidx/compose/material3/AppBarMenuState;", "menuContent", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "AppbarContent", "(Landroidx/compose/runtime/Composer;I)V", "state", "MenuContent", "(Landroidx/compose/material3/AppBarMenuState;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomAppBarItem implements androidx.compose.material3.AppBarItem {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<androidx.compose.material3.AppBarMenuState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomAppBarItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = function3;
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void AppbarContent(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1121775917);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1121775917, i2, -1, "androidx.compose.material3.CustomAppBarItem.AppbarContent (AppBarDsl.kt:228)");
            }
            this.Camera2StreamConfigurationMap.invoke(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CustomAppBarItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.CustomAppBarItem.$r8$lambda$WXQzdhsgyn4aSP3eFxFsdcBdojY(androidx.compose.material3.CustomAppBarItem.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void MenuContent(final androidx.compose.material3.AppBarMenuState appBarMenuState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1853735176);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appBarMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1853735176, i2, -1, "androidx.compose.material3.CustomAppBarItem.MenuContent (AppBarDsl.kt:233)");
            }
            this.getHighSpeedVideoFpsRanges.invoke(appBarMenuState, startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CustomAppBarItem$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.CustomAppBarItem.$r8$lambda$QOM5OpzfZxvYfqGzBK9xsTdwRA8(androidx.compose.material3.CustomAppBarItem.this, appBarMenuState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QOM5OpzfZxvYfqGzBK9xsTdwRA8(androidx.compose.material3.CustomAppBarItem customAppBarItem, androidx.compose.material3.AppBarMenuState appBarMenuState, int i, androidx.compose.runtime.Composer composer, int i2) {
        customAppBarItem.MenuContent(appBarMenuState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WXQzdhsgyn4aSP3eFxFsdcBdojY(androidx.compose.material3.CustomAppBarItem customAppBarItem, int i, androidx.compose.runtime.Composer composer, int i2) {
        customAppBarItem.AppbarContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
