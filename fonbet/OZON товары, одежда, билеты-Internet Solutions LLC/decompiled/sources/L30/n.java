package L30;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f16529a = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss.SSS", Locale.US);

    @NotNull
    public static Date a() {
        Date time = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    @NotNull
    public static String b() {
        String format = f16529a.format(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
