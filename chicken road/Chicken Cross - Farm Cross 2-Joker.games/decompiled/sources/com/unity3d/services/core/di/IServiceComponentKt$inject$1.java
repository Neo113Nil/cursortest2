package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: IServiceComponent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class IServiceComponentKt$inject$1<T> implements Function0<T> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        String str = this.$named;
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) registry.getService(str, Reflection.getOrCreateKotlinClass(Object.class));
    }
}
