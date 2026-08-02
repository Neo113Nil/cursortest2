package dev.fluttercommunity.plus.share;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMethodCallHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodCallHandler.kt\ndev/fluttercommunity/plus/share/MethodCallHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes4.dex */
public final class a implements MethodChannel.MethodCallHandler {
    public final d a;
    public final f b;

    public a(d share, f manager) {
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.a = share;
        this.b = manager;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result callback) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "result");
        if (!(call.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        f fVar = this.b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        AtomicBoolean atomicBoolean = fVar.b;
        if (atomicBoolean.compareAndSet(true, false)) {
            SharePlusPendingIntent.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            SharePlusPendingIntent.a = "";
            atomicBoolean.set(false);
            fVar.a = callback;
        } else {
            MethodChannel.Result result = fVar.a;
            if (result != null) {
                result.success("dev.fluttercommunity.plus/share/unavailable");
            }
            SharePlusPendingIntent.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            SharePlusPendingIntent.a = "";
            atomicBoolean.set(false);
            fVar.a = callback;
        }
        try {
            if (!Intrinsics.areEqual(call.method, FirebaseAnalytics.Event.SHARE)) {
                callback.notImplemented();
                return;
            }
            d dVar = this.a;
            Object arguments = call.arguments();
            Intrinsics.checkNotNull(arguments);
            dVar.c((Map) arguments);
        } catch (Throwable th) {
            fVar.b.set(true);
            fVar.a = null;
            callback.error("Share failed", th.getMessage(), th);
        }
    }
}
