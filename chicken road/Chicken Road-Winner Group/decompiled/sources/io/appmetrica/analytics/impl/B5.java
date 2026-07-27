package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class B5 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5753a = CollectionUtils.createSortedListWithoutRepetitions("id", "type", "report_request_parameters", "session_description");

    /* renamed from: b, reason: collision with root package name */
    public static final String f5754b = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "events", "session_id", "session_type");

    /* renamed from: c, reason: collision with root package name */
    public static final String f5755c = "(select count(events.id) from events where events.session_id = sessions.id) = 0 and cast(id as integer) < ?";
}
