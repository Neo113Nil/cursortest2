package io.github.sabpaisaandroid.activity;

import android.app.Activity;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.haryanvi.netstream.R;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.dialog.e;
import io.github.sabpaisaandroid.dialog.f;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import io.github.sabpaisaandroid.models.PaymentStatusResponseModel;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0010\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010!\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00002\u001a\b\u0002\u0010 \u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J9\u0010&\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\t2\u0016\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010!\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010C¨\u0006D"}, d2 = {"Lio/github/sabpaisaandroid/activity/e;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "paymentDetailsModel", "Lio/github/sabpaisaandroid/models/PaymentStatusResponseModel;", "response", "Lkotlin/Function1;", "Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "", "successCallBackLocal", "faliureCallBackLocal", "callStatusAPI", "(Lio/github/sabpaisaandroid/models/PaymentDetailsModel;Lio/github/sabpaisaandroid/models/PaymentStatusResponseModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "activity", "checkPaymentStatus", "(Lio/github/sabpaisaandroid/models/PaymentDetailsModel;Lio/github/sabpaisaandroid/activity/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "createSuccessSound", "Lio/github/sabpaisaandroid/models/EncryptModel;", "encryptModel", "Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;", "Lio/github/sabpaisaandroid/models/EncryptModelResponse;", "iApiSuccessCallBack", "decryptData", "(Lio/github/sabpaisaandroid/models/EncryptModel;Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;)V", "encryptCardData", "Landroid/app/Activity;", "", "t", "isInternetAvailable", "(Landroid/app/Activity;Ljava/lang/Throwable;)V", "failureCallBackLocal", "showCancelDialog", "(Lio/github/sabpaisaandroid/activity/e;Lkotlin/jvm/functions/Function1;)V", "", "showFraudError", "transactionResponsesModel", "showPaymentFailedDialog", "(ZLio/github/sabpaisaandroid/models/TransactionResponsesModel;Lkotlin/jvm/functions/Function1;)V", "showPaymentSuccessDialog", "(Lio/github/sabpaisaandroid/models/TransactionResponsesModel;Lkotlin/jvm/functions/Function1;)V", "liteSdkEnabled", "Z", "getLiteSdkEnabled", "()Z", "setLiteSdkEnabled", "(Z)V", "Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "getPaymentDetailsModel", "()Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "setPaymentDetailsModel", "(Lio/github/sabpaisaandroid/models/PaymentDetailsModel;)V", "Lio/github/sabpaisaandroid/dialog/PaymentErrorDialogFragment;", "paymentErrorDialogFragment", "Lio/github/sabpaisaandroid/dialog/PaymentErrorDialogFragment;", "Lio/github/sabpaisaandroid/dialog/PaymentSuccessDialogFragment;", "paymentSuccessDialogFragment", "Lio/github/sabpaisaandroid/dialog/PaymentSuccessDialogFragment;", "Lio/github/sabpaisaandroid/viewmodels/a;", "sabPaisaActivityViewModel", "Lio/github/sabpaisaandroid/viewmodels/a;", "getSabPaisaActivityViewModel", "()Lio/github/sabpaisaandroid/viewmodels/a;", "setSabPaisaActivityViewModel", "(Lio/github/sabpaisaandroid/viewmodels/a;)V", "Lio/github/sabpaisaandroid/dialog/CancelDialogFragment;", "Lio/github/sabpaisaandroid/dialog/CancelDialogFragment;", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSabPaisaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SabPaisaActivity.kt\nio/github/sabpaisaandroid/activity/SabPaisaActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n1#2:369\n*E\n"})
/* loaded from: classes3.dex */
public class e extends AppCompatActivity {
    public static final /* synthetic */ int i = 0;
    public PaymentDetailsModel a;
    public io.github.sabpaisaandroid.viewmodels.a b;
    public io.github.sabpaisaandroid.dialog.c c;
    public io.github.sabpaisaandroid.dialog.f d;
    public final boolean e = true;
    public io.github.sabpaisaandroid.dialog.e f;

