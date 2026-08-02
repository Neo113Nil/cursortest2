package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

/* loaded from: classes2.dex */
public class CreateWindowAction extends NavigationAction {
    boolean isDialog;
    int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z4, boolean z7, boolean z8, int i7, boolean z9) {
        super(uRLRequest, z4, z7, z8);
        this.windowId = i7;
        this.isDialog = z9;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
    }

    public int getWindowId() {
        return this.windowId;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z4) {
        this.isDialog = z4;
    }

    public void setWindowId(int i7) {
        this.windowId = i7;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", null);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public String toString() {
        return "CreateWindowAction{windowId=" + this.windowId + ", isDialog=" + this.isDialog + ", request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
    }
}
