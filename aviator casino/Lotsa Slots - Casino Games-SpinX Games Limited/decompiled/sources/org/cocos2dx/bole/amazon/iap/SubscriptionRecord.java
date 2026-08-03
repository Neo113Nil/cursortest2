package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class SubscriptionRecord {
    public static int TO_DATE_NOT_SET = -1;
    private java.lang.String amazonReceiptId;
    private java.lang.String amazonUserId;
    private long from;
    private java.lang.String sku;
    private long to = TO_DATE_NOT_SET;

    public long getFrom() {
        return this.from;
    }

    public void setFrom(long j) {
        this.from = j;
    }

    public long getTo() {
        return this.to;
    }

    public void setTo(long j) {
        this.to = j;
    }

    public boolean isActiveNow() {
        return ((long) TO_DATE_NOT_SET) == this.to;
    }

    public boolean isActiveForDate(long j) {
        return j >= this.from && (isActiveNow() || j <= this.to);
    }

    public java.lang.String getAmazonReceiptId() {
        return this.amazonReceiptId;
    }

    public void setAmazonReceiptId(java.lang.String str) {
        this.amazonReceiptId = str;
    }

    public java.lang.String getAmazonUserId() {
        return this.amazonUserId;
    }

    public void setAmazonUserId(java.lang.String str) {
        this.amazonUserId = str;
    }

    public void setSku(java.lang.String str) {
        this.sku = str;
    }

    public java.lang.String getSku() {
        return this.sku;
    }
}
