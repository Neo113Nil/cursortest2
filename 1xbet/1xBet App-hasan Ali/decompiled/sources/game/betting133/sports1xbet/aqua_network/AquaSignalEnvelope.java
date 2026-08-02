package game.betting133.sports1xbet.aqua_network;

import G3.b;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaSignalEnvelope<T> {
    public static final int $stable = 8;

    @b("response")
    private final List<T> ent_par_ries;

    @b("paging")
    private final AquaPagerNote pa_par_ger;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaSignalEnvelope() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaSignalEnvelope copy$default(AquaSignalEnvelope aquaSignalEnvelope, List list, AquaPagerNote aquaPagerNote, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aquaSignalEnvelope.ent_par_ries;
        }
        if ((i & 2) != 0) {
            aquaPagerNote = aquaSignalEnvelope.pa_par_ger;
        }
        return aquaSignalEnvelope.copy(list, aquaPagerNote);
    }

    public final List<T> component1() {
        return this.ent_par_ries;
    }

    public final AquaPagerNote component2() {
        return this.pa_par_ger;
    }

    public final AquaSignalEnvelope<T> copy(List<? extends T> list, AquaPagerNote aquaPagerNote) {
        return new AquaSignalEnvelope<>(list, aquaPagerNote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaSignalEnvelope)) {
            return false;
        }
        AquaSignalEnvelope aquaSignalEnvelope = (AquaSignalEnvelope) obj;
        return l.a(this.ent_par_ries, aquaSignalEnvelope.ent_par_ries) && l.a(this.pa_par_ger, aquaSignalEnvelope.pa_par_ger);
    }

    public final List<T> getEnt_par_ries() {
        return this.ent_par_ries;
    }

    public final AquaPagerNote getPa_par_ger() {
        return this.pa_par_ger;
    }

    public int hashCode() {
        List<T> list = this.ent_par_ries;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AquaPagerNote aquaPagerNote = this.pa_par_ger;
        return hashCode + (aquaPagerNote != null ? aquaPagerNote.hashCode() : 0);
    }

    public String toString() {
        return "AquaSignalEnvelope(ent_par_ries=" + this.ent_par_ries + ", pa_par_ger=" + this.pa_par_ger + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AquaSignalEnvelope(List<? extends T> list, AquaPagerNote aquaPagerNote) {
        this.ent_par_ries = list;
        this.pa_par_ger = aquaPagerNote;
    }

    public /* synthetic */ AquaSignalEnvelope(List list, AquaPagerNote aquaPagerNote, int i, f fVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : aquaPagerNote);
    }
}
