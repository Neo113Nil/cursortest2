package org.betup.model.remote.entity.level;

/* loaded from: classes2.dex */
public class LevelItem {
    private String photoUrl;
    private String title;

    public LevelItem() {
    }

    public LevelItem(String photoUrl, String title) {
        this.photoUrl = photoUrl;
        this.title = title;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
