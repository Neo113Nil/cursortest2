package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaGoalBoard {
    public static final int $stable = 0;

    @b("away")
    private final Integer gu_par_est;

    @b("home")
    private final Integer host_arg;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaGoalBoard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaGoalBoard copy$default(AquaGoalBoard aquaGoalBoard, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aquaGoalBoard.host_arg;
        }
        if ((i & 2) != 0) {
            num2 = aquaGoalBoard.gu_par_est;
        }
        return aquaGoalBoard.copy(num, num2);
    }

    public final Integer component1() {
        return this.host_arg;
    }

    public final Integer component2() {
        return this.gu_par_est;
    }

    public final AquaGoalBoard copy(Integer num, Integer num2) {
        return new AquaGoalBoard(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaGoalBoard)) {
            return false;
        }
        AquaGoalBoard aquaGoalBoard = (AquaGoalBoard) obj;
        return l.a(this.host_arg, aquaGoalBoard.host_arg) && l.a(this.gu_par_est, aquaGoalBoard.gu_par_est);
    }

    public final Integer getGu_par_est() {
        return this.gu_par_est;
    }

    public final Integer getHost_arg() {
        return this.host_arg;
    }

    public int hashCode() {
        Integer num = this.host_arg;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gu_par_est;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AquaGoalBoard(host_arg=" + this.host_arg + ", gu_par_est=" + this.gu_par_est + ")";
    }

    public AquaGoalBoard(Integer num, Integer num2) {
        this.host_arg = num;
        this.gu_par_est = num2;
    }

    public /* synthetic */ AquaGoalBoard(Integer num, Integer num2, int i, f fVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
