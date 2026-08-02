package g5;

import A5.p;
import G4.C0282o;
import G4.C0286t;
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
import l.C1373k;
import q5.AbstractActivityC1559c;
import r5.C1577b;
import s5.C1599a;
import u5.C1649c;
import w1.C1719l1;
import w1.C1759x1;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public class l implements InterfaceC1783c, InterfaceC1789a {

    /* renamed from: B, reason: collision with root package name */
    public static p f13268B;

    /* renamed from: C, reason: collision with root package name */
    public static boolean f13269C;

    /* renamed from: D, reason: collision with root package name */
    public static android.support.v4.media.e f13270D;

    /* renamed from: E, reason: collision with root package name */
    public static C1759x1 f13271E;

    /* renamed from: y, reason: collision with root package name */
    public static j f13274y;

    /* renamed from: z, reason: collision with root package name */
    public static I4.j f13275z;

    /* renamed from: a, reason: collision with root package name */
    public Context f13276a;

    /* renamed from: b, reason: collision with root package name */
    public C1782b f13277b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1790b f13278c;

    /* renamed from: d, reason: collision with root package name */
    public C1149d f13279d;

    /* renamed from: e, reason: collision with root package name */
    public j f13280e;

    /* renamed from: f, reason: collision with root package name */
    public final C1151f f13281f = new C1151f(this);

    /* renamed from: x, reason: collision with root package name */
    public static final HashSet f13273x = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public static final long f13267A = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* renamed from: F, reason: collision with root package name */
    public static final C1150e f13272F = new C1150e();

    public static MediaBrowserCompat$MediaItem a(Map map) {
        return new MediaBrowserCompat$MediaItem(d(g(map).a(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static HashMap b(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompat = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat a2 = mediaMetadataCompat.a();
        HashMap hashMap = new HashMap();
        hashMap.put("id", a2.f7978a);
        hashMap.put("title", m(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", m(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = a2.f7983f;
        if (uri != null) {
            hashMap.put("artUri", uri.toString());
        }
        hashMap.put("artist", m(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", m(mediaMetadataCompat, "android.media.metadata.GENRE"));
        Bundle bundle = mediaMetadataCompat.f7991a;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        hashMap.put("playable", Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        hashMap.put("displayTitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompat = RatingCompat.a(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e7) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e7);
            }
            hashMap.put("rating", n(ratingCompat));
        }
        HashMap e8 = e(new Bundle(bundle));
        if (e8.size() > 0) {
            hashMap.put("extras", e8);
        }
        return hashMap;
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
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaMetadataCompat g(Map map) {
        RatingCompat ratingCompat;
        float f7;
        Map map2;
        Object obj;
        Object obj2;
        AudioService audioService = AudioService.f12300P;
        String str = (String) map.get("id");
        String str2 = (String) map.get("title");
        String str3 = (String) map.get("album");
        String str4 = (String) map.get("artist");
        String str5 = (String) map.get("genre");
        Long j = j(map.get("duration"));
        String str6 = (String) map.get("artUri");
        Boolean bool = (Boolean) map.get("playable");
        String str7 = (String) map.get("displayTitle");
        String str8 = (String) map.get("displaySubtitle");
        String str9 = (String) map.get("displayDescription");
        Map map3 = (Map) map.get("rating");
        if (map3 != null) {
            Integer num = (Integer) map3.get("type");
            Object obj3 = map3.get("value");
            if (obj3 == null) {
                int intValue = num.intValue();
                switch (intValue) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        f7 = -1.0f;
                        ratingCompat = new RatingCompat(intValue, -1.0f);
                        break;
                }
                map2 = (Map) map.get("extras");
                audioService.getClass();
                C1719l1 c1719l1 = new C1719l1(11);
                c1719l1.E("android.media.metadata.MEDIA_ID", str);
                c1719l1.E("android.media.metadata.TITLE", str2);
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                if (str5 != null) {
                }
                if (j != null) {
                }
                if (str6 != null) {
                }
                if (bool != null) {
                }
                if (str7 != null) {
                }
                if (str8 != null) {
                }
                if (str9 != null) {
                }
                Bundle bundle = (Bundle) c1719l1.f17771a;
                if (ratingCompat != null) {
                }
                if (map2 != null) {
                }
                MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
                AudioService.f12304T.put(str, mediaMetadataCompat);
                return mediaMetadataCompat;
            }
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
                    int intValue2 = num.intValue();
                    switch (intValue2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            ratingCompat = new RatingCompat(intValue2, -1.0f);
                            break;
                    }
            }
            f7 = -1.0f;
            map2 = (Map) map.get("extras");
            audioService.getClass();
            C1719l1 c1719l12 = new C1719l1(11);
            c1719l12.E("android.media.metadata.MEDIA_ID", str);
            c1719l12.E("android.media.metadata.TITLE", str2);
            if (str3 != null) {
                c1719l12.E("android.media.metadata.ALBUM", str3);
            }
            if (str4 != null) {
                c1719l12.E("android.media.metadata.ARTIST", str4);
            }
            if (str5 != null) {
                c1719l12.E("android.media.metadata.GENRE", str5);
            }
            if (j != null) {
                c1719l12.D("android.media.metadata.DURATION", j.longValue());
            }
            if (str6 != null) {
                c1719l12.E("android.media.metadata.DISPLAY_ICON_URI", str6);
            }
            if (bool != null) {
                c1719l12.D("playable_long", bool.booleanValue() ? 1L : 0L);
            }
            if (str7 != null) {
                c1719l12.E("android.media.metadata.DISPLAY_TITLE", str7);
            }
            if (str8 != null) {
                c1719l12.E("android.media.metadata.DISPLAY_SUBTITLE", str8);
            }
            if (str9 != null) {
                c1719l12.E("android.media.metadata.DISPLAY_DESCRIPTION", str9);
            }
            Bundle bundle2 = (Bundle) c1719l12.f17771a;
            if (ratingCompat != null) {
                r.b bVar = MediaMetadataCompat.f7987d;
                if (bVar.containsKey("android.media.metadata.RATING")) {
                    obj = null;
                    if (((Integer) bVar.getOrDefault("android.media.metadata.RATING", null)).intValue() != 3) {
                        throw new IllegalArgumentException("The android.media.metadata.RATING key cannot be used to put a Rating");
                    }
                } else {
                    obj = null;
                }
                if (ratingCompat.f7996c == null) {
                    boolean b7 = ratingCompat.b();
                    int i7 = ratingCompat.f7994a;
                    if (b7) {
                        float f8 = ratingCompat.f7995b;
                        switch (i7) {
                            case 1:
                                ratingCompat.f7996c = android.support.v4.media.h.g(i7 == 1 ? f8 == 1.0f : false);
                                break;
                            case 2:
                                ratingCompat.f7996c = android.support.v4.media.h.j(i7 == 2 ? f8 == 1.0f : false);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                if ((i7 == 3 || i7 == 4 || i7 == 5) && ratingCompat.b()) {
                                    f7 = f8;
                                }
                                ratingCompat.f7996c = android.support.v4.media.h.i(i7, f7);
                                break;
                            case 6:
                                if (i7 == 6 && ratingCompat.b()) {
                                    f7 = f8;
                                }
                                ratingCompat.f7996c = android.support.v4.media.h.h(f7);
                                break;
                            default:
                                obj2 = obj;
                                break;
                        }
                        bundle2.putParcelable("android.media.metadata.RATING", (Parcelable) obj2);
                    } else {
                        ratingCompat.f7996c = android.support.v4.media.h.k(i7);
                    }
                }
                obj2 = ratingCompat.f7996c;
                bundle2.putParcelable("android.media.metadata.RATING", (Parcelable) obj2);
            }
            if (map2 != null) {
                for (String str10 : map2.keySet()) {
                    Object obj4 = map2.get(str10);
                    if (obj4 instanceof Long) {
                        c1719l12.D(str10, ((Long) obj4).longValue());
                    } else if (obj4 instanceof Integer) {
                        c1719l12.D(str10, ((Integer) obj4).intValue());
                    } else if (obj4 instanceof String) {
                        c1719l12.E(str10, (String) obj4);
                    } else if (obj4 instanceof Boolean) {
                        c1719l12.D(str10, ((Boolean) obj4).booleanValue() ? 1L : 0L);
                    } else if (obj4 instanceof Double) {
                        c1719l12.E(str10, obj4.toString());
                    }
                }
            }
            MediaMetadataCompat mediaMetadataCompat2 = new MediaMetadataCompat(bundle2);
            AudioService.f12304T.put(str, mediaMetadataCompat2);
            return mediaMetadataCompat2;
        }
        ratingCompat = null;
        f7 = -1.0f;
        map2 = (Map) map.get("extras");
        audioService.getClass();
        C1719l1 c1719l122 = new C1719l1(11);
        c1719l122.E("android.media.metadata.MEDIA_ID", str);
        c1719l122.E("android.media.metadata.TITLE", str2);
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
        if (j != null) {
        }
        if (str6 != null) {
        }
        if (bool != null) {
        }
        if (str7 != null) {
        }
        if (str8 != null) {
        }
        if (str9 != null) {
        }
        Bundle bundle22 = (Bundle) c1719l122.f17771a;
        if (ratingCompat != null) {
        }
        if (map2 != null) {
        }
        MediaMetadataCompat mediaMetadataCompat22 = new MediaMetadataCompat(bundle22);
        AudioService.f12304T.put(str, mediaMetadataCompat22);
        return mediaMetadataCompat22;
    }

    public static void h() {
        j jVar = f13274y;
        AbstractActivityC1559c abstractActivityC1559c = jVar != null ? jVar.f13260b : null;
        if (abstractActivityC1559c != null) {
            abstractActivityC1559c.setIntent(new Intent("android.intent.action.MAIN"));
        }
        C1759x1 c1759x1 = f13271E;
        if (c1759x1 != null) {
            C1150e c1150e = f13272F;
            if (c1150e == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) c1759x1.f17927d).remove(c1150e)) {
                try {
                    ((android.support.v4.media.session.h) c1759x1.f17925b).b(c1150e);
                } finally {
                    c1150e.b(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            f13271E = null;
        }
        android.support.v4.media.e eVar = f13270D;
        if (eVar != null) {
            eVar.a();
            f13270D = null;
        }
    }

    public static synchronized C1577b i(ContextWrapper contextWrapper) {
        C1577b c1577b;
        String str;
        boolean z4;
        Uri data;
        synchronized (l.class) {
            try {
                c1577b = (C1577b) C0286t.b().f3024a.get("audio_service_engine");
                if (c1577b == null) {
                    c1577b = new C1577b(contextWrapper.getApplicationContext(), null, new s());
                    if (contextWrapper instanceof AbstractActivityC1559c) {
                        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) contextWrapper;
                        str = abstractActivityC1559c.d();
                        if (str == null) {
                            try {
                                Bundle e7 = abstractActivityC1559c.e();
                                z4 = (e7 == null || !e7.containsKey("flutter_deeplinking_enabled")) ? true : e7.getBoolean("flutter_deeplinking_enabled");
                            } catch (PackageManager.NameNotFoundException unused) {
                                z4 = false;
                            }
                            if (z4 && (data = abstractActivityC1559c.getIntent().getData()) != null) {
                                str = data.getPath();
                                if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                                    str = str + "?" + data.getQuery();
                                }
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "/";
                    }
                    c1577b.f16039i.f18458a.a("setInitialRoute", str, null);
                    C1373k c1373k = c1577b.f16033c;
                    C1649c c1649c = (C1649c) t.l0().f8076b;
                    if (!c1649c.f16877b) {
                        throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
                    }
                    c1373k.b(new C1599a((String) ((C0282o) c1649c.f16879d).f3011c, SentryThread.JsonKeys.MAIN), null);
                    C0286t.b().c("audio_service_engine", c1577b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1577b;
    }

    public static Long j(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static HashMap k(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
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
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(ratingCompat.f7994a));
        if (ratingCompat.b()) {
            boolean z4 = false;
            float f7 = -1.0f;
            float f8 = ratingCompat.f7995b;
            int i7 = ratingCompat.f7994a;
            switch (i7) {
                case 0:
                    hashMap.put("value", null);
                    break;
                case 1:
                    if (i7 == 1) {
                        z4 = f8 == 1.0f;
                    }
                    hashMap.put("value", Boolean.valueOf(z4));
                    break;
                case 2:
                    if (i7 == 2) {
                        z4 = f8 == 1.0f;
                    }
                    hashMap.put("value", Boolean.valueOf(z4));
                    break;
                case 3:
                case 4:
                case 5:
                    if ((i7 == 3 || i7 == 4 || i7 == 5) && ratingCompat.b()) {
                        f7 = f8;
                    }
                    hashMap.put("value", Float.valueOf(f7));
                    break;
                case 6:
                    if (i7 == 6 && ratingCompat.b()) {
                        f7 = f8;
                    }
                    hashMap.put("value", Float.valueOf(f7));
                    break;
            }
        } else {
            hashMap.put("value", null);
        }
        return hashMap;
    }

    public final void f() {
        if (f13270D == null) {
            android.support.v4.media.e eVar = new android.support.v4.media.e(this.f13276a, new ComponentName(this.f13276a, (Class<?>) AudioService.class), this.f13281f);
            f13270D = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f8009a.f8001b.connect();
        }
    }

    public final void o() {
        AbstractActivityC1559c abstractActivityC1559c = this.f13280e.f13260b;
        if (f13275z == null || abstractActivityC1559c.getIntent().getAction() == null) {
            return;
        }
        f13275z.g("onNotificationClicked", k("clicked", Boolean.valueOf(abstractActivityC1559c.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        this.f13278c = interfaceC1790b;
        j jVar = this.f13280e;
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
        jVar.f13260b = abstractActivityC1559c;
        jVar.f13259a = abstractActivityC1559c;
        C1577b i7 = i(abstractActivityC1559c);
        j jVar2 = this.f13280e;
        jVar2.f13262d = this.f13277b.f18077c != i7.f16033c;
        f13274y = jVar2;
        InterfaceC1790b interfaceC1790b2 = this.f13278c;
        C1149d c1149d = new C1149d(this);
        this.f13279d = c1149d;
        ((HashSet) ((o) interfaceC1790b2).f5825d).add(c1149d);
        C1759x1 c1759x1 = f13271E;
        if (c1759x1 != null) {
            C1759x1.e0(f13274y.f13260b, c1759x1);
        }
        if (f13270D == null) {
            f();
        }
        AbstractActivityC1559c abstractActivityC1559c2 = f13274y.f13260b;
        if ((this.f13280e.f13260b.getIntent().getFlags() & 1048576) == 1048576) {
            abstractActivityC1559c2.setIntent(new Intent("android.intent.action.MAIN"));
        }
        o();
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        this.f13277b = c1782b;
        j jVar = new j(c1782b.f18077c);
        this.f13280e = jVar;
        jVar.f13259a = this.f13277b.f18075a;
        f13273x.add(jVar);
        if (this.f13276a == null) {
            this.f13276a = this.f13277b.f18075a;
        }
        if (f13275z == null) {
            I4.j jVar2 = new I4.j(this.f13277b.f18077c);
            f13275z = jVar2;
            AudioService.f12302R = jVar2;
        }
        if (f13270D == null) {
            f();
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        InterfaceC1790b interfaceC1790b = this.f13278c;
        ((HashSet) ((o) interfaceC1790b).f5825d).remove(this.f13279d);
        this.f13278c = null;
        this.f13279d = null;
        j jVar = this.f13280e;
        jVar.f13260b = null;
        jVar.f13259a = this.f13277b.f18075a;
        if (f13273x.size() == 1) {
            h();
        }
        if (this.f13280e == f13274y) {
            f13274y = null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        InterfaceC1790b interfaceC1790b = this.f13278c;
        ((HashSet) ((o) interfaceC1790b).f5825d).remove(this.f13279d);
        this.f13278c = null;
        j jVar = this.f13280e;
        jVar.f13260b = null;
        jVar.f13259a = this.f13277b.f18075a;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        HashSet hashSet = f13273x;
        if (hashSet.size() == 1) {
            h();
        }
        hashSet.remove(this.f13280e);
        this.f13280e.f13259a = null;
        this.f13280e = null;
        this.f13276a = null;
        I4.j jVar = f13275z;
        if (jVar != null && ((A5.f) jVar.f3678b) == this.f13277b.f18077c) {
            System.out.println("### destroying audio handler interface");
            AudioTrack audioTrack = (AudioTrack) f13275z.f3680d;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f13275z = null;
        }
        this.f13277b = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        this.f13278c = interfaceC1790b;
        j jVar = this.f13280e;
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
        jVar.f13260b = abstractActivityC1559c;
        jVar.f13259a = abstractActivityC1559c;
        C1149d c1149d = new C1149d(this);
        this.f13279d = c1149d;
        ((HashSet) ((o) interfaceC1790b).f5825d).add(c1149d);
    }
}
