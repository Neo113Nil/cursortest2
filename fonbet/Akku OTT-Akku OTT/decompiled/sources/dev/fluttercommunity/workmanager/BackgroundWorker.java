package dev.fluttercommunity.workmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.u;
import dev.fluttercommunity.workmanager.i;
import dev.fluttercommunity.workmanager.pigeon.m;
import dev.fluttercommunity.workmanager.pigeon.r;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u001e\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010&\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001c0\u001c0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Ldev/fluttercommunity/workmanager/BackgroundWorker;", "Landroidx/work/ListenableWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "flutterApi", "Ldev/fluttercommunity/workmanager/pigeon/WorkmanagerFlutterApi;", "payload", "", "", "", "getPayload", "()Ljava/util/Map;", "dartTask", "getDartTask", "()Ljava/lang/String;", "runAttemptCount", "", "randomThreadIdentifier", "engine", "Lio/flutter/embedding/engine/FlutterEngine;", "startTime", "", "completer", "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;", "Landroidx/work/ListenableWorker$Result;", "resolvableFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "kotlin.jvm.PlatformType", "startWork", "onStopped", "", "stopEngine", "result", "errorMessage", "executeBackgroundTask", "Companion", "workmanager_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundWorker.kt\ndev/fluttercommunity/workmanager/BackgroundWorker\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n567#2:223\n552#2,6:224\n508#2:230\n454#2:231\n493#2:236\n442#2:237\n508#2:242\n454#2:243\n493#2:248\n442#2:249\n1266#3,4:232\n1266#3,4:238\n1266#3,4:244\n*S KotlinDebug\n*F\n+ 1 BackgroundWorker.kt\ndev/fluttercommunity/workmanager/BackgroundWorker\n*L\n39#1:223\n39#1:224,6\n40#1:230\n40#1:231\n41#1:236\n41#1:237\n194#1:242\n194#1:243\n194#1:248\n194#1:249\n40#1:232,4\n41#1:238,4\n194#1:244,4\n*E\n"})
/* loaded from: classes4.dex */
public final class BackgroundWorker extends ListenableWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final FlutterLoader h = new FlutterLoader();
    public final WorkerParameters a;
    public r b;
    public final int c;
    public FlutterEngine d;
    public long e;
    public CallbackToFutureAdapter.Completer<ListenableWorker.Result> f;
    public final u<ListenableWorker.Result> g;

    /* renamed from: dev.fluttercommunity.workmanager.BackgroundWorker$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.a = workerParams;
        this.c = workerParams.getRunAttemptCount();
        new Random().nextInt();
        u<ListenableWorker.Result> future = CallbackToFutureAdapter.getFuture(new com.akku.ottapp.d(this));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        this.g = future;
    }

    public final LinkedHashMap b() {
        Object value;
        String replace$default;
        boolean startsWith$default;
        Map<String, Object> keyValueMap = this.a.getInputData().getKeyValueMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(entry.getKey(), "payload_", false, 2, null);
            if (startsWith$default) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            replace$default = StringsKt__StringsJVMKt.replace$default((String) entry2.getKey(), "payload_", "", false, 4, (Object) null);
            linkedHashMap2.put(replace$default, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            if (entry3.getValue() instanceof Object[]) {
                Object value2 = entry3.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Array<*>");
                value = ArraysKt.asList((Object[]) value2);
            } else {
                value = entry3.getValue();
            }
            linkedHashMap3.put(key, value);
        }
        return linkedHashMap3;
    }

    public final void c(ListenableWorker.Result result) {
        CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer;
        System.currentTimeMillis();
        String string = this.a.getInputData().getString("dev.fluttercommunity.workmanager.DART_TASK");
        if (string == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Dart task is null");
            i.b bVar = i.Companion;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            bVar.getClass();
            i.b.a(applicationContext, illegalStateException);
            CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer2 = this.f;
            if (completer2 != null) {
                completer2.set(ListenableWorker.Result.failure());
                return;
            }
            return;
        }
        f taskInfo = new f(string, null, b(), this.e, null, null, 50);
        m status = result instanceof ListenableWorker.Result.Success ? m.d : result instanceof ListenableWorker.Result.Retry ? m.i : m.e;
        i.b bVar2 = i.Companion;
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        i.a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        if (result != null && (completer = this.f) != null) {
            completer.set(result);
        }
        new Handler(Looper.getMainLooper()).post(new com.google.android.exoplayer2.source.hls.a(this, 1));
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        c(null);
    }

    @Override // androidx.work.ListenableWorker
    public final u<ListenableWorker.Result> startWork() {
        this.e = System.currentTimeMillis();
        this.d = new FlutterEngine(getApplicationContext());
        FlutterLoader flutterLoader = h;
        if (!flutterLoader.initialized()) {
            flutterLoader.startInitialization(getApplicationContext());
        }
        flutterLoader.ensureInitializationCompleteAsync(getApplicationContext(), null, new Handler(Looper.getMainLooper()), new androidx.room.c(this, 1));
        return this.g;
    }
}
