package com.unity3d.services.core.di;

/* compiled from: IServiceComponent.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0086\b¨\u0006\u000b"}, d2 = {"get", "T", "", "Lcom/unity3d/services/core/di/IServiceComponent;", "named", "", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", com.ironsource.X3.a.t, "Lkotlin/LazyThreadSafetyMode;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IServiceComponentKt {
    public static /* synthetic */ java.lang.Object get$default(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return registry.getService(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public static final /* synthetic */ <T> T get(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) registry.getService(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public static /* synthetic */ kotlin.Lazy inject$default(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, kotlin.LazyThreadSafetyMode mode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        if ((i & 2) != 0) {
            mode = kotlin.LazyThreadSafetyMode.NONE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(mode, (kotlin.jvm.functions.Function0) new com.unity3d.services.core.di.IServiceComponentKt$inject$1(iServiceComponent, named));
    }

    public static final /* synthetic */ <T> kotlin.Lazy<T> inject(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, kotlin.LazyThreadSafetyMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(mode, (kotlin.jvm.functions.Function0) new com.unity3d.services.core.di.IServiceComponentKt$inject$1(iServiceComponent, named));
    }
}
