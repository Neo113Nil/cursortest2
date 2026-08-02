package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public final class JavaLoadingKt {
    public static final boolean isObjectMethodInInterface(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMember, "");
        if (!javaMember.getContainingClass().isInterface() || !(javaMember instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) javaMember;
        java.lang.String asString = javaMethod.getName().asString();
        int hashCode = asString.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode == -1295482945) {
                if (!asString.equals("equals")) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter javaValueParameter = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) javaMethod.getValueParameters());
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType = type instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) type : null;
                if (javaClassifierType == null) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier classifier = javaClassifierType.getClassifier();
                return (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) && (fqName = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) classifier).getFqName()) != null && kotlin.jvm.internal.Intrinsics.areEqual(fqName.asString(), "java.lang.Object");
            }
            if (hashCode != 147696667 || !asString.equals("hashCode")) {
                return false;
            }
        } else if (!asString.equals("toString")) {
            return false;
        }
        return javaMethod.getValueParameters().isEmpty();
    }
}
