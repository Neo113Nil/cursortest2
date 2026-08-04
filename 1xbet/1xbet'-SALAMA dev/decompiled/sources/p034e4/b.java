package p034e4;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import p042f4.E;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12679a;

    public b(FirebaseAuth firebaseAuth) {
        this.f12679a = firebaseAuth;
    }

    @Override // p042f4.E
    public final void a(zzagl zzaglVar, FirebaseUser firebaseUser) {
        D.i(zzaglVar);
        D.i(firebaseUser);
        ((zzad) firebaseUser).f11908a = zzaglVar;
        FirebaseAuth firebaseAuth = this.f12679a;
        firebaseAuth.getClass();
        FirebaseAuth.k(firebaseAuth, firebaseUser, zzaglVar, true, false);
    }
}
