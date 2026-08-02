package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum nn1 {
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY_PADDED('H'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY('k'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H_PADDED('I'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H('l'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_NANOS_OF_SECOND_PADDED('N'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_AM_PM('p'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_NUMERIC('z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_SHORT('Z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_SECONDS('s'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_MILLIS('Q'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_FULL('B'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT('b'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT_ALT('h'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_FULL('A'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_SHORT('a'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_CENTURY_PADDED('C'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_PADDED('Y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_YEAR_PADDED('j'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_PADDED('m'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH_PADDED('d'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH('e'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES('R'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_MONTH_DAY_YEAR('D'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_YEAR_MONTH_DAY('F'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_FULL('c');


    /* JADX INFO: renamed from: k */
    public static final Map f5461k;

    /* JADX INFO: renamed from: j */
    public final char f5463j;

    static {
        HashMap map = new HashMap();
        for (nn1 nn1Var : values()) {
            if (map.put(Character.valueOf(nn1Var.f5463j), nn1Var) != null) {
                C0270h1.m2191g("duplicate format character: ".concat(String.valueOf(nn1Var)));
                return;
            }
        }
        f5461k = Collections.unmodifiableMap(map);
    }

    nn1(char c) {
        this.f5463j = c;
    }
}
