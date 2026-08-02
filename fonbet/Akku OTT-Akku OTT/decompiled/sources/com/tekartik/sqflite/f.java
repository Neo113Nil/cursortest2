package com.tekartik.sqflite;

import androidx.annotation.Nullable;
import com.tekartik.sqflite.h;

/* loaded from: classes4.dex */
public final class f {

    @Nullable
    public final e a;
    public final Runnable b;

    public f(h.a aVar, Runnable runnable) {
        this.a = aVar;
        this.b = runnable;
    }

    public final Integer a() {
        e eVar = this.a;
        if (eVar != null) {
            return Integer.valueOf(((h.a) eVar).a.c);
        }
        return null;
    }
}
