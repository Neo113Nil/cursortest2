package E4;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2224b;

    public /* synthetic */ r(int i7, TaskCompletionSource taskCompletionSource) {
        this.f2223a = i7;
        this.f2224b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f2223a) {
            case 0:
                this.f2224b.setException(exc);
                break;
            default:
                this.f2224b.setException(exc);
                break;
        }
    }
}
