package game.betting133.sports1xbet.aqua_viewmodels;

import X3.r;
import Z3.a;
import game.betting133.sports1xbet.aqua_network.AquaCampaignCard;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class AquaDisplayFormattersKt {
    private static final String EMPTY_VA_par_LUE_MARK = "--";
    private static final String WIRE_CLOC_par_K_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

    public static final List<Integer> collectSemeansasonYears(AquaCompetitionBundle aquaCompetitionBundle) {
        List<AquaCampaignCard> camp_par_aigns;
        ArrayList arrayList = new ArrayList();
        if (aquaCompetitionBundle != null && (camp_par_aigns = aquaCompetitionBundle.getCamp_par_aigns()) != null) {
            for (AquaCampaignCard aquaCampaignCard : camp_par_aigns) {
                if (aquaCampaignCard.getSt_par_amp() > 0) {
                    arrayList.add(Integer.valueOf(aquaCampaignCard.getSt_par_amp()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return AbstractC2346c.A(Integer.valueOf(previousCameanslendarYear()));
        }
        r.T(arrayList, a.f6355m);
        return arrayList;
    }

    private static final Date parseWimeansreClock(String str) {
        if (str == null) {
            return null;
        }
        String obj = AbstractC2227e.Q0(str).toString();
        if (obj.length() < 10) {
            return null;
        }
        try {
            return new SimpleDateFormat(WIRE_CLOC_par_K_PATTERN, Locale.US).parse(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    private static final int previousCameanslendarYear() {
        return Calendar.getInstance().get(1) - 1;
    }

    public static final String renderKicmeanskoffStamp(String str) {
        Date parseWimeansreClock = parseWimeansreClock(str);
        if (parseWimeansreClock == null) {
            return (str == null || AbstractC2227e.H0(str)) ? EMPTY_VA_par_LUE_MARK : str;
        }
        String format = new SimpleDateFormat("MMM d, yyyy - HH:mm", Locale.US).format(parseWimeansreClock);
        l.e("format(...)", format);
        return format;
    }

    public static final String renderKimeansckoffDay(String str) {
        Date parseWimeansreClock = parseWimeansreClock(str);
        if (parseWimeansreClock == null) {
            return "Unknown date";
        }
        String format = new SimpleDateFormat("EEEE, MMM d", Locale.US).format(parseWimeansreClock);
        l.e("format(...)", format);
        return format;
    }

    public static final String renderMemeanstricValue(Object obj) {
        if (obj == null) {
            return EMPTY_VA_par_LUE_MARK;
        }
        String obj2 = obj.toString();
        return obj2.length() == 0 ? EMPTY_VA_par_LUE_MARK : obj2;
    }

    public static final int selectNewesmeanstSeasonYear(List<AquaCampaignCard> list) {
        Integer num = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int st_par_amp = ((AquaCampaignCard) it.next()).getSt_par_amp();
                if (num == null || st_par_amp > num.intValue()) {
                    num = Integer.valueOf(st_par_amp);
                }
            }
        }
        return num != null ? num.intValue() : previousCameanslendarYear();
    }
}
