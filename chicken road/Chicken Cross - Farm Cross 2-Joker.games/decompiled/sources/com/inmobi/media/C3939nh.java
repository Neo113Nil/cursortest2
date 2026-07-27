package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.nh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3939nh implements InterfaceC3968oh {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3853kh f7267a;
    public final Oj b;
    public final String c;
    public final AtomicBoolean d;

    public C3939nh(InterfaceC3853kh interfaceC3853kh, Oj oj) {
        this.f7267a = interfaceC3853kh;
        this.b = oj;
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        this.c = id;
        this.d = new AtomicBoolean(false);
        C3931n9 c3931n9 = (C3931n9) Zg.c.getValue();
        c3931n9.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(this, "listener");
        c3931n9.b.put(id, new WeakReference(this));
        Iterator it = c3931n9.b.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                it.remove();
            }
        }
        Q5 q5 = (Q5) Zg.d.getValue();
        q5.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(this, "listener");
        q5.b.put(id, new WeakReference(this));
        Iterator it2 = q5.b.entrySet().iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                it2.remove();
            }
        }
    }

    public static Object a(Vg vg, C3911mh c3911mh) {
        String str = "resolvePing called with ping: " + vg;
        if (Intrinsics.areEqual(vg.e, Constants.HIGH)) {
            Object c = ((C3931n9) Zg.c.getValue()).c(vg, c3911mh);
            if (c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                c = Unit.INSTANCE;
            }
            return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
        }
        Object b = ((Q5) Zg.d.getValue()).b(vg, c3911mh);
        if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            b = Unit.INSTANCE;
        }
        return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
    }

    public final void b(String str) {
        try {
            Iterator it = a(str).iterator();
            while (it.hasNext()) {
                BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new C3911mh(this, (Vg) it.next(), null), 3, null);
            }
        } catch (JSONException e) {
            Oj oj = this.b;
            if (oj != null) {
                oj.a(0, "unknown", (short) 2243);
            }
            InterfaceC3853kh interfaceC3853kh = this.f7267a;
            if (interfaceC3853kh != null) {
                A6[] a6Arr = A6.f6449a;
                ((Aj) interfaceC3853kh).a("", PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
            String str2 = "Error processing pings: " + e.getMessage();
        } catch (Exception e2) {
            Oj oj2 = this.b;
            if (oj2 != null) {
                oj2.a(0, "unknown", (short) 2244);
            }
            String str3 = "Unexpected error processing pings: " + e2.getMessage();
            Lazy lazy = Ba.f6473a;
            U9.a(e2);
        } catch (NoClassDefFoundError e3) {
            Oj oj3 = this.b;
            if (oj3 != null) {
                oj3.a(0, "unknown", (short) 2245);
            }
            String str4 = "Error processing pings: " + e3.getMessage();
            Lazy lazy2 = Ba.f6473a;
            Ba.a(new C3810j3(e3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.inmobi.media.Vg] */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            Oj oj = this.b;
            if (oj != null) {
                oj.a(0, "unknown", (short) 2253);
            }
            InterfaceC3853kh interfaceC3853kh = this.f7267a;
            if (interfaceC3853kh != null) {
                A6[] a6Arr = A6.f6449a;
                ((Aj) interfaceC3853kh).a("", PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                Oj oj2 = this.b;
                if (oj2 != null) {
                    oj2.a(0, "unknown", (short) 2254);
                }
            } else {
                String optString = optJSONObject.optString("id");
                if (optString != null && !StringsKt.isBlank(optString)) {
                    String optString2 = optJSONObject.optString("url");
                    if (a(optString, optString2)) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (optJSONObject2 != null) {
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                linkedHashMap.put(next, optJSONObject2.optString(next, ""));
                            }
                        }
                        boolean optBoolean = optJSONObject.optBoolean("allowRedirects", true);
                        String optString3 = optJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Constants.NORMAL);
                        boolean optBoolean2 = optJSONObject.optBoolean("ackRequired", false);
                        Intrinsics.checkNotNull(optString2);
                        String str2 = optString3 == null ? Constants.NORMAL : optString3;
                        String str3 = this.c;
                        Oj oj3 = this.b;
                        r8 = new Vg(optString2, optString, linkedHashMap, optBoolean, str2, optBoolean2, 0, str3, System.currentTimeMillis(), null, oj3 != null ? oj3.f6766a : null, "idle");
                    }
                } else {
                    Intrinsics.checkNotNull(optString);
                    Oj oj4 = this.b;
                    if (oj4 != null) {
                        oj4.a(0, "unknown", (short) 2255);
                    }
                    InterfaceC3853kh interfaceC3853kh2 = this.f7267a;
                    if (interfaceC3853kh2 != null) {
                        A6[] a6Arr2 = A6.f6449a;
                        ((Aj) interfaceC3853kh2).a(optString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (r8 != null) {
                arrayList.add(r8);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            try {
                URI uri = new URI(str2);
                if ((Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTP) || Intrinsics.areEqual(uri.getScheme(), "https")) && (host = uri.getHost()) != null) {
                    if (!StringsKt.isBlank(host)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            Oj oj = this.b;
            if (oj != null) {
                oj.a(0, "unknown", (short) 2256);
            }
            InterfaceC3853kh interfaceC3853kh = this.f7267a;
            if (interfaceC3853kh != null) {
                A6[] a6Arr = A6.f6449a;
                ((Aj) interfaceC3853kh).a(str, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            String str3 = "Invalid URL: " + str2 + " for ping ID: " + str;
            return false;
        }
        Oj oj2 = this.b;
        if (oj2 != null) {
            oj2.a(0, "unknown", (short) 2252);
        }
        InterfaceC3853kh interfaceC3853kh2 = this.f7267a;
        if (interfaceC3853kh2 != null) {
            A6[] a6Arr2 = A6.f6449a;
            ((Aj) interfaceC3853kh2).a(str, PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        String str4 = "Ping URL is null or empty for ping ID: " + str;
        return false;
    }

    public final void a(Vg ping, int i, long j) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str = "Ping resolved: " + ping.f6913a + ", Status Code: " + i + ", Priority: " + ping.e + " Retry Count: " + ping.g;
        if (Intrinsics.areEqual(Constants.HIGH, ping.e) && ping.f) {
            String str2 = "Notifying pingAckListener about success for ping: " + ping.b;
            InterfaceC3853kh interfaceC3853kh = this.f7267a;
            if (interfaceC3853kh != null) {
                ((Aj) interfaceC3853kh).a(ping.b, i, null, j, ping.g);
            }
        }
        String str3 = ping.e;
        long currentTimeMillis = System.currentTimeMillis() - ping.i;
        int i2 = ping.g;
        Oj oj = this.b;
        if (oj != null) {
            oj.a(i2, currentTimeMillis, str3);
        }
    }

    public final void a(Vg ping, int i, String str, int i2, long j, short s) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str2 = "Ping resolution failed: " + ping.f6913a + ", Status Code: " + i + ", Error: " + str + ", Retry Count: " + i2;
        if (Intrinsics.areEqual(Constants.HIGH, ping.e) && ping.f && ping.g < 1) {
            String str3 = "Notifying pingAckListener about failure for ping: " + ping.b;
            InterfaceC3853kh interfaceC3853kh = this.f7267a;
            if (interfaceC3853kh != null) {
                ((Aj) interfaceC3853kh).a(ping.b, i, str, j, ping.g);
            }
        } else {
            String str4 = "Not notifying pingAckListener about failure for ping: " + ping.b + ServerSentEventKt.SPACE + ping.g + ServerSentEventKt.SPACE + ping.f + ServerSentEventKt.SPACE + ping.e;
        }
        String str5 = ping.e;
        Oj oj = this.b;
        if (oj != null) {
            if (str5 == null) {
                str5 = "unknown";
            }
            oj.a(i2, str5, s);
        }
    }
}
