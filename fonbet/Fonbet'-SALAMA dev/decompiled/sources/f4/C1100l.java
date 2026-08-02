package f4;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* renamed from: f4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1100l implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12947c;

    public /* synthetic */ C1100l(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f12945a = i7;
        this.f12946b = taskCompletionSource;
        this.f12947c = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        switch (this.f12945a) {
            case 0:
                this.f12946b.setResult((AuthResult) obj);
                B3.g.m(this.f12947c);
                break;
            case 1:
                this.f12946b.setResult((AuthResult) obj);
                B3.g.m(this.f12947c);
                break;
            default:
                this.f12946b.setResult((AuthResult) obj);
                B3.g.m(this.f12947c);
                break;
        }
    }
}
