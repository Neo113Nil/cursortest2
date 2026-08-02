package f4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzad;
import e4.AbstractC1037k;
import e4.C1028b;
import e4.C1040n;
import e4.C1041o;

/* renamed from: f4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1094f {

    /* renamed from: a, reason: collision with root package name */
    public final zzad f12935a;

    public C1094f(zzad zzadVar) {
        this.f12935a = zzadVar;
    }

    public final Task a(AbstractC1037k abstractC1037k, String str) {
        com.google.android.gms.common.internal.D.i(abstractC1037k);
        zzad zzadVar = this.f12935a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c));
        firebaseAuth.getClass();
        if (abstractC1037k instanceof C1040n) {
            return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (C1040n) abstractC1037k, zzadVar, str, new C1028b(firebaseAuth));
        }
        if (!(abstractC1037k instanceof C1041o)) {
            return Tasks.forException(zzadg.zza(new Status(17499, null, null, null)));
        }
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (C1041o) abstractC1037k, zzadVar, str, firebaseAuth.f11858k, new C1028b(firebaseAuth));
    }
}
