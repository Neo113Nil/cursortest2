package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.details.QuizModel;
import org.betup.model.remote.entity.matches.details.QuizTierModel;

/* compiled from: QuizQuestionsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class QuizQuestionsScreenKt$QuizQuestionsScreen$1$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ boolean $isPlacing;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function5<Integer, Long, String, Float, String, Unit> $onAnswerSelected;
    final /* synthetic */ Function0<Unit> $onPlaceQuiz;
    final /* synthetic */ Function1<Long, Unit> $onTierSelected;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ QuizModel $quizDetails;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ QuizSelectionState $selectionState;
    final /* synthetic */ int $tierSelectionPageIndex;
    final /* synthetic */ List<QuizTierModel> $tiers;
    final /* synthetic */ int $verifyPageIndex;

    /* JADX WARN: Multi-variable type inference failed */
    QuizQuestionsScreenKt$QuizQuestionsScreen$1$2(QuizModel quizModel, int i, QuizSelectionState quizSelectionState, List<QuizTierModel> list, OddType oddType, Function1<? super Long, Unit> function1, CoroutineScope coroutineScope, PagerState pagerState, int i2, Function0<Unit> function0, boolean z, Function5<? super Integer, ? super Long, ? super String, ? super Float, ? super String, Unit> function5) {
        this.$quizDetails = quizModel;
        this.$tierSelectionPageIndex = i;
        this.$selectionState = quizSelectionState;
        this.$tiers = list;
        this.$oddType = oddType;
        this.$onTierSelected = function1;
        this.$scope = coroutineScope;
        this.$pagerState = pagerState;
        this.$verifyPageIndex = i2;
        this.$onPlaceQuiz = function0;
        this.$isPlacing = z;
        this.$onAnswerSelected = function5;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 ??, still in use, count: 1, list:
          (r0v18 ?? I:java.lang.Object) from 0x0159: INVOKE (r57v0 ?? I:androidx.compose.runtime.Composer), (r0v18 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:332)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 ??, still in use, count: 1, list:
          (r0v18 ?? I:java.lang.Object) from 0x0159: INVOKE (r57v0 ?? I:androidx.compose.runtime.Composer), (r0v18 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:332)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r55v0 ??
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
    public static final Unit invoke$lambda$3$lambda$1$lambda$0(Function5 function5, CoroutineScope coroutineScope, int i, QuizModel quizModel, PagerState pagerState, int i2, int i3, long j, String betName, float f, String varietyName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(varietyName, "varietyName");
        function5.invoke(Integer.valueOf(i3), Long.valueOf(j), betName, Float.valueOf(f), varietyName);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1(i, quizModel, pagerState, i2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(CoroutineScope coroutineScope, PagerState pagerState, int i) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$3$1$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }
}
