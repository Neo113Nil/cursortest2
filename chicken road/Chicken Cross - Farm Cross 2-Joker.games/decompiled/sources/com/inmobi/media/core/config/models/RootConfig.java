package com.inmobi.media.core.config.models;

import com.inmobi.media.AbstractC3787i7;
import com.inmobi.media.C3659dk;
import com.inmobi.media.Fa;
import com.inmobi.media.Tf;
import com.inmobi.media.Vf;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0005=>?@AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\tJ\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\"J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b-\u0010+R\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106¨\u0006B"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "", "isValid", "()Z", "type", "", "getExpiryInMillisForType", "(Ljava/lang/String;)J", "", "getMaxRetries", "()I", "getRetryInterval", "isMonetizationDisabled", "", "getIPAddrTPSupport", "()Ljava/util/List;", "isReducedUserAgentInfoEnabled", "shouldTransmitRequest", "isPreInitEnabled", "Lcom/inmobi/media/core/config/models/RootConfig$PreInit;", "getPreInit", "()Lcom/inmobi/media/core/config/models/RootConfig$PreInit;", "isAccountIdResetEnabled", "getUrlForType", "(Ljava/lang/String;)Ljava/lang/String;", "maxRetries", "", "setMaxRetries", "(I)V", "retryInterval", "setRetryInterval", "Lcom/inmobi/media/Fa;", "includeIds", "setIncludeIdParams", "(Lcom/inmobi/media/Fa;)V", "enabled", "setPreInitEnabled", "(Z)V", "setAccountIdResetEnabled", "setReducedUserAgentInfoEnabled", "I", "Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "gdpr", "Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "Lcom/inmobi/media/core/config/models/RootConfig$ComponentConfig;", "components", "Ljava/util/List;", "monetizationDisabled", "Z", "ipAddrTPSupport", "preInit", "Lcom/inmobi/media/core/config/models/RootConfig$PreInit;", "accountIdResetEnabled", "reducedUserAgentInfoEnabled", k.M, "com/inmobi/media/dk", "ComponentConfig", "GDPR", "PreInit", "InitTelemetry", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RootConfig extends Config {
    public static final C3659dk Companion = new C3659dk();
    public static final boolean DEFAULT_ACCOUNT_ID_RESET_ENABLED = false;
    public static final long DEFAULT_EXPIRY_IN_SEC = 86400;
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final boolean DEFAULT_PRE_INIT_APP_LAUNCH_TIME_ENABLED = false;
    public static final boolean DEFAULT_PRE_INIT_ENABLED = false;
    public static final boolean DEFAULT_PRE_INIT_TELEMETRY_ENABLED = false;
    public static final int DEFAULT_PRE_INIT_TELEMETRY_MAX_RETRIES = 1;
    public static final long DEFAULT_PRE_INIT_TELEMETRY_RETRY_INTERVAL_SEC = 60;
    public static final long DEFAULT_PRE_INIT_TELEMETRY_TIMEOUT_SEC = 60;
    public static final String DEFAULT_PRE_INIT_TELEMETRY_URL = "https://telemetry.sdk.inmobi.com/metrics";
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    private boolean accountIdResetEnabled;
    private boolean monetizationDisabled;
    private boolean reducedUserAgentInfoEnabled;
    private int maxRetries = 3;
    private int retryInterval = 60;

    @Vf
    private GDPR gdpr = new GDPR();
    private final List<ComponentConfig> components = CollectionsKt.emptyList();
    private final List<String> ipAddrTPSupport = CollectionsKt.emptyList();
    private PreInit preInit = new PreInit();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$ComponentConfig;", "", "<init>", "()V", "type", "", "expiry", "", "url", "getType", "getExpiry", "getUrl", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComponentConfig {
        private String type = "";
        private long expiry = Long.MAX_VALUE;
        private String url = "";

        public final long getExpiry() {
            return this.expiry;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return StringsKt.trim((CharSequence) getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 86400 && !AbstractC3787i7.a(this.url);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "", "<init>", "()V", "transmitRequest", "", "Ljava/lang/Boolean;", "getTransmitRequest", "()Ljava/lang/Boolean;", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GDPR {

        @Vf
        private Boolean transmitRequest = Boolean.TRUE;

        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$InitTelemetry;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "telemetryUrl", "", "maxRetries", "", "retryInterval", "", "timeout", "getTelemetryUrl", "getMaxRetries", "getRetryInterval", "getTimeout", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitTelemetry {
        private boolean enabled;
        private String telemetryUrl = "https://telemetry.sdk.inmobi.com/metrics";
        private int maxRetries = 1;
        private long retryInterval = 60;
        private long timeout = 60;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxRetries() {
            int i = this.maxRetries;
            if (i >= 0) {
                return i;
            }
            return 1;
        }

        public final long getRetryInterval() {
            long j = this.retryInterval;
            if (j >= 0) {
                return j;
            }
            return 60L;
        }

        public final String getTelemetryUrl() {
            return AbstractC3787i7.a(this.telemetryUrl) ? "https://telemetry.sdk.inmobi.com/metrics" : this.telemetryUrl;
        }

        public final long getTimeout() {
            long j = this.timeout;
            if (j >= 0) {
                return j;
            }
            return 60L;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$PreInit;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "appLaunchTimeEnabled", "initTelemetry", "Lcom/inmobi/media/core/config/models/RootConfig$InitTelemetry;", "isEnabled", "isAppLaunchTimeEnabled", "getInitTelemetry", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreInit {
        private boolean appLaunchTimeEnabled;
        private boolean enabled;
        private InitTelemetry initTelemetry = new InitTelemetry();

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final InitTelemetry getInitTelemetry() {
            return this.initTelemetry;
        }

        /* renamed from: isAppLaunchTimeEnabled, reason: from getter */
        public final boolean getAppLaunchTimeEnabled() {
            return this.appLaunchTimeEnabled;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }
    }

    public final long getExpiryInMillisForType(String type) {
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.components.iterator();
        while (true) {
            if (!it.hasNext()) {
                IntRange intRange = Tf.f6872a;
                j = 1000;
                j2 = 86400;
                break;
            }
            ComponentConfig componentConfig = (ComponentConfig) it.next();
            if (Intrinsics.areEqual(type, componentConfig.getType())) {
                j = componentConfig.getExpiry();
                IntRange intRange2 = Tf.f6872a;
                j2 = 1000;
                break;
            }
        }
        return j * j2;
    }

    public final List<String> getIPAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final PreInit getPreInit() {
        PreInit preInit = this.preInit;
        return preInit == null ? new PreInit() : preInit;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "root";
    }

    public final String getUrlForType(String type) {
        Object obj;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.components.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ComponentConfig) obj).getType(), type)) {
                break;
            }
        }
        ComponentConfig componentConfig = (ComponentConfig) obj;
        String url = componentConfig != null ? componentConfig.getUrl() : null;
        return (url == null || url.length() == 0) ? DEFAULT_FALLBACK_URL : url;
    }

    /* renamed from: isAccountIdResetEnabled, reason: from getter */
    public final boolean getAccountIdResetEnabled() {
        return this.accountIdResetEnabled;
    }

    /* renamed from: isMonetizationDisabled, reason: from getter */
    public final boolean getMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    public final boolean isPreInitEnabled() {
        PreInit preInit = this.preInit;
        if (preInit != null) {
            return preInit.isEnabled();
        }
        return false;
    }

    /* renamed from: isReducedUserAgentInfoEnabled, reason: from getter */
    public final boolean getReducedUserAgentInfoEnabled() {
        return this.reducedUserAgentInfoEnabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (this.maxRetries >= 0 && this.retryInterval >= 0) {
            Iterator<T> it = this.components.iterator();
            while (it.hasNext()) {
                if (!((ComponentConfig) it.next()).isValid()) {
                    return false;
                }
            }
            GDPR gdpr = this.gdpr;
            if (gdpr != null && gdpr.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAccountIdResetEnabled(boolean enabled) {
        this.accountIdResetEnabled = enabled;
    }

    public final void setIncludeIdParams(Fa includeIds) {
        Intrinsics.checkNotNullParameter(includeIds, "includeIds");
        setIncludeIds(includeIds);
    }

    public final void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public final void setPreInitEnabled(boolean enabled) {
        PreInit preInit = new PreInit();
        preInit.setEnabled(enabled);
        this.preInit = preInit;
    }

    public final void setReducedUserAgentInfoEnabled(boolean enabled) {
        this.reducedUserAgentInfoEnabled = enabled;
    }

    public final void setRetryInterval(int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        String str = "GDPR: " + (gdpr != null ? gdpr.getTransmitRequest() : null);
        GDPR gdpr2 = this.gdpr;
        if (gdpr2 == null || (transmitRequest = gdpr2.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }
}
