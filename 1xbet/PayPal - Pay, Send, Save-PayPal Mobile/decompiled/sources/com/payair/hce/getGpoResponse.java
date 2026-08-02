package com.payair.hce;

/* loaded from: classes4.dex */
public final class getGpoResponse extends com.payair.hce.getCiacDecline {
    public final com.payair.hce.getCiacDeclineOnPpms<java.lang.String, com.payair.hce.getCiacDecline> valueOf = new com.payair.hce.getCiacDeclineOnPpms<>();

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.payair.hce.getGpoResponse) && ((com.payair.hce.getGpoResponse) obj).valueOf.equals(this.valueOf);
        }
        return true;
    }

    public final int hashCode() {
        return this.valueOf.hashCode();
    }
}
