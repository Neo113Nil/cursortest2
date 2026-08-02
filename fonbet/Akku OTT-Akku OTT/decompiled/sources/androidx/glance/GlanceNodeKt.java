package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@GlanceComposable
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\b\b\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\"\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001ag\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\b\b\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\"\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"GlanceNode", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/glance/Emittable;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,47:1\n251#2,10:48\n327#2,11:58\n*S KotlinDebug\n*F\n+ 1 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n*L\n34#1:48,10\n45#1:58,11\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceNodeKt {
    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends Emittable> void GlanceNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(-1115894518);
        composer.startReplaceableGroup(1886828752);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(function0));
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m107boximpl(Updater.m108constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends Emittable> void GlanceNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(578571862);
        int i2 = i & 1022;
        composer.startReplaceableGroup(-548224868);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m107boximpl(Updater.m108constructorimpl(composer)));
        function2.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
