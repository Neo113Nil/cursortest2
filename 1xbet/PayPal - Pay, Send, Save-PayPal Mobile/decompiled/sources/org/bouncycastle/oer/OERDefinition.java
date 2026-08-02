package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class OERDefinition {
    private static final java.math.BigInteger[] getHighSpeedVideoFpsRangesFor = {new java.math.BigInteger("256"), new java.math.BigInteger("65536"), new java.math.BigInteger("4294967296"), new java.math.BigInteger("18446744073709551616")};
    private static final java.math.BigInteger[][] getHighResolutionOutputSizeshNQ4ISI = {new java.math.BigInteger[]{new java.math.BigInteger("-128"), new java.math.BigInteger("127")}, new java.math.BigInteger[]{new java.math.BigInteger("-32768"), new java.math.BigInteger("32767")}, new java.math.BigInteger[]{new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647")}, new java.math.BigInteger[]{new java.math.BigInteger("-9223372036854775808"), new java.math.BigInteger("9223372036854775807")}};

    public enum BaseType {
        SEQ,
        SEQ_OF,
        CHOICE,
        ENUM,
        INT,
        OCTET_STRING,
        UTF8_STRING,
        BIT_STRING,
        NULL,
        EXTENSION,
        ENUM_ITEM,
        BOOLEAN,
        IS0646String,
        PrintableString,
        NumericString,
        BMPString,
        UniversalString,
        IA5String,
        VisibleString
    }

    public static org.bouncycastle.oer.OERDefinition.Builder utf8String(int i, int i2) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.UTF8_STRING).range(java.math.BigInteger.valueOf(i), java.math.BigInteger.valueOf(i2));
    }

    public static org.bouncycastle.oer.OERDefinition.Builder utf8String(int i) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.UTF8_STRING).rangeToMAXFrom(i);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder utf8String() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.UTF8_STRING);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder seqof(java.lang.Object... objArr) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.SEQ_OF).items(objArr);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder seq(java.lang.Object... objArr) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.SEQ).items(objArr);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder seq() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.SEQ);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder placeholder() {
        return new org.bouncycastle.oer.OERDefinition.Builder(null);
    }

    public static java.util.List<java.lang.Object> optional(java.lang.Object... objArr) {
        return new org.bouncycastle.oer.OERDefinition.OptionalList(java.util.Arrays.asList(objArr));
    }

    public static org.bouncycastle.oer.OERDefinition.Builder opaque() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING).unbounded();
    }

    public static org.bouncycastle.oer.OERDefinition.Builder octets(int i, int i2) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING).range(java.math.BigInteger.valueOf(i), java.math.BigInteger.valueOf(i2));
    }

    public static org.bouncycastle.oer.OERDefinition.Builder octets(int i) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING).fixedSize(i);
    }

    public static class Builder {
        protected final org.bouncycastle.oer.OERDefinition.BaseType baseType;
        protected org.bouncycastle.asn1.ASN1Encodable defaultValue;
        protected java.math.BigInteger enumValue;
        protected java.lang.String label;
        protected java.math.BigInteger lowerBound;
        protected org.bouncycastle.oer.OERDefinition.Builder placeholderValue;
        protected java.math.BigInteger upperBound;
        protected java.util.ArrayList<org.bouncycastle.oer.OERDefinition.Builder> children = new java.util.ArrayList<>();
        protected boolean explicit = false;

        public org.bouncycastle.oer.OERDefinition.Builder unbounded() {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.lowerBound = null;
            copy.upperBound = null;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder rangeZeroTo(long j) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.upperBound = java.math.BigInteger.valueOf(j);
            copy.lowerBound = java.math.BigInteger.ZERO;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder rangeToMAXFrom(long j) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.lowerBound = java.math.BigInteger.valueOf(j);
            copy.upperBound = null;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder range(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.lowerBound = bigInteger;
            copy.upperBound = bigInteger2;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder range(long j, long j2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.lowerBound = java.math.BigInteger.valueOf(j);
            copy.upperBound = java.math.BigInteger.valueOf(j2);
            copy.defaultValue = aSN1Encodable;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder labelPrefix(java.lang.String str) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(this.label);
            copy.label = sb.toString();
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder label(java.lang.String str) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            if (str != null) {
                copy.label = str;
            }
            copy.explicit = this.explicit;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder items(java.lang.Object... objArr) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            for (int i = 0; i != objArr.length; i++) {
                java.lang.Object obj = objArr[i];
                if (obj instanceof org.bouncycastle.oer.OERDefinition.OptionalList) {
                    java.util.Iterator it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        copy.children.add(getHighSpeedVideoSizes(false, it.next()));
                    }
                } else if (obj.getClass().isArray()) {
                    items((java.lang.Object[]) obj);
                } else {
                    copy.children.add(getHighSpeedVideoSizes(true, obj));
                }
            }
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder fixedSize(long j) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.upperBound = java.math.BigInteger.valueOf(j);
            copy.lowerBound = java.math.BigInteger.valueOf(j);
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder explicit(boolean z) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.explicit = z;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder enumValue(java.math.BigInteger bigInteger) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            this.enumValue = bigInteger;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder defaultValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            org.bouncycastle.oer.OERDefinition.Builder copy = copy();
            copy.defaultValue = aSN1Encodable;
            return copy;
        }

        public org.bouncycastle.oer.OERDefinition.Builder copy() {
            org.bouncycastle.oer.OERDefinition.Builder builder = new org.bouncycastle.oer.OERDefinition.Builder(this.baseType);
            java.util.Iterator<org.bouncycastle.oer.OERDefinition.Builder> it = this.children.iterator();
            while (it.hasNext()) {
                builder.children.add(it.next().copy());
            }
            builder.explicit = this.explicit;
            builder.label = this.label;
            builder.upperBound = this.upperBound;
            builder.lowerBound = this.lowerBound;
            builder.defaultValue = this.defaultValue;
            builder.enumValue = this.enumValue;
            return builder;
        }

        public org.bouncycastle.oer.OERDefinition.Element build() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z = false;
            if (this.baseType == org.bouncycastle.oer.OERDefinition.BaseType.ENUM) {
                java.util.HashSet hashSet = new java.util.HashSet();
                int i = 0;
                for (int i2 = 0; i2 < this.children.size(); i2++) {
                    org.bouncycastle.oer.OERDefinition.Builder builder = this.children.get(i2);
                    if (builder.enumValue == null) {
                        builder.enumValue = java.math.BigInteger.valueOf(i);
                        i++;
                    }
                    if (hashSet.contains(builder.enumValue)) {
                        throw new java.lang.IllegalStateException("duplicate enum value at index ".concat(java.lang.String.valueOf(i2)));
                    }
                    hashSet.add(builder.enumValue);
                }
            }
            java.util.Iterator<org.bouncycastle.oer.OERDefinition.Builder> it = this.children.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                org.bouncycastle.oer.OERDefinition.Builder next = it.next();
                if (!z2 && next.baseType == org.bouncycastle.oer.OERDefinition.BaseType.EXTENSION) {
                    if (!next.children.isEmpty() || this.baseType == org.bouncycastle.oer.OERDefinition.BaseType.CHOICE) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                }
                arrayList.add(next.build());
            }
            org.bouncycastle.oer.OERDefinition.BaseType baseType = this.baseType;
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.defaultValue;
            if (aSN1Encodable == null && this.explicit) {
                z = true;
            }
            return new org.bouncycastle.oer.OERDefinition.Element(baseType, arrayList, z, this.label, this.lowerBound, this.upperBound, z2, this.enumValue, aSN1Encodable);
        }

        private static org.bouncycastle.oer.OERDefinition.Builder getHighSpeedVideoSizes(boolean z, java.lang.Object obj) {
            if (obj instanceof org.bouncycastle.oer.OERDefinition.Builder) {
                return ((org.bouncycastle.oer.OERDefinition.Builder) obj).explicit(z);
            }
            if (obj instanceof org.bouncycastle.oer.OERDefinition.BaseType) {
                return new org.bouncycastle.oer.OERDefinition.Builder((org.bouncycastle.oer.OERDefinition.BaseType) obj).explicit(z);
            }
            throw new java.lang.IllegalStateException("Unable to wrap item in builder");
        }

        public Builder(org.bouncycastle.oer.OERDefinition.BaseType baseType) {
            this.baseType = baseType;
        }
    }

    public static org.bouncycastle.oer.OERDefinition.Builder octets() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING).unbounded();
    }

    public static org.bouncycastle.oer.OERDefinition.Builder nullValue() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.NULL);
    }

    public static class Element {
        public final org.bouncycastle.oer.OERDefinition.BaseType baseType;
        public final java.util.List<org.bouncycastle.oer.OERDefinition.Element> children;
        public final org.bouncycastle.asn1.ASN1Encodable defaultValue;
        public final java.math.BigInteger enumValue;
        public final boolean explicit;
        public final boolean extensionsInDefinition;
        private java.util.List<org.bouncycastle.oer.OERDefinition.Element> getHighSpeedVideoFpsRangesFor;
        public final java.lang.String label;
        public final java.math.BigInteger lowerBound;
        public final java.math.BigInteger upperBound;

        public java.lang.String rangeExpression() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            java.math.BigInteger bigInteger = this.lowerBound;
            sb.append(bigInteger != null ? bigInteger.toString() : "MIN");
            sb.append(" ... ");
            java.math.BigInteger bigInteger2 = this.upperBound;
            sb.append(bigInteger2 != null ? bigInteger2.toString() : "MAX");
            sb.append(")");
            return sb.toString();
        }

        public java.util.List<org.bouncycastle.oer.OERDefinition.Element> optionalOrDefaultChildrenInOrder() {
            java.util.List<org.bouncycastle.oer.OERDefinition.Element> list;
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (org.bouncycastle.oer.OERDefinition.Element element : this.children) {
                        if (!element.explicit || element.getDefaultValue() != null) {
                            arrayList.add(element);
                        }
                    }
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(arrayList);
                }
                list = this.getHighSpeedVideoFpsRangesFor;
            }
            return list;
        }

        public boolean isUnsignedWithRange() {
            return isLowerRangeZero() && this.upperBound != null && java.math.BigInteger.ZERO.compareTo(this.upperBound) < 0;
        }

        public boolean isUnbounded() {
            return this.upperBound == null && this.lowerBound == null;
        }

        public boolean isLowerRangeZero() {
            return java.math.BigInteger.ZERO.equals(this.lowerBound);
        }

        public boolean isFixedLength() {
            java.math.BigInteger bigInteger = this.lowerBound;
            return bigInteger != null && bigInteger.equals(this.upperBound);
        }

        public int intBytesForRange() {
            if (this.lowerBound != null && this.upperBound != null) {
                int i = 1;
                if (!java.math.BigInteger.ZERO.equals(this.lowerBound)) {
                    int i2 = 0;
                    int i3 = 1;
                    while (i2 < org.bouncycastle.oer.OERDefinition.getHighResolutionOutputSizeshNQ4ISI.length) {
                        if (this.lowerBound.compareTo(org.bouncycastle.oer.OERDefinition.getHighResolutionOutputSizeshNQ4ISI[i2][0]) >= 0 && this.upperBound.compareTo(org.bouncycastle.oer.OERDefinition.getHighResolutionOutputSizeshNQ4ISI[i2][1]) < 0) {
                            return -i3;
                        }
                        i2++;
                        i3 *= 2;
                    }
                } else {
                    int i4 = 0;
                    while (i4 < org.bouncycastle.oer.OERDefinition.getHighSpeedVideoFpsRangesFor.length) {
                        if (this.upperBound.compareTo(org.bouncycastle.oer.OERDefinition.getHighSpeedVideoFpsRangesFor[i4]) < 0) {
                            return i;
                        }
                        i4++;
                        i *= 2;
                    }
                }
            }
            return 0;
        }

        public boolean hasPopulatedExtension() {
            java.util.Iterator<org.bouncycastle.oer.OERDefinition.Element> it = this.children.iterator();
            while (it.hasNext()) {
                if (it.next().baseType == org.bouncycastle.oer.OERDefinition.BaseType.EXTENSION) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasDefaultChildren() {
            java.util.Iterator<org.bouncycastle.oer.OERDefinition.Element> it = this.children.iterator();
            while (it.hasNext()) {
                if (it.next().defaultValue != null) {
                    return true;
                }
            }
            return false;
        }

        public org.bouncycastle.oer.OERDefinition.Element getFirstChid() {
            return this.children.get(0);
        }

        public org.bouncycastle.asn1.ASN1Encodable getDefaultValue() {
            return this.defaultValue;
        }

        public boolean canBeNegative() {
            return this.lowerBound != null && java.math.BigInteger.ZERO.compareTo(this.lowerBound) > 0;
        }

        public java.lang.String appendLabel(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            java.lang.String str2 = this.label;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(this.explicit ? " (E)" : "");
            sb.append("] ");
            sb.append(str);
            return sb.toString();
        }

        public Element(org.bouncycastle.oer.OERDefinition.BaseType baseType, java.util.List<org.bouncycastle.oer.OERDefinition.Element> list, boolean z, java.lang.String str, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, boolean z2, java.math.BigInteger bigInteger3, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.baseType = baseType;
            this.children = list;
            this.explicit = z;
            this.label = str;
            this.lowerBound = bigInteger;
            this.upperBound = bigInteger2;
            this.extensionsInDefinition = z2;
            this.enumValue = bigInteger3;
            this.defaultValue = aSN1Encodable;
        }
    }

    public static org.bouncycastle.oer.OERDefinition.Builder integer(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.INT).range(bigInteger, bigInteger2);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder integer(long j, long j2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.INT).range(j, j2, aSN1Encodable);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder integer(long j, long j2) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.INT).range(java.math.BigInteger.valueOf(j), java.math.BigInteger.valueOf(j2));
    }

    public static org.bouncycastle.oer.OERDefinition.Builder integer(long j) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.INT).defaultValue(new org.bouncycastle.asn1.ASN1Integer(j));
    }

    public static org.bouncycastle.oer.OERDefinition.Builder integer() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.INT);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder extension() {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.EXTENSION).label("extension");
    }

    public static org.bouncycastle.oer.OERDefinition.Builder enumeration(java.lang.Object... objArr) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.ENUM).items(objArr);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder enumItem(java.lang.String str, java.math.BigInteger bigInteger) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.ENUM_ITEM).enumValue(bigInteger).label(str);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder enumItem(java.lang.String str) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.ENUM_ITEM).label(str);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder choice(java.lang.Object... objArr) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.CHOICE).items(objArr);
    }

    public static org.bouncycastle.oer.OERDefinition.Builder bitString(long j) {
        return new org.bouncycastle.oer.OERDefinition.Builder(org.bouncycastle.oer.OERDefinition.BaseType.BIT_STRING).fixedSize(j);
    }

    public static class MutableBuilder extends org.bouncycastle.oer.OERDefinition.Builder {
        private boolean getHighSpeedVideoFpsRangesFor;

        public void addItemsAndFreeze(org.bouncycastle.oer.OERDefinition.Builder... builderArr) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("build cannot be modified and must be copied only");
            }
            for (int i = 0; i != builderArr.length; i++) {
                this.children.add(builderArr[i]);
            }
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        public MutableBuilder(org.bouncycastle.oer.OERDefinition.BaseType baseType) {
            super(baseType);
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }

    static class OptionalList extends java.util.ArrayList<java.lang.Object> {
        public OptionalList(java.util.List<java.lang.Object> list) {
            addAll(list);
        }
    }
}
