package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u0010\u001a\u00020\u000e2\u0019\u0010\u000f\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0003J6\u0010\u0013\u001a\u00020\u000e2\u0019\u0010\u000f\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "<init>", "()V", "", "isEmpty", "()Z", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "request", "enqueue", "(Landroidx/compose/foundation/gestures/ContentInViewNode$Request;)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "", "block", "forEachFromSmallest", "(Lkotlin/jvm/functions/Function1;)V", "resumeAndRemoveAll", "resumeAndRemoveWhile", "", "cause", "cancelAndRemoveAll", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/collection/MutableVector;", "getHighResolutionOutputSizeshNQ4ISI", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = androidx.compose.runtime.collection.MutableVector.$stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.gestures.ContentInViewNode.Request> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.gestures.ContentInViewNode.Request[16], 0);

    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSize();
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSize() == 0;
    }

    public final boolean enqueue(final androidx.compose.foundation.gestures.ContentInViewNode.Request request) {
        androidx.compose.ui.geometry.Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = request.getContinuation();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            return false;
        }
        request.getContinuation().invokeOnCancellation(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.this, request);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, this.getHighResolutionOutputSizeshNQ4ISI.getSize());
        int first = until.getFirst();
        int last = until.getLast();
        if (first <= last) {
            while (true) {
                androidx.compose.ui.geometry.Rect invoke2 = this.getHighResolutionOutputSizeshNQ4ISI.content[last].getCurrentBounds().invoke();
                if (invoke2 != null) {
                    androidx.compose.ui.geometry.Rect intersect = invoke.intersect(invoke2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(intersect, invoke)) {
                        this.getHighResolutionOutputSizeshNQ4ISI.add(last + 1, request);
                        return true;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(intersect, invoke2)) {
                        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.getHighResolutionOutputSizeshNQ4ISI.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.getHighResolutionOutputSizeshNQ4ISI.content[last].getContinuation().cancel(cancellationException);
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
        this.getHighResolutionOutputSizeshNQ4ISI.add(0, request);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, androidx.compose.foundation.gestures.ContentInViewNode.Request request) {
        bringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI.remove(request);
        return kotlin.Unit.INSTANCE;
    }

    public final void forEachFromSmallest(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> block) {
        androidx.compose.runtime.collection.MutableVector mutableVector = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = mutableVector.getSize() - 1;
        java.lang.Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                block.invoke(((androidx.compose.foundation.gestures.ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
                size--;
            }
        }
    }

    public final void resumeAndRemoveAll() {
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, this.getHighResolutionOutputSizeshNQ4ISI.getSize());
        int first = until.getFirst();
        int last = until.getLast();
        if (first <= last) {
            while (true) {
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = this.getHighResolutionOutputSizeshNQ4ISI.content[first].getContinuation();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(unit));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    public final void resumeAndRemoveWhile(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, java.lang.Boolean> block) {
        while (this.getHighResolutionOutputSizeshNQ4ISI.getSize() != 0 && block.invoke(((androidx.compose.foundation.gestures.ContentInViewNode.Request) this.getHighResolutionOutputSizeshNQ4ISI.last()).getCurrentBounds().invoke()).booleanValue()) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) this.getHighResolutionOutputSizeshNQ4ISI.removeAt(this.getHighResolutionOutputSizeshNQ4ISI.getSize() - 1)).getContinuation();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(unit));
        }
    }

    public final void cancelAndRemoveAll(java.lang.Throwable cause) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.gestures.ContentInViewNode.Request> mutableVector = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = mutableVector.getSize();
        kotlinx.coroutines.CancellableContinuation[] cancellableContinuationArr = new kotlinx.coroutines.CancellableContinuation[size];
        for (int i = 0; i < size; i++) {
            cancellableContinuationArr[i] = mutableVector.content[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            cancellableContinuationArr[i2].cancel(cause);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getSize() == 0) {
            return;
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }
}
