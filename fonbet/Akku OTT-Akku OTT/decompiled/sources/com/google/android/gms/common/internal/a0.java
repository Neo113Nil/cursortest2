package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class a0 {

    @Nullable
    public Boolean a;
    public boolean b;
    public final /* synthetic */ AbstractC0861c c;

    public a0(AbstractC0861c abstractC0861c) {
        Boolean bool = Boolean.TRUE;
        this.c = abstractC0861c;
        this.a = bool;
        this.b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this) {
            this.a = null;
        }
        arrayList = this.c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.c.zzt;
            arrayList2.remove(this);
        }
    }
}
