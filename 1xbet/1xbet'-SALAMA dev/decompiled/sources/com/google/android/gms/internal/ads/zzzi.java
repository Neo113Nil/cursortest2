package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzzi extends IOException {
    public zzzi(Throwable th) {
        super(AbstractC0486a1.h("Unexpected ", th.getClass().getSimpleName(), th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
