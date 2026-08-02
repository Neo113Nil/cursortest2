package com.google.android.gms.common;

/* loaded from: classes4.dex */
public final class G extends H {
    public final q d;

    public /* synthetic */ G(q qVar) {
        super(null, false, null);
        this.d = qVar;
    }

    @Override // com.google.android.gms.common.H
    public final void a() {
        try {
            this.d.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
