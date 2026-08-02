package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/room/concurrent/CloseBarrier;", "Lkotlin/Function0;", "", "action", "ifNotClosed", "(Landroidx/room/concurrent/CloseBarrier;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(androidx.room.concurrent.CloseBarrier closeBarrier, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeBarrier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (closeBarrier.block$room_runtime()) {
            try {
                function0.invoke();
            } finally {
                closeBarrier.unblock$room_runtime();
            }
        }
    }
}
