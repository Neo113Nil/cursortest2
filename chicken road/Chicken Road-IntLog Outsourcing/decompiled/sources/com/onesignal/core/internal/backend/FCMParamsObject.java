package com.onesignal.core.internal.backend;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class FCMParamsObject {
    private final String apiKey;
    private final String appId;
    private final String projectId;

    public FCMParamsObject() {
        this(null, null, null, 7, null);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public FCMParamsObject(String str, String str2, String str3) {
        this.projectId = str;
        this.appId = str2;
        this.apiKey = str3;
    }

    public /* synthetic */ FCMParamsObject(String str, String str2, String str3, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
