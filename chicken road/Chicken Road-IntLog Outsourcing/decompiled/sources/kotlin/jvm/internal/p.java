package kotlin.jvm.internal;

import D4.C0023x;
import z4.InterfaceC1585b;

/* loaded from: classes.dex */
public abstract class p extends b implements z4.l {
    private final boolean syntheticJavaProperty;

    public p(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.b
    public InterfaceC1585b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getOwner().equals(pVar.getOwner()) && getName().equals(pVar.getName()) && getSignature().equals(pVar.getSignature()) && i.a(getBoundReceiver(), pVar.getBoundReceiver());
        }
        if (obj instanceof z4.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // z4.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // z4.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC1585b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public z4.l getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1585b compute = compute();
        if (compute != this) {
            return (z4.l) compute;
        }
        throw new C0023x("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
