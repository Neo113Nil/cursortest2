package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;

/* loaded from: classes4.dex */
public abstract class O extends a0 {
    public final int d;

    @Nullable
    public final Bundle e;
    public final /* synthetic */ AbstractC0861c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public O(AbstractC0861c abstractC0861c, @Nullable int i, Bundle bundle) {
        super(abstractC0861c);
        this.f = abstractC0861c;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.a0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        AbstractC0861c abstractC0861c = this.f;
        int i = this.d;
        if (i != 0) {
            abstractC0861c.zzp(1, null);
            Bundle bundle = this.e;
            c(new C0852b(i, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0861c.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            abstractC0861c.zzp(1, null);
            c(new C0852b(8, null));
        }
    }

    public abstract void c(C0852b c0852b);

    public abstract boolean d();
}
