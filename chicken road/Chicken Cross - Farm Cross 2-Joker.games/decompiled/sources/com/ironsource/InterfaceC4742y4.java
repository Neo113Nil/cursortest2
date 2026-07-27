package com.ironsource;

import java.util.Map;

/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4742y4 {
    static /* synthetic */ String a(InterfaceC4742y4 interfaceC4742y4, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return interfaceC4742y4.a(str, str2);
    }

    String a(String str, String str2);

    void a(String str);

    Map<String, ?> allData();

    void b(String str, String str2);
}
