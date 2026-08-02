package org.betup.model.remote.entity.messaging;

import java.util.Date;

/* loaded from: classes2.dex */
public class CorrespondentModel {
    private String avatarUrl;
    private int id;
    private boolean isFollowing;
    private String language;
    private Date lastVisitedAt;
    private String name;

    public CorrespondentModel() {
    }

    public CorrespondentModel(int id, String name, String language, String avatarUrl, Date lastVisitedAt) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.avatarUrl = avatarUrl;
        this.lastVisitedAt = lastVisitedAt;
        this.isFollowing = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Date getLastVisitedAt() {
        return this.lastVisitedAt;
    }

    public void setLastVisitedAt(Date lastVisitedAt) {
        this.lastVisitedAt = lastVisitedAt;
    }

    public boolean getIsFollowing() {
        return this.isFollowing;
    }

    public void setIsFollowing(boolean following) {
        this.isFollowing = following;
    }
}
