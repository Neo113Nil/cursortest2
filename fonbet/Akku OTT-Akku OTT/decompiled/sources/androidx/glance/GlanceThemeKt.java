package androidx.glance;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.glance.color.ColorProviders;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"GlanceTheme", "", "colors", "Landroidx/glance/color/ColorProviders;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/glance/GlanceComposable;", "Landroidx/compose/runtime/Composable;", "(Landroidx/glance/color/ColorProviders;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceTheme.kt\nandroidx/glance/GlanceThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n76#2:50\n*S KotlinDebug\n*F\n+ 1 GlanceTheme.kt\nandroidx/glance/GlanceThemeKt\n*L\n41#1:50\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if ((r8 & 1) != 0) goto L35;
     */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.glance.GlanceComposable[androidx.glance.GlanceComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GlanceTheme(final ColorProviders colorProviders, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1977781714);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(colorProviders)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colorProviders = (ColorProviders) startRestartGroup.consume(CompositionLocalsKt.getLocalColors());
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1977781714, i3, -1, "androidx.glance.GlanceTheme (GlanceTheme.kt:39)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalColors().provides(colorProviders)}, function2, startRestartGroup, (i3 & 112) | 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.GlanceThemeKt$GlanceTheme$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                GlanceThemeKt.GlanceTheme(ColorProviders.this, function2, composer2, i | 1, i2);
            }
        });
    }
}
