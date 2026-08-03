package com.helpshift.user;

/* loaded from: classes5.dex */
public class InternalIdentity {
    public final java.lang.String identityKey;
    public final java.lang.String identityValue;
    public final java.util.Map<java.lang.String, java.lang.String> metaData;

    public InternalIdentity(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        this.identityKey = com.helpshift.util.Utils.isEmpty(str) ? "" : str;
        this.identityValue = com.helpshift.util.Utils.isEmpty(str2) ? "" : str2;
        this.metaData = com.helpshift.util.Utils.isEmpty(map) ? new java.util.HashMap<>() : map;
    }
}
