package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866to implements InterfaceC0892uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(List<C0840so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z3 = true;
        for (C0840so c0840so : list) {
            if (!c0840so.f8320a) {
                linkedList.add(c0840so.f8321b);
                z3 = false;
            }
        }
        return z3 ? new C0840so(this, true, "") : new C0840so(this, false, TextUtils.join(", ", linkedList));
    }
}
