package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import i4.e;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1", f = "AquaAthleteProfileViewModel.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaAthleteProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1(AquaAthleteProfileViewModel aquaAthleteProfileViewModel, c<? super AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaAthleteProfileViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        AquaAthleteProfileUiState aquaAthleteProfileUiState;
        v vVar;
        g gVar;
        int i;
        int i5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i6 = this.label;
        try {
            if (i6 == 0) {
                l.N(obj);
                gVar = this.this$0.sports_par_Archive;
                i = this.this$0.playerL_par_ookupKey;
                i5 = this.this$0.campaig_par_nYearKey;
                this.label = 1;
                obj = gVar.e(i, i5, this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.N(obj);
            }
            aquaAthleteProfileUiState = new AquaAthleteProfileUiState(false, null, (AquaPlayerSheet) obj, 3, null);
        } catch (Exception e3) {
            aquaAthleteProfileUiState = new AquaAthleteProfileUiState(false, e3.getMessage(), null, 5, null);
        }
        vVar = this.this$0.profile_par_Channel;
        M m5 = (M) vVar;
        m5.getClass();
        m5.j(null, aquaAthleteProfileUiState);
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaAthleteProfileViewModel$loadAthletemeansProfileFrame$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
