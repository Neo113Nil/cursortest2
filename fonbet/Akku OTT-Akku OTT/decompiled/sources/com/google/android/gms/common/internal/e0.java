package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;

/* loaded from: classes4.dex */
public final class e0 extends O {
    public final /* synthetic */ AbstractC0861c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public e0(AbstractC0861c abstractC0861c, @Nullable int i, Bundle bundle) {
        super(abstractC0861c, i, bundle);
        this.g = abstractC0861c;
    }

    @Override // com.google.android.gms.common.internal.O
    public final void c(C0852b c0852b) {
        AbstractC0861c abstractC0861c = this.g;
        if (abstractC0861c.enableLocalFallback() && AbstractC0861c.zzo(abstractC0861c)) {
            AbstractC0861c.zzk(abstractC0861c, 16);
        } else {
            abstractC0861c.zzc.a(c0852b);
            abstractC0861c.onConnectionFailed(c0852b);
        }
    }

    @Override // com.google.android.gms.common.internal.O
    public final boolean d() {
        this.g.zzc.a(C0852b.e);
        return true;
    }
}
