package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.Fw;
import m4.InterfaceC2099b;
import m4.InterfaceC2105h;

/* loaded from: classes.dex */
public abstract class r extends c implements InterfaceC2105h {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17619k;

    public r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f17619k = false;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2105h getReflected() {
        if (this.f17619k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC2099b compute = compute();
        if (compute != this) {
            return (InterfaceC2105h) compute;
        }
        throw new Fw("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC2099b compute() {
        return this.f17619k ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return getOwner().equals(rVar.getOwner()) && getName().equals(rVar.getName()) && getSignature().equals(rVar.getSignature()) && l.a(getBoundReceiver(), rVar.getBoundReceiver());
        }
        if (obj instanceof InterfaceC2105h) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC2099b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
