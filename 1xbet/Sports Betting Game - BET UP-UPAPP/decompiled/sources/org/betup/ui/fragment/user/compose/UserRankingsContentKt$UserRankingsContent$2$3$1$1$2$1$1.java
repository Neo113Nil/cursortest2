package org.betup.ui.fragment.user.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UserRankingsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public static final UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1 INSTANCE = new UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1();

    UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1() {
        super(1, UserRankingsContentKt.class, "onUserClick", "onUserClick(I)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        UserRankingsContentKt.onUserClick(i);
    }
}
