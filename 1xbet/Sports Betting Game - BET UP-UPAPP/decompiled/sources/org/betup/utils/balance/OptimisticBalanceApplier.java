package org.betup.utils.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OptimisticBalanceApplier.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lorg/betup/utils/balance/OptimisticBalanceApplier;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "applyStakeDeduction", "", "userService", "Lorg/betup/services/user/UserService;", "balanceHolder", "Lorg/betup/utils/balance/BalanceHolder;", "stake", "", "applyWinCredit", "amount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OptimisticBalanceApplier {
    public static final int $stable = 0;
    public static final OptimisticBalanceApplier INSTANCE = new OptimisticBalanceApplier();

    private OptimisticBalanceApplier() {
    }

    public final void applyStakeDeduction(UserService userService, BalanceHolder balanceHolder, long stake) {
        ShortUserProfileModel shortProfile;
        UserProgressModel userProgressModel;
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(balanceHolder, "balanceHolder");
        if (stake <= 0 || (shortProfile = userService.getShortProfile()) == null || (userProgressModel = shortProfile.getUserProgressModel()) == null) {
            return;
        }
        long coerceAtLeast = RangesKt.coerceAtLeast(userProgressModel.getMoneyBalance() - stake, 0L);
        userProgressModel.setMoneyBalance(coerceAtLeast);
        balanceHolder.postOptimisticBalance(coerceAtLeast);
    }

    public final void applyWinCredit(UserService userService, BalanceHolder balanceHolder, long amount) {
        ShortUserProfileModel shortProfile;
        UserProgressModel userProgressModel;
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(balanceHolder, "balanceHolder");
        if (amount <= 0 || (shortProfile = userService.getShortProfile()) == null || (userProgressModel = shortProfile.getUserProgressModel()) == null) {
            return;
        }
        long moneyBalance = userProgressModel.getMoneyBalance() + amount;
        userProgressModel.setMoneyBalance(moneyBalance);
        balanceHolder.postOptimisticBalance(moneyBalance);
    }
}
