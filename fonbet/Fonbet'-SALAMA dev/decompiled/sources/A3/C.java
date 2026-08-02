package A3;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.util.List;
import p.C1524k;
import p.C1525l;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f626a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f627b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f628c;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f626a) {
            case 0:
                C0056e c0056e = (C0056e) this.f627b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f628c;
                synchronized (c0056e.f645f) {
                    c0056e.f644e.remove(taskCompletionSource);
                }
                return;
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f627b;
                ResolveInfo resolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.f628c;
                if (resolveActivity == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzadk.zzb(genericIdpActivity, str);
                    return;
                }
                List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    C1525l a2 = new C1524k().a();
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    a2.a(genericIdpActivity, (Uri) task.getResult());
                    return;
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent2.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent2.addFlags(1073741824);
                    intent2.addFlags(268435456);
                    genericIdpActivity.startActivity(intent2);
                    return;
                }
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f627b;
                recaptchaActivity.getClass();
                ResolveInfo resolveActivity2 = recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0);
                String str2 = (String) this.f628c;
                if (resolveActivity2 == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzadk.zzb(recaptchaActivity, str2);
                    return;
                }
                List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices2 == null || queryIntentServices2.isEmpty()) {
                    Intent intent3 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent3.putExtra("com.android.browser.application_id", str2);
                    intent3.addFlags(1073741824);
                    intent3.addFlags(268435456);
                    recaptchaActivity.startActivity(intent3);
                    return;
                }
                C1525l a4 = new C1524k().a();
                Intent intent4 = a4.f15650a;
                intent4.addFlags(1073741824);
                intent4.addFlags(268435456);
                a4.a(recaptchaActivity, (Uri) task.getResult());
                return;
        }
    }

    public /* synthetic */ C(C0056e c0056e, TaskCompletionSource taskCompletionSource) {
        this.f626a = 0;
        this.f627b = c0056e;
        this.f628c = taskCompletionSource;
    }
}
