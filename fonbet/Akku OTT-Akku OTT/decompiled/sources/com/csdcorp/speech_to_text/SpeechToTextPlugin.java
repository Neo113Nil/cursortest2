package com.csdcorp.speech_to_text;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import androidx.annotation.NonNull;
import androidx.compose.runtime.u;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.E;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020BH\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010F\u001a\u00020@2\b\b\u0001\u0010G\u001a\u00020BH\u0016J\b\u0010H\u001a\u00020@H\u0016J\u0010\u0010I\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020@H\u0016J\u001c\u0010M\u001a\u00020@2\b\b\u0001\u0010N\u001a\u00020O2\b\b\u0001\u0010P\u001a\u00020\u001bH\u0016J\u0010\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010S\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\b\u0010T\u001a\u00020\u0017H\u0002J\b\u0010U\u001a\u00020\u0017H\u0002J\b\u0010V\u001a\u00020\u0017H\u0002J\b\u0010W\u001a\u00020\u0017H\u0002J0\u0010X\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u0017H\u0002J\b\u0010]\u001a\u00020@H\u0002J\u0010\u0010^\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010_\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010`\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u0017H\u0002J\b\u0010c\u001a\u00020@H\u0002J\u001a\u0010d\u001a\u00020@2\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0010\u0010h\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0012\u0010i\u001a\u00020@2\b\u0010j\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010k\u001a\u00020@H\u0002J\b\u0010l\u001a\u00020@H\u0002J\u000e\u0010m\u001a\u0004\u0018\u00010n*\u00020\tH\u0002J\u0018\u0010o\u001a\u00020@2\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010p\u001a\u000205H\u0002J(\u0010q\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010p\u001a\u0002052\u0006\u0010\\\u001a\u00020\u0017H\u0002J\b\u0010r\u001a\u00020@H\u0002J-\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150v2\u0006\u0010w\u001a\u00020xH\u0016¢\u0006\u0002\u0010yJ\u0012\u0010z\u001a\u00020@2\b\u0010{\u001a\u0004\u0018\u00010fH\u0016J\u0012\u0010|\u001a\u00020@2\b\u0010{\u001a\u0004\u0018\u00010fH\u0016J\b\u0010}\u001a\u00020@H\u0016J\u0010\u0010~\u001a\u00020@2\u0006\u0010\u007f\u001a\u00020\rH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020@2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0082\u0001\u001a\u00020@2\u0007\u0010\u0083\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0084\u0001\u001a\u00020@2\u0007\u0010\u0085\u0001\u001a\u00020:H\u0016J\u0014\u0010\u0086\u0001\u001a\u00020@2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010fH\u0016J\u0015\u0010\u0088\u0001\u001a\u00020@2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\u001d\u0010\u008a\u0001\u001a\u00020@2\u0007\u0010\u0087\u0001\u001a\u00020\r2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010fH\u0016J\t\u0010\u008c\u0001\u001a\u00020@H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"}, d2 = {"Lcom/csdcorp/speech_to_text/SpeechToTextPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Landroid/speech/RecognitionListener;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "pluginContext", "Landroid/content/Context;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "minSdkForSpeechSupport", "", "brokenStopSdk", "minSdkForOnDeviceSpeechSupport", "speechToTextPermissionCode", "missingConfidence", "", "speechThresholdRms", "logTag", "", "recognizerStops", "", "currentActivity", "Landroid/app/Activity;", "activeResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "initializedSuccessfully", "permissionToRecordAudio", "listening", "debugLogging", "alwaysUseStop", "intentLookup", "noBluetoothOpt", "bluetoothDisabled", "resultSent", "lastOnDevice", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "recognizerIntent", "Landroid/content/Intent;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "pairedDevices", "", "Landroid/bluetooth/BluetoothDevice;", "activeBluetooth", "bluetoothHeadset", "Landroid/bluetooth/BluetoothHeadset;", "previousRecognizerLang", "previousPartialResults", "previousListenMode", "Lcom/csdcorp/speech_to_text/ListenMode;", "lastFinalTime", "", "speechStartTime", "minRms", "", "maxRms", "handler", "Landroid/os/Handler;", "defaultLanguageTag", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "applicationContext", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onDetachedFromEngine", "binding", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "rawrResult", "hasPermission", "result", "initialize", "sdkVersionTooLow", "isNotInitialized", "isListening", "isNotListening", "startListening", "languageTag", "partialResults", "listenModeIndex", "onDevice", "optionallyStartBluetooth", "stopListening", "cancelListening", "locales", "notifyListening", "isRecording", "optionallyStopBluetooth", "updateResults", "speechBundle", "Landroid/os/Bundle;", "isFinal", "isDuplicateFinal", "initializeIfPermitted", "context", "completeInitialize", "setupBluetooth", "findComponentName", "Landroid/content/ComponentName;", "createRecognizer", "listenMode", "setupRecognizerIntent", "destroyRecognizer", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "onPartialResults", "results", "onResults", "onEndOfSpeech", "onError", "errorCode", "debugLog", NotificationCompat.CATEGORY_MESSAGE, "sendError", "errorMsg", "onRmsChanged", "rmsdB", "onReadyForSpeech", "p0", "onBufferReceived", "", "onEvent", "p1", "onBeginningOfSpeech", "speech_to_text_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@TargetApi(8)
@SourceDebugExtension({"SMAP\nSpeechToTextPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeechToTextPlugin.kt\ncom/csdcorp/speech_to_text/SpeechToTextPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,848:1\n1915#2:849\n1916#2:851\n1#3:850\n*S KotlinDebug\n*F\n+ 1 SpeechToTextPlugin.kt\ncom/csdcorp/speech_to_text/SpeechToTextPlugin\n*L\n568#1:849\n568#1:851\n*E\n"})
/* renamed from: com.csdcorp.speech_to_text.n, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class SpeechToTextPlugin implements MethodChannel.MethodCallHandler, RecognitionListener, PluginRegistry.RequestPermissionsResultListener, FlutterPlugin, ActivityAware {
    public long A;
    public final String E;
    public Context a;
    public MethodChannel b;
    public Activity d;
    public b e;
    public boolean f;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public boolean q;
    public SpeechRecognizer r;
    public Intent s;
    public BluetoothAdapter t;
    public Set<BluetoothDevice> u;
    public BluetoothDevice v;
    public BluetoothHeadset w;
    public String x;
    public boolean c = true;
    public boolean o = true;
    public boolean y = true;
    public d z = d.a;
    public float B = 1000.0f;
    public float C = -100.0f;
    public final Handler D = new Handler(Looper.getMainLooper());

    public SpeechToTextPlugin() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        this.E = languageTag;
    }

    public final void a() {
        boolean isOnDeviceRecognitionAvailable;
        if (this.i) {
            Context context = this.a;
            if (context == null) {
                b bVar = this.e;
                if (bVar != null) {
                    bVar.success(Boolean.FALSE);
                }
                b bVar2 = this.e;
                if (bVar2 != null) {
                    bVar2.error("missingContext", "context unexpectedly null, initialization failed", "");
                }
                this.e = null;
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                    isOnDeviceRecognitionAvailable = SpeechRecognizer.isOnDeviceRecognitionAvailable(context);
                    if (!isOnDeviceRecognitionAvailable) {
                        b bVar3 = this.e;
                        if (bVar3 != null) {
                            bVar3.error("recognizerNotAvailable", "Speech recognition not available on this device", "");
                        }
                        this.e = null;
                        return;
                    }
                }
            } else if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                b bVar4 = this.e;
                if (bVar4 != null) {
                    bVar4.error("recognizerNotAvailable", "Speech recognition not available on this device", "");
                }
                this.e = null;
                return;
            }
            if (!this.o) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                this.t = defaultAdapter;
                this.u = defaultAdapter != null ? defaultAdapter.getBondedDevices() : null;
                m mVar = new m(this);
                BluetoothAdapter bluetoothAdapter = this.t;
                if (bluetoothAdapter != null) {
                    bluetoothAdapter.getProfileProxy(this.a, mVar, 1);
                }
            }
        }
        boolean z = this.i;
        this.f = z;
        b bVar5 = this.e;
        if (bVar5 != null) {
            bVar5.success(Boolean.valueOf(z));
        }
        this.e = null;
    }

    public final void b(b bVar) {
        this.c = Build.VERSION.SDK_INT != 29 || this.l;
        if (this.e != null) {
            bVar.error("multipleRequests", "Only one initialize at a time", null);
            return;
        }
        this.e = bVar;
        Context context = this.a;
        if (context == null) {
            a();
            return;
        }
        this.i = ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        this.o = ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") != 0 || this.n;
        if (this.i) {
            a();
            return;
        }
        Activity activity = this.d;
        if (activity == null) {
            a();
            return;
        }
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (!this.n) {
            strArr = (String[]) ArraysKt.plus(strArr, "android.permission.BLUETOOTH_CONNECT");
        }
        ActivityCompat.requestPermissions(activity, strArr, 28521);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, android.speech.SpeechRecognizer, java.lang.Object] */
    public final void c(b bVar) {
        boolean isOnDeviceRecognitionAvailable;
        ?? createOnDeviceSpeechRecognizer;
        Context context = this.a;
        Intrinsics.checkNotNull(context);
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        if (Build.VERSION.SDK_INT < 33 || !z) {
            Intent voiceDetailsIntent = RecognizerIntent.getVoiceDetailsIntent(this.a);
            if (voiceDetailsIntent == null) {
                voiceDetailsIntent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
                voiceDetailsIntent.setPackage("com.google.android.googlequicksearchbox");
            }
            Intent intent = voiceDetailsIntent;
            Context context2 = this.a;
            if (context2 != null) {
                context2.sendOrderedBroadcast(intent, null, new c(bVar, this.k), null, -1, null, null);
                return;
            }
            return;
        }
        Context context3 = this.a;
        Intrinsics.checkNotNull(context3);
        isOnDeviceRecognitionAvailable = SpeechRecognizer.isOnDeviceRecognitionAvailable(context3);
        if (isOnDeviceRecognitionAvailable) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Context context4 = this.a;
            Intrinsics.checkNotNull(context4);
            createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context4);
            Intrinsics.checkNotNullExpressionValue(createOnDeviceSpeechRecognizer, "createOnDeviceSpeechRecognizer(...)");
            objectRef.element = createOnDeviceSpeechRecognizer;
            Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) objectRef.element;
            if (speechRecognizer != null) {
                speechRecognizer.checkRecognitionSupport(intent2, Executors.newSingleThreadExecutor(), new l(bVar, this, objectRef));
            }
        }
    }

    public final void d(boolean z) {
        String str;
        if (this.j == z) {
            return;
        }
        this.j = z;
        if (z) {
            str = "listening";
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            str = "notListening";
        }
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.invokeMethod("notifyStatus", str);
        }
        if (z) {
            return;
        }
        String str2 = !this.p ? "doneNoResult" : "done";
        if (!this.o) {
            BluetoothDevice bluetoothDevice = this.v;
            BluetoothHeadset bluetoothHeadset = this.w;
            if (bluetoothDevice != null && bluetoothHeadset != null) {
                bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
                this.v = null;
            }
        }
        MethodChannel methodChannel2 = this.b;
        if (methodChannel2 != null) {
            methodChannel2.invokeMethod("notifyStatus", str2);
        }
    }

    public final void e(final String str, final boolean z, final d dVar, final boolean z2) {
        String str2 = this.x;
        if (str2 != null && Intrinsics.areEqual(str2, str) && z == this.y && this.z == dVar) {
            return;
        }
        this.x = str;
        this.y = z;
        this.z = dVar;
        this.D.post(new Runnable() { // from class: com.csdcorp.speech_to_text.k
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                SpeechToTextPlugin speechToTextPlugin = SpeechToTextPlugin.this;
                speechToTextPlugin.getClass();
                if (dVar == d.b) {
                    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                } else {
                    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                }
                Context context = speechToTextPlugin.a;
                if (context != null) {
                    intent.putExtra("calling_package", context.getApplicationInfo().packageName);
                }
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z);
                String languageTag = Locale.getDefault().toLanguageTag();
                String str3 = str;
                if (!Intrinsics.areEqual(str3, languageTag)) {
                    intent.putExtra("android.speech.extra.LANGUAGE", str3);
                }
                boolean z3 = z2;
                if (z3) {
                    intent.putExtra("android.speech.extra.PREFER_OFFLINE", z3);
                }
                intent.putExtra("android.speech.extra.MAX_RESULTS", 10);
                speechToTextPlugin.s = intent;
            }
        });
    }

    public final void f(b bVar, String str, boolean z, int i, final boolean z2) {
        if (!this.f || this.j) {
            bVar.success(Boolean.FALSE);
            return;
        }
        d dVar = d.values()[i];
        this.p = false;
        SpeechRecognizer speechRecognizer = this.r;
        Handler handler = this.D;
        if (speechRecognizer == null || z2 != this.q) {
            this.q = z2;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.r = null;
            handler.post(new Runnable() { // from class: com.csdcorp.speech_to_text.j
                @Override // java.lang.Runnable
                public final void run() {
                    boolean isOnDeviceRecognitionAvailable;
                    SpeechRecognizer createOnDeviceSpeechRecognizer;
                    ComponentName componentName;
                    ServiceInfo serviceInfo;
                    SpeechToTextPlugin speechToTextPlugin = SpeechToTextPlugin.this;
                    if (speechToTextPlugin.m) {
                        Context context = speechToTextPlugin.a;
                        if (context != null) {
                            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
                            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
                            queryIntentServices.size();
                            Iterator<T> it = queryIntentServices.iterator();
                            while (it.hasNext()) {
                                ServiceInfo serviceInfo2 = ((ResolveInfo) it.next()).serviceInfo;
                            }
                            ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull((List) queryIntentServices);
                            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                                SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context, componentName);
                                createSpeechRecognizer.setRecognitionListener(speechToTextPlugin);
                                speechToTextPlugin.r = createSpeechRecognizer;
                            }
                        }
                        componentName = null;
                        SpeechRecognizer createSpeechRecognizer2 = SpeechRecognizer.createSpeechRecognizer(context, componentName);
                        createSpeechRecognizer2.setRecognitionListener(speechToTextPlugin);
                        speechToTextPlugin.r = createSpeechRecognizer2;
                    } else {
                        if (Build.VERSION.SDK_INT >= 31 && z2) {
                            Context context2 = speechToTextPlugin.a;
                            Intrinsics.checkNotNull(context2);
                            isOnDeviceRecognitionAvailable = SpeechRecognizer.isOnDeviceRecognitionAvailable(context2);
                            if (isOnDeviceRecognitionAvailable) {
                                Context context3 = speechToTextPlugin.a;
                                Intrinsics.checkNotNull(context3);
                                createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context3);
                                createOnDeviceSpeechRecognizer.setRecognitionListener(speechToTextPlugin);
                                speechToTextPlugin.r = createOnDeviceSpeechRecognizer;
                            }
                        }
                        if (speechToTextPlugin.r == null) {
                            SpeechRecognizer createSpeechRecognizer3 = SpeechRecognizer.createSpeechRecognizer(speechToTextPlugin.a);
                            createSpeechRecognizer3.setRecognitionListener(speechToTextPlugin);
                            speechToTextPlugin.r = createSpeechRecognizer3;
                        }
                    }
                    if (speechToTextPlugin.r == null) {
                        b bVar2 = speechToTextPlugin.e;
                        if (bVar2 != null) {
                            bVar2.error("recognizerNotAvailable", "Speech recognizer null", "");
                        }
                        speechToTextPlugin.e = null;
                    }
                }
            });
            e(this.E, true, dVar, false);
        }
        this.B = 1000.0f;
        this.C = -100.0f;
        if (!this.o) {
            BluetoothAdapter bluetoothAdapter = this.t;
            Set<BluetoothDevice> set = this.u;
            BluetoothHeadset bluetoothHeadset = this.w;
            if (bluetoothAdapter != null && bluetoothHeadset != null && set != null && bluetoothAdapter.isEnabled()) {
                Iterator<BluetoothDevice> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (bluetoothHeadset.startVoiceRecognition(next)) {
                        this.v = next;
                        break;
                    }
                }
            }
        }
        e(str, z, dVar, z2);
        handler.post(new g(this, 0));
        System.currentTimeMillis();
        d(true);
        bVar.success(Boolean.TRUE);
    }

    public final void g(Bundle bundle, boolean z) {
        if (z) {
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            this.A = System.currentTimeMillis();
            if (currentTimeMillis >= 0 && currentTimeMillis < 100) {
                return;
            }
        }
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finalResult", z);
        float[] floatArray = bundle.getFloatArray("confidence_scores");
        JSONArray jSONArray = new JSONArray();
        int size = stringArrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("recognizedWords", stringArrayList.get(i));
                if (floatArray == null || floatArray.length < stringArrayList.size()) {
                    jSONObject2.put("confidence", -1.0d);
                } else {
                    jSONObject2.put("confidence", Float.valueOf(floatArray[i]));
                }
                jSONArray.put(jSONObject2);
                if (i == size) {
                    break;
                } else {
                    i++;
                }
            }
        }
        jSONObject.put("alternates", jSONArray);
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        this.p = true;
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.invokeMethod("textRecognition", jSONObject3);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.d = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        this.a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugin.csdcorp.com/speech_to_text");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] p0) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = null;
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.b = null;
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        d(false);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int errorCode) {
        String str;
        System.currentTimeMillis();
        switch ((7 != errorCode || this.C >= ((float) 9)) ? errorCode : 6) {
            case 1:
                str = "error_network_timeout";
                break;
            case 2:
                str = "error_network";
                break;
            case 3:
                str = "error_audio_error";
                break;
            case 4:
                str = "error_server";
                break;
            case 5:
                str = "error_client";
                break;
            case 6:
                str = "error_speech_timeout";
                break;
            case 7:
                str = "error_no_match";
                break;
            case 8:
                str = "error_busy";
                break;
            case 9:
                str = "error_permission";
                break;
            case 10:
                str = "error_too_many_requests";
                break;
            case 11:
                str = "error_server_disconnected";
                break;
            case 12:
                str = "error_language_not_supported";
                break;
            case 13:
                str = "error_language_unavailable";
                break;
            default:
                str = u.a(errorCode, "error_unknown (", ")");
                break;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", str);
        jSONObject.put("permanent", true);
        this.D.post(new i(0, this, jSONObject));
        if (this.j) {
            d(false);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int p0, Bundle p1) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result rawrResult) {
        Exception exc;
        String replace$default;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(rawrResult, "rawrResult");
        b bVar = new b(rawrResult);
        try {
            String str = call.method;
            try {
                if (str != null) {
                    int hashCode = str.hashCode();
                    Handler handler = this.D;
                    try {
                        switch (hashCode) {
                            case -1367724422:
                                if (!str.equals("cancel")) {
                                    bVar.notImplemented();
                                    break;
                                } else {
                                    if (this.f && this.j) {
                                        handler.post(new E(this, 1));
                                        if (!this.c) {
                                            handler.postDelayed(new androidx.lifecycle.a(this, 1), 50L);
                                        }
                                        d(false);
                                        bVar.success(Boolean.TRUE);
                                        break;
                                    }
                                    bVar.success(Boolean.FALSE);
                                }
                                break;
                            case -1198472044:
                                if (!str.equals("has_permission")) {
                                    bVar.notImplemented();
                                    break;
                                } else {
                                    Context context = this.a;
                                    if (context != null) {
                                        bVar.success(Boolean.valueOf(ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0));
                                        break;
                                    }
                                }
                                break;
                            case -1102508601:
                                if (!str.equals("listen")) {
                                    break;
                                } else {
                                    String str2 = (String) call.argument("localeId");
                                    if (str2 == null) {
                                        str2 = this.E;
                                    }
                                    replace$default = StringsKt__StringsJVMKt.replace$default(str2, '_', '-', false, 4, (Object) null);
                                    Boolean bool = (Boolean) call.argument("partialResults");
                                    if (bool == null) {
                                        bool = Boolean.TRUE;
                                    }
                                    Boolean bool2 = (Boolean) call.argument("onDevice");
                                    if (bool2 == null) {
                                        bool2 = Boolean.FALSE;
                                    }
                                    Integer num = (Integer) call.argument("listenMode");
                                    if (num == null) {
                                        bVar.error("missingOrInvalidArg", "listenMode is required", null);
                                        break;
                                    } else {
                                        try {
                                            f(bVar, replace$default, bool.booleanValue(), num.intValue(), bool2.booleanValue());
                                            break;
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            bVar.error(EnvironmentCompat.MEDIA_UNKNOWN, "Unexpected exception", exc.getLocalizedMessage());
                                            return;
                                        }
                                    }
                                }
                            case 3540994:
                                if (!str.equals("stop")) {
                                    break;
                                } else {
                                    if (this.f && this.j) {
                                        handler.post(new h(this, 0));
                                        if (!this.c) {
                                            handler.postDelayed(new androidx.lifecycle.a(this, 1), 50L);
                                        }
                                        d(false);
                                        bVar.success(Boolean.TRUE);
                                        break;
                                    }
                                    bVar.success(Boolean.FALSE);
                                }
                                break;
                            case 338410841:
                                if (!str.equals("locales")) {
                                    break;
                                } else {
                                    c(bVar);
                                    break;
                                }
                            case 871091088:
                                if (!str.equals("initialize")) {
                                    break;
                                } else {
                                    Boolean bool3 = (Boolean) call.argument("debugLogging");
                                    if (bool3 != null) {
                                        this.k = bool3.booleanValue();
                                    }
                                    Boolean bool4 = (Boolean) call.argument("alwaysUseStop");
                                    if (bool4 != null) {
                                        this.l = Intrinsics.areEqual(bool4, Boolean.TRUE);
                                    }
                                    Boolean bool5 = (Boolean) call.argument("intentLookup");
                                    if (bool5 != null) {
                                        this.m = Intrinsics.areEqual(bool5, Boolean.TRUE);
                                    }
                                    Boolean bool6 = (Boolean) call.argument("noBluetooth");
                                    if (bool6 != null) {
                                        this.n = Intrinsics.areEqual(bool6, Boolean.TRUE);
                                    }
                                    b(bVar);
                                    break;
                                }
                        }
                        return;
                    } catch (Exception e2) {
                        exc = e2;
                        bVar.error(EnvironmentCompat.MEDIA_UNKNOWN, "Unexpected exception", exc.getLocalizedMessage());
                        return;
                    }
                }
                bVar.notImplemented();
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle results) {
        g(results, false);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle p0) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.d = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 28521) {
            return false;
        }
        this.i = grantResults.length != 0 && grantResults[0] == 0;
        this.o = grantResults.length == 0 || grantResults.length == 1 || grantResults[1] != 0 || this.n;
        a();
        return true;
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle results) {
        g(results, true);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(final float rmsdB) {
        if (rmsdB < this.B) {
            this.B = rmsdB;
        }
        if (rmsdB > this.C) {
            this.C = rmsdB;
        }
        this.D.post(new Runnable() { // from class: com.csdcorp.speech_to_text.f
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel methodChannel = SpeechToTextPlugin.this.b;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("soundLevelChange", Float.valueOf(rmsdB));
                }
            }
        });
    }
}
