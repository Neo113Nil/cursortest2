package org.betup.model.local.converter;

import org.betup.model.local.entity.NotificationType;

/* loaded from: classes2.dex */
public class NotificationTypeConverter {
    public NotificationType notificationTypeFromString(String type) {
        return NotificationType.fromString(type);
    }

    public String notificationTypeToString(NotificationType type) {
        return type.toString().toLowerCase();
    }
}
