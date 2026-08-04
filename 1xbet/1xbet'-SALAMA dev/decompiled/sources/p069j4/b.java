package p069j4;

import com.google.android.gms.tasks.OnSuccessListener;
import p028d6.k;
import p034e4.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14631b;

    public /* synthetic */ b(k kVar, int i7) {
        this.f14630a = i7;
        this.f14631b = kVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f14630a) {
            case 0:
                this.f14631b.q(((p014b4.b) obj).f10129a);
                break;
            default:
                this.f14631b.q(((j) obj).f12687a);
                break;
        }
    }
}
