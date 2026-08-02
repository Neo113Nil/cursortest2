package F4;

import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import game.betting133.sports1xbet.aqua_network.AquaSportsDefaults;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import i4.InterfaceC2015a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1600k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1602m;

    public /* synthetic */ k(Object obj, W3.c cVar, int i) {
        this.f1600k = i;
        this.f1601l = obj;
        this.f1602m = cVar;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f1600k) {
            case 0:
                o oVar = (o) this.f1602m;
                s sVar = (s) this.f1601l;
                try {
                } catch (IOException e3) {
                    oVar.b(2, 2, e3);
                } catch (Throwable th) {
                    oVar.b(3, 3, null);
                    z4.b.c(sVar);
                    throw th;
                }
                if (!sVar.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (sVar.b(false, this)) {
                }
                oVar.b(1, 9, null);
                z4.b.c(sVar);
                return W3.o.f6046a;
            case 1:
                AquaMatchCard ma_par_tch = ((AquaMatchTicket) this.f1601l).getMa_par_tch();
                if (ma_par_tch != null) {
                    ((i4.c) this.f1602m).c(Integer.valueOf(ma_par_tch.getCode_arg()));
                }
                return W3.o.f6046a;
            case 2:
                AquaPlayerCard ath_par_lete = ((AquaPlayerSheet) this.f1601l).getAth_par_lete();
                if (ath_par_lete != null) {
                    ((i4.e) this.f1602m).invoke(Integer.valueOf(ath_par_lete.getCode_arg()), Integer.valueOf(AquaSportsDefaults.INSTANCE.getDefaultS_par_easonYear()));
                }
                return W3.o.f6046a;
            default:
                AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) this.f1601l;
                AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
                if (compe_par_tition != null) {
                    ((i4.e) this.f1602m).invoke(Integer.valueOf(compe_par_tition.getCode_arg()), Integer.valueOf(AquaDisplayFormattersKt.selectNewesmeanstSeasonYear(aquaCompetitionBundle.getCamp_par_aigns())));
                }
                return W3.o.f6046a;
        }
    }

    public k(o oVar, s sVar) {
        this.f1600k = 0;
        this.f1602m = oVar;
        this.f1601l = sVar;
    }
}
