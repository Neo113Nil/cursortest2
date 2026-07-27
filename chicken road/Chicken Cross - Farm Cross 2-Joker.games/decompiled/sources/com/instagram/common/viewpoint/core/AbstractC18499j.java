package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC18499j implements InterfaceC3302nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C3490qI[] A04;
    public final int A05;
    public final C3453pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC18499j(C3453pg c3453pg, int[] iArr, int i) {
        AbstractC17143y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C3453pg) AbstractC17143y.A01(c3453pg);
        this.A05 = iArr.length;
        this.A04 = new C3490qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C3490qI[] c3490qIArr = this.A04;
            int i3 = iArr[i2];
            c3490qIArr[i2] = c3453pg.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC18499j.A07((C3490qI) obj, (C3490qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c3453pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C3490qI c3490qI, C3490qI c3490qI2) {
        return c3490qI2.A05 - c3490qI.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3302nE
    public void A5x() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3302nE
    public void A6K() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1973Eq
    public final C3490qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1973Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3302nE
    public final C3490qI A92() {
        return this.A04[A93()];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1973Eq
    public final C3453pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1973Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3302nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC18499j abstractC18499j = (AbstractC18499j) obj;
        return this.A06 == abstractC18499j.A06 && Arrays.equals(this.A07, abstractC18499j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1973Eq
    public final int length() {
        return this.A07.length;
    }
}
