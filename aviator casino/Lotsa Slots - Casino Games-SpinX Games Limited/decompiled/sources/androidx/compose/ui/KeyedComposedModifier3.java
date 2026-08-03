package androidx.compose.ui;

/* compiled from: ComposedModifier.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\b\u000f¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier3;", "Landroidx/compose/ui/ComposedModifier;", "fqName", "", "key1", "", "key2", "key3", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getFqName", "()Ljava/lang/String;", "getKey1", "()Ljava/lang/Object;", "getKey2", "getKey3", "equals", "", "other", "hashCode", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends androidx.compose.ui.ComposedModifier {
    private final java.lang.String fqName;
    private final java.lang.Object key1;
    private final java.lang.Object key2;
    private final java.lang.Object key3;

    public final java.lang.String getFqName() {
        return this.fqName;
    }

    public final java.lang.Object getKey1() {
        return this.key1;
    }

    public final java.lang.Object getKey2() {
        return this.key2;
    }

    public final java.lang.Object getKey3() {
        return this.key3;
    }

    public KeyedComposedModifier3(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1, function3);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof androidx.compose.ui.KeyedComposedModifier3) {
            androidx.compose.ui.KeyedComposedModifier3 keyedComposedModifier3 = (androidx.compose.ui.KeyedComposedModifier3) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.fqName, keyedComposedModifier3.fqName) && kotlin.jvm.internal.Intrinsics.areEqual(this.key1, keyedComposedModifier3.key1) && kotlin.jvm.internal.Intrinsics.areEqual(this.key2, keyedComposedModifier3.key2) && kotlin.jvm.internal.Intrinsics.areEqual(this.key3, keyedComposedModifier3.key3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        java.lang.Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.key2;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        java.lang.Object obj3 = this.key3;
        return hashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
