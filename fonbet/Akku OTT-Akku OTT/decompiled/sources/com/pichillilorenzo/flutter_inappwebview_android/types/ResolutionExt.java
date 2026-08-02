package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import androidx.collection.i;
import androidx.compose.runtime.collection.a;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ResolutionExt {
    private int horizontalDpi;

    /* renamed from: id, reason: collision with root package name */
    private String f113id;
    private String label;
    private int verticalDpi;

    public ResolutionExt(String str, String str2, int i, int i2) {
        this.f113id = str;
        this.label = str2;
        this.verticalDpi = i;
        this.horizontalDpi = i2;
    }

    public static ResolutionExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ResolutionExt((String) map.get("id"), (String) map.get(Constants.ScionAnalytics.PARAM_LABEL), ((Integer) map.get("verticalDpi")).intValue(), ((Integer) map.get("horizontalDpi")).intValue());
    }

    public static ResolutionExt fromResolution(PrintAttributes.Resolution resolution) {
        if (resolution == null) {
            return null;
        }
        return new ResolutionExt(resolution.getId(), resolution.getLabel(), resolution.getVerticalDpi(), resolution.getHorizontalDpi());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolutionExt resolutionExt = (ResolutionExt) obj;
        if (this.verticalDpi == resolutionExt.verticalDpi && this.horizontalDpi == resolutionExt.horizontalDpi && this.f113id.equals(resolutionExt.f113id)) {
            return this.label.equals(resolutionExt.label);
        }
        return false;
    }

    public int getHorizontalDpi() {
        return this.horizontalDpi;
    }

    public String getId() {
        return this.f113id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getVerticalDpi() {
        return this.verticalDpi;
    }

    public int hashCode() {
        return ((a.a(this.f113id.hashCode() * 31, 31, this.label) + this.verticalDpi) * 31) + this.horizontalDpi;
    }

    public void setHorizontalDpi(int i) {
        this.horizontalDpi = i;
    }

    public void setId(String str) {
        this.f113id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setVerticalDpi(int i) {
        this.verticalDpi = i;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f113id);
        hashMap.put(Constants.ScionAnalytics.PARAM_LABEL, this.label);
        hashMap.put("verticalDpi", Integer.valueOf(this.verticalDpi));
        hashMap.put("horizontalDpi", Integer.valueOf(this.horizontalDpi));
        return hashMap;
    }

    public PrintAttributes.Resolution toResolution() {
        return new PrintAttributes.Resolution(this.f113id, this.label, this.horizontalDpi, this.verticalDpi);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResolutionExt{id='");
        sb.append(this.f113id);
        sb.append("', label='");
        sb.append(this.label);
        sb.append("', verticalDpi=");
        sb.append(this.verticalDpi);
        sb.append(", horizontalDpi=");
        return i.c(sb, this.horizontalDpi, '}');
    }
}
