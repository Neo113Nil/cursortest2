package game.betting133.sports1xbet.aqua_viewmodels;

import D1.b;
import U3.g;
import W3.o;
import a3.AbstractC0467k;
import a4.c;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import b4.EnumC0510a;
import java.util.List;
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
public final class AquaFixtureScheduleViewModel extends S {
    private final K fr_par_ame;
    private final int leagueL_par_ookupKey;
    private final g schedul_par_eArchive;
    private final v schedul_par_eChannel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final U makeFmeansactory(final int i, final int i5) {
            return new U() { // from class: game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleViewModel$Companion$makeFmeansactory$1
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
                    if (cls.isAssignableFrom(AquaFixtureScheduleViewModel.class)) {
                        return new AquaFixtureScheduleViewModel(i, i5, null, 4, null);
                    }
                    throw new IllegalArgumentException("Unsupported model: ".concat(cls.getName()));
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ AquaFixtureScheduleViewModel(int i, int i5, g gVar, int i6, f fVar) {
        this(i, i5, (i6 & 4) != 0 ? new g() : gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadFixturemeansWindowFrame(int i, c<? super o> cVar) {
        AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1 aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1;
        int i5;
        Exception exc;
        AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel;
        AquaFixtureScheduleUiState copy$default;
        if (cVar instanceof AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1) {
            aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1 = (AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1) cVar;
            int i6 = aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.label = i6 - Integer.MIN_VALUE;
                Object obj = aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.result;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i5 = aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.label;
                if (i5 != 0) {
                    G4.l.N(obj);
                    try {
                        g gVar = this.schedul_par_eArchive;
                        int i7 = this.leagueL_par_ookupKey;
                        aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.L$0 = this;
                        aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.label = 1;
                        obj = gVar.b(i7, i, aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                        aquaFixtureScheduleViewModel = this;
                    } catch (Exception e3) {
                        exc = e3;
                        aquaFixtureScheduleViewModel = this;
                        copy$default = AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).getValue(), null, 0, null, false, exc.getMessage(), 7, null);
                        ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).i(copy$default);
                        return o.f6046a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aquaFixtureScheduleViewModel = (AquaFixtureScheduleViewModel) aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.L$0;
                    try {
                        G4.l.N(obj);
                    } catch (Exception e5) {
                        exc = e5;
                        copy$default = AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).getValue(), null, 0, null, false, exc.getMessage(), 7, null);
                        ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).i(copy$default);
                        return o.f6046a;
                    }
                }
                copy$default = AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).getValue(), null, 0, (List) obj, false, null, 3, null);
                ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).i(copy$default);
                return o.f6046a;
            }
        }
        aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1 = new AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1(this, cVar);
        Object obj2 = aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.result;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = aquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1.label;
        if (i5 != 0) {
        }
        copy$default = AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).getValue(), null, 0, (List) obj2, false, null, 3, null);
        ((M) aquaFixtureScheduleViewModel.schedul_par_eChannel).i(copy$default);
        return o.f6046a;
    }

    private final void startSchmeanseduleLoad() {
        M m5 = (M) this.schedul_par_eChannel;
        m5.i(AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) m5.getValue(), null, 0, null, true, null, 7, null));
        AbstractC2282w.p(L.j(this), null, new AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1(this, null), 3);
    }

    public final K getFr_par_ame() {
        return this.fr_par_ame;
    }

    public AquaFixtureScheduleViewModel(int i, int i5, g gVar) {
        l.f("schedul_par_eArchive", gVar);
        this.leagueL_par_ookupKey = i;
        this.schedul_par_eArchive = gVar;
        M b3 = C.b(new AquaFixtureScheduleUiState(null, i5, null, false, null, 29, null));
        this.schedul_par_eChannel = b3;
        this.fr_par_ame = new x(b3);
        startSchmeanseduleLoad();
    }
}
