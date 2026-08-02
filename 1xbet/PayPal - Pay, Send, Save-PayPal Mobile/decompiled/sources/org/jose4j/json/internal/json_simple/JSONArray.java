package org.jose4j.json.internal.json_simple;

/* loaded from: classes18.dex */
public class JSONArray extends java.util.ArrayList implements org.jose4j.json.internal.json_simple.JSONAware, org.jose4j.json.internal.json_simple.JSONStreamAware {
    private static final long serialVersionUID = 3957988303675231981L;

    public JSONArray() {
    }

    public JSONArray(java.util.Collection collection) {
        super(collection);
    }

    public static void writeJSONString(java.util.Collection collection, java.io.Writer writer) throws java.io.IOException {
        if (collection == null) {
            writer.write("null");
            return;
        }
        writer.write(91);
        boolean z = true;
        for (java.lang.Object obj : collection) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write("null");
            } else {
                org.jose4j.json.internal.json_simple.JSONValue.writeJSONString(obj, writer);
            }
        }
        writer.write(93);
    }

    @Override // org.jose4j.json.internal.json_simple.JSONStreamAware
    public void writeJSONString(java.io.Writer writer) throws java.io.IOException {
        writeJSONString(this, writer);
    }

    public static java.lang.String toJSONString(java.util.Collection collection) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(collection, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(byte[] bArr, java.io.Writer writer) throws java.io.IOException {
        if (bArr == null) {
            writer.write("null");
            return;
        }
        if (bArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf((int) bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf((int) bArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(byte[] bArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(bArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(short[] sArr, java.io.Writer writer) throws java.io.IOException {
        if (sArr == null) {
            writer.write("null");
            return;
        }
        if (sArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf((int) sArr[0]));
        for (int i = 1; i < sArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf((int) sArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(short[] sArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(sArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(int[] iArr, java.io.Writer writer) throws java.io.IOException {
        if (iArr == null) {
            writer.write("null");
            return;
        }
        if (iArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf(iArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(int[] iArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(iArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(long[] jArr, java.io.Writer writer) throws java.io.IOException {
        if (jArr == null) {
            writer.write("null");
            return;
        }
        if (jArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf(jArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(long[] jArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(jArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(float[] fArr, java.io.Writer writer) throws java.io.IOException {
        if (fArr == null) {
            writer.write("null");
            return;
        }
        if (fArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf(fArr[0]));
        for (int i = 1; i < fArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf(fArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(float[] fArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(fArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(double[] dArr, java.io.Writer writer) throws java.io.IOException {
        if (dArr == null) {
            writer.write("null");
            return;
        }
        if (dArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf(dArr[0]));
        for (int i = 1; i < dArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf(dArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(double[] dArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(dArr, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(boolean[] zArr, java.io.Writer writer) throws java.io.IOException {
        if (zArr == null) {
            writer.write("null");
            return;
        }
        if (zArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        writer.write(java.lang.String.valueOf(zArr[0]));
        for (int i = 1; i < zArr.length; i++) {
            writer.write(",");
            writer.write(java.lang.String.valueOf(zArr[i]));
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(boolean[] zArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(zArr, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(char[] cArr, java.io.Writer writer) throws java.io.IOException {
        if (cArr == null) {
            writer.write("null");
            return;
        }
        if (cArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[\"");
        writer.write(org.jose4j.json.internal.json_simple.JSONValue.escape(java.lang.String.valueOf(cArr[0])));
        for (int i = 1; i < cArr.length; i++) {
            writer.write("\",\"");
            writer.write(org.jose4j.json.internal.json_simple.JSONValue.escape(java.lang.String.valueOf(cArr[i])));
        }
        writer.write("\"]");
    }

    public static java.lang.String toJSONString(char[] cArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(cArr, (java.io.Writer) stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void writeJSONString(java.lang.Object[] objArr, java.io.Writer writer) throws java.io.IOException {
        if (objArr == null) {
            writer.write("null");
            return;
        }
        if (objArr.length == 0) {
            writer.write(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        writer.write("[");
        org.jose4j.json.internal.json_simple.JSONValue.writeJSONString(objArr[0], writer);
        for (int i = 1; i < objArr.length; i++) {
            writer.write(",");
            org.jose4j.json.internal.json_simple.JSONValue.writeJSONString(objArr[i], writer);
        }
        writer.write("]");
    }

    public static java.lang.String toJSONString(java.lang.Object[] objArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            writeJSONString(objArr, stringWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // org.jose4j.json.internal.json_simple.JSONAware
    public java.lang.String toJSONString() {
        return toJSONString(this);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return toJSONString();
    }
}
