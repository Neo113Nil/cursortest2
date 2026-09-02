package g1;

import b1.AbstractC0030s;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.c implements Y0.f, U0.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1159a;

    public j(k kVar) {
        super(kVar, AbstractC0030s.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1159a = false;
    }

    @Override // kotlin.jvm.internal.c
    public final Y0.b compute() {
        return this.f1159a ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.c
    public final Y0.b computeReflected() {
        kotlin.jvm.internal.n.f6081a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getOwner().equals(jVar.getOwner()) && getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && kotlin.jvm.internal.j.a(getBoundReceiver(), jVar.getBoundReceiver());
        }
        if (obj instanceof Y0.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.c
    public final Y0.b getReflected() {
        if (this.f1159a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        Y0.b compute = compute();
        if (compute != this) {
            return (Y0.f) compute;
        }
        throw new T0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // U0.a
    public final Object invoke() {
        return this.receiver.getClass().getSimpleName();
    }

    public final String toString() {
        Y0.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
