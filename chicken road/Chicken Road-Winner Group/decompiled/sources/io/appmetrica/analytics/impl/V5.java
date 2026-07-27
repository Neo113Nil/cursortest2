package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class V5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0851t9 enumC0851t9;
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i3 = readBundle.getInt("CounterReport.Source");
            EnumC0851t9[] values = EnumC0851t9.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    enumC0851t9 = EnumC0851t9.NATIVE;
                    break;
                }
                enumC0851t9 = values[i4];
                if (enumC0851t9.f8357a == i3) {
                    break;
                }
                i4++;
            }
        } else {
            enumC0851t9 = null;
        }
        W5 w5 = new W5("", "", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = readBundle.getInt("CounterReport.Type", -1);
        w5.f6779e = readBundle.getInt("CounterReport.CustomType");
        w5.f6776b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        w5.f6777c = readBundle.getString("CounterReport.Environment");
        w5.f6775a = readBundle.getString("CounterReport.Event");
        w5.f = W5.a(readBundle);
        w5.f6780g = readBundle.getInt("CounterReport.TRUNCATED");
        w5.f6781h = readBundle.getString("CounterReport.ProfileID");
        w5.f6782i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        w5.f6783j = readBundle.getLong("CounterReport.CreationTimestamp");
        w5.f6784k = EnumC0619ka.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        w5.f6785l = enumC0851t9;
        w5.f6786m = readBundle.getBundle("CounterReport.Payload");
        w5.f6787n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        w5.f6788o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        w5.f6789p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return w5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new W5[i3];
    }
}
