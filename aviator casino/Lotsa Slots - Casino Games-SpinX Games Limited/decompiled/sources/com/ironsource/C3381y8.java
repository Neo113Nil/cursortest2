package com.ironsource;

/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3381y8 extends java.io.File {
    public C3381y8(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    public org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public java.lang.String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C3381y8(java.lang.String str) {
        super(str);
    }
}
