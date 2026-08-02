package org.betup.ui.fragment.matches.compose;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SportsList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.compose.SportsListKt$SportsList$4$1", f = "SportsList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SportsListKt$SportsList$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadingMore;
    final /* synthetic */ Function0<Unit> $onSportScrollComplete;
    final /* synthetic */ List<SportListItemUiModel> $sports;
    final /* synthetic */ Long $tourSportId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SportsListKt$SportsList$4$1(Long l, List<SportListItemUiModel> list, boolean z, Function0<Unit> function0, Continuation<? super SportsListKt$SportsList$4$1> continuation) {
        super(2, continuation);
        this.$tourSportId = l;
        this.$sports = list;
        this.$isLoadingMore = z;
        this.$onSportScrollComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportsListKt$SportsList$4$1(this.$tourSportId, this.$sports, this.$isLoadingMore, this.$onSportScrollComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportsListKt$SportsList$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$tourSportId != null && !this.$sports.isEmpty() && !this.$isLoadingMore) {
            Function0<Unit> function02 = this.$onSportScrollComplete;
            if (function02 != null) {
                function02.invoke();
            }
            Log.d("SportsList", "Sport scroll complete - first item should be ready, tourSportId=" + this.$tourSportId);
        } else if (this.$tourSportId == null && !this.$sports.isEmpty() && !this.$isLoadingMore && (function0 = this.$onSportScrollComplete) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
