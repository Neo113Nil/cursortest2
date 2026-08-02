package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaStatCell {
    public static final int $stable = 8;

    @b("value")
    private final Object fig_par_ure;

    @b("type")
    private final String head_par_line;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaStatCell() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaStatCell copy$default(AquaStatCell aquaStatCell, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aquaStatCell.head_par_line;
        }
        if ((i & 2) != 0) {
            obj = aquaStatCell.fig_par_ure;
        }
        return aquaStatCell.copy(str, obj);
    }

    public final String component1() {
        return this.head_par_line;
    }

    public final Object component2() {
        return this.fig_par_ure;
    }

    public final AquaStatCell copy(String str, Object obj) {
        return new AquaStatCell(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaStatCell)) {
            return false;
        }
        AquaStatCell aquaStatCell = (AquaStatCell) obj;
        return l.a(this.head_par_line, aquaStatCell.head_par_line) && l.a(this.fig_par_ure, aquaStatCell.fig_par_ure);
    }

    public final Object getFig_par_ure() {
        return this.fig_par_ure;
    }

    public final String getHead_par_line() {
        return this.head_par_line;
    }

    public int hashCode() {
        String str = this.head_par_line;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.fig_par_ure;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "AquaStatCell(head_par_line=" + this.head_par_line + ", fig_par_ure=" + this.fig_par_ure + ")";
    }

    public AquaStatCell(String str, Object obj) {
        this.head_par_line = str;
        this.fig_par_ure = obj;
    }

    public /* synthetic */ AquaStatCell(String str, Object obj, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj);
    }
}
