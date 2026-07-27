package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", i = {0}, l = {127}, m = "awaitMouseEventDown", n = {"$this$awaitMouseEventDown"}, s = {"L$0"})
/* loaded from: classes.dex */
final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TextSelectionMouseDetectorKt$awaitMouseEventDown$1(Continuation<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitMouseEventDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(null, this);
        return awaitMouseEventDown;
    }
}
