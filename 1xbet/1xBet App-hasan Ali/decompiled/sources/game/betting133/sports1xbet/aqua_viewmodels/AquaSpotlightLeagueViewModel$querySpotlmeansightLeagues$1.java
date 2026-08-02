package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import i4.e;
import java.util.List;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1", f = "AquaSpotlightLeagueViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaSpotlightLeagueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1(AquaSpotlightLeagueViewModel aquaSpotlightLeagueViewModel, c<? super AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaSpotlightLeagueViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        AquaSpotlightLeagueUiState aquaSpotlightLeagueUiState;
        v vVar;
        g gVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.label;
        try {
            if (i == 0) {
                l.N(obj);
                gVar = this.this$0.highligh_par_tArchive;
                this.label = 1;
                obj = gVar.a(this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.N(obj);
            }
            aquaSpotlightLeagueUiState = new AquaSpotlightLeagueUiState(false, null, (List) obj, 3, null);
        } catch (Exception e3) {
            aquaSpotlightLeagueUiState = new AquaSpotlightLeagueUiState(false, e3.getMessage(), null, 5, null);
        }
        vVar = this.this$0.highligh_par_tChannel;
        M m5 = (M) vVar;
        m5.getClass();
        m5.j(null, aquaSpotlightLeagueUiState);
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
