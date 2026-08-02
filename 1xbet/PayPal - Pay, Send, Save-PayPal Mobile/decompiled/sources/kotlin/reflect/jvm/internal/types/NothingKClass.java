package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010#R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010 R\u001e\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\u001bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010\u001bR\u0016\u0010?\u001a\u0004\u0018\u00010<8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>"}, d2 = {"Lkotlin/reflect/jvm/internal/types/NothingKClass;", "Lkotlin/reflect/KClass;", "Ljava/lang/Void;", "Lkotlin/reflect/jvm/internal/impl/types/model/TypeConstructorMarker;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isInstance", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "constructors", "isAbstract", "()Z", "isCompanion", "isData", "isFinal", "isFun", "isInner", "isOpen", "isSealed", "isValue", "Lkotlin/reflect/KCallable;", "getMembers", "members", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Void;", "objectInstance", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NothingKClass implements kotlin.reflect.KClass<java.lang.Void>, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker {
    public static final kotlin.reflect.jvm.internal.types.NothingKClass INSTANCE = new kotlin.reflect.jvm.internal.types.NothingKClass();
    private final /* synthetic */ kotlin.reflect.KClass<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Void.class);

    @Override // kotlin.reflect.KClass
    public final boolean equals(java.lang.Object other) {
        return this == other;
    }

    private NothingKClass() {
    }

    @Override // kotlin.reflect.KClass
    public final java.lang.String getSimpleName() {
        return "Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final java.lang.String getQualifiedName() {
        return "kotlin.Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public final java.lang.String toString() {
        return "NothingKClass";
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isValue();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isSealed();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isOpen();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(java.lang.Object value) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInner();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isFun();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isFinal();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isData();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isCompanion();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isAbstract();
    }

    @Override // kotlin.reflect.KClass
    public final kotlin.reflect.KVisibility getVisibility() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getVisibility();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KType> getSupertypes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KClass<? extends java.lang.Void>> getSealedSubclasses() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSealedSubclasses();
    }

    @Override // kotlin.reflect.KClass
    public final java.lang.Void getObjectInstance() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getObjectInstance();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getNestedClasses();
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMembers();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.Collection<kotlin.reflect.KFunction<java.lang.Void>> getConstructors() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getConstructors();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAnnotations();
    }
}
