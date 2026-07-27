package com.unity3d.ads.core.data.model.exception;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GatewayException.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/GatewayException;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "message", "", "throwable", "", "reason", "reasonDebug", IronSourceConstants.EVENTS_ERROR_CODE, "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "errorToken", "Lcom/google/protobuf/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Lcom/google/protobuf/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "getReasonDebug", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GatewayException extends UnityAdsNetworkException {
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    private final ErrorOuterClass.PublicErrorCode errorCode;
    private final ByteString errorToken;
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gatewayException.message;
        }
        if ((i & 2) != 0) {
            th = gatewayException.throwable;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            str2 = gatewayException.reason;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            publicErrorCode = gatewayException.errorCode;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        if ((i & 32) != 0) {
            byteString = gatewayException.errorToken;
        }
        return gatewayException.copy(str, th2, str4, str5, publicErrorCode2, byteString);
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

    public final GatewayException copy(String message, Throwable throwable, String reason, String reasonDebug, ErrorOuterClass.PublicErrorCode errorCode, ByteString errorToken) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new GatewayException(message, throwable, reason, reasonDebug, errorCode, errorToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) other;
        return Intrinsics.areEqual(this.message, gatewayException.message) && Intrinsics.areEqual(this.throwable, gatewayException.throwable) && Intrinsics.areEqual(this.reason, gatewayException.reason) && Intrinsics.areEqual(this.reasonDebug, gatewayException.reasonDebug) && this.errorCode == gatewayException.errorCode && Intrinsics.areEqual(this.errorToken, gatewayException.errorToken);
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
        return "GatewayException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    @Override // com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public /* synthetic */ GatewayException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(String message, Throwable th, String reason, String str, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        super(message, null, null, null, null, null, null, 126, null);
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
