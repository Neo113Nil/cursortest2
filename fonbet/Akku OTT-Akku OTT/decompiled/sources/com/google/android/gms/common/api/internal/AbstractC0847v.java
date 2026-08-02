package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.C0875q;

/* renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0847v<A extends a.b, ResultT> {

    @Nullable
    public final C0854d[] a;
    public final boolean b;
    public final int c;

    /* renamed from: com.google.android.gms.common.api.internal.v$a */
    public static class a<A extends a.b, ResultT> {
        public r a;
        public boolean b;
        public C0854d[] c;
        public int d;

        @NonNull
        public final d0 a() {
            C0875q.b(this.a != null, "execute parameter required");
            return new d0(this, this.c, this.b, this.d);
        }
    }

    public AbstractC0847v(@Nullable C0854d[] c0854dArr, boolean z, int i) {
        this.a = c0854dArr;
        boolean z2 = false;
        if (c0854dArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    @NonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.b = true;
        aVar.d = 0;
        return aVar;
    }
}
