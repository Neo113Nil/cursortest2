package androidx.compose.foundation.gestures;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J9\u0010\u0011\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0013H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000bJ9\u0010\u001a\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "()V", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "size", "", "getSize", "()I", "cancelAndRemoveAll", "", "cause", "", "enqueue", "", "request", "forEachFromSmallest", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "bounds", "isEmpty", "resumeAndRemoveAll", "resumeAndRemoveWhile", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = androidx.compose.runtime.collection.MutableVector.$stable;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.gestures.ContentInViewNode.Request> requests = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.gestures.ContentInViewNode.Request[16], 0);

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final boolean enqueue(final androidx.compose.foundation.gestures.ContentInViewNode.Request request) {
        androidx.compose.ui.geometry.Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = request.getContinuation();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
            return false;
        }
        request.getContinuation().invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.this.requests.remove(request);
            }
        });
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, this.requests.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                androidx.compose.ui.geometry.Rect invoke2 = this.requests.getContent()[last].getCurrentBounds().invoke();
                if (invoke2 != null) {
                    androidx.compose.ui.geometry.Rect intersect = invoke.intersect(invoke2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(intersect, invoke)) {
                        this.requests.add(last + 1, request);
                        return true;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(intersect, invoke2)) {
                        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.requests.getContent()[last].getContinuation().cancel(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> block) {
        androidx.compose.runtime.collection.MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = size - 1;
            java.lang.Object[] content = mutableVector.getContent();
            do {
                block.invoke(((androidx.compose.foundation.gestures.ContentInViewNode.Request) content[i]).getCurrentBounds().invoke());
                i--;
            } while (i >= 0);
        }
    }

    public final void resumeAndRemoveAll() {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, this.requests.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = this.requests.getContent()[first].getContinuation();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m10798constructorimpl(unit));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, java.lang.Boolean> block) {
        while (this.requests.isNotEmpty() && block.invoke(((androidx.compose.foundation.gestures.ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m10798constructorimpl(unit));
        }
    }

    public final void cancelAndRemoveAll(java.lang.Throwable cause) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.gestures.ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        kotlinx.coroutines.CancellableContinuation[] cancellableContinuationArr = new kotlinx.coroutines.CancellableContinuation[size];
        for (int i = 0; i < size; i++) {
            cancellableContinuationArr[i] = mutableVector.getContent()[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            cancellableContinuationArr[i2].cancel(cause);
        }
        if (!this.requests.isEmpty()) {
            throw new java.lang.IllegalStateException("uncancelled requests present".toString());
        }
    }
}
