package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class MostPopulatedBoxesMedianCut implements org.apache.commons.imaging.palette.MedianCut {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (java.lang.Math.abs(r14 - r15) >= java.lang.Math.abs(r12 - r14)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[SYNTHETIC] */
    @Override // org.apache.commons.imaging.palette.MedianCut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performNextMedianCut(java.util.List<org.apache.commons.imaging.palette.ColorGroup> list, boolean z) throws org.apache.commons.imaging.ImageWriteException {
        int i;
        int i2;
        org.apache.commons.imaging.palette.ColorComponent[] colorComponentArr;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i3;
        double d;
        org.apache.commons.imaging.palette.ColorComponent colorComponent = null;
        int i4 = 0;
        org.apache.commons.imaging.palette.ColorGroup colorGroup = null;
        int i5 = 0;
        for (org.apache.commons.imaging.palette.ColorGroup colorGroup2 : list) {
            if (colorGroup2.maxDiff > 0 && colorGroup2.totalPoints > i5) {
                i5 = colorGroup2.totalPoints;
                colorGroup = colorGroup2;
            }
        }
        if (colorGroup == null) {
            return false;
        }
        java.util.List<org.apache.commons.imaging.palette.ColorCount> colorCounts = colorGroup.getColorCounts();
        org.apache.commons.imaging.palette.ColorComponent[] values = org.apache.commons.imaging.palette.ColorComponent.values();
        int length = values.length;
        int i6 = -1;
        double d2 = Double.MAX_VALUE;
        int i7 = 0;
        while (i7 < length) {
            org.apache.commons.imaging.palette.ColorComponent colorComponent2 = values[i7];
            if (z && colorComponent2 == org.apache.commons.imaging.palette.ColorComponent.ALPHA) {
                colorComponentArr = values;
            } else {
                java.util.Collections.sort(colorCounts, new org.apache.commons.imaging.palette.ColorCountComparator(colorComponent2));
                int round = (int) java.lang.Math.round(colorGroup.totalPoints / 2.0d);
                int i8 = i4;
                while (true) {
                    if (i4 >= colorCounts.size()) {
                        i2 = i8;
                        break;
                    }
                    i2 = colorCounts.get(i4).count + i8;
                    if (i2 >= round) {
                        break;
                    }
                    i4++;
                    i8 = i2;
                }
                colorComponentArr = values;
                if (i4 != colorCounts.size() - 1) {
                    if (i4 > 0) {
                    }
                    int i9 = i4 + 1;
                    arrayList = new java.util.ArrayList(colorCounts.subList(0, i9));
                    arrayList2 = new java.util.ArrayList(colorCounts.subList(i9, colorCounts.size()));
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        org.apache.commons.imaging.palette.ColorGroup colorGroup3 = new org.apache.commons.imaging.palette.ColorGroup(arrayList, z);
                        org.apache.commons.imaging.palette.ColorGroup colorGroup4 = new org.apache.commons.imaging.palette.ColorGroup(arrayList2, z);
                        double abs = java.lang.Math.abs(colorGroup3.totalPoints - colorGroup4.totalPoints);
                        int max = java.lang.Math.max(colorGroup3.totalPoints, colorGroup4.totalPoints);
                        i3 = length;
                        d = abs / max;
                        if (d >= d2) {
                            i6 = i4;
                            colorComponent = colorComponent2;
                            d2 = d;
                        }
                        i7++;
                        length = i3;
                        values = colorComponentArr;
                        i4 = 0;
                    }
                }
                i4--;
                int i92 = i4 + 1;
                arrayList = new java.util.ArrayList(colorCounts.subList(0, i92));
                arrayList2 = new java.util.ArrayList(colorCounts.subList(i92, colorCounts.size()));
                if (!arrayList.isEmpty()) {
                    org.apache.commons.imaging.palette.ColorGroup colorGroup32 = new org.apache.commons.imaging.palette.ColorGroup(arrayList, z);
                    org.apache.commons.imaging.palette.ColorGroup colorGroup42 = new org.apache.commons.imaging.palette.ColorGroup(arrayList2, z);
                    double abs2 = java.lang.Math.abs(colorGroup32.totalPoints - colorGroup42.totalPoints);
                    int max2 = java.lang.Math.max(colorGroup32.totalPoints, colorGroup42.totalPoints);
                    i3 = length;
                    d = abs2 / max2;
                    if (d >= d2) {
                    }
                    i7++;
                    length = i3;
                    values = colorComponentArr;
                    i4 = 0;
                }
            }
            i3 = length;
            i7++;
            length = i3;
            values = colorComponentArr;
            i4 = 0;
        }
        if (colorComponent == null) {
            return false;
        }
        java.util.Collections.sort(colorCounts, new org.apache.commons.imaging.palette.ColorCountComparator(colorComponent));
        int i10 = i6 + 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(colorCounts.subList(0, i10));
        java.util.ArrayList arrayList4 = new java.util.ArrayList(colorCounts.subList(i10, colorCounts.size()));
        org.apache.commons.imaging.palette.ColorGroup colorGroup5 = new org.apache.commons.imaging.palette.ColorGroup(arrayList3, z);
        org.apache.commons.imaging.palette.ColorGroup colorGroup6 = new org.apache.commons.imaging.palette.ColorGroup(arrayList4, z);
        list.remove(colorGroup);
        list.add(colorGroup5);
        list.add(colorGroup6);
        org.apache.commons.imaging.palette.ColorCount colorCount = colorCounts.get(i6);
        int i11 = org.apache.commons.imaging.palette.MostPopulatedBoxesMedianCut.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
        if (i11 == 1) {
            i = colorCount.alpha;
        } else if (i11 == 2) {
            i = colorCount.red;
        } else if (i11 == 3) {
            i = colorCount.green;
        } else if (i11 == 4) {
            i = colorCount.blue;
        } else {
            throw new java.lang.Error("Bad mode.");
        }
        colorGroup.cut = new org.apache.commons.imaging.palette.ColorGroupCut(colorGroup5, colorGroup6, colorComponent, i);
        return true;
    }

    /* renamed from: org.apache.commons.imaging.palette.MostPopulatedBoxesMedianCut$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$palette$ColorComponent;

        static {
            int[] iArr = new int[org.apache.commons.imaging.palette.ColorComponent.values().length];
            $SwitchMap$org$apache$commons$imaging$palette$ColorComponent = iArr;
            try {
                iArr[org.apache.commons.imaging.palette.ColorComponent.ALPHA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[org.apache.commons.imaging.palette.ColorComponent.RED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[org.apache.commons.imaging.palette.ColorComponent.GREEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[org.apache.commons.imaging.palette.ColorComponent.BLUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }
}
