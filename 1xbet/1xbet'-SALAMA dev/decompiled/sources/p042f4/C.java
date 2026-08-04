package p042f4;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f12914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f12916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0894c f12918g;

    public C(C0894c c0894c, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, A a2, TaskCompletionSource taskCompletionSource) {
        this.f12912a = firebaseAuth;
        this.f12913b = str;
        this.f12914c = activity;
        this.f12915d = z4;
        this.f12916e = a2;
        this.f12917f = taskCompletionSource;
        this.f12918g = c0894c;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("c", "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        boolean zS = this.f12912a.m().s();
        TaskCompletionSource taskCompletionSource = this.f12917f;
        if (!zS) {
            taskCompletionSource.setResult(new F(null, null, null));
        } else {
            this.f12918g.c(this.f12912a, this.f12913b, this.f12914c, this.f12915d, false, this.f12916e, taskCompletionSource);
        }
    }
}
