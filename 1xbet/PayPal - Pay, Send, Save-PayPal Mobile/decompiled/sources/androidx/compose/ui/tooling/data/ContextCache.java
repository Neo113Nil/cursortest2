package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/tooling/data/ContextCache;", "", "<init>", "()V", "", "clear", "", "", "contexts", "Ljava/util/Map;", "getContexts$ui_tooling_data", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextCache {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> contexts = new java.util.LinkedHashMap();

    public final void clear() {
        this.contexts.clear();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getContexts$ui_tooling_data() {
        return this.contexts;
    }
}
