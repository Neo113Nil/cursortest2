package p042f4;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12911b;

    public /* synthetic */ B(int i7, TaskCompletionSource taskCompletionSource) {
        this.f12910a = i7;
        this.f12911b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f12910a) {
            case 0:
                this.f12911b.setResult(new F(null, null, (String) obj));
                break;
            default:
                this.f12911b.setResult(new F((String) obj, null, null));
                break;
        }
    }
}
