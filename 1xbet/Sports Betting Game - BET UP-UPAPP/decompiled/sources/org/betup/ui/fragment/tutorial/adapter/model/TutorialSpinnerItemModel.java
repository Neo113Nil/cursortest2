package org.betup.ui.fragment.tutorial.adapter.model;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class TutorialSpinnerItemModel implements Serializable {
    String pictureUrl;
    int sportPicture;
    int sportsId;
    String sportsName;

    public int getSportPicture() {
        return this.sportPicture;
    }

    public void setSportPicture(int sportPicture) {
        this.sportPicture = sportPicture;
    }

    public int getSportsId() {
        return this.sportsId;
    }

    public void setSportsId(int sportsId) {
        this.sportsId = sportsId;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getSportsName() {
        return this.sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }
}
