package com.akku.ottapp;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements MethodChannel.MethodCallHandler, ListenerSet.Event, com.google.android.datatransport.g, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ e(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.datatransport.g
    public Object apply(Object obj) {
        byte[] encode;
        encode = ((EventGDTLogger) this.a).encode((SessionEvent) obj);
        return encode;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysRestored((AnalyticsListener.EventTime) this.a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$initializeRecaptchaConfig$16((GeneratedAndroidFirebaseAuth.VoidResult) this.a, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.lambda$setUp$1((GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi) this.a, obj, reply);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (android.provider.Settings.Secure.getInt(r3.getContentResolver(), "development_settings_enabled", 0) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (android.provider.Settings.Secure.getInt(r3.getContentResolver(), "adb_enabled", 0) != 0) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        boolean z;
        boolean z2;
        boolean contains$default;
        final MainActivity mainActivity = (MainActivity) this.a;
        int i = MainActivity.e;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            z = true;
            switch (str.hashCode()) {
                case -1722728127:
                    if (str.equals("isDeviceRooted")) {
                        String str2 = Build.TAGS;
                        if (str2 != null) {
                            contains$default = StringsKt__StringsKt.contains$default(str2, "test-keys", false, 2, (Object) null);
                            break;
                        }
                        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/system/app/SuperSU.apk", "/system/app/SuperSU", "/system/app/Magisk.apk", "/sbin/magisk"};
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 14) {
                                Process process = null;
                                try {
                                    process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", CmcdConfiguration.KEY_STARTUP});
                                    InputStream inputStream = process.getInputStream();
                                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                                    z2 = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192).readLine() != null;
                                    process.destroy();
                                } catch (Throwable unused) {
                                    if (process != null) {
                                        process.destroy();
                                    }
                                    z2 = false;
                                }
                                if (!z2) {
                                    z = false;
                                }
                            } else if (!new File(strArr[i2]).exists()) {
                                i2++;
                            }
                        }
                        result.success(Boolean.valueOf(z));
                        return;
                    }
                    break;
                case 84296254:
                    if (str.equals("isDeveloperModeEnabled")) {
                        try {
                            break;
                        } catch (Exception unused2) {
                            break;
                        }
                    }
                    break;
                case 610999527:
                    if (str.equals("setScreenProtection")) {
                        Boolean bool = (Boolean) call.argument("enable");
                        final boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        mainActivity.runOnUiThread(new Runnable() { // from class: com.akku.ottapp.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = MainActivity.e;
                                boolean z3 = booleanValue;
                                MainActivity mainActivity2 = mainActivity;
                                if (z3) {
                                    mainActivity2.getWindow().setFlags(8192, 8192);
                                } else {
                                    mainActivity2.getWindow().clearFlags(8192);
                                }
                            }
                        });
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1049674893:
                    if (str.equals("isUsbDebuggingEnabled")) {
                        try {
                            break;
                        } catch (Exception unused3) {
                            break;
                        }
                    }
                    break;
            }
        }
        result.notImplemented();
        return;
        z = false;
        result.success(Boolean.valueOf(z));
        return;
        z = false;
        result.success(Boolean.valueOf(z));
    }
}
