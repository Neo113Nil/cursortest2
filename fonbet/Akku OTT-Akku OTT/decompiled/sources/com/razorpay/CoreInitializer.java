package com.razorpay;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.startup.Initializer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/razorpay/CoreInitializer;", "Landroidx/startup/Initializer;", "", "()V", "create", "context", "Landroid/content/Context;", "deferCoreInitUntilFirstActivity", "appContext", "dependencies", "", "Ljava/lang/Class;", "initGPayInABoxIfAvailable", "checkout-otpelf-lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreInitializer implements Initializer<Unit> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: create$lambda-1, reason: not valid java name */
    public static final void m1695create$lambda1(CoreInitializer this$0, Context appContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Thread(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(1, this$0, appContext)).start();
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this$0.deferCoreInitUntilFirstActivity(appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: create$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1696create$lambda1$lambda0(CoreInitializer this$0, Context appContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            this$0.initGPayInABoxIfAvailable(appContext);
        } catch (Throwable th) {
            Logger.e("Error initializing GPayInABox", th);
        }
    }

    private final void deferCoreInitUntilFirstActivity(Context appContext) {
        Application application = appContext instanceof Application ? (Application) appContext : null;
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new CoreInitializer$O$$$__o0Oo(new boolean[]{false}, application, appContext));
    }

    private final void initGPayInABoxIfAvailable(Context context) {
        Object obj;
        String str;
        Object m1716constructorimpl;
        Class<?> loadClass;
        Constructor<?> declaredConstructor;
        Set<Map.Entry<String, String>> entrySet = BaseUtils.getAllPluginsFromManifest(context).entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "pluginsMap.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.checkNotNullExpressionValue(entry, "(key, _)");
            String key = (String) entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (StringsKt.p(key, "gpay_in_a_box")) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 == null || (str = (String) entry2.getValue()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = RzpPlugin.class.getClassLoader();
            Object newInstance = (classLoader == null || (loadClass = classLoader.loadClass(str)) == null || (declaredConstructor = loadClass.getDeclaredConstructor(null)) == null) ? null : declaredConstructor.newInstance(null);
            m1716constructorimpl = Result.m1716constructorimpl(newInstance instanceof RzpGPayInABoxExternalPlugin ? (RzpGPayInABoxExternalPlugin) newInstance : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        RzpGPayInABoxExternalPlugin rzpGPayInABoxExternalPlugin = (RzpGPayInABoxExternalPlugin) (Result.m1722isFailureimpl(m1716constructorimpl) ? null : m1716constructorimpl);
        if (rzpGPayInABoxExternalPlugin != null) {
            rzpGPayInABoxExternalPlugin.initializePaymentMethods(context);
        }
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new Handler(Looper.getMainLooper()).post(new com.google.android.exoplayer2.offline.b(1, this, context.getApplicationContext()));
    }
}
