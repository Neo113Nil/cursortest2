package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import game.betting133.sports1xbet.aqua_network.AquaSportsDefaults;
import i4.e;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaSquadRosterViewModel$fetchRomeanssterData$1", f = "AquaSquadRosterViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaSquadRosterViewModel$fetchRomeanssterData$1 extends AbstractC0548i implements e {
    Object L$0;
    int label;
    final /* synthetic */ AquaSquadRosterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaSquadRosterViewModel$fetchRomeanssterData$1(AquaSquadRosterViewModel aquaSquadRosterViewModel, c<? super AquaSquadRosterViewModel$fetchRomeanssterData$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaSquadRosterViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaSquadRosterViewModel$fetchRomeanssterData$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        AquaSquadRosterUiState aquaSquadRosterUiState;
        g gVar;
        int i;
        AquaSquadRosterUiState aquaSquadRosterUiState2;
        AquaSquadRosterUiState copy$default;
        v vVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.label;
        if (i5 == 0) {
            l.N(obj);
            int defaultS_par_easonYear = AquaSportsDefaults.INSTANCE.getDefaultS_par_easonYear();
            AquaSquadRosterUiState aquaSquadRosterUiState3 = new AquaSquadRosterUiState(false, null, null, 6, null);
            try {
                gVar = this.this$0.roster_par_Archive;
                i = this.this$0.teamLo_par_okupKey;
                this.L$0 = aquaSquadRosterUiState3;
                this.label = 1;
                obj = gVar.f(i, defaultS_par_easonYear, this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
                aquaSquadRosterUiState2 = aquaSquadRosterUiState3;
            } catch (Exception e3) {
                exc = e3;
                aquaSquadRosterUiState = aquaSquadRosterUiState3;
                copy$default = AquaSquadRosterUiState.copy$default(aquaSquadRosterUiState, false, exc.getMessage(), null, 5, null);
                vVar = this.this$0.roster_par_Channel;
                ((M) vVar).i(copy$default);
                return o.f6046a;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aquaSquadRosterUiState2 = (AquaSquadRosterUiState) this.L$0;
            try {
                l.N(obj);
            } catch (Exception e5) {
                exc = e5;
                aquaSquadRosterUiState = aquaSquadRosterUiState2;
                copy$default = AquaSquadRosterUiState.copy$default(aquaSquadRosterUiState, false, exc.getMessage(), null, 5, null);
                vVar = this.this$0.roster_par_Channel;
                ((M) vVar).i(copy$default);
                return o.f6046a;
            }
        }
        copy$default = AquaSquadRosterUiState.copy$default(aquaSquadRosterUiState2, false, null, (AquaRosterDigest) obj, 3, null);
        vVar = this.this$0.roster_par_Channel;
        ((M) vVar).i(copy$default);
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaSquadRosterViewModel$fetchRomeanssterData$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
