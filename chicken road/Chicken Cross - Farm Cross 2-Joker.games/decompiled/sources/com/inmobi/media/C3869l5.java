package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3869l5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3869l5 f7216a;
    public static final Lazy b;
    public static LinkedList c;
    public static LinkedList d;
    public static byte[] e;
    public static String f;

    static {
        C3869l5 c3869l5 = new C3869l5();
        f7216a = c3869l5;
        b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.l5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3869l5.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        Object clone = linkedList.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (LinkedList) clone;
        C3785i5 c3785i5 = new C3785i5();
        C3700f5 c3700f5 = new C3700f5();
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        J4 j42 = AbstractC4260z4.f7518a;
        e = AbstractC4234y6.a(((SignalsConfig) j42.a(SignalsConfig.class)).getKA());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C3899m5.j);
        arrayList.removeAll(skipFields);
        f = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "c_data_store");
            Context context2 = AbstractC3914mk.f7252a;
            int i = 1;
            if (context2 != null) {
                Db a3 = Cb.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a3.f6510a.getInt("akv", 1);
            }
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) j42.a(SignalsConfig.class)).getVAK() != i) {
                Intrinsics.checkNotNullExpressionValue("l5", "TAG");
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                a2.a("akv", ((SignalsConfig) j42.a(SignalsConfig.class)).getVAK(), false);
                c3869l5.f();
            }
        }
        AbstractC4260z4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, c3700f5);
        AbstractC4260z4.a("signals", c3785i5);
    }

    public static final C3644d5 b() {
        return new C3644d5(T9.b());
    }

    public static AdConfig c() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
    }

    public static String d() {
        Intrinsics.checkNotNullExpressionValue("l5", "TAG");
        if (f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        LinkedList linkedList = d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C4207x6) obj).b >= currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(StringsKt.trim((CharSequence) ((C4207x6) it.next()).f7472a).toString());
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public static boolean e() {
        boolean z;
        AdConfig.ContextualDataConfig contextualData;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "c_data_store");
            Intrinsics.checkNotNullParameter("isEnabled", "key");
            z = a2.f6510a.getBoolean("isEnabled", true);
        } else {
            z = true;
        }
        if (!z) {
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            String str = "isEnabled 1 " + z;
            return false;
        }
        AdConfig c2 = c();
        boolean z2 = ((c2 == null || (contextualData = c2.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        Intrinsics.checkNotNullExpressionValue("l5", "TAG");
        String str2 = "isEnabled 2 " + z2;
        return z2;
    }

    public final void a(boolean z) {
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            String str = "setEnabled " + z;
            if (z != e()) {
                Intrinsics.checkNotNullExpressionValue("l5", "TAG");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db.a(Cb.a(context, "c_data_store"), "isEnabled", z);
                if (z) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new C3756h5(null), 1, null);
            LinkedList linkedList = new LinkedList();
            c = linkedList;
            Object clone = linkedList.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            d = (LinkedList) clone;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void a() {
        Intrinsics.checkNotNullExpressionValue("l5", "TAG");
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        a(currentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object clone = c.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (LinkedList) clone;
        BuildersKt__BuildersKt.runBlocking$default(null, new C3840k5(currentTimeMillis, null), 1, null);
    }

    public static void a(long j, int i) {
        Intrinsics.checkNotNullExpressionValue("l5", "TAG");
        for (int size = c.size(); size > i; size--) {
            c.remove();
        }
        Intrinsics.checkNotNullExpressionValue("l5", "TAG");
        Iterator it = c.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((C4207x6) next).b >= j) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
