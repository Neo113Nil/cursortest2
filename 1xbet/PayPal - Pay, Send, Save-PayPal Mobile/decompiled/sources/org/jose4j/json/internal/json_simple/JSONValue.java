package org.jose4j.json.internal.json_simple;

/* loaded from: classes18.dex */
public class JSONValue {
    public static java.lang.Object parse(java.io.Reader reader) {
        try {
            return new org.jose4j.json.internal.json_simple.parser.JSONParser().parse(reader);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Object parse(java.lang.String str) {
        return parse(new java.io.StringReader(str));
    }

    public static java.lang.Object parseWithException(java.io.Reader reader) throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        return new org.jose4j.json.internal.json_simple.parser.JSONParser().parse(reader);
    }

    public static java.lang.Object parseWithException(java.lang.String str) throws org.jose4j.json.internal.json_simple.parser.ParseException {
        return new org.jose4j.json.internal.json_simple.parser.JSONParser().parse(str);
    }

    public static void writeJSONString(java.lang.Object obj, java.io.Writer writer) throws java.io.IOException {
        while (obj != null) {
            if (obj instanceof java.lang.String) {
                writer.write(34);
                writer.write(escape((java.lang.String) obj));
                writer.write(34);
                return;
            }
            if (obj instanceof java.lang.Double) {
                java.lang.Double d = (java.lang.Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    writer.write("null");
                    return;
                } else {
                    writer.write(obj.toString());
                    return;
                }
            }
            if (obj instanceof java.lang.Float) {
                java.lang.Float f = (java.lang.Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    writer.write("null");
                    return;
                } else {
                    writer.write(obj.toString());
                    return;
                }
            }
            if (obj instanceof java.lang.Number) {
                writer.write(obj.toString());
                return;
            }
            if (obj instanceof java.lang.Boolean) {
                writer.write(obj.toString());
                return;
            }
            if (obj instanceof org.jose4j.json.internal.json_simple.JSONStreamAware) {
                ((org.jose4j.json.internal.json_simple.JSONStreamAware) obj).writeJSONString(writer);
                return;
            }
            if (obj instanceof org.jose4j.json.internal.json_simple.JSONAware) {
                writer.write(((org.jose4j.json.internal.json_simple.JSONAware) obj).toJSONString());
                return;
            }
            if (obj instanceof java.util.Map) {
                org.jose4j.json.internal.json_simple.JSONObject.writeJSONString((java.util.Map) obj, writer);
                return;
            }
            if (obj instanceof java.util.Collection) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((java.util.Collection) obj, writer);
                return;
            }
            if (obj instanceof byte[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((byte[]) obj, writer);
                return;
            }
            if (obj instanceof short[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((short[]) obj, writer);
                return;
            }
            if (obj instanceof int[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((int[]) obj, writer);
                return;
            }
            if (obj instanceof long[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((long[]) obj, writer);
                return;
            }
            if (obj instanceof float[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((float[]) obj, writer);
                return;
            }
            if (obj instanceof double[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((double[]) obj, writer);
                return;
            }
            if (obj instanceof boolean[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((boolean[]) obj, writer);
                return;
            } else if (obj instanceof char[]) {
                org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((char[]) obj, writer);
                return;
            } else {
                if (obj instanceof java.lang.Object[]) {
                    org.jose4j.json.internal.json_simple.JSONArray.writeJSONString((java.lang.Object[]) obj, writer);
                    return;
                }
                obj = obj.toString();
            }
        }
        writer.write("null");
    }

    public static java.lang.String toJSONString(java.lang.Object obj) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(obj, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String escape(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        getHighResolutionOutputSizeshNQ4ISI(str, sb);
        return sb.toString();
    }

    static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.StringBuilder sb) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt == '\\') {
                            sb.append("\\\\");
                        } else {
                            switch (charAt) {
                                case '\b':
                                    sb.append("\\b");
                                    break;
                                case '\t':
                                    sb.append("\\t");
                                    break;
                                case '\n':
                                    sb.append("\\n");
                                    break;
                                default:
                                    if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                        java.lang.String hexString = java.lang.Integer.toHexString(charAt);
                                        sb.append("\\u");
                                        for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                            sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        }
                                        sb.append(hexString.toUpperCase());
                                        break;
                                    } else {
                                        sb.append(charAt);
                                        break;
                                    }
                            }
                        }
                    } else {
                        sb.append("\\\"");
                    }
                } else {
                    sb.append("\\r");
                }
            } else {
                sb.append("\\f");
            }
        }
    }
}
