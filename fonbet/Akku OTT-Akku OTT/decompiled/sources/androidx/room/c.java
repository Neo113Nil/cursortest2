package androidx.room;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import dev.fluttercommunity.workmanager.e;
import dev.fluttercommunity.workmanager.i;
import dev.fluttercommunity.workmanager.pigeon.m;
import dev.fluttercommunity.workmanager.pigeon.p;
import dev.fluttercommunity.workmanager.pigeon.r;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.view.FlutterCallbackInformation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MultiInstanceInvalidationClient.setUpRunnable$lambda$1((MultiInstanceInvalidationClient) obj);
                break;
            default:
                BackgroundWorker backgroundWorker = (BackgroundWorker) obj;
                BackgroundWorker.Companion companion = BackgroundWorker.INSTANCE;
                e.a aVar = dev.fluttercommunity.workmanager.e.Companion;
                Context context = backgroundWorker.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                long j = context.getSharedPreferences("flutter_workmanager_plugin", 0).getLong("dev.fluttercommunity.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY", -1L);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
                if (lookupCallbackInformation != null) {
                    String string = backgroundWorker.a.getInputData().getString("dev.fluttercommunity.workmanager.DART_TASK");
                    if (string != null) {
                        String findAppBundlePath = BackgroundWorker.h.findAppBundlePath();
                        Intrinsics.checkNotNullExpressionValue(findAppBundlePath, "findAppBundlePath(...)");
                        dev.fluttercommunity.workmanager.f taskInfo = new dev.fluttercommunity.workmanager.f(string, null, backgroundWorker.b(), backgroundWorker.e, Long.valueOf(j), lookupCallbackInformation.callbackName, 2);
                        m status = backgroundWorker.c > 0 ? m.f : m.c;
                        i.b bVar = dev.fluttercommunity.workmanager.i.Companion;
                        Context context2 = backgroundWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
                        Intrinsics.checkNotNullParameter(status, "status");
                        dev.fluttercommunity.workmanager.i.a.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
                        Intrinsics.checkNotNullParameter(status, "status");
                        FlutterEngine flutterEngine = backgroundWorker.d;
                        if (flutterEngine != null) {
                            BinaryMessenger binaryMessenger = flutterEngine.getDartExecutor().getBinaryMessenger();
                            Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
                            backgroundWorker.b = new r(binaryMessenger);
                            flutterEngine.getDartExecutor().executeDartCallback(new DartExecutor.DartCallback(backgroundWorker.getApplicationContext().getAssets(), findAppBundlePath, lookupCallbackInformation));
                            r rVar = backgroundWorker.b;
                            if (rVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("flutterApi");
                                rVar = null;
                            }
                            dev.fluttercommunity.workmanager.a callback = new dev.fluttercommunity.workmanager.a(backgroundWorker);
                            rVar.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            String a = defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerFlutterApi.backgroundChannelInitialized", "");
                            BinaryMessenger binaryMessenger2 = rVar.a;
                            r.Companion.getClass();
                            new BasicMessageChannel(binaryMessenger2, a, r.b.getValue()).send(null, new p(callback, a));
                            break;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Dart task is null");
                        i.b bVar2 = dev.fluttercommunity.workmanager.i.Companion;
                        Context applicationContext = backgroundWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        bVar2.getClass();
                        i.b.a(applicationContext, illegalStateException);
                        CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer = backgroundWorker.f;
                        if (completer != null) {
                            completer.set(ListenableWorker.Result.failure());
                            break;
                        }
                    }
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(androidx.core.database.a.c(j, "Failed to resolve Dart callback for handle "));
                    i.b bVar3 = dev.fluttercommunity.workmanager.i.Companion;
                    Context applicationContext2 = backgroundWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    bVar3.getClass();
                    i.b.a(applicationContext2, illegalStateException2);
                    CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer2 = backgroundWorker.f;
                    if (completer2 != null) {
                        completer2.set(ListenableWorker.Result.failure());
                        break;
                    }
                }
                break;
        }
    }
}
