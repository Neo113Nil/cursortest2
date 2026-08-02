package com.akku.ottapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.source.v;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/akku/ottapp/MainActivity;", "Lio/flutter/embedding/android/FlutterFragmentActivity;", "<init>", "()V", "CHANNEL", "", "SECURITY_CHANNEL", "PLAY_INTEGRITY_CHANNEL", "channel", "Lio/flutter/plugin/common/MethodChannel;", "securityChannel", "playIntegrityChannel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleDeepLinkIntent", "intent", "Landroid/content/Intent;", "onNewIntent", "configureFlutterEngine", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "requestIntegrityToken", "nonce", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "isDeviceRooted", "", "checkRootMethod1", "checkRootMethod2", "checkRootMethod3", "isDeveloperModeEnabled", "isUsbDebuggingEnabled", "setScreenProtection", "enable", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "enablePictureInPicture", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity extends FlutterFragmentActivity {
    public static final /* synthetic */ int e = 0;
    public final String a = "com.akku.ottapp.channel";
    public final String b = "com.akku.security";
    public final String c = "com.akku.play_integrity";
    public MethodChannel d;

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineConfigurator
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), this.a);
        this.d = methodChannel;
        methodChannel.setMethodCallHandler(new v(this));
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), this.b).setMethodCallHandler(new e(this));
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), this.c).setMethodCallHandler(new androidx.activity.result.a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle savedInstanceState) {
        String str;
        boolean contains$default;
        boolean contains$default2;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            String scheme = data.getScheme();
            String str2 = "";
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            str = "";
            String host = data.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    str2 = lowerCase;
                }
            }
            if (!Intrinsics.areEqual(str, "akkuott")) {
                contains$default = StringsKt__StringsKt.contains$default(str2, "akkuott.com", false, 2, (Object) null);
                if (!contains$default) {
                    contains$default2 = StringsKt__StringsKt.contains$default(str2, "app.akkuott.com", false, 2, (Object) null);
                    if (!contains$default2) {
                        return;
                    }
                }
            }
            data.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNewIntent(Intent intent) {
        String str;
        boolean contains$default;
        boolean contains$default2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            String str2 = "";
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            str = "";
            String host = data.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    str2 = lowerCase;
                }
            }
            if (!Intrinsics.areEqual(str, "akkuott")) {
                contains$default = StringsKt__StringsKt.contains$default(str2, "akkuott.com", false, 2, (Object) null);
                if (!contains$default) {
                    contains$default2 = StringsKt__StringsKt.contains$default(str2, "app.akkuott.com", false, 2, (Object) null);
                }
            }
            data.toString();
            super.onNewIntent(intent);
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        MethodChannel methodChannel = this.d;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("onPipModeChanged", Boolean.valueOf(isInPictureInPictureMode));
    }
}
