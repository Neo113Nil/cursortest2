package f4;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: f4.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1086C implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f12908c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1084A f12910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1091c f12912g;

    public C1086C(C1091c c1091c, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, C1084A c1084a, TaskCompletionSource taskCompletionSource) {
        this.f12906a = firebaseAuth;
        this.f12907b = str;
        this.f12908c = activity;
        this.f12909d = z4;
        this.f12910e = c1084a;
        this.f12911f = taskCompletionSource;
        this.f12912g = c1091c;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("c", "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        boolean s7 = this.f12906a.m().s();
        TaskCompletionSource taskCompletionSource = this.f12911f;
        if (!s7) {
            taskCompletionSource.setResult(new F(null, null, null));
        } else {
            this.f12912g.c(this.f12906a, this.f12907b, this.f12908c, this.f12909d, false, this.f12910e, taskCompletionSource);
        }
    }
}
