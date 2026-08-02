package E4;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2222b;

    public /* synthetic */ q(int i7, TaskCompletionSource taskCompletionSource) {
        this.f2221a = i7;
        this.f2222b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f2221a) {
            case 0:
                this.f2222b.setResult((Map) obj);
                break;
            default:
                this.f2222b.setResult(obj);
                break;
        }
    }
}
