package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bf\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÏ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010(J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010WJ\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u001d\u0010i\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u001aHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010l\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010s\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010t\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010u\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010}\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00106J\u0094\u0003\u0010~\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u007fJ\n\u0010\u0080\u0001\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0081\u0001\u001a\u00020\n2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0006HÖ\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0015\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0015\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b8\u00106R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\bF\u00106\"\u0004\bG\u0010HR.\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\bM\u00106R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b\t\u00106R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b\r\u00106R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b\f\u00106R\u0015\u0010$\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b$\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010*\"\u0004\bQ\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010*\"\u0004\bS\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010*\"\u0004\bU\u0010,R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0015\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00107\u001a\u0004\b[\u00106R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b\\\u00106\"\u0004\b]\u0010HR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010*¨\u0006\u008b\u0001"}, d2 = {"Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "Landroid/os/Parcelable;", "clientCode", "", "amountType", "clientId", "", "clientName", "clientLogo", "isClientLogoFlag", "", "partnerBankLogo", "isPartnerBankLogo", "isCommercialFlag", "payerName", "payerMobNumber", "payerEmail", "spTxnId", "clientTxnid", "requestAmount", "", Constants.MESSAGE, "channelId", "donationFlag", "donationSelectedIndex", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "donationAmount", "", "giftCardFlag", "alertMessage", "showAlert", "alertImageUrl", "roundOffFlag", "clientAlertMessage", "clientAlertFlag", "isVpaVerify", "chkoutCancelBtn", "aes_api_key", "aes_api_iv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAes_api_iv", "()Ljava/lang/String;", "setAes_api_iv", "(Ljava/lang/String;)V", "getAes_api_key", "setAes_api_key", "getAlertImageUrl", "setAlertImageUrl", "getAlertMessage", "setAlertMessage", "getAmountType", "getChannelId", "getChkoutCancelBtn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getClientAlertFlag", "getClientAlertMessage", "getClientCode", "getClientId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClientLogo", "getClientName", "getClientTxnid", "getDonationAmount", "()Ljava/lang/Float;", "setDonationAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDonationFlag", "setDonationFlag", "(Ljava/lang/Boolean;)V", "getDonationSelectedIndex", "()Ljava/util/ArrayList;", "setDonationSelectedIndex", "(Ljava/util/ArrayList;)V", "getGiftCardFlag", "getMessage", "getPartnerBankLogo", "getPayerEmail", "setPayerEmail", "getPayerMobNumber", "setPayerMobNumber", "getPayerName", "setPayerName", "getRequestAmount", "()Ljava/lang/Double;", "setRequestAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRoundOffFlag", "getShowAlert", "setShowAlert", "getSpTxnId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentDetailsModel implements Parcelable {
    public static final Parcelable.Creator<PaymentDetailsModel> CREATOR = new a();
    private String aes_api_iv;
    private String aes_api_key;
    private String alertImageUrl;
    private String alertMessage;
    private final String amountType;
    private final String channelId;
    private final Boolean chkoutCancelBtn;
    private final Boolean clientAlertFlag;
    private final String clientAlertMessage;
    private final String clientCode;
    private final Integer clientId;
    private final String clientLogo;
    private final String clientName;
    private final String clientTxnid;
    private Float donationAmount;
    private Boolean donationFlag;
    private ArrayList<Integer> donationSelectedIndex;
    private final Boolean giftCardFlag;
    private final Boolean isClientLogoFlag;
    private final Boolean isCommercialFlag;
    private final Boolean isPartnerBankLogo;
    private final Boolean isVpaVerify;
    private final String message;
    private final String partnerBankLogo;
    private String payerEmail;
    private String payerMobNumber;
    private String payerName;
    private Double requestAmount;
    private final Boolean roundOffFlag;
    private Boolean showAlert;
    private final String spTxnId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentDetailsModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentDetailsModel createFromParcel(Parcel parcel) {
            Integer num;
            ArrayList arrayList;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString5 = parcel.readString();
            Boolean valueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean bool = valueOf4;
            String readString6 = parcel.readString();
            Boolean bool2 = valueOf5;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString11 = parcel.readString();
            Double d = valueOf6;
            String readString12 = parcel.readString();
            Boolean valueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                num = valueOf2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                num = valueOf2;
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            Float valueOf8 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Boolean valueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer num2 = num;
            String readString13 = parcel.readString();
            Boolean valueOf10 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString14 = parcel.readString();
            Boolean valueOf11 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString15 = parcel.readString();
            Boolean valueOf12 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf13 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PaymentDetailsModel(readString, readString2, num2, readString3, readString4, valueOf3, readString5, bool, bool2, readString6, readString7, readString8, readString9, readString10, d, readString11, readString12, valueOf7, arrayList, valueOf8, valueOf9, readString13, valueOf10, readString14, valueOf11, readString15, valueOf12, valueOf13, valueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentDetailsModel[] newArray(int i) {
            return new PaymentDetailsModel[i];
        }
    }

    public PaymentDetailsModel(String str, String str2, Integer num, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, Boolean bool4, ArrayList<Integer> arrayList, Float f, Boolean bool5, String str13, Boolean bool6, String str14, Boolean bool7, String str15, Boolean bool8, Boolean bool9, Boolean bool10, String str16, String str17) {
        this.clientCode = str;
        this.amountType = str2;
        this.clientId = num;
        this.clientName = str3;
        this.clientLogo = str4;
        this.isClientLogoFlag = bool;
        this.partnerBankLogo = str5;
        this.isPartnerBankLogo = bool2;
        this.isCommercialFlag = bool3;
        this.payerName = str6;
        this.payerMobNumber = str7;
        this.payerEmail = str8;
        this.spTxnId = str9;
        this.clientTxnid = str10;
        this.requestAmount = d;
        this.message = str11;
        this.channelId = str12;
        this.donationFlag = bool4;
        this.donationSelectedIndex = arrayList;
        this.donationAmount = f;
        this.giftCardFlag = bool5;
        this.alertMessage = str13;
        this.showAlert = bool6;
        this.alertImageUrl = str14;
        this.roundOffFlag = bool7;
        this.clientAlertMessage = str15;
        this.clientAlertFlag = bool8;
        this.isVpaVerify = bool9;
        this.chkoutCancelBtn = bool10;
        this.aes_api_key = str16;
        this.aes_api_iv = str17;
    }

    public static /* synthetic */ PaymentDetailsModel copy$default(PaymentDetailsModel paymentDetailsModel, String str, String str2, Integer num, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, Boolean bool4, ArrayList arrayList, Float f, Boolean bool5, String str13, Boolean bool6, String str14, Boolean bool7, String str15, Boolean bool8, Boolean bool9, Boolean bool10, String str16, String str17, int i, Object obj) {
        String str18;
        String str19;
        String str20 = (i & 1) != 0 ? paymentDetailsModel.clientCode : str;
        String str21 = (i & 2) != 0 ? paymentDetailsModel.amountType : str2;
        Integer num2 = (i & 4) != 0 ? paymentDetailsModel.clientId : num;
        String str22 = (i & 8) != 0 ? paymentDetailsModel.clientName : str3;
        String str23 = (i & 16) != 0 ? paymentDetailsModel.clientLogo : str4;
        Boolean bool11 = (i & 32) != 0 ? paymentDetailsModel.isClientLogoFlag : bool;
        String str24 = (i & 64) != 0 ? paymentDetailsModel.partnerBankLogo : str5;
        Boolean bool12 = (i & 128) != 0 ? paymentDetailsModel.isPartnerBankLogo : bool2;
        Boolean bool13 = (i & 256) != 0 ? paymentDetailsModel.isCommercialFlag : bool3;
        String str25 = (i & 512) != 0 ? paymentDetailsModel.payerName : str6;
        String str26 = (i & 1024) != 0 ? paymentDetailsModel.payerMobNumber : str7;
        String str27 = (i & 2048) != 0 ? paymentDetailsModel.payerEmail : str8;
        String str28 = (i & 4096) != 0 ? paymentDetailsModel.spTxnId : str9;
        String str29 = (i & 8192) != 0 ? paymentDetailsModel.clientTxnid : str10;
        String str30 = str20;
        Double d2 = (i & 16384) != 0 ? paymentDetailsModel.requestAmount : d;
        String str31 = (i & 32768) != 0 ? paymentDetailsModel.message : str11;
        String str32 = (i & 65536) != 0 ? paymentDetailsModel.channelId : str12;
        Boolean bool14 = (i & 131072) != 0 ? paymentDetailsModel.donationFlag : bool4;
        ArrayList arrayList2 = (i & 262144) != 0 ? paymentDetailsModel.donationSelectedIndex : arrayList;
        Float f2 = (i & 524288) != 0 ? paymentDetailsModel.donationAmount : f;
        Boolean bool15 = (i & 1048576) != 0 ? paymentDetailsModel.giftCardFlag : bool5;
        String str33 = (i & 2097152) != 0 ? paymentDetailsModel.alertMessage : str13;
        Boolean bool16 = (i & 4194304) != 0 ? paymentDetailsModel.showAlert : bool6;
        String str34 = (i & 8388608) != 0 ? paymentDetailsModel.alertImageUrl : str14;
        Boolean bool17 = (i & 16777216) != 0 ? paymentDetailsModel.roundOffFlag : bool7;
        String str35 = (i & 33554432) != 0 ? paymentDetailsModel.clientAlertMessage : str15;
        Boolean bool18 = (i & 67108864) != 0 ? paymentDetailsModel.clientAlertFlag : bool8;
        Boolean bool19 = (i & 134217728) != 0 ? paymentDetailsModel.isVpaVerify : bool9;
        Boolean bool20 = (i & 268435456) != 0 ? paymentDetailsModel.chkoutCancelBtn : bool10;
        String str36 = (i & 536870912) != 0 ? paymentDetailsModel.aes_api_key : str16;
        if ((i & 1073741824) != 0) {
            str19 = str36;
            str18 = paymentDetailsModel.aes_api_iv;
        } else {
            str18 = str17;
            str19 = str36;
        }
        return paymentDetailsModel.copy(str30, str21, num2, str22, str23, bool11, str24, bool12, bool13, str25, str26, str27, str28, str29, d2, str31, str32, bool14, arrayList2, f2, bool15, str33, bool16, str34, bool17, str35, bool18, bool19, bool20, str19, str18);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPayerName() {
        return this.payerName;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPayerMobNumber() {
        return this.payerMobNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPayerEmail() {
        return this.payerEmail;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSpTxnId() {
        return this.spTxnId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getClientTxnid() {
        return this.clientTxnid;
    }

    /* renamed from: component15, reason: from getter */
    public final Double getRequestAmount() {
        return this.requestAmount;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component17, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getDonationFlag() {
        return this.donationFlag;
    }

    public final ArrayList<Integer> component19() {
        return this.donationSelectedIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* renamed from: component20, reason: from getter */
    public final Float getDonationAmount() {
        return this.donationAmount;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getGiftCardFlag() {
        return this.giftCardFlag;
    }

    /* renamed from: component22, reason: from getter */
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    /* renamed from: component23, reason: from getter */
    public final Boolean getShowAlert() {
        return this.showAlert;
    }

    /* renamed from: component24, reason: from getter */
    public final String getAlertImageUrl() {
        return this.alertImageUrl;
    }

    /* renamed from: component25, reason: from getter */
    public final Boolean getRoundOffFlag() {
        return this.roundOffFlag;
    }

    /* renamed from: component26, reason: from getter */
    public final String getClientAlertMessage() {
        return this.clientAlertMessage;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getClientAlertFlag() {
        return this.clientAlertFlag;
    }

    /* renamed from: component28, reason: from getter */
    public final Boolean getIsVpaVerify() {
        return this.isVpaVerify;
    }

    /* renamed from: component29, reason: from getter */
    public final Boolean getChkoutCancelBtn() {
        return this.chkoutCancelBtn;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getClientId() {
        return this.clientId;
    }

    /* renamed from: component30, reason: from getter */
    public final String getAes_api_key() {
        return this.aes_api_key;
    }

    /* renamed from: component31, reason: from getter */
    public final String getAes_api_iv() {
        return this.aes_api_iv;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientLogo() {
        return this.clientLogo;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsClientLogoFlag() {
        return this.isClientLogoFlag;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPartnerBankLogo() {
        return this.partnerBankLogo;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsPartnerBankLogo() {
        return this.isPartnerBankLogo;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsCommercialFlag() {
        return this.isCommercialFlag;
    }

    public final PaymentDetailsModel copy(String clientCode, String amountType, Integer clientId, String clientName, String clientLogo, Boolean isClientLogoFlag, String partnerBankLogo, Boolean isPartnerBankLogo, Boolean isCommercialFlag, String payerName, String payerMobNumber, String payerEmail, String spTxnId, String clientTxnid, Double requestAmount, String message, String channelId, Boolean donationFlag, ArrayList<Integer> donationSelectedIndex, Float donationAmount, Boolean giftCardFlag, String alertMessage, Boolean showAlert, String alertImageUrl, Boolean roundOffFlag, String clientAlertMessage, Boolean clientAlertFlag, Boolean isVpaVerify, Boolean chkoutCancelBtn, String aes_api_key, String aes_api_iv) {
        return new PaymentDetailsModel(clientCode, amountType, clientId, clientName, clientLogo, isClientLogoFlag, partnerBankLogo, isPartnerBankLogo, isCommercialFlag, payerName, payerMobNumber, payerEmail, spTxnId, clientTxnid, requestAmount, message, channelId, donationFlag, donationSelectedIndex, donationAmount, giftCardFlag, alertMessage, showAlert, alertImageUrl, roundOffFlag, clientAlertMessage, clientAlertFlag, isVpaVerify, chkoutCancelBtn, aes_api_key, aes_api_iv);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailsModel)) {
            return false;
        }
        PaymentDetailsModel paymentDetailsModel = (PaymentDetailsModel) other;
        return Intrinsics.areEqual(this.clientCode, paymentDetailsModel.clientCode) && Intrinsics.areEqual(this.amountType, paymentDetailsModel.amountType) && Intrinsics.areEqual(this.clientId, paymentDetailsModel.clientId) && Intrinsics.areEqual(this.clientName, paymentDetailsModel.clientName) && Intrinsics.areEqual(this.clientLogo, paymentDetailsModel.clientLogo) && Intrinsics.areEqual(this.isClientLogoFlag, paymentDetailsModel.isClientLogoFlag) && Intrinsics.areEqual(this.partnerBankLogo, paymentDetailsModel.partnerBankLogo) && Intrinsics.areEqual(this.isPartnerBankLogo, paymentDetailsModel.isPartnerBankLogo) && Intrinsics.areEqual(this.isCommercialFlag, paymentDetailsModel.isCommercialFlag) && Intrinsics.areEqual(this.payerName, paymentDetailsModel.payerName) && Intrinsics.areEqual(this.payerMobNumber, paymentDetailsModel.payerMobNumber) && Intrinsics.areEqual(this.payerEmail, paymentDetailsModel.payerEmail) && Intrinsics.areEqual(this.spTxnId, paymentDetailsModel.spTxnId) && Intrinsics.areEqual(this.clientTxnid, paymentDetailsModel.clientTxnid) && Intrinsics.areEqual((Object) this.requestAmount, (Object) paymentDetailsModel.requestAmount) && Intrinsics.areEqual(this.message, paymentDetailsModel.message) && Intrinsics.areEqual(this.channelId, paymentDetailsModel.channelId) && Intrinsics.areEqual(this.donationFlag, paymentDetailsModel.donationFlag) && Intrinsics.areEqual(this.donationSelectedIndex, paymentDetailsModel.donationSelectedIndex) && Intrinsics.areEqual((Object) this.donationAmount, (Object) paymentDetailsModel.donationAmount) && Intrinsics.areEqual(this.giftCardFlag, paymentDetailsModel.giftCardFlag) && Intrinsics.areEqual(this.alertMessage, paymentDetailsModel.alertMessage) && Intrinsics.areEqual(this.showAlert, paymentDetailsModel.showAlert) && Intrinsics.areEqual(this.alertImageUrl, paymentDetailsModel.alertImageUrl) && Intrinsics.areEqual(this.roundOffFlag, paymentDetailsModel.roundOffFlag) && Intrinsics.areEqual(this.clientAlertMessage, paymentDetailsModel.clientAlertMessage) && Intrinsics.areEqual(this.clientAlertFlag, paymentDetailsModel.clientAlertFlag) && Intrinsics.areEqual(this.isVpaVerify, paymentDetailsModel.isVpaVerify) && Intrinsics.areEqual(this.chkoutCancelBtn, paymentDetailsModel.chkoutCancelBtn) && Intrinsics.areEqual(this.aes_api_key, paymentDetailsModel.aes_api_key) && Intrinsics.areEqual(this.aes_api_iv, paymentDetailsModel.aes_api_iv);
    }

    public final String getAes_api_iv() {
        return this.aes_api_iv;
    }

    public final String getAes_api_key() {
        return this.aes_api_key;
    }

    public final String getAlertImageUrl() {
        return this.alertImageUrl;
    }

    public final String getAlertMessage() {
        return this.alertMessage;
    }

    public final String getAmountType() {
        return this.amountType;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final Boolean getChkoutCancelBtn() {
        return this.chkoutCancelBtn;
    }

    public final Boolean getClientAlertFlag() {
        return this.clientAlertFlag;
    }

    public final String getClientAlertMessage() {
        return this.clientAlertMessage;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final Integer getClientId() {
        return this.clientId;
    }

    public final String getClientLogo() {
        return this.clientLogo;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientTxnid() {
        return this.clientTxnid;
    }

    public final Float getDonationAmount() {
        return this.donationAmount;
    }

    public final Boolean getDonationFlag() {
        return this.donationFlag;
    }

    public final ArrayList<Integer> getDonationSelectedIndex() {
        return this.donationSelectedIndex;
    }

    public final Boolean getGiftCardFlag() {
        return this.giftCardFlag;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPartnerBankLogo() {
        return this.partnerBankLogo;
    }

    public final String getPayerEmail() {
        return this.payerEmail;
    }

    public final String getPayerMobNumber() {
        return this.payerMobNumber;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final Double getRequestAmount() {
        return this.requestAmount;
    }

    public final Boolean getRoundOffFlag() {
        return this.roundOffFlag;
    }

    public final Boolean getShowAlert() {
        return this.showAlert;
    }

    public final String getSpTxnId() {
        return this.spTxnId;
    }

    public int hashCode() {
        String str = this.clientCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amountType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.clientId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.clientName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientLogo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isClientLogoFlag;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.partnerBankLogo;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isPartnerBankLogo;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCommercialFlag;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.payerName;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payerMobNumber;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payerEmail;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.spTxnId;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.clientTxnid;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d = this.requestAmount;
        int hashCode15 = (hashCode14 + (d == null ? 0 : d.hashCode())) * 31;
        String str11 = this.message;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.channelId;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool4 = this.donationFlag;
        int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.donationSelectedIndex;
        int hashCode19 = (hashCode18 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Float f = this.donationAmount;
        int hashCode20 = (hashCode19 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool5 = this.giftCardFlag;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str13 = this.alertMessage;
        int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool6 = this.showAlert;
        int hashCode23 = (hashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str14 = this.alertImageUrl;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool7 = this.roundOffFlag;
        int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str15 = this.clientAlertMessage;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool8 = this.clientAlertFlag;
        int hashCode27 = (hashCode26 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isVpaVerify;
        int hashCode28 = (hashCode27 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.chkoutCancelBtn;
        int hashCode29 = (hashCode28 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str16 = this.aes_api_key;
        int hashCode30 = (hashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.aes_api_iv;
        return hashCode30 + (str17 != null ? str17.hashCode() : 0);
    }

    public final Boolean isClientLogoFlag() {
        return this.isClientLogoFlag;
    }

    public final Boolean isCommercialFlag() {
        return this.isCommercialFlag;
    }

    public final Boolean isPartnerBankLogo() {
        return this.isPartnerBankLogo;
    }

    public final Boolean isVpaVerify() {
        return this.isVpaVerify;
    }

    public final void setAes_api_iv(String str) {
        this.aes_api_iv = str;
    }

    public final void setAes_api_key(String str) {
        this.aes_api_key = str;
    }

    public final void setAlertImageUrl(String str) {
        this.alertImageUrl = str;
    }

    public final void setAlertMessage(String str) {
        this.alertMessage = str;
    }

    public final void setDonationAmount(Float f) {
        this.donationAmount = f;
    }

    public final void setDonationFlag(Boolean bool) {
        this.donationFlag = bool;
    }

    public final void setDonationSelectedIndex(ArrayList<Integer> arrayList) {
        this.donationSelectedIndex = arrayList;
    }

    public final void setPayerEmail(String str) {
        this.payerEmail = str;
    }

    public final void setPayerMobNumber(String str) {
        this.payerMobNumber = str;
    }

    public final void setPayerName(String str) {
        this.payerName = str;
    }

    public final void setRequestAmount(Double d) {
        this.requestAmount = d;
    }

    public final void setShowAlert(Boolean bool) {
        this.showAlert = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentDetailsModel(clientCode=");
        sb.append(this.clientCode);
        sb.append(", amountType=");
        sb.append(this.amountType);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", clientName=");
        sb.append(this.clientName);
        sb.append(", clientLogo=");
        sb.append(this.clientLogo);
        sb.append(", isClientLogoFlag=");
        sb.append(this.isClientLogoFlag);
        sb.append(", partnerBankLogo=");
        sb.append(this.partnerBankLogo);
        sb.append(", isPartnerBankLogo=");
        sb.append(this.isPartnerBankLogo);
        sb.append(", isCommercialFlag=");
        sb.append(this.isCommercialFlag);
        sb.append(", payerName=");
        sb.append(this.payerName);
        sb.append(", payerMobNumber=");
        sb.append(this.payerMobNumber);
        sb.append(", payerEmail=");
        sb.append(this.payerEmail);
        sb.append(", spTxnId=");
        sb.append(this.spTxnId);
        sb.append(", clientTxnid=");
        sb.append(this.clientTxnid);
        sb.append(", requestAmount=");
        sb.append(this.requestAmount);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", channelId=");
        sb.append(this.channelId);
        sb.append(", donationFlag=");
        sb.append(this.donationFlag);
        sb.append(", donationSelectedIndex=");
        sb.append(this.donationSelectedIndex);
        sb.append(", donationAmount=");
        sb.append(this.donationAmount);
        sb.append(", giftCardFlag=");
        sb.append(this.giftCardFlag);
        sb.append(", alertMessage=");
        sb.append(this.alertMessage);
        sb.append(", showAlert=");
        sb.append(this.showAlert);
        sb.append(", alertImageUrl=");
        sb.append(this.alertImageUrl);
        sb.append(", roundOffFlag=");
        sb.append(this.roundOffFlag);
        sb.append(", clientAlertMessage=");
        sb.append(this.clientAlertMessage);
        sb.append(", clientAlertFlag=");
        sb.append(this.clientAlertFlag);
        sb.append(", isVpaVerify=");
        sb.append(this.isVpaVerify);
        sb.append(", chkoutCancelBtn=");
        sb.append(this.chkoutCancelBtn);
        sb.append(", aes_api_key=");
        sb.append(this.aes_api_key);
        sb.append(", aes_api_iv=");
        return t.b(')', this.aes_api_iv, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.clientCode);
        parcel.writeString(this.amountType);
        Integer num = this.clientId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.clientName);
        parcel.writeString(this.clientLogo);
        Boolean bool = this.isClientLogoFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.partnerBankLogo);
        Boolean bool2 = this.isPartnerBankLogo;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isCommercialFlag;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.payerName);
        parcel.writeString(this.payerMobNumber);
        parcel.writeString(this.payerEmail);
        parcel.writeString(this.spTxnId);
        parcel.writeString(this.clientTxnid);
        Double d = this.requestAmount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.message);
        parcel.writeString(this.channelId);
        Boolean bool4 = this.donationFlag;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        ArrayList<Integer> arrayList = this.donationSelectedIndex;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        Float f = this.donationAmount;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Boolean bool5 = this.giftCardFlag;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.alertMessage);
        Boolean bool6 = this.showAlert;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.alertImageUrl);
        Boolean bool7 = this.roundOffFlag;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.clientAlertMessage);
        Boolean bool8 = this.clientAlertFlag;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.isVpaVerify;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.chkoutCancelBtn;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.aes_api_key);
        parcel.writeString(this.aes_api_iv);
    }

    public /* synthetic */ PaymentDetailsModel(String str, String str2, Integer num, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, Boolean bool4, ArrayList arrayList, Float f, Boolean bool5, String str13, Boolean bool6, String str14, Boolean bool7, String str15, Boolean bool8, Boolean bool9, Boolean bool10, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, str4, bool, str5, bool2, bool3, str6, str7, str8, str9, str10, d, str11, str12, bool4, arrayList, (i & 524288) != 0 ? Float.valueOf(0.0f) : f, bool5, str13, bool6, str14, bool7, str15, bool8, bool9, bool10, str16, str17);
    }
}
