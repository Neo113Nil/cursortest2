package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class LongestAxisMedianCut implements org.apache.commons.imaging.palette.MedianCut {
    private static final java.util.Comparator<org.apache.commons.imaging.palette.ColorGroup> COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.palette.LongestAxisMedianCut$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.palette.LongestAxisMedianCut.lambda$static$0((org.apache.commons.imaging.palette.ColorGroup) obj, (org.apache.commons.imaging.palette.ColorGroup) obj2);
        }
    };

    static /* synthetic */ int lambda$static$0(org.apache.commons.imaging.palette.ColorGroup colorGroup, org.apache.commons.imaging.palette.ColorGroup colorGroup2) {
        int i;
        int i2;
        if (colorGroup.maxDiff == colorGroup2.maxDiff) {
            i = colorGroup2.diffTotal;
            i2 = colorGroup.diffTotal;
        } else {
            i = colorGroup2.maxDiff;
            i2 = colorGroup.maxDiff;
        }
        return i - i2;
    }

    @Override // org.apache.commons.imaging.palette.MedianCut
    public boolean performNextMedianCut(java.util.List<org.apache.commons.imaging.palette.ColorGroup> list, boolean z) throws org.apache.commons.imaging.ImageWriteException {
        java.util.Collections.sort(list, COMPARATOR);
        org.apache.commons.imaging.palette.ColorGroup colorGroup = list.get(0);
        if (colorGroup.maxDiff == 0) {
            return false;
        }
        if (!z && colorGroup.alphaDiff > colorGroup.redDiff && colorGroup.alphaDiff > colorGroup.greenDiff && colorGroup.alphaDiff > colorGroup.blueDiff) {
            doCut(colorGroup, org.apache.commons.imaging.palette.ColorComponent.ALPHA, list, z);
            return true;
        }
        if (colorGroup.redDiff > colorGroup.greenDiff && colorGroup.redDiff > colorGroup.blueDiff) {
            doCut(colorGroup, org.apache.commons.imaging.palette.ColorComponent.RED, list, z);
            return true;
        }
        if (colorGroup.greenDiff > colorGroup.blueDiff) {
            doCut(colorGroup, org.apache.commons.imaging.palette.ColorComponent.GREEN, list, z);
            return true;
        }
        doCut(colorGroup, org.apache.commons.imaging.palette.ColorComponent.BLUE, list, z);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (java.lang.Math.abs(r1 - r3) >= java.lang.Math.abs(r5 - r1)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doCut(org.apache.commons.imaging.palette.ColorGroup colorGroup, org.apache.commons.imaging.palette.ColorComponent colorComponent, java.util.List<org.apache.commons.imaging.palette.ColorGroup> list, boolean z) throws org.apache.commons.imaging.ImageWriteException {
        int i;
        int i2;
        int i3;
        java.util.List<org.apache.commons.imaging.palette.ColorCount> colorCounts = colorGroup.getColorCounts();
        java.util.Collections.sort(colorCounts, new org.apache.commons.imaging.palette.ColorCountComparator(colorComponent));
        int round = (int) java.lang.Math.round(colorGroup.totalPoints / 2.0d);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= colorCounts.size()) {
                i = i4;
                break;
            }
            i = colorCounts.get(i5).count + i4;
            if (i >= round) {
                break;
            }
            i5++;
            i4 = i;
        }
        if (i5 != colorCounts.size() - 1) {
            if (i5 > 0) {
            }
            list.remove(colorGroup);
            int i6 = i5 + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList(colorCounts.subList(0, i6));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(colorCounts.subList(i6, colorCounts.size()));
            org.apache.commons.imaging.palette.ColorGroup colorGroup2 = new org.apache.commons.imaging.palette.ColorGroup(new java.util.ArrayList(arrayList), z);
            list.add(colorGroup2);
            org.apache.commons.imaging.palette.ColorGroup colorGroup3 = new org.apache.commons.imaging.palette.ColorGroup(new java.util.ArrayList(arrayList2), z);
            list.add(colorGroup3);
            org.apache.commons.imaging.palette.ColorCount colorCount = colorCounts.get(i5);
            i2 = org.apache.commons.imaging.palette.LongestAxisMedianCut.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
            if (i2 != 1) {
                i3 = colorCount.alpha;
            } else if (i2 == 2) {
                i3 = colorCount.red;
            } else if (i2 == 3) {
                i3 = colorCount.green;
            } else if (i2 == 4) {
                i3 = colorCount.blue;
            } else {
                throw new java.lang.Error("Bad mode.");
            }
            colorGroup.cut = new org.apache.commons.imaging.palette.ColorGroupCut(colorGroup2, colorGroup3, colorComponent, i3);
        }
        i5--;
        list.remove(colorGroup);
        int i62 = i5 + 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(colorCounts.subList(0, i62));
        java.util.ArrayList arrayList22 = new java.util.ArrayList(colorCounts.subList(i62, colorCounts.size()));
        org.apache.commons.imaging.palette.ColorGroup colorGroup22 = new org.apache.commons.imaging.palette.ColorGroup(new java.util.ArrayList(arrayList3), z);
        list.add(colorGroup22);
        org.apache.commons.imaging.palette.ColorGroup colorGroup32 = new org.apache.commons.imaging.palette.ColorGroup(new java.util.ArrayList(arrayList22), z);
        list.add(colorGroup32);
        org.apache.commons.imaging.palette.ColorCount colorCount2 = colorCounts.get(i5);
        i2 = org.apache.commons.imaging.palette.LongestAxisMedianCut.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
        if (i2 != 1) {
        }
        colorGroup.cut = new org.apache.commons.imaging.palette.ColorGroupCut(colorGroup22, colorGroup32, colorComponent, i3);
    }

    /* renamed from: org.apache.commons.imaging.palette.LongestAxisMedianCut$1, reason: invalid class name */
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
