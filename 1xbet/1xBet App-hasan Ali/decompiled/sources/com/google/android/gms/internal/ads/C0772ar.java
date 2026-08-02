package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772ar {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C1392ol c1392ol) {
        C0905dr c0905dr;
        if (str != null) {
            try {
                try {
                    c0905dr = AbstractC0952et.f(new Dp(8, new ByteArrayInputStream(Base64.decode(str, 11))));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e3) {
                T2.G.m("Failed to get keysethandle".concat(e3.toString()));
                P2.o.f4767B.f4774g.i("CryptoUtils.getHandle", e3);
                c0905dr = null;
            }
            if (c0905dr != null) {
                try {
                    byte[] a5 = ((InterfaceC0911dx) c0905dr.j()).a(bArr, bArr2);
                    c1392ol.f14844a.put("ds", "1");
                    return new String(a5, "UTF-8");
                } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e5) {
                    T2.G.m("Failed to decrypt ".concat(e5.toString()));
                    P2.o.f4767B.f4774g.i("CryptoUtils.decrypt", e5);
                    c1392ol.f14844a.put("dsf", e5.toString());
                }
            }
        }
        return null;
    }
}
