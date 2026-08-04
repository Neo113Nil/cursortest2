package p042f4;

import Y3.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzad;
import p034e4.b;
import p034e4.k;
import p034e4.n;
import p034e4.o;

/* JADX INFO: renamed from: f4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0897f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzad f12941a;

    public C0897f(zzad zzadVar) {
        this.f12941a = zzadVar;
    }

    public final Task a(k kVar, String str) {
        D.i(kVar);
        zzad zzadVar = this.f12941a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(i.f(zzadVar.f11910c));
        firebaseAuth.getClass();
        if (kVar instanceof n) {
            return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (n) kVar, zzadVar, str, new b(firebaseAuth));
        }
        if (!(kVar instanceof o)) {
            return Tasks.forException(zzadg.zza(new Status(17499, null, null, null)));
        }
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (o) kVar, zzadVar, str, firebaseAuth.f11858k, new b(firebaseAuth));
    }
}
