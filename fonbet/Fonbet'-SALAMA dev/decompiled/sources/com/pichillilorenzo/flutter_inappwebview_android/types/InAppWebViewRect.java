package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class InAppWebViewRect {
    private double height;
    private double width;

    /* renamed from: x, reason: collision with root package name */
    private double f12298x;

    /* renamed from: y, reason: collision with root package name */
    private double f12299y;

    public InAppWebViewRect(double d7, double d8, double d9, double d10) {
        this.height = d7;
        this.width = d8;
        this.f12298x = d9;
        this.f12299y = d10;
    }

    public static InAppWebViewRect fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new InAppWebViewRect(((Double) map.get("height")).doubleValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("x")).doubleValue(), ((Double) map.get("y")).doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InAppWebViewRect inAppWebViewRect = (InAppWebViewRect) obj;
        return Double.compare(this.height, inAppWebViewRect.height) == 0 && Double.compare(this.width, inAppWebViewRect.width) == 0 && Double.compare(this.f12298x, inAppWebViewRect.f12298x) == 0 && Double.compare(this.f12299y, inAppWebViewRect.f12299y) == 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getX() {
        return this.f12298x;
    }

    public double getY() {
        return this.f12299y;
    }

    public int hashCode() {
        return Double.hashCode(this.f12299y) + ((Double.hashCode(this.f12298x) + ((Double.hashCode(this.width) + (Double.hashCode(this.height) * 31)) * 31)) * 31);
    }

    public void setHeight(double d7) {
        this.height = d7;
    }

    public void setWidth(double d7) {
        this.width = d7;
    }

    public void setX(double d7) {
        this.f12298x = d7;
    }

    public void setY(double d7) {
        this.f12299y = d7;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("height", Double.valueOf(this.height));
        hashMap.put("width", Double.valueOf(this.width));
        hashMap.put("x", Double.valueOf(this.f12298x));
        hashMap.put("y", Double.valueOf(this.f12299y));
        return hashMap;
    }

    public Rect toRect() {
        double d7 = this.f12298x;
        double d8 = this.f12299y;
        return new Rect((int) d7, (int) d8, (int) (d7 + this.width), (int) (d8 + this.height));
    }

    public String toString() {
        return "InAppWebViewRect{height=" + this.height + ", width=" + this.width + ", x=" + this.f12298x + ", y=" + this.f12299y + '}';
    }
}
