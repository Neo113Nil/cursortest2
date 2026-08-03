package com.unity3d.services.core.di;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: IServiceComponent.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class IServiceComponentKt$inject$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
    final /* synthetic */ java.lang.String $named;
    final /* synthetic */ com.unity3d.services.core.di.IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IServiceComponentKt$inject$1(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        com.unity3d.services.core.di.IServiceComponent iServiceComponent = this.$this_inject;
        java.lang.String str = this.$named;
        com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) registry.getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }
}
