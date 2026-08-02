package f4;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: f4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1085B implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12905b;

    public /* synthetic */ C1085B(int i7, TaskCompletionSource taskCompletionSource) {
        this.f12904a = i7;
        this.f12905b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f12904a) {
            case 0:
                this.f12905b.setResult(new F(null, null, (String) obj));
                break;
            default:
                this.f12905b.setResult(new F((String) obj, null, null));
                break;
        }
    }
}
