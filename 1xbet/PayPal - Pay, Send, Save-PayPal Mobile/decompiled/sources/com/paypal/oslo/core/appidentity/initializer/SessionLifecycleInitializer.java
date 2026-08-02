package com.paypal.oslo.core.appidentity.initializer;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/initializer/SessionLifecycleInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "SessionLifecycleInitializerEntryPoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SessionLifecycleInitializer implements androidx.startup.Initializer<kotlin.Unit> {

    @dagger.hilt.android.EarlyEntryPoint
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/initializer/SessionLifecycleInitializer$SessionLifecycleInitializerEntryPoint;", "", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleObserver;", "getSessionLifecycleObserver", "()Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleObserver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SessionLifecycleInitializerEntryPoint {
        com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver getSessionLifecycleObserver();
    }

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(((com.paypal.oslo.core.appidentity.initializer.SessionLifecycleInitializer.SessionLifecycleInitializerEntryPoint) dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.core.appidentity.initializer.SessionLifecycleInitializer.SessionLifecycleInitializerEntryPoint.class)).getSessionLifecycleObserver());
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.listOf(androidx.view.ProcessLifecycleInitializer.class);
    }
}
