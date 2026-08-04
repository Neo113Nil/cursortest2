package p049g5;

import A5.f;
import A5.p;
import G4.C0282o;
import G4.C0286t;
import I4.j;
import Q3.o;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.e;
import android.support.v4.media.h;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.t;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import io.flutter.plugin.platform.s;
import io.sentry.protocol.SentryThread;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p078l.k;
import p155w1.C1010l1;
import p155w1.C1050x1;
import p159w5.b;
import p159w5.c;
import p164x5.a;

/* JADX INFO: loaded from: classes2.dex */
public class l implements c, a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static p f13274B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static boolean f13275C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static e f13276D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static C1050x1 f13277E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static j f13280y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static j f13281z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f13283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p164x5.b f13284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f13285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f13286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f13287f = new f(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashSet f13279x = new HashSet();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final long f13273A = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final e f13278F = new e();

    public static MediaBrowserCompat$MediaItem a(Map map) {
        return new MediaBrowserCompat$MediaItem(d(g(map).a(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static HashMap b(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompatA = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat mediaDescriptionCompatA = mediaMetadataCompat.a();
        HashMap map = new HashMap();
        map.put("id", mediaDescriptionCompatA.f7978a);
        map.put("title", m(mediaMetadataCompat, "android.media.metadata.TITLE"));
        map.put("album", m(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = mediaDescriptionCompatA.f7983f;
        if (uri != null) {
            map.put("artUri", uri.toString());
        }
        map.put("artist", m(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        map.put("genre", m(mediaMetadataCompat, "android.media.metadata.GENRE"));
        Bundle bundle = mediaMetadataCompat.f7991a;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            map.put("duration", Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        map.put("playable", Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        map.put("displayTitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        map.put("displaySubtitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        map.put("displayDescription", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompatA = RatingCompat.a(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e7) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e7);
            }
            map.put("rating", n(ratingCompatA));
        }
        HashMap mapE = e(new Bundle(bundle));
        if (mapE.size() > 0) {
            map.put("extras", mapE);
        }
        return map;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new MediaSessionCompat$QueueItem(null, d(g(map).a(), (Map) map.get("extras")), i7));
            i7++;
        }
        return arrayList;
    }

    public static MediaDescriptionCompat d(MediaDescriptionCompat mediaDescriptionCompat, Map map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = mediaDescriptionCompat.f7984x;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(l(map));
        return new MediaDescriptionCompat(mediaDescriptionCompat.f7978a, mediaDescriptionCompat.f7979b, mediaDescriptionCompat.f7980c, mediaDescriptionCompat.f7981d, mediaDescriptionCompat.f7982e, mediaDescriptionCompat.f7983f, bundle, mediaDescriptionCompat.f7985y);
    }

    public static HashMap e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                map.put(str, serializable);
            }
        }
        return map;
    }

    public static MediaMetadataCompat g(Map map) {
        RatingCompat ratingCompat;
        float f7;
        Object obj;
        Object obj2;
        AudioService audioService = AudioService.f12300P;
        String str = (String) map.get("id");
        String str2 = (String) map.get("title");
        String str3 = (String) map.get("album");
        String str4 = (String) map.get("artist");
        String str5 = (String) map.get("genre");
        Long lJ = j(map.get("duration"));
        String str6 = (String) map.get("artUri");
        Boolean bool = (Boolean) map.get("playable");
        String str7 = (String) map.get("displayTitle");
        String str8 = (String) map.get("displaySubtitle");
        String str9 = (String) map.get("displayDescription");
        Map map2 = (Map) map.get("rating");
        if (map2 == null) {
            ratingCompat = null;
            f7 = -1.0f;
        } else {
            Integer num = (Integer) map2.get("type");
            Object obj3 = map2.get("value");
            if (obj3 == null) {
                int iIntValue = num.intValue();
                switch (iIntValue) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        f7 = -1.0f;
                        ratingCompat = new RatingCompat(iIntValue, -1.0f);
                        break;
                }
            } else {
                switch (num.intValue()) {
                    case 1:
                        ratingCompat = new RatingCompat(1, ((Boolean) obj3).booleanValue() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, ((Boolean) obj3).booleanValue() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = RatingCompat.d(((Integer) obj3).intValue(), num.intValue());
                        break;
                    case 6:
                        ratingCompat = RatingCompat.c(((Double) obj3).floatValue());
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        switch (iIntValue2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(iIntValue2, -1.0f);
                                break;
                        }
                        break;
                }
                f7 = -1.0f;
            }
            ratingCompat = null;
            f7 = -1.0f;
        }
        Map map3 = (Map) map.get("extras");
        audioService.getClass();
        C1010l1 c1010l1 = new C1010l1(11);
        c1010l1.E("android.media.metadata.MEDIA_ID", str);
        c1010l1.E("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            c1010l1.E("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            c1010l1.E("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            c1010l1.E("android.media.metadata.GENRE", str5);
        }
        if (lJ != null) {
            c1010l1.D("android.media.metadata.DURATION", lJ.longValue());
        }
        if (str6 != null) {
            c1010l1.E("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            c1010l1.D("playable_long", bool.booleanValue() ? 1L : 0L);
        }
        if (str7 != null) {
            c1010l1.E("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            c1010l1.E("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            c1010l1.E("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        Bundle bundle = (Bundle) c1010l1.f17777a;
        if (ratingCompat != null) {
            p122r.b bVar = MediaMetadataCompat.f7987d;
            if (bVar.containsKey("android.media.metadata.RATING")) {
                obj = null;
                if (((Integer) bVar.getOrDefault("android.media.metadata.RATING", null)).intValue() != 3) {
                    throw new IllegalArgumentException("The android.media.metadata.RATING key cannot be used to put a Rating");
                }
            } else {
                obj = null;
            }
            if (ratingCompat.f7996c == null) {
                boolean zB = ratingCompat.b();
                int i7 = ratingCompat.f7994a;
                if (zB) {
                    float f8 = ratingCompat.f7995b;
                    switch (i7) {
                        case 1:
                            ratingCompat.f7996c = h.g(i7 == 1 ? f8 == 1.0f : false);
                            break;
                        case 2:
                            ratingCompat.f7996c = h.j(i7 == 2 ? f8 == 1.0f : false);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            if ((i7 == 3 || i7 == 4 || i7 == 5) && ratingCompat.b()) {
                                f7 = f8;
                            }
                            ratingCompat.f7996c = h.i(i7, f7);
                            break;
                        case 6:
                            if (i7 == 6 && ratingCompat.b()) {
                                f7 = f8;
                            }
                            ratingCompat.f7996c = h.h(f7);
                            break;
                        default:
                            obj2 = obj;
                            break;
                    }
                } else {
                    ratingCompat.f7996c = h.k(i7);
                }
                obj2 = ratingCompat.f7996c;
            } else {
                obj2 = ratingCompat.f7996c;
            }
            bundle.putParcelable("android.media.metadata.RATING", (Parcelable) obj2);
        }
        if (map3 != null) {
            for (String str10 : map3.keySet()) {
                Object obj4 = map3.get(str10);
                if (obj4 instanceof Long) {
                    c1010l1.D(str10, ((Long) obj4).longValue());
                } else if (obj4 instanceof Integer) {
                    c1010l1.D(str10, ((Integer) obj4).intValue());
                } else if (obj4 instanceof String) {
                    c1010l1.E(str10, (String) obj4);
                } else if (obj4 instanceof Boolean) {
                    c1010l1.D(str10, ((Boolean) obj4).booleanValue() ? 1L : 0L);
                } else if (obj4 instanceof Double) {
                    c1010l1.E(str10, obj4.toString());
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        AudioService.f12304T.put(str, mediaMetadataCompat);
        return mediaMetadataCompat;
    }

    public static void h() {
        j jVar = f13280y;
        p121q5.c cVar = jVar != null ? jVar.f13266b : null;
        if (cVar != null) {
            cVar.setIntent(new Intent("android.intent.action.MAIN"));
        }
        C1050x1 c1050x1 = f13277E;
        if (c1050x1 != null) {
            e eVar = f13278F;
            if (eVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) c1050x1.f17933d).remove(eVar)) {
                try {
                    ((android.support.v4.media.session.h) c1050x1.f17931b).b(eVar);
                    eVar.b(null);
                } catch (Throwable th) {
                    eVar.b(null);
                    throw th;
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            f13277E = null;
        }
        e eVar2 = f13276D;
        if (eVar2 != null) {
            eVar2.a();
            f13276D = null;
        }
    }

    public static synchronized p128r5.b i(ContextWrapper contextWrapper) {
        p128r5.b bVar;
        String strD;
        boolean z4;
        Uri data;
        try {
            bVar = (p128r5.b) C0286t.b().f3024a.get("audio_service_engine");
            if (bVar == null) {
                bVar = new p128r5.b(contextWrapper.getApplicationContext(), null, new s());
                if (contextWrapper instanceof p121q5.c) {
                    p121q5.c cVar = (p121q5.c) contextWrapper;
                    strD = cVar.d();
                    if (strD == null) {
                        try {
                            Bundle bundleE = cVar.e();
                            z4 = (bundleE == null || !bundleE.containsKey("flutter_deeplinking_enabled")) ? true : bundleE.getBoolean("flutter_deeplinking_enabled");
                        } catch (PackageManager.NameNotFoundException unused) {
                            z4 = false;
                        }
                        if (z4 && (data = cVar.getIntent().getData()) != null) {
                            strD = data.getPath();
                            if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                                strD = strD + "?" + data.getQuery();
                            }
                        }
                    }
                } else {
                    strD = null;
                }
                if (strD == null) {
                    strD = "/";
                }
                bVar.f16045i.f18464a.a("setInitialRoute", strD, null);
                k kVar = bVar.f16039c;
                p148u5.c cVar2 = (p148u5.c) t.l0().f8076b;
                if (!cVar2.f16883b) {
                    throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
                }
                kVar.b(new p135s5.a((String) ((C0282o) cVar2.f16885d).f3011c, SentryThread.JsonKeys.MAIN), null);
                C0286t.b().c("audio_service_engine", bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVar;
    }

    public static Long j(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static HashMap k(Object... objArr) {
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            map.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return map;
    }

    public static Bundle l(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    public static String m(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence charSequence = mediaMetadataCompat.f7991a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap n(RatingCompat ratingCompat) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(ratingCompat.f7994a));
        if (ratingCompat.b()) {
            boolean z4 = false;
            float f7 = -1.0f;
            float f8 = ratingCompat.f7995b;
            int i7 = ratingCompat.f7994a;
            switch (i7) {
                case 0:
                    map.put("value", null);
                    break;
                case 1:
                    if (i7 == 1) {
                        z4 = f8 == 1.0f;
                    }
                    map.put("value", Boolean.valueOf(z4));
                    break;
                case 2:
                    if (i7 == 2) {
                        z4 = f8 == 1.0f;
                    }
                    map.put("value", Boolean.valueOf(z4));
                    break;
                case 3:
                case 4:
                case 5:
                    if ((i7 == 3 || i7 == 4 || i7 == 5) && ratingCompat.b()) {
                        f7 = f8;
                    }
                    map.put("value", Float.valueOf(f7));
                    break;
                case 6:
                    if (i7 == 6 && ratingCompat.b()) {
                        f7 = f8;
                    }
                    map.put("value", Float.valueOf(f7));
                    break;
            }
        } else {
            map.put("value", null);
        }
        return map;
    }

    public final void f() {
        if (f13276D == null) {
            e eVar = new e(this.f13282a, new ComponentName(this.f13282a, (Class<?>) AudioService.class), this.f13287f);
            f13276D = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f8009a.f8001b.connect();
        }
    }

    public final void o() {
        p121q5.c cVar = this.f13286e.f13266b;
        if (f13281z == null || cVar.getIntent().getAction() == null) {
            return;
        }
        f13281z.g("onNotificationClicked", k("clicked", Boolean.valueOf(cVar.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        this.f13284c = bVar;
        j jVar = this.f13286e;
        p121q5.c cVar = (p121q5.c) ((o) bVar).f5822a;
        jVar.f13266b = cVar;
        jVar.f13265a = cVar;
        p128r5.b bVarI = i(cVar);
        j jVar2 = this.f13286e;
        jVar2.f13268d = this.f13283b.f18083c != bVarI.f16039c;
        f13280y = jVar2;
        p164x5.b bVar2 = this.f13284c;
        d dVar = new d(this);
        this.f13285d = dVar;
        ((HashSet) ((o) bVar2).f5825d).add(dVar);
        C1050x1 c1050x1 = f13277E;
        if (c1050x1 != null) {
            C1050x1.e0(f13280y.f13266b, c1050x1);
        }
        if (f13276D == null) {
            f();
        }
        p121q5.c cVar2 = f13280y.f13266b;
        if ((this.f13286e.f13266b.getIntent().getFlags() & 1048576) == 1048576) {
            cVar2.setIntent(new Intent("android.intent.action.MAIN"));
        }
        o();
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        this.f13283b = bVar;
        j jVar = new j(bVar.f18083c);
        this.f13286e = jVar;
        jVar.f13265a = this.f13283b.f18081a;
        f13279x.add(jVar);
        if (this.f13282a == null) {
            this.f13282a = this.f13283b.f18081a;
        }
        if (f13281z == null) {
            j jVar2 = new j(this.f13283b.f18083c);
            f13281z = jVar2;
            AudioService.f12302R = jVar2;
        }
        if (f13276D == null) {
            f();
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        p164x5.b bVar = this.f13284c;
        ((HashSet) ((o) bVar).f5825d).remove(this.f13285d);
        this.f13284c = null;
        this.f13285d = null;
        j jVar = this.f13286e;
        jVar.f13266b = null;
        jVar.f13265a = this.f13283b.f18081a;
        if (f13279x.size() == 1) {
            h();
        }
        if (this.f13286e == f13280y) {
            f13280y = null;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        p164x5.b bVar = this.f13284c;
        ((HashSet) ((o) bVar).f5825d).remove(this.f13285d);
        this.f13284c = null;
        j jVar = this.f13286e;
        jVar.f13266b = null;
        jVar.f13265a = this.f13283b.f18081a;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        HashSet hashSet = f13279x;
        if (hashSet.size() == 1) {
            h();
        }
        hashSet.remove(this.f13286e);
        this.f13286e.f13265a = null;
        this.f13286e = null;
        this.f13282a = null;
        j jVar = f13281z;
        if (jVar != null && ((f) jVar.f3678b) == this.f13283b.f18083c) {
            System.out.println("### destroying audio handler interface");
            AudioTrack audioTrack = (AudioTrack) f13281z.f3680d;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f13281z = null;
        }
        this.f13283b = null;
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        this.f13284c = bVar;
        j jVar = this.f13286e;
        p121q5.c cVar = (p121q5.c) ((o) bVar).f5822a;
        jVar.f13266b = cVar;
        jVar.f13265a = cVar;
        d dVar = new d(this);
        this.f13285d = dVar;
        ((HashSet) ((o) bVar).f5825d).add(dVar);
    }
}
