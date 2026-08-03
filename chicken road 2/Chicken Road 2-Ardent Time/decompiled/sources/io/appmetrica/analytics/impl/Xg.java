package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xg extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M8 f5305b;

    public Xg(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, x4.j());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.EnumC0302da enumC0302da;
        if (!android.text.TextUtils.isEmpty(p5.getName())) {
            io.appmetrica.analytics.impl.M8 m8 = this.f5305b;
            java.lang.String name = p5.getName();
            if (m8.f4652c == null) {
                m8.a();
            }
            int hashCode = name.hashCode();
            if (m8.f4652c.f4765b.contains(java.lang.Integer.valueOf(hashCode))) {
                enumC0302da = io.appmetrica.analytics.impl.EnumC0302da.NON_FIRST_OCCURENCE;
            } else {
                io.appmetrica.analytics.impl.O8 o8 = m8.f4652c;
                io.appmetrica.analytics.impl.EnumC0302da enumC0302da2 = o8.f4764a ? io.appmetrica.analytics.impl.EnumC0302da.FIRST_OCCURRENCE : io.appmetrica.analytics.impl.EnumC0302da.UNKNOWN;
                if (o8.f4767d < 1000) {
                    o8.f4765b.add(java.lang.Integer.valueOf(hashCode));
                    o8.f4767d++;
                } else {
                    o8.f4764a = false;
                }
                io.appmetrica.analytics.impl.R8 r8 = m8.f4651b;
                io.appmetrica.analytics.impl.O8 o82 = m8.f4652c;
                io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper = r8.f4899c;
                io.appmetrica.analytics.impl.Q8 q8 = r8.f4898b;
                r8.f4897a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((io.appmetrica.analytics.impl.Q8) io.appmetrica.analytics.impl.P8.a(o82)));
                enumC0302da = enumC0302da2;
            }
            p5.f4823k = enumC0302da;
        }
        return false;
    }

    public Xg(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.M8 m8) {
        super(x4);
        this.f5305b = m8;
    }
}
