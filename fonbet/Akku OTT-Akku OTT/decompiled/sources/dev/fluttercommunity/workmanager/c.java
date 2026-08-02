package dev.fluttercommunity.workmanager;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SharedPreferences preferences = (SharedPreferences) obj;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        if (Intrinsics.areEqual((String) obj2, "dev.fluttercommunity.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY")) {
            WorkmanagerPlugin.this.c = preferences.getLong("dev.fluttercommunity.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY", -1L);
        }
        return Unit.INSTANCE;
    }
}
