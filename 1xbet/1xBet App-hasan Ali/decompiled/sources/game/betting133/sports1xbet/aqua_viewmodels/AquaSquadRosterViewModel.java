package game.betting133.sports1xbet.aqua_viewmodels;

import D1.b;
import U3.g;
import a3.AbstractC0467k;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import m4.InterfaceC2100c;
import p4.AbstractC2282w;
import s4.C;
import s4.K;
import s4.M;
import s4.v;
import s4.x;

/* loaded from: classes.dex */
public final class AquaSquadRosterViewModel extends S {
    private final K fr_par_ame;
    private final g roster_par_Archive;
    private final v roster_par_Channel;
    private final int teamLo_par_okupKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final U makeFmeansactory(final int i) {
            return new U() { // from class: game.betting133.sports1xbet.aqua_viewmodels.AquaSquadRosterViewModel$Companion$makeFmeansactory$prov_par_ider$1
                @Override // androidx.lifecycle.U
                public /* bridge */ /* synthetic */ S create(Class cls, b bVar) {
                    return AbstractC0467k.a(this, cls, bVar);
                }

                @Override // androidx.lifecycle.U
                public /* bridge */ /* synthetic */ S create(InterfaceC2100c interfaceC2100c, b bVar) {
                    return AbstractC0467k.b(this, interfaceC2100c, bVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.U
                public <T extends S> T create(Class<T> cls) {
                    l.f("modelClass", cls);
                    if (cls.isAssignableFrom(AquaSquadRosterViewModel.class)) {
                        return new AquaSquadRosterViewModel(i, null, 2, 0 == true ? 1 : 0);
                    }
                    throw new IllegalArgumentException("Unsupported model: ".concat(cls.getName()));
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ AquaSquadRosterViewModel(int i, g gVar, int i5, f fVar) {
        this(i, (i5 & 2) != 0 ? new g() : gVar);
    }

    private final void fetchRomeanssterData() {
        M m5 = (M) this.roster_par_Channel;
        m5.i(AquaSquadRosterUiState.copy$default((AquaSquadRosterUiState) m5.getValue(), true, null, null, 4, null));
        AbstractC2282w.p(L.j(this), null, new AquaSquadRosterViewModel$fetchRomeanssterData$1(this, null), 3);
    }

    public final K getFr_par_ame() {
        return this.fr_par_ame;
    }

    public AquaSquadRosterViewModel(int i, g gVar) {
        l.f("roster_par_Archive", gVar);
        this.teamLo_par_okupKey = i;
        this.roster_par_Archive = gVar;
        M b3 = C.b(new AquaSquadRosterUiState(false, null, null, 7, null));
        this.roster_par_Channel = b3;
        this.fr_par_ame = new x(b3);
        fetchRomeanssterData();
    }
}
