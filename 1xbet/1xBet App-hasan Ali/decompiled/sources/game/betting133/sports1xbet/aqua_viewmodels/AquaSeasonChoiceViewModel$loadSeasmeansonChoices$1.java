package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import X3.r;
import Z3.a;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import game.betting133.sports1xbet.aqua_network.AquaCampaignCard;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import i4.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1", f = "AquaSeasonChoiceViewModel.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaSeasonChoiceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1(AquaSeasonChoiceViewModel aquaSeasonChoiceViewModel, c<? super AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaSeasonChoiceViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        AquaSeasonChoiceUiState aquaSeasonChoiceUiState;
        v vVar;
        g gVar;
        int i;
        AquaCompetitionCard compe_par_tition;
        List<AquaCampaignCard> camp_par_aigns;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.label;
        try {
            if (i5 == 0) {
                l.N(obj);
                gVar = this.this$0.season_par_Archive;
                i = this.this$0.leagueL_par_ookupKey;
                this.label = 1;
                obj = gVar.c(i, this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.N(obj);
            }
            AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj;
            ArrayList arrayList = new ArrayList();
            if (aquaCompetitionBundle != null && (camp_par_aigns = aquaCompetitionBundle.getCamp_par_aigns()) != null) {
                Iterator<T> it = camp_par_aigns.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((AquaCampaignCard) it.next()).getSt_par_amp()));
                }
            }
            r.T(arrayList, a.f6355m);
            String ti_par_tle = (aquaCompetitionBundle == null || (compe_par_tition = aquaCompetitionBundle.getCompe_par_tition()) == null) ? null : compe_par_tition.getTi_par_tle();
            if (ti_par_tle == null) {
                ti_par_tle = "";
            }
            aquaSeasonChoiceUiState = new AquaSeasonChoiceUiState(false, null, ti_par_tle, arrayList, 2, null);
        } catch (Exception e3) {
            aquaSeasonChoiceUiState = new AquaSeasonChoiceUiState(false, e3.getMessage(), null, null, 13, null);
        }
        vVar = this.this$0.season_par_Channel;
        M m5 = (M) vVar;
        m5.getClass();
        m5.j(null, aquaSeasonChoiceUiState);
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaSeasonChoiceViewModel$loadSeasmeansonChoices$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
