package dev.fluttercommunity.plus.wakelock;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import defpackage.h;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Ldev/fluttercommunity/plus/wakelock/WakelockPlusPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "LWakelockPlusApi;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "wakelock", "Ldev/fluttercommunity/plus/wakelock/Wakelock;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "toggle", NotificationCompat.CATEGORY_MESSAGE, "LToggleMessage;", "isEnabled", "LIsEnabledMessage;", "wakelock_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: dev.fluttercommunity.plus.wakelock.c, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class WakelockPlusPlugin implements FlutterPlugin, h, ActivityAware {
    public b a;

    @Override // defpackage.h
    public final void a(defpackage.c message) {
        Intrinsics.checkNotNullParameter(message, "msg");
        b bVar = this.a;
        Intrinsics.checkNotNull(bVar);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Activity activity = bVar.a;
        if (activity == null) {
            throw new a();
        }
        Intrinsics.checkNotNull(activity);
        Activity activity2 = bVar.a;
        Intrinsics.checkNotNull(activity2);
        boolean z = (activity2.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = message.a;
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            if (z) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (z) {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // defpackage.h
    public final defpackage.b isEnabled() {
        b bVar = this.a;
        Intrinsics.checkNotNull(bVar);
        Activity activity = bVar.a;
        if (activity == null) {
            throw new a();
        }
        Intrinsics.checkNotNull(activity);
        return new defpackage.b(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        b bVar = this.a;
        if (bVar != null) {
            bVar.a = binding.getActivity();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        h.a aVar = h.Companion;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        h.a.a(aVar, binaryMessenger, this);
        this.a = new b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        h.a aVar = h.Companion;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        h.a.a(aVar, binaryMessenger, null);
        this.a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
