package e4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import f4.C1096h;
import f4.InterfaceC1088E;
import f4.InterfaceC1099k;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029c implements InterfaceC1099k, InterfaceC1088E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12675b;

    public /* synthetic */ C1029c(FirebaseAuth firebaseAuth, int i7) {
        this.f12674a = i7;
        this.f12675b = firebaseAuth;
    }

    @Override // f4.InterfaceC1088E
    public final void a(zzagl zzaglVar, FirebaseUser firebaseUser) {
        switch (this.f12674a) {
            case 0:
                D.i(zzaglVar);
                D.i(firebaseUser);
                ((zzad) firebaseUser).f11908a = zzaglVar;
                FirebaseAuth firebaseAuth = this.f12675b;
                firebaseAuth.getClass();
                FirebaseAuth.k(firebaseAuth, firebaseUser, zzaglVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f12675b;
                firebaseAuth2.getClass();
                FirebaseAuth.k(firebaseAuth2, firebaseUser, zzaglVar, true, true);
                break;
        }
    }

    @Override // f4.InterfaceC1099k
    public final void zza(Status status) {
        switch (this.f12674a) {
            case 0:
                int i7 = status.f11082a;
                if (i7 == 17011 || i7 == 17021 || i7 == 17005 || i7 == 17091) {
                    FirebaseAuth firebaseAuth = this.f12675b;
                    firebaseAuth.p();
                    f4.u uVar = firebaseAuth.f11871x;
                    if (uVar != null) {
                        C1096h c1096h = uVar.f12968b;
                        c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                        break;
                    }
                }
                break;
            default:
                int i8 = status.f11082a;
                if (i8 == 17011 || i8 == 17021 || i8 == 17005) {
                    FirebaseAuth firebaseAuth2 = this.f12675b;
                    firebaseAuth2.p();
                    f4.u uVar2 = firebaseAuth2.f11871x;
                    if (uVar2 != null) {
                        C1096h c1096h2 = uVar2.f12968b;
                        c1096h2.f12941d.removeCallbacks(c1096h2.f12942e);
                        break;
                    }
                }
                break;
        }
    }
}
