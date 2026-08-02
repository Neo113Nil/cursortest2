package game.betting133.sports1xbet.aqua_viewmodels;

import G4.l;
import U3.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import c4.InterfaceC0544e;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import i4.e;
import p4.InterfaceC2280u;
import s4.M;
import s4.v;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightViewModel$loadAggregmeansatePayload$1", f = "AquaFixtureInsightViewModel.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaFixtureInsightViewModel$loadAggregmeansatePayload$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaFixtureInsightViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaFixtureInsightViewModel$loadAggregmeansatePayload$1(AquaFixtureInsightViewModel aquaFixtureInsightViewModel, c<? super AquaFixtureInsightViewModel$loadAggregmeansatePayload$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaFixtureInsightViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaFixtureInsightViewModel$loadAggregmeansatePayload$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        AquaFixtureInsightUiState aquaFixtureInsightUiState;
        v vVar;
        g gVar;
        int i;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.label;
        try {
            if (i5 == 0) {
                l.N(obj);
                gVar = this.this$0.insight_par_Archive;
                i = this.this$0.matchLo_par_okupKey;
                this.label = 1;
                obj = gVar.d(i, this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.N(obj);
            }
            aquaFixtureInsightUiState = new AquaFixtureInsightUiState(false, null, (AquaMatchDigest) obj, 3, null);
        } catch (Exception e3) {
            aquaFixtureInsightUiState = new AquaFixtureInsightUiState(false, e3.getMessage(), null, 5, null);
        }
        vVar = this.this$0.insight_par_Channel;
        M m5 = (M) vVar;
        m5.getClass();
        m5.j(null, aquaFixtureInsightUiState);
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaFixtureInsightViewModel$loadAggregmeansatePayload$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
