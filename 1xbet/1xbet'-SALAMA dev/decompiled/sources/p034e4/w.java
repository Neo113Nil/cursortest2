package p034e4;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p042f4.C0899h;
import p042f4.InterfaceC0900i;
import p042f4.u;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements InterfaceC0900i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12726b;

    public w(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f12725a = firebaseUser;
        this.f12726b = firebaseAuth;
    }

    @Override // p042f4.InterfaceC0902k
    public final void zza(Status status) {
        int i7 = status.f11082a;
        if (i7 == 17011 || i7 == 17021 || i7 == 17005) {
            FirebaseAuth firebaseAuth = this.f12726b;
            firebaseAuth.p();
            u uVar = firebaseAuth.f11871x;
            if (uVar != null) {
                C0899h c0899h = uVar.f12974b;
                c0899h.f12947d.removeCallbacks(c0899h.f12948e);
            }
        }
    }
}
