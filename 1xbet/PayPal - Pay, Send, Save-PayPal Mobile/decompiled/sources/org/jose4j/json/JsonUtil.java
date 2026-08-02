package org.jose4j.json;

/* loaded from: classes18.dex */
public class JsonUtil {
    private static final org.jose4j.json.internal.json_simple.parser.ContainerFactory getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.json.internal.json_simple.parser.ContainerFactory() { // from class: org.jose4j.json.JsonUtil.1
        @Override // org.jose4j.json.internal.json_simple.parser.ContainerFactory
        public java.util.List creatArrayContainer() {
            return new java.util.ArrayList();
        }

        @Override // org.jose4j.json.internal.json_simple.parser.ContainerFactory
        public java.util.Map createObjectContainer() {
            return new org.jose4j.json.JsonUtil.DupeKeyDisallowingLinkedHashMap();
        }
    };

    public static java.util.Map<java.lang.String, java.lang.Object> parseJson(java.lang.String str) throws org.jose4j.lang.JoseException {
        try {
            java.lang.Object parse = new org.jose4j.json.internal.json_simple.parser.JSONParser().parse(str, getHighResolutionOutputSizeshNQ4ISI);
            if (parse == null) {
                throw new org.jose4j.lang.JoseException("Parsing returned null");
            }
            return (java.util.Map) parse;
        } catch (java.lang.ClassCastException e) {
            throw new org.jose4j.lang.JoseException("Expecting a JSON object at the root but ".concat(java.lang.String.valueOf(e)), e);
        } catch (java.lang.IllegalArgumentException e2) {
            e = e2;
            throw new org.jose4j.lang.JoseException("Parsing error: ".concat(java.lang.String.valueOf(e)), e);
        } catch (org.jose4j.json.internal.json_simple.parser.ParseException e3) {
            e = e3;
            throw new org.jose4j.lang.JoseException("Parsing error: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public static java.lang.String toJson(java.util.Map<java.lang.String, ?> map) {
        return org.jose4j.json.internal.json_simple.JSONValue.toJSONString(map);
    }

    public static void writeJson(java.util.Map<java.lang.String, ?> map, java.io.Writer writer) throws java.io.IOException {
        org.jose4j.json.internal.json_simple.JSONValue.writeJSONString(map, writer);
    }

    static class DupeKeyDisallowingLinkedHashMap extends java.util.LinkedHashMap<java.lang.String, java.lang.Object> {
        DupeKeyDisallowingLinkedHashMap() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.String str = (java.lang.String) obj;
            if (containsKey(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("An entry for '");
                sb.append(str);
                sb.append("' already exists. Names must be unique.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return super.put(str, obj2);
        }
    }
}
