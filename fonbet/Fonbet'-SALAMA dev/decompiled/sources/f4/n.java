package f4;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1091c f12951a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f12952b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f12953c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Activity f12954d;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f12951a.getClass();
        boolean isSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.f12952b;
        if (isSuccessful && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new F(null, ((IntegrityTokenResponse) task.getResult()).token(), null));
        } else {
            w1.L.n("Play Integrity Token fetch failed, falling back to Recaptcha", task.getException() == null ? "" : task.getException().getMessage(), "c");
            C1091c.b(this.f12953c, this.f12954d, taskCompletionSource);
        }
    }
}
