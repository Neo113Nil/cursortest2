package com.paypal.oslo.core.telemetry.analytics.schema.context.session;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "application")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR \u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u000bR \u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/ApplicationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "name", "version", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "sessionId", "visitorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/ApplicationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getVersion", "getVersion$annotations", "getPlatform", "getPlatform$annotations", "getSessionId", "getSessionId$annotations", "getVisitorId", "getVisitorId$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ApplicationContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final java.lang.String platform;
    private final java.lang.String sessionId;
    private final java.lang.String version;
    private final java.lang.String visitorId;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT)
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "session_id")
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "visitor_id")
    public static /* synthetic */ void getVisitorId$annotations() {
    }

    public ApplicationContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.version = str2;
        this.platform = str3;
        this.sessionId = str4;
        this.visitorId = str5;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getVisitorId() {
        return this.visitorId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.version;
        java.lang.String str3 = this.platform;
        java.lang.String str4 = this.sessionId;
        java.lang.String str5 = this.visitorId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationContext(name=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append(", platform=");
        sb.append(str3);
        sb.append(", sessionId=");
        sb.append(str4);
        sb.append(", visitorId=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.visitorId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext applicationContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, applicationContext.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, applicationContext.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, applicationContext.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, applicationContext.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.visitorId, applicationContext.visitorId);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext copy(java.lang.String name2, java.lang.String version, java.lang.String platform, java.lang.String sessionId, java.lang.String visitorId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitorId, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext(name2, version, platform, sessionId, visitorId);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getVisitorId() {
        return this.visitorId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPlatform() {
        return this.platform;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext applicationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = applicationContext.name;
        }
        if ((i & 2) != 0) {
            str2 = applicationContext.version;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = applicationContext.platform;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = applicationContext.sessionId;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = applicationContext.visitorId;
        }
        return applicationContext.copy(str, str6, str7, str8, str5);
    }
}
