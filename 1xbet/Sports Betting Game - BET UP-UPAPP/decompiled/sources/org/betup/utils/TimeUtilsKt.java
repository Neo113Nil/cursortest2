package org.betup.utils;

import androidx.compose.material3.internal.CalendarModelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a \u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0007\u001a\u00020\u00012\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"ONE_SECOND", "", "ONE_MIN", "ONE_HOUR", "ONE_DAY", "convertMillsInTextDays", "", "milliseconds", "concatResult", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeUtilsKt {
    public static final long ONE_DAY = 24;
    public static final long ONE_HOUR = 60;
    public static final long ONE_MIN = 60;
    public static final long ONE_SECOND = 1000;

    public static final String convertMillsInTextDays(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / CalendarModelKt.MillisecondsIn24Hours;
        if (j2 != 0) {
            sb.append(j2 + "d. ");
        }
        StringBuilder concatResult = concatResult((j / 60000) % 60, concatResult((j / 3600000) % 24, sb));
        long j3 = (j / 1000) % 60;
        if (j3 < 10) {
            concatResult.append("0" + j3);
        } else {
            concatResult.append(String.valueOf(j3));
        }
        String sb2 = concatResult.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final StringBuilder concatResult(long j, StringBuilder sb) {
        if (j == 0) {
            StringBuilder append = sb.append("00:");
            Intrinsics.checkNotNull(append);
            return append;
        }
        if (j < 10) {
            StringBuilder append2 = sb.append("0" + j + ":");
            Intrinsics.checkNotNull(append2);
            return append2;
        }
        StringBuilder append3 = sb.append(j + ":");
        Intrinsics.checkNotNull(append3);
        return append3;
    }
}
