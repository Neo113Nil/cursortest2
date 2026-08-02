package org.betup.ui.fragment.matches.details.compose.tabs.comments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchCommentsModels.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/comments/MatchCommentsCallbacks;", "", "onRefresh", "Lkotlin/Function0;", "", "onLoadMore", "onSendComment", "Lkotlin/Function1;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "getOnLoadMore", "getOnSendComment", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchCommentsCallbacks {
    public static final int $stable = 0;
    private final Function0<Unit> onLoadMore;
    private final Function0<Unit> onRefresh;
    private final Function1<String, Unit> onSendComment;

    public MatchCommentsCallbacks() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchCommentsCallbacks copy$default(MatchCommentsCallbacks matchCommentsCallbacks, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = matchCommentsCallbacks.onRefresh;
        }
        if ((i & 2) != 0) {
            function02 = matchCommentsCallbacks.onLoadMore;
        }
        if ((i & 4) != 0) {
            function1 = matchCommentsCallbacks.onSendComment;
        }
        return matchCommentsCallbacks.copy(function0, function02, function1);
    }

    public final Function0<Unit> component1() {
        return this.onRefresh;
    }

    public final Function0<Unit> component2() {
        return this.onLoadMore;
    }

    public final Function1<String, Unit> component3() {
        return this.onSendComment;
    }

    public final MatchCommentsCallbacks copy(Function0<Unit> onRefresh, Function0<Unit> onLoadMore, Function1<? super String, Unit> onSendComment) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(onSendComment, "onSendComment");
        return new MatchCommentsCallbacks(onRefresh, onLoadMore, onSendComment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchCommentsCallbacks)) {
            return false;
        }
        MatchCommentsCallbacks matchCommentsCallbacks = (MatchCommentsCallbacks) other;
        return Intrinsics.areEqual(this.onRefresh, matchCommentsCallbacks.onRefresh) && Intrinsics.areEqual(this.onLoadMore, matchCommentsCallbacks.onLoadMore) && Intrinsics.areEqual(this.onSendComment, matchCommentsCallbacks.onSendComment);
    }

    public int hashCode() {
        return (((this.onRefresh.hashCode() * 31) + this.onLoadMore.hashCode()) * 31) + this.onSendComment.hashCode();
    }

    public String toString() {
        return "MatchCommentsCallbacks(onRefresh=" + this.onRefresh + ", onLoadMore=" + this.onLoadMore + ", onSendComment=" + this.onSendComment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchCommentsCallbacks(Function0<Unit> onRefresh, Function0<Unit> onLoadMore, Function1<? super String, Unit> onSendComment) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(onSendComment, "onSendComment");
        this.onRefresh = onRefresh;
        this.onLoadMore = onLoadMore;
        this.onSendComment = onSendComment;
    }

    public /* synthetic */ MatchCommentsCallbacks(Function0 function0, Function0 function02, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 2) != 0 ? new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 4) != 0 ? new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsCallbacks$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$2;
                _init_$lambda$2 = MatchCommentsCallbacks._init_$lambda$2((String) obj);
                return _init_$lambda$2;
            }
        } : function1);
    }

    public final Function0<Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final Function0<Unit> getOnLoadMore() {
        return this.onLoadMore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnSendComment() {
        return this.onSendComment;
    }
}
