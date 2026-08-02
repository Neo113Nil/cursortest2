package uz.shs.better_player_plus;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.LongSparseArray;
import android.util.Rational;
import androidx.annotation.OptIn;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uz.shs.better_player_plus.c;

@OptIn(markerClass = {UnstableApi.class})
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004@ABCB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0003J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0017J(\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\bH\u0003J \u0010*\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020\bH\u0003J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0003J\u0018\u0010,\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0003J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0003J\u0017\u0010.\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\bH\u0003¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\bH\u0003J\b\u00102\u001a\u00020\u0019H\u0003J;\u00103\u001a\u0002H4\"\u0004\b\u0000\u001042\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u0002H4H\u0002¢\u0006\u0002\u00108J\b\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\bH\u0002J\u0010\u0010<\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\bH\u0002J\u0018\u0010>\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0010H\u0002J\b\u0010?\u001a\u00020\u0019H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Luz/shs/better_player_plus/BetterPlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "videoPlayers", "Landroid/util/LongSparseArray;", "Luz/shs/better_player_plus/BetterPlayer;", "dataSources", "", "", "", "flutterState", "Luz/shs/better_player_plus/BetterPlayerPlugin$FlutterState;", "currentNotificationTextureId", "", "currentNotificationDataSource", "activity", "Landroid/app/Activity;", "pipHandler", "Landroid/os/Handler;", "pipRunnable", "Ljava/lang/Runnable;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "disposeAllPlayers", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "textureId", "player", "setDataSource", "preCache", "stopPreCache", "clearCache", "getTextureId", "betterPlayer", "(Luz/shs/better_player_plus/BetterPlayer;)Ljava/lang/Long;", "setupNotification", "removeOtherNotificationListeners", "getParameter", ExifInterface.GPS_DIRECTION_TRUE, Constants.PARAMETERS, io.flutter.plugins.firebase.crashlytics.Constants.KEY, "defaultValue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "isPictureInPictureSupported", "", "enablePictureInPicture", "disablePictureInPicture", "startPictureInPictureListenerTimer", "dispose", "stopPipHandler", "KeyForAssetFn", "KeyForAssetAndPackageName", "FlutterState", "Companion", "better_player_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBetterPlayerPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BetterPlayerPlugin.kt\nuz/shs/better_player_plus/BetterPlayerPlugin\n+ 2 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,590:1\n25#2:591\n25#2:592\n25#2:593\n*S KotlinDebug\n*F\n+ 1 BetterPlayerPlugin.kt\nuz/shs/better_player_plus/BetterPlayerPlugin\n*L\n94#1:591\n385#1:592\n428#1:593\n*E\n"})
/* renamed from: uz.shs.better_player_plus.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class BetterPlayerPlugin implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {
    public b c;
    public Map<String, ? extends Object> e;
    public Activity f;
    public Handler i;
    public net.nfet.flutter.printing.f j;
    public final LongSparseArray<uz.shs.better_player_plus.c> a = new LongSparseArray<>();
    public final LongSparseArray<Map<String, Object>> b = new LongSparseArray<>();
    public long d = -1;

    /* renamed from: uz.shs.better_player_plus.i$b */
    public static final class b {
        public final Context a;
        public final BinaryMessenger b;
        public final c c;
        public final d d;
        public final TextureRegistry e;
        public final MethodChannel f;

        public b(Context applicationContext, BinaryMessenger binaryMessenger, c keyForAsset, d keyForAssetAndPackageName, TextureRegistry textureRegistry) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(keyForAsset, "keyForAsset");
            Intrinsics.checkNotNullParameter(keyForAssetAndPackageName, "keyForAssetAndPackageName");
            this.a = applicationContext;
            this.b = binaryMessenger;
            this.c = keyForAsset;
            this.d = keyForAssetAndPackageName;
            this.e = textureRegistry;
            this.f = new MethodChannel(binaryMessenger, "better_player_channel");
        }
    }

    /* renamed from: uz.shs.better_player_plus.i$c */
    public static final class c {
        public final /* synthetic */ FlutterLoader a;

        public c(FlutterLoader flutterLoader) {
            this.a = flutterLoader;
        }
    }

    /* renamed from: uz.shs.better_player_plus.i$d */
    public static final class d {
        public final /* synthetic */ FlutterLoader a;

        public d(FlutterLoader flutterLoader) {
            this.a = flutterLoader;
        }
    }

    public static Object b(Map map, String str, Serializable serializable) {
        Object obj;
        return (map == null || !map.containsKey(str) || (obj = map.get(str)) == null) ? serializable : obj;
    }

    @UnstableApi
    public final void a() {
        LongSparseArray<uz.shs.better_player_plus.c> longSparseArray = this.a;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.valueAt(i).a();
        }
        longSparseArray.clear();
        this.b.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        FlutterLoader flutterLoader = new FlutterLoader();
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        b bVar = new b(applicationContext, binaryMessenger, new c(flutterLoader), new d(flutterLoader), binding.getTextureRegistry());
        this.c = bVar;
        bVar.f.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    @OptIn(markerClass = {UnstableApi.class})
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        a();
        h hVar = h.a;
        try {
            if (h.b != null) {
                SimpleCache simpleCache = h.b;
                Intrinsics.checkNotNull(simpleCache);
                simpleCache.release();
                h.b = null;
            }
        } catch (Exception e) {
            e.toString();
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.f.setMethodCallHandler(null);
        }
        this.c = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    @UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String str;
        boolean z;
        Activity activity;
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams build;
        Long l;
        Map<String, ? extends Object> map;
        net.nfet.flutter.printing.f fVar;
        Long l2;
        String lookupKeyForAsset;
        Map<String, String> map2;
        Context context;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
        int i;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        b bVar = this.c;
        if (bVar == null || bVar.e == null) {
            result.error("no_activity", "better_player plugin requires a foreground activity", null);
            return;
        }
        String str2 = call.method;
        LongSparseArray<uz.shs.better_player_plus.c> longSparseArray = this.a;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1352294148:
                    str = "uri";
                    if (str2.equals("create")) {
                        b bVar2 = this.c;
                        Intrinsics.checkNotNull(bVar2);
                        TextureRegistry textureRegistry = bVar2.e;
                        Intrinsics.checkNotNull(textureRegistry);
                        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
                        Intrinsics.checkNotNullExpressionValue(createSurfaceTexture, "createSurfaceTexture(...)");
                        b bVar3 = this.c;
                        EventChannel eventChannel = new EventChannel(bVar3 != null ? bVar3.b : null, androidx.core.database.a.c(createSurfaceTexture.id(), "better_player_channel/videoEvents"));
                        l lVar = (call.hasArgument("minBufferMs") && call.hasArgument("maxBufferMs") && call.hasArgument("bufferForPlaybackMs") && call.hasArgument("bufferForPlaybackAfterRebufferMs")) ? new l((Integer) call.argument("minBufferMs"), (Integer) call.argument("maxBufferMs"), (Integer) call.argument("bufferForPlaybackMs"), (Integer) call.argument("bufferForPlaybackAfterRebufferMs")) : null;
                        b bVar4 = this.c;
                        Context context2 = bVar4 != null ? bVar4.a : null;
                        Intrinsics.checkNotNull(context2);
                        longSparseArray.put(createSurfaceTexture.id(), new uz.shs.better_player_plus.c(context2, eventChannel, createSurfaceTexture, lVar, result));
                        break;
                    }
                    if (call.argument("textureId") != null) {
                        Integer num = (Integer) call.argument("textureId");
                        long intValue = num != null ? num.intValue() : 0;
                        uz.shs.better_player_plus.c cVar = longSparseArray.get(intValue);
                        if (cVar == null) {
                            result.error("Unknown textureId", androidx.core.database.a.c(intValue, "No video player associated with texture id "), null);
                            break;
                        } else {
                            ExoPlayer exoPlayer = cVar.c;
                            DefaultTrackSelector defaultTrackSelector = cVar.e;
                            String str3 = call.method;
                            if (str3 != null) {
                                int hashCode = str3.hashCode();
                                LongSparseArray<Map<String, Object>> longSparseArray2 = this.b;
                                switch (hashCode) {
                                    case -1904142125:
                                        if (str3.equals("setTrackParameters")) {
                                            Object argument = call.argument("width");
                                            Intrinsics.checkNotNull(argument);
                                            int intValue2 = ((Number) argument).intValue();
                                            Object argument2 = call.argument("height");
                                            Intrinsics.checkNotNull(argument2);
                                            int intValue3 = ((Number) argument2).intValue();
                                            Object argument3 = call.argument("bitrate");
                                            Intrinsics.checkNotNull(argument3);
                                            int intValue4 = ((Number) argument3).intValue();
                                            DefaultTrackSelector.Parameters.Builder buildUponParameters = defaultTrackSelector.buildUponParameters();
                                            Intrinsics.checkNotNullExpressionValue(buildUponParameters, "buildUponParameters(...)");
                                            if (intValue2 != 0 && intValue3 != 0) {
                                                buildUponParameters.setMaxVideoSize(intValue2, intValue3);
                                            }
                                            if (intValue4 != 0) {
                                                buildUponParameters.setMaxVideoBitrate(intValue4);
                                            }
                                            if (intValue2 == 0 && intValue3 == 0 && intValue4 == 0) {
                                                buildUponParameters.clearVideoSizeConstraints();
                                                buildUponParameters.setMaxVideoBitrate(Integer.MAX_VALUE);
                                            }
                                            defaultTrackSelector.setParameters(buildUponParameters);
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case -1022740989:
                                        if (str3.equals("setMixWithOthers")) {
                                            Boolean bool = (Boolean) call.argument("mixWithOthers");
                                            if (bool != null) {
                                                boolean booleanValue = bool.booleanValue();
                                                if (exoPlayer != null) {
                                                    exoPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).build(), !booleanValue);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case -971364356:
                                        if (str3.equals("setLooping")) {
                                            Object argument4 = call.argument("looping");
                                            Intrinsics.checkNotNull(argument4);
                                            boolean booleanValue2 = ((Boolean) argument4).booleanValue();
                                            if (exoPlayer != null) {
                                                exoPlayer.setRepeatMode(booleanValue2 ? 2 : 0);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case -906224877:
                                        if (str3.equals("seekTo")) {
                                            Number number = (Number) call.argument(FirebaseAnalytics.Param.LOCATION);
                                            Intrinsics.checkNotNull(number);
                                            int intValue5 = number.intValue();
                                            if (exoPlayer != null) {
                                                exoPlayer.seekTo(intValue5);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case -651597783:
                                        if (str3.equals("isPictureInPictureSupported")) {
                                            if (Build.VERSION.SDK_INT >= 26 && (activity = this.f) != null) {
                                                Intrinsics.checkNotNull(activity);
                                                if (activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                                                    z = true;
                                                    result.success(Boolean.valueOf(z));
                                                    break;
                                                }
                                            }
                                            z = false;
                                            result.success(Boolean.valueOf(z));
                                        }
                                        break;
                                    case -547403682:
                                        if (str3.equals("enablePictureInPicture")) {
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                b bVar5 = this.c;
                                                Intrinsics.checkNotNull(bVar5);
                                                Context context3 = bVar5.a;
                                                MediaSessionCompat mediaSessionCompat = cVar.n;
                                                if (mediaSessionCompat != null) {
                                                    mediaSessionCompat.b();
                                                }
                                                if (context3 != null) {
                                                    MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(context3, PendingIntent.getBroadcast(context3, 0, new Intent("android.intent.action.MEDIA_BUTTON"), 67108864));
                                                    uz.shs.better_player_plus.d dVar = new uz.shs.better_player_plus.d(cVar);
                                                    Handler handler = new Handler();
                                                    MediaSessionCompat.d dVar2 = mediaSessionCompat2.a;
                                                    dVar2.c(dVar, handler);
                                                    dVar2.a.setActive(true);
                                                    Iterator<MediaSessionCompat.g> it = mediaSessionCompat2.c.iterator();
                                                    while (it.hasNext()) {
                                                        it.next().a();
                                                    }
                                                    cVar.n = mediaSessionCompat2;
                                                }
                                                Activity activity2 = this.f;
                                                Intrinsics.checkNotNull(activity2);
                                                aspectRatio = androidx.browser.trusted.f.b().setAspectRatio(new Rational(16, 9));
                                                build = aspectRatio.build();
                                                activity2.enterPictureInPictureMode(build);
                                                Handler handler2 = new Handler(Looper.getMainLooper());
                                                this.i = handler2;
                                                this.j = new net.nfet.flutter.printing.f(1, this, cVar);
                                                Intrinsics.checkNotNull(handler2);
                                                net.nfet.flutter.printing.f fVar2 = this.j;
                                                Intrinsics.checkNotNull(fVar2);
                                                handler2.post(fVar2);
                                                cVar.c(true);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 3443508:
                                        if (str3.equals("play")) {
                                            try {
                                                int size = longSparseArray.size();
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= size) {
                                                        l = null;
                                                    } else if (cVar == longSparseArray.valueAt(i2)) {
                                                        l = Long.valueOf(longSparseArray.keyAt(i2));
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                                if (l != null) {
                                                    Map<String, ? extends Object> map3 = longSparseArray2.get(l.longValue());
                                                    if (l.longValue() != this.d || (map = this.e) == null || map3 == null || map != map3) {
                                                        this.e = map3;
                                                        this.d = l.longValue();
                                                        int size2 = longSparseArray.size();
                                                        for (int i3 = 0; i3 < size2; i3++) {
                                                            longSparseArray.valueAt(i3).b();
                                                        }
                                                        if (((Boolean) b(map3, "showNotification", Boolean.FALSE)).booleanValue()) {
                                                            String str4 = (String) b(map3, "title", "");
                                                            String str5 = (String) b(map3, "author", "");
                                                            String str6 = (String) b(map3, "imageUrl", "");
                                                            String str7 = (String) b(map3, "notificationChannelName", null);
                                                            String str8 = (String) b(map3, "activityName", "MainActivity");
                                                            b bVar6 = this.c;
                                                            Context context4 = bVar6 != null ? bVar6.a : null;
                                                            Intrinsics.checkNotNull(context4);
                                                            cVar.g(context4, str4, str5, str6, str7, str8);
                                                        }
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            if (exoPlayer != null) {
                                                exoPlayer.setPlayWhenReady(true);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 106440182:
                                        if (str3.equals("pause")) {
                                            if (exoPlayer != null) {
                                                exoPlayer.setPlayWhenReady(false);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 670514716:
                                        if (str3.equals("setVolume")) {
                                            Object argument5 = call.argument("volume");
                                            Intrinsics.checkNotNull(argument5);
                                            float max = (float) Math.max(0.0d, Math.min(1.0d, ((Number) argument5).doubleValue()));
                                            if (exoPlayer != null) {
                                                exoPlayer.setVolume(max);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 747804969:
                                        if (str3.equals("position")) {
                                            result.success(Long.valueOf(exoPlayer != null ? exoPlayer.getCurrentPosition() : 0L));
                                            cVar.d(false);
                                            break;
                                        }
                                        break;
                                    case 869456835:
                                        if (str3.equals("disablePictureInPicture")) {
                                            Handler handler3 = this.i;
                                            if (handler3 != null) {
                                                Intrinsics.checkNotNull(handler3);
                                                handler3.removeCallbacksAndMessages(null);
                                                this.i = null;
                                            }
                                            this.j = null;
                                            Activity activity3 = this.f;
                                            Intrinsics.checkNotNull(activity3);
                                            activity3.moveTaskToBack(false);
                                            cVar.c(false);
                                            MediaSessionCompat mediaSessionCompat3 = cVar.n;
                                            if (mediaSessionCompat3 != null) {
                                                mediaSessionCompat3.b();
                                            }
                                            cVar.n = null;
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 1404354821:
                                        if (str3.equals("setSpeed")) {
                                            Object argument6 = call.argument("speed");
                                            Intrinsics.checkNotNull(argument6);
                                            PlaybackParameters playbackParameters = new PlaybackParameters((float) ((Number) argument6).doubleValue());
                                            if (exoPlayer != null) {
                                                exoPlayer.setPlaybackParameters(playbackParameters);
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                    case 1671767583:
                                        if (str3.equals("dispose")) {
                                            cVar.a();
                                            longSparseArray.remove(intValue);
                                            longSparseArray2.remove(intValue);
                                            Handler handler4 = this.i;
                                            if (handler4 != null) {
                                                Intrinsics.checkNotNull(handler4);
                                                fVar = null;
                                                handler4.removeCallbacksAndMessages(null);
                                                this.i = null;
                                            } else {
                                                fVar = null;
                                            }
                                            this.j = fVar;
                                            result.success(fVar);
                                            break;
                                        }
                                        break;
                                    case 1748853351:
                                        if (str3.equals("setDataSource")) {
                                            Object argument7 = call.argument("dataSource");
                                            Intrinsics.checkNotNull(argument7);
                                            Map<String, Object> map4 = (Map) argument7;
                                            int size3 = longSparseArray.size();
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 >= size3) {
                                                    l2 = null;
                                                } else if (cVar == longSparseArray.valueAt(i4)) {
                                                    l2 = Long.valueOf(longSparseArray.keyAt(i4));
                                                } else {
                                                    i4++;
                                                }
                                            }
                                            Intrinsics.checkNotNull(l2);
                                            longSparseArray2.put(l2.longValue(), map4);
                                            String str9 = (String) b(map4, io.flutter.plugins.firebase.crashlytics.Constants.KEY, "");
                                            Map<String, String> map5 = (Map) b(map4, "headers", new HashMap());
                                            Number number2 = (Number) b(map4, "overriddenDuration", 0);
                                            if (map4.get("asset") != null) {
                                                String str10 = (String) b(map4, "asset", "");
                                                if (map4.get("package") != null) {
                                                    String str11 = (String) b(map4, "package", "");
                                                    b bVar7 = this.c;
                                                    Intrinsics.checkNotNull(bVar7);
                                                    FlutterLoader flutterLoader = bVar7.d.a;
                                                    Intrinsics.checkNotNull(str10);
                                                    Intrinsics.checkNotNull(str11);
                                                    lookupKeyForAsset = flutterLoader.getLookupKeyForAsset(str10, str11);
                                                    Intrinsics.checkNotNullExpressionValue(lookupKeyForAsset, "getLookupKeyForAsset(...)");
                                                } else {
                                                    b bVar8 = this.c;
                                                    Intrinsics.checkNotNull(bVar8);
                                                    FlutterLoader flutterLoader2 = bVar8.c.a;
                                                    Intrinsics.checkNotNull(str10);
                                                    lookupKeyForAsset = flutterLoader2.getLookupKeyForAsset(str10);
                                                    Intrinsics.checkNotNullExpressionValue(lookupKeyForAsset, "getLookupKeyForAsset(...)");
                                                }
                                                b bVar9 = this.c;
                                                if (bVar9 != null) {
                                                    map2 = map5;
                                                    context = bVar9.a;
                                                } else {
                                                    map2 = map5;
                                                    context = null;
                                                }
                                                Intrinsics.checkNotNull(context);
                                                cVar.f(context, str9, "asset:///" + lookupKeyForAsset, null, result, map2, false, 0L, 0L, number2.longValue(), null, null, null, null);
                                                break;
                                            } else {
                                                boolean booleanValue3 = ((Boolean) b(map4, "useCache", Boolean.FALSE)).booleanValue();
                                                Number number3 = (Number) b(map4, "maxCacheSize", 0);
                                                Number number4 = (Number) b(map4, "maxCacheFileSize", 0);
                                                long longValue = number3.longValue();
                                                long longValue2 = number4.longValue();
                                                String str12 = (String) b(map4, str, "");
                                                String str13 = (String) b(map4, "cacheKey", null);
                                                String str14 = (String) b(map4, "formatHint", null);
                                                String str15 = (String) b(map4, "licenseUrl", null);
                                                String str16 = (String) b(map4, "clearKey", null);
                                                Map<String, String> map6 = (Map) b(map4, "drmHeaders", new HashMap());
                                                b bVar10 = this.c;
                                                Intrinsics.checkNotNull(bVar10);
                                                cVar.f(bVar10.a, str9, str12, str14, result, map5, booleanValue3, longValue, longValue2, number2.longValue(), str15, map6, str13, str16);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1809884096:
                                        if (str3.equals("absolutePosition")) {
                                            if (exoPlayer != null) {
                                                Timeline currentTimeline = exoPlayer.getCurrentTimeline();
                                                Intrinsics.checkNotNullExpressionValue(currentTimeline, "getCurrentTimeline(...)");
                                                if (!currentTimeline.isEmpty()) {
                                                    r20 = exoPlayer.getCurrentPosition() + currentTimeline.getWindow(0, new Timeline.Window()).windowStartTimeMs;
                                                    result.success(Long.valueOf(r20));
                                                    break;
                                                }
                                            }
                                            if (exoPlayer != null) {
                                                r20 = exoPlayer.getCurrentPosition();
                                            }
                                            result.success(Long.valueOf(r20));
                                        }
                                        break;
                                    case 2015518999:
                                        if (str3.equals("setAudioTrack")) {
                                            String name = (String) call.argument("name");
                                            Integer num2 = (Integer) call.argument(FirebaseAnalytics.Param.INDEX);
                                            if (name != null && num2 != null) {
                                                int intValue6 = num2.intValue();
                                                Intrinsics.checkNotNullParameter(name, "name");
                                                try {
                                                    MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo();
                                                    if (currentMappedTrackInfo != null) {
                                                        int rendererCount = currentMappedTrackInfo.getRendererCount();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 < rendererCount) {
                                                                if (currentMappedTrackInfo.getRendererType(i5) != 1) {
                                                                    mappedTrackInfo = currentMappedTrackInfo;
                                                                    i = rendererCount;
                                                                } else {
                                                                    TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i5);
                                                                    Intrinsics.checkNotNullExpressionValue(trackGroups, "getTrackGroups(...)");
                                                                    int i6 = trackGroups.length;
                                                                    boolean z2 = false;
                                                                    boolean z3 = false;
                                                                    for (int i7 = 0; i7 < i6; i7++) {
                                                                        TrackGroup trackGroup = trackGroups.get(i7);
                                                                        Intrinsics.checkNotNullExpressionValue(trackGroup, "get(...)");
                                                                        int i8 = trackGroup.length;
                                                                        int i9 = 0;
                                                                        while (i9 < i8) {
                                                                            MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = currentMappedTrackInfo;
                                                                            Format format = trackGroup.getFormat(i9);
                                                                            int i10 = rendererCount;
                                                                            Intrinsics.checkNotNullExpressionValue(format, "getFormat(...)");
                                                                            if (format.label == null) {
                                                                                z2 = true;
                                                                            }
                                                                            String str17 = format.f22id;
                                                                            if (str17 != null && Intrinsics.areEqual(str17, "1/15")) {
                                                                                z3 = true;
                                                                            }
                                                                            i9++;
                                                                            currentMappedTrackInfo = mappedTrackInfo2;
                                                                            rendererCount = i10;
                                                                        }
                                                                    }
                                                                    mappedTrackInfo = currentMappedTrackInfo;
                                                                    i = rendererCount;
                                                                    int i11 = trackGroups.length;
                                                                    for (int i12 = 0; i12 < i11; i12++) {
                                                                        TrackGroup trackGroup2 = trackGroups.get(i12);
                                                                        Intrinsics.checkNotNullExpressionValue(trackGroup2, "get(...)");
                                                                        int i13 = trackGroup2.length;
                                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                                            String str18 = trackGroup2.getFormat(i14).label;
                                                                            if (Intrinsics.areEqual(name, str18) && intValue6 == i12) {
                                                                                cVar.e(i5, i12, i14);
                                                                            } else if (!z3 && z2 && intValue6 == i12) {
                                                                                cVar.e(i5, i12, trackGroup2.length > 0 ? 0 : i14);
                                                                            } else if (z3 && Intrinsics.areEqual(name, str18)) {
                                                                                cVar.e(i5, i12, i14);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i5++;
                                                                currentMappedTrackInfo = mappedTrackInfo;
                                                                rendererCount = i;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e.toString();
                                                }
                                            }
                                            result.success(null);
                                            break;
                                        }
                                        break;
                                }
                            }
                            result.notImplemented();
                            break;
                        }
                    }
                    break;
                case -1321125217:
                    if (str2.equals("preCache")) {
                        Map map7 = (Map) call.argument("dataSource");
                        if (map7 != null) {
                            Number number5 = (Number) b(map7, "maxCacheSize", 104857600);
                            Number number6 = (Number) b(map7, "maxCacheFileSize", 10485760);
                            long longValue3 = number5.longValue();
                            long longValue4 = number6.longValue();
                            long longValue5 = ((Number) b(map7, "preCacheSize", 3145728)).longValue();
                            String str19 = (String) b(map7, "uri", "");
                            String str20 = (String) b(map7, "cacheKey", null);
                            Map headers = (Map) b(map7, "headers", new HashMap());
                            c.a aVar = uz.shs.better_player_plus.c.Companion;
                            b bVar11 = this.c;
                            Context context5 = bVar11 != null ? bVar11.a : null;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(headers, "headers");
                            Intrinsics.checkNotNullParameter(result, "result");
                            Data.Builder putLong = new Data.Builder().putString("url", str19).putLong("preCacheSize", longValue5).putLong("maxCacheSize", longValue3).putLong("maxCacheFileSize", longValue4);
                            if (str20 != null) {
                                putLong.putString("cacheKey", str20);
                            }
                            for (String str21 : headers.keySet()) {
                                putLong.putString(defpackage.g.a("header_", str21), (String) headers.get(str21));
                            }
                            if (str19 != null && context5 != null) {
                                WorkManager.INSTANCE.getInstance(context5).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CacheWorker.class).addTag(str19).setInputData(putLong.build()).build());
                            }
                            result.success(null);
                            break;
                        }
                    }
                    break;
                case -759238347:
                    if (str2.equals("clearCache")) {
                        c.a aVar2 = uz.shs.better_player_plus.c.Companion;
                        b bVar12 = this.c;
                        Context context6 = bVar12 != null ? bVar12.a : null;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (context6 != null) {
                            try {
                                c.a.a(new File(context6.getCacheDir(), "betterPlayerCache"));
                            } catch (Exception e2) {
                                e2.toString();
                                result.error("", "", "");
                                return;
                            }
                        }
                        result.success(null);
                        break;
                    }
                    break;
                case 3237136:
                    if (str2.equals("init")) {
                        a();
                        break;
                    }
                    break;
                case 1800570049:
                    if (str2.equals("stopPreCache")) {
                        String str22 = (String) call.argument("url");
                        c.a aVar3 = uz.shs.better_player_plus.c.Companion;
                        b bVar13 = this.c;
                        Context context7 = bVar13 != null ? bVar13.a : null;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (str22 != null && context7 != null) {
                            WorkManager.INSTANCE.getInstance(context7).cancelAllWorkByTag(str22);
                        }
                        result.success(null);
                        break;
                    }
                    break;
            }
            return;
        }
        str = "uri";
        if (call.argument("textureId") != null) {
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }
}
