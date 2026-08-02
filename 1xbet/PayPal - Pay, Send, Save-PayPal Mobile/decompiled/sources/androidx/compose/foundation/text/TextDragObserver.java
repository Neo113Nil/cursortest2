package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextDragObserver;", "", "Landroidx/compose/ui/geometry/Offset;", "point", "", "onDown-k-4lQ0M", "(J)V", "onDown", "onUp", "()V", "startPoint", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "selectionAdjustment", "onStart-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "onStart", "delta", "onDrag-k-4lQ0M", "onDrag", "onStop", "onCancel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextDragObserver {
    void onCancel();

    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo2103onDownk4lQ0M(long point);

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo2104onDragk4lQ0M(long delta);

    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
    void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment);

    void onStop();

    void onUp();
}