    public static final class a {
        public final /* synthetic */ TransactionResponsesModel a;
        public final /* synthetic */ Lambda b;
        public final /* synthetic */ e c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(TransactionResponsesModel transactionResponsesModel, Function1<? super TransactionResponsesModel, Unit> function1, e eVar) {
            this.a = transactionResponsesModel;
            this.b = (Lambda) function1;
            this.c = eVar;
        }
    }

    public static final class b {
        public final /* synthetic */ Lambda a;
        public final /* synthetic */ TransactionResponsesModel b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(TransactionResponsesModel transactionResponsesModel, Function1 function1) {
            this.a = (Lambda) function1;
            this.b = transactionResponsesModel;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.b = (io.github.sabpaisaandroid.viewmodels.a) new ViewModelProvider(this).get(io.github.sabpaisaandroid.viewmodels.a.class);
    }

    public final void r(Activity activity, Throwable t) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(t, "t");
        Toast.makeText(activity, !(t instanceof UnknownHostException) ? "Something went wrong...Please try later!" : getString(R.string.please_connect_to_internet), 0).show();
    }

    public final void s(PaymentDetailsModel paymentDetailsModel, PaymentStatusResponseModel paymentStatusResponseModel, WebViewActivityLite.b successCallBackLocal, WebViewActivityLite.c faliureCallBackLocal) {
        String statusResponseData;
        Intrinsics.checkNotNullParameter(paymentDetailsModel, "paymentDetailsModel");
        Intrinsics.checkNotNullParameter(successCallBackLocal, "successCallBackLocal");
        Intrinsics.checkNotNullParameter(faliureCallBackLocal, "faliureCallBackLocal");
        if (paymentStatusResponseModel == null || (statusResponseData = paymentStatusResponseModel.getStatusResponseData()) == null) {
            faliureCallBackLocal.invoke(null);
            return;
        }
        if (this.b != null) {
            String aes_api_key = paymentDetailsModel.getAes_api_key();
            Intrinsics.checkNotNull(aes_api_key);
            String aes_api_iv = paymentDetailsModel.getAes_api_iv();
            Intrinsics.checkNotNull(aes_api_iv);
            io.github.sabpaisaandroid.viewmodels.a.a(this, aes_api_key, aes_api_iv, statusResponseData, new io.github.sabpaisaandroid.activity.a(this, successCallBackLocal, faliureCallBackLocal));
        }
    }

    public final void t(TransactionResponsesModel transactionResponsesModel, Function1<? super TransactionResponsesModel, Unit> successCallBackLocal) {
        Intrinsics.checkNotNullParameter(transactionResponsesModel, "transactionResponsesModel");
        Intrinsics.checkNotNullParameter(successCallBackLocal, "successCallBackLocal");
        f.a aVar = io.github.sabpaisaandroid.dialog.f.Companion;
        b param = new b(transactionResponsesModel, successCallBackLocal);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(param, "param");
        io.github.sabpaisaandroid.dialog.f fVar = new io.github.sabpaisaandroid.dialog.f(param);
        this.d = fVar;
        fVar.setCancelable(false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        io.github.sabpaisaandroid.dialog.f fVar2 = this.d;
        Intrinsics.checkNotNull(fVar2);
        fVar2.show(supportFragmentManager, "");
        new Thread(new com.razorpay.m(this, 1)).start();
    }

    public final void u(boolean z, TransactionResponsesModel transactionResponsesModel, Function1<? super TransactionResponsesModel, Unit> failureCallBackLocal) {
        Intrinsics.checkNotNullParameter(failureCallBackLocal, "failureCallBackLocal");
        e.a aVar = io.github.sabpaisaandroid.dialog.e.Companion;
        a param = new a(transactionResponsesModel, failureCallBackLocal, this);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(param, "param");
        io.github.sabpaisaandroid.dialog.e eVar = new io.github.sabpaisaandroid.dialog.e(param, z);
        this.f = eVar;
        eVar.setCancelable(false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        io.github.sabpaisaandroid.dialog.e eVar2 = this.f;
        Intrinsics.checkNotNull(eVar2);
        eVar2.show(supportFragmentManager, "");
    }
}
