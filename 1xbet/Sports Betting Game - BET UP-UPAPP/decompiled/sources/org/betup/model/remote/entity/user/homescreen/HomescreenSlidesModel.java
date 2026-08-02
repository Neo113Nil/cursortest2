package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class HomescreenSlidesModel {

    @SerializedName("slides")
    @Expose
    private List<Slide> slides;

    public List<Slide> getSlides() {
        return this.slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }
}
