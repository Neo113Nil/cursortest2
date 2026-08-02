package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public interface DeclaredMemberIndex {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name2);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name2);

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent findRecordComponentByName(kotlin.reflect.jvm.internal.impl.name.Name name2);

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getRecordComponentNames();

    public static final class Empty implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getRecordComponentNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent findRecordComponentByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return null;
        }
    }
}
