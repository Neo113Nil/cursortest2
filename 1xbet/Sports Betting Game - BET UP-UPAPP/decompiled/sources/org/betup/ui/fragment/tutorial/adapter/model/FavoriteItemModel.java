package org.betup.ui.fragment.tutorial.adapter.model;

import java.io.Serializable;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;
import org.betup.model.remote.entity.sports.SportsDataModel;
import org.betup.model.remote.entity.teams.TeamsDataModel;

/* loaded from: classes4.dex */
public class FavoriteItemModel implements Serializable {
    private int itemId;
    private String itemName;
    private String pictureUrl;
    private int preferencePicture;
    private String subIconUrl;

    public FavoriteItemModel() {
    }

    public FavoriteItemModel(TeamsDataModel data) {
        this.itemId = data.getId().intValue();
        this.pictureUrl = data.getPhotoURL();
        this.itemName = data.getName();
        this.subIconUrl = data.getSport().getPhotoUrl();
    }

    public FavoriteItemModel(LeaguesDataModel data) {
        this.itemId = data.getId().intValue();
        this.pictureUrl = data.getPhotoUrl();
        this.itemName = data.getName();
        this.subIconUrl = data.getSport().getPhotoUrl();
    }

    public FavoriteItemModel(SportsDataModel data) {
        this.itemId = data.getId().intValue();
        this.pictureUrl = data.getPhotoUrl();
        this.itemName = data.getName();
    }

    public int getPreferencePicture() {
        return this.preferencePicture;
    }

    public void setPreferencePicture(int preferencePicture) {
        this.preferencePicture = preferencePicture;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSubIconUrl() {
        return this.subIconUrl;
    }

    public void setSubIconUrl(String subIconUrl) {
        this.subIconUrl = subIconUrl;
    }
}
