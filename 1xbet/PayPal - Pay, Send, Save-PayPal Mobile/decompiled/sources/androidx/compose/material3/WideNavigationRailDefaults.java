package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001aJA\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001c8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010\u001e\u001a\u00020\u001c8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0018\u0010&\u001a\u00020\u0019*\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/material3/WideNavigationRailDefaults;", "", "<init>", "()V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "modalCollapsedShape", "getModalCollapsedShape", "modalExpandedShape", "getModalExpandedShape", "ModalExpandedProperties", "Landroidx/compose/material3/ModalWideNavigationRailProperties;", "getModalExpandedProperties", "()Landroidx/compose/material3/ModalWideNavigationRailProperties;", "colors", "Landroidx/compose/material3/WideNavigationRailColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/WideNavigationRailColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "modalContainerColor", "modalScrimColor", "modalContentColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/WideNavigationRailColors;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getModalContainerColor", "defaultWideWideNavigationRailColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultWideWideNavigationRailColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/WideNavigationRailColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRailDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.WideNavigationRailDefaults INSTANCE = new androidx.compose.material3.WideNavigationRailDefaults();
    private static final androidx.compose.material3.ModalWideNavigationRailProperties getHighSpeedVideoFpsRanges = androidx.compose.material3.WideNavigationRail_androidKt.createDefaultModalWideNavigationRailProperties();

    private WideNavigationRailDefaults() {
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1756160851, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-shape> (WideNavigationRail.kt:790)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.NavigationRailCollapsedTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.foundation.layout.Arrangement.Vertical getArrangement() {
        return androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1769402286, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-windowInsets> (WideNavigationRail.kt:800)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1778getVerticalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1776getStartJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }

    public final androidx.compose.ui.graphics.Shape getModalCollapsedShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(926228775, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalCollapsedShape> (WideNavigationRail.kt:806)");
        }
        androidx.compose.ui.graphics.Shape shape = getShape(composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return shape;
    }

    public final androidx.compose.ui.graphics.Shape getModalExpandedShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1865689797, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalExpandedShape> (WideNavigationRail.kt:810)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.NavigationRailExpandedTokens.INSTANCE.getModalContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.material3.ModalWideNavigationRailProperties getModalExpandedProperties() {
        return getHighSpeedVideoFpsRanges;
    }

    public final androidx.compose.material3.WideNavigationRailColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(255272712, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:820)");
        }
        androidx.compose.material3.WideNavigationRailColors Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final androidx.compose.material3.WideNavigationRailColors m4218colorszjMxDiM(long j, long j2, long j3, long j4, long j5, androidx.compose.runtime.Composer composer, int i, int i2) {
        long highSpeedVideoSizes = (i2 & 1) != 0 ? getHighSpeedVideoSizes(composer, 6) : j;
        long m3089contentColorForek8zF_U = (i2 & 2) != 0 ? androidx.compose.material3.ColorSchemeKt.m3089contentColorForek8zF_U(highSpeedVideoSizes, composer, i & 14) : j2;
        long value = (i2 & 4) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6) : j3;
        long m5995copywmQWz5c$default = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m3089contentColorForek8zF_U2 = (i2 & 16) != 0 ? androidx.compose.material3.ColorSchemeKt.m3089contentColorForek8zF_U(value, composer, (i >> 6) & 14) : j5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(239918099, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:846)");
        }
        androidx.compose.material3.WideNavigationRailColors m4212copyt635Npw = Camera2StreamConfigurationMap(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i >> 12) & 112).m4212copyt635Npw(highSpeedVideoSizes, m3089contentColorForek8zF_U, value, m5995copywmQWz5c$default, m3089contentColorForek8zF_U2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m4212copyt635Npw;
    }

    private static long getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2034736487, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-containerColor> (WideNavigationRail.kt:855)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailCollapsedTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    private static long getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1008951947, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalContainerColor> (WideNavigationRail.kt:858)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:androidx.compose.material3.WideNavigationRailColors) from 0x0060: INVOKE (r22v0 ?? I:androidx.compose.material3.ColorScheme), (r2v6 ?? I:androidx.compose.material3.WideNavigationRailColors) VIRTUAL call: androidx.compose.material3.ColorScheme.setDefaultWideWideNavigationRailColorsCached$material3(androidx.compose.material3.WideNavigationRailColors):void A[MD:(androidx.compose.material3.WideNavigationRailColors):void (m)] (LINE:873)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static androidx.compose.material3.WideNavigationRailColors Camera2StreamConfigurationMap(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:androidx.compose.material3.WideNavigationRailColors) from 0x0060: INVOKE (r22v0 ?? I:androidx.compose.material3.ColorScheme), (r2v6 ?? I:androidx.compose.material3.WideNavigationRailColors) VIRTUAL call: androidx.compose.material3.ColorScheme.setDefaultWideWideNavigationRailColorsCached$material3(androidx.compose.material3.WideNavigationRailColors):void A[MD:(androidx.compose.material3.WideNavigationRailColors):void (m)] (LINE:873)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
