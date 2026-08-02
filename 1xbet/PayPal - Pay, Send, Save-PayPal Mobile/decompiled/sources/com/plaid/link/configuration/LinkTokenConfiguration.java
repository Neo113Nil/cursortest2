package com.plaid.link.configuration;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001'B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/plaid/link/configuration/LinkTokenConfiguration;", "Landroid/os/Parcelable;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/plaid/link/configuration/LinkLogLevel;", "logLevel", "", "noLoadingState", "Lcom/plaid/internal/M0;", "embeddedSessionInfo", "<init>", "(Ljava/lang/String;Lcom/plaid/link/configuration/LinkLogLevel;ZLcom/plaid/internal/M0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getToken", "Lcom/plaid/link/configuration/LinkLogLevel;", "getLogLevel", "()Lcom/plaid/link/configuration/LinkLogLevel;", "Z", "getNoLoadingState", "()Z", "Lcom/plaid/internal/M0;", "getEmbeddedSessionInfo", "()Lcom/plaid/internal/M0;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkTokenConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.link.configuration.LinkTokenConfiguration> CREATOR = new com.plaid.link.configuration.LinkTokenConfiguration.Creator();
    private final com.plaid.internal.M0 embeddedSessionInfo;
    private final com.plaid.link.configuration.LinkLogLevel logLevel;
    private final boolean noLoadingState;
    private final java.lang.String token;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'"}, d2 = {"Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "<init>", "()V", "Lcom/plaid/link/configuration/LinkLogLevel;", "logLevel", "(Lcom/plaid/link/configuration/LinkLogLevel;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "(Ljava/lang/String;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "noLoadingState", "(Z)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "Lcom/plaid/internal/M0;", "embeddedSessionInfo", "(Lcom/plaid/internal/M0;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "build", "()Lcom/plaid/link/configuration/LinkTokenConfiguration;", "<set-?>", "Lcom/plaid/link/configuration/LinkLogLevel;", "getLogLevel", "()Lcom/plaid/link/configuration/LinkLogLevel;", "setLogLevel", "(Lcom/plaid/link/configuration/LinkLogLevel;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "Z", "getNoLoadingState", "()Z", "setNoLoadingState", "(Z)V", "Lcom/plaid/internal/M0;", "getEmbeddedSessionInfo", "()Lcom/plaid/internal/M0;", "setEmbeddedSessionInfo", "(Lcom/plaid/internal/M0;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private com.plaid.internal.M0 embeddedSessionInfo;
        private com.plaid.link.configuration.LinkLogLevel logLevel = com.plaid.link.configuration.LinkLogLevel.ASSERT;
        private boolean noLoadingState;
        private java.lang.String token;

        public final com.plaid.link.configuration.LinkTokenConfiguration build() {
            com.plaid.internal.M0 m0 = this.embeddedSessionInfo;
            if (m0 != null) {
                return new com.plaid.link.configuration.LinkTokenConfiguration(m0.f5839a, this.logLevel, this.noLoadingState, m0, null);
            }
            java.lang.String str = this.token;
            if (str == null) {
                throw com.plaid.link.exception.LinkConfigurationMissingTokenException.INSTANCE;
            }
            if (str.length() != 0) {
                return new com.plaid.link.configuration.LinkTokenConfiguration(str, this.logLevel, this.noLoadingState, null, 8, null);
            }
            throw com.plaid.link.exception.LinkConfigurationMissingTokenException.INSTANCE;
        }

        public final com.plaid.link.configuration.LinkTokenConfiguration.Builder embeddedSessionInfo(com.plaid.internal.M0 embeddedSessionInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedSessionInfo, "");
            this.embeddedSessionInfo = embeddedSessionInfo;
            return this;
        }

        public final com.plaid.internal.M0 getEmbeddedSessionInfo() {
            return this.embeddedSessionInfo;
        }

        public final com.plaid.link.configuration.LinkLogLevel getLogLevel() {
            return this.logLevel;
        }

        public final boolean getNoLoadingState() {
            return this.noLoadingState;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final com.plaid.link.configuration.LinkTokenConfiguration.Builder logLevel(com.plaid.link.configuration.LinkLogLevel logLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "");
            this.logLevel = logLevel;
            return this;
        }

        public final com.plaid.link.configuration.LinkTokenConfiguration.Builder noLoadingState(boolean noLoadingState) {
            this.noLoadingState = noLoadingState;
            return this;
        }

        public final /* synthetic */ void setEmbeddedSessionInfo(com.plaid.internal.M0 m0) {
            this.embeddedSessionInfo = m0;
        }

        public final /* synthetic */ void setLogLevel(com.plaid.link.configuration.LinkLogLevel linkLogLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkLogLevel, "");
            this.logLevel = linkLogLevel;
        }

        public final /* synthetic */ void setNoLoadingState(boolean z) {
            this.noLoadingState = z;
        }

        public final /* synthetic */ void setToken(java.lang.String str) {
            this.token = str;
        }

        public final com.plaid.link.configuration.LinkTokenConfiguration.Builder token(java.lang.String token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            this.token = token;
            return this;
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.configuration.LinkTokenConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.configuration.LinkTokenConfiguration createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.configuration.LinkTokenConfiguration(parcel.readString(), com.plaid.link.configuration.LinkLogLevel.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.plaid.internal.M0.CREATOR.createFromParcel(parcel), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.configuration.LinkTokenConfiguration[] newArray(int i) {
            return new com.plaid.link.configuration.LinkTokenConfiguration[i];
        }
    }

    public /* synthetic */ LinkTokenConfiguration(java.lang.String str, com.plaid.link.configuration.LinkLogLevel linkLogLevel, boolean z, com.plaid.internal.M0 m0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkLogLevel, z, m0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.link.configuration.LinkTokenConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration = (com.plaid.link.configuration.LinkTokenConfiguration) other;
        return this.logLevel == linkTokenConfiguration.logLevel && kotlin.jvm.internal.Intrinsics.areEqual(this.token, linkTokenConfiguration.token) && this.noLoadingState == linkTokenConfiguration.noLoadingState && kotlin.jvm.internal.Intrinsics.areEqual(this.embeddedSessionInfo, linkTokenConfiguration.embeddedSessionInfo);
    }

    public final com.plaid.internal.M0 getEmbeddedSessionInfo() {
        return this.embeddedSessionInfo;
    }

    public final com.plaid.link.configuration.LinkLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final boolean getNoLoadingState() {
        return this.noLoadingState;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final int hashCode() {
        java.lang.String str = this.token;
        com.plaid.link.configuration.LinkLogLevel linkLogLevel = this.logLevel;
        boolean z = this.noLoadingState;
        return java.util.Objects.hash(str, linkLogLevel, java.lang.Boolean.valueOf(z), this.embeddedSessionInfo);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        com.plaid.link.configuration.LinkLogLevel linkLogLevel = this.logLevel;
        boolean z = this.noLoadingState;
        com.plaid.internal.M0 m0 = this.embeddedSessionInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkTokenConfiguration(token=");
        sb.append(str);
        sb.append(", logLevel=");
        sb.append(linkLogLevel);
        sb.append(", noLoadingState=");
        sb.append(z);
        sb.append(", embeddedSessionInfo=");
        sb.append(m0);
        sb.append(")");
        return sb.toString();
    }

    private LinkTokenConfiguration(java.lang.String str, com.plaid.link.configuration.LinkLogLevel linkLogLevel, boolean z, com.plaid.internal.M0 m0) {
        this.token = str;
        this.logLevel = linkLogLevel;
        this.noLoadingState = z;
        this.embeddedSessionInfo = m0;
    }

    public /* synthetic */ LinkTokenConfiguration(java.lang.String str, com.plaid.link.configuration.LinkLogLevel linkLogLevel, boolean z, com.plaid.internal.M0 m0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.plaid.link.configuration.LinkLogLevel.ASSERT : linkLogLevel, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : m0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.token);
        parcel.writeString(this.logLevel.name());
        parcel.writeInt(this.noLoadingState ? 1 : 0);
        com.plaid.internal.M0 m0 = this.embeddedSessionInfo;
        if (m0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m0.writeToParcel(parcel, flags);
        }
    }
}
