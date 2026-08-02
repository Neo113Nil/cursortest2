package kotlinx.coroutines.debug.internal;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$3<R> implements kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, R> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, kotlin.coroutines.CoroutineContext, R> Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function1
    public final R invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
        boolean highSpeedVideoSizes;
        kotlin.coroutines.CoroutineContext context;
        kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE;
        highSpeedVideoSizes = kotlinx.coroutines.debug.internal.DebugProbesImpl.getHighSpeedVideoSizes(coroutineOwner);
        if (highSpeedVideoSizes || (context = coroutineOwner.info.getContext()) == null) {
            return null;
        }
        return this.Camera2StreamConfigurationMap.invoke(coroutineOwner, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugProbesImpl$dumpCoroutinesInfoImpl$3(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> function2) {
        this.Camera2StreamConfigurationMap = function2;
    }
}
