package com.amplitude.amplitude_flutter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.core.app.NotificationCompat;
import com.amplitude.android.d;
import com.amplitude.android.h;
import com.amplitude.android.j;
import com.amplitude.android.l;
import com.amplitude.android.x;
import com.amplitude.android.y;
import com.amplitude.common.a;
import com.amplitude.core.e;
import com.amplitude.core.f;
import com.amplitude.core.i;
import com.amplitude.core.platform.m;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.internal.C1086c;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001fH\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J \u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\"\u001a\u00020#H\u0002J\u001c\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020/0\u0007H\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010\"\u001a\u00020#H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/amplitude/amplitude_flutter/AmplitudeFlutterPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "instances", "", "", "Lcom/amplitude/android/Amplitude;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "ctxt", "Landroid/content/Context;", "getCtxt", "()Landroid/content/Context;", "setCtxt", "(Landroid/content/Context;)V", "appOpenedTracked", "", "channel", "Lio/flutter/plugin/common/MethodChannel;", "onAttachedToActivity", "", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onAttachedToEngine", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "trackAppLifecycleAndDeepLinkEvents", "amplitude", "appLifecycles", "deepLinks", "getConfiguration", "Lcom/amplitude/android/Configuration;", "convertMapToTrackingOptions", "Lcom/amplitude/android/TrackingOptions;", "map", "", "getEvent", "Lcom/amplitude/core/events/BaseEvent;", "Companion", "amplitude_flutter_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmplitudeFlutterPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmplitudeFlutterPlugin.kt\ncom/amplitude/amplitude_flutter/AmplitudeFlutterPlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* renamed from: com.amplitude.amplitude_flutter.b, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class AmplitudeFlutterPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {
    public Map<String, ? extends com.amplitude.android.a> a = new LinkedHashMap();
    public WeakReference<Activity> b = new WeakReference<>(null);
    public Context c;
    public boolean d;
    public MethodChannel e;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = new WeakReference<>(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        this.c = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "amplitude_flutter");
        this.e = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.b = new WeakReference<>(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.b = new WeakReference<>(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.e;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0583, code lost:
    
        if (r15.equals("groupIdentify") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x069f, code lost:
    
        r4 = r33.argument(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r4 = (java.util.Map) r4;
        r7 = new com.amplitude.core.events.a();
        r15 = r4.get("event_type");
        kotlin.jvm.internal.Intrinsics.checkNotNull(r15, "null cannot be cast to non-null type kotlin.String");
        r15 = (java.lang.String) r15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "<set-?>");
        r7.O = r15;
        r0 = r4.get("event_properties");
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06c9, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06cb, code lost:
    
        r0 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06cf, code lost:
    
        if (r0 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06d1, code lost:
    
        r7.P = kotlin.collections.MapsKt.toMutableMap(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06d7, code lost:
    
        r0 = r4.get("user_properties");
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06e0, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06e2, code lost:
    
        r0 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06e6, code lost:
    
        if (r0 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06e8, code lost:
    
        r7.Q = kotlin.collections.MapsKt.toMutableMap(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06ee, code lost:
    
        r0 = r4.get("groups");
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06f6, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06f8, code lost:
    
        r0 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06fc, code lost:
    
        if (r0 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06fe, code lost:
    
        r7.R = kotlin.collections.MapsKt.toMutableMap(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0704, code lost:
    
        r0 = r4.get("group_properties");
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x070c, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x070e, code lost:
    
        r0 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0712, code lost:
    
        if (r0 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0714, code lost:
    
        r7.S = kotlin.collections.MapsKt.toMutableMap(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x071a, code lost:
    
        r0 = r4.get("user_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0723, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0725, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0729, code lost:
    
        if (r0 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x072b, code lost:
    
        r7.a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x072d, code lost:
    
        r0 = r4.get("device_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0735, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0737, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x073b, code lost:
    
        if (r0 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x073d, code lost:
    
        r7.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x073f, code lost:
    
        r0 = r4.get(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0748, code lost:
    
        if ((r0 instanceof java.lang.Integer) == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x074a, code lost:
    
        r0 = (java.lang.Integer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x074e, code lost:
    
        if (r0 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0750, code lost:
    
        r7.c = java.lang.Long.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x075b, code lost:
    
        r0 = r4.get("event_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0763, code lost:
    
        if ((r0 instanceof java.lang.Integer) == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0765, code lost:
    
        r0 = (java.lang.Integer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0769, code lost:
    
        if (r0 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x076b, code lost:
    
        r7.d = java.lang.Long.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0776, code lost:
    
        r0 = r4.get("session_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x077e, code lost:
    
        if ((r0 instanceof java.lang.Integer) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0780, code lost:
    
        r0 = (java.lang.Integer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0784, code lost:
    
        if (r0 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0786, code lost:
    
        r7.e = java.lang.Long.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0791, code lost:
    
        r0 = r4.get("insert_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0799, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x079b, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x079f, code lost:
    
        if (r0 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x07a1, code lost:
    
        r7.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07a3, code lost:
    
        r0 = r4.get("location_lat");
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07ab, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07ad, code lost:
    
        r0 = (java.lang.Double) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x07b1, code lost:
    
        if (r0 == null) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x07b3, code lost:
    
        r7.g = java.lang.Double.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x07bd, code lost:
    
        r0 = r4.get("location_lng");
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x07c5, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x07c7, code lost:
    
        r0 = (java.lang.Double) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x07cb, code lost:
    
        if (r0 == null) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x07cd, code lost:
    
        r7.h = java.lang.Double.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x07d7, code lost:
    
        r0 = r4.get("app_version");
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x07df, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x07e1, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x07e5, code lost:
    
        if (r0 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x07e7, code lost:
    
        r7.i = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x07e9, code lost:
    
        r0 = r4.get("version_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07ef, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07f1, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07f6, code lost:
    
        if (r3 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x07f8, code lost:
    
        r7.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07fa, code lost:
    
        r0 = r4.get("platform");
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0800, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0802, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0807, code lost:
    
        if (r3 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0809, code lost:
    
        r7.k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x080b, code lost:
    
        r0 = r4.get("os_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0811, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0813, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0818, code lost:
    
        if (r3 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x081a, code lost:
    
        r7.l = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x081c, code lost:
    
        r0 = r4.get("os_version");
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0822, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0824, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0829, code lost:
    
        if (r3 == null) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x082b, code lost:
    
        r7.m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x082d, code lost:
    
        r0 = r4.get("device_brand");
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0833, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0835, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x083a, code lost:
    
        if (r3 == null) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x083c, code lost:
    
        r7.n = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x083e, code lost:
    
        r0 = r4.get("device_manufacturer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0844, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0846, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x084b, code lost:
    
        if (r3 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x084d, code lost:
    
        r7.o = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x084f, code lost:
    
        r0 = r4.get("device_model");
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0855, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0857, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x085c, code lost:
    
        if (r3 == null) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x085e, code lost:
    
        r7.p = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0860, code lost:
    
        r0 = r4.get("carrier");
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0868, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x086a, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x086f, code lost:
    
        if (r3 == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0871, code lost:
    
        r7.q = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0873, code lost:
    
        r0 = r4.get("country");
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x087b, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x087d, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0882, code lost:
    
        if (r3 == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0884, code lost:
    
        r7.r = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0886, code lost:
    
        r0 = r4.get("region");
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x088e, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0890, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0895, code lost:
    
        if (r3 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0897, code lost:
    
        r7.s = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0899, code lost:
    
        r0 = r4.get("city");
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x08a1, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08a3, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x08a8, code lost:
    
        if (r3 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08aa, code lost:
    
        r7.t = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x08ac, code lost:
    
        r0 = r4.get("dma");
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08b4, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x08b6, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x08bb, code lost:
    
        if (r3 == null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x08bd, code lost:
    
        r7.u = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x08bf, code lost:
    
        r0 = r4.get("idfa");
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x08c7, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x08c9, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x08ce, code lost:
    
        if (r3 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x08d0, code lost:
    
        r7.v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x08d2, code lost:
    
        r0 = r4.get("idfv");
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x08da, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x08dc, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x08e1, code lost:
    
        if (r3 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08e3, code lost:
    
        r7.w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08e5, code lost:
    
        r0 = r4.get("adid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x08ed, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x08ef, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x08f4, code lost:
    
        if (r3 == null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08f6, code lost:
    
        r7.x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08f8, code lost:
    
        r0 = r4.get("app_set_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0900, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0902, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0907, code lost:
    
        if (r3 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0909, code lost:
    
        r7.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x090b, code lost:
    
        r0 = r4.get("android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0913, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0915, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x091a, code lost:
    
        if (r3 == null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x091c, code lost:
    
        r7.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x091e, code lost:
    
        r0 = r4.get("language");
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0926, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0928, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x092d, code lost:
    
        if (r3 == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x092f, code lost:
    
        r7.A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0931, code lost:
    
        r0 = r4.get("library");
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0939, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x093b, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0940, code lost:
    
        if (r3 == null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0942, code lost:
    
        r7.B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0944, code lost:
    
        r0 = r4.get("ip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x094c, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x094e, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0953, code lost:
    
        if (r3 == null) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0955, code lost:
    
        r7.C = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0957, code lost:
    
        r0 = r4.get("plan");
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x095f, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0961, code lost:
    
        r3 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0966, code lost:
    
        if (r3 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0968, code lost:
    
        r1 = r3.get("branch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0972, code lost:
    
        if ((r1 instanceof java.lang.String) == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0974, code lost:
    
        r1 = (java.lang.String) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0978, code lost:
    
        r2 = r3.get("source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0981, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0983, code lost:
    
        r2 = (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0987, code lost:
    
        r9 = r3.get("version");
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0990, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0992, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0996, code lost:
    
        r3 = r3.get("versionId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x099f, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09a1, code lost:
    
        r3 = (java.lang.String) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x09a5, code lost:
    
        r7.D = new com.amplitude.android.events.b(r1, r2, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09a4, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0995, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0986, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0977, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x09aa, code lost:
    
        r0 = r4.get("ingestion_metadata");
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x09b2, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x09b4, code lost:
    
        r3 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x09b9, code lost:
    
        if (r3 == null) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x09bb, code lost:
    
        r1 = r3.get("sourceName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x09c6, code lost:
    
        if ((r1 instanceof java.lang.String) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x09c8, code lost:
    
        r1 = (java.lang.String) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x09cc, code lost:
    
        r2 = r3.get("sourceVersion");
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x09d5, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x09d7, code lost:
    
        r3 = (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x09dc, code lost:
    
        r7.E = new com.amplitude.android.events.a(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x09db, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x09cb, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x09e1, code lost:
    
        r0 = r4.get("revenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x09e7, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x09e9, code lost:
    
        r3 = (java.lang.Double) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x09ee, code lost:
    
        if (r3 == null) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x09f0, code lost:
    
        r7.F = java.lang.Double.valueOf(r3.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x09fa, code lost:
    
        r0 = r4.get(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a02, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0a04, code lost:
    
        r3 = (java.lang.Double) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a09, code lost:
    
        if (r3 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0a0b, code lost:
    
        r7.G = java.lang.Double.valueOf(r3.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0a15, code lost:
    
        r0 = r4.get(com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0a1d, code lost:
    
        if ((r0 instanceof java.lang.Integer) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0a1f, code lost:
    
        r3 = (java.lang.Integer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0a24, code lost:
    
        if (r3 == null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0a26, code lost:
    
        r7.H = java.lang.Integer.valueOf(r3.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a30, code lost:
    
        r0 = r4.get("product_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0a38, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0a3a, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0a3f, code lost:
    
        if (r3 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0a41, code lost:
    
        r7.I = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a43, code lost:
    
        r0 = r4.get("revenue_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a4b, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a4d, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0a52, code lost:
    
        if (r3 == null) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a54, code lost:
    
        r7.J = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a56, code lost:
    
        r0 = r4.get(com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0a5e, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0a60, code lost:
    
        r3 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0a65, code lost:
    
        if (r3 == null) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a67, code lost:
    
        r7.K = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0a69, code lost:
    
        r0 = r4.get("extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0a71, code lost:
    
        if ((r0 instanceof java.util.Map) == false) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0a73, code lost:
    
        r3 = (java.util.Map) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0a78, code lost:
    
        if (r3 == null) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0a7a, code lost:
    
        r7.L = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0a7c, code lost:
    
        r0 = r4.get("partner_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0a84, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0a86, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0a8a, code lost:
    
        if (r0 == null) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0a8c, code lost:
    
        r7.M = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0a8e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "event");
        r5.k(r7);
        r5.i().c("Track " + r33.method + " event: " + r33.arguments);
        r0 = new java.lang.StringBuilder();
        r0.append(r33.method);
        r0.append(" called..");
        r34.success(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0acf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0a89, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0a77, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0a64, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0a51, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0a3e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0a23, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0a08, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x09ed, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x09b8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0965, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0952, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x093f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x092c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0919, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0906, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x08f3, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x08e0, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x08cd, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x08ba, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x08a7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0894, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0881, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x086e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x085b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x084a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0839, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0828, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0817, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0806, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x07f5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x07e4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x07ca, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x07b0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x079e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0783, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0768, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x074d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x073a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0728, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0711, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x06fb, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x06e5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x06ce, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x058f, code lost:
    
        if (r15.equals("setGroup") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0596, code lost:
    
        if (r15.equals("revenue") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0649, code lost:
    
        if (r15.equals("track") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x069b, code lost:
    
        if (r15.equals("identify") == false) goto L274;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        MethodCall methodCall;
        String str;
        String str2;
        com.amplitude.android.utilities.c cVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "init")) {
            String str3 = (String) call.argument("instanceName");
            if (str3 == null) {
                str3 = "$default_instance";
            }
            com.amplitude.android.a aVar = this.a.get(str3);
            if (aVar == null) {
                throw new IllegalArgumentException(android.support.v4.media.b.b("Amplitude instance ", str3, " not found"));
            }
            C1101n0 c1101n0 = aVar.d;
            C1086c c1086c = aVar.c;
            String str4 = call.method;
            if (str4 != null) {
                switch (str4.hashCode()) {
                    case -1196455789:
                        methodCall = call;
                        if (str4.equals("setDeviceId")) {
                            Object argument = methodCall.argument("properties");
                            Intrinsics.checkNotNull(argument);
                            String deviceId = (String) ((Map) argument).get("setDeviceId");
                            if (deviceId != null) {
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                                C1082i.c(aVar.c, aVar.d, null, new e(aVar, deviceId, null), 2);
                            }
                            aVar.i().c("Set deviceId to " + methodCall.arguments);
                            result.success("setDeviceId called..");
                            return;
                        }
                        aVar.i().c("Method " + methodCall.method + " is not recognized.");
                        result.notImplemented();
                        return;
                    case -1107875961:
                        methodCall = call;
                        if (str4.equals("getDeviceId")) {
                            String str5 = aVar.l != null ? aVar.f().a.a().b : null;
                            aVar.i().c("Get deviceId: " + str5);
                            result.success(str5);
                            return;
                        }
                        aVar.i().c("Method " + methodCall.method + " is not recognized.");
                        result.notImplemented();
                        return;
                    case -135762164:
                        break;
                    case 97532676:
                        if (str4.equals("flush")) {
                            aVar.e();
                            aVar.i().c("Flush events.");
                            result.success("flush called..");
                            return;
                        }
                        break;
                    case 108404047:
                        if (str4.equals("reset")) {
                            C1082i.c(c1086c, c1101n0, null, new f(aVar, null, null), 2);
                            C1082i.c(c1086c, c1101n0, null, new com.amplitude.android.e(aVar, null), 2);
                            aVar.i().c("Reset userId and deviceId.");
                            result.success("reset called..");
                            return;
                        }
                        break;
                    case 110621003:
                        break;
                    case 598192027:
                        if (str4.equals("getSessionId")) {
                            m mVar = aVar.g;
                            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type com.amplitude.android.Timeline");
                            long j = ((x) mVar).e.get();
                            aVar.i().c("Get sessionId: " + j);
                            result.success(Long.valueOf(j));
                            return;
                        }
                        break;
                    case 645367112:
                        if (str4.equals("setUserId")) {
                            Object argument2 = call.argument("properties");
                            Intrinsics.checkNotNull(argument2);
                            C1082i.c(c1086c, c1101n0, null, new f(aVar, (String) ((Map) argument2).get("setUserId"), null), 2);
                            aVar.i().c("Set userId to " + call.arguments);
                            result.success("setUserId called..");
                            return;
                        }
                        break;
                    case 859984188:
                        if (str4.equals("getUserId")) {
                            String str6 = aVar.l != null ? aVar.f().a.a().a : null;
                            aVar.i().c("Get userId: " + str6);
                            result.success(str6);
                            return;
                        }
                        break;
                    case 1099842588:
                        break;
                    case 1393342269:
                        break;
                    case 1916852907:
                        break;
                }
            }
            methodCall = call;
            aVar.i().c("Method " + methodCall.method + " is not recognized.");
            result.notImplemented();
            return;
        }
        Object argument3 = call.argument("apiKey");
        Intrinsics.checkNotNull(argument3);
        String str7 = (String) argument3;
        Context context = this.c;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ctxt");
            context = null;
        }
        h configuration = new h(context, str7);
        Integer num = (Integer) call.argument("flushQueueSize");
        if (num != null) {
            configuration.c = num.intValue();
        }
        Integer num2 = (Integer) call.argument("flushIntervalMillis");
        if (num2 != null) {
            configuration.d = num2.intValue();
        }
        String str8 = (String) call.argument("instanceName");
        if (str8 != null) {
            Intrinsics.checkNotNullParameter(str8, "<set-?>");
            configuration.e = str8;
        }
        Boolean bool = (Boolean) call.argument("optOut");
        if (bool != null) {
            configuration.f = bool.booleanValue();
        }
        Integer num3 = (Integer) call.argument("minIdLength");
        if (num3 != null) {
            configuration.i = Integer.valueOf(num3.intValue());
        }
        String str9 = (String) call.argument("partnerId");
        if (str9 != null) {
            configuration.j = str9;
        }
        Integer num4 = (Integer) call.argument("flushMaxRetries");
        if (num4 != null) {
            configuration.k = num4.intValue();
        }
        Boolean bool2 = (Boolean) call.argument("useBatch");
        if (bool2 != null) {
            configuration.l = bool2.booleanValue();
        }
        String str10 = (String) call.argument("serverZone");
        if (str10 != null) {
            String upperCase = str10.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            i valueOf = i.valueOf(upperCase);
            Intrinsics.checkNotNullParameter(valueOf, "<set-?>");
            configuration.m = valueOf;
        }
        String str11 = (String) call.argument("serverUrl");
        if (str11 != null) {
            configuration.n = str11;
        }
        if (((Integer) call.argument("minTimeBetweenSessionsMillis")) != null) {
            str = "toUpperCase(...)";
            configuration.u = r7.intValue();
        } else {
            str = "toUpperCase(...)";
        }
        Map map = (Map) call.argument("defaultTracking");
        if (map != null) {
            Object obj = map.get("sessions");
            Boolean bool3 = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool3 != null ? bool3.booleanValue() : true;
            Object obj2 = map.get("appLifecycles");
            str2 = "<set-?>";
            Boolean bool4 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
            Object obj3 = map.get("deepLinks");
            Boolean bool5 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            l value = new l(booleanValue, booleanValue2, bool5 != null ? bool5.booleanValue() : false, false);
            Intrinsics.checkNotNullParameter(value, "value");
            configuration.E = value;
            configuration.D = value.a();
            j listener = new j(configuration);
            Intrinsics.checkNotNullParameter(listener, "listener");
            value.e.add(listener);
        } else {
            str2 = "<set-?>";
        }
        Map map2 = (Map) call.argument("trackingOptions");
        if (map2 != null) {
            y yVar = new y();
            Object obj4 = map2.get("ipAddress");
            Boolean bool6 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            if (bool6 != null && !bool6.booleanValue()) {
                yVar.a("ip_address");
            }
            Object obj5 = map2.get("language");
            Boolean bool7 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
            if (bool7 != null && !bool7.booleanValue()) {
                yVar.a("language");
            }
            Object obj6 = map2.get("platform");
            Boolean bool8 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            if (bool8 != null && !bool8.booleanValue()) {
                yVar.a("platform");
            }
            Object obj7 = map2.get("region");
            Boolean bool9 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
            if (bool9 != null && !bool9.booleanValue()) {
                yVar.a("region");
            }
            Object obj8 = map2.get("dma");
            Boolean bool10 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
            if (bool10 != null && !bool10.booleanValue()) {
                yVar.a("dma");
            }
            Object obj9 = map2.get("country");
            Boolean bool11 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
            if (bool11 != null && !bool11.booleanValue()) {
                yVar.a("country");
            }
            Object obj10 = map2.get("city");
            Boolean bool12 = obj10 instanceof Boolean ? (Boolean) obj10 : null;
            if (bool12 != null && !bool12.booleanValue()) {
                yVar.a("city");
            }
            Object obj11 = map2.get("carrier");
            Boolean bool13 = obj11 instanceof Boolean ? (Boolean) obj11 : null;
            if (bool13 != null && !bool13.booleanValue()) {
                yVar.a("carrier");
            }
            Object obj12 = map2.get("deviceModel");
            Boolean bool14 = obj12 instanceof Boolean ? (Boolean) obj12 : null;
            if (bool14 != null && !bool14.booleanValue()) {
                yVar.a("device_model");
            }
            Object obj13 = map2.get("deviceManufacturer");
            Boolean bool15 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
            if (bool15 != null && !bool15.booleanValue()) {
                yVar.a("device_manufacturer");
            }
            Object obj14 = map2.get("osVersion");
            Boolean bool16 = obj14 instanceof Boolean ? (Boolean) obj14 : null;
            if (bool16 != null && !bool16.booleanValue()) {
                yVar.a("os_version");
            }
            Object obj15 = map2.get("osName");
            Boolean bool17 = obj15 instanceof Boolean ? (Boolean) obj15 : null;
            if (bool17 != null && !bool17.booleanValue()) {
                yVar.a("os_name");
            }
            Object obj16 = map2.get("versionName");
            Boolean bool18 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
            if (bool18 != null && !bool18.booleanValue()) {
                yVar.a("version_name");
            }
            Object obj17 = map2.get("adid");
            Boolean bool19 = obj17 instanceof Boolean ? (Boolean) obj17 : null;
            if (bool19 != null && !bool19.booleanValue()) {
                yVar.a("adid");
            }
            Object obj18 = map2.get("appSetId");
            Boolean bool20 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
            if (bool20 != null && !bool20.booleanValue()) {
                yVar.a("app_set_id");
            }
            Object obj19 = map2.get("deviceBrand");
            Boolean bool21 = obj19 instanceof Boolean ? (Boolean) obj19 : null;
            if (bool21 != null && !bool21.booleanValue()) {
                yVar.a("device_brand");
            }
            Object obj20 = map2.get("latLng");
            Boolean bool22 = obj20 instanceof Boolean ? (Boolean) obj20 : null;
            if (bool22 != null && !bool22.booleanValue()) {
                yVar.a("lat_lng");
            }
            Object obj21 = map2.get("apiLevel");
            Boolean bool23 = obj21 instanceof Boolean ? (Boolean) obj21 : null;
            if (bool23 != null && !bool23.booleanValue()) {
                yVar.a("api_level");
            }
            Intrinsics.checkNotNullParameter(yVar, str2);
            configuration.q = yVar;
        }
        Boolean bool24 = (Boolean) call.argument("enableCoppaControl");
        if (bool24 != null) {
            configuration.r = bool24.booleanValue();
        }
        Boolean bool25 = (Boolean) call.argument("flushEventsOnClose");
        if (bool25 != null) {
            configuration.t = bool25.booleanValue();
        }
        if (((Integer) call.argument("identifyBatchIntervalMillis")) != null) {
            configuration.v = r0.intValue();
        }
        Boolean bool26 = (Boolean) call.argument("migrateLegacyData");
        if (bool26 != null) {
            configuration.y = bool26.booleanValue();
        }
        Boolean bool27 = (Boolean) call.argument("locationListening");
        if (bool27 != null) {
            configuration.s = bool27.booleanValue();
        }
        Boolean bool28 = (Boolean) call.argument("useAdvertisingIdForDeviceId");
        if (bool28 != null) {
            configuration.o = bool28.booleanValue();
        }
        Boolean bool29 = (Boolean) call.argument("useAppSetIdForDeviceId");
        if (bool29 != null) {
            configuration.p = bool29.booleanValue();
        }
        String str12 = (String) call.argument("deviceId");
        if (str12 != null) {
            configuration.A = str12;
        }
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        com.amplitude.core.j state = new com.amplitude.core.j();
        C1086c amplitudeScope = L.a(S0.a());
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool(...)");
        C1101n0 amplitudeDispatcher = new C1101n0(newCachedThreadPool);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        C1101n0 networkIODispatcher = new C1101n0(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        C1101n0 storageIODispatcher = new C1101n0(newSingleThreadExecutor2);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        Intrinsics.checkNotNullParameter(amplitudeDispatcher, "amplitudeDispatcher");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        final com.amplitude.android.a aVar2 = new com.amplitude.android.a(configuration, state, amplitudeScope, amplitudeDispatcher, networkIODispatcher, storageIODispatcher);
        Runtime.getRuntime().addShutdownHook(new d(aVar2));
        Set<com.amplitude.android.f> set = configuration.D;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.amplitude.android.f fVar = (com.amplitude.android.f) it.next();
                com.amplitude.android.f.Companion.getClass();
                if (com.amplitude.android.f.b.contains(fVar)) {
                    Context context2 = configuration.b;
                    Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Application");
                    Application application = (Application) context2;
                    com.amplitude.android.utilities.c cVar2 = aVar2.r;
                    if (cVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
                        cVar = null;
                    } else {
                        cVar = cVar2;
                    }
                    application.registerActivityLifecycleCallbacks(cVar);
                }
            }
        }
        this.a = MapsKt.plus(this.a, MapsKt.mapOf(TuplesKt.to(configuration.e, aVar2)));
        String str13 = (String) call.argument("library");
        if (str13 == null) {
            str13 = "amplitude-flutter/unknown";
        }
        aVar2.a(new c(str13));
        String str14 = (String) call.argument("logLevel");
        if (str14 != null) {
            if (Intrinsics.areEqual(str14, "log")) {
                aVar2.i().e(a.EnumC0038a.b);
            } else {
                com.amplitude.common.a i = aVar2.i();
                String upperCase2 = str14.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, str);
                i.e(a.EnumC0038a.valueOf(upperCase2));
            }
        }
        aVar2.i().c("Amplitude has been successfully initialized.");
        l lVar = configuration.E;
        final boolean z = lVar.b;
        final boolean z2 = lVar.c;
        aVar2.m.invokeOnCompletion(new Function1() { // from class: com.amplitude.amplitude_flutter.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                Activity activity;
                Activity activity2;
                Throwable th = (Throwable) obj22;
                if (th != null) {
                    th.toString();
                    System.out.getClass();
                } else {
                    com.amplitude.android.utilities.i iVar = new com.amplitude.android.utilities.i(com.amplitude.android.a.this);
                    boolean z3 = z;
                    AmplitudeFlutterPlugin amplitudeFlutterPlugin = this;
                    if (z3 && !amplitudeFlutterPlugin.d && (activity2 = amplitudeFlutterPlugin.b.get()) != null) {
                        PackageInfo packageInfo = activity2.getPackageManager().getPackageInfo(activity2.getPackageName(), 0);
                        Intrinsics.checkNotNull(packageInfo);
                        iVar.a(packageInfo, true);
                        amplitudeFlutterPlugin.d = true;
                    }
                    if (z2 && (activity = amplitudeFlutterPlugin.b.get()) != null) {
                        iVar.b(activity);
                    }
                }
                return Unit.INSTANCE;
            }
        });
        result.success("init called..");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = new WeakReference<>(binding.getActivity());
    }
}
