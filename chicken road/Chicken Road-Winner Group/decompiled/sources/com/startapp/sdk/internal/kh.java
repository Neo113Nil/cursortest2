package com.startapp.sdk.internal;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class kh extends TelephonyManager$CellInfoCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh f3963a;

    public kh(mh mhVar) {
        this.f3963a = mhVar;
    }

    public final void onCellInfo(List list) {
        this.f3963a.b(false);
    }
}
