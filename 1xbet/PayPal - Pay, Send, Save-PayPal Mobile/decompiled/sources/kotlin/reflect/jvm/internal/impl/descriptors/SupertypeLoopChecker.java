package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface SupertypeLoopChecker {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> findLoopsInSupertypesAndDisconnect(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>> function1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit> function12);

    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY();

        private EMPTY() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> findLoopsInSupertypesAndDisconnect(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>> function1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit> function12) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            return collection;
        }
    }
}
