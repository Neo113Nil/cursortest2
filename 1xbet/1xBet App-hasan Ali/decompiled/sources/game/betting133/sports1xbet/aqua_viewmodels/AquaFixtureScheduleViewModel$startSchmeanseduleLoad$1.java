package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import i4.e;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1", f = "AquaFixtureScheduleViewModel.kt", l = {30, 34}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaFixtureScheduleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1(AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel, c<? super AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaFixtureScheduleViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1(this.this$0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r13 != r1) goto L31;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v vVar;
        v vVar2;
        g gVar;
        int i;
        int i5;
        String str;
        v vVar3;
        v vVar4;
        v vVar5;
        Object loadFixturemeansWindowFrame;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i6 = this.label;
        try {
        } catch (Exception e3) {
            vVar = this.this$0.schedul_par_eChannel;
            AquaFixtureScheduleUiState copy$default = AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) vVar).getValue(), null, 0, null, false, e3.getMessage(), 7, null);
            vVar2 = this.this$0.schedul_par_eChannel;
            ((M) vVar2).i(copy$default);
        }
        if (i6 == 0) {
            l.N(obj);
            gVar = this.this$0.schedul_par_eArchive;
            i = this.this$0.leagueL_par_ookupKey;
            this.label = 1;
            obj = gVar.c(i, this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.N(obj);
                return o.f6046a;
            }
            l.N(obj);
        }
        AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj;
        if (aquaCompetitionBundle != null) {
            AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
            if (compe_par_tition != null) {
                str = compe_par_tition.getTi_par_tle();
                if (str == null) {
                }
                String str2 = str;
                vVar3 = this.this$0.schedul_par_eChannel;
                int selecte_par_dSeason = ((AquaFixtureScheduleUiState) ((M) vVar3).getValue()).getSelecte_par_dSeason();
                vVar4 = this.this$0.schedul_par_eChannel;
                vVar5 = this.this$0.schedul_par_eChannel;
                ((M) vVar4).i(AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) vVar5).getValue(), str2, 0, null, false, null, 30, null));
                AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel = this.this$0;
                this.label = 2;
                loadFixturemeansWindowFrame = aquaFixtureScheduleViewModel.loadFixturemeansWindowFrame(selecte_par_dSeason, this);
            }
        }
        i5 = this.this$0.leagueL_par_ookupKey;
        str = "League " + i5;
        String str22 = str;
        vVar3 = this.this$0.schedul_par_eChannel;
        int selecte_par_dSeason2 = ((AquaFixtureScheduleUiState) ((M) vVar3).getValue()).getSelecte_par_dSeason();
        vVar4 = this.this$0.schedul_par_eChannel;
        vVar5 = this.this$0.schedul_par_eChannel;
        ((M) vVar4).i(AquaFixtureScheduleUiState.copy$default((AquaFixtureScheduleUiState) ((M) vVar5).getValue(), str22, 0, null, false, null, 30, null));
        AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel2 = this.this$0;
        this.label = 2;
        loadFixturemeansWindowFrame = aquaFixtureScheduleViewModel2.loadFixturemeansWindowFrame(selecte_par_dSeason2, this);
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaFixtureScheduleViewModel$startSchmeanseduleLoad$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
