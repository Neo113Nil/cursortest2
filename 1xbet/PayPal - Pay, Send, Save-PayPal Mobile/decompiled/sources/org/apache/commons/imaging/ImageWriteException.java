package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public class ImageWriteException extends org.apache.commons.imaging.ImagingException {
    private static final long serialVersionUID = -1;

    public ImageWriteException(java.lang.String str) {
        super(str);
    }

    public ImageWriteException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageWriteException(java.lang.String str, java.lang.Object obj) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(" (");
        sb.append(getType(obj));
        sb.append(")");
    }

    private static java.lang.String getType(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[Object[]: ");
            sb.append(((java.lang.Object[]) obj).length);
            sb.append("]");
            return sb.toString();
        }
        if (obj instanceof char[]) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[char[]: ");
            sb2.append(((char[]) obj).length);
            sb2.append("]");
            return sb2.toString();
        }
        if (obj instanceof byte[]) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[byte[]: ");
            sb3.append(((byte[]) obj).length);
            sb3.append("]");
            return sb3.toString();
        }
        if (obj instanceof short[]) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[short[]: ");
            sb4.append(((short[]) obj).length);
            sb4.append("]");
            return sb4.toString();
        }
        if (obj instanceof int[]) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[int[]: ");
            sb5.append(((int[]) obj).length);
            sb5.append("]");
            return sb5.toString();
        }
        if (obj instanceof long[]) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[long[]: ");
            sb6.append(((long[]) obj).length);
            sb6.append("]");
            return sb6.toString();
        }
        if (obj instanceof float[]) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[float[]: ");
            sb7.append(((float[]) obj).length);
            sb7.append("]");
            return sb7.toString();
        }
        if (obj instanceof double[]) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[double[]: ");
            sb8.append(((double[]) obj).length);
            sb8.append("]");
            return sb8.toString();
        }
        if (obj instanceof boolean[]) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[boolean[]: ");
            sb9.append(((boolean[]) obj).length);
            sb9.append("]");
            return sb9.toString();
        }
        return obj.getClass().getName();
    }
}
