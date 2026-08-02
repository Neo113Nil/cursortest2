package org.betup.bus;

import org.betup.model.remote.entity.notifications.NotificationMatch;
import org.betup.model.remote.entity.notifications.NotificationTask;

/* loaded from: classes2.dex */
public class DisplayMatchInfoMessage {
    private int icon;
    private boolean isLive;
    private NotificationMatch match;
    private int matchId;
    private NotificationTask.TaskType taskType;
    private String text;
    private String title;

    public DisplayMatchInfoMessage(int matchId, NotificationTask.TaskType taskType, NotificationMatch notificationMatch, String title, String text, boolean isLive, int icon) {
        this.taskType = taskType;
        this.matchId = matchId;
        this.title = title;
        this.text = text;
        this.icon = icon;
        this.isLive = isLive;
        this.match = notificationMatch;
    }

    public NotificationTask.TaskType getTaskType() {
        return this.taskType;
    }

    public boolean isLive() {
        return this.isLive;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getMatchId() {
        return this.matchId;
    }

    public NotificationMatch getMatch() {
        return this.match;
    }
}
