package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public class xi {
    private static final int DEFAULT_MAX_END_CARDS = 2;
    private String admtag;
    private String campaign_id;
    private String endcard;
    private Integer maxEndCards = 2;
    private String partnerName;
    private String partnerResponse;
    private boolean recordHops;
    private boolean skipFailed;
    private Long skipafter;
    private Long skipmin;
    private String ttl_sec;
    private String vasttag;

    public String getAdmTag() {
        return this.admtag;
    }

    public String getCampaignId() {
        return this.campaign_id;
    }

    public String getEndCard() {
        return this.endcard;
    }

    public Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    public String getPartnerName() {
        return this.partnerName;
    }

    public String getPartnerResponse() {
        return this.partnerResponse;
    }

    public Long getSkipafter() {
        return this.skipafter;
    }

    public Long getSkipmin() {
        return this.skipmin;
    }

    public String getTtlSec() {
        return this.ttl_sec;
    }

    public String getVastTag() {
        return this.vasttag;
    }

    public boolean isRecordHops() {
        return this.recordHops;
    }

    public boolean isSkipFailed() {
        return this.skipFailed;
    }
}
