package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.UnwrappedType> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType invoke(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2 = kotlinTypeMarker;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return ((kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator) this.receiver).prepareType(kotlinTypeMarker2);
    }

    KotlinTypePreparator$prepareType$1(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }
}
