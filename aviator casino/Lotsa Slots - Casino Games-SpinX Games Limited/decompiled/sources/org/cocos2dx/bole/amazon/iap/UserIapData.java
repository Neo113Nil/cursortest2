package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class UserIapData {
    private final java.lang.String amazonMarketplace;
    private final java.lang.String amazonUserId;
    private volatile int remainingOranges = 0;
    private volatile int consumedOranges = 0;

    public java.lang.String getAmazonUserId() {
        return this.amazonUserId;
    }

    public java.lang.String getAmazonMarketplace() {
        return this.amazonMarketplace;
    }

    public void setRemainingOranges(int i) {
        this.remainingOranges = i;
    }

    public void setConsumedOranges(int i) {
        this.consumedOranges = i;
    }

    public int getRemainingOranges() {
        return this.remainingOranges;
    }

    public int getConsumedOranges() {
        return this.consumedOranges;
    }

    public UserIapData(java.lang.String str, java.lang.String str2) {
        this.amazonUserId = str;
        this.amazonMarketplace = str2;
    }
}
