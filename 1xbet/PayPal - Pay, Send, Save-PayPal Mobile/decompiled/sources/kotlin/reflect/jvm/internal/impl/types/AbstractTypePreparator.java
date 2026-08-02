package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class AbstractTypePreparator {
    public abstract kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    /* loaded from: classes17.dex */
    public static final class Default extends kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator {
        public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
        public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return kotlinTypeMarker;
        }
    }
}
