package p042f4;

import B3.g;
import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12956c;

    public /* synthetic */ m(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f12954a = i7;
        this.f12955b = taskCompletionSource;
        this.f12956c = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f12954a) {
            case 0:
                this.f12955b.setException(exc);
                g.m(this.f12956c);
                break;
            case 1:
                this.f12955b.setException(exc);
                g.m(this.f12956c);
                break;
            default:
                this.f12955b.setException(exc);
                g.m(this.f12956c);
                break;
        }
    }
}
