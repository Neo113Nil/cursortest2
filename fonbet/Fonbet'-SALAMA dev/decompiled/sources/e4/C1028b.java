package e4;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import f4.InterfaceC1088E;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1028b implements InterfaceC1088E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12673a;

    public C1028b(FirebaseAuth firebaseAuth) {
        this.f12673a = firebaseAuth;
    }

    @Override // f4.InterfaceC1088E
    public final void a(zzagl zzaglVar, FirebaseUser firebaseUser) {
        D.i(zzaglVar);
        D.i(firebaseUser);
        ((zzad) firebaseUser).f11908a = zzaglVar;
        FirebaseAuth firebaseAuth = this.f12673a;
        firebaseAuth.getClass();
        FirebaseAuth.k(firebaseAuth, firebaseUser, zzaglVar, true, false);
    }
}
