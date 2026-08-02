package io.github.sabpaisaandroid;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import io.github.sabpaisaandroid.network.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u0007\b\u0012¢\u0006\u0002\u0010\u0002Bé\u0002\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0010\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0002\u00100J\u0006\u00105\u001a\u00020\u0000J\u001c\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0004J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0004J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010K\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u0010J\u000e\u0010L\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0010J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010O\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0010J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010`\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010a\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010d\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010g\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010h\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010i\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010j\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u000e\u0010&\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u00102R\u000e\u00103\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\b4R\u000e\u0010/\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lio/github/sabpaisaandroid/SabPaisaGateway;", "", "()V", "firstName", "", "lastName", "mobileNumber", "amount", "", "emailId", "clientCode", "aesApiKey", "aesApiIv", "transUserName", "transUserPassword", "prod", "", "udf1", "udf2", "udf3", "udf4", "udf5", "udf6", "udf7", "udf8", "udf9", "udf10", "udf11", "udf12", "udf13", "udf14", "udf15", "udf16", "udf17", "udf18", "udf19", "udf20", "payerAddress", "amountType", "mcc", "transDate", "programId", "showSabPaisaPaymentScreen", "salutation", "clientTransactionId", "callbackUrl", "intermediateLoading", "selectedEnv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Double;", "Ljava/lang/Boolean;", "isProd", "salutation$1", "build", "init", "", "activity", "Landroid/app/Activity;", "iPaymentSuccessCallBack", "Lio/github/sabpaisaandroid/interfaces/IPaymentSuccessCallBack;", "Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "setAesApiIv", "setAesApiKey", "setAmount", "setAmountType", "setCallbackUrl", "url", "setClientCode", "setClientTransactionId", "setCurrency", FirebaseAnalytics.Param.CURRENCY, "setEmailId", "setEnv", "envValue", "setFirstName", "setIntermediateLoading", "setIsProd", "setLastName", "setMCC", "setMobileNumber", "setPayerAddress", "setProgramId", "setSabPaisaPaymentScreen", "flag", "setSalutation", "setTransDate", "setTransUserName", "setTransUserPassword", "setUdf1", "setUdf10", "setUdf11", "setUdf12", "setUdf13", "setUdf14", "setUdf15", "setUdf16", "setUdf17", "setUdf18", "setUdf19", "setUdf2", "setUdf20", "setUdf3", "setUdf4", "setUdf5", "setUdf6", "setUdf7", "setUdf8", "setUdf9", "Companion", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SabPaisaGateway {
    public static final int SAB_PAISA_CHALLAN_GENERATED_SUCCESS_RESPONSE_CODE = 906;
    public static final int SAB_PAISA_CHANGE_PAYMENT_MODE_CODE = 904;
    public static final int SAB_PAISA_FAIL_RESPONSE_CODE = 903;
    public static final int SAB_PAISA_QRCODE_TIMEOUT_EXCEPTION = 905;
    public static final int SAB_PAISA_REQUEST_CODE = 901;
    public static final int SAB_PAISA_SUCCESS_RESPONSE_CODE = 902;
    private static boolean SHOW_SABPAISA_PAYMENT_SCREEN = false;
    public static final int UPI_REQUEST_CODE = 4400;
    private String aesApiIv;
    private String aesApiKey;
    private Double amount;
    private String amountType;
    private String callbackUrl;
    private String clientCode;
    private String clientTransactionId;
    private String emailId;
    private String firstName;
    private Boolean intermediateLoading;
    private boolean isProd;
    private String lastName;
    private String mcc;
    private String mobileNumber;
    private String payerAddress;
    private String programId;

    /* renamed from: salutation$1, reason: from kotlin metadata */
    private String salutation;
    private String selectedEnv;
    private boolean showSabPaisaPaymentScreen;
    private String transDate;
    private String transUserName;
    private String transUserPassword;
    private String udf1;
    private String udf10;
    private String udf11;
    private String udf12;
    private String udf13;
    private String udf14;
    private String udf15;
    private String udf16;
    private String udf17;
    private String udf18;
    private String udf19;
    private String udf2;
    private String udf20;
    private String udf3;
    private String udf4;
    private String udf5;
    private String udf6;
    private String udf7;
    private String udf8;
    private String udf9;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);
    private static String packageName = "";
    private static String CALLBACK_URL = "http://localhost:8080/response.html";
    private static boolean INTERMEDIATE_LOADING = true;
    private static String salutation = "Hi, ";
    private static String EMPTY_STRING = "";
    private static String initUrl = "";
    private static String endPointBaseUrl = "";
    private static String txnEnquiryEndpoint = "";
    private static boolean dynamicImageLoadingEnabled = true;
    private static String TRANSUSERNAME = "";
    private static String TRANSUSERPASSWORD = "";

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00105\u001a\u000206H\u0007J\u0006\u00107\u001a\u00020\u0004J\u0015\u0010(\u001a\u0002082\u0006\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0002\b9J\u0015\u0010+\u001a\u0002082\u0006\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0002\b:J\u0015\u00104\u001a\u0002082\u0006\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0002\b;R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u000e\u0010\"\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b¨\u0006<"}, d2 = {"Lio/github/sabpaisaandroid/SabPaisaGateway$Companion;", "", "()V", "CALLBACK_URL", "", "getCALLBACK_URL$gatewayAndroid_release", "()Ljava/lang/String;", "setCALLBACK_URL$gatewayAndroid_release", "(Ljava/lang/String;)V", "EMPTY_STRING", "getEMPTY_STRING", "setEMPTY_STRING", "INTERMEDIATE_LOADING", "", "getINTERMEDIATE_LOADING", "()Z", "setINTERMEDIATE_LOADING", "(Z)V", "SAB_PAISA_CHALLAN_GENERATED_SUCCESS_RESPONSE_CODE", "", "SAB_PAISA_CHANGE_PAYMENT_MODE_CODE", "SAB_PAISA_FAIL_RESPONSE_CODE", "SAB_PAISA_QRCODE_TIMEOUT_EXCEPTION", "SAB_PAISA_REQUEST_CODE", "SAB_PAISA_SUCCESS_RESPONSE_CODE", "SHOW_SABPAISA_PAYMENT_SCREEN", "getSHOW_SABPAISA_PAYMENT_SCREEN", "setSHOW_SABPAISA_PAYMENT_SCREEN", "TRANSUSERNAME", "getTRANSUSERNAME", "setTRANSUSERNAME", "TRANSUSERPASSWORD", "getTRANSUSERPASSWORD", "setTRANSUSERPASSWORD", "UPI_REQUEST_CODE", "dynamicImageLoadingEnabled", "getDynamicImageLoadingEnabled", "setDynamicImageLoadingEnabled", "endPointBaseUrl", "getEndPointBaseUrl", "setEndPointBaseUrl", "initUrl", "getInitUrl", "setInitUrl", "packageName", "getPackageName", "setPackageName", "salutation", "getSalutation", "setSalutation", "txnEnquiryEndpoint", "getTxnEnquiryEndpoint", "setTxnEnquiryEndpoint", "builder", "Lio/github/sabpaisaandroid/SabPaisaGateway;", "randomID", "", "setEndPointBaseUrlSabpaisa", "setInitUrlSabpaisa", "setTxnEnquiryEndpointSabpaisa", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @Keep
        public final SabPaisaGateway builder() {
            return new SabPaisaGateway(null);
        }

        @Keep
        @JvmName(name = "setEndPointBaseUrlSabpaisa")
        public final void setEndPointBaseUrlSabpaisa(String endPointBaseUrl) {
            Intrinsics.checkNotNullParameter(endPointBaseUrl, "endPointBaseUrl");
            SabPaisaGateway.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(endPointBaseUrl, "<set-?>");
            SabPaisaGateway.endPointBaseUrl = endPointBaseUrl;
        }

        @Keep
        @JvmName(name = "setInitUrlSabpaisa")
        public final void setInitUrlSabpaisa(String initUrl) {
            Intrinsics.checkNotNullParameter(initUrl, "initUrl");
            SabPaisaGateway.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(initUrl, "<set-?>");
            SabPaisaGateway.initUrl = initUrl;
        }

        @Keep
        @JvmName(name = "setTxnEnquiryEndpointSabpaisa")
        public final void setTxnEnquiryEndpointSabpaisa(String txnEnquiryEndpoint) {
            Intrinsics.checkNotNullParameter(txnEnquiryEndpoint, "txnEnquiryEndpoint");
            SabPaisaGateway.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(txnEnquiryEndpoint, "<set-?>");
            SabPaisaGateway.txnEnquiryEndpoint = txnEnquiryEndpoint;
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    private SabPaisaGateway() {
        this.intermediateLoading = Boolean.TRUE;
        this.payerAddress = "";
        this.amountType = "INR";
        this.mcc = "";
        this.salutation = salutation;
        this.transDate = "";
        this.programId = "";
        this.isProd = true;
        this.udf1 = "";
        this.udf2 = "";
        this.udf3 = "";
        this.udf4 = "";
        this.udf5 = "";
        this.udf6 = "";
        this.udf7 = "";
        this.udf8 = "";
        this.udf9 = "";
        this.udf10 = "";
        this.udf11 = "";
        this.udf12 = "";
        this.udf13 = "";
        this.udf14 = "";
        this.udf15 = "";
        this.udf16 = "";
        this.udf17 = "";
        this.udf18 = "";
        this.udf19 = "";
        this.udf20 = "";
        this.selectedEnv = "staging";
        this.callbackUrl = "http://localhost:8080/response.html";
    }

    public static /* synthetic */ SabPaisaGateway setIntermediateLoading$default(SabPaisaGateway sabPaisaGateway, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sabPaisaGateway.setIntermediateLoading(z);
    }

    public final SabPaisaGateway build() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.mobileNumber;
        Double d = this.amount;
        String str4 = this.emailId;
        String str5 = this.clientCode;
        String str6 = this.aesApiKey;
        Intrinsics.checkNotNull(str6);
        String str7 = this.aesApiIv;
        Intrinsics.checkNotNull(str7);
        String str8 = this.transUserName;
        Intrinsics.checkNotNull(str8);
        String str9 = this.transUserPassword;
        Intrinsics.checkNotNull(str9);
        return new SabPaisaGateway(str, str2, str3, d, str4, str5, str6, str7, str8, str9, this.isProd, this.udf1, this.udf2, this.udf3, this.udf4, this.udf5, this.udf6, this.udf7, this.udf8, this.udf9, this.udf10, this.udf11, this.udf12, this.udf13, this.udf14, this.udf15, this.udf16, this.udf17, this.udf18, this.udf19, this.udf20, this.payerAddress, this.amountType, this.mcc, this.transDate, this.programId, this.showSabPaisaPaymentScreen, this.salutation, this.clientTransactionId, this.callbackUrl, this.intermediateLoading, this.selectedEnv);
    }

    public final void init(Activity activity, IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack) {
        String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(iPaymentSuccessCallBack, "iPaymentSuccessCallBack");
        Intent intent = new Intent(activity, (Class<?>) WebViewActivityLite.class);
        WebViewActivityLite.INSTANCE.setIPaymentSuccessCallBack(iPaymentSuccessCallBack);
        intent.putExtra("firstname", this.firstName);
        intent.putExtra("lastname", this.lastName);
        intent.putExtra("email_id", this.emailId);
        intent.putExtra("amount", this.amount);
        intent.putExtra("mobile_number", this.mobileNumber);
        intent.putExtra("clientCode", this.clientCode);
        intent.putExtra("transUserName", this.transUserName);
        intent.putExtra("transUserPassword", this.transUserPassword);
        String str2 = this.clientTransactionId;
        if (str2 != null) {
            intent.putExtra("clienttransactionid", str2);
        }
        intent.putExtra("callback_url", this.callbackUrl);
        CALLBACK_URL = String.valueOf(this.callbackUrl);
        TRANSUSERNAME = String.valueOf(this.transUserName);
        TRANSUSERPASSWORD = String.valueOf(this.transUserPassword);
        intent.putExtra("selectedenv", this.selectedEnv);
        if (Intrinsics.areEqual(this.selectedEnv, "prod")) {
            initUrl = "https://securepay.sabpaisa.in/SabPaisa/sabPaisaInit?v=1";
            endPointBaseUrl = "https://securepay.sabpaisa.in";
            txnEnquiryEndpoint = "https://txnenquiry.sabpaisa.in";
            str = "https://mobile-prodpoc.sabpaisa.in";
        } else {
            initUrl = "https://stage-securepay.sabpaisa.in/SabPaisa/sabPaisaInit?v=1";
            endPointBaseUrl = "https://stage-securepay.sabpaisa.in";
            txnEnquiryEndpoint = "https://stage-txnenquiry.sabpaisa.in";
            str = "https://mobile-poc.sabpaisa.in";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c.g = str;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c.h = str;
        intent.putExtra("udf1", this.udf1);
        intent.putExtra("udf2", this.udf2);
        intent.putExtra("udf3", this.udf3);
        intent.putExtra("udf4", this.udf4);
        intent.putExtra("udf5", this.udf5);
        intent.putExtra("udf6", this.udf6);
        intent.putExtra("udf7", this.udf7);
        intent.putExtra("udf8", this.udf8);
        intent.putExtra("udf9", this.udf9);
        intent.putExtra("udf10", this.udf10);
        intent.putExtra("udf11", this.udf11);
        intent.putExtra("udf12", this.udf12);
        intent.putExtra("udf13", this.udf13);
        intent.putExtra("udf14", this.udf14);
        intent.putExtra("udf15", this.udf15);
        intent.putExtra("udf16", this.udf16);
        intent.putExtra("udf17", this.udf17);
        intent.putExtra("udf18", this.udf18);
        intent.putExtra("udf19", this.udf19);
        intent.putExtra("udf20", this.udf20);
        intent.putExtra("payerAddress", this.payerAddress);
        intent.putExtra("amountType", this.amountType);
        intent.putExtra("mcc", this.mcc);
        intent.putExtra("transDate", this.transDate);
        intent.putExtra("programId", this.programId);
        intent.putExtra("aes_api_key", String.valueOf(this.aesApiKey));
        intent.putExtra("aes_api_iv", String.valueOf(this.aesApiIv));
        intent.putExtra("is_prod", this.isProd);
        SHOW_SABPAISA_PAYMENT_SCREEN = this.showSabPaisaPaymentScreen;
        INTERMEDIATE_LOADING = Intrinsics.areEqual(this.intermediateLoading, Boolean.TRUE);
        salutation = this.salutation;
        intent.setFlags(268435456);
        activity.startActivity(intent);
    }

    public final SabPaisaGateway setAesApiIv(String aesApiIv) {
        Intrinsics.checkNotNullParameter(aesApiIv, "aesApiIv");
        this.aesApiIv = aesApiIv;
        return this;
    }

    public final SabPaisaGateway setAesApiKey(String aesApiKey) {
        Intrinsics.checkNotNullParameter(aesApiKey, "aesApiKey");
        this.aesApiKey = aesApiKey;
        return this;
    }

    public final SabPaisaGateway setAmount(double amount) {
        this.amount = Double.valueOf(amount);
        return this;
    }

    public final SabPaisaGateway setAmountType(String amountType) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.amountType = amountType;
        return this;
    }

    public final SabPaisaGateway setCallbackUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0) {
            this.callbackUrl = null;
            return this;
        }
        this.callbackUrl = url;
        return this;
    }

    public final SabPaisaGateway setClientCode(String clientCode) {
        Intrinsics.checkNotNullParameter(clientCode, "clientCode");
        this.clientCode = clientCode;
        return this;
    }

    public final SabPaisaGateway setClientTransactionId(String clientTransactionId) {
        Intrinsics.checkNotNullParameter(clientTransactionId, "clientTransactionId");
        this.clientTransactionId = clientTransactionId;
        return this;
    }

    public final SabPaisaGateway setCurrency(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amountType = currency;
        return this;
    }

    public final SabPaisaGateway setEmailId(String emailId) {
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        if (emailId.length() == 0) {
            this.emailId = null;
            return this;
        }
        this.emailId = emailId;
        return this;
    }

    public final SabPaisaGateway setEnv(String envValue) {
        Intrinsics.checkNotNullParameter(envValue, "envValue");
        this.selectedEnv = envValue;
        return this;
    }

    public final SabPaisaGateway setFirstName(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        if (firstName.length() == 0) {
            this.firstName = null;
            return this;
        }
        this.firstName = firstName;
        return this;
    }

    public final SabPaisaGateway setIntermediateLoading(boolean intermediateLoading) {
        this.intermediateLoading = Boolean.valueOf(intermediateLoading);
        return this;
    }

    public final SabPaisaGateway setIsProd(boolean isProd) {
        this.isProd = isProd;
        return this;
    }

    public final SabPaisaGateway setLastName(String lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        if (lastName.length() == 0) {
            this.lastName = null;
            return this;
        }
        this.lastName = lastName;
        return this;
    }

    public final SabPaisaGateway setMCC(String mcc) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        this.mcc = mcc;
        return this;
    }

    public final SabPaisaGateway setMobileNumber(String mobileNumber) {
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        if (mobileNumber.length() == 0) {
            this.mobileNumber = null;
            return this;
        }
        this.mobileNumber = mobileNumber;
        return this;
    }

    public final SabPaisaGateway setPayerAddress(String payerAddress) {
        Intrinsics.checkNotNullParameter(payerAddress, "payerAddress");
        this.payerAddress = payerAddress;
        return this;
    }

    public final SabPaisaGateway setProgramId(String programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        this.programId = programId;
        return this;
    }

    public final SabPaisaGateway setSabPaisaPaymentScreen(boolean flag) {
        this.showSabPaisaPaymentScreen = flag;
        return this;
    }

    public final SabPaisaGateway setSalutation(String salutation2) {
        Intrinsics.checkNotNullParameter(salutation2, "salutation");
        this.salutation = salutation2;
        return this;
    }

    public final SabPaisaGateway setTransDate(String transDate) {
        Intrinsics.checkNotNullParameter(transDate, "transDate");
        this.transDate = transDate;
        return this;
    }

    public final SabPaisaGateway setTransUserName(String transUserName) {
        Intrinsics.checkNotNullParameter(transUserName, "transUserName");
        this.transUserName = transUserName;
        return this;
    }

    public final SabPaisaGateway setTransUserPassword(String transUserPassword) {
        Intrinsics.checkNotNullParameter(transUserPassword, "transUserPassword");
        this.transUserPassword = transUserPassword;
        return this;
    }

    public final SabPaisaGateway setUdf1(String udf1) {
        Intrinsics.checkNotNullParameter(udf1, "udf1");
        this.udf1 = udf1;
        return this;
    }

    public final SabPaisaGateway setUdf10(String udf10) {
        Intrinsics.checkNotNullParameter(udf10, "udf10");
        this.udf10 = udf10;
        return this;
    }

    public final SabPaisaGateway setUdf11(String udf11) {
        Intrinsics.checkNotNullParameter(udf11, "udf11");
        this.udf11 = udf11;
        return this;
    }

    public final SabPaisaGateway setUdf12(String udf12) {
        Intrinsics.checkNotNullParameter(udf12, "udf12");
        this.udf12 = udf12;
        return this;
    }

    public final SabPaisaGateway setUdf13(String udf13) {
        Intrinsics.checkNotNullParameter(udf13, "udf13");
        this.udf13 = udf13;
        return this;
    }

    public final SabPaisaGateway setUdf14(String udf14) {
        Intrinsics.checkNotNullParameter(udf14, "udf14");
        this.udf14 = udf14;
        return this;
    }

    public final SabPaisaGateway setUdf15(String udf15) {
        Intrinsics.checkNotNullParameter(udf15, "udf15");
        this.udf15 = udf15;
        return this;
    }

    public final SabPaisaGateway setUdf16(String udf16) {
        Intrinsics.checkNotNullParameter(udf16, "udf16");
        this.udf16 = udf16;
        return this;
    }

    public final SabPaisaGateway setUdf17(String udf17) {
        Intrinsics.checkNotNullParameter(udf17, "udf17");
        this.udf17 = udf17;
        return this;
    }

    public final SabPaisaGateway setUdf18(String udf18) {
        Intrinsics.checkNotNullParameter(udf18, "udf18");
        this.udf18 = udf18;
        return this;
    }

    public final SabPaisaGateway setUdf19(String udf19) {
        Intrinsics.checkNotNullParameter(udf19, "udf19");
        this.udf19 = udf19;
        return this;
    }

    public final SabPaisaGateway setUdf2(String udf2) {
        Intrinsics.checkNotNullParameter(udf2, "udf2");
        this.udf2 = udf2;
        return this;
    }

    public final SabPaisaGateway setUdf20(String udf20) {
        Intrinsics.checkNotNullParameter(udf20, "udf20");
        this.udf20 = udf20;
        return this;
    }

    public final SabPaisaGateway setUdf3(String udf3) {
        Intrinsics.checkNotNullParameter(udf3, "udf3");
        this.udf3 = udf3;
        return this;
    }

    public final SabPaisaGateway setUdf4(String udf4) {
        Intrinsics.checkNotNullParameter(udf4, "udf4");
        this.udf4 = udf4;
        return this;
    }

    public final SabPaisaGateway setUdf5(String udf5) {
        Intrinsics.checkNotNullParameter(udf5, "udf5");
        this.udf5 = udf5;
        return this;
    }

    public final SabPaisaGateway setUdf6(String udf6) {
        Intrinsics.checkNotNullParameter(udf6, "udf6");
        this.udf6 = udf6;
        return this;
    }

    public final SabPaisaGateway setUdf7(String udf7) {
        Intrinsics.checkNotNullParameter(udf7, "udf7");
        this.udf7 = udf7;
        return this;
    }

    public final SabPaisaGateway setUdf8(String udf8) {
        Intrinsics.checkNotNullParameter(udf8, "udf8");
        this.udf8 = udf8;
        return this;
    }

    public final SabPaisaGateway setUdf9(String udf9) {
        Intrinsics.checkNotNullParameter(udf9, "udf9");
        this.udf9 = udf9;
        return this;
    }

    public SabPaisaGateway(String str, String str2, String str3, Double d, String str4, String str5, String aesApiKey, String aesApiIv, String transUserName, String transUserPassword, boolean z, String udf1, String udf2, String udf3, String udf4, String udf5, String udf6, String udf7, String udf8, String udf9, String udf10, String udf11, String udf12, String udf13, String udf14, String udf15, String udf16, String udf17, String udf18, String udf19, String udf20, String payerAddress, String amountType, String mcc, String transDate, String programId, boolean z2, String salutation2, String str6, String str7, Boolean bool, String selectedEnv) {
        Intrinsics.checkNotNullParameter(aesApiKey, "aesApiKey");
        Intrinsics.checkNotNullParameter(aesApiIv, "aesApiIv");
        Intrinsics.checkNotNullParameter(transUserName, "transUserName");
        Intrinsics.checkNotNullParameter(transUserPassword, "transUserPassword");
        Intrinsics.checkNotNullParameter(udf1, "udf1");
        Intrinsics.checkNotNullParameter(udf2, "udf2");
        Intrinsics.checkNotNullParameter(udf3, "udf3");
        Intrinsics.checkNotNullParameter(udf4, "udf4");
        Intrinsics.checkNotNullParameter(udf5, "udf5");
        Intrinsics.checkNotNullParameter(udf6, "udf6");
        Intrinsics.checkNotNullParameter(udf7, "udf7");
        Intrinsics.checkNotNullParameter(udf8, "udf8");
        Intrinsics.checkNotNullParameter(udf9, "udf9");
        Intrinsics.checkNotNullParameter(udf10, "udf10");
        Intrinsics.checkNotNullParameter(udf11, "udf11");
        Intrinsics.checkNotNullParameter(udf12, "udf12");
        Intrinsics.checkNotNullParameter(udf13, "udf13");
        Intrinsics.checkNotNullParameter(udf14, "udf14");
        Intrinsics.checkNotNullParameter(udf15, "udf15");
        Intrinsics.checkNotNullParameter(udf16, "udf16");
        Intrinsics.checkNotNullParameter(udf17, "udf17");
        Intrinsics.checkNotNullParameter(udf18, "udf18");
        Intrinsics.checkNotNullParameter(udf19, "udf19");
        Intrinsics.checkNotNullParameter(udf20, "udf20");
        Intrinsics.checkNotNullParameter(payerAddress, "payerAddress");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(transDate, "transDate");
        Intrinsics.checkNotNullParameter(programId, "programId");
        Intrinsics.checkNotNullParameter(salutation2, "salutation");
        Intrinsics.checkNotNullParameter(selectedEnv, "selectedEnv");
        this.firstName = str;
        this.lastName = str2;
        this.mobileNumber = str3;
        this.amount = d;
        this.emailId = str4;
        this.clientCode = str5;
        this.aesApiKey = aesApiKey;
        this.aesApiIv = aesApiIv;
        this.transUserName = transUserName;
        this.transUserPassword = transUserPassword;
        this.isProd = z;
        this.udf1 = udf1;
        this.udf2 = udf2;
        this.udf3 = udf3;
        this.udf4 = udf4;
        this.udf5 = udf5;
        this.udf6 = udf6;
        this.udf7 = udf7;
        this.udf8 = udf8;
        this.udf9 = udf9;
        this.udf10 = udf10;
        this.udf11 = udf11;
        this.udf12 = udf12;
        this.udf13 = udf13;
        this.udf14 = udf14;
        this.udf15 = udf15;
        this.udf16 = udf16;
        this.udf17 = udf17;
        this.udf18 = udf18;
        this.udf19 = udf19;
        this.udf20 = udf20;
        this.payerAddress = payerAddress;
        this.amountType = amountType;
        this.mcc = mcc;
        this.transDate = transDate;
        this.programId = programId;
        this.showSabPaisaPaymentScreen = z2;
        this.salutation = salutation2;
        this.clientTransactionId = str6;
        this.callbackUrl = str7;
        this.intermediateLoading = bool;
        this.selectedEnv = selectedEnv;
    }

    public /* synthetic */ SabPaisaGateway(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
