package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.model.remote.entity.matches.details.QuizModel;

/* compiled from: QuizQuestionsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1", f = "QuizQuestionsScreen.kt", i = {}, l = {119, 121, 124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ QuizModel $quizDetails;
    final /* synthetic */ int $tierSelectionPageIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1(int i, QuizModel quizModel, PagerState pagerState, int i2, Continuation<? super QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.$page = i;
        this.$quizDetails = quizModel;
        this.$pagerState = pagerState;
        this.$tierSelectionPageIndex = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1(this.$page, this.$quizDetails, this.$pagerState, this.$tierSelectionPageIndex, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuizQuestionsScreenKt$QuizQuestionsScreen$1$2$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (this.$page < this.$quizDetails.getQuestions().size() - 1) {
            this.label = 2;
            if (PagerState.animateScrollToPage$default(this.$pagerState, this.$page + 1, 0.0f, null, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.label = 3;
            if (PagerState.animateScrollToPage$default(this.$pagerState, this.$tierSelectionPageIndex, 0.0f, null, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
