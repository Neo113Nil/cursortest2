package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\"\"\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004"}, d2 = {"Lkotlin/Function1;", "", "", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatagramSendChannelKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.DatagramSendChannelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.DatagramSendChannelKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    public static final /* synthetic */ void access$failInvokeOnClose(kotlin.jvm.functions.Function1 function1) {
        java.lang.String concat;
        if (function1 == getHighSpeedVideoFpsRangesFor) {
            concat = "Another handler was already registered and successfully invoked";
        } else {
            concat = "Another handler was already registered: ".concat(java.lang.String.valueOf(function1));
        }
        throw new java.lang.IllegalStateException(concat);
    }

    public static final /* synthetic */ void access$writeMessageTo(kotlinx.io.Source source, java.nio.ByteBuffer byteBuffer) {
        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.readFully(source, byteBuffer);
        byteBuffer.flip();
    }
}
