package androidx.credentials.playservices;

import AF.g;
import B90.C2609k;
import B90.C2611m;
import B90.C2613o;
import B90.C2615q;
import BY.h;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42443c = 0;

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f42444a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42445b;

    public static void a(HiddenActivity this$0, Exception e11) {
        String str;
        Set set;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11 instanceof ApiException) {
            I2.a.f11796a.getClass();
            set = I2.a.f11797b;
            if (set.contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) {
                str = "GET_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.f42444a;
                Intrinsics.f(resultReceiver);
                this$0.h(resultReceiver, str, "During begin sign in, failure response from one tap: " + e11.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver2 = this$0.f42444a;
        Intrinsics.f(resultReceiver2);
        this$0.h(resultReceiver2, str, "During begin sign in, failure response from one tap: " + e11.getMessage());
    }

    public static void b(HiddenActivity this$0, Exception e11) {
        String str;
        Set set;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11 instanceof ApiException) {
            I2.a.f11796a.getClass();
            set = I2.a.f11797b;
            if (set.contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) {
                str = "GET_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.f42444a;
                Intrinsics.f(resultReceiver);
                this$0.h(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e11.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver2 = this$0.f42444a;
        Intrinsics.f(resultReceiver2);
        this$0.h(resultReceiver2, str, "During get sign-in intent, failure response from one tap: " + e11.getMessage());
    }

    public static void c(HiddenActivity this$0, Exception e11) {
        String str;
        Set set;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11 instanceof ApiException) {
            I2.a.f11796a.getClass();
            set = I2.a.f11797b;
            if (set.contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) {
                str = "CREATE_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.f42444a;
                Intrinsics.f(resultReceiver);
                this$0.h(resultReceiver, str, "During create public key credential, fido registration failure: " + e11.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        ResultReceiver resultReceiver2 = this$0.f42444a;
        Intrinsics.f(resultReceiver2);
        this$0.h(resultReceiver2, str, "During create public key credential, fido registration failure: " + e11.getMessage());
    }

    public static void d(HiddenActivity this$0, Exception e11) {
        String str;
        Set set;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11 instanceof ApiException) {
            I2.a.f11796a.getClass();
            set = I2.a.f11797b;
            if (set.contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) {
                str = "CREATE_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.f42444a;
                Intrinsics.f(resultReceiver);
                this$0.h(resultReceiver, str, "During save password, found password failure response from one tap " + e11.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        ResultReceiver resultReceiver2 = this$0.f42444a;
        Intrinsics.f(resultReceiver2);
        this$0.h(resultReceiver2, str, "During save password, found password failure response from one tap " + e11.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i11);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f42444a;
        if (resultReceiver != null) {
            resultReceiver.send(i12, bundle);
        }
        this.f42445b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f42444a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f42445b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f42445b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((beginSignInRequest != null ? Identity.getSignInClient((Activity) this).beginSignIn(beginSignInRequest).addOnSuccessListener(new H2.c(new b(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)), 0)).addOnFailureListener(new C2615q(this, 2)) : null) == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((publicKeyCredentialCreationOptions != null ? Fido.getFido2ApiClient((Activity) this).getRegisterPendingIntent(publicKeyCredentialCreationOptions).addOnSuccessListener(new g(new d(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)), 1)).addOnFailureListener(new C2609k(this)) : null) == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((savePasswordRequest != null ? Identity.getCredentialSavingClient((Activity) this).savePassword(savePasswordRequest).addOnSuccessListener(new DF.a(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)), 1)).addOnFailureListener(new C2611m(this)) : null) == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((getSignInIntentRequest != null ? Identity.getSignInClient((Activity) this).getSignInIntent(getSignInIntentRequest).addOnSuccessListener(new h(new e(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)), 2)).addOnFailureListener(new C2613o(this, 1)) : null) == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f42445b);
        super.onSaveInstanceState(outState);
    }
}
