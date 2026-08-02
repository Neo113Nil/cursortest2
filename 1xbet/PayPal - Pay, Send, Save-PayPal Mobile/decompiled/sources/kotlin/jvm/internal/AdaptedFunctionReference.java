package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public class AdaptedFunctionReference implements kotlin.jvm.internal.FunctionBase, java.io.Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f6914name;
    private final java.lang.Class owner;
    public final java.lang.Object receiver;
    private final java.lang.String signature;

    public AdaptedFunctionReference(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, kotlin.jvm.internal.CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public AdaptedFunctionReference(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.f6914name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public kotlin.reflect.KDeclarationContainer getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(cls) : kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cls);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.jvm.internal.AdaptedFunctionReference)) {
            return false;
        }
        kotlin.jvm.internal.AdaptedFunctionReference adaptedFunctionReference = (kotlin.jvm.internal.AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, adaptedFunctionReference.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.owner, adaptedFunctionReference.owner) && this.f6914name.equals(adaptedFunctionReference.f6914name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    public int hashCode() {
        java.lang.Object obj = this.receiver;
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Class cls = this.owner;
        int hashCode2 = cls != null ? cls.hashCode() : 0;
        int hashCode3 = this.f6914name.hashCode();
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.Reflection.renderLambdaToString(this);
    }
}
