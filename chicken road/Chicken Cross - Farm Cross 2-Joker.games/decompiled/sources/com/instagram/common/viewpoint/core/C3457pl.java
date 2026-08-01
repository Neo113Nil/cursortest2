package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3457pl implements AnonymousClass24 {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C3498qS A06 = C3498qS.A08;
    public static String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final String A0D = C5C.A0h(0);
    public static final String A0A = C5C.A0h(1);
    public static final String A0C = C5C.A0h(2);
    public static final String A0B = C5C.A0h(3);
    public static final String A09 = C5C.A0h(4);
    public static final AnonymousClass23<C3457pl> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pp
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C3457pl A01;
            A01 = C3457pl.A01(bundle);
            return A01;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3457pl A01(Bundle bundle) {
        int i = bundle.getInt(A0D, 0);
        long j = bundle.getLong(A0A, -9223372036854775807L);
        long j2 = bundle.getLong(A0C, 0L);
        boolean z = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C3498qS A6f = bundle2 != null ? C3498qS.A09.A6f(bundle2) : C3498qS.A08;
        C3457pl c3457pl = new C3457pl();
        c3457pl.A0G(null, null, i, j, j2, A6f, z);
        return c3457pl;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i) {
        return this.A06.A07(i).A00;
    }

    public final int A05(int i) {
        return this.A06.A07(i).A04();
    }

    public final int A06(int i, int i2) {
        return this.A06.A07(i).A05(i2);
    }

    public final int A07(long j) {
        return this.A06.A05(j, this.A01);
    }

    public final int A08(long j) {
        return this.A06.A06(j, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return C5C.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i) {
        return this.A06.A07(i).A03;
    }

    public final long A0E(int i, int i2) {
        C3499qT A072 = this.A06.A07(i);
        if (A072.A00 != -1) {
            return A072.A06[i2];
        }
        return -9223372036854775807L;
    }

    public final C3457pl A0F(Object obj, Object obj2, int i, long j, long j2) {
        return A0G(obj, obj2, i, j, j2, C3498qS.A08, false);
    }

    public final C3457pl A0G(Object obj, Object obj2, int i, long j, long j2, C3498qS c3498qS, boolean z) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = c3498qS;
        this.A05 = z;
        return this;
    }

    public final boolean A0H(int i) {
        return !this.A06.A07(i).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i, int i2) {
        C3499qT c3499qT = this.A06.A05[i];
        return (c3499qT.A00 == -1 || c3499qT.A05[i2] == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C3457pl c3457pl = (C3457pl) obj;
        if (C5C.A1E(this.A03, c3457pl.A03) && C5C.A1E(this.A04, c3457pl.A04) && this.A00 == c3457pl.A00 && this.A01 == c3457pl.A01 && this.A02 == c3457pl.A02 && this.A05 == c3457pl.A05 && C5C.A1E(this.A06, c3457pl.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            Object obj = this.A04;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            i = obj.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
