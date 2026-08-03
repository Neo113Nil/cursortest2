package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class m extends kotlin.jvm.internal.b implements w1.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7957a;

    public m(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        super(obj, cls, str, str2, true);
        this.f7957a = false;
    }

    @Override // kotlin.jvm.internal.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w1.g getReflected() {
        if (this.f7957a) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        w1.InterfaceC1009b compute = compute();
        if (compute != this) {
            return (w1.g) compute;
        }
        throw new r1.C0988a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.b
    public final w1.InterfaceC1009b compute() {
        return this.f7957a ? this : super.compute();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.m) {
            kotlin.jvm.internal.m mVar = (kotlin.jvm.internal.m) obj;
            return getOwner().equals(mVar.getOwner()) && getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && kotlin.jvm.internal.i.a(getBoundReceiver(), mVar.getBoundReceiver());
        }
        if (obj instanceof w1.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        w1.InterfaceC1009b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
