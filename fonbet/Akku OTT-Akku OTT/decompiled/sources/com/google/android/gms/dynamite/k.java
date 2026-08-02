package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class k implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int a;
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int b = aVar.b(context, str);
        c0115b.a = b;
        int i = 1;
        int i2 = 0;
        if (b != 0) {
            a = aVar.a(context, str, false);
            c0115b.b = a;
        } else {
            a = aVar.a(context, str, true);
            c0115b.b = a;
        }
        int i3 = c0115b.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (a == 0) {
            i = 0;
            c0115b.c = i;
            return c0115b;
        }
        if (i2 >= a) {
            i = -1;
        }
        c0115b.c = i;
        return c0115b;
    }
}
