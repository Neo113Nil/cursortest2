package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "", "getCacheable", "()Z", "cacheable", "Immutable", "Async", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TypefaceResult extends androidx.compose.runtime.State<java.lang.Object> {
    boolean getCacheable();

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Z", "getCacheable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Immutable implements androidx.compose.ui.text.font.TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final java.lang.Object value;

        public Immutable(java.lang.Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }

        public /* synthetic */ Immutable(java.lang.Object obj, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public final java.lang.Object getValue() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "", "getCacheable", "()Z", "cacheable", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Async implements androidx.compose.ui.text.font.TypefaceResult, androidx.compose.runtime.State<java.lang.Object> {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.font.AsyncFontListLoader current;

        public Async(androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        /* renamed from: getCurrent$ui_text, reason: from getter */
        public final androidx.compose.ui.text.font.AsyncFontListLoader getCurrent() {
            return this.current;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean getCacheable() {
            return this.current.getCacheable();
        }

        @Override // androidx.compose.runtime.State
        public final java.lang.Object getValue() {
            return this.current.getValue();
        }
    }
}
