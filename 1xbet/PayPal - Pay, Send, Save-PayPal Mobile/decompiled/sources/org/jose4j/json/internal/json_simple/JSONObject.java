package org.jose4j.json.internal.json_simple;

/* loaded from: classes18.dex */
public class JSONObject extends java.util.HashMap implements java.util.Map, org.jose4j.json.internal.json_simple.JSONAware, org.jose4j.json.internal.json_simple.JSONStreamAware {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public JSONObject(java.util.Map map) {
        super(map);
    }

    public static void writeJSONString(java.util.Map map, java.io.Writer writer) throws java.io.IOException {
        if (map == null) {
            writer.write("null");
            return;
        }
        writer.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        boolean z = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(escape(java.lang.String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            org.jose4j.json.internal.json_simple.JSONValue.writeJSONString(entry.getValue(), writer);
        }
        writer.write(125);
    }

    @Override // org.jose4j.json.internal.json_simple.JSONStreamAware
    public void writeJSONString(java.io.Writer writer) throws java.io.IOException {
        writeJSONString(this, writer);
    }

    public static java.lang.String toJSONString(java.util.Map map) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(map, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // org.jose4j.json.internal.json_simple.JSONAware
    public java.lang.String toJSONString() {
        return toJSONString(this);
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        return toJSONString();
    }

    public static java.lang.String toString(java.lang.String str, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('\"');
        if (str == null) {
            sb.append("null");
        } else {
            org.jose4j.json.internal.json_simple.JSONValue.getHighResolutionOutputSizeshNQ4ISI(str, sb);
        }
        sb.append('\"');
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(org.jose4j.json.internal.json_simple.JSONValue.toJSONString(obj));
        return sb.toString();
    }

    public static java.lang.String escape(java.lang.String str) {
        return org.jose4j.json.internal.json_simple.JSONValue.escape(str);
    }
}
