package com.pichillilorenzo.flutter_inappwebview_android.types;

import androidx.compose.runtime.collection.a;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public class CustomTabsActionButton {
    private String description;
    private byte[] icon;

    /* renamed from: id, reason: collision with root package name */
    private int f109id;
    private boolean shouldTint;

    public CustomTabsActionButton(int i, byte[] bArr, String str, boolean z) {
        this.f109id = i;
        this.icon = bArr;
        this.description = str;
        this.shouldTint = z;
    }

    public static CustomTabsActionButton fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton(((Integer) map.get("id")).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
        if (this.f109id == customTabsActionButton.f109id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
            return this.description.equals(customTabsActionButton.description);
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f109id;
    }

    public int hashCode() {
        return a.a((Arrays.hashCode(this.icon) + (this.f109id * 31)) * 31, 31, this.description) + (this.shouldTint ? 1 : 0);
    }

    public boolean isShouldTint() {
        return this.shouldTint;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(byte[] bArr) {
        this.icon = bArr;
    }

    public void setId(int i) {
        this.f109id = i;
    }

    public void setShouldTint(boolean z) {
        this.shouldTint = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomTabsActionButton{id=");
        sb.append(this.f109id);
        sb.append(", icon=");
        sb.append(Arrays.toString(this.icon));
        sb.append(", description='");
        sb.append(this.description);
        sb.append("', shouldTint=");
        return androidx.appcompat.view.menu.a.c(sb, this.shouldTint, '}');
    }
}
