package org.betup.ui.fragment.bets;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetsController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/bets/BattleCreateResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Success", VastTagName.ERROR, "Lorg/betup/ui/fragment/bets/BattleCreateResult$Error;", "Lorg/betup/ui/fragment/bets/BattleCreateResult$Success;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BattleCreateResult {
    public static final int $stable = 0;

    public /* synthetic */ BattleCreateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: BetsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/bets/BattleCreateResult$Success;", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success extends BattleCreateResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private BattleCreateResult() {
    }

    /* compiled from: BetsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/bets/BattleCreateResult$Error;", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends BattleCreateResult {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
