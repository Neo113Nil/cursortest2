package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0018J6\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001aJ@\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001cJJ\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001eJT\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010 J^\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\"Jh\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010$Jr\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010&J|\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010(J\u008e\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010+J\u0098\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010-J¢\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010/J¬\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u00101J¶\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u00103JÀ\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u00105JÊ\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u00107JÔ\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u00062\b\u00108\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u00109JÞ\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u00062\b\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0018\u0010\u000f\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010DR\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010F"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "getHighSpeedVideoSizes", "()V", "Landroidx/compose/runtime/Composer;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/runtime/Composer;)V", "update", "(Ljava/lang/Object;)V", "c", "changed", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p1", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p5", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p7", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p8", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p9", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p10", "changed1", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p11", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p12", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p13", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p14", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p15", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p16", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p17", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p18", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getKey", "()I", "getHighSpeedVideoFpsRangesFor", "Z", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScope;", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableLambdaImpl implements androidx.compose.runtime.internal.ComposableLambda {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.RecomposeScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<androidx.compose.runtime.RecomposeScope> getHighSpeedVideoFpsRangesFor;
    private final int key;

    public ComposableLambdaImpl(int i, boolean z, java.lang.Object obj) {
        this.key = i;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function11
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function13
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function14
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function15
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function16
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function17
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function18
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function19
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function20
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function21
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, androidx.compose.runtime.Composer composer, java.lang.Integer num, java.lang.Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, num.intValue(), num2.intValue());
    }

    public final int getKey() {
        return this.key;
    }

    private final void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizes) {
            androidx.compose.runtime.RecomposeScope recomposeScope = this.getHighSpeedVideoFpsRanges;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.getHighSpeedVideoFpsRanges = null;
            }
            java.util.List<androidx.compose.runtime.RecomposeScope> list = this.getHighSpeedVideoFpsRangesFor;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer p0) {
        androidx.compose.runtime.RecomposeScope recomposeScope;
        if (!this.getHighSpeedVideoSizes || (recomposeScope = p0.getRecomposeScope()) == null) {
            return;
        }
        p0.recordUsed(recomposeScope);
        if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(this.getHighSpeedVideoFpsRanges, recomposeScope)) {
            this.getHighSpeedVideoFpsRanges = recomposeScope;
            return;
        }
        java.util.List<androidx.compose.runtime.RecomposeScope> list = this.getHighSpeedVideoFpsRangesFor;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    public final void update(java.lang.Object block) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, block)) {
            return;
        }
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI == null;
        this.getHighResolutionOutputSizeshNQ4ISI = block;
        if (z) {
            return;
        }
        getHighSpeedVideoSizes();
    }

    public final java.lang.Object invoke(androidx.compose.runtime.Composer c, int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(0) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(0);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2)).invoke(startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1(this));
        }
        return invoke;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(1) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(1);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 3)).invoke(p1, startRestartGroup, java.lang.Integer.valueOf(differentBits | changed));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(2) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(2);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function4) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 4)).invoke(p1, p2, startRestartGroup, java.lang.Integer.valueOf(differentBits | changed));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(3) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(3);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function5) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 5)).invoke(p1, p2, p3, startRestartGroup, java.lang.Integer.valueOf(differentBits | changed));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    ((java.lang.Integer) obj3).intValue();
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, changed, (androidx.compose.runtime.Composer) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(4) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(4);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function6) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 6)).invoke(p1, p2, p3, p4, startRestartGroup, java.lang.Integer.valueOf(differentBits | changed));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(5) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(5);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function7) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 7)).invoke(p1, p2, p3, p4, p5, startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(6) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(6);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function8) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 8)).invoke(p1, p2, p3, p4, p5, p6, startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj3).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, changed, (androidx.compose.runtime.Composer) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(7) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(7);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function9) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 9)).invoke(p1, p2, p3, p4, p5, p6, p7, startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(8) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(8);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function10) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 10)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    ((java.lang.Integer) obj3).intValue();
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, changed, (androidx.compose.runtime.Composer) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, androidx.compose.runtime.Composer c, final int changed) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(9) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(9);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function11) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 11)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, startRestartGroup, java.lang.Integer.valueOf(changed | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, androidx.compose.runtime.Composer c, final int changed, int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(10) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(10);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function13) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 13)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, changed, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, int i, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, i | 1, i);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(11) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(11);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function14) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 14)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj3).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(12) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(12);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function15) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 15)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(13) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(13);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function16) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 16)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, final java.lang.Object p14, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(14) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(14);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function17) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 17)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, final java.lang.Object p14, final java.lang.Object p15, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(15) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(15);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function18) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 18)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, final java.lang.Object p14, final java.lang.Object p15, final java.lang.Object p16, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(16) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(16);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function19) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 19)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, final java.lang.Object p14, final java.lang.Object p15, final java.lang.Object p16, final java.lang.Object p17, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(17) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(17);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function20) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 20)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(final java.lang.Object p1, final java.lang.Object p2, final java.lang.Object p3, final java.lang.Object p4, final java.lang.Object p5, final java.lang.Object p6, final java.lang.Object p7, final java.lang.Object p8, final java.lang.Object p9, final java.lang.Object p10, final java.lang.Object p11, final java.lang.Object p12, final java.lang.Object p13, final java.lang.Object p14, final java.lang.Object p15, final java.lang.Object p16, final java.lang.Object p17, final java.lang.Object p18, androidx.compose.runtime.Composer c, final int changed, final int changed1) {
        androidx.compose.runtime.Composer startRestartGroup = c.startRestartGroup(this.key);
        getHighSpeedVideoFpsRanges(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(18) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(18);
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object invoke = ((kotlin.jvm.functions.Function21) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 21)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, startRestartGroup, java.lang.Integer.valueOf(changed), java.lang.Integer.valueOf(changed1 | differentBits));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaImpl.getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, changed, changed1, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, int i, int i2, androidx.compose.runtime.Composer composer) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i) | 1, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }
}
