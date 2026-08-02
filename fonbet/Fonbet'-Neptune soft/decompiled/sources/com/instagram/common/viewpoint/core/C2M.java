package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2M {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2M(C2L c2l) {
        boolean z;
        boolean z2;
        UUID uuid;
        Uri uri;
        Map<String, String> map;
        Map<String, String> map2;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Integer> list;
        List<Integer> list2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Uri uri2;
        z = c2l.A04;
        if (z) {
            uri2 = c2l.A00;
            if (uri2 == null) {
                z2 = false;
                C3M.A08(z2);
                uuid = c2l.A03;
                this.A05 = (UUID) C3M.A01(uuid);
                this.A06 = this.A05;
                uri = c2l.A00;
                this.A00 = uri;
                map = c2l.A02;
                this.A04 = map;
                map2 = c2l.A02;
                this.A03 = map2;
                z3 = c2l.A05;
                this.A08 = z3;
                z4 = c2l.A04;
                this.A07 = z4;
                z5 = c2l.A06;
                this.A09 = z5;
                list = c2l.A01;
                this.A02 = list;
                list2 = c2l.A01;
                this.A01 = list2;
                bArr = c2l.A07;
                if (bArr == null) {
                    bArr3 = c2l.A07;
                    bArr4 = c2l.A07;
                    bArr2 = Arrays.copyOf(bArr3, bArr4.length);
                } else {
                    bArr2 = null;
                }
                this.A0A = bArr2;
            }
        }
        z2 = true;
        C3M.A08(z2);
        uuid = c2l.A03;
        this.A05 = (UUID) C3M.A01(uuid);
        this.A06 = this.A05;
        uri = c2l.A00;
        this.A00 = uri;
        map = c2l.A02;
        this.A04 = map;
        map2 = c2l.A02;
        this.A03 = map2;
        z3 = c2l.A05;
        this.A08 = z3;
        z4 = c2l.A04;
        this.A07 = z4;
        z5 = c2l.A06;
        this.A09 = z5;
        list = c2l.A01;
        this.A02 = list;
        list2 = c2l.A01;
        this.A01 = list2;
        bArr = c2l.A07;
        if (bArr == null) {
        }
        this.A0A = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2M)) {
            return false;
        }
        C2M c2m = (C2M) obj;
        if (this.A05.equals(c2m.A05) && AbstractC01424a.A1E(this.A00, c2m.A00) && AbstractC01424a.A1E(this.A03, c2m.A03) && this.A08 == c2m.A08 && this.A07 == c2m.A07 && this.A09 == c2m.A09 && this.A01.equals(c2m.A01) && Arrays.equals(this.A0A, c2m.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
