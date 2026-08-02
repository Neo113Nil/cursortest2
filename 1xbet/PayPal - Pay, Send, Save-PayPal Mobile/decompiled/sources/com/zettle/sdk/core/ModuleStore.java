package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0003R.\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u00040\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/core/ModuleStore;", "Lcom/zettle/sdk/core/Register;", "<init>", "()V", "Lcom/zettle/sdk/core/Module;", "T", "Ljava/lang/Class;", "clz", "impl", "", "add$core_publicRelease", "(Ljava/lang/Class;Lcom/zettle/sdk/core/Module;)V", "fetch", "(Ljava/lang/Class;)Lcom/zettle/sdk/core/Module;", "start$core_publicRelease", "stop$core_publicRelease", "", "Lkotlin/Pair;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ModuleStore implements com.zettle.sdk.core.Register {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<kotlin.Pair<java.lang.Class<? extends com.zettle.sdk.core.Module>, com.zettle.sdk.core.Module>> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;

    public final <T extends com.zettle.sdk.core.Module> void add$core_publicRelease(java.lang.Class<T> clz, T impl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clz, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impl, "");
        this.getHighSpeedVideoFpsRanges.add(new kotlin.Pair<>(clz, impl));
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            impl.start();
        }
    }

    public final void start$core_publicRelease() {
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((com.zettle.sdk.core.Module) ((kotlin.Pair) it.next()).component2()).start();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public final void stop$core_publicRelease() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((com.zettle.sdk.core.Module) ((kotlin.Pair) it.next()).component2()).stop();
        }
    }

    public final <T extends com.zettle.sdk.core.Module> com.zettle.sdk.core.Module fetch(java.lang.Class<T> clz) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clz, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Class) ((kotlin.Pair) obj).component1(), clz)) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) obj;
        if (pair != null) {
            return (com.zettle.sdk.core.Module) pair.getSecond();
        }
        return null;
    }
}
