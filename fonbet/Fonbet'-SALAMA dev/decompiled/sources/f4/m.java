package f4;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class m implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12950c;

    public /* synthetic */ m(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f12948a = i7;
        this.f12949b = taskCompletionSource;
        this.f12950c = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f12948a) {
            case 0:
                this.f12949b.setException(exc);
                B3.g.m(this.f12950c);
                break;
            case 1:
                this.f12949b.setException(exc);
                B3.g.m(this.f12950c);
                break;
            default:
                this.f12949b.setException(exc);
                B3.g.m(this.f12950c);
                break;
        }
    }
}
