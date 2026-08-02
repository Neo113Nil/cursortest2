package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        c0115b.a = aVar.b(context, str);
        int i = 1;
        int a = aVar.a(context, str, true);
        c0115b.b = a;
        int i2 = c0115b.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                c0115b.c = i;
                return c0115b;
            }
        }
        if (i2 >= a) {
            i = -1;
        }
        c0115b.c = i;
        return c0115b;
    }
}
