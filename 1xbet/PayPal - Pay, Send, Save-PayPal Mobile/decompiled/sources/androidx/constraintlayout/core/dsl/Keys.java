package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Keys {
    protected java.lang.String unpack(java.lang.String[] strArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int i = 0;
        while (i < strArr.length) {
            sb.append(i == 0 ? "'" : ",'");
            sb.append(strArr[i]);
            sb.append("'");
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, int i) {
        if (i != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i);
            sb.append("',\n");
        }
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(f);
        sb.append(",\n");
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, java.lang.String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(java.util.Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
