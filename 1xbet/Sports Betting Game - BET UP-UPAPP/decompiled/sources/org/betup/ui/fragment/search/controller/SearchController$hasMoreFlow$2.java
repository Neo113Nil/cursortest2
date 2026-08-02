package org.betup.ui.fragment.search.controller;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, d2 = {"<anonymous>", "", "hasLeagues", "hasTeams", "hasMatches", "<destruct>", "Lkotlin/Pair;", "Lorg/betup/ui/fragment/search/controller/SearchType;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.search.controller.SearchController$hasMoreFlow$2", f = "SearchController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SearchController$hasMoreFlow$2 extends SuspendLambda implements Function5<Boolean, Boolean, Boolean, Pair<? extends Boolean, ? extends SearchType>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    /* compiled from: SearchController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.LEAGUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.TEAMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchType.MATCHES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchType.USERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SearchController$hasMoreFlow$2(Continuation<? super SearchController$hasMoreFlow$2> continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Pair<? extends Boolean, ? extends SearchType> pair, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), (Pair<Boolean, ? extends SearchType>) pair, continuation);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, Pair<Boolean, ? extends SearchType> pair, Continuation<? super Boolean> continuation) {
        SearchController$hasMoreFlow$2 searchController$hasMoreFlow$2 = new SearchController$hasMoreFlow$2(continuation);
        searchController$hasMoreFlow$2.Z$0 = z;
        searchController$hasMoreFlow$2.Z$1 = z2;
        searchController$hasMoreFlow$2.Z$2 = z3;
        searchController$hasMoreFlow$2.L$0 = pair;
        return searchController$hasMoreFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        Pair pair = (Pair) this.L$0;
        boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
        int i = WhenMappings.$EnumSwitchMapping$0[((SearchType) pair.component2()).ordinal()];
        if (i == 1) {
            z = z || z2 || z3 || booleanValue;
        } else if (i != 2) {
            if (i == 3) {
                z = z2;
            } else if (i == 4) {
                z = z3;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z = booleanValue;
            }
        }
        return Boxing.boxBoolean(z);
    }
}
