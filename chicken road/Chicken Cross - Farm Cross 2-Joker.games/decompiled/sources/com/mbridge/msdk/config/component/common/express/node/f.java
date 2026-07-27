package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* compiled from: IndexAccessNode.java */
/* loaded from: classes6.dex */
public class f extends d {

    /* renamed from: a, reason: collision with root package name */
    d f8919a;
    d b;

    public f(d dVar, d dVar2) {
        this.f8919a = dVar;
        this.b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a2;
        String str;
        try {
            a2 = this.f8919a.a(dVar, eVar, aVar);
            str = (String) this.b.a(dVar, eVar, aVar);
        } catch (Exception e) {
            q0.b("IndexAccessNode", "IndexAccessNode error: " + e.getMessage());
        }
        if (a2 != null && !TextUtils.isEmpty(str)) {
            int parseInt = Integer.parseInt(str);
            if (a2 instanceof Object[]) {
                if (parseInt < ((Object[]) a2).length) {
                    return ((Object[]) a2)[parseInt];
                }
            } else if (a2 instanceof int[]) {
                if (parseInt < ((int[]) a2).length) {
                    return Integer.valueOf(((int[]) a2)[parseInt]);
                }
            } else if (a2 instanceof long[]) {
                if (parseInt < ((long[]) a2).length) {
                    return Long.valueOf(((long[]) a2)[parseInt]);
                }
            } else if (a2 instanceof double[]) {
                if (parseInt < ((double[]) a2).length) {
                    return Double.valueOf(((double[]) a2)[parseInt]);
                }
            } else if (a2 instanceof float[]) {
                if (parseInt < ((float[]) a2).length) {
                    return Float.valueOf(((float[]) a2)[parseInt]);
                }
            } else if (a2 instanceof boolean[]) {
                if (parseInt < ((boolean[]) a2).length) {
                    return Boolean.valueOf(((boolean[]) a2)[parseInt]);
                }
            } else if (a2 instanceof char[]) {
                if (parseInt < ((char[]) a2).length) {
                    return Character.valueOf(((char[]) a2)[parseInt]);
                }
            } else if (a2 instanceof byte[]) {
                if (parseInt < ((byte[]) a2).length) {
                    return Byte.valueOf(((byte[]) a2)[parseInt]);
                }
            } else if (a2 instanceof short[]) {
                if (parseInt < ((short[]) a2).length) {
                    return Short.valueOf(((short[]) a2)[parseInt]);
                }
            } else if ((a2 instanceof List) && parseInt < ((List) a2).size()) {
                return ((List) a2).get(parseInt);
            }
            return null;
        }
        return null;
    }
}
