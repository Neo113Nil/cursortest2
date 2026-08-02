package org.betup.model.remote.entity.notifications;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.notifications.NotificationTask;
import org.betup.utils.DateHelper;

/* loaded from: classes2.dex */
public class NotificationMatch {
    private MatchDetailsDataModel match;
    private int matchId;
    private List<NotificationTask> tasks;
    private long timestamap;

    public NotificationMatch(List<NotificationTask> tasks, int matchId, MatchDetailsDataModel matchDetailsDataModel) {
        this.tasks = Collections.synchronizedList(new ArrayList(tasks));
        this.matchId = matchId;
        this.match = matchDetailsDataModel;
        this.timestamap = DateHelper.getTimestamp(matchDetailsDataModel.getDate());
        Log.d("NOTIFICATIONS", "MATCH IS NULL " + (this.match == null));
    }

    public NotificationMatch(NotificationMatch match) {
        this.tasks = Collections.synchronizedList(new ArrayList(match.getTasks()));
        this.matchId = match.getMatchId();
        this.match = match.getMatch();
        this.timestamap = match.getTimestamap();
    }

    public synchronized List<NotificationTask> getTasks() {
        return this.tasks;
    }

    public long getTimestamap() {
        return this.timestamap;
    }

    public boolean isFinished() {
        return this.match.getState() == MatchState.FINISHED;
    }

    public boolean equals(Object o) {
        return (o instanceof NotificationMatch) && ((NotificationMatch) o).getMatchId() == getMatchId();
    }

    public NotificationTask getTask(NotificationTask.TaskType taskType) {
        for (NotificationTask notificationTask : this.tasks) {
            if (notificationTask.getType() == taskType) {
                return notificationTask;
            }
        }
        return null;
    }

    public boolean isLive() {
        Log.d("NOTIFICATIONS", "GETTING LIVE : MATCH IS NULL " + (this.match == null));
        return this.match.getState() == MatchState.LIVE;
    }

    public boolean hasTask(NotificationTask.TaskType taskType) {
        Iterator<NotificationTask> it = this.tasks.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == taskType) {
                return true;
            }
        }
        return false;
    }

    public void addTask(NotificationTask task) {
        this.tasks.remove(task);
        this.tasks.add(task);
    }

    public void removeTask(NotificationTask.TaskType taskType) {
        Iterator<NotificationTask> it = this.tasks.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == taskType) {
                it.remove();
                return;
            }
        }
    }

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public float getScoreAway() {
        return this.match.getScoreAway().floatValue();
    }

    public float getScoreHome() {
        return this.match.getScoreHome().floatValue();
    }

    public int getMatchId() {
        return this.matchId;
    }

    public String getHomeTeamIcon() {
        return this.match.getHomeTeam().getPhotoUrl();
    }

    public String getAwayTeamIcon() {
        return this.match.getAwayTeam().getPhotoUrl();
    }

    public String getHomeTeam() {
        return this.match.getHomeTeam().getName();
    }

    public String getAwayTeam() {
        return this.match.getAwayTeam().getName();
    }

    public String getStartTime() {
        return this.match.getDate();
    }
}
