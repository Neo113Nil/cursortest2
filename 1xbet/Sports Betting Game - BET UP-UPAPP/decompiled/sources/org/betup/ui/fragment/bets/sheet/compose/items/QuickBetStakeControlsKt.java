package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimensKt;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetScreenPreviews;

/* compiled from: QuickBetStakeControls.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"SLIDER_STEP", "", "STAKE_PRESETS", "", "", "QuickBetStakeControls", "", "amount", "maxAmount", "minAmount", "onAmountChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(JJJLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewQuickBetStakeControls", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuickBetStakeControlsKt {
    private static final int SLIDER_STEP = 100;
    private static final List<Long> STAKE_PRESETS = CollectionsKt.listOf((Object[]) new Long[]{500L, 1000L, 5000L});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuickBetStakeControls$lambda$18(int i, Composer composer, int i2) {
        PreviewQuickBetStakeControls(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$17(long j, long j2, long j3, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuickBetStakeControls(j, j2, j3, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:java.lang.Object) from 0x022f: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r12v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:173)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void QuickBetStakeControls(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:java.lang.Object) from 0x022f: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r12v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:173)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$1$lambda$0(Function1 function1, long j, long j2) {
        function1.invoke(Long.valueOf(RangesKt.coerceAtMost(j2, j)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$3$lambda$2(Function1 function1, long j, long j2, int i) {
        function1.invoke(Long.valueOf(RangesKt.coerceIn((i / 100) * 100, 0, (int) j) + j2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$13$lambda$5$lambda$4(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$13$lambda$8$lambda$7$lambda$6(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$13$lambda$10$lambda$9(Function1 function1, long j, long j2) {
        function1.invoke(Long.valueOf(j + (j2 / 3)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$13$lambda$12$lambda$11(Function1 function1, long j, long j2) {
        function1.invoke(Long.valueOf(j + (j2 / 2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetStakeControls$lambda$16$lambda$15$lambda$14(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    @QuickBetScreenPreviews
    private static final void PreviewQuickBetStakeControls(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2039282175);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039282175, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.PreviewQuickBetStakeControls (QuickBetStakeControls.kt:115)");
            }
            QuickBetDimensKt.QuickBetProportionalScale(ComposableSingletons$QuickBetStakeControlsKt.INSTANCE.getLambda$995532501$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetStakeControlsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewQuickBetStakeControls$lambda$18;
                    PreviewQuickBetStakeControls$lambda$18 = QuickBetStakeControlsKt.PreviewQuickBetStakeControls$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewQuickBetStakeControls$lambda$18;
                }
            });
        }
    }
}
