package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "arity", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", "createFunctionKmClass", "(I)Lkotlin/reflect/jvm/internal/impl/km/KmClass;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BuiltinsKt {
    public static final kotlin.reflect.jvm.internal.impl.km.KmClass createFunctionKmClass(int i) {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = new kotlin.reflect.jvm.internal.impl.km.KmClass();
        kmClass.setName("kotlin/Function".concat(java.lang.String.valueOf(i)));
        kotlin.reflect.jvm.internal.impl.km.Attributes.setKind(kmClass, kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE);
        kotlin.reflect.jvm.internal.impl.km.Attributes.setModality(kmClass, kotlin.reflect.jvm.internal.impl.km.Modality.ABSTRACT);
        kotlin.reflect.jvm.internal.impl.km.Attributes.setVisibility(kmClass, kotlin.reflect.jvm.internal.impl.km.Visibility.PUBLIC);
        if (i > 0) {
            int i2 = 1;
            while (true) {
                kmClass.getTypeParameters().add(new kotlin.reflect.jvm.internal.impl.km.KmTypeParameter("P".concat(java.lang.String.valueOf(i2)), i2, kotlin.reflect.jvm.internal.impl.km.KmVariance.IN));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i3 = i + 1;
        kmClass.getTypeParameters().add(new kotlin.reflect.jvm.internal.impl.km.KmTypeParameter(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, i3, kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT));
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> supertypes = kmClass.getSupertypes();
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = new kotlin.reflect.jvm.internal.impl.km.KmType();
        kmType.setClassifier(new kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class("kotlin/Function"));
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeProjection> arguments = kmType.getArguments();
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.INVARIANT;
        kotlin.reflect.jvm.internal.impl.km.KmType kmType2 = new kotlin.reflect.jvm.internal.impl.km.KmType();
        kmType2.setClassifier(new kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter(i3));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        arguments.add(new kotlin.reflect.jvm.internal.impl.km.KmTypeProjection(kmVariance, kmType2));
        supertypes.add(kmType);
        return kmClass;
    }
}
