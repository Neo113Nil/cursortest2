package uz.shs.better_player_plus;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.Surface;
import androidx.annotation.OptIn;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.ForwardingPlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.DefaultDashChunkSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.exoplayer.drm.HttpMediaDrmCallback;
import androidx.media3.exoplayer.drm.LocalMediaDrmCallback;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.DefaultSsChunkSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.ui.PlayerNotificationManager;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

@UnstableApi
@SourceDebugExtension({"SMAP\nBetterPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BetterPlayer.kt\nuz/shs/better_player_plus/BetterPlayer\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,855:1\n29#2:856\n*S KotlinDebug\n*F\n+ 1 BetterPlayer.kt\nuz/shs/better_player_plus/BetterPlayer\n*L\n144#1:856\n*E\n"})
/* loaded from: classes5.dex */
public final class c {
    public static final a Companion = new a();
    public final EventChannel a;
    public final TextureRegistry.SurfaceTextureEntry b;
    public final ExoPlayer c;
    public final n d;
    public final DefaultTrackSelector e;
    public boolean f;
    public final Surface g;
    public String h;
    public PlayerNotificationManager i;
    public Handler j;
    public androidx.lifecycle.a k;
    public b l;
    public Bitmap m;
    public MediaSessionCompat n;
    public DefaultDrmSessionManager o;
    public final WorkManager p;
    public final HashMap<UUID, Observer<WorkInfo>> q;
    public long r;

