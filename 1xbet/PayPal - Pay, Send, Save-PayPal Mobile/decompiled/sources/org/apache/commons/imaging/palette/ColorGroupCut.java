package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
class ColorGroupCut {
    public final org.apache.commons.imaging.palette.ColorGroup less;
    public final int limit;
    public final org.apache.commons.imaging.palette.ColorComponent mode;
    public final org.apache.commons.imaging.palette.ColorGroup more;

    ColorGroupCut(org.apache.commons.imaging.palette.ColorGroup colorGroup, org.apache.commons.imaging.palette.ColorGroup colorGroup2, org.apache.commons.imaging.palette.ColorComponent colorComponent, int i) {
        this.less = colorGroup;
        this.more = colorGroup2;
        this.mode = colorComponent;
        this.limit = i;
    }

    public org.apache.commons.imaging.palette.ColorGroup getColorGroup(int i) {
        if (this.mode.argbComponent(i) <= this.limit) {
            return this.less;
        }
        return this.more;
    }
}
