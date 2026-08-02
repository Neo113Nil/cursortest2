package org.bouncycastle.voms;

/* loaded from: classes17.dex */
public class VOMSAttribute {
    public static final java.lang.String VOMS_ATTR_OID = "1.3.6.1.4.1.8005.100.100.4";
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cert.X509AttributeCertificateHolder getHighSpeedVideoFpsRangesFor;
    private java.util.List getHighSpeedVideoSizes = new java.util.ArrayList();
    private java.util.List Camera2StreamConfigurationMap = new java.util.ArrayList();

    public class FQAN {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;

        public java.lang.String toString() {
            return getFQAN();
        }

        protected void split() {
            int indexOf = this.getHighSpeedVideoFpsRanges.indexOf("/Role=");
            if (indexOf < 0) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.substring(0, indexOf);
            int i = indexOf + 6;
            int indexOf2 = this.getHighSpeedVideoFpsRanges.indexOf("/Capability=", i);
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.String substring = indexOf2 < 0 ? str.substring(i) : str.substring(i, indexOf2);
            java.lang.String str2 = null;
            if (substring.length() == 0) {
                substring = null;
            }
            this.getHighSpeedVideoSizes = substring;
            java.lang.String substring2 = indexOf2 < 0 ? null : this.getHighSpeedVideoFpsRanges.substring(indexOf2 + 12);
            if (substring2 != null && substring2.length() != 0) {
                str2 = substring2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
        }

        public java.lang.String getRole() {
            if (this.getHighSpeedVideoFpsRangesFor == null && this.getHighSpeedVideoFpsRanges != null) {
                split();
            }
            return this.getHighSpeedVideoSizes;
        }

        public java.lang.String getGroup() {
            if (this.getHighSpeedVideoFpsRangesFor == null && this.getHighSpeedVideoFpsRanges != null) {
                split();
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.String getFQAN() {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str != null) {
                return str;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("/Role=");
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("/Capability=");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                str3 = sb2.toString();
            }
            sb.append(str3);
            java.lang.String obj = sb.toString();
            this.getHighSpeedVideoFpsRanges = obj;
            return obj;
        }

        public java.lang.String getCapability() {
            if (this.getHighSpeedVideoFpsRangesFor == null && this.getHighSpeedVideoFpsRanges != null) {
                split();
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public FQAN(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
        }

        public FQAN(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VO      :");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("\nHostPort:");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("\nFQANs   :");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    public java.lang.String getVO() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List getListOfFQAN() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getHostPort() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.List getFullyQualifiedAttributes() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.cert.X509AttributeCertificateHolder getAC() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public VOMSAttribute(org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        if (x509AttributeCertificateHolder == null) {
            throw new java.lang.IllegalArgumentException("VOMSAttribute: AttributeCertificate is NULL");
        }
        this.getHighSpeedVideoFpsRangesFor = x509AttributeCertificateHolder;
        org.bouncycastle.asn1.x509.Attribute[] attributes = x509AttributeCertificateHolder.getAttributes(new org.bouncycastle.asn1.ASN1ObjectIdentifier(VOMS_ATTR_OID));
        if (attributes != null) {
            for (int i = 0; i != attributes.length; i++) {
                try {
                    org.bouncycastle.asn1.x509.IetfAttrSyntax ietfAttrSyntax = org.bouncycastle.asn1.x509.IetfAttrSyntax.getInstance(attributes[i].getAttributeValues()[0]);
                    java.lang.String string = ((org.bouncycastle.asn1.ASN1IA5String) ietfAttrSyntax.getPolicyAuthority().getNames()[0].getName()).getString();
                    int indexOf = string.indexOf("://");
                    if (indexOf < 0 || indexOf == string.length() - 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Bad encoding of VOMS policyAuthority : [");
                        sb.append(string);
                        sb.append("]");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = string.substring(0, indexOf);
                    this.getHighSpeedVideoFpsRanges = string.substring(indexOf + 3);
                    if (ietfAttrSyntax.getValueType() != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("VOMS attribute values are not encoded as octet strings, policyAuthority = ");
                        sb2.append(string);
                        throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                    org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = (org.bouncycastle.asn1.ASN1OctetString[]) ietfAttrSyntax.getValues();
                    for (int i2 = 0; i2 != aSN1OctetStringArr.length; i2++) {
                        java.lang.String str = new java.lang.String(aSN1OctetStringArr[i2].getOctets());
                        org.bouncycastle.voms.VOMSAttribute.FQAN fqan = new org.bouncycastle.voms.VOMSAttribute.FQAN(str);
                        if (!this.getHighSpeedVideoSizes.contains(str)) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                            sb3.append(this.getHighResolutionOutputSizeshNQ4ISI);
                            sb3.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                            if (str.startsWith(sb3.toString())) {
                                this.getHighSpeedVideoSizes.add(str);
                                this.Camera2StreamConfigurationMap.add(fqan);
                            }
                        }
                    }
                } catch (java.lang.IllegalArgumentException e) {
                    throw e;
                } catch (java.lang.Exception unused) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Badly encoded VOMS extension in AC issued by ");
                    sb4.append(x509AttributeCertificateHolder.getIssuer());
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
            }
        }
    }
}
