package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InitRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f11650a;
    private final List<IronSourceAds.AdFormat> b;
    private final LogLevel c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f11651a;
        private List<? extends IronSourceAds.AdFormat> b;
        private LogLevel c;

        public Builder(String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f11651a = appKey;
        }

        public final InitRequest build() {
            String str = this.f11651a;
            List<? extends IronSourceAds.AdFormat> list = this.b;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            LogLevel logLevel = this.c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        public final String getAppKey() {
            return this.f11651a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    public final String getAppKey() {
        return this.f11650a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.b;
    }

    public final LogLevel getLogLevel() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f11650a = str;
        this.b = list;
        this.c = logLevel;
    }
}
