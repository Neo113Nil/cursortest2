package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class g8 {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f4223a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static final Random b = new Random(System.currentTimeMillis());

    public static void a(y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, z7 z7Var, int i, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set a2 = a(y7Var, lVar);
        if (CollectionUtils.isEmpty(a2)) {
            return;
        }
        a(a2, z7Var, lVar);
    }

    public static boolean b(u7 u7Var) {
        h8 p1;
        List g;
        return (u7Var == null || (p1 = u7Var.p1()) == null || (g = p1.g()) == null || g.isEmpty()) ? false : true;
    }

    public static z7 c(u7 u7Var) {
        if (b(u7Var) || a(u7Var)) {
            return null;
        }
        return z7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f4223a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(u7 u7Var) {
        x7 g1;
        c8 e;
        if (u7Var == null || (g1 = u7Var.g1()) == null || (e = g1.e()) == null) {
            return false;
        }
        return e.c() != null || StringUtils.isValidString(e.b());
    }

    public static boolean b(t8 t8Var) {
        if (t8Var != null) {
            return t8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f) != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j, Uri uri, z7 z7Var, com.applovin.impl.sdk.l lVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(z7Var.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                lVar.E().a("VastUtils", th);
                return null;
            }
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j) {
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j);
            long minutes = timeUnit.toMinutes(j);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, z7.UNSPECIFIED, lVar);
    }

    public static void a(Set set, z7 z7Var, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, z7Var, lVar);
    }

    public static void a(Set set, long j, Uri uri, z7 z7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                e8 e8Var = (e8) it.next();
                Uri a2 = a(e8Var.c(), j, uri, z7Var, lVar);
                if (a2 != null) {
                    lVar.h0().a(com.applovin.impl.sdk.network.d.b().d(a2.toString()).a(false).b(e8Var.d()).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(t8 t8Var, Map map, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        List<t8> a2;
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (t8Var == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        t8 c = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
        if (c == null || (a2 = c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) == null) {
            return;
        }
        for (t8 t8Var2 : a2) {
            String str = (String) t8Var2.a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                e8 a3 = e8.a(t8Var2, y7Var, lVar);
                if (a3 != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(a3);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a3);
                        map.put(str, hashSet);
                    }
                }
            } else {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastUtils", "Could not find event for tracking node = " + t8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e8 a2 = e8.a((t8) it.next(), y7Var, lVar);
            if (a2 != null) {
                set.add(a2);
            }
        }
    }

    public static boolean a(t8 t8Var) {
        if (t8Var != null) {
            return t8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e) != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(y7 y7Var) {
        t8 b2;
        if (y7Var != null) {
            List a2 = y7Var.a();
            int size = y7Var.a().size();
            if (size <= 0 || (b2 = ((t8) a2.get(size - 1)).b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g)) == null) {
                return null;
            }
            return b2.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(t8 t8Var, String str, String str2) {
        t8 c = t8Var.c(str);
        if (c != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                return d;
            }
        }
        return str2;
    }

    private static Set a(y7 y7Var, com.applovin.impl.sdk.l lVar) {
        List a2;
        if (y7Var == null) {
            return null;
        }
        List<t8> a3 = y7Var.a();
        HashSet hashSet = new HashSet(a3.size());
        for (t8 t8Var : a3) {
            t8 b2 = t8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f);
            if (b2 == null) {
                b2 = t8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
            }
            if (b2 != null) {
                a2 = b2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
            } else {
                a2 = t8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
            }
            hashSet = a(hashSet, a2, y7Var, lVar);
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        if (list == null) {
            return hashSet;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e8 a2 = e8.a((t8) it.next(), y7Var, lVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return hashSet;
    }
}
