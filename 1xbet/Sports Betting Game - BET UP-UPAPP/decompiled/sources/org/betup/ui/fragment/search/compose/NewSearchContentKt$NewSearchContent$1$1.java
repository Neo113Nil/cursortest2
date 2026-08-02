package org.betup.ui.fragment.search.compose;

import android.util.Log;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewSearchContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.search.compose.NewSearchContentKt$NewSearchContent$1$1", f = "NewSearchContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class NewSearchContentKt$NewSearchContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isLoadingTrending$delegate;
    final /* synthetic */ State<List<String>> $trendingSearches$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NewSearchContentKt$NewSearchContent$1$1(State<? extends List<String>> state, State<Boolean> state2, Continuation<? super NewSearchContentKt$NewSearchContent$1$1> continuation) {
        super(2, continuation);
        this.$trendingSearches$delegate = state;
        this.$isLoadingTrending$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewSearchContentKt$NewSearchContent$1$1(this.$trendingSearches$delegate, this.$isLoadingTrending$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewSearchContentKt$NewSearchContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List NewSearchContent$lambda$11;
        boolean NewSearchContent$lambda$12;
        List NewSearchContent$lambda$112;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            NewSearchContent$lambda$11 = NewSearchContentKt.NewSearchContent$lambda$11(this.$trendingSearches$delegate);
            int size = NewSearchContent$lambda$11.size();
            NewSearchContent$lambda$12 = NewSearchContentKt.NewSearchContent$lambda$12(this.$isLoadingTrending$delegate);
            NewSearchContent$lambda$112 = NewSearchContentKt.NewSearchContent$lambda$11(this.$trendingSearches$delegate);
            Log.d("NewSearchContent", "UI Update - Trending items: " + size + ", Loading: " + NewSearchContent$lambda$12 + ", Items: " + NewSearchContent$lambda$112);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
