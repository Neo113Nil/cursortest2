package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C4732xc> f7701a;

    static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C4732xc>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f7702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f7702a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C4732xc> invoke(String networkName) {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f7702a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new C4732xc(networkName, jSONObject));
        }
    }

    public Id(JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        Map<String, C4732xc> map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(keys), new a(providerSettings)));
        this.f7701a = map;
        for (Map.Entry<String, C4732xc> entry : map.entrySet()) {
            entry.getKey();
            C4732xc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C4732xc c4732xc) {
        return c4732xc.o() && c4732xc.l().length() > 0;
    }

    public final Map<String, C4732xc> a() {
        return this.f7701a;
    }

    private final C4732xc a(C4732xc c4732xc) {
        return this.f7701a.get(c4732xc.h());
    }
}
