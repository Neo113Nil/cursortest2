package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AdsSdkInitializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/core/configuration/AdsSdkInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdsSdkInitializer implements Initializer<Unit> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)), null, null, new AdsSdkInitializer$create$1(context, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
