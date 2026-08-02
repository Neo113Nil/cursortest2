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

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1", f = "AquaTournamentCatalogViewModel.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1 extends AbstractC0548i implements e {
    int label;
    final /* synthetic */ AquaTournamentCatalogViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1(AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel, c<? super AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1> cVar) {
        super(2, cVar);
        this.this$0 = aquaTournamentCatalogViewModel;
    }

    @Override // c4.AbstractC0540a
    public final c<o> create(Object obj, c<?> cVar) {
        return new AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1(this.this$0, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        v vVar2;
        g gVar;
        v vVar3;
        v vVar4;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.label;
        try {
            if (i == 0) {
                l.N(obj);
                gVar = this.this$0.league_par_Archive;
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
            List list = (List) obj;
            vVar3 = this.this$0.catalog_par_Channel;
            AquaTournamentCatalogUiState copy$default = AquaTournamentCatalogUiState.copy$default((AquaTournamentCatalogUiState) ((M) vVar3).getValue(), false, null, null, list, null, null, 0, 0, 244, null);
            vVar4 = this.this$0.catalog_par_Channel;
            ((M) vVar4).i(copy$default);
            this.this$0.rebuildVimeanssiblePage();
        } catch (Exception e3) {
            vVar = this.this$0.catalog_par_Channel;
            vVar2 = this.this$0.catalog_par_Channel;
            ((M) vVar).i(AquaTournamentCatalogUiState.copy$default((AquaTournamentCatalogUiState) ((M) vVar2).getValue(), false, e3.getMessage(), null, null, null, null, 0, 0, 252, null));
        }
        return o.f6046a;
    }

    @Override // i4.e
    public final Object invoke(InterfaceC2280u interfaceC2280u, c<? super o> cVar) {
        return ((AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1) create(interfaceC2280u, cVar)).invokeSuspend(o.f6046a);
    }
}
