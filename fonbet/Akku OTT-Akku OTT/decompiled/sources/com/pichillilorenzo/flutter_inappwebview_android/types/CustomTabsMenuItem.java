package com.pichillilorenzo.flutter_inappwebview_android.types;

import androidx.concurrent.futures.a;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* loaded from: classes4.dex */
public class CustomTabsMenuItem {

    /* renamed from: id, reason: collision with root package name */
    private int f110id;
    private String label;

    public CustomTabsMenuItem(int i, String str) {
        this.f110id = i;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get(Constants.ScionAnalytics.PARAM_LABEL));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.f110id != customTabsMenuItem.f110id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.f110id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.f110id * 31);
    }

    public void setId(int i) {
        this.f110id = i;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomTabsMenuItem{id=");
        sb.append(this.f110id);
        sb.append(", label='");
        return a.a(sb, this.label, "'}");
    }
}
