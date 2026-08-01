package com.chartboost.sdk.events;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/sdk/events/ShowError;", "Lcom/chartboost/sdk/events/CBError;", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "Lcom/chartboost/sdk/events/ShowError$Code;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/chartboost/sdk/events/ShowError$Code;Ljava/lang/Exception;)V", "getCode", "()Lcom/chartboost/sdk/events/ShowError$Code;", "getException", "()Ljava/lang/Exception;", InAppPurchaseConstants.METHOD_TO_STRING, "", "Code", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShowError implements CBError {
    private final Code code;
    private final Exception exception;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/chartboost/sdk/events/ShowError$Code;", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INTERNAL", "SESSION_NOT_STARTED", "AD_ALREADY_VISIBLE", "INTERNET_UNAVAILABLE", "PRESENTATION_FAILURE", "NO_CACHED_AD", "BANNER_DISABLED", "BANNER_VIEW_IS_DETACHED", "TIMEOUT", "AD_EXPIRED", "AD_INVALIDATED", "NO_CONTEXT", "VIDEO_PLAYBACK_ERROR", "INVALID_CLICKTHROUGH_URL", "ASSET_UNAVAILABLE", "DISABLED", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Code {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Code[] $VALUES;
        private final int errorCode;
        public static final Code INTERNAL = new Code("INTERNAL", 0, 0);
        public static final Code SESSION_NOT_STARTED = new Code("SESSION_NOT_STARTED", 1, 7);
        public static final Code AD_ALREADY_VISIBLE = new Code("AD_ALREADY_VISIBLE", 2, 8);
        public static final Code INTERNET_UNAVAILABLE = new Code("INTERNET_UNAVAILABLE", 3, 25);
        public static final Code PRESENTATION_FAILURE = new Code("PRESENTATION_FAILURE", 4, 33);
        public static final Code NO_CACHED_AD = new Code("NO_CACHED_AD", 5, 34);
        public static final Code BANNER_DISABLED = new Code("BANNER_DISABLED", 6, 36);
        public static final Code BANNER_VIEW_IS_DETACHED = new Code("BANNER_VIEW_IS_DETACHED", 7, 37);
        public static final Code TIMEOUT = new Code("TIMEOUT", 8, 38);
        public static final Code AD_EXPIRED = new Code("AD_EXPIRED", 9, 39);
        public static final Code AD_INVALIDATED = new Code("AD_INVALIDATED", 10, 40);
        public static final Code NO_CONTEXT = new Code("NO_CONTEXT", 11, 41);
        public static final Code VIDEO_PLAYBACK_ERROR = new Code("VIDEO_PLAYBACK_ERROR", 12, 42);
        public static final Code INVALID_CLICKTHROUGH_URL = new Code("INVALID_CLICKTHROUGH_URL", 13, 43);
        public static final Code ASSET_UNAVAILABLE = new Code("ASSET_UNAVAILABLE", 14, 44);
        public static final Code DISABLED = new Code("DISABLED", 15, 45);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INTERNAL, SESSION_NOT_STARTED, AD_ALREADY_VISIBLE, INTERNET_UNAVAILABLE, PRESENTATION_FAILURE, NO_CACHED_AD, BANNER_DISABLED, BANNER_VIEW_IS_DETACHED, TIMEOUT, AD_EXPIRED, AD_INVALIDATED, NO_CONTEXT, VIDEO_PLAYBACK_ERROR, INVALID_CLICKTHROUGH_URL, ASSET_UNAVAILABLE, DISABLED};
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

    public ShowError(Code code, Exception exc) {
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
        return "Chartboost ShowError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ ShowError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
