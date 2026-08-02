package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/work/impl/utils/Api28Impl;", "", "<init>", "()V", "", "Camera2StreamConfigurationMap", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Api28Impl {
    public static final androidx.work.impl.utils.Api28Impl INSTANCE = new androidx.work.impl.utils.Api28Impl();

    private Api28Impl() {
    }

    public final java.lang.String Camera2StreamConfigurationMap() {
        java.lang.String processName = android.app.Application.getProcessName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processName, "");
        return processName;
    }
}
