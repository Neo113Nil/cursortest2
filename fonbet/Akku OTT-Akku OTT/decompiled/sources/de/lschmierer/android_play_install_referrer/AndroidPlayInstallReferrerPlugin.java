package de.lschmierer.android_play_install_referrer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.ReferrerDetails;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u000bH\u0016J\u0012\u0010 \u001a\u00020\u00192\b\b\u0001\u0010!\u001a\u00020\u001bH\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\b\u0001\u0010\u001f\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\u0012\u0010'\u001a\u00020\u00192\b\b\u0001\u0010\u001f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006("}, d2 = {"Lde/lschmierer/android_play_install_referrer/AndroidPlayInstallReferrerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "context", "Landroid/content/Context;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "pendingResults", "Ljava/util/ArrayList;", "Lio/flutter/plugin/common/MethodChannel$Result;", "Lkotlin/collections/ArrayList;", "referrerClient", "Lcom/android/installreferrer/api/InstallReferrerClient;", "referrerDetails", "Lcom/android/installreferrer/api/ReferrerDetails;", "referrerError", "Lkotlin/Pair;", "", "isInstallReferrerPending", "", "()Z", "isInstallReferrerResolved", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "onDetachedFromEngine", "binding", "getInstallReferrer", "handleOnInstallReferrerSetupFinished", "responseCode", "", "resolvePendingInstallReferrerResults", "resolveInstallReferrerResult", "android_play_install_referrer_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPlayInstallReferrerPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlayInstallReferrerPlugin.kt\nde/lschmierer/android_play_install_referrer/AndroidPlayInstallReferrerPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1915#2,2:146\n*S KotlinDebug\n*F\n+ 1 AndroidPlayInstallReferrerPlugin.kt\nde/lschmierer/android_play_install_referrer/AndroidPlayInstallReferrerPlugin\n*L\n117#1:146,2\n*E\n"})
/* renamed from: de.lschmierer.android_play_install_referrer.b, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class AndroidPlayInstallReferrerPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public Context a;
    public MethodChannel b;
    public final ArrayList<MethodChannel.Result> c = new ArrayList<>(1);
    public com.android.installreferrer.api.a d;
    public ReferrerDetails e;
    public Pair<String, String> f;

    public final synchronized void a(@NonNull MethodChannel.Result result) {
        ReferrerDetails referrerDetails = this.e;
        if (referrerDetails != null) {
            result.success(MapsKt.mapOf(TuplesKt.to("installReferrer", referrerDetails.a.getString("install_referrer")), TuplesKt.to("referrerClickTimestampSeconds", Long.valueOf(referrerDetails.a.getLong("referrer_click_timestamp_seconds"))), TuplesKt.to("installBeginTimestampSeconds", Long.valueOf(referrerDetails.a.getLong("install_begin_timestamp_seconds"))), TuplesKt.to("referrerClickTimestampServerSeconds", Long.valueOf(referrerDetails.a.getLong("referrer_click_timestamp_server_seconds"))), TuplesKt.to("installBeginTimestampServerSeconds", Long.valueOf(referrerDetails.a.getLong("install_begin_timestamp_server_seconds"))), TuplesKt.to("installVersion", referrerDetails.a.getString("install_version")), TuplesKt.to("googlePlayInstantParam", Boolean.valueOf(referrerDetails.a.getBoolean("google_play_instant")))));
            return;
        }
        Pair<String, String> pair = this.f;
        if (pair != null) {
            result.error(pair.getFirst(), pair.getSecond(), null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "de.lschmierer.android_play_install_referrer");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final synchronized void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding binding) {
        try {
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.c.clear();
            com.android.installreferrer.api.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
            MethodChannel methodChannel = this.b;
            if (methodChannel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                methodChannel = null;
            }
            methodChannel.setMethodCallHandler(null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r3 != false) goto L39;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "getInstallReferrer")) {
            result.notImplemented();
            return;
        }
        synchronized (this) {
            try {
                synchronized (this) {
                    z = true;
                    if (this.e == null) {
                        if (this.f == null) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            a(result);
        } else {
            this.c.add(result);
            synchronized (this) {
                if (this.d != null) {
                    synchronized (this) {
                        if (this.e == null) {
                            if (this.f == null) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
                z = false;
                if (!z) {
                    Context context = this.a;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context = null;
                    }
                    if (context == null) {
                        throw new IllegalArgumentException("Please provide a valid Context.");
                    }
                    com.android.installreferrer.api.a aVar = new com.android.installreferrer.api.a(context);
                    this.d = aVar;
                    aVar.c(new a(this));
                }
            }
        }
    }
}
