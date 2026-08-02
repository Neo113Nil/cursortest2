package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/Camera2StreamConfigurationMap;", "Lkotlin/Function1;", "", "", "action", "", "loop", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicsKt {
    public static final java.lang.Void loop(java.util.concurrent.atomic.AtomicInteger atomicInteger, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicInteger.get()));
        }
    }
}
