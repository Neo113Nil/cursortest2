package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class i implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int b = aVar.b(context, str);
        c0115b.a = b;
        if (b != 0) {
            c0115b.c = -1;
            return c0115b;
        }
        int a = aVar.a(context, str, true);
        c0115b.b = a;
        if (a != 0) {
            c0115b.c = 1;
        }
        return c0115b;
    }
}
