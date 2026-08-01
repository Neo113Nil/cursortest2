package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Nm {

    /* renamed from: a, reason: collision with root package name */
    public final Fa f6748a;

    public Nm(Fa mConfigIncludeIdMaskMap) {
        Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.f6748a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C4229y1 c4229y1;
        String str;
        HashMap hashMap = new HashMap();
        try {
            if (this.f6748a.a() && (c4229y1 = Mm.f6724a) != null && (str = c4229y1.b) != null) {
                Intrinsics.checkNotNull(str);
                hashMap.put("GPID", str);
                return hashMap;
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Nm", "getSimpleName(...)");
        }
        return hashMap;
    }
}
