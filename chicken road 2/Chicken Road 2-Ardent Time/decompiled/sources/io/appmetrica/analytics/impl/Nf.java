package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nf implements io.appmetrica.analytics.impl.InterfaceC0729to {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        io.appmetrica.analytics.impl.C0566ng c0566ng;
        int ordinal;
        if (!android.text.TextUtils.isEmpty(n8.f4712b)) {
            try {
                byte[] decode = android.util.Base64.decode(n8.f4712b, 0);
                if (decode != null && decode.length != 0) {
                    c0566ng = new io.appmetrica.analytics.impl.C0566ng(decode);
                    io.appmetrica.analytics.impl.Vf vf = new io.appmetrica.analytics.impl.Vf();
                    java.lang.String str = c0566ng.f6533a;
                    vf.f5167a = str != null ? new byte[0] : str.getBytes();
                    vf.f5169c = c0566ng.f6534b;
                    vf.f5168b = c0566ng.f6535c;
                    ordinal = c0566ng.f6536d.ordinal();
                    int i2 = 1;
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 0;
                        }
                    }
                    vf.f5170d = i2;
                    return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(vf);
                }
                c0566ng = null;
                io.appmetrica.analytics.impl.Vf vf2 = new io.appmetrica.analytics.impl.Vf();
                java.lang.String str2 = c0566ng.f6533a;
                vf2.f5167a = str2 != null ? new byte[0] : str2.getBytes();
                vf2.f5169c = c0566ng.f6534b;
                vf2.f5168b = c0566ng.f6535c;
                ordinal = c0566ng.f6536d.ordinal();
                int i22 = 1;
                if (ordinal != 1) {
                }
                vf2.f5170d = i22;
                return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(vf2);
            } catch (java.lang.Throwable unused) {
            }
        }
        return new byte[0];
    }
}
