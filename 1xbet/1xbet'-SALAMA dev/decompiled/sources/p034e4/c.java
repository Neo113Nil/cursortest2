package p034e4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import p042f4.C0899h;
import p042f4.E;
import p042f4.InterfaceC0902k;
import p042f4.u;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC0902k, E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12681b;

    public /* synthetic */ c(FirebaseAuth firebaseAuth, int i7) {
        this.f12680a = i7;
        this.f12681b = firebaseAuth;
    }

    @Override // p042f4.E
    public final void a(zzagl zzaglVar, FirebaseUser firebaseUser) {
        switch (this.f12680a) {
            case 0:
                D.i(zzaglVar);
                D.i(firebaseUser);
                ((zzad) firebaseUser).f11908a = zzaglVar;
                FirebaseAuth firebaseAuth = this.f12681b;
                firebaseAuth.getClass();
                FirebaseAuth.k(firebaseAuth, firebaseUser, zzaglVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f12681b;
                firebaseAuth2.getClass();
                FirebaseAuth.k(firebaseAuth2, firebaseUser, zzaglVar, true, true);
                break;
        }
    }

    @Override // p042f4.InterfaceC0902k
    public final void zza(Status status) {
        switch (this.f12680a) {
            case 0:
                int i7 = status.f11082a;
                if (i7 == 17011 || i7 == 17021 || i7 == 17005 || i7 == 17091) {
                    FirebaseAuth firebaseAuth = this.f12681b;
                    firebaseAuth.p();
                    u uVar = firebaseAuth.f11871x;
                    if (uVar != null) {
                        C0899h c0899h = uVar.f12974b;
                        c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                    }
                }
                break;
            default:
                int i8 = status.f11082a;
                if (i8 == 17011 || i8 == 17021 || i8 == 17005) {
                    FirebaseAuth firebaseAuth2 = this.f12681b;
                    firebaseAuth2.p();
                    u uVar2 = firebaseAuth2.f11871x;
                    if (uVar2 != null) {
                        C0899h c0899h2 = uVar2.f12974b;
                        c0899h2.f12947d.removeCallbacks(c0899h2.f12948e);
                    }
                }
                break;
        }
    }
}
