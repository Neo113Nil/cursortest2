package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class AbstractTypeRefiner {
    public abstract kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    /* loaded from: classes17.dex */
    public static final class Default extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner {
        public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return kotlinTypeMarker;
        }
    }
}
