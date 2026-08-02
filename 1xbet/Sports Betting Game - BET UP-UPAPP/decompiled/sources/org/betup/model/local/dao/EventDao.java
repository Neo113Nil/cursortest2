package org.betup.model.local.dao;

import java.util.List;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.EventParam;

/* loaded from: classes2.dex */
public interface EventDao {
    void clearEventParams(int userId);

    void clearEvents(int userId);

    Event getEventById(int id);

    List<EventParam> getEventParamsForEvent(long eventId);

    List<Event> getEvents(int limit, int offset, int userId);

    int getNewCountById(boolean value, int userId);

    int getNewCountByUUID(boolean value, String uuid);

    long insertEvent(Event event);

    long[] insertEventParams(EventParam... eventParams);

    void readAllNew(int userId);

    void readEvent(String uuid);
}
