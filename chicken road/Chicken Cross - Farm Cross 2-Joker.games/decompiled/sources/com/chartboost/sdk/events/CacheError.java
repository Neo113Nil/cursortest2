package com.chartboost.sdk.events;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/sdk/events/CacheError;", "Lcom/chartboost/sdk/events/CBError;", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "Lcom/chartboost/sdk/events/CacheError$Code;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/chartboost/sdk/events/CacheError$Code;Ljava/lang/Exception;)V", "getCode", "()Lcom/chartboost/sdk/events/CacheError$Code;", "getException", "()Ljava/lang/Exception;", InAppPurchaseConstants.METHOD_TO_STRING, "", "Code", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheError implements CBError {
    private final Code code;
    private final Exception exception;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/chartboost/sdk/events/CacheError$Code;", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INTERNAL", "INTERNET_UNAVAILABLE", "NETWORK_FAILURE", "NO_AD_FOUND", "SESSION_NOT_STARTED", "SERVER_ERROR", "ASSET_DOWNLOAD_FAILURE", "BANNER_DISABLED", "BANNER_VIEW_IS_DETACHED", "TIMEOUT", "DISABLED", "LOAD_IN_PROGRESS", "ALREADY_LOADED", "INVALID_PLACEMENT", "RATE_LIMITED", "INVALID_REQUEST", "INVALID_RESPONSE", "INVALID_ADM", "NO_STORAGE", "NO_MRAID_JS", "INVALID_HTML", "WEBVIEW_FAILED", "WEBVIEW_CRASHED", "INVALID_ASSET_URL", "VAST_ERROR", "UNSUPPORTED_CODEC", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Code {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Code[] $VALUES;
        private final int errorCode;
        public static final Code INTERNAL = new Code("INTERNAL", 0, 0);
        public static final Code INTERNET_UNAVAILABLE = new Code("INTERNET_UNAVAILABLE", 1, 1);
        public static final Code NETWORK_FAILURE = new Code("NETWORK_FAILURE", 2, 5);
        public static final Code NO_AD_FOUND = new Code("NO_AD_FOUND", 3, 6);
        public static final Code SESSION_NOT_STARTED = new Code("SESSION_NOT_STARTED", 4, 7);
        public static final Code SERVER_ERROR = new Code("SERVER_ERROR", 5, 8);
        public static final Code ASSET_DOWNLOAD_FAILURE = new Code("ASSET_DOWNLOAD_FAILURE", 6, 16);
        public static final Code BANNER_DISABLED = new Code("BANNER_DISABLED", 7, 36);
        public static final Code BANNER_VIEW_IS_DETACHED = new Code("BANNER_VIEW_IS_DETACHED", 8, 37);
        public static final Code TIMEOUT = new Code("TIMEOUT", 9, 38);
        public static final Code DISABLED = new Code("DISABLED", 10, 39);
        public static final Code LOAD_IN_PROGRESS = new Code("LOAD_IN_PROGRESS", 11, 40);
        public static final Code ALREADY_LOADED = new Code("ALREADY_LOADED", 12, 41);
        public static final Code INVALID_PLACEMENT = new Code("INVALID_PLACEMENT", 13, 42);
        public static final Code RATE_LIMITED = new Code("RATE_LIMITED", 14, 43);
        public static final Code INVALID_REQUEST = new Code("INVALID_REQUEST", 15, 44);
        public static final Code INVALID_RESPONSE = new Code("INVALID_RESPONSE", 16, 45);
        public static final Code INVALID_ADM = new Code("INVALID_ADM", 17, 46);
        public static final Code NO_STORAGE = new Code("NO_STORAGE", 18, 47);
        public static final Code NO_MRAID_JS = new Code("NO_MRAID_JS", 19, 48);
        public static final Code INVALID_HTML = new Code("INVALID_HTML", 20, 49);
        public static final Code WEBVIEW_FAILED = new Code("WEBVIEW_FAILED", 21, 50);
        public static final Code WEBVIEW_CRASHED = new Code("WEBVIEW_CRASHED", 22, 51);
        public static final Code INVALID_ASSET_URL = new Code("INVALID_ASSET_URL", 23, 52);
        public static final Code VAST_ERROR = new Code("VAST_ERROR", 24, 53);
        public static final Code UNSUPPORTED_CODEC = new Code("UNSUPPORTED_CODEC", 25, 54);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INTERNAL, INTERNET_UNAVAILABLE, NETWORK_FAILURE, NO_AD_FOUND, SESSION_NOT_STARTED, SERVER_ERROR, ASSET_DOWNLOAD_FAILURE, BANNER_DISABLED, BANNER_VIEW_IS_DETACHED, TIMEOUT, DISABLED, LOAD_IN_PROGRESS, ALREADY_LOADED, INVALID_PLACEMENT, RATE_LIMITED, INVALID_REQUEST, INVALID_RESPONSE, INVALID_ADM, NO_STORAGE, NO_MRAID_JS, INVALID_HTML, WEBVIEW_FAILED, WEBVIEW_CRASHED, INVALID_ASSET_URL, VAST_ERROR, UNSUPPORTED_CODEC};
        }

        static {
            Code[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Code(String str, int i, int i2) {
            this.errorCode = i2;
        }

        public static EnumEntries<Code> getEntries() {
            return $ENTRIES;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public CacheError(Code code, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.exception = exc;
    }

    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    public Exception getException() {
        return this.exception;
    }

    public String toString() {
        return "Chartboost CacheError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ CacheError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
