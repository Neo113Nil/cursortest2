package org.betup.model.remote.entity.country;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CountryModel implements Serializable {
    private int id;
    private String iso;

    @SerializedName("nice_name")
    private String name;
    private String photo;

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

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIso() {
        return this.iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public int hashCode() {
        return this.id;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CountryModel) && ((CountryModel) obj).getId() == this.id;
    }
}
