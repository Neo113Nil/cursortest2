package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4650a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R8 f4651b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.O8 f4652c;

    public M8(io.appmetrica.analytics.impl.R8 r8, int i2) {
        this.f4650a = i2;
        this.f4651b = r8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        io.appmetrica.analytics.impl.O8 o8;
        int i2;
        int i3;
        byte[] bArr;
        io.appmetrica.analytics.impl.R8 r8 = this.f4651b;
        r8.getClass();
        try {
            bArr = r8.f4899c.get("event_hashes");
        } catch (java.lang.Throwable unused) {
            io.appmetrica.analytics.impl.P8 p8 = r8.f4897a;
            r8.f4898b.getClass();
            io.appmetrica.analytics.impl.C0740u9 c0740u9 = new io.appmetrica.analytics.impl.C0740u9();
            p8.getClass();
            o8 = new io.appmetrica.analytics.impl.O8(c0740u9.f6900a, c0740u9.f6901b, c0740u9.f6902c, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.hashSetFromIntArray(c0740u9.f6903d));
        }
        if (bArr != null && bArr.length != 0) {
            io.appmetrica.analytics.impl.P8 p82 = r8.f4897a;
            io.appmetrica.analytics.impl.C0740u9 state = r8.f4898b.toState(bArr);
            p82.getClass();
            o8 = new io.appmetrica.analytics.impl.O8(state.f6900a, state.f6901b, state.f6902c, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.hashSetFromIntArray(state.f6903d));
            this.f4652c = o8;
            i2 = o8.f4766c;
            i3 = this.f4650a;
            if (i2 == i3) {
                o8.f4766c = i3;
                o8.f4767d = 0;
                io.appmetrica.analytics.impl.R8 r82 = this.f4651b;
                io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper = r82.f4899c;
                io.appmetrica.analytics.impl.Q8 q8 = r82.f4898b;
                r82.f4897a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((io.appmetrica.analytics.impl.Q8) io.appmetrica.analytics.impl.P8.a(o8)));
                return;
            }
            return;
        }
        io.appmetrica.analytics.impl.P8 p83 = r8.f4897a;
        r8.f4898b.getClass();
        io.appmetrica.analytics.impl.C0740u9 c0740u92 = new io.appmetrica.analytics.impl.C0740u9();
        p83.getClass();
        o8 = new io.appmetrica.analytics.impl.O8(c0740u92.f6900a, c0740u92.f6901b, c0740u92.f6902c, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.hashSetFromIntArray(c0740u92.f6903d));
        this.f4652c = o8;
        i2 = o8.f4766c;
        i3 = this.f4650a;
        if (i2 == i3) {
        }
    }
}
