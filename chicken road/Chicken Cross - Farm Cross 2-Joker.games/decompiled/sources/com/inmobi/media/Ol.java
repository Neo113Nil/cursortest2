package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Ol {
    public static JSONObject a(List results) {
        Intrinsics.checkNotNullParameter(results, "results");
        JSONObject jSONObject = new JSONObject();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            El el = (El) it.next();
            if (el instanceof Bl) {
                try {
                    AbstractC4277zl abstractC4277zl = ((Bl) el).b;
                    if (abstractC4277zl instanceof C4249yl) {
                        jSONObject.put(((Bl) el).f6480a, ((C4249yl) abstractC4277zl).f7508a);
                    } else {
                        if (!(abstractC4277zl instanceof C4222xl)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jSONObject.put(((Bl) el).f6480a, ((C4222xl) abstractC4277zl).f7483a);
                    }
                } catch (Exception e) {
                    String str = "Failed to merge payload for '" + ((Bl) el).f6480a + "': " + e.getMessage();
                }
            }
        }
        return jSONObject;
    }
}
