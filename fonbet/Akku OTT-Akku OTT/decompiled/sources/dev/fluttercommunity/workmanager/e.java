package dev.fluttercommunity.workmanager;

import android.content.Context;
import android.content.SharedPreferences;
import dev.fluttercommunity.workmanager.WorkmanagerPlugin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSharedPreferenceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferenceHelper.kt\ndev/fluttercommunity/workmanager/SharedPreferenceHelper\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,57:1\n41#2,12:58\n*S KotlinDebug\n*F\n+ 1 SharedPreferenceHelper.kt\ndev/fluttercommunity/workmanager/SharedPreferenceHelper\n*L\n52#1:58,12\n*E\n"})
/* loaded from: classes4.dex */
public final class e {
    public static final a Companion = new a();
    public final Context a;
    public final WorkmanagerPlugin.a b;

    public static final class a {
    }

    public e(Context context, WorkmanagerPlugin.a dispatcherHandleListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcherHandleListener, "dispatcherHandleListener");
        this.a = context;
        this.b = dispatcherHandleListener;
        final c cVar = new c(this);
        SharedPreferences sharedPreferences = context.getSharedPreferences("flutter_workmanager_plugin", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: dev.fluttercommunity.workmanager.d
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                c.this.invoke(sharedPreferences2, str);
            }
        });
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("flutter_workmanager_plugin", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        long j = sharedPreferences2.getLong("dev.fluttercommunity.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY", -1L);
        if (j != -1) {
            WorkmanagerPlugin.this.c = j;
        }
    }
}
