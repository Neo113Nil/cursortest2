package j4;

import b4.C0782b;
import com.google.android.gms.tasks.OnSuccessListener;
import d6.C0977k;
import e4.C1036j;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1316b implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0977k f14625b;

    public /* synthetic */ C1316b(C0977k c0977k, int i7) {
        this.f14624a = i7;
        this.f14625b = c0977k;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f14624a) {
            case 0:
                this.f14625b.q(((C0782b) obj).f10129a);
                break;
            default:
                this.f14625b.q(((C1036j) obj).f12681a);
                break;
        }
    }
}
