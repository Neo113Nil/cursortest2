package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

/* loaded from: classes17.dex */
public class PhotometricInterpreterFloat extends org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter {
    float maxFound;
    float minFound;
    int nFound;
    java.util.ArrayList<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> rangePaletteEntries;
    java.util.ArrayList<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> singleValuePaletteEntries;
    double sumFound;
    int xMax;
    int xMin;
    int yMax;
    int yMin;

    public PhotometricInterpreterFloat(float f, float f2) {
        super(1, new int[]{32}, 0, 32, 32);
        this.rangePaletteEntries = new java.util.ArrayList<>();
        this.singleValuePaletteEntries = new java.util.ArrayList<>();
        this.minFound = Float.POSITIVE_INFINITY;
        this.maxFound = Float.NEGATIVE_INFINITY;
        if (f2 > f) {
            this.rangePaletteEntries.add(new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange(f, f2, java.awt.Color.black, java.awt.Color.white));
        } else {
            this.rangePaletteEntries.add(new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange(f2, f, java.awt.Color.white, java.awt.Color.black));
        }
    }

    public PhotometricInterpreterFloat(java.util.List<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> list) {
        super(1, new int[]{32}, 0, 32, 32);
        this.rangePaletteEntries = new java.util.ArrayList<>();
        this.singleValuePaletteEntries = new java.util.ArrayList<>();
        this.minFound = Float.POSITIVE_INFINITY;
        this.maxFound = Float.NEGATIVE_INFINITY;
        if (list == null || list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Palette entries list must be non-null and non-empty");
        }
        for (org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry paletteEntry : list) {
            if (paletteEntry.coversSingleEntry()) {
                this.singleValuePaletteEntries.add(paletteEntry);
            } else {
                this.rangePaletteEntries.add(paletteEntry);
            }
        }
        java.util.Comparator comparator = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat.lambda$new$0((org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry) obj, (org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry) obj2);
            }
        };
        java.util.Collections.sort(this.rangePaletteEntries, comparator);
        java.util.Collections.sort(this.singleValuePaletteEntries, comparator);
    }

    static /* synthetic */ int lambda$new$0(org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry paletteEntry, org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry paletteEntry2) {
        if (paletteEntry.getLowerBound() == paletteEntry2.getLowerBound()) {
            return java.lang.Double.compare(paletteEntry.getUpperBound(), paletteEntry2.getUpperBound());
        }
        return java.lang.Double.compare(paletteEntry.getLowerBound(), paletteEntry2.getLowerBound());
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        float intBitsToFloat = java.lang.Float.intBitsToFloat(iArr[0]);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> it = this.singleValuePaletteEntries.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry next = it.next();
            if (next.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next.getARGB(intBitsToFloat));
                return;
            }
        }
        if (java.lang.Float.isNaN(intBitsToFloat)) {
            return;
        }
        if (intBitsToFloat < this.minFound) {
            this.minFound = intBitsToFloat;
            this.xMin = i;
            this.yMin = i2;
        }
        if (intBitsToFloat > this.maxFound) {
            this.maxFound = intBitsToFloat;
            this.xMax = i;
            this.yMax = i2;
        }
        this.nFound++;
        this.sumFound += intBitsToFloat;
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> it2 = this.singleValuePaletteEntries.iterator();
        while (it2.hasNext()) {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry next2 = it2.next();
            if (next2.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next2.getARGB(intBitsToFloat));
                return;
            }
        }
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> it3 = this.rangePaletteEntries.iterator();
        while (it3.hasNext()) {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry next3 = it3.next();
            if (next3.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next3.getARGB(intBitsToFloat));
                return;
            }
        }
    }

    public float getMinFound() {
        return this.minFound;
    }

    public int[] getMaxXY() {
        return new int[]{this.xMax, this.yMax};
    }

    public float getMaxFound() {
        return this.maxFound;
    }

    public int[] getMinXY() {
        return new int[]{this.xMin, this.yMin};
    }

    public float getMeanFound() {
        int i = this.nFound;
        if (i == 0) {
            return 0.0f;
        }
        return (float) (this.sumFound / i);
    }

    public int mapValueToARGB(float f) {
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> it = this.singleValuePaletteEntries.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry next = it.next();
            if (next.isCovered(f)) {
                return next.getARGB(f);
            }
        }
        if (java.lang.Float.isNaN(f)) {
            return 0;
        }
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> it2 = this.rangePaletteEntries.iterator();
        while (it2.hasNext()) {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry next2 = it2.next();
            if (next2.isCovered(f)) {
                return next2.getARGB(f);
            }
        }
        return 0;
    }
}
