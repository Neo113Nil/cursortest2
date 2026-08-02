package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R>\u0010\n\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0004\b\u0001`\b¢\u0006\u0002\b\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceDefaults;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetector;", "Lkotlin/ExtensionFunctionType;", "DefaultStartDetector", "Lkotlin/jvm/functions/Function2;", "getDefaultStartDetector", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults INSTANCE = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults();
    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> DefaultStartDetector = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
