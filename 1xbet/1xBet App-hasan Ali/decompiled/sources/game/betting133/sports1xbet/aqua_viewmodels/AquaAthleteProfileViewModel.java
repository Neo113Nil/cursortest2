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
public final class AquaAthleteProfileViewModel extends S {
    private final int campaig_par_nYearKey;
    private final K fr_par_ame;
    private final int playerL_par_ookupKey;
    private final v profile_par_Channel;
    private final g sports_par_Archive;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final U makeFmeansactory(final int i, final int i5) {
            return new U() { // from class: game.betting133.sports1xbet.aqua_viewmodels.AquaAthleteProfileViewModel$Companion$makeFmeansactory$fac_par_tory$1
                @Override // androidx.lifecycle.U
                public /* bridge */ /* synthetic */ S create(Class cls, b bVar) {
                    return AbstractC0467k.a(this, cls, bVar);
                }

                @Override // androidx.lifecycle.U
                public /* bridge */ /* synthetic */ S create(InterfaceC2100c interfaceC2100c, b bVar) {
                    return AbstractC0467k.b(this, interfaceC2100c, bVar);
                }

                @Override // androidx.lifecycle.U
                public <T extends S> T create(Class<T> cls) {
                    l.f("modelClass", cls);
                    if (cls.isAssignableFrom(AquaAthleteProfileViewModel.class)) {
                        return new AquaAthleteProfileViewModel(i, i5, null, 4, null);
                    }
                    throw new IllegalArgumentException("Unsupported model: ".concat(cls.getName()));
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ AquaAthleteProfileViewModel(int i, int i5, g gVar, int i6, f fVar) {
        this(i, i5, (i6 & 4) != 0 ? new g() : gVar);
    }

    private final void loadAthletemeansProfileFrame() {
        ((M) this.profile_par_Channel).i(AquaAthleteProfileUiState.copy$default((AquaAthleteProfileUiState) ((M) this.profile_par_Channel).getValue(), true, null, null, 4, null));
        AbstractC2282w.p(L.j(this), null, new AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1(this, null), 3);
    }

    public final K getFr_par_ame() {
        return this.fr_par_ame;
    }

    public AquaAthleteProfileViewModel(int i, int i5, g gVar) {
        l.f("sports_par_Archive", gVar);
        this.playerL_par_ookupKey = i;
        this.campaig_par_nYearKey = i5;
        this.sports_par_Archive = gVar;
        M b3 = C.b(new AquaAthleteProfileUiState(false, null, null, 7, null));
        this.profile_par_Channel = b3;
        this.fr_par_ame = new x(b3);
        loadAthletemeansProfileFrame();
    }
}
