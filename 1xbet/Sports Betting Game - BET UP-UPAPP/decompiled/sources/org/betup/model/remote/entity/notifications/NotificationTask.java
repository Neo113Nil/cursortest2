package org.betup.model.remote.entity.notifications;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class NotificationTask {

    @SerializedName("matchId")
    private int matchId;

    @SerializedName("score_away")
    private float scoreAway;

    @SerializedName("score_home")
    private float scoreHome;

    @SerializedName("timestamp")
    private long timestamp;

    @SerializedName("type")
    private TaskType type;

    public enum TaskType {
        MATCH_START("MATCH_START"),
        MATCH_FINISH("MATCH_FINISH"),
        SCORE_CHANGED("SCORE_CHANGED");

        private String name;

        TaskType(String name) {
            this.name = name;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public NotificationTask() {
    }

    public boolean equals(Object o) {
        if (!(o instanceof NotificationTask)) {
            return false;
        }
        NotificationTask notificationTask = (NotificationTask) o;
        return notificationTask.getType() == getType() && notificationTask.getMatchId() == getMatchId();
    }

    public NotificationTask(TaskType taskType, int matchId) {
        this.type = taskType;
        this.matchId = matchId;
        this.timestamp = 0L;
    }

    public NotificationTask(TaskType taskType, int matchId, long timestamp) {
        this.type = taskType;
        this.matchId = matchId;
        this.timestamp = timestamp;
    }

    public NotificationTask(TaskType taskType, int matchId, long timestamp, float scoreHome, float scoreAway) {
        this.type = taskType;
        this.matchId = matchId;
        this.timestamp = timestamp;
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
    }

    public float getScoreHome() {
        return this.scoreHome;
    }

    public void setScoreHome(float scoreHome) {
        this.scoreHome = scoreHome;
    }

    public float getScoreAway() {
        return this.scoreAway;
    }

    public void setScoreAway(float scoreAway) {
        this.scoreAway = scoreAway;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public TaskType getType() {
        return this.type;
    }

    public int getMatchId() {
        return this.matchId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