    public static final class a {
        public static void a(File file) {
            File[] listFiles;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    Intrinsics.checkNotNull(file2);
                    a(file2);
                }
            }
            file.delete();
        }
    }

    public static final class b implements Player.Listener {
        public b() {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i) {
            c cVar = c.this;
            MediaSessionCompat mediaSessionCompat = cVar.n;
            if (mediaSessionCompat != null) {
                Bundle bundle = new Bundle();
                ExoPlayer exoPlayer = cVar.c;
                long duration = exoPlayer != null ? exoPlayer.getDuration() : 0L;
                ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.c;
                if (arrayMap.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION) && arrayMap.get(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION).intValue() != 0) {
                    throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
                }
                bundle.putLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, duration);
                MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
                MediaSessionCompat.d dVar = mediaSessionCompat.a;
                dVar.g = mediaMetadataCompat;
                MediaSession mediaSession = dVar.a;
                if (mediaMetadataCompat.b == null) {
                    MediaMetadata.Builder builder = new MediaMetadata.Builder();
                    Bundle bundle2 = mediaMetadataCompat.a;
                    for (String str : bundle2.keySet()) {
                        Integer num = MediaMetadataCompat.c.get(str);
                        if (num == null) {
                            num = -1;
                        }
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            builder.putLong(str, bundle2.getLong(str, 0L));
                        } else if (intValue == 1) {
                            builder.putText(str, bundle2.getCharSequence(str));
                        } else if (intValue == 2) {
                            builder.putBitmap(str, (Bitmap) bundle2.getParcelable(str));
                        } else if (intValue != 3) {
                            Object obj = bundle2.get(str);
                            if (obj == null || (obj instanceof CharSequence)) {
                                builder.putText(str, (CharSequence) obj);
                            } else if (obj instanceof Long) {
                                builder.putLong(str, ((Long) obj).longValue());
                            } else if (obj instanceof Bitmap) {
                                builder.putBitmap(str, (Bitmap) obj);
                            } else if (obj instanceof Rating) {
                                builder.putRating(str, (Rating) obj);
                            }
                        } else {
                            builder.putRating(str, (Rating) bundle2.getParcelable(str));
                        }
                    }
                    mediaMetadataCompat.b = builder.build();
                }
                mediaSession.setMetadata(mediaMetadataCompat.b);
            }
        }
    }

    /* renamed from: uz.shs.better_player_plus.c$c, reason: collision with other inner class name */
    public static final class C0167c implements PlayerNotificationManager.MediaDescriptionAdapter {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ c f;

        public C0167c(String str, Context context, String str2, String str3, String str4, c cVar) {
            this.a = str;
            this.b = context;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = cVar;
        }

        @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
        @SuppressLint({"UnspecifiedImmutableFlag"})
        public final PendingIntent createCurrentContentIntent(Player player) {
            Intrinsics.checkNotNullParameter(player, "player");
            Context context = this.b;
            String packageName = context.getApplicationContext().getPackageName();
            Intent intent = new Intent();
            intent.setClassName(packageName, packageName + "." + this.c);
            intent.setFlags(603979776);
            return PendingIntent.getActivity(context, 0, intent, 67108864);
        }

        @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
        public final CharSequence getCurrentContentText(Player player) {
            Intrinsics.checkNotNullParameter(player, "player");
            return this.d;
        }

        @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
        public final CharSequence getCurrentContentTitle(Player player) {
            Intrinsics.checkNotNullParameter(player, "player");
            return this.a;
        }

        @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
        public final Bitmap getCurrentLargeIcon(Player player, final PlayerNotificationManager.BitmapCallback callback) {
            final c cVar = this.f;
            WorkManager workManager = cVar.p;
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(callback, "callback");
            String str = this.e;
            if (str == null) {
                return null;
            }
            Bitmap bitmap = cVar.m;
            if (bitmap != null) {
                return bitmap;
            }
            final OneTimeWorkRequest build = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) ImageWorker.class).addTag(str).setInputData(new Data.Builder().putString("url", str).build()).build();
            workManager.enqueue(build);
            Observer<WorkInfo> observer = new Observer() { // from class: uz.shs.better_player_plus.e
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    UUID id2;
                    Observer<WorkInfo> remove;
                    OneTimeWorkRequest oneTimeWorkRequest = build;
                    PlayerNotificationManager.BitmapCallback bitmapCallback = callback;
                    WorkInfo workInfo = (WorkInfo) obj;
                    if (workInfo != null) {
                        try {
                            WorkInfo.State state = workInfo.getState();
                            WorkInfo.State state2 = WorkInfo.State.SUCCEEDED;
                            c cVar2 = c.this;
                            if (state == state2) {
                                Bitmap decodeFile = BitmapFactory.decodeFile(workInfo.getOutputData().getString("filePath"));
                                cVar2.m = decodeFile;
                                if (decodeFile != null) {
                                    bitmapCallback.onBitmap(decodeFile);
                                }
                            }
                            if ((state == state2 || state == WorkInfo.State.CANCELLED || state == WorkInfo.State.FAILED) && (remove = cVar2.q.remove((id2 = oneTimeWorkRequest.getId()))) != null) {
                                cVar2.p.getWorkInfoByIdLiveData(id2).removeObserver(remove);
                            }
                        } catch (Exception e) {
                            e.toString();
                        }
                    }
                }
            };
            UUID id2 = build.getId();
            workManager.getWorkInfoByIdLiveData(id2).observeForever(observer);
            cVar.q.put(id2, observer);
            return null;
        }
    }

    public c(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry textureEntry, l lVar, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventChannel, "eventChannel");
        Intrinsics.checkNotNullParameter(textureEntry, "textureEntry");
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = eventChannel;
        this.b = textureEntry;
        this.d = new n();
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
        this.e = defaultTrackSelector;
        lVar = lVar == null ? new l() : lVar;
        DefaultLoadControl.Builder builder = new DefaultLoadControl.Builder();
        builder.setBufferDurationsMs(lVar.a, lVar.b, lVar.c, lVar.d);
        DefaultLoadControl build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        ExoPlayer build2 = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).setLoadControl(build).build();
        this.c = build2;
        this.p = WorkManager.INSTANCE.getInstance(context);
        this.q = new HashMap<>();
        eventChannel.setStreamHandler(new f(this));
        Surface surface = new Surface(textureEntry.surfaceTexture());
        this.g = surface;
        if (build2 != null) {
            build2.setVideoSurface(surface);
        }
        if (build2 != null) {
            build2.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).build(), false);
        }
        if (build2 != null) {
            build2.addListener(new g(this));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("textureId", Long.valueOf(textureEntry.id()));
        result.success(hashMap);
    }

    public final void a() {
        MediaSessionCompat mediaSessionCompat = this.n;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.b();
        }
        this.n = null;
        b();
        boolean z = this.f;
        ExoPlayer exoPlayer = this.c;
        if (z && exoPlayer != null) {
            exoPlayer.stop();
        }
        this.b.release();
        this.a.setStreamHandler(null);
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        if (exoPlayer != null) {
            exoPlayer.release();
        }
    }

    public final void b() {
        ExoPlayer exoPlayer;
        b bVar = this.l;
        if (bVar != null && (exoPlayer = this.c) != null) {
            exoPlayer.removeListener(bVar);
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.j = null;
            this.k = null;
        }
        PlayerNotificationManager playerNotificationManager = this.i;
        if (playerNotificationManager != null) {
            playerNotificationManager.setPlayer(null);
        }
        this.m = null;
    }

    public final void c(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, z ? "pipStart" : "pipStop");
        this.d.success(hashMap);
    }

    public final void d(boolean z) {
        ExoPlayer exoPlayer = this.c;
        long bufferedPosition = exoPlayer != null ? exoPlayer.getBufferedPosition() : 0L;
        if (z || bufferedPosition != this.r) {
            HashMap a2 = com.google.android.gms.ads.identifier.a.a(NotificationCompat.CATEGORY_EVENT, "bufferingUpdate");
            a2.put("values", CollectionsKt.listOf(CollectionsKt.listOf((Object[]) new Long[]{0L, Long.valueOf(bufferedPosition)})));
            this.d.success(a2);
            this.r = bufferedPosition;
        }
    }

    public final void e(int i, int i2, int i3) {
        DefaultTrackSelector defaultTrackSelector = this.e;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo != null) {
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i);
            Intrinsics.checkNotNullExpressionValue(trackGroups, "getTrackGroups(...)");
            if (i2 < 0 || i2 >= trackGroups.length) {
                return;
            }
            TrackGroup trackGroup = trackGroups.get(i2);
            Intrinsics.checkNotNullExpressionValue(trackGroup, "get(...)");
            DefaultTrackSelector.Parameters.Builder addOverride = defaultTrackSelector.getParameters().buildUpon().setRendererDisabled(i, false).addOverride(new TrackSelectionOverride(trackGroup, RangesKt.coerceIn(i3, 0, trackGroup.length - 1)));
            Intrinsics.checkNotNullExpressionValue(addOverride, "addOverride(...)");
            defaultTrackSelector.setParameters(addOverride);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(c.class, obj.getClass())) {
            c cVar = (c) obj;
            ExoPlayer exoPlayer = cVar.c;
            ExoPlayer exoPlayer2 = this.c;
            if (exoPlayer2 == null ? exoPlayer != null : !Intrinsics.areEqual(exoPlayer2, exoPlayer)) {
                return false;
            }
            Surface surface = this.g;
            Surface surface2 = cVar.g;
            if (surface != null) {
                return Intrinsics.areEqual(surface, surface2);
            }
            if (surface2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0144, code lost:
    
        if (r20.equals("dash") == false) goto L72;
     */
    @OptIn(markerClass = {UnstableApi.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Context context, String str, String str2, String str3, MethodChannel.Result result, Map<String, String> map, boolean z, long j, long j2, long j3, String str4, Map<String, String> map2, String str5, String str6) {
        DataSource.Factory factory;
        int i;
        MediaSource createMediaSource;
        List split$default;
        String str7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(result, "result");
        this.h = str;
        int i2 = 0;
        this.f = false;
        Uri parse = str2 != null ? Uri.parse(str2) : null;
        String property = System.getProperty("http.agent");
        if (map != null && map.containsKey(RtspHeaders.USER_AGENT) && (str7 = map.get(RtspHeaders.USER_AGENT)) != null) {
            property = str7;
        }
        if (str4 != null && str4.length() != 0) {
            HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(str4, new DefaultHttpDataSource.Factory());
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    httpMediaDrmCallback.setKeyRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            UUID drmUuid = Util.getDrmUuid("widevine");
            if (drmUuid != null) {
                this.o = new DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(drmUuid, new uz.shs.better_player_plus.a()).setMultiSession(false).build(httpMediaDrmCallback);
            }
        } else if (str6 == null || str6.length() == 0) {
            this.o = null;
        } else {
            DefaultDrmSessionManager.Builder uuidAndExoMediaDrmProvider = new DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(C.CLEARKEY_UUID, FrameworkMediaDrm.DEFAULT_PROVIDER);
            byte[] bytes = str6.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Intrinsics.checkNotNull(uuidAndExoMediaDrmProvider.build(new LocalMediaDrmCallback(bytes)));
        }
        if (m.b(parse)) {
            DefaultHttpDataSource.Factory a2 = m.a(property, map);
            factory = a2;
            if (z) {
                factory = a2;
                if (j > 0) {
                    factory = a2;
                    if (j2 > 0) {
                        factory = new j(context, j, j2, a2);
                    }
                }
            }
        } else {
            factory = new DefaultDataSource.Factory(context);
        }
        if (str3 == null) {
            String lastPathSegment = parse != null ? parse.getLastPathSegment() : null;
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            split$default = StringsKt__StringsKt.split$default(lastPathSegment, new String[]{"."}, false, 0, 6, (Object) null);
            i = Util.inferContentTypeForExtension((String) split$default.get(1));
        } else {
            int hashCode = str3.hashCode();
            if (hashCode == 3680) {
                if (str3.equals("ss")) {
                    i2 = 1;
                    i = i2;
                }
                i2 = -1;
                i = i2;
            } else if (hashCode == 103407) {
                if (str3.equals("hls")) {
                    i2 = 2;
                    i = i2;
                }
                i2 = -1;
                i = i2;
            } else if (hashCode != 3075986) {
                if (hashCode == 106069776 && str3.equals("other")) {
                    i2 = 4;
                    i = i2;
                }
                i2 = -1;
                i = i2;
            }
        }
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setUri(parse);
        if (str5 != null && str5.length() != 0) {
            builder.setCustomCacheKey(str5);
        }
        MediaItem build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        final DefaultDrmSessionManager defaultDrmSessionManager = this.o;
        DrmSessionManagerProvider drmSessionManagerProvider = defaultDrmSessionManager != null ? new DrmSessionManagerProvider() { // from class: uz.shs.better_player_plus.b
            @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
            public final DrmSessionManager get(MediaItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return defaultDrmSessionManager;
            }
        } : null;
        if (i == 0) {
            DashMediaSource.Factory factory2 = new DashMediaSource.Factory(new DefaultDashChunkSource.Factory(factory), new DefaultDataSource.Factory(context, factory));
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            createMediaSource = factory2.createMediaSource(build);
            Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        } else if (i == 1) {
            SsMediaSource.Factory factory3 = new SsMediaSource.Factory(new DefaultSsChunkSource.Factory(factory), new DefaultDataSource.Factory(context, factory));
            if (drmSessionManagerProvider != null) {
                factory3.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            createMediaSource = factory3.createMediaSource(build);
            Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        } else if (i == 2) {
            HlsMediaSource.Factory factory4 = new HlsMediaSource.Factory(factory);
            if (drmSessionManagerProvider != null) {
                factory4.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            createMediaSource = factory4.createMediaSource(build);
            Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        } else {
            if (i != 4) {
                throw new IllegalStateException(android.support.v4.media.a.a(i, "Unsupported type: "));
            }
            ProgressiveMediaSource.Factory factory5 = new ProgressiveMediaSource.Factory(factory, new DefaultExtractorsFactory());
            if (drmSessionManagerProvider != null) {
                factory5.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            createMediaSource = factory5.createMediaSource(build);
            Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        }
        ExoPlayer exoPlayer = this.c;
        if (j3 != 0) {
            ClippingMediaSource build2 = new ClippingMediaSource.Builder(createMediaSource).setStartPositionMs(0L).setEndPositionMs(1000 * j3).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            if (exoPlayer != null) {
                exoPlayer.setMediaSource(build2);
            }
        } else if (exoPlayer != null) {
            exoPlayer.setMediaSource(createMediaSource);
        }
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
        result.success(null);
    }

    public final void g(Context context, String title, String str, String str2, String str3, String activityName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        C0167c c0167c = new C0167c(title, context, activityName, str, str2, this);
        if (str3 == null && Build.VERSION.SDK_INT >= 26) {
            androidx.browser.trusted.e.d();
            NotificationChannel a2 = kotlin.io.path.g.a();
            a2.setDescription("BETTER_PLAYER_NOTIFICATION");
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(a2);
            str3 = "BETTER_PLAYER_NOTIFICATION";
        }
        Intrinsics.checkNotNull(str3);
        PlayerNotificationManager build = new PlayerNotificationManager.Builder(context, 20772077, str3).setMediaDescriptionAdapter(c0167c).build();
        this.i = build;
        ExoPlayer exoPlayer = this.c;
        if (build != null && exoPlayer != null) {
            build.setPlayer(new ForwardingPlayer(exoPlayer));
            build.setUseNextAction(false);
            build.setUsePreviousAction(false);
            build.setUseStopAction(false);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.j = handler;
        androidx.lifecycle.a aVar = new androidx.lifecycle.a(this, 2);
        this.k = aVar;
        Intrinsics.checkNotNull(aVar);
        handler.postDelayed(aVar, 0L);
        b bVar = new b();
        this.l = bVar;
        if (exoPlayer != null) {
            exoPlayer.addListener(bVar);
        }
        if (exoPlayer != null) {
            exoPlayer.seekTo(0L);
        }
    }

    public final int hashCode() {
        ExoPlayer exoPlayer = this.c;
        int hashCode = (exoPlayer != null ? exoPlayer.hashCode() : 0) * 31;
        Surface surface = this.g;
        return hashCode + (surface != null ? surface.hashCode() : 0);
    }
}
