package com.unity3d.ads.core.data.model.exception;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.UnityAdsErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: InitializationException.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0001'BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "throwable", "", "reason", "reasonDebug", IronSourceConstants.EVENTS_ERROR_CODE, "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "errorToken", "Lcom/google/protobuf/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Lcom/google/protobuf/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "getReasonDebug", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InitializationException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ErrorOuterClass.PublicErrorCode errorCode;
    private final ByteString errorToken;
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.message;
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            publicErrorCode = initializationException.errorCode;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        if ((i & 32) != 0) {
            byteString = initializationException.errorToken;
        }
        return initializationException.copy(str, th2, str4, str5, publicErrorCode2, byteString);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    /* renamed from: component5, reason: from getter */
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component6, reason: from getter */
    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    public final InitializationException copy(String message, Throwable throwable, String reason, String reasonDebug, ErrorOuterClass.PublicErrorCode errorCode, ByteString errorToken) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new InitializationException(message, throwable, reason, reasonDebug, errorCode, errorToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) other;
        return Intrinsics.areEqual(this.message, initializationException.message) && Intrinsics.areEqual(this.throwable, initializationException.throwable) && Intrinsics.areEqual(this.reason, initializationException.reason) && Intrinsics.areEqual(this.reasonDebug, initializationException.reasonDebug) && this.errorCode == initializationException.errorCode && Intrinsics.areEqual(this.errorToken, initializationException.errorToken);
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Throwable th = this.throwable;
        int hashCode2 = (((hashCode + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        int hashCode4 = (hashCode3 + (publicErrorCode == null ? 0 : publicErrorCode.hashCode())) * 31;
        ByteString byteString = this.errorToken;
        return hashCode4 + (byteString != null ? byteString.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : publicErrorCode, (i & 32) == 0 ? byteString : null);
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    /* compiled from: InitializationException.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException$Companion;", "", "<init>", "()V", "parseFrom", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InitializationException parseFrom(Exception e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if ((e instanceof TimeoutCancellationException) || (e instanceof NetworkTimeoutException)) {
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_TIMEOUT, e, "timeout", e.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, null, 32, null);
            }
            if (e instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e;
                return new InitializationException(gatewayException.getMessage(), gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug(), gatewayException.getErrorCode(), gatewayException.getErrorToken());
            }
            if (e instanceof UnityAdsNetworkException) {
                UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_NETWORK_ERROR, e, unityAdsNetworkException.getCode() == null ? "network" : "network." + unityAdsNetworkException.getCode(), unityAdsNetworkException.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK, null, 32, null);
            }
            if (e instanceof InitializationException) {
                return (InitializationException) e;
            }
            return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_UNKNOWN_ERROR, e, "unknown", e.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN, null, 32, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th, String reason, String str, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
        this.errorCode = publicErrorCode;
        this.errorToken = byteString;
    }
}
