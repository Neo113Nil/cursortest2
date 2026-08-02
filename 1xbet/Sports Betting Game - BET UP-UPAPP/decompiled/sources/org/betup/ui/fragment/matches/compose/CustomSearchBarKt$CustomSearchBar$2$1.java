package org.betup.ui.fragment.matches.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomSearchBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.compose.CustomSearchBarKt$CustomSearchBar$2$1", f = "CustomSearchBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CustomSearchBarKt$CustomSearchBar$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isSearchExpanded$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedStateChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomSearchBarKt$CustomSearchBar$2$1(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState, Continuation<? super CustomSearchBarKt$CustomSearchBar$2$1> continuation) {
        super(2, continuation);
        this.$onExpandedStateChanged = function1;
        this.$isSearchExpanded$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomSearchBarKt$CustomSearchBar$2$1(this.$onExpandedStateChanged, this.$isSearchExpanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomSearchBarKt$CustomSearchBar$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean CustomSearchBar$lambda$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<Boolean, Unit> function1 = this.$onExpandedStateChanged;
        if (function1 != null) {
            CustomSearchBar$lambda$1 = CustomSearchBarKt.CustomSearchBar$lambda$1(this.$isSearchExpanded$delegate);
            function1.invoke(Boxing.boxBoolean(CustomSearchBar$lambda$1));
        }
        return Unit.INSTANCE;
    }
}
