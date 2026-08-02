package androidx.credentials.playservices;

import W.d;
import a3.C0620d;
import a3.C0621e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.p000authapi.zbaw;
import com.google.android.gms.internal.p000authapi.zbbg;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import q3.AbstractC1554a;
import s3.C1592a;
import t6.h;
import t6.i;
import u1.c;
import w1.C1718l0;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9098c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f9099a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9100b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f9099a;
        if (resultReceiver != null) {
            resultReceiver.send(i8, bundle);
        }
        this.f9100b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i7 = 2;
        final int i8 = 3;
        final int i9 = 1;
        super.onCreate(bundle);
        final int i10 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f9099a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f9100b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f9100b) {
            return;
        }
        if (stringExtra != null) {
            Task task = null;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (beginSignInRequest != null) {
                            Task beginSignIn = new zbbg((Activity) this, new C0621e()).beginSignIn(beginSignInRequest);
                            final d dVar = new d(this, intExtra, 0);
                            task = beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: W.b
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    i iVar = dVar;
                                    switch (i8) {
                                        case 0:
                                            int i11 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: W.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f6685b;

                                {
                                    this.f6685b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.f6685b;
                                    switch (i8) {
                                        case 0:
                                            int i11 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.f9099a;
                                            h.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.f9099a;
                                            h.b(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.f9099a;
                                            h.b(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.f9099a;
                                            h.b(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
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
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (publicKeyCredentialCreationOptions != null) {
                            int i11 = AbstractC1554a.f15848a;
                            com.google.android.gms.common.api.d dVar2 = e.f11086o;
                            C1718l0 c1718l0 = new C1718l0(15);
                            Looper mainLooper = getMainLooper();
                            D.j(mainLooper, "Looper must not be null.");
                            C1592a c1592a = new C1592a(this, this, C1592a.f16145a, dVar2, new k(c1718l0, mainLooper));
                            C0844v a2 = AbstractC0845w.a();
                            a2.f11196c = new c(c1592a, publicKeyCredentialCreationOptions);
                            a2.f11194a = 5407;
                            Task doRead = c1592a.doRead(a2.e());
                            final d dVar3 = new d(this, intExtra2, 2);
                            task = doRead.addOnSuccessListener(new OnSuccessListener() { // from class: W.b
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    i iVar = dVar3;
                                    switch (i10) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: W.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f6685b;

                                {
                                    this.f6685b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.f6685b;
                                    switch (i10) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.f9099a;
                                            h.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.f9099a;
                                            h.b(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.f9099a;
                                            h.b(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.f9099a;
                                            h.b(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
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
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (savePasswordRequest != null) {
                            Task savePassword = new zbaw((Activity) this, new C0620d()).savePassword(savePasswordRequest);
                            final d dVar4 = new d(this, intExtra3, 1);
                            task = savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: W.b
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    i iVar = dVar4;
                                    switch (i9) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: W.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f6685b;

                                {
                                    this.f6685b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.f6685b;
                                    switch (i9) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.f9099a;
                                            h.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.f9099a;
                                            h.b(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.f9099a;
                                            h.b(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.f9099a;
                                            h.b(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
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
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (getSignInIntentRequest != null) {
                            Task signInIntent = new zbbg((Activity) this, new C0621e()).getSignInIntent(getSignInIntentRequest);
                            final d dVar5 = new d(this, intExtra4, 3);
                            task = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: W.b
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    i iVar = dVar5;
                                    switch (i7) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            ((d) iVar).invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: W.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f6685b;

                                {
                                    this.f6685b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.f6685b;
                                    switch (i7) {
                                        case 0:
                                            int i112 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.f9099a;
                                            h.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i12 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.f9099a;
                                            h.b(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i13 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.f9099a;
                                            h.b(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i14 = HiddenActivity.f9098c;
                                            h.e(hiddenActivity, "this$0");
                                            h.e(exc, "e");
                                            if ((exc instanceof j) && X.a.f7420a.contains(Integer.valueOf(((j) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.f9099a;
                                            h.b(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
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
    public final void onSaveInstanceState(Bundle bundle) {
        h.e(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f9100b);
        super.onSaveInstanceState(bundle);
    }
}
