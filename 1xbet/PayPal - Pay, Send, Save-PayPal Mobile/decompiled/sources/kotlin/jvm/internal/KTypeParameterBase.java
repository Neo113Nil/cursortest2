package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlin/jvm/internal/KTypeParameterBase;", "Lkotlin/reflect/KTypeParameter;", "", "Lkotlin/jvm/internal/TypeParameterContainer;", "container", "<init>", "(Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getContainer$kotlin_stdlib", "()Ljava/lang/Object;", "Ljava/lang/reflect/GenericDeclaration;", "javaContainingDeclaration$delegate", "Lkotlin/Lazy;", "getJavaContainingDeclaration$kotlin_stdlib", "()Ljava/lang/reflect/GenericDeclaration;", "javaContainingDeclaration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class KTypeParameterBase implements kotlin.reflect.KTypeParameter {
    private final java.lang.Object container;

    /* renamed from: javaContainingDeclaration$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy javaContainingDeclaration;

    public KTypeParameterBase(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.container = obj;
        this.javaContainingDeclaration = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlin.jvm.internal.KTypeParameterBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlin.jvm.internal.KTypeParameterBase.$r8$lambda$ZsDcbUL_sm0rBpIC3GBrLZrR8yA(kotlin.jvm.internal.KTypeParameterBase.this);
            }
        });
    }

    /* renamed from: getContainer$kotlin_stdlib, reason: from getter */
    public final java.lang.Object getContainer() {
        return this.container;
    }

    public final java.lang.reflect.GenericDeclaration getJavaContainingDeclaration$kotlin_stdlib() {
        return (java.lang.reflect.GenericDeclaration) this.javaContainingDeclaration.getValue();
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.jvm.internal.KTypeParameterBase)) {
            return false;
        }
        kotlin.jvm.internal.KTypeParameterBase kTypeParameterBase = (kotlin.jvm.internal.KTypeParameterBase) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getName(), kTypeParameterBase.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(this.container, kTypeParameterBase.container);
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.TypeParameterReference.INSTANCE.toString(this);
    }

    public static /* synthetic */ java.lang.reflect.GenericDeclaration $r8$lambda$ZsDcbUL_sm0rBpIC3GBrLZrR8yA(kotlin.jvm.internal.KTypeParameterBase kTypeParameterBase) {
        java.lang.Object obj = kTypeParameterBase.container;
        kotlin.jvm.internal.KotlinGenericDeclaration kotlinGenericDeclaration = obj instanceof kotlin.jvm.internal.KotlinGenericDeclaration ? (kotlin.jvm.internal.KotlinGenericDeclaration) obj : null;
        if (kotlinGenericDeclaration != null) {
            return kotlinGenericDeclaration.findJavaDeclaration();
        }
        return null;
    }
}
