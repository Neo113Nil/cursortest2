package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class ColorCountComparator implements java.util.Comparator<org.apache.commons.imaging.palette.ColorCount>, java.io.Serializable {
    private static final long serialVersionUID = 1;
    private org.apache.commons.imaging.palette.ColorComponent colorComponent;

    public ColorCountComparator(org.apache.commons.imaging.palette.ColorComponent colorComponent) {
        this.colorComponent = colorComponent;
    }

    /* renamed from: org.apache.commons.imaging.palette.ColorCountComparator$1, reason: invalid class name */
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

    @Override // java.util.Comparator
    public int compare(org.apache.commons.imaging.palette.ColorCount colorCount, org.apache.commons.imaging.palette.ColorCount colorCount2) {
        int i;
        int i2;
        int i3 = org.apache.commons.imaging.palette.ColorCountComparator.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[this.colorComponent.ordinal()];
        if (i3 == 1) {
            i = colorCount.alpha;
            i2 = colorCount2.alpha;
        } else if (i3 == 2) {
            i = colorCount.red;
            i2 = colorCount2.red;
        } else if (i3 == 3) {
            i = colorCount.green;
            i2 = colorCount2.green;
        } else {
            if (i3 != 4) {
                return 0;
            }
            i = colorCount.blue;
            i2 = colorCount2.blue;
        }
        return i - i2;
    }
}
