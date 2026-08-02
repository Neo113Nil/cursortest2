package com.google.firebase.auth;

import Y3.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzad;
import e4.C1029c;
import e4.InterfaceC1042p;
import f4.z;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements InterfaceC1042p {
    public abstract String j();

    public abstract boolean k();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e4.c, f4.z] */
    public final Task m() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(i.f(((zzad) this).f11910c));
        firebaseAuth.getClass();
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, this, (z) new C1029c(firebaseAuth, 0));
    }

    public abstract zzad n(ArrayList arrayList);

    public abstract void o(ArrayList arrayList);
}
