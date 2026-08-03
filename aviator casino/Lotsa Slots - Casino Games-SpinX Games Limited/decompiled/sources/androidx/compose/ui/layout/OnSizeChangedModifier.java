package androidx.compose.ui.layout;

/* compiled from: OnRemeasuredModifier.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u0005X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "onSizeChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function1;", "previousSize", "J", "equals", "", "other", "", "hashCode", "", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.OnRemeasuredModifier {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit> onSizeChanged;
    private long previousSize;

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(kotlin.jvm.functions.Function1 function1) {
        return androidx.compose.ui.Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(kotlin.jvm.functions.Function1 function1) {
        return androidx.compose.ui.Modifier.Element.CC.$default$any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ java.lang.Object foldIn(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
        return androidx.compose.ui.Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ java.lang.Object foldOut(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
        return androidx.compose.ui.Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.Modifier.CC.$default$then(this, modifier);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function12) {
        super(function12);
        this.onSizeChanged = function1;
        this.previousSize = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo3448onRemeasuredozmzZPI(long size) {
        if (androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(size));
        this.previousSize = size;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.compose.ui.layout.OnSizeChangedModifier) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onSizeChanged, ((androidx.compose.ui.layout.OnSizeChangedModifier) other).onSizeChanged);
        }
        return false;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }
}
