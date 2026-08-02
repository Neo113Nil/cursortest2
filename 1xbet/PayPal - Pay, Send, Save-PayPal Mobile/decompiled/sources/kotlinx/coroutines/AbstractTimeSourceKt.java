package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/AbstractTimeSource;", "source", "", "mockTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/AbstractTimeSource;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AbstractTimeSourceKt {
    private static kotlinx.coroutines.AbstractTimeSource getHighSpeedVideoSizes;

    public static final void mockTimeSource(kotlinx.coroutines.AbstractTimeSource abstractTimeSource) {
        getHighSpeedVideoSizes = abstractTimeSource;
    }
}
