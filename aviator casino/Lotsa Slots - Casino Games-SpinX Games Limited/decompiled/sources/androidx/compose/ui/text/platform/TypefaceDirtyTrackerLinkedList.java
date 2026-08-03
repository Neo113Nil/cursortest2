package androidx.compose.ui.text.platform;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "", "resolveResult", "Landroidx/compose/runtime/State;", io.ktor.http.LinkHeader.Rel.Next, "(Landroidx/compose/runtime/State;Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;)V", "initial", "getInitial", "()Ljava/lang/Object;", "isStaleResolvedFont", "", "()Z", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TypefaceDirtyTrackerLinkedList {
    private final java.lang.Object initial;
    private final androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList next;
    private final androidx.compose.runtime.State<java.lang.Object> resolveResult;

    public TypefaceDirtyTrackerLinkedList(androidx.compose.runtime.State<? extends java.lang.Object> state, androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.resolveResult = state;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = state.getValue();
    }

    public /* synthetic */ TypefaceDirtyTrackerLinkedList(androidx.compose.runtime.State state, androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(state, (i & 2) != 0 ? null : typefaceDirtyTrackerLinkedList);
    }

    public final java.lang.Object getInitial() {
        return this.initial;
    }

    public final android.graphics.Typeface getTypeface() {
        java.lang.Object obj = this.initial;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (android.graphics.Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        return this.resolveResult.getValue() != this.initial || ((typefaceDirtyTrackerLinkedList = this.next) != null && typefaceDirtyTrackerLinkedList.isStaleResolvedFont());
    }
}
