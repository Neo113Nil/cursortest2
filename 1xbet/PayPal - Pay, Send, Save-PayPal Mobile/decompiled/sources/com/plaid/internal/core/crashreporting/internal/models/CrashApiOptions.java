package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "", "", "projectId", "", com.visa.cbp.sdk.facade.data.Constants.API_KEY, "release", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getApiKey", com.visa.cbp.getEncExpo.warmup, "getProjectId", "getRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CrashApiOptions {

    @com.google.gson.annotations.SerializedName(com.visa.cbp.sdk.facade.data.Constants.API_KEY)
    public java.lang.String apiKey;

    @com.google.gson.annotations.SerializedName("projectName")
    public int projectId;

    @com.google.gson.annotations.SerializedName("release")
    public java.lang.String release;

    public CrashApiOptions(int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.projectId = i;
        this.apiKey = str;
        this.release = str2;
    }

    public final java.lang.String getApiKey() {
        return this.apiKey;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final java.lang.String getRelease() {
        return this.release;
    }

    public final int hashCode() {
        int a2 = com.plaid.internal.C0679x.a(this.apiKey, java.lang.Integer.hashCode(this.projectId) * 31, 31);
        java.lang.String str = this.release;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ CrashApiOptions(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }

    public /* synthetic */ CrashApiOptions() {
    }

    public final java.lang.String toString() {
        int i = this.projectId;
        java.lang.String str = this.apiKey;
        java.lang.String str2 = this.release;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CrashApiOptions(projectId=");
        sb.append(i);
        sb.append(", apiKey=");
        sb.append(str);
        sb.append(", release=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions)) {
            return false;
        }
        com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = (com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions) other;
        return this.projectId == crashApiOptions.projectId && kotlin.jvm.internal.Intrinsics.areEqual(this.apiKey, crashApiOptions.apiKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.release, crashApiOptions.release);
    }

    public final com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions copy(int projectId, java.lang.String apiKey, java.lang.String release) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiKey, "");
        return new com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions(projectId, apiKey, release);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRelease() {
        return this.release;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component1, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    public static /* synthetic */ com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions copy$default(com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = crashApiOptions.projectId;
        }
        if ((i2 & 2) != 0) {
            str = crashApiOptions.apiKey;
        }
        if ((i2 & 4) != 0) {
            str2 = crashApiOptions.release;
        }
        return crashApiOptions.copy(i, str, str2);
    }
}
