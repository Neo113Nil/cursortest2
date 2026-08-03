package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0736u5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f6878a = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.createSortedListWithoutRepetitions("id", "type", "report_request_parameters", "session_description");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f6879b = java.lang.String.format(java.util.Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "events", "session_id", "session_type");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f6880c = "(select count(events.id) from events where events.session_id = sessions.id) = 0 and cast(id as integer) < ?";
}
