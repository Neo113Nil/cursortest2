package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class Wd {
    public static final List a(C3912mi c3912mi) {
        Intrinsics.checkNotNullParameter(c3912mi, "<this>");
        return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(c3912mi.b, (short) 0), TuplesKt.to(c3912mi.f7250a.getTitleView(), (short) 3), TuplesKt.to(c3912mi.f7250a.getDescriptionView(), (short) 4), TuplesKt.to(c3912mi.f7250a.getIconView(), (short) 5), TuplesKt.to(c3912mi.f7250a.getCtaView(), (short) 6), TuplesKt.to(c3912mi.c, (short) 7), TuplesKt.to(c3912mi.f7250a.getRatingView(), (short) 8), TuplesKt.to(c3912mi.f7250a.getAdvertiserView(), (short) 9)});
    }

    public static final void a(C3912mi c3912mi, Y9 y9) {
        Intrinsics.checkNotNullParameter(c3912mi, "<this>");
        Intrinsics.checkNotNullParameter("NativeRenderedState", "tag");
        if (y9 == null) {
            return;
        }
        List<Pair> a2 = a(c3912mi);
        ViewGroup parentView = c3912mi.f7250a.getParentView();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : a2) {
            View view = (View) pair.component1();
            short shortValue = ((Number) pair.component2()).shortValue();
            if (view != null) {
                jSONArray.put(((int) shortValue) + " - " + (view.getVisibility() == 0) + ServerSentEventKt.SPACE + Jp.a(view, parentView));
            }
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        ((Z9) y9).a("NativeRenderedState", jSONArray2);
    }
}
