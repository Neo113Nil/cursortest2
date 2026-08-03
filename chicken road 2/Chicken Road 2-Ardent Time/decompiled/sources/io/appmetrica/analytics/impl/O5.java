package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O5 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9;
        android.os.Bundle readBundle = parcel.readBundle(io.appmetrica.analytics.impl.B6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i2 = readBundle.getInt("CounterReport.Source");
            io.appmetrica.analytics.impl.EnumC0533m9[] values = io.appmetrica.analytics.impl.EnumC0533m9.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC0533m9 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
                    break;
                }
                enumC0533m9 = values[i3];
                if (enumC0533m9.f6419a == i2) {
                    break;
                }
                i3++;
            }
        } else {
            enumC0533m9 = null;
        }
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", "", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = readBundle.getInt("CounterReport.Type", -1);
        p5.f4817e = readBundle.getInt("CounterReport.CustomType");
        p5.f4814b = io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        p5.f4815c = readBundle.getString("CounterReport.Environment");
        p5.f4813a = readBundle.getString("CounterReport.Event");
        p5.f4818f = io.appmetrica.analytics.impl.P5.a(readBundle);
        p5.f4819g = readBundle.getInt("CounterReport.TRUNCATED");
        p5.f4820h = readBundle.getString("CounterReport.ProfileID");
        p5.f4821i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        p5.f4822j = readBundle.getLong("CounterReport.CreationTimestamp");
        p5.f4823k = io.appmetrica.analytics.impl.EnumC0302da.a(java.lang.Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        p5.f4824l = enumC0533m9;
        p5.f4825m = readBundle.getBundle("CounterReport.Payload");
        p5.f4826n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? java.lang.Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        p5.f4827o = readBundle.containsKey("CounterReport.OpenId") ? java.lang.Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        p5.f4828p = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return p5;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.impl.P5[i2];
    }
}
