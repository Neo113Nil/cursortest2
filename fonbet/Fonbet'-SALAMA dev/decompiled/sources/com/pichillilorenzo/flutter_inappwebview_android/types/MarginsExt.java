package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MarginsExt {
    private double bottom;
    private double left;
    private double right;
    private double top;

    public MarginsExt() {
    }

    public static MarginsExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MarginsExt(((Double) map.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue(), ((Double) map.get("right")).doubleValue(), ((Double) map.get("bottom")).doubleValue(), ((Double) map.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue());
    }

    public static MarginsExt fromMargins(PrintAttributes.Margins margins) {
        if (margins == null) {
            return null;
        }
        MarginsExt marginsExt = new MarginsExt();
        marginsExt.top = milsToPixels(margins.getTopMils());
        marginsExt.right = milsToPixels(margins.getRightMils());
        marginsExt.bottom = milsToPixels(margins.getBottomMils());
        marginsExt.left = milsToPixels(margins.getLeftMils());
        return marginsExt;
    }

    private static double milsToPixels(int i7) {
        return i7 * 0.09600001209449d;
    }

    private static int pixelsToMils(double d7) {
        return (int) Math.round(d7 * 10.416665354331d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarginsExt marginsExt = (MarginsExt) obj;
        return Double.compare(marginsExt.top, this.top) == 0 && Double.compare(marginsExt.right, this.right) == 0 && Double.compare(marginsExt.bottom, this.bottom) == 0 && Double.compare(marginsExt.left, this.left) == 0;
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.top);
        long doubleToLongBits2 = Double.doubleToLongBits(this.right);
        int i7 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.bottom);
        int i8 = (i7 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.left);
        return (i8 * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public void setBottom(double d7) {
        this.bottom = d7;
    }

    public void setLeft(double d7) {
        this.left = d7;
    }

    public void setRight(double d7) {
        this.right = d7;
    }

    public void setTop(double d7) {
        this.top = d7;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(RRWebVideoEvent.JsonKeys.TOP, Double.valueOf(this.top));
        hashMap.put("right", Double.valueOf(this.right));
        hashMap.put("bottom", Double.valueOf(this.bottom));
        hashMap.put(RRWebVideoEvent.JsonKeys.LEFT, Double.valueOf(this.left));
        return hashMap;
    }

    public PrintAttributes.Margins toMargins() {
        return new PrintAttributes.Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
    }

    public String toString() {
        return "MarginsExt{top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + '}';
    }

    public MarginsExt(double d7, double d8, double d9, double d10) {
        this.top = d7;
        this.right = d8;
        this.bottom = d9;
        this.left = d10;
    }
}
