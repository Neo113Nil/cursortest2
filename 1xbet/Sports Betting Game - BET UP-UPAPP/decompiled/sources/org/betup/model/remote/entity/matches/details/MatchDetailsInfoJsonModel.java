package org.betup.model.remote.entity.matches.details;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class MatchDetailsInfoJsonModel {

    @SerializedName("_VI")
    @Expose
    private String VI;

    @SerializedName("C")
    @Expose
    private Integer c;

    @SerializedName("D")
    @Expose
    private Boolean d;

    @SerializedName("F")
    @Expose
    private String f;

    @SerializedName("O")
    @Expose
    private Integer o;

    @SerializedName("P")
    @Expose
    private Integer p;

    @SerializedName("R")
    @Expose
    private Boolean r;

    @SerializedName(ExifInterface.LATITUDE_SOUTH)
    @Expose
    private String s;

    @SerializedName("T")
    @Expose
    private String t;

    public String getVI() {
        return this.VI;
    }

    public Integer getC() {
        return this.c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Boolean getD() {
        return this.d;
    }

    public void setD(Boolean d) {
        this.d = d;
    }

    public String getF() {
        return this.f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public Integer getO() {
        return this.o;
    }

    public void setO(Integer o) {
        this.o = o;
    }

    public Integer getP() {
        return this.p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Boolean getR() {
        return this.r;
    }

    public void setR(Boolean r) {
        this.r = r;
    }

    public String getS() {
        return this.s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getT() {
        return this.t;
    }

    public void setT(String t) {
        this.t = t;
    }
}
