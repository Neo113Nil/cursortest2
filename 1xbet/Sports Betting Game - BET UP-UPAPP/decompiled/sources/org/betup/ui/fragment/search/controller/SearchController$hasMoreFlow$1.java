package org.betup.ui.fragment.search.controller;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lorg/betup/ui/fragment/search/controller/SearchType;", "hasUsers", "type"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.search.controller.SearchController$hasMoreFlow$1", f = "SearchController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SearchController$hasMoreFlow$1 extends SuspendLambda implements Function3<Boolean, SearchType, Continuation<? super Pair<? extends Boolean, ? extends SearchType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    SearchController$hasMoreFlow$1(Continuation<? super SearchController$hasMoreFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, SearchType searchType, Continuation<? super Pair<? extends Boolean, ? extends SearchType>> continuation) {
        return invoke(bool.booleanValue(), searchType, (Continuation<? super Pair<Boolean, ? extends SearchType>>) continuation);
    }

    public final Object invoke(boolean z, SearchType searchType, Continuation<? super Pair<Boolean, ? extends SearchType>> continuation) {
        SearchController$hasMoreFlow$1 searchController$hasMoreFlow$1 = new SearchController$hasMoreFlow$1(continuation);
        searchController$hasMoreFlow$1.Z$0 = z;
        searchController$hasMoreFlow$1.L$0 = searchType;
        return searchController$hasMoreFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.Z$0;
        return TuplesKt.to(Boxing.boxBoolean(z), (SearchType) this.L$0);
    }
}
