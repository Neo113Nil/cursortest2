package game.betting133.sports1xbet.aqua_network;

import B1.h;
import G4.d;
import W3.e;
import java.util.Calendar;
import o4.AbstractC2227e;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class AquaSportsDefaults {
    private static final String SEALE_par_D_HOST = "3YYhKut5fkagezI0TKz56xNMsMhcTgeSSD0lg06RIsQ=";
    private static final String SEALE_par_D_KEY = "L3/xIijthKN16h/PYeMPa8W90tLKpN82liGZjuZ0p97glr/0IagCi4GO9yQ2lOc3z6URwRiGYrQONJ45ghmusg==";
    private static final String SEALE_par_D_ROOT = "jDytnEO0Cqrfw1O0eNJe2FkDbDo4ADyZAgm6wB/z72ShSHSap7hPZQ992FMifLsV";
    public static final AquaSportsDefaults INSTANCE = new AquaSportsDefaults();
    private static final e apiBa_par_seUrl$delegate = d.E(new h(15));
    private static final e apiS_par_ecret$delegate = d.E(new h(16));
    private static final e apiAut_par_hority$delegate = d.E(new h(17));
    public static final int $stable = 8;

    private AquaSportsDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String apiAut_par_hority_delegate$lambda$2() {
        return INSTANCE.revealmethod(SEALE_par_D_HOST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String apiBa_par_seUrl_delegate$lambda$0() {
        return INSTANCE.revealmethod(SEALE_par_D_ROOT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String apiS_par_ecret_delegate$lambda$1() {
        return INSTANCE.revealmethod(SEALE_par_D_KEY);
    }

    private final String revealmethod(String str) {
        String l5 = AbstractC2346c.l(str);
        if (l5 != null) {
            String obj = AbstractC2227e.Q0(l5).toString();
            if (obj.length() != 0) {
                return obj;
            }
        }
        return "";
    }

    public final String getApiAut_par_hority() {
        return (String) apiAut_par_hority$delegate.getValue();
    }

    public final String getApiBa_par_seUrl() {
        return (String) apiBa_par_seUrl$delegate.getValue();
    }

    public final String getApiS_par_ecret() {
        return (String) apiS_par_ecret$delegate.getValue();
    }

    public final int getDefaultS_par_easonYear() {
        return Calendar.getInstance().get(1) - 1;
    }
}
