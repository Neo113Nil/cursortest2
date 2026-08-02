package com.google.firebase.heartbeatinfo;

/* loaded from: classes9.dex */
final class AutoValue_SdkHeartBeatResult extends com.google.firebase.heartbeatinfo.SdkHeartBeatResult {
    private final long millis;
    private final java.lang.String sdkName;

    AutoValue_SdkHeartBeatResult(java.lang.String str, long j) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sdkName");
        }
        this.sdkName = str;
        this.millis = j;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final java.lang.String getSdkName() {
        return this.sdkName;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final long getMillis() {
        return this.millis;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkHeartBeatResult{sdkName=");
        sb.append(this.sdkName);
        sb.append(", millis=");
        sb.append(this.millis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.heartbeatinfo.SdkHeartBeatResult)) {
            return false;
        }
        com.google.firebase.heartbeatinfo.SdkHeartBeatResult sdkHeartBeatResult = (com.google.firebase.heartbeatinfo.SdkHeartBeatResult) obj;
        return this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis();
    }

    public final int hashCode() {
        int hashCode = this.sdkName.hashCode();
        long j = this.millis;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
