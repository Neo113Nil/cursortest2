package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class DaitchMokotoffSoundex implements org.apache.commons.codec.StringEncoder {
    private static final java.util.Map<java.lang.Character, java.lang.Character> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<java.lang.Character, java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule>> getHighSpeedVideoSizes;
    private final boolean Camera2StreamConfigurationMap;

    static final class Branch {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        final java.lang.StringBuilder getHighSpeedVideoSizes;

        /* synthetic */ Branch(byte b) {
            this();
        }

        Branch() {
            this.getHighSpeedVideoSizes = new java.lang.StringBuilder();
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch) {
                return toString().equals(((org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch) obj).toString());
            }
            return false;
        }

        public final int hashCode() {
            return toString().hashCode();
        }

        public final java.lang.String toString() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.toString();
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static final class Rule {
        final java.lang.String[] Camera2StreamConfigurationMap;
        final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.String[] getHighSpeedVideoFpsRanges;
        final java.lang.String getHighSpeedVideoSizes;

        static boolean getHighResolutionOutputSizeshNQ4ISI(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        protected Rule(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = str2.split("\\|");
            this.Camera2StreamConfigurationMap = str3.split("\\|");
            this.getHighResolutionOutputSizeshNQ4ISI = str4.split("\\|");
        }

        public final java.lang.String toString() {
            return java.lang.String.format("%s=(%s,%s,%s)", this.getHighSpeedVideoSizes, java.util.Arrays.asList(this.getHighSpeedVideoFpsRanges), java.util.Arrays.asList(this.Camera2StreamConfigurationMap), java.util.Arrays.asList(this.getHighResolutionOutputSizeshNQ4ISI));
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap2;
        java.util.Scanner scanner = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream("org/apache/commons/codec/language/dmrules.txt"), org.apache.commons.codec.CharEncoding.UTF_8);
        int i = 0;
        boolean z = false;
        while (scanner.hasNextLine()) {
            try {
                i++;
                java.lang.String nextLine = scanner.nextLine();
                if (z) {
                    if (nextLine.endsWith("*/")) {
                        z = false;
                    }
                } else if (nextLine.startsWith("/*")) {
                    z = true;
                } else {
                    int indexOf = nextLine.indexOf("//");
                    java.lang.String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                    if (!trim.isEmpty()) {
                        if (trim.contains("=")) {
                            java.lang.String[] split = trim.split("=");
                            if (split.length != 2) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed folding statement split into ");
                                sb.append(split.length);
                                sb.append(" parts: ");
                                sb.append(nextLine);
                                sb.append(" in ");
                                sb.append("org/apache/commons/codec/language/dmrules.txt");
                                throw new java.lang.IllegalArgumentException(sb.toString());
                            }
                            java.lang.String str = split[0];
                            java.lang.String str2 = split[1];
                            if (str.length() != 1 || str2.length() != 1) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Malformed folding statement - patterns are not single characters: ");
                                sb2.append(nextLine);
                                sb2.append(" in ");
                                sb2.append("org/apache/commons/codec/language/dmrules.txt");
                                throw new java.lang.IllegalArgumentException(sb2.toString());
                            }
                            hashMap2.put(java.lang.Character.valueOf(str.charAt(0)), java.lang.Character.valueOf(str2.charAt(0)));
                        } else {
                            java.lang.String[] split2 = trim.split("\\s+");
                            if (split2.length != 4) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Malformed rule statement split into ");
                                sb3.append(split2.length);
                                sb3.append(" parts: ");
                                sb3.append(nextLine);
                                sb3.append(" in ");
                                sb3.append("org/apache/commons/codec/language/dmrules.txt");
                                throw new java.lang.IllegalArgumentException(sb3.toString());
                            }
                            try {
                                org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule rule = new org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule(Camera2StreamConfigurationMap(split2[0]), Camera2StreamConfigurationMap(split2[1]), Camera2StreamConfigurationMap(split2[2]), Camera2StreamConfigurationMap(split2[3]));
                                ((java.util.List) hashMap.computeIfAbsent(java.lang.Character.valueOf(rule.getHighSpeedVideoSizes.charAt(0)), new java.util.function.Function() { // from class: org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda0
                                    @Override // java.util.function.Function
                                    public final java.lang.Object apply(java.lang.Object obj) {
                                        return org.apache.commons.codec.language.DaitchMokotoffSoundex.getHighResolutionOutputSizeshNQ4ISI();
                                    }
                                })).add(rule);
                            } catch (java.lang.IllegalArgumentException e) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Problem parsing line '");
                                sb4.append(i);
                                sb4.append("' in ");
                                sb4.append("org/apache/commons/codec/language/dmrules.txt");
                                throw new java.lang.IllegalStateException(sb4.toString(), e);
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    scanner.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        scanner.close();
        hashMap.forEach(new java.util.function.BiConsumer() { // from class: org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((java.util.List) obj2).sort(new java.util.Comparator() { // from class: org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda1
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return org.apache.commons.codec.language.DaitchMokotoffSoundex.getHighSpeedVideoSizes((org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule) obj3, (org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule) obj4);
                    }
                });
            }
        });
    }

    static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI() {
        return new java.util.ArrayList();
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public DaitchMokotoffSoundex() {
        this(true);
    }

    public DaitchMokotoffSoundex(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
        }
        return encode((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return getHighSpeedVideoSizes(str, false)[0];
    }

    public java.lang.String soundex(java.lang.String str) {
        java.lang.String[] highSpeedVideoSizes = getHighSpeedVideoSizes(str, true);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.String str2 : highSpeedVideoSizes) {
            sb.append(str2);
            i++;
            if (i < highSpeedVideoSizes.length) {
                sb.append('|');
            }
        }
        return sb.toString();
    }

    static /* synthetic */ int getHighSpeedVideoSizes(org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule rule, org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule rule2) {
        return rule2.getHighSpeedVideoSizes.length() - rule.getHighSpeedVideoSizes.length();
    }

    private java.lang.String[] getHighSpeedVideoSizes(java.lang.String str, boolean z) {
        java.lang.String str2;
        int i;
        java.lang.String[] strArr;
        java.lang.String str3;
        char c;
        int i2;
        org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch branch;
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        byte b = 0;
        for (char c2 : str.toCharArray()) {
            if (!java.lang.Character.isWhitespace(c2)) {
                char lowerCase = java.lang.Character.toLowerCase(c2);
                java.lang.Character ch = getHighSpeedVideoFpsRangesFor.get(java.lang.Character.valueOf(lowerCase));
                if (this.Camera2StreamConfigurationMap && ch != null) {
                    lowerCase = ch.charValue();
                }
                sb.append(lowerCase);
            }
        }
        java.lang.String obj = sb.toString();
        java.util.LinkedHashSet<org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch> linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(new org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch(b));
        int i3 = 0;
        char c3 = 0;
        while (i3 < obj.length()) {
            char charAt = obj.charAt(i3);
            if (!java.lang.Character.isWhitespace(charAt)) {
                java.lang.String substring = obj.substring(i3);
                java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule> list = getHighSpeedVideoSizes.get(java.lang.Character.valueOf(charAt));
                if (list != null) {
                    java.util.List arrayList = z ? new java.util.ArrayList() : java.util.Collections.emptyList();
                    java.util.Iterator<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = obj;
                            i = 1;
                            break;
                        }
                        org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule next = it.next();
                        if (substring.startsWith(next.getHighSpeedVideoSizes)) {
                            if (z) {
                                arrayList.clear();
                            }
                            if (c3 == 0) {
                                strArr = next.getHighSpeedVideoFpsRanges;
                            } else {
                                int length = next.getHighSpeedVideoSizes.length();
                                if (length < substring.length() && org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.getHighResolutionOutputSizeshNQ4ISI(substring.charAt(length))) {
                                    strArr = next.Camera2StreamConfigurationMap;
                                } else {
                                    strArr = next.getHighResolutionOutputSizeshNQ4ISI;
                                }
                            }
                            byte b2 = (strArr.length <= 1 || !z) ? b : (byte) 1;
                            for (org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch branch2 : linkedHashSet) {
                                int length2 = strArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length2) {
                                        str3 = obj;
                                        c = c3;
                                        break;
                                    }
                                    java.lang.String str4 = strArr[i4];
                                    if (b2 != 0) {
                                        branch = new org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch();
                                        str3 = obj;
                                        i2 = length2;
                                        branch.getHighSpeedVideoSizes.append(branch2.toString());
                                        branch.getHighSpeedVideoFpsRanges = branch2.getHighSpeedVideoFpsRanges;
                                    } else {
                                        str3 = obj;
                                        i2 = length2;
                                        branch = branch2;
                                    }
                                    boolean z2 = (c3 == 'm' && charAt == 'n') || (c3 == 'n' && charAt == 'm');
                                    java.lang.String str5 = branch.getHighSpeedVideoFpsRanges;
                                    if ((str5 == null || !str5.endsWith(str4) || z2) && branch.getHighSpeedVideoSizes.length() < 6) {
                                        branch.getHighSpeedVideoSizes.append(str4);
                                        if (branch.getHighSpeedVideoSizes.length() > 6) {
                                            java.lang.StringBuilder sb2 = branch.getHighSpeedVideoSizes;
                                            c = c3;
                                            sb2.delete(6, sb2.length());
                                        } else {
                                            c = c3;
                                        }
                                        branch.getHighResolutionOutputSizeshNQ4ISI = null;
                                    } else {
                                        c = c3;
                                    }
                                    branch.getHighSpeedVideoFpsRanges = str4;
                                    if (z) {
                                        arrayList.add(branch);
                                        i4++;
                                        obj = str3;
                                        length2 = i2;
                                        c3 = c;
                                    }
                                }
                                obj = str3;
                                c3 = c;
                            }
                            str2 = obj;
                            if (z) {
                                linkedHashSet.clear();
                                linkedHashSet.addAll(arrayList);
                            }
                            i = 1;
                            i3 += next.getHighSpeedVideoSizes.length() - 1;
                        }
                    }
                    c3 = charAt;
                    i3 += i;
                    obj = str2;
                    b = 0;
                }
            }
            str2 = obj;
            i = 1;
            c3 = c3;
            i3 += i;
            obj = str2;
            b = 0;
        }
        java.lang.String[] strArr2 = new java.lang.String[linkedHashSet.size()];
        int i5 = 0;
        for (org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch branch3 : linkedHashSet) {
            while (branch3.getHighSpeedVideoSizes.length() < 6) {
                branch3.getHighSpeedVideoSizes.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                branch3.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            strArr2[i5] = branch3.toString();
            i5++;
        }
        return strArr2;
    }
}
