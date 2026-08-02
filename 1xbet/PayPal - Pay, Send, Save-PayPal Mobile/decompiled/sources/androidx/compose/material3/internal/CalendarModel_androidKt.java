package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "locale", "Landroidx/compose/material3/internal/CalendarModel;", "createCalendarModel", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/CalendarModel;", "", "utcTimeMillis", "", "skeleton", "", "", com.datadog.trace.api.DDSpanTypes.CACHE, "formatWithSkeleton", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CalendarModel_androidKt {
    public static final androidx.compose.material3.internal.CalendarModel createCalendarModel(java.util.Locale locale) {
        return new androidx.compose.material3.internal.CalendarModelImpl(locale);
    }

    public static final java.lang.String formatWithSkeleton(long j, java.lang.String str, java.util.Locale locale, java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("S:");
        sb.append(str);
        sb.append(locale.toLanguageTag());
        java.lang.String obj = sb.toString();
        java.lang.Object obj2 = map.get(obj);
        java.lang.Object obj3 = obj2;
        if (obj2 == null) {
            android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.GMT_ZONE);
            map.put(obj, instanceForSkeleton);
            obj3 = instanceForSkeleton;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
        return ((android.icu.text.DateFormat) obj3).format(new java.util.Date(j));
    }
}
