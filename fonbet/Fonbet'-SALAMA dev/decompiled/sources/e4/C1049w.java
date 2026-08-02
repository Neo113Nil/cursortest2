package e4;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import f4.C1096h;
import f4.InterfaceC1097i;

/* renamed from: e4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1049w implements InterfaceC1097i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12720b;

    public C1049w(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f12719a = firebaseUser;
        this.f12720b = firebaseAuth;
    }

    @Override // f4.InterfaceC1099k
    public final void zza(Status status) {
        int i7 = status.f11082a;
        if (i7 == 17011 || i7 == 17021 || i7 == 17005) {
            FirebaseAuth firebaseAuth = this.f12720b;
            firebaseAuth.p();
            f4.u uVar = firebaseAuth.f11871x;
            if (uVar != null) {
                C1096h c1096h = uVar.f12968b;
                c1096h.f12941d.removeCallbacks(c1096h.f12942e);
            }
        }
    }
}
