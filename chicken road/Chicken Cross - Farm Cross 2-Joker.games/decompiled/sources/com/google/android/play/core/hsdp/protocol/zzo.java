package com.google.android.play.core.hsdp.protocol;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzo implements Parcelable.Creator {
    zzo() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ReportRequest(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportRequest[i];
    }
}
