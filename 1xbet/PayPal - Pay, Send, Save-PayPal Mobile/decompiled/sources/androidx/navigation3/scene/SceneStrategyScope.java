package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/navigation3/scene/SceneStrategyScope;", "", "T", "Lkotlin/Function0;", "", "onBack", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "()V", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class SceneStrategyScope<T> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBack;

    public SceneStrategyScope(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onBack = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBack() {
        return this.onBack;
    }

    public SceneStrategyScope() {
        this(new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.scene.SceneStrategyScope$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        });
    }
}
