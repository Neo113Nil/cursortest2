package com.unity3d.services.core.configuration;

/* compiled from: AdsSdkInitializer.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/configuration/AdsSdkInitializer;", "Landroidx/startup/Initializer;", "", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdsSdkInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.unity3d.services.core.properties.ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof android.app.Application) {
            com.unity3d.services.core.properties.ClientProperties.setApplication((android.app.Application) context);
        } else if (context.getApplicationContext() instanceof android.app.Application) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            com.unity3d.services.core.properties.ClientProperties.setApplication((android.app.Application) applicationContext);
        }
        com.unity3d.services.core.properties.SdkProperties.setAppInitializationTimeSinceEpoch(java.lang.System.currentTimeMillis());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), new com.unity3d.services.core.configuration.AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE)), null, null, new com.unity3d.services.core.configuration.AdsSdkInitializer$create$1(context, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
