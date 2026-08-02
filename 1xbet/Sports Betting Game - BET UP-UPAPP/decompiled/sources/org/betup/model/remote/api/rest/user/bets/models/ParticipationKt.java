package org.betup.model.remote.api.rest.user.bets.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Participation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"toString", "", "Ljava/util/Date;", "format", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipationKt {
    public static final String toString(Date date, String format) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        String format2 = new SimpleDateFormat(format, Locale.getDefault()).format(date);
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
