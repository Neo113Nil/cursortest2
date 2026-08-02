package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000429\u0010\u000b\u001a5\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR¥\u0001\u0010\u000e\u001a\u0084\u0001\u0012\u0004\u0012\u00020\u0004\u00127\u00125\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n0\u0007jA\u0012\u0004\u0012\u00020\u0004\u00127\u00125\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n`\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/constraintlayout/compose/DesignElements;", "", "<init>", "()V", "", "name", "Lkotlin/Function2;", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "", "Landroidx/compose/runtime/Composable;", "function", "define", "(Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "map", "Ljava/util/HashMap;", "getMap", "()Ljava/util/HashMap;", "setMap", "(Ljava/util/HashMap;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DesignElements {
    public static final androidx.constraintlayout.compose.DesignElements INSTANCE = new androidx.constraintlayout.compose.DesignElements();
    private static java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function4<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> map = new java.util.HashMap<>();
    public static final int $stable = 8;

    private DesignElements() {
    }

    public final java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function4<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> getMap() {
        return map;
    }

    public final void setMap(java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function4<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> hashMap) {
        map = hashMap;
    }

    public final void define(java.lang.String name2, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.util.HashMap<java.lang.String, java.lang.String>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function) {
        map.put(name2, function);
    }
}
