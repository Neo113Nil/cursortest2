package org.bouncycastle.asn1.util;

/* loaded from: classes17.dex */
public class ASN1Dump {
    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, byte[] bArr) {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("    ");
        java.lang.String obj = sb.toString();
        stringBuffer.append(lineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length;
            stringBuffer.append(obj);
            if (length - i > 32) {
                stringBuffer.append(org.bouncycastle.util.Strings.fromByteArray(org.bouncycastle.util.encoders.Hex.encode(bArr, i, 32)));
                stringBuffer.append("    ");
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i, 32);
            } else {
                stringBuffer.append(org.bouncycastle.util.Strings.fromByteArray(org.bouncycastle.util.encoders.Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr.length - i);
            }
            stringBuffer.append(highResolutionOutputSizeshNQ4ISI);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    public static java.lang.String dumpAsString(java.lang.Object obj, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive;
        if (obj instanceof org.bouncycastle.asn1.ASN1Primitive) {
            aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) obj;
        } else {
            if (!(obj instanceof org.bouncycastle.asn1.ASN1Encodable)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object type ");
                sb.append(obj.toString());
                return sb.toString();
            }
            aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        getHighSpeedVideoSizes("", z, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    public static java.lang.String dumpAsString(java.lang.Object obj) {
        return dumpAsString(obj, false);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    static void getHighSpeedVideoSizes(java.lang.String str, boolean z, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, java.lang.StringBuffer stringBuffer) {
        java.lang.StringBuilder sb;
        int length;
        java.lang.StringBuilder sb2;
        java.lang.String str2;
        while (true) {
            java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Null) {
                stringBuffer.append(str);
                stringBuffer.append("NULL");
                stringBuffer.append(lineSeparator);
                return;
            }
            int i = 0;
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof org.bouncycastle.asn1.BERSequence ? "BER Sequence" : aSN1Primitive instanceof org.bouncycastle.asn1.DERSequence ? "DER Sequence" : "Sequence");
                stringBuffer.append(lineSeparator);
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append("    ");
                java.lang.String obj = sb3.toString();
                int size = aSN1Sequence.size();
                while (i < size) {
                    getHighSpeedVideoSizes(obj, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), stringBuffer);
                    i++;
                }
                return;
            }
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Set) {
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof org.bouncycastle.asn1.BERSet ? "BER Set" : aSN1Primitive instanceof org.bouncycastle.asn1.DERSet ? "DER Set" : "Set");
                stringBuffer.append(lineSeparator);
                org.bouncycastle.asn1.ASN1Set aSN1Set = (org.bouncycastle.asn1.ASN1Set) aSN1Primitive;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append("    ");
                java.lang.String obj2 = sb4.toString();
                int size2 = aSN1Set.size();
                while (i < size2) {
                    getHighSpeedVideoSizes(obj2, z, aSN1Set.getObjectAt(i).toASN1Primitive(), stringBuffer);
                    i++;
                }
                return;
            }
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific) {
                aSN1Primitive = ((org.bouncycastle.asn1.ASN1ApplicationSpecific) aSN1Primitive).getTaggedObject();
            } else if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof org.bouncycastle.asn1.BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof org.bouncycastle.asn1.DERTaggedObject ? "DER Tagged " : "Tagged ");
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
                stringBuffer.append(org.bouncycastle.asn1.ASN1Util.getTagText(aSN1TaggedObject));
                if (!aSN1TaggedObject.isExplicit()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(lineSeparator);
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append("    ");
                str = sb5.toString();
                aSN1Primitive = aSN1TaggedObject.getBaseObject().toASN1Primitive();
            } else {
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1OctetString) {
                    org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = (org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive;
                    if (aSN1Primitive instanceof org.bouncycastle.asn1.BEROctetString) {
                        sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("BER Constructed Octet String[");
                        length = aSN1OctetString.getOctets().length;
                    } else {
                        sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("DER Octet String[");
                        length = aSN1OctetString.getOctets().length;
                    }
                    sb.append(length);
                    sb.append("] ");
                    stringBuffer.append(sb.toString());
                    if (z) {
                        stringBuffer.append(getHighSpeedVideoFpsRangesFor(str, aSN1OctetString.getOctets()));
                        return;
                    } else {
                        stringBuffer.append(lineSeparator);
                        return;
                    }
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append("ObjectIdentifier(");
                    sb6.append(((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Primitive).getId());
                    sb6.append(")");
                    sb6.append(lineSeparator);
                    stringBuffer.append(sb6.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1RelativeOID) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str);
                    sb7.append("RelativeOID(");
                    sb7.append(((org.bouncycastle.asn1.ASN1RelativeOID) aSN1Primitive).getId());
                    sb7.append(")");
                    sb7.append(lineSeparator);
                    stringBuffer.append(sb7.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Boolean) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(str);
                    sb8.append("Boolean(");
                    sb8.append(((org.bouncycastle.asn1.ASN1Boolean) aSN1Primitive).isTrue());
                    sb8.append(")");
                    sb8.append(lineSeparator);
                    stringBuffer.append(sb8.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(str);
                    sb9.append("Integer(");
                    sb9.append(((org.bouncycastle.asn1.ASN1Integer) aSN1Primitive).getValue());
                    sb9.append(")");
                    sb9.append(lineSeparator);
                    stringBuffer.append(sb9.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BitString) {
                    org.bouncycastle.asn1.ASN1BitString aSN1BitString = (org.bouncycastle.asn1.ASN1BitString) aSN1Primitive;
                    byte[] bytes = aSN1BitString.getBytes();
                    int padBits = aSN1BitString.getPadBits();
                    if (aSN1BitString instanceof org.bouncycastle.asn1.DERBitString) {
                        sb2 = new java.lang.StringBuilder();
                        sb2.append(str);
                        str2 = "DER Bit String[";
                    } else if (aSN1BitString instanceof org.bouncycastle.asn1.DLBitString) {
                        sb2 = new java.lang.StringBuilder();
                        sb2.append(str);
                        str2 = "DL Bit String[";
                    } else {
                        sb2 = new java.lang.StringBuilder();
                        sb2.append(str);
                        str2 = "BER Bit String[";
                    }
                    sb2.append(str2);
                    sb2.append(bytes.length);
                    sb2.append(", ");
                    sb2.append(padBits);
                    sb2.append("] ");
                    stringBuffer.append(sb2.toString());
                    if (z) {
                        stringBuffer.append(getHighSpeedVideoFpsRangesFor(str, bytes));
                        return;
                    } else {
                        stringBuffer.append(lineSeparator);
                        return;
                    }
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1IA5String) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(str);
                    sb10.append("IA5String(");
                    sb10.append(((org.bouncycastle.asn1.ASN1IA5String) aSN1Primitive).getString());
                    sb10.append(") ");
                    sb10.append(lineSeparator);
                    stringBuffer.append(sb10.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTF8String) {
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                    sb11.append(str);
                    sb11.append("UTF8String(");
                    sb11.append(((org.bouncycastle.asn1.ASN1UTF8String) aSN1Primitive).getString());
                    sb11.append(") ");
                    sb11.append(lineSeparator);
                    stringBuffer.append(sb11.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1NumericString) {
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append(str);
                    sb12.append("NumericString(");
                    sb12.append(((org.bouncycastle.asn1.ASN1NumericString) aSN1Primitive).getString());
                    sb12.append(") ");
                    sb12.append(lineSeparator);
                    stringBuffer.append(sb12.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1PrintableString) {
                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                    sb13.append(str);
                    sb13.append("PrintableString(");
                    sb13.append(((org.bouncycastle.asn1.ASN1PrintableString) aSN1Primitive).getString());
                    sb13.append(") ");
                    sb13.append(lineSeparator);
                    stringBuffer.append(sb13.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1VisibleString) {
                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                    sb14.append(str);
                    sb14.append("VisibleString(");
                    sb14.append(((org.bouncycastle.asn1.ASN1VisibleString) aSN1Primitive).getString());
                    sb14.append(") ");
                    sb14.append(lineSeparator);
                    stringBuffer.append(sb14.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BMPString) {
                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                    sb15.append(str);
                    sb15.append("BMPString(");
                    sb15.append(((org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive).getString());
                    sb15.append(") ");
                    sb15.append(lineSeparator);
                    stringBuffer.append(sb15.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1T61String) {
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    sb16.append(str);
                    sb16.append("T61String(");
                    sb16.append(((org.bouncycastle.asn1.ASN1T61String) aSN1Primitive).getString());
                    sb16.append(") ");
                    sb16.append(lineSeparator);
                    stringBuffer.append(sb16.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GraphicString) {
                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                    sb17.append(str);
                    sb17.append("GraphicString(");
                    sb17.append(((org.bouncycastle.asn1.ASN1GraphicString) aSN1Primitive).getString());
                    sb17.append(") ");
                    sb17.append(lineSeparator);
                    stringBuffer.append(sb17.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1VideotexString) {
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                    sb18.append(str);
                    sb18.append("VideotexString(");
                    sb18.append(((org.bouncycastle.asn1.ASN1VideotexString) aSN1Primitive).getString());
                    sb18.append(") ");
                    sb18.append(lineSeparator);
                    stringBuffer.append(sb18.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime) {
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    sb19.append(str);
                    sb19.append("UTCTime(");
                    sb19.append(((org.bouncycastle.asn1.ASN1UTCTime) aSN1Primitive).getTime());
                    sb19.append(") ");
                    sb19.append(lineSeparator);
                    stringBuffer.append(sb19.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
                    java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                    sb20.append(str);
                    sb20.append("GeneralizedTime(");
                    sb20.append(((org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Primitive).getTime());
                    sb20.append(") ");
                    sb20.append(lineSeparator);
                    stringBuffer.append(sb20.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Enumerated) {
                    java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
                    sb21.append(str);
                    sb21.append("DER Enumerated(");
                    sb21.append(((org.bouncycastle.asn1.ASN1Enumerated) aSN1Primitive).getValue());
                    sb21.append(")");
                    sb21.append(lineSeparator);
                    stringBuffer.append(sb21.toString());
                    return;
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectDescriptor) {
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                    sb22.append(str);
                    sb22.append("ObjectDescriptor(");
                    sb22.append(((org.bouncycastle.asn1.ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
                    sb22.append(") ");
                    sb22.append(lineSeparator);
                    stringBuffer.append(sb22.toString());
                    return;
                }
                if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1External)) {
                    java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
                    sb23.append(str);
                    sb23.append(aSN1Primitive.toString());
                    sb23.append(lineSeparator);
                    stringBuffer.append(sb23.toString());
                    return;
                }
                org.bouncycastle.asn1.ASN1External aSN1External = (org.bouncycastle.asn1.ASN1External) aSN1Primitive;
                java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
                sb24.append(str);
                sb24.append("External ");
                sb24.append(lineSeparator);
                stringBuffer.append(sb24.toString());
                java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
                sb25.append(str);
                sb25.append("    ");
                str = sb25.toString();
                if (aSN1External.getDirectReference() != null) {
                    java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
                    sb26.append(str);
                    sb26.append("Direct Reference: ");
                    sb26.append(aSN1External.getDirectReference().getId());
                    sb26.append(lineSeparator);
                    stringBuffer.append(sb26.toString());
                }
                if (aSN1External.getIndirectReference() != null) {
                    java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
                    sb27.append(str);
                    sb27.append("Indirect Reference: ");
                    sb27.append(aSN1External.getIndirectReference().toString());
                    sb27.append(lineSeparator);
                    stringBuffer.append(sb27.toString());
                }
                if (aSN1External.getDataValueDescriptor() != null) {
                    getHighSpeedVideoSizes(str, z, aSN1External.getDataValueDescriptor(), stringBuffer);
                }
                java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
                sb28.append(str);
                sb28.append("Encoding: ");
                sb28.append(aSN1External.getEncoding());
                sb28.append(lineSeparator);
                stringBuffer.append(sb28.toString());
                aSN1Primitive = aSN1External.getExternalContent();
            }
        }
    }
}
