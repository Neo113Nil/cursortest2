package io.github.sabpaisaandroid.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.haryanvi.netstream.R;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.github.sabpaisaandroid.SabPaisaGateway;
import io.github.sabpaisaandroid.dialog.c;
import io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack;
import io.github.sabpaisaandroid.models.CreditCardResponse;
import io.github.sabpaisaandroid.models.EncryptModel;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import io.github.sabpaisaandroid.models.SabPaisaFraudModel;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import io.github.sabpaisaandroid.network.SabPaisaEndPoints;
import io.github.sabpaisaandroid.network.SabPaisaFraudEndPoints;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b*\u00014\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JS\u0010,\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020\b2\u0014\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00040)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b3\u0010\u000bR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010:R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010E¨\u0006G"}, d2 = {"Lio/github/sabpaisaandroid/activity/WebViewActivityLite;", "Lio/github/sabpaisaandroid/activity/e;", "<init>", "()V", "", "backPressed", "callApiToGetStatusAndReturn", "checkForFraud", "", "url", "checkWebviewLoadedData", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "webView", "createWebPagePrint", "(Landroid/webkit/WebView;)V", Constants.KEY, "iv", "string", "Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;", "Lio/github/sabpaisaandroid/models/EncryptModelResponse;", "iApiSuccessCallBack", "encryptNetworkCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;)V", "", "forceAbort", "handleFaliureResponse", "(Z)V", "handleSuccessResponse", "loadEncryptedData", "", "resultCode", "processCallback", "(I)V", "Landroid/app/Application;", "appContext", "clientCode", "", "amount", "clientTransactionId", "selectedEnv", "Lkotlin/Function1;", "Lio/github/sabpaisaandroid/models/SabPaisaFraudModel;", "callback", "putLogForFraudDetection", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "verifyInstallerId", "(Landroid/content/Context;)Z", "webViewPostData", "webViewTask", "io/github/sabpaisaandroid/activity/WebViewActivityLite$backPressedCallback$1", "backPressedCallback", "Lio/github/sabpaisaandroid/activity/WebViewActivityLite$backPressedCallback$1;", "Ljava/lang/String;", "clientTxn", "isChallanGenerated", "Z", "onFinishedCalled", "Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "transactionResponsesModel", "Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "getTransactionResponsesModel", "()Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "setTransactionResponsesModel", "(Lio/github/sabpaisaandroid/models/TransactionResponsesModel;)V", "upiAppOpened", "upiIntentIdentifier", "Landroid/webkit/WebView;", "Companion", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewActivityLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewActivityLite.kt\nio/github/sabpaisaandroid/activity/WebViewActivityLite\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,583:1\n29#2:584\n13374#3,3:585\n1#4:588\n*S KotlinDebug\n*F\n+ 1 WebViewActivityLite.kt\nio/github/sabpaisaandroid/activity/WebViewActivityLite\n*L\n251#1:584\n504#1:585,3\n*E\n"})
/* loaded from: classes3.dex */
public final class WebViewActivityLite extends io.github.sabpaisaandroid.activity.e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static IPaymentSuccessCallBack<TransactionResponsesModel> q;
    public WebView j;
    public boolean k;
    public TransactionResponsesModel l;
    public boolean m;
    public String o;
    public final String n = "/pay?p";
    public final a p = new a();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/github/sabpaisaandroid/activity/WebViewActivityLite$Companion;", "", "()V", "TRANSACTION_RESPONSE_MODEL_CODE", "", "iPaymentSuccessCallBack", "Lio/github/sabpaisaandroid/interfaces/IPaymentSuccessCallBack;", "Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "getIPaymentSuccessCallBack", "()Lio/github/sabpaisaandroid/interfaces/IPaymentSuccessCallBack;", "setIPaymentSuccessCallBack", "(Lio/github/sabpaisaandroid/interfaces/IPaymentSuccessCallBack;)V", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final IPaymentSuccessCallBack<TransactionResponsesModel> getIPaymentSuccessCallBack() {
            return WebViewActivityLite.q;
        }

        public final void setIPaymentSuccessCallBack(IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack) {
            WebViewActivityLite.q = iPaymentSuccessCallBack;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class a extends OnBackPressedCallback {
        public a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            WebViewActivityLite activity = WebViewActivityLite.this;
            if (activity.k || activity.m) {
                activity.y();
                return;
            }
            io.github.sabpaisaandroid.activity.f fVar = new io.github.sabpaisaandroid.activity.f(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            c.a aVar = io.github.sabpaisaandroid.dialog.c.Companion;
            io.github.sabpaisaandroid.activity.d iSelectionCallBack = new io.github.sabpaisaandroid.activity.d(fVar);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(iSelectionCallBack, "iSelectionCallBack");
            io.github.sabpaisaandroid.dialog.c cVar = new io.github.sabpaisaandroid.dialog.c(iSelectionCallBack);
            activity.c = cVar;
            cVar.setCancelable(false);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            io.github.sabpaisaandroid.dialog.c cVar2 = activity.c;
            Intrinsics.checkNotNull(cVar2);
            cVar2.show(supportFragmentManager, "");
        }
    }

    public static final class b extends Lambda implements Function1<TransactionResponsesModel, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
            TransactionResponsesModel successCallBackLocal = transactionResponsesModel;
            Intrinsics.checkNotNullParameter(successCallBackLocal, "successCallBackLocal");
            WebViewActivityLite webViewActivityLite = WebViewActivityLite.this;
            webViewActivityLite.t(successCallBackLocal, new g(successCallBackLocal, webViewActivityLite));
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1<TransactionResponsesModel, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
            WebViewActivityLite webViewActivityLite = WebViewActivityLite.this;
            webViewActivityLite.u(false, webViewActivityLite.l, new h(transactionResponsesModel, webViewActivityLite));
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function3<String, String, String, Unit> {
        public d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, String str2, String str3) {
            String it1 = str;
            String it2 = str2;
            String it3 = str3;
            Intrinsics.checkNotNullParameter(it1, "it1");
            Intrinsics.checkNotNullParameter(it2, "it2");
            Intrinsics.checkNotNullParameter(it3, "it3");
            WebViewActivityLite webViewActivityLite = WebViewActivityLite.this;
            if (webViewActivityLite.b != null) {
                io.github.sabpaisaandroid.viewmodels.a.a(webViewActivityLite, it2, it3, it1, new k(webViewActivityLite));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1<TransactionResponsesModel, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
            TransactionResponsesModel it = transactionResponsesModel;
            Intrinsics.checkNotNullParameter(it, "it");
            IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack = WebViewActivityLite.INSTANCE.getIPaymentSuccessCallBack();
            WebViewActivityLite webViewActivityLite = WebViewActivityLite.this;
            if (iPaymentSuccessCallBack != null) {
                iPaymentSuccessCallBack.onPaymentSuccess(webViewActivityLite.l);
            }
            webViewActivityLite.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1<TransactionResponsesModel, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
            IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack = WebViewActivityLite.INSTANCE.getIPaymentSuccessCallBack();
            WebViewActivityLite webViewActivityLite = WebViewActivityLite.this;
            if (iPaymentSuccessCallBack != null) {
                iPaymentSuccessCallBack.onPaymentFail(webViewActivityLite.l);
            }
            webViewActivityLite.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        WebSettings settings;
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setContentView(R.layout.sabpaisa_activity_web_view_lite);
        WebView webView = (WebView) findViewById(R.id.sabpaisa_webview);
        this.j = webView;
        if (webView != null && (settings = webView.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setCacheMode(2);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
        }
        WebView webView2 = this.j;
        if (webView2 != null) {
            webView2.loadData("<html><body><br/><br/><br/><br/> <br/><br/><br/> <br/><br/><br/> <h2 style='text-align: center;'> Processing...</h2>        </body>       </html>", "text/html", "UTF-8");
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.o = extras.getString("clientCode", "");
        }
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        String str4 = this.o;
        Double valueOf = Double.valueOf(getIntent().getDoubleExtra("amount", 0.0d));
        String stringExtra = getIntent().getStringExtra("clienttransactionid");
        String stringExtra2 = getIntent().getStringExtra("selectedenv");
        if (stringExtra2 == null) {
            stringExtra2 = "staging";
        }
        final j jVar = new j(this);
        if (!Intrinsics.areEqual(stringExtra2, "prod")) {
            jVar.invoke(null);
            return;
        }
        application.getPackageName();
        SabPaisaGateway.Companion companion = SabPaisaGateway.INSTANCE;
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        companion.getClass();
        Intrinsics.checkNotNullParameter(packageName, "<set-?>");
        SabPaisaGateway.packageName = packageName;
        String installerPackageName = application.getPackageManager().getInstallerPackageName(application.getPackageName());
        if (installerPackageName == null) {
            installerPackageName = "getting null";
        }
        String str5 = installerPackageName;
        Intrinsics.checkNotNull(str5);
        if (Build.VERSION.SDK_INT >= 30) {
            application.getPackageManager().getInstallSourceInfo(application.getPackageName());
        }
        application.getTheme().getResources().getAssets().list("");
        String[] list = application.getTheme().getResources().getAssets().list("");
        if (list != null) {
            Intrinsics.checkNotNull(list);
            str = "";
            for (String str6 : list) {
                str = str + str6 + ',';
            }
        } else {
            str = "";
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            application.getOpPackageName();
        }
        if (i >= 30) {
            application.getAttributionTag();
        }
        application.getPackageResourcePath().getClass();
        String str7 = application.getPackageResourcePath().toString();
        SabPaisaGateway.INSTANCE.getClass();
        str2 = SabPaisaGateway.packageName;
        String valueOf2 = String.valueOf(valueOf);
        String str8 = str;
        str3 = SabPaisaGateway.initUrl;
        SabPaisaFraudModel sabPaisaFraudModel = new SabPaisaFraudModel(str2, str8, "ANDROID", str4, valueOf2, str7, str3, application.getString(R.string.version), stringExtra, str5, null, null, 3072, null);
        if (io.github.sabpaisaandroid.network.c.a == null) {
            io.github.sabpaisaandroid.network.c.b = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(io.github.sabpaisaandroid.network.c.g);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addNetworkInterceptor(new io.github.sabpaisaandroid.network.e());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(10L, timeUnit).writeTimeout(20L, timeUnit).readTimeout(30L, timeUnit).cache(null).build();
            Retrofit.Builder builder2 = io.github.sabpaisaandroid.network.c.b;
            io.github.sabpaisaandroid.network.c.a = builder2 != null ? builder2.build() : null;
        }
        Retrofit retrofit = io.github.sabpaisaandroid.network.c.a;
        SabPaisaFraudEndPoints sabPaisaFraudEndPoints = retrofit != null ? (SabPaisaFraudEndPoints) retrofit.create(SabPaisaFraudEndPoints.class) : null;
        Call<SabPaisaFraudModel> a2 = sabPaisaFraudEndPoints != null ? sabPaisaFraudEndPoints.a(sabPaisaFraudModel) : null;
        Intrinsics.checkNotNullParameter("", "requestObject");
        if (a2 != null) {
            a2.enqueue(new Callback<SabPaisaFraudModel>() { // from class: io.github.sabpaisaandroid.activity.WebViewActivityLite$putLogForFraudDetection$2
                @Override // retrofit2.Callback
                public final void onFailure(Call<SabPaisaFraudModel> call, Throwable t) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t, "t");
                    j.this.invoke(null);
                }

                @Override // retrofit2.Callback
                public final void onResponse(Call<SabPaisaFraudModel> call, Response<SabPaisaFraudModel> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    j.this.invoke(response.body());
                }
            });
        }
    }

    public final void v(int i) {
        if (i == 902 || i == 906) {
            TransactionResponsesModel transactionResponsesModel = this.l;
            Intrinsics.checkNotNull(transactionResponsesModel);
            t(transactionResponsesModel, new e());
        } else {
            TransactionResponsesModel transactionResponsesModel2 = this.l;
            Intrinsics.checkNotNull(transactionResponsesModel2);
            u(false, transactionResponsesModel2, new f());
        }
    }

    public final void w(WebView webView) {
        Context applicationContext;
        String str;
        Object systemService = getSystemService("print");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        PrintManager printManager = (PrintManager) systemService;
        PrintDocumentAdapter createPrintDocumentAdapter = webView != null ? webView.createPrintDocumentAdapter("Challan") : null;
        String str2 = getString(R.string.email_id) + " Document";
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setMediaSize(PrintAttributes.MediaSize.ISO_A5);
        PrintJob print = createPrintDocumentAdapter != null ? printManager.print(str2, createPrintDocumentAdapter, builder.build()) : null;
        if (print != null) {
            if (print.isCompleted()) {
                applicationContext = getApplicationContext();
                str = "Print Completed";
            } else if (print.isFailed()) {
                applicationContext = getApplicationContext();
                str = "Print Failed";
            }
            Toast.makeText(applicationContext, str, 1).show();
        }
        this.k = true;
    }

    public final void x(String url) {
        String str;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            SabPaisaGateway.INSTANCE.getClass();
            str = SabPaisaGateway.CALLBACK_URL;
            contains$default = StringsKt__StringsKt.contains$default(url, str, false, 2, (Object) null);
            if (contains$default) {
                int i = io.github.sabpaisaandroid.utils.a.a;
                io.github.sabpaisaandroid.utils.a.a(url, this.a, new d());
                return;
            }
            contains$default2 = StringsKt__StringsKt.contains$default(url, "challan/challanRegenerate", false, 2, (Object) null);
            if (contains$default2) {
                w(this.j);
                return;
            }
            contains$default3 = StringsKt__StringsKt.contains$default(url, this.n, false, 2, (Object) null);
            if (contains$default3) {
                this.m = true;
                Uri parse = Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                startActivity(new Intent("android.intent.action.VIEW", parse));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void y() {
        PaymentDetailsModel paymentDetailsModel = this.a;
        b successCallBackLocal = new b();
        c faliureCallBackLocal = new c();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(successCallBackLocal, "successCallBackLocal");
        Intrinsics.checkNotNullParameter(faliureCallBackLocal, "faliureCallBackLocal");
        if (this.b != null) {
            String key = paymentDetailsModel != null ? paymentDetailsModel.getAes_api_key() : null;
            Intrinsics.checkNotNull(key);
            String iv = paymentDetailsModel.getAes_api_iv();
            Intrinsics.checkNotNull(iv);
            String string = "clientCode=" + paymentDetailsModel.getClientCode() + "&clientTxnId=" + paymentDetailsModel.getClientTxnid();
            io.github.sabpaisaandroid.activity.c iApiSuccessCallBack = new io.github.sabpaisaandroid.activity.c(successCallBackLocal, faliureCallBackLocal, this, paymentDetailsModel);
            Intrinsics.checkNotNullParameter(this, "activity");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(iv, "iv");
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(iApiSuccessCallBack, "iApiSuccessCallBack");
            final EncryptModel encryptModel = new EncryptModel(null, null, null, null, null, key, iv, string, 31, null);
            final io.github.sabpaisaandroid.viewmodels.b iApiSuccessCallBack2 = new io.github.sabpaisaandroid.viewmodels.b(iApiSuccessCallBack, this);
            Intrinsics.checkNotNullParameter(encryptModel, "encryptModel");
            Intrinsics.checkNotNullParameter(iApiSuccessCallBack2, "iApiSuccessCallBack");
            Retrofit a2 = io.github.sabpaisaandroid.network.c.a();
            SabPaisaEndPoints sabPaisaEndPoints = a2 != null ? (SabPaisaEndPoints) a2.create(SabPaisaEndPoints.class) : null;
            Call<EncryptModelResponse> b2 = sabPaisaEndPoints != null ? sabPaisaEndPoints.b(encryptModel) : null;
            String requestObject = new Gson().toJson(encryptModel);
            Intrinsics.checkNotNullExpressionValue(requestObject, "toJson(...)");
            Intrinsics.checkNotNullParameter(requestObject, "requestObject");
            if (b2 != null) {
                b2.enqueue(new Callback<EncryptModelResponse>() { // from class: io.github.sabpaisaandroid.activity.SabPaisaActivity$encryptCardData$1
                    @Override // retrofit2.Callback
                    public final void onFailure(Call<EncryptModelResponse> requestUrl, Throwable th) {
                        Intrinsics.checkNotNullParameter(requestUrl, "call");
                        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
                        if (th != null) {
                            th.getMessage();
                        }
                        io.github.sabpaisaandroid.viewmodels.b bVar = iApiSuccessCallBack2;
                        if (th == null) {
                            bVar.getClass();
                            return;
                        }
                        WebViewActivityLite webViewActivityLite = bVar.b;
                        Intrinsics.checkNotNull(webViewActivityLite);
                        webViewActivityLite.r(webViewActivityLite, th);
                    }

                    @Override // retrofit2.Callback
                    public final void onResponse(Call<EncryptModelResponse> call, Response<EncryptModelResponse> response) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        EncryptModelResponse body = response.body();
                        if (body != null) {
                            iApiSuccessCallBack2.a(body);
                        }
                        if (response.body() == null) {
                            String toJson = new Gson().toJson(EncryptModel.this);
                            Intrinsics.checkNotNullExpressionValue(toJson, "toJson(...)");
                            Intrinsics.checkNotNullParameter(response, "response");
                            Intrinsics.checkNotNullParameter(toJson, "toJson");
                            try {
                                Gson gson = new Gson();
                                ResponseBody errorBody = response.errorBody();
                                String string2 = errorBody != null ? errorBody.string() : null;
                                Intrinsics.checkNotNull(string2);
                                Object fromJson = gson.fromJson(string2, (Class<Object>) CreditCardResponse.class);
                                Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                                ((CreditCardResponse) fromJson).getErrorMessage();
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }
}
