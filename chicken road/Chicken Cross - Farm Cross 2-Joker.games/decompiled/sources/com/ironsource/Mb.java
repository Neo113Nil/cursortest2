package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.c f7796a;
    private final C4515la b;
    private final T9 c;
    private final Q6 d;
    private final C4491k4 e;

    public Mb() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(boolean z) {
        a(CollectionsKt.listOf(com.ironsource.mediationsdk.metadata.a.f8424a), z);
    }

    public final void b(boolean z) {
        List<String> META_DATA_COPPA_FLAGS = com.ironsource.mediationsdk.metadata.a.g;
        Intrinsics.checkNotNullExpressionValue(META_DATA_COPPA_FLAGS, "META_DATA_COPPA_FLAGS");
        a(META_DATA_COPPA_FLAGS, z);
    }

    public Mb(com.ironsource.mediationsdk.c adapterRepository, C4515la publisherDataHolder, T9 globalDataWriter, Q6 googleWaterMarkDataWriter, C4491k4 crashReporter) {
        Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        Intrinsics.checkNotNullParameter(googleWaterMarkDataWriter, "googleWaterMarkDataWriter");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f7796a = adapterRepository;
        this.b = publisherDataHolder;
        this.c = globalDataWriter;
        this.d = googleWaterMarkDataWriter;
        this.e = crashReporter;
    }

    private final void a(String str, boolean z) {
        List<String> listOf = CollectionsKt.listOf(String.valueOf(z));
        if (MetaDataUtils.isMediationOnlyKey(str)) {
            this.b.a(str, listOf);
        } else {
            this.f7796a.c(str, listOf);
        }
    }

    private final void a() {
        try {
            HashMap hashMap = new HashMap(this.f7796a.f());
            hashMap.putAll(this.b.c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), (List) entry.getValue());
            }
            this.d.a(jSONObject);
            this.c.a(jSONObject);
        } catch (JSONException e) {
            this.e.a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Mb(com.ironsource.mediationsdk.c cVar, C4515la c4515la, T9 t9, Q6 q6, C4491k4 c4491k4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, r10, r1, r2, c4491k4);
        if ((i & 1) != 0) {
            cVar = com.ironsource.mediationsdk.c.d();
            Intrinsics.checkNotNullExpressionValue(cVar, "getInstance()");
        }
        if ((i & 2) != 0) {
            c4515la = C4515la.b();
            Intrinsics.checkNotNullExpressionValue(c4515la, "getInstance()");
        }
        C4515la c4515la2 = c4515la;
        T9 t92 = (i & 4) != 0 ? new T9() : t9;
        Q6 q62 = (i & 8) != 0 ? new Q6(t92) : q6;
        if ((i & 16) != 0) {
            c4491k4 = C4491k4.d();
            Intrinsics.checkNotNullExpressionValue(c4491k4, "getInstance()");
        }
    }

    private final void a(List<String> list, boolean z) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), z);
        }
        a();
    }
}
