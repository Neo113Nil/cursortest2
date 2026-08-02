package org.betup.services.push;

import org.betup.model.local.entity.Event;

/* loaded from: classes2.dex */
public interface PushStorageProvider {
    int getEventsCount();

    void readAll(Integer userId);

    void readEvent(String uuid);

    void refreshEventCount(Integer userId);

    void refreshEventCountByUUID(String uuid);

    void saveEvent(Event event);
}
