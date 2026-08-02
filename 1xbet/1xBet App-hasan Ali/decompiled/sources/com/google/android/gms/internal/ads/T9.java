package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class T9 extends D5 implements U9 {
    @Override // com.google.android.gms.internal.ads.U9
    public final void x1(List list) {
        Parcel N5 = N();
        N5.writeTypedList(list);
        d1(N5, 1);
    }
}
