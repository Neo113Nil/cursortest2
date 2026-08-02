package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "useCaseCameraIds", "Lkotlinx/atomicfu/AtomicInt;", "getUseCaseCameraIds", "()Lkotlinx/atomicfu/AtomicInt;", "Landroidx/camera/core/impl/Config$OptionPriority;", "defaultOptionPriority", "Landroidx/camera/core/impl/Config$OptionPriority;", "getDefaultOptionPriority", "()Landroidx/camera/core/impl/Config$OptionPriority;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseCameraKt {
    private static final kotlinx.atomicfu.AtomicInt useCaseCameraIds = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final androidx.camera.core.impl.Config.OptionPriority defaultOptionPriority = androidx.camera.core.impl.Config.OptionPriority.OPTIONAL;

    public static final kotlinx.atomicfu.AtomicInt getUseCaseCameraIds() {
        return useCaseCameraIds;
    }

    public static final androidx.camera.core.impl.Config.OptionPriority getDefaultOptionPriority() {
        return defaultOptionPriority;
    }
}
