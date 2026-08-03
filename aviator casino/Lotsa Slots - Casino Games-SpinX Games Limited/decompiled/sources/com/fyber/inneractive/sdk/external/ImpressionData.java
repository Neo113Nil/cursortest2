package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class ImpressionData {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.ImpressionData.Pricing f3646a = new com.fyber.inneractive.sdk.external.ImpressionData.Pricing();
    public com.fyber.inneractive.sdk.external.ImpressionData.Video b;
    public java.lang.String c;
    public java.lang.Long d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;

    public static class Pricing {

        /* renamed from: a, reason: collision with root package name */
        public double f3647a;
        public java.lang.String b;

        public java.lang.String getCurrency() {
            return this.b;
        }

        public double getValue() {
            return this.f3647a;
        }

        public void setValue(double d) {
            this.f3647a = d;
        }

        public java.lang.String toString() {
            return "Pricing{value=" + this.f3647a + ", currency='" + this.b + "'}";
        }
    }

    public static class Video {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3648a;
        public long b;

        public Video(boolean z, long j) {
            this.f3648a = z;
            this.b = j;
        }

        public long getDuration() {
            return this.b;
        }

        public boolean isSkippable() {
            return this.f3648a;
        }

        public java.lang.String toString() {
            return "Video{skippable=" + this.f3648a + ", duration=" + this.b + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
        }
    }

    public java.lang.String getAdvertiserDomain() {
        return this.i;
    }

    public java.lang.String getCampaignId() {
        return this.h;
    }

    public java.lang.String getCountry() {
        return this.e;
    }

    public java.lang.String getCreativeId() {
        return this.g;
    }

    public java.lang.Long getDemandId() {
        return this.d;
    }

    public java.lang.String getDemandSource() {
        return this.c;
    }

    public java.lang.String getImpressionId() {
        return this.f;
    }

    public com.fyber.inneractive.sdk.external.ImpressionData.Pricing getPricing() {
        return this.f3646a;
    }

    public com.fyber.inneractive.sdk.external.ImpressionData.Video getVideo() {
        return this.b;
    }

    public void setAdvertiserDomain(java.lang.String str) {
        this.i = str;
    }

    public void setCampaignId(java.lang.String str) {
        this.h = str;
    }

    public void setCountry(java.lang.String str) {
        this.e = str;
    }

    public void setCpmValue(java.lang.String str) {
        double d;
        try {
            d = java.lang.Double.parseDouble(str);
        } catch (java.lang.Exception unused) {
            d = 0.0d;
        }
        this.f3646a.f3647a = d;
    }

    public void setCreativeId(java.lang.String str) {
        this.g = str;
    }

    public void setCurrency(java.lang.String str) {
        this.f3646a.b = str;
    }

    public void setDemandId(java.lang.Long l) {
        this.d = l;
    }

    public void setDemandSource(java.lang.String str) {
        this.c = str;
    }

    public void setDuration(long j) {
        this.b.b = j;
    }

    public void setImpressionId(java.lang.String str) {
        this.f = str;
    }

    public void setPricing(com.fyber.inneractive.sdk.external.ImpressionData.Pricing pricing) {
        this.f3646a = pricing;
    }

    public void setVideo(com.fyber.inneractive.sdk.external.ImpressionData.Video video) {
        this.b = video;
    }

    public java.lang.String toString() {
        return "ImpressionData{pricing=" + this.f3646a + ", video=" + this.b + ", demandSource='" + this.c + "', country='" + this.e + "', impressionId='" + this.f + "', creativeId='" + this.g + "', campaignId='" + this.h + "', advertiserDomain='" + this.i + "'}";
    }
}
