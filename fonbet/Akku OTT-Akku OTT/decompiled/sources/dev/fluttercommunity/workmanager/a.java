package dev.fluttercommunity.workmanager;

import android.content.Context;
import androidx.work.ListenableWorker;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import dev.fluttercommunity.workmanager.i;
import dev.fluttercommunity.workmanager.pigeon.q;
import dev.fluttercommunity.workmanager.pigeon.r;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ BackgroundWorker a;

    public /* synthetic */ a(BackgroundWorker backgroundWorker) {
        this.a = backgroundWorker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BackgroundWorker.Companion companion = BackgroundWorker.INSTANCE;
        BackgroundWorker backgroundWorker = this.a;
        LinkedHashMap b = backgroundWorker.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(b.size()));
        for (Map.Entry entry : b.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        String taskNameArg = backgroundWorker.a.getInputData().getString("dev.fluttercommunity.workmanager.DART_TASK");
        if (taskNameArg == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Dart task is null");
            i.b bVar = i.Companion;
            Context applicationContext = backgroundWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            bVar.getClass();
            i.b.a(applicationContext, illegalStateException);
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            illegalStateException.getMessage();
            backgroundWorker.c(failure);
        } else {
            r rVar = backgroundWorker.b;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flutterApi");
                rVar = null;
            }
            b callback = new b(backgroundWorker);
            rVar.getClass();
            Intrinsics.checkNotNullParameter(taskNameArg, "taskNameArg");
            Intrinsics.checkNotNullParameter(callback, "callback");
            String a = defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerFlutterApi.executeTask", "");
            BinaryMessenger binaryMessenger = rVar.a;
            r.Companion.getClass();
            new BasicMessageChannel(binaryMessenger, a, r.b.getValue()).send(CollectionsKt.listOf(taskNameArg, linkedHashMap2), new q(callback, a));
        }
        return Unit.INSTANCE;
    }
}
