package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes6.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
