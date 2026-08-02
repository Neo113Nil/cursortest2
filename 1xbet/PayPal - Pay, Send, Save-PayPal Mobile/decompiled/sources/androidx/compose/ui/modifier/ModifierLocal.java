package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocal;", "T", "", "Lkotlin/Function0;", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "defaultFactory", "Lkotlin/jvm/functions/Function0;", "getDefaultFactory$ui", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<T> defaultFactory;

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(kotlin.jvm.functions.Function0<? extends T> function0) {
        this.defaultFactory = function0;
    }

    public final kotlin.jvm.functions.Function0<T> getDefaultFactory$ui() {
        return this.defaultFactory;
    }

    public /* synthetic */ ModifierLocal(kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }
}
