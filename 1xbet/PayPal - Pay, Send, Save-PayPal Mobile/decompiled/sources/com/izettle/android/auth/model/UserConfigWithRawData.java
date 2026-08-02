package com.izettle.android.auth.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/izettle/android/auth/model/UserConfigWithRawData;", "", "Lcom/zettle/android/entities/UserConfig;", "userConfig", "", "raw", "<init>", "(Lcom/zettle/android/entities/UserConfig;Ljava/lang/String;)V", "component1", "()Lcom/zettle/android/entities/UserConfig;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/zettle/android/entities/UserConfig;Ljava/lang/String;)Lcom/izettle/android/auth/model/UserConfigWithRawData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRaw", "Lcom/zettle/android/entities/UserConfig;", "getUserConfig"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserConfigWithRawData {
    private final java.lang.String raw;
    private final com.zettle.android.entities.UserConfig userConfig;

    public UserConfigWithRawData(com.zettle.android.entities.UserConfig userConfig, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.userConfig = userConfig;
        this.raw = str;
    }

    public final com.zettle.android.entities.UserConfig getUserConfig() {
        return this.userConfig;
    }

    public final java.lang.String getRaw() {
        return this.raw;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.UserConfig userConfig = this.userConfig;
        java.lang.String str = this.raw;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserConfigWithRawData(userConfig=");
        sb.append(userConfig);
        sb.append(", raw=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.userConfig.hashCode() * 31) + this.raw.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.izettle.android.auth.model.UserConfigWithRawData)) {
            return false;
        }
        com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData = (com.izettle.android.auth.model.UserConfigWithRawData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userConfig, userConfigWithRawData.userConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.raw, userConfigWithRawData.raw);
    }

    public final com.izettle.android.auth.model.UserConfigWithRawData copy(com.zettle.android.entities.UserConfig userConfig, java.lang.String raw) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raw, "");
        return new com.izettle.android.auth.model.UserConfigWithRawData(userConfig, raw);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRaw() {
        return this.raw;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.UserConfig getUserConfig() {
        return this.userConfig;
    }

    public static /* synthetic */ com.izettle.android.auth.model.UserConfigWithRawData copy$default(com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData, com.zettle.android.entities.UserConfig userConfig, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userConfig = userConfigWithRawData.userConfig;
        }
        if ((i & 2) != 0) {
            str = userConfigWithRawData.raw;
        }
        return userConfigWithRawData.copy(userConfig, str);
    }
}
