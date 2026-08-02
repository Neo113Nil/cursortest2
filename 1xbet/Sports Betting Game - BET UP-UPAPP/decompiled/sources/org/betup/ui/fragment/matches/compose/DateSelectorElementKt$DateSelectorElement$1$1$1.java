package org.betup.ui.fragment.matches.compose;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DateSelectorElement.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.compose.DateSelectorElementKt$DateSelectorElement$1$1$1", f = "DateSelectorElement.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class DateSelectorElementKt$DateSelectorElement$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<String, String>> $dates;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ int $scrollOffsetToCenter;
    final /* synthetic */ String $selectedDate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateSelectorElementKt$DateSelectorElement$1$1$1(List<Pair<String, String>> list, LazyListState lazyListState, int i, String str, Continuation<? super DateSelectorElementKt$DateSelectorElement$1$1$1> continuation) {
        super(2, continuation);
        this.$dates = list;
        this.$listState = lazyListState;
        this.$scrollOffsetToCenter = i;
        this.$selectedDate = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DateSelectorElementKt$DateSelectorElement$1$1$1(this.$dates, this.$listState, this.$scrollOffsetToCenter, this.$selectedDate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DateSelectorElementKt$DateSelectorElement$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<Pair<String, String>> list = this.$dates;
            String str = this.$selectedDate;
            Iterator<Pair<String, String>> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getFirst(), str)) {
                    break;
                }
                i2++;
            }
            int coerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
            this.label = 1;
            if (this.$listState.animateScrollToItem(coerceAtLeast, this.$scrollOffsetToCenter, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
