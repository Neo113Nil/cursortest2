package p042f4;

import B3.g;
import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: renamed from: f4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0903l implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12953c;

    public /* synthetic */ C0903l(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f12951a = i7;
        this.f12952b = taskCompletionSource;
        this.f12953c = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        switch (this.f12951a) {
            case 0:
                this.f12952b.setResult((AuthResult) obj);
                g.m(this.f12953c);
                break;
            case 1:
                this.f12952b.setResult((AuthResult) obj);
                g.m(this.f12953c);
                break;
            default:
                this.f12952b.setResult((AuthResult) obj);
                g.m(this.f12953c);
                break;
        }
    }
}
