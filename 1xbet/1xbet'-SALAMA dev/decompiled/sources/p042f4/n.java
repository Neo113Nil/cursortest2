package p042f4;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ C0894c f12957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f12958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f12959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Activity f12960d;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f12957a.getClass();
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.f12958b;
        if (zIsSuccessful && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new F(null, ((IntegrityTokenResponse) task.getResult()).token(), null));
        } else {
            L.n("Play Integrity Token fetch failed, falling back to Recaptcha", task.getException() == null ? "" : task.getException().getMessage(), "c");
            C0894c.b(this.f12959c, this.f12960d, taskCompletionSource);
        }
    }
}
