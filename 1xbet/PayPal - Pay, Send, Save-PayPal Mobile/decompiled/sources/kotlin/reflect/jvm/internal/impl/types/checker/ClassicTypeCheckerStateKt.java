package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class ClassicTypeCheckerStateKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState createClassicTypeCheckerState$default(boolean z, boolean z2, kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            classicTypeSystemContext = kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE;
        }
        if ((i & 8) != 0) {
            kotlinTypePreparator = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE;
        }
        if ((i & 16) != 0) {
            kotlinTypeRefiner = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default.INSTANCE;
        }
        return createClassicTypeCheckerState(z, z2, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState createClassicTypeCheckerState(boolean z, boolean z2, kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classicTypeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypePreparator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState(z, z2, false, true, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
