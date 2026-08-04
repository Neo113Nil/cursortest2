package com.google.firebase.auth;

import Y3.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzad;
import java.util.ArrayList;
import p034e4.c;
import p034e4.p;
import p042f4.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements p {
    public abstract String j();

    public abstract boolean k();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task m() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(i.f(((zzad) this).f11910c));
        firebaseAuth.getClass();
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, this, (z) new c(firebaseAuth, 0));
    }

    public abstract zzad n(ArrayList arrayList);

    public abstract void o(ArrayList arrayList);
}
