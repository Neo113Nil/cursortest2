package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class AquaPagerNote {
    public static final int $stable = 0;

    @b("total")
    private final int co_par_unt;

    @b("current")
    private final int in_par_dex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AquaPagerNote() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public static /* synthetic */ AquaPagerNote copy$default(AquaPagerNote aquaPagerNote, int i, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = aquaPagerNote.in_par_dex;
        }
        if ((i6 & 2) != 0) {
            i5 = aquaPagerNote.co_par_unt;
        }
        return aquaPagerNote.copy(i, i5);
    }

    public final int component1() {
        return this.in_par_dex;
    }

    public final int component2() {
        return this.co_par_unt;
    }

    public final AquaPagerNote copy(int i, int i5) {
        return new AquaPagerNote(i, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaPagerNote)) {
            return false;
        }
        AquaPagerNote aquaPagerNote = (AquaPagerNote) obj;
        return this.in_par_dex == aquaPagerNote.in_par_dex && this.co_par_unt == aquaPagerNote.co_par_unt;
    }

    public final int getCo_par_unt() {
        return this.co_par_unt;
    }

    public final int getIn_par_dex() {
        return this.in_par_dex;
    }

    public int hashCode() {
        return (this.in_par_dex * 31) + this.co_par_unt;
    }

    public String toString() {
        return "AquaPagerNote(in_par_dex=" + this.in_par_dex + ", co_par_unt=" + this.co_par_unt + ")";
    }

    public AquaPagerNote(int i, int i5) {
        this.in_par_dex = i;
        this.co_par_unt = i5;
    }

    public /* synthetic */ AquaPagerNote(int i, int i5, int i6, f fVar) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i5);
    }
}
