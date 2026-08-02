package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class OEROptional extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.oer.OEROptional ABSENT = new org.bouncycastle.oer.OEROptional(false, null);
    private final boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        if (!this.Camera2StreamConfigurationMap) {
            return "ABSENT";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OPTIONAL(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        if (this.Camera2StreamConfigurationMap) {
            return get().toASN1Primitive();
        }
        throw new java.lang.RuntimeException("bang");
    }

    public boolean isDefined() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int hashCode = super.hashCode();
        boolean z = this.Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        return (((hashCode * 31) + (z ? 1 : 0)) * 31) + (aSN1Encodable != null ? aSN1Encodable.hashCode() : 0);
    }

    public <T> T getObject(final java.lang.Class<T> cls) {
        if (this.Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoFpsRangesFor.getClass().isInstance(cls) ? cls.cast(this.getHighSpeedVideoFpsRangesFor) : (T) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<T>() { // from class: org.bouncycastle.oer.OEROptional.1
                @Override // java.security.PrivilegedAction
                public T run() {
                    try {
                        return (T) cls.cast(cls.getMethod("getInstance", java.lang.Object.class).invoke(null, org.bouncycastle.oer.OEROptional.this.getHighSpeedVideoFpsRangesFor));
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("could not invoke getInstance on type ");
                        sb.append(e.getMessage());
                        throw new java.lang.IllegalStateException(sb.toString(), e);
                    }
                }
            });
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1Encodable get() {
        return !this.Camera2StreamConfigurationMap ? ABSENT : this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        org.bouncycastle.oer.OEROptional oEROptional = (org.bouncycastle.oer.OEROptional) obj;
        if (this.Camera2StreamConfigurationMap != oEROptional.Camera2StreamConfigurationMap) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable2 = oEROptional.getHighSpeedVideoFpsRangesFor;
        return aSN1Encodable != null ? aSN1Encodable.equals(aSN1Encodable2) : aSN1Encodable2 == null;
    }

    public static <T> T getValue(java.lang.Class<T> cls, java.lang.Object obj) {
        org.bouncycastle.oer.OEROptional oEROptional = getInstance(obj);
        if (oEROptional.Camera2StreamConfigurationMap) {
            return (T) oEROptional.getObject(cls);
        }
        return null;
    }

    public static org.bouncycastle.oer.OEROptional getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.OEROptional ? (org.bouncycastle.oer.OEROptional) obj : obj instanceof org.bouncycastle.asn1.ASN1Encodable ? new org.bouncycastle.oer.OEROptional(true, (org.bouncycastle.asn1.ASN1Encodable) obj) : ABSENT;
    }

    private OEROptional(boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
