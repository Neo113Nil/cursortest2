package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3304nG extends AbstractC1964Eh<C3304nG> implements Comparable<C3304nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C3304nG> list, List<C3304nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C3304nG(int i, C3453pg c3453pg, int i2, C18489i c18489i, int i3, String str) {
        super(i, c3453pg, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = C18479h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C3449pc) c18489i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c18489i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c18489i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C18479h.A02(super.A02, list.get(bestLanguageIndex), c18489i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = C18479h.A00(super.A02.A0E, ((C3449pc) c18489i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C18479h.A02(super.A02, str, C18479h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c18489i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C18479h.A0S(i3, c18489i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3304nG c3304nG) {
        AbstractC3342ns A06 = AbstractC3342ns.A01().A09(this.A08, c3304nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3304nG.A00), AbstractC3492qK.A03().A06()).A06(this.A01, c3304nG.A01).A06(this.A02, c3304nG.A02).A09(this.A06, c3304nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3304nG.A07), this.A01 == 0 ? AbstractC3492qK.A03() : AbstractC3492qK.A03().A06()).A06(this.A03, c3304nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c3304nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C3304nG> A02(int i, C3453pg c3453pg, C18489i c18489i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c3453pg.A01; i2++) {
            A01.A04(new C3304nG(i, c3453pg, i2, c18489i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1964Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3304nG c3304nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1964Eh
    public final int A08() {
        return this.A04;
    }
}
