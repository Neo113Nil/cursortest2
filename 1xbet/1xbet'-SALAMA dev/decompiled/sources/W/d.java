package W;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f6687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(HiddenActivity hiddenActivity, int i7, int i8) {
        super(1);
        this.f6686a = i8;
        this.f6687b = hiddenActivity;
        this.f6688c = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6686a) {
            case 0:
                HiddenActivity hiddenActivity = this.f6687b;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.f9100b = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.f10975a.getIntentSender(), this.f6688c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e7) {
                    ResultReceiver resultReceiver = hiddenActivity.f9099a;
                    h.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.f6687b;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.f9100b = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.f10993a.getIntentSender(), this.f6688c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e8) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f9099a;
                    h.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e8.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.f6687b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                h.e(pendingIntent, "result");
                try {
                    hiddenActivity3.f9100b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f6688c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e9) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f9099a;
                    h.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e9.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.f6687b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.f9100b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f6688c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f9099a;
                    h.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
                }
                break;
        }
        return p044f6.i.f13014a;
    }
}
