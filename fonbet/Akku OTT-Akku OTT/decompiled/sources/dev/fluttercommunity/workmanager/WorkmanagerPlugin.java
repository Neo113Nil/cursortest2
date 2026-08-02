package dev.fluttercommunity.workmanager;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkInfo;
import dev.fluttercommunity.workmanager.pigeon.A;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.k;
import dev.fluttercommunity.workmanager.pigeon.l;
import dev.fluttercommunity.workmanager.pigeon.t;
import dev.fluttercommunity.workmanager.pigeon.u;
import dev.fluttercommunity.workmanager.pigeon.v;
import dev.fluttercommunity.workmanager.pigeon.w;
import dev.fluttercommunity.workmanager.pigeon.x;
import dev.fluttercommunity.workmanager.pigeon.y;
import dev.fluttercommunity.workmanager.pigeon.z;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J*\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00172\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00192\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001b2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J\"\u0010!\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J*\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016J\"\u0010$\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Ldev/fluttercommunity/workmanager/WorkmanagerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Ldev/fluttercommunity/workmanager/pigeon/WorkmanagerHostApi;", "<init>", "()V", "workManagerWrapper", "Ldev/fluttercommunity/workmanager/WorkManagerWrapper;", "preferenceManager", "Ldev/fluttercommunity/workmanager/SharedPreferenceHelper;", "currentDispatcherHandle", "", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "initialize", "request", "Ldev/fluttercommunity/workmanager/pigeon/InitializeRequest;", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "registerOneOffTask", "Ldev/fluttercommunity/workmanager/pigeon/OneOffTaskRequest;", "registerPeriodicTask", "Ldev/fluttercommunity/workmanager/pigeon/PeriodicTaskRequest;", "registerProcessingTask", "Ldev/fluttercommunity/workmanager/pigeon/ProcessingTaskRequest;", "cancelByUniqueName", "uniqueName", "", "cancelByTag", "tag", "cancelAll", "isScheduledByUniqueName", "", "printScheduledTasks", "workmanager_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkmanagerPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerPlugin.kt\ndev/fluttercommunity/workmanager/WorkmanagerPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1786#2,3:160\n*S KotlinDebug\n*F\n+ 1 WorkmanagerPlugin.kt\ndev/fluttercommunity/workmanager/WorkmanagerPlugin\n*L\n147#1:160,3\n*E\n"})
/* renamed from: dev.fluttercommunity.workmanager.j, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class WorkmanagerPlugin implements FlutterPlugin, B {
    public h a;
    public e b;
    public long c = -1;

    /* renamed from: dev.fluttercommunity.workmanager.j$a */
    public static final class a {
        public a() {
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void a(l request, v callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Result.Companion companion = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new UnsupportedOperationException("Processing tasks are not supported on Android")))));
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void b(k request, A callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.c == -1) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("You have not properly initialized the Flutter WorkManager Package. You should ensure you have called the 'initialize' function first!")))));
            return;
        }
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.c(request);
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void c(String uniqueWorkName, androidx.compose.runtime.snapshots.g callback) {
        boolean z;
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.getClass();
            Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
            List<WorkInfo> list = hVar.b.getWorkInfosForUniqueWork(uniqueWorkName).get();
            Intrinsics.checkNotNull(list);
            if (!list.isEmpty()) {
                if (!list.isEmpty()) {
                    for (WorkInfo workInfo : list) {
                        if (workInfo.getState() != WorkInfo.State.ENQUEUED && workInfo.getState() != WorkInfo.State.RUNNING) {
                        }
                    }
                }
                z = true;
                Result.Companion companion = Result.INSTANCE;
                callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Boolean.valueOf(z))));
            }
            z = false;
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Boolean.valueOf(z))));
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void d(dev.fluttercommunity.workmanager.pigeon.i request, w callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.c == -1) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("You have not properly initialized the Flutter WorkManager Package. You should ensure you have called the 'initialize' function first!")))));
            return;
        }
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.b(request);
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void e(dev.fluttercommunity.workmanager.pigeon.g request, u callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            long j = request.a;
            e eVar = this.b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferenceManager");
                eVar = null;
            }
            SharedPreferences sharedPreferences = eVar.a.getSharedPreferences("flutter_workmanager_plugin", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("dev.fluttercommunity.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY", j);
            edit.apply();
            this.c = j;
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void f(String tag, x callback) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.getClass();
            Intrinsics.checkNotNullParameter(tag, "tag");
            hVar.b.cancelAllWorkByTag(tag);
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void g(z callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.b.cancelAllWork();
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void h(y callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Result.Companion companion = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new UnsupportedOperationException("printScheduledTasks is not supported on Android")))));
    }

    @Override // dev.fluttercommunity.workmanager.pigeon.B
    public final void i(String uniqueWorkName, t callback) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            h hVar = this.a;
            Intrinsics.checkNotNull(hVar);
            hVar.getClass();
            Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
            hVar.b.cancelUniqueWork(uniqueWorkName);
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(e))));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = new e(applicationContext, new a());
        Context applicationContext2 = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        this.a = new h(applicationContext2);
        B.a aVar = B.Companion;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        B.a.b(aVar, binaryMessenger, this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        B.a aVar = B.Companion;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        B.a.b(aVar, binaryMessenger, null);
        this.a = null;
    }
}
