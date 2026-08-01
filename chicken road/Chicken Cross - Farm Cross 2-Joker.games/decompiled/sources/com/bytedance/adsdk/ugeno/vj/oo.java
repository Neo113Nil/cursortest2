package com.bytedance.adsdk.ugeno.vj;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
class oo {
    static final /* synthetic */ boolean gm = true;
    private final com.bytedance.adsdk.ugeno.vj.pcc oo;
    int[] pcc;
    long[] sf;
    private boolean[] vj;
    private long[] wh;

    int pcc(long j) {
        return (int) j;
    }

    int sf(long j) {
        return (int) (j >> 32);
    }

    long sf(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    oo(com.bytedance.adsdk.ugeno.vj.pcc pccVar) {
        this.oo = pccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] pcc(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        List<sf> sf2 = sf(flexItemCount);
        sf sfVar = new sf();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.vj.sf)) {
            sfVar.sf = ((com.bytedance.adsdk.ugeno.vj.sf) layoutParams).gm();
        } else {
            sfVar.sf = 1;
        }
        if (i == -1 || i == flexItemCount) {
            sfVar.pcc = flexItemCount;
        } else if (i < this.oo.getFlexItemCount()) {
            sfVar.pcc = i;
            while (i < flexItemCount) {
                sf2.get(i).pcc++;
                i++;
            }
        } else {
            sfVar.pcc = flexItemCount;
        }
        sf2.add(sfVar);
        return pcc(flexItemCount + 1, sf2, sparseIntArray);
    }

    int[] pcc(SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        return pcc(flexItemCount, sf(flexItemCount), sparseIntArray);
    }

    private List<sf> sf(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) this.oo.pcc(i2).getLayoutParams();
            sf sfVar2 = new sf();
            sfVar2.sf = sfVar.gm();
            sfVar2.pcc = i2;
            arrayList.add(sfVar2);
        }
        return arrayList;
    }

    boolean sf(SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View pcc2 = this.oo.pcc(i);
            if (pcc2 != null && ((com.bytedance.adsdk.ugeno.vj.sf) pcc2.getLayoutParams()).gm() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] pcc(int i, List<sf> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (sf sfVar : list) {
            iArr[i2] = sfVar.pcc;
            sparseIntArray.append(sfVar.pcc, sfVar.sf);
            i2++;
        }
        return iArr;
    }

    void pcc(pcc pccVar, int i, int i2) {
        pcc(pccVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<gm>) null);
    }

    void sf(pcc pccVar, int i, int i2) {
        pcc(pccVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<gm>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void pcc(pcc pccVar, int i, int i2, int i3, int i4, int i5, List<gm> list) {
        int i6;
        pcc pccVar2;
        int i7;
        int i8;
        int i9;
        List<gm> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean pcc2 = this.oo.pcc();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<gm> arrayList = list == null ? new ArrayList() : list;
        pccVar.pcc = arrayList;
        int i21 = i20 == -1 ? 1 : 0;
        int pcc3 = pcc(pcc2);
        int sf2 = sf(pcc2);
        int gm2 = gm(pcc2);
        int oo = oo(pcc2);
        gm gmVar = new gm();
        int i22 = i4;
        gmVar.jr = i22;
        int i23 = sf2 + pcc3;
        gmVar.vj = i23;
        int flexItemCount = this.oo.getFlexItemCount();
        int i24 = i21;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i22 >= flexItemCount) {
                i6 = i27;
                pccVar2 = pccVar;
                break;
            }
            View sf3 = this.oo.sf(i22);
            if (sf3 == null) {
                if (pcc(i22, flexItemCount, gmVar)) {
                    pcc(arrayList, gmVar, i22, i26);
                }
            } else if (sf3.getVisibility() == 8) {
                gmVar.vy++;
                gmVar.kj++;
                if (pcc(i22, flexItemCount, gmVar)) {
                    pcc(arrayList, gmVar, i22, i26);
                }
            } else {
                if (sf3 instanceof CompoundButton) {
                    pcc((CompoundButton) sf3);
                }
                com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf3.getLayoutParams();
                int i29 = flexItemCount;
                if (sfVar.wh() == 4) {
                    gmVar.gbb.add(Integer.valueOf(i22));
                }
                int pcc4 = pcc(sfVar, pcc2);
                if (sfVar.tmg() != -1.0f && mode == 1073741824) {
                    pcc4 = Math.round(size * sfVar.tmg());
                }
                if (pcc2) {
                    int pcc5 = this.oo.pcc(i18, i23 + gm(sfVar, true) + oo(sfVar, true), pcc4);
                    i7 = size;
                    i8 = mode;
                    int sf4 = this.oo.sf(i19, gm2 + oo + vj(sfVar, true) + wh(sfVar, true) + i26, sf(sfVar, true));
                    sf3.measure(pcc5, sf4);
                    pcc(i22, pcc5, sf4, sf3);
                    i9 = pcc5;
                } else {
                    i7 = size;
                    i8 = mode;
                    int pcc6 = this.oo.pcc(i19, gm2 + oo + vj(sfVar, false) + wh(sfVar, false) + i26, sf(sfVar, false));
                    int sf5 = this.oo.sf(i18, gm(sfVar, false) + i23 + oo(sfVar, false), pcc4);
                    sf3.measure(pcc6, sf5);
                    pcc(i22, pcc6, sf5, sf3);
                    i9 = sf5;
                }
                pcc(sf3, i22);
                i27 = View.combineMeasuredStates(i27, sf3.getMeasuredState());
                int i30 = i26;
                int i31 = i23;
                gm gmVar2 = gmVar;
                int i32 = i22;
                list2 = arrayList;
                int i33 = i9;
                if (pcc(sf3, i8, i7, gmVar.vj, oo(sfVar, pcc2) + pcc(sf3, pcc2) + gm(sfVar, pcc2), sfVar, i32, i28, arrayList.size())) {
                    if (gmVar2.sf() > 0) {
                        pcc(list2, gmVar2, i32 > 0 ? i32 - 1 : 0, i30);
                        i26 = gmVar2.qf + i30;
                    } else {
                        i26 = i30;
                    }
                    if (pcc2) {
                        if (sfVar.sf() == -1) {
                            com.bytedance.adsdk.ugeno.vj.pcc pccVar3 = this.oo;
                            i10 = i2;
                            i22 = i32;
                            view = sf3;
                            view.measure(i33, pccVar3.sf(i10, pccVar3.getPaddingTop() + this.oo.getPaddingBottom() + sfVar.gbb() + sfVar.dax() + i26, sfVar.sf()));
                            pcc(view, i22);
                        } else {
                            i10 = i2;
                            view = sf3;
                            i22 = i32;
                        }
                    } else {
                        i10 = i2;
                        view = sf3;
                        i22 = i32;
                        if (sfVar.pcc() == -1) {
                            com.bytedance.adsdk.ugeno.vj.pcc pccVar4 = this.oo;
                            view.measure(pccVar4.pcc(i10, pccVar4.getPaddingLeft() + this.oo.getPaddingRight() + sfVar.hc() + sfVar.jr() + i26, sfVar.pcc()), i33);
                            pcc(view, i22);
                        }
                    }
                    gmVar = new gm();
                    i12 = 1;
                    gmVar.kj = 1;
                    i11 = i31;
                    gmVar.vj = i11;
                    gmVar.jr = i22;
                    i14 = Integer.MIN_VALUE;
                    i13 = 0;
                } else {
                    i10 = i2;
                    view = sf3;
                    i22 = i32;
                    gmVar = gmVar2;
                    i11 = i31;
                    i12 = 1;
                    gmVar.kj++;
                    i13 = i28 + 1;
                    i26 = i30;
                    i14 = i25;
                }
                gmVar.nac = (gmVar.nac ? 1 : 0) | (sfVar.oo() != 0.0f ? i12 : 0);
                gmVar.lu = (gmVar.lu ? 1 : 0) | (sfVar.vj() != 0.0f ? i12 : 0);
                int[] iArr = this.pcc;
                if (iArr != null) {
                    iArr[i22] = list2.size();
                }
                gmVar.vj += pcc(view, pcc2) + gm(sfVar, pcc2) + oo(sfVar, pcc2);
                gmVar.ork += sfVar.oo();
                gmVar.vh += sfVar.vj();
                this.oo.pcc(view, i22, i13, gmVar);
                int max = Math.max(i14, sf(view, pcc2) + vj(sfVar, pcc2) + wh(sfVar, pcc2) + this.oo.pcc(view));
                gmVar.qf = Math.max(gmVar.qf, max);
                if (pcc2) {
                    if (this.oo.getFlexWrap() != 2) {
                        gmVar.tmg = Math.max(gmVar.tmg, view.getBaseline() + sfVar.gbb());
                    } else {
                        gmVar.tmg = Math.max(gmVar.tmg, (view.getMeasuredHeight() - view.getBaseline()) + sfVar.dax());
                    }
                }
                i15 = i29;
                if (pcc(i22, i15, gmVar)) {
                    pcc(list2, gmVar, i22, i26);
                    i26 += gmVar.qf;
                }
                i16 = i5;
                if (i16 == -1 || list2.size() <= 0 || list2.get(list2.size() - i12).dax < i16 || i22 < i16 || i24 != 0) {
                    i17 = i3;
                } else {
                    i26 = -gmVar.pcc();
                    i17 = i3;
                    i24 = i12;
                }
                if (i26 > i17 && i24 != 0) {
                    pccVar2 = pccVar;
                    i6 = i27;
                    break;
                }
                i28 = i13;
                i25 = max;
                i22++;
                i18 = i;
                flexItemCount = i15;
                i19 = i10;
                i23 = i11;
                arrayList = list2;
                size = i7;
                i20 = i16;
                mode = i8;
            }
            i7 = size;
            i8 = mode;
            i10 = i19;
            i16 = i20;
            list2 = arrayList;
            i11 = i23;
            i15 = flexItemCount;
            i22++;
            i18 = i;
            flexItemCount = i15;
            i19 = i10;
            i23 = i11;
            arrayList = list2;
            size = i7;
            i20 = i16;
            mode = i8;
        }
        pccVar2.sf = i6;
    }

    private void pcc(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) compoundButton.getLayoutParams();
        int qf = sfVar.qf();
        int kj = sfVar.kj();
        Drawable pcc2 = com.bytedance.adsdk.ugeno.qf.vj.pcc(compoundButton);
        int minimumWidth = pcc2 == null ? 0 : pcc2.getMinimumWidth();
        int minimumHeight = pcc2 != null ? pcc2.getMinimumHeight() : 0;
        if (qf == -1) {
            qf = minimumWidth;
        }
        sfVar.pcc(qf);
        if (kj == -1) {
            kj = minimumHeight;
        }
        sfVar.sf(kj);
    }

    private int pcc(boolean z) {
        if (z) {
            return this.oo.getPaddingStart();
        }
        return this.oo.getPaddingTop();
    }

    private int sf(boolean z) {
        if (z) {
            return this.oo.getPaddingEnd();
        }
        return this.oo.getPaddingBottom();
    }

    private int gm(boolean z) {
        if (z) {
            return this.oo.getPaddingTop();
        }
        return this.oo.getPaddingStart();
    }

    private int oo(boolean z) {
        if (z) {
            return this.oo.getPaddingBottom();
        }
        return this.oo.getPaddingEnd();
    }

    private int pcc(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int sf(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int pcc(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.pcc();
        }
        return sfVar.sf();
    }

    private int sf(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.sf();
        }
        return sfVar.pcc();
    }

    private int gm(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.hc();
        }
        return sfVar.gbb();
    }

    private int oo(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.jr();
        }
        return sfVar.dax();
    }

    private int vj(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.gbb();
        }
        return sfVar.hc();
    }

    private int wh(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.dax();
        }
        return sfVar.jr();
    }

    private boolean pcc(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i5, int i6, int i7) {
        if (this.oo.getFlexWrap() == 0) {
            return false;
        }
        if (sfVar.vh()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.oo.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int pcc2 = this.oo.pcc(view, i5, i6);
        if (pcc2 > 0) {
            i4 += pcc2;
        }
        return i2 < i3 + i4;
    }

    private boolean pcc(int i, int i2, gm gmVar) {
        return i == i2 - 1 && gmVar.sf() != 0;
    }

    private void pcc(List<gm> list, gm gmVar, int i, int i2) {
        gmVar.hc = i2;
        this.oo.pcc(gmVar);
        gmVar.dax = i;
        list.add(gmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < sfVar.qf()) {
            measuredWidth = sfVar.qf();
        } else if (measuredWidth > sfVar.vy()) {
            measuredWidth = sfVar.vy();
        } else {
            z = false;
            if (measuredHeight >= sfVar.kj()) {
                measuredHeight = sfVar.kj();
            } else if (measuredHeight > sfVar.ork()) {
                measuredHeight = sfVar.ork();
            } else {
                z2 = z;
            }
            if (z2) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            pcc(i, makeMeasureSpec, makeMeasureSpec2, view);
            return;
        }
        z = true;
        if (measuredHeight >= sfVar.kj()) {
        }
        if (z2) {
        }
    }

    void pcc(int i, int i2) {
        pcc(i, i2, 0);
    }

    void pcc(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        gm(this.oo.getFlexItemCount());
        if (i3 >= this.oo.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.oo.getFlexDirection();
        int flexDirection2 = this.oo.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.oo.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.oo.getPaddingLeft();
            paddingRight = this.oo.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.oo.getLargestMainSize();
            }
            paddingLeft = this.oo.getPaddingTop();
            paddingRight = this.oo.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.pcc;
        List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            gm gmVar = flexLinesInternal.get(i5);
            if (gmVar.vj < size && gmVar.nac) {
                pcc(i, i2, gmVar, size, i4, false);
            } else if (gmVar.vj > size && gmVar.lu) {
                sf(i, i2, gmVar, size, i4, false);
            }
        }
    }

    private void gm(int i) {
        boolean[] zArr = this.vj;
        if (zArr == null) {
            this.vj = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.vj = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void pcc(int i, int i2, gm gmVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        double d;
        int i7;
        double d2;
        float f = 0.0f;
        if (gmVar.ork <= 0.0f || i3 < gmVar.vj) {
            return;
        }
        int i8 = gmVar.vj;
        float f2 = (i3 - gmVar.vj) / gmVar.ork;
        gmVar.vj = i4 + gmVar.wh;
        if (!z) {
            gmVar.qf = Integer.MIN_VALUE;
        }
        int i9 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i10 = 0;
        while (i9 < gmVar.kj) {
            int i11 = gmVar.jr + i9;
            View sf2 = this.oo.sf(i11);
            if (sf2 == null || sf2.getVisibility() == 8) {
                i5 = i8;
            } else {
                com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                int flexDirection = this.oo.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i12 = i8;
                    int measuredWidth = sf2.getMeasuredWidth();
                    long[] jArr = this.wh;
                    if (jArr != null) {
                        measuredWidth = pcc(jArr[i11]);
                    }
                    int measuredHeight = sf2.getMeasuredHeight();
                    long[] jArr2 = this.wh;
                    i5 = i12;
                    if (jArr2 != null) {
                        measuredHeight = sf(jArr2[i11]);
                    }
                    if (!this.vj[i11] && sfVar.oo() > 0.0f) {
                        float oo = measuredWidth + (sfVar.oo() * f2);
                        if (i9 == gmVar.kj - 1) {
                            oo += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(oo);
                        if (round > sfVar.vy()) {
                            round = sfVar.vy();
                            this.vj[i11] = true;
                            gmVar.ork -= sfVar.oo();
                            z2 = true;
                        } else {
                            f3 += oo - round;
                            double d3 = f3;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            }
                            f3 = (float) d;
                        }
                        int sf3 = sf(i2, sfVar, gmVar.hc);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        sf2.measure(makeMeasureSpec, sf3);
                        int measuredWidth2 = sf2.getMeasuredWidth();
                        int measuredHeight2 = sf2.getMeasuredHeight();
                        pcc(i11, makeMeasureSpec, sf3, sf2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, measuredHeight + sfVar.gbb() + sfVar.dax() + this.oo.pcc(sf2));
                    gmVar.vj += measuredWidth + sfVar.hc() + sfVar.jr();
                    i6 = max;
                } else {
                    int measuredHeight3 = sf2.getMeasuredHeight();
                    long[] jArr3 = this.wh;
                    if (jArr3 != null) {
                        measuredHeight3 = sf(jArr3[i11]);
                    }
                    int measuredWidth3 = sf2.getMeasuredWidth();
                    long[] jArr4 = this.wh;
                    if (jArr4 != null) {
                        measuredWidth3 = pcc(jArr4[i11]);
                    }
                    if (this.vj[i11] || sfVar.oo() <= f) {
                        i7 = i8;
                    } else {
                        float oo2 = measuredHeight3 + (sfVar.oo() * f2);
                        if (i9 == gmVar.kj - 1) {
                            oo2 += f3;
                            f3 = f;
                        }
                        int round2 = Math.round(oo2);
                        if (round2 > sfVar.ork()) {
                            round2 = sfVar.ork();
                            this.vj[i11] = true;
                            gmVar.ork -= sfVar.oo();
                            i7 = i8;
                            z2 = true;
                        } else {
                            f3 += oo2 - round2;
                            i7 = i8;
                            double d4 = f3;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            }
                            f3 = (float) d2;
                        }
                        int pcc2 = pcc(i, sfVar, gmVar.hc);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        sf2.measure(pcc2, makeMeasureSpec2);
                        measuredWidth3 = sf2.getMeasuredWidth();
                        int measuredHeight4 = sf2.getMeasuredHeight();
                        pcc(i11, pcc2, makeMeasureSpec2, sf2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i6 = Math.max(i10, measuredWidth3 + sfVar.hc() + sfVar.jr() + this.oo.pcc(sf2));
                    gmVar.vj += measuredHeight3 + sfVar.gbb() + sfVar.dax();
                    i5 = i7;
                }
                gmVar.qf = Math.max(gmVar.qf, i6);
                i10 = i6;
            }
            i9++;
            i8 = i5;
            f = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == gmVar.vj) {
            return;
        }
        pcc(i, i2, gmVar, i3, i4, true);
    }

    private void sf(int i, int i2, gm gmVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = gmVar.vj;
        float f = 0.0f;
        if (gmVar.vh <= 0.0f || i3 > gmVar.vj) {
            return;
        }
        float f2 = (gmVar.vj - i3) / gmVar.vh;
        gmVar.vj = i4 + gmVar.wh;
        if (!z) {
            gmVar.qf = Integer.MIN_VALUE;
        }
        int i8 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i9 = 0;
        while (i8 < gmVar.kj) {
            int i10 = gmVar.jr + i8;
            View sf2 = this.oo.sf(i10);
            if (sf2 == null || sf2.getVisibility() == 8) {
                i5 = i8;
            } else {
                com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                int flexDirection = this.oo.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i8;
                    int measuredWidth = sf2.getMeasuredWidth();
                    long[] jArr = this.wh;
                    if (jArr != null) {
                        measuredWidth = pcc(jArr[i10]);
                    }
                    int measuredHeight = sf2.getMeasuredHeight();
                    long[] jArr2 = this.wh;
                    if (jArr2 != null) {
                        measuredHeight = sf(jArr2[i10]);
                    }
                    if (!this.vj[i10] && sfVar.vj() > 0.0f) {
                        float vj = measuredWidth - (sfVar.vj() * f2);
                        if (i5 == gmVar.kj - 1) {
                            vj += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(vj);
                        if (round < sfVar.qf()) {
                            round = sfVar.qf();
                            this.vj[i10] = true;
                            gmVar.vh -= sfVar.vj();
                            z2 = true;
                        } else {
                            f3 += vj - round;
                            double d = f3;
                            if (d > 1.0d) {
                                round++;
                                f3 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f3 += 1.0f;
                            }
                        }
                        int sf3 = sf(i2, sfVar, gmVar.hc);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        sf2.measure(makeMeasureSpec, sf3);
                        int measuredWidth2 = sf2.getMeasuredWidth();
                        int measuredHeight2 = sf2.getMeasuredHeight();
                        pcc(i10, makeMeasureSpec, sf3, sf2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i9, measuredHeight + sfVar.gbb() + sfVar.dax() + this.oo.pcc(sf2));
                    gmVar.vj += measuredWidth + sfVar.hc() + sfVar.jr();
                    i6 = max;
                } else {
                    int measuredHeight3 = sf2.getMeasuredHeight();
                    long[] jArr3 = this.wh;
                    if (jArr3 != null) {
                        measuredHeight3 = sf(jArr3[i10]);
                    }
                    int measuredWidth3 = sf2.getMeasuredWidth();
                    long[] jArr4 = this.wh;
                    if (jArr4 != null) {
                        measuredWidth3 = pcc(jArr4[i10]);
                    }
                    if (this.vj[i10] || sfVar.vj() <= f) {
                        i5 = i8;
                    } else {
                        float vj2 = measuredHeight3 - (sfVar.vj() * f2);
                        if (i8 == gmVar.kj - 1) {
                            vj2 += f3;
                            f3 = f;
                        }
                        int round2 = Math.round(vj2);
                        if (round2 < sfVar.kj()) {
                            round2 = sfVar.kj();
                            this.vj[i10] = true;
                            gmVar.vh -= sfVar.vj();
                            i5 = i8;
                            z2 = true;
                        } else {
                            f3 += vj2 - round2;
                            i5 = i8;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                round2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f3 += 1.0f;
                            }
                        }
                        int pcc2 = pcc(i, sfVar, gmVar.hc);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        sf2.measure(pcc2, makeMeasureSpec2);
                        measuredWidth3 = sf2.getMeasuredWidth();
                        int measuredHeight4 = sf2.getMeasuredHeight();
                        pcc(i10, pcc2, makeMeasureSpec2, sf2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i6 = Math.max(i9, measuredWidth3 + sfVar.hc() + sfVar.jr() + this.oo.pcc(sf2));
                    gmVar.vj += measuredHeight3 + sfVar.gbb() + sfVar.dax();
                }
                gmVar.qf = Math.max(gmVar.qf, i6);
                i9 = i6;
            }
            i8 = i5 + 1;
            f = 0.0f;
        }
        if (!z2 || i7 == gmVar.vj) {
            return;
        }
        sf(i, i2, gmVar, i3, i4, true);
    }

    private int pcc(int i, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i2) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        int pcc2 = pccVar.pcc(i, pccVar.getPaddingLeft() + this.oo.getPaddingRight() + sfVar.hc() + sfVar.jr() + i2, sfVar.pcc());
        int size = View.MeasureSpec.getSize(pcc2);
        if (size > sfVar.vy()) {
            return View.MeasureSpec.makeMeasureSpec(sfVar.vy(), View.MeasureSpec.getMode(pcc2));
        }
        return size < sfVar.qf() ? View.MeasureSpec.makeMeasureSpec(sfVar.qf(), View.MeasureSpec.getMode(pcc2)) : pcc2;
    }

    private int sf(int i, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i2) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        int sf2 = pccVar.sf(i, pccVar.getPaddingTop() + this.oo.getPaddingBottom() + sfVar.gbb() + sfVar.dax() + i2, sfVar.sf());
        int size = View.MeasureSpec.getSize(sf2);
        if (size > sfVar.ork()) {
            return View.MeasureSpec.makeMeasureSpec(sfVar.ork(), View.MeasureSpec.getMode(sf2));
        }
        return size < sfVar.kj() ? View.MeasureSpec.makeMeasureSpec(sfVar.kj(), View.MeasureSpec.getMode(sf2)) : sf2;
    }

    void sf(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.oo.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.oo.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).qf = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.oo.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    gm gmVar = new gm();
                    gmVar.qf = i7;
                    flexLinesInternal.add(0, gmVar);
                    return;
                }
                if (alignContent == 2) {
                    this.oo.setFlexLines(pcc(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i5) {
                        float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i6 < size3) {
                            arrayList.add(flexLinesInternal.get(i6));
                            if (i6 != flexLinesInternal.size() - 1) {
                                gm gmVar2 = new gm();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    gmVar2.qf = Math.round(f + size2);
                                    f = 0.0f;
                                } else {
                                    gmVar2.qf = Math.round(size2);
                                }
                                f += size2 - gmVar2.qf;
                                if (f > 1.0f) {
                                    gmVar2.qf++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    gmVar2.qf--;
                                    f += 1.0f;
                                }
                                arrayList.add(gmVar2);
                            }
                            i6++;
                        }
                        this.oo.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.oo.setFlexLines(pcc(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    gm gmVar3 = new gm();
                    gmVar3.qf = size4;
                    for (gm gmVar4 : flexLinesInternal) {
                        arrayList2.add(gmVar3);
                        arrayList2.add(gmVar4);
                        arrayList2.add(gmVar3);
                    }
                    this.oo.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        gm gmVar5 = flexLinesInternal.get(i6);
                        float f3 = gmVar5.qf + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round = Math.round(f3);
                        f2 += f3 - round;
                        if (f2 > 1.0f) {
                            round++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round--;
                            f2 += 1.0f;
                        }
                        gmVar5.qf = round;
                        i6++;
                    }
                }
            }
        }
    }

    private List<gm> pcc(List<gm> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        gm gmVar = new gm();
        gmVar.qf = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(gmVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(gmVar);
            }
        }
        return arrayList;
    }

    void pcc() {
        pcc(0);
    }

    void pcc(int i) {
        View sf2;
        if (i >= this.oo.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.oo.getFlexDirection();
        if (this.oo.getAlignItems() == 4) {
            int[] iArr = this.pcc;
            List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                gm gmVar = flexLinesInternal.get(i2);
                int i3 = gmVar.kj;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = gmVar.jr + i4;
                    if (i4 < this.oo.getFlexItemCount() && (sf2 = this.oo.sf(i5)) != null && sf2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                        if (sfVar.wh() == -1 || sfVar.wh() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                pcc(sf2, gmVar.qf, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                sf(sf2, gmVar.qf, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (gm gmVar2 : this.oo.getFlexLinesInternal()) {
            for (Integer num : gmVar2.gbb) {
                View sf3 = this.oo.sf(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    pcc(sf3, gmVar2.qf, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    sf(sf3, gmVar2.qf, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void pcc(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int min = Math.min(Math.max(((i - sfVar.gbb()) - sfVar.dax()) - this.oo.pcc(view), sfVar.kj()), sfVar.ork());
        long[] jArr = this.wh;
        if (jArr != null) {
            measuredWidth = pcc(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        pcc(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    private void sf(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int min = Math.min(Math.max(((i - sfVar.hc()) - sfVar.jr()) - this.oo.pcc(view), sfVar.qf()), sfVar.vy());
        long[] jArr = this.wh;
        if (jArr != null) {
            measuredHeight = sf(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        pcc(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    void pcc(View view, gm gmVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int alignItems = this.oo.getAlignItems();
        if (sfVar.wh() != -1) {
            alignItems = sfVar.wh();
        }
        int i5 = gmVar.qf;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.oo.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - sfVar.dax(), i3, i6 - sfVar.dax());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + sfVar.gbb(), i3, (i4 - i5) + view.getMeasuredHeight() + sfVar.gbb());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + sfVar.gbb()) - sfVar.dax()) / 2;
                if (this.oo.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.oo.getFlexWrap() != 2) {
                    int max = Math.max(gmVar.tmg - view.getBaseline(), sfVar.gbb());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((gmVar.tmg - view.getMeasuredHeight()) + view.getBaseline(), sfVar.dax());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.oo.getFlexWrap() != 2) {
            view.layout(i, i2 + sfVar.gbb(), i3, i4 + sfVar.gbb());
        } else {
            view.layout(i, i2 - sfVar.dax(), i3, i4 - sfVar.dax());
        }
    }

    void pcc(View view, gm gmVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int alignItems = this.oo.getAlignItems();
        if (sfVar.wh() != -1) {
            alignItems = sfVar.wh();
        }
        int i5 = gmVar.qf;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - sfVar.jr(), i2, ((i3 + i5) - view.getMeasuredWidth()) - sfVar.jr(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + sfVar.hc(), i2, (i3 - i5) + view.getMeasuredWidth() + sfVar.hc(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.qf.wh.pcc(marginLayoutParams)) - com.bytedance.adsdk.ugeno.qf.wh.sf(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + sfVar.hc(), i2, i3 + sfVar.hc(), i4);
        } else {
            view.layout(i - sfVar.jr(), i2, i3 - sfVar.jr(), i4);
        }
    }

    private void pcc(int i, int i2, int i3, View view) {
        long[] jArr = this.sf;
        if (jArr != null) {
            jArr[i] = sf(i2, i3);
        }
        long[] jArr2 = this.wh;
        if (jArr2 != null) {
            jArr2[i] = sf(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static class sf implements Comparable<sf> {
        int pcc;
        int sf;

        private sf() {
        }

        @Override // java.lang.Comparable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compareTo(sf sfVar) {
            int i = this.sf;
            int i2 = sfVar.sf;
            return i != i2 ? i - i2 : this.pcc - sfVar.pcc;
        }

        public String toString() {
            return "Order{order=" + this.sf + ", index=" + this.pcc + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static class pcc {
        List<gm> pcc;
        int sf;

        pcc() {
        }

        void pcc() {
            this.pcc = null;
            this.sf = 0;
        }
    }
}
