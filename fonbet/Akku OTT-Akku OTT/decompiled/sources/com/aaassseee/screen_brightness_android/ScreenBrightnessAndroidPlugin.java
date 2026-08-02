package com.aaassseee.screen_brightness_android;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.aaassseee.screen_brightness_android.stream_handler.b;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00103\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u0015H\u0002J\u0010\u00106\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00107\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00108\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00109\u001a\u00020'2\u0006\u00105\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0010\u0010;\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0018\u0010<\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u0010=\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\u0018\u0010>\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u0010?\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002J\b\u0010@\u001a\u00020'H\u0016J\u0010\u0010A\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010B\u001a\u00020'H\u0016J\u0010\u0010C\u001a\u00020'2\u0006\u0010+\u001a\u00020)H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u001f\u001a\u00020$2\u0006\u0010\b\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0015H\u0002J\u0010\u0010D\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010E\u001a\u00020$2\u0006\u00105\u001a\u00020\u0015H\u0002J\u0010\u0010F\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u0012\u0010!\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/aaassseee/screen_brightness_android/ScreenBrightnessAndroidPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "systemScreenBrightnessChangedEventChannel", "Lio/flutter/plugin/common/EventChannel;", "systemScreenBrightnessChangedStreamHandler", "Lcom/aaassseee/screen_brightness_android/stream_handler/ScreenBrightnessChangedStreamHandler;", "applicationScreenBrightnessChangedEventChannel", "applicationScreenBrightnessChangedStreamHandler", "contextObserver", "Landroid/database/ContentObserver;", "<set-?>", "", "maximumScreenBrightness", "getMaximumScreenBrightness", "()F", "setMaximumScreenBrightness", "(F)V", "maximumScreenBrightness$delegate", "Lkotlin/properties/ReadWriteProperty;", "systemScreenBrightness", "getSystemScreenBrightness", "setSystemScreenBrightness", "systemScreenBrightness$delegate", "applicationScreenBrightness", "Ljava/lang/Float;", "isAutoReset", "", "isAnimate", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onAttachedToActivity", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "handleGetSystemScreenBrightnessMethodCall", "handleSetSystemScreenBrightnessMethodCall", "handleSystemScreenBrightnessChanged", "brightness", "handleGetApplicationScreenBrightnessMethodCall", "handleSetApplicationScreenBrightnessMethodCall", "handleResetApplicationScreenBrightnessMethodCall", "handleApplicationScreenBrightnessChanged", "handleHasApplicationScreenBrightnessChangedMethodCall", "handleIsAutoResetMethodCall", "handleSetAutoResetMethodCall", "handleIsAnimateMethodCall", "handleSetAnimateMethodCall", "handleCanChangeSystemBrightness", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onDetachedFromEngine", "getScreenMaximumBrightness", "setWindowsAttributesBrightness", "canWriteSystemSetting", "screen_brightness_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenBrightnessAndroidPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenBrightnessAndroidPlugin.kt\ncom/aaassseee/screen_brightness_android/ScreenBrightnessAndroidPlugin\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,390:1\n29#2:391\n*S KotlinDebug\n*F\n+ 1 ScreenBrightnessAndroidPlugin.kt\ncom/aaassseee/screen_brightness_android/ScreenBrightnessAndroidPlugin\n*L\n339#1:391\n*E\n"})
/* renamed from: com.aaassseee.screen_brightness_android.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ScreenBrightnessAndroidPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {
    public static final /* synthetic */ KProperty<Object>[] p = {new MutablePropertyReference1Impl(ScreenBrightnessAndroidPlugin.class, "maximumScreenBrightness", "getMaximumScreenBrightness()F", 0), new MutablePropertyReference1Impl(ScreenBrightnessAndroidPlugin.class, "systemScreenBrightness", "getSystemScreenBrightness()F", 0)};
    public MethodChannel a;
    public Context b;
    public Activity c;
    public EventChannel d;
    public b e;
    public EventChannel f;
    public b i;
    public final a j = new a(new Handler(Looper.getMainLooper()));
    public final ReadWriteProperty k;
    public final ReadWriteProperty l;
    public Float m;
    public boolean n;
    public boolean o;

    /* renamed from: com.aaassseee.screen_brightness_android.a$a */
    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            b bVar;
            EventChannel.EventSink eventSink;
            EventChannel.EventSink eventSink2;
            super.onChange(z);
            ScreenBrightnessAndroidPlugin screenBrightnessAndroidPlugin = ScreenBrightnessAndroidPlugin.this;
            Context context = screenBrightnessAndroidPlugin.b;
            if (context != null) {
                try {
                    float f = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
                    ReadWriteProperty readWriteProperty = screenBrightnessAndroidPlugin.k;
                    KProperty<?>[] kPropertyArr = ScreenBrightnessAndroidPlugin.p;
                    screenBrightnessAndroidPlugin.l.setValue(screenBrightnessAndroidPlugin, kPropertyArr[1], Float.valueOf(f / ((Number) readWriteProperty.getValue(screenBrightnessAndroidPlugin, kPropertyArr[0])).floatValue()));
                    b bVar2 = screenBrightnessAndroidPlugin.e;
                    if (bVar2 != null && (eventSink2 = bVar2.a) != null) {
                        eventSink2.success(Float.valueOf(screenBrightnessAndroidPlugin.b()));
                    }
                    if (screenBrightnessAndroidPlugin.m != null || (bVar = screenBrightnessAndroidPlugin.i) == null || (eventSink = bVar.a) == null) {
                        return;
                    }
                    eventSink.success(Float.valueOf(screenBrightnessAndroidPlugin.b()));
                } catch (Settings.SettingNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ScreenBrightnessAndroidPlugin() {
        Delegates delegates = Delegates.INSTANCE;
        this.k = delegates.notNull();
        this.l = delegates.notNull();
        this.n = true;
        this.o = true;
    }

    public static float a(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager == null) {
                throw new ClassNotFoundException();
            }
            Field[] declaredFields = powerManager.getClass().getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (field.getName().equals("BRIGHTNESS_ON")) {
                    field.setAccessible(true);
                    Intrinsics.checkNotNull(field.get(powerManager), "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) r6).intValue();
                }
            }
            return 255.0f;
        } catch (Exception unused) {
            return 255.0f;
        }
    }

    public final float b() {
        return ((Number) this.l.getValue(this, p[1])).floatValue();
    }

    public final boolean c(float f) {
        try {
            Activity activity = this.c;
            Intrinsics.checkNotNull(activity);
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.screenBrightness = f;
            Activity activity2 = this.c;
            Intrinsics.checkNotNull(activity2);
            activity2.getWindow().setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.c = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ReadWriteProperty readWriteProperty = this.k;
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "github.com/aaassseee/screen_brightness");
        this.a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.d = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "github.com/aaassseee/screen_brightness/system_brightness_changed");
        this.f = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "github.com/aaassseee/screen_brightness/application_brightness_changed");
        try {
            Context applicationContext = flutterPluginBinding.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            float a2 = a(applicationContext);
            KProperty<?>[] kPropertyArr = p;
            readWriteProperty.setValue(this, kPropertyArr[0], Float.valueOf(a2));
            Intrinsics.checkNotNullExpressionValue(flutterPluginBinding.getApplicationContext(), "getApplicationContext(...)");
            this.l.setValue(this, kPropertyArr[1], Float.valueOf(Settings.System.getInt(r4.getContentResolver(), "screen_brightness") / ((Number) readWriteProperty.getValue(this, kPropertyArr[0])).floatValue()));
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        this.b = flutterPluginBinding.getApplicationContext();
        flutterPluginBinding.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.j);
        this.e = new b();
        EventChannel eventChannel = this.d;
        EventChannel eventChannel2 = null;
        if (eventChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("systemScreenBrightnessChangedEventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(this.e);
        this.i = new b();
        EventChannel eventChannel3 = this.f;
        if (eventChannel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationScreenBrightnessChangedEventChannel");
        } else {
            eventChannel2 = eventChannel3;
        }
        eventChannel2.setStreamHandler(this.i);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Context context = this.b;
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            contentResolver.unregisterContentObserver(this.j);
        }
        MethodChannel methodChannel = this.a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        EventChannel eventChannel = this.d;
        if (eventChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("systemScreenBrightnessChangedEventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(null);
        this.e = null;
        EventChannel eventChannel2 = this.f;
        if (eventChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationScreenBrightnessChangedEventChannel");
            eventChannel2 = null;
        }
        eventChannel2.setStreamHandler(null);
        this.i = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        boolean putInt;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            int hashCode = str.hashCode();
            ReadWriteProperty readWriteProperty = this.k;
            KProperty<?>[] kPropertyArr = p;
            switch (hashCode) {
                case -1467693354:
                    if (str.equals("isAutoReset")) {
                        result.success(Boolean.valueOf(this.n));
                        return;
                    }
                    break;
                case -1436714409:
                    if (str.equals("isAnimate")) {
                        result.success(Boolean.valueOf(this.o));
                        return;
                    }
                    break;
                case -1106725218:
                    if (str.equals("setAutoReset")) {
                        Object argument = call.argument("isAutoReset");
                        Boolean bool = argument instanceof Boolean ? (Boolean) argument : null;
                        if (bool == null) {
                            result.error("-2", "Unexpected error on null isAutoReset", null);
                            return;
                        } else {
                            this.n = bool.booleanValue();
                            result.success(null);
                            return;
                        }
                    }
                    break;
                case -1065890690:
                    if (str.equals("resetApplicationScreenBrightness")) {
                        if (this.b == null) {
                            result.error("-10", "Unexpected error on activity binding", null);
                            return;
                        }
                        if (!c(-1.0f)) {
                            result.error("-1", "Unable to reset screen brightness", null);
                            return;
                        }
                        this.m = null;
                        float b = b();
                        b bVar = this.i;
                        if (bVar != null) {
                            double d = b;
                            EventChannel.EventSink eventSink = bVar.a;
                            if (eventSink != null) {
                                eventSink.success(Double.valueOf(d));
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case -754168297:
                    if (str.equals("getApplicationScreenBrightness")) {
                        Activity activity = this.c;
                        if (activity == null) {
                            result.error("-10", "Unexpected error on activity binding", null);
                            return;
                        }
                        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                        Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                        float f = attributes.screenBrightness;
                        Float valueOf = Float.valueOf(f);
                        if (Math.signum(f) != -1.0f) {
                            result.success(valueOf);
                            return;
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(activity.getApplicationContext(), "getApplicationContext(...)");
                            result.success(Float.valueOf(Settings.System.getInt(r0.getContentResolver(), "screen_brightness") / ((Number) readWriteProperty.getValue(this, kPropertyArr[0])).floatValue()));
                            return;
                        } catch (Settings.SettingNotFoundException e) {
                            e.printStackTrace();
                            result.error("-11", "Could not found application screen brightness", null);
                            return;
                        }
                    }
                    break;
                case -618374773:
                    if (str.equals("setApplicationScreenBrightness")) {
                        if (this.b == null) {
                            result.error("-10", "Unexpected error on activity binding", null);
                            return;
                        }
                        Object argument2 = call.argument("brightness");
                        Double d2 = argument2 instanceof Double ? (Double) argument2 : null;
                        Float valueOf2 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
                        if (valueOf2 == null) {
                            result.error("-2", "Unexpected error on null brightness", null);
                            return;
                        }
                        if (!c(valueOf2.floatValue())) {
                            result.error("-1", "Unable to change application screen brightness", null);
                            return;
                        }
                        this.m = valueOf2;
                        float floatValue = valueOf2.floatValue();
                        b bVar2 = this.i;
                        if (bVar2 != null) {
                            double d3 = floatValue;
                            EventChannel.EventSink eventSink2 = bVar2.a;
                            if (eventSink2 != null) {
                                eventSink2.success(Double.valueOf(d3));
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 232928160:
                    if (str.equals("canChangeSystemBrightness")) {
                        Context context = this.b;
                        if (context == null) {
                            result.error("-10", "Unexpected error on activity binding", null);
                            return;
                        } else {
                            result.success(Boolean.valueOf(Settings.System.canWrite(context)));
                            return;
                        }
                    }
                    break;
                case 576725282:
                    if (str.equals("getSystemScreenBrightness")) {
                        result.success(Float.valueOf(b()));
                        return;
                    }
                    break;
                case 1131488993:
                    if (str.equals("hasApplicationScreenBrightnessChanged")) {
                        result.success(Boolean.valueOf(this.m != null));
                        return;
                    }
                    break;
                case 1420016942:
                    if (str.equals("setSystemScreenBrightness")) {
                        Context context2 = this.b;
                        if (context2 == null) {
                            result.error("-10", "Unexpected error on activity binding", null);
                            return;
                        }
                        Object argument3 = call.argument("brightness");
                        Double d4 = argument3 instanceof Double ? (Double) argument3 : null;
                        Float valueOf3 = d4 != null ? Float.valueOf((float) d4.doubleValue()) : null;
                        if (valueOf3 == null) {
                            result.error("-2", "Unexpected error on null brightness", null);
                            return;
                        }
                        float floatValue2 = valueOf3.floatValue();
                        if (Settings.System.canWrite(context2)) {
                            putInt = Settings.System.putInt(context2.getContentResolver(), "screen_brightness", (int) (((Number) readWriteProperty.getValue(this, kPropertyArr[0])).floatValue() * floatValue2));
                        } else {
                            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + context2.getPackageName()));
                            intent.addFlags(268435456);
                            context2.startActivity(intent);
                            putInt = false;
                        }
                        if (!putInt) {
                            result.error("-1", "Unable to change system screen brightness", null);
                            return;
                        }
                        this.l.setValue(this, kPropertyArr[1], valueOf3);
                        float floatValue3 = valueOf3.floatValue();
                        b bVar3 = this.e;
                        if (bVar3 != null) {
                            double d5 = floatValue3;
                            EventChannel.EventSink eventSink3 = bVar3.a;
                            if (eventSink3 != null) {
                                eventSink3.success(Double.valueOf(d5));
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 2116729887:
                    if (str.equals("setAnimate")) {
                        Object argument4 = call.argument("isAnimate");
                        Boolean bool2 = argument4 instanceof Boolean ? (Boolean) argument4 : null;
                        if (bool2 == null) {
                            result.error("-2", "Unexpected error on null isAnimate", null);
                            return;
                        } else {
                            this.o = bool2.booleanValue();
                            result.success(null);
                            return;
                        }
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.c = binding.getActivity();
    }
}
