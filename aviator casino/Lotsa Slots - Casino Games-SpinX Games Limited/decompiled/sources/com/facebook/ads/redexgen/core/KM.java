package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KM {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"GeuvjWmU0qMIecUET3rH1sSpSiCCpV8d", "VWuGBdV", "r1UddSi70yifv9lgmWBFhDm81yvqf6sz", "XTFXH6doUzlPXpn0lOcCpEMXSJ", "Gs3RvICYSdgYtTZ", "LUo1PxiU5xdJ1hZxjmijWXp8gfNxa8cO", "PBxwyL5R7nlTE13P8yY94OOBBe", "AYtcaoWRC0gFrEQm0SEPSBapgfKgyhaj"};
    public java.util.List<com.facebook.ads.redexgen.core.KM> A00;
    public final long A01;
    public final long A02;
    public final com.facebook.ads.redexgen.core.KM A03;
    public final com.facebook.ads.redexgen.core.KT A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final java.lang.String A07;
    public final java.lang.String A08;
    public final boolean A09;
    public final java.util.HashMap<java.lang.String, java.lang.Integer> A0A;
    public final java.util.HashMap<java.lang.String, java.lang.Integer> A0B;
    public final java.lang.String[] A0C;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() == 19) {
                throw new java.lang.RuntimeException();
            }
            A0E[1] = "X7T2v9MzXPQN9wm4iApZn5l";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
            i4++;
        }
    }

    public static void A04() {
        A0D = new byte[]{com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SO, 38, 43, 52, 92, 84, 69, 80, 85, 80, 69, 80, 95};
    }

    static {
        A04();
    }

    public KM(java.lang.String str, java.lang.String str2, long j, long j2, com.facebook.ads.redexgen.core.KT kt, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, com.facebook.ads.redexgen.core.KM km) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = kt;
        this.A0C = strArr;
        this.A09 = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(str3);
        this.A03 = km;
        this.A0B = new java.util.HashMap<>();
        this.A0A = new java.util.HashMap<>();
    }

    public static android.text.SpannableStringBuilder A00(java.lang.String str, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04103o> map) {
        if (!map.containsKey(str)) {
            com.facebook.ads.redexgen.core.C04103o c04103o = new com.facebook.ads.redexgen.core.C04103o();
            c04103o.A0G(new android.text.SpannableStringBuilder());
            map.put(str, c04103o);
        }
        com.facebook.ads.redexgen.core.C04103o regionOutput = map.get(str);
        return (android.text.SpannableStringBuilder) com.facebook.ads.redexgen.core.AbstractC04203y.A01(regionOutput.A0I());
    }

    public static com.facebook.ads.redexgen.core.KM A01(java.lang.String str) {
        return new com.facebook.ads.redexgen.core.KM(null, com.facebook.ads.redexgen.core.KO.A04(str), -9223372036854775807L, -9223372036854775807L, null, null, A03(0, 0, 119), null, null);
    }

    public static com.facebook.ads.redexgen.core.KM A02(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.KT kt, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, com.facebook.ads.redexgen.core.KM km) {
        return new com.facebook.ads.redexgen.core.KM(str, null, j, j2, kt, strArr, str2, str3, km);
    }

    private void A05(long j, java.lang.String str, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> regionImageList) {
        if (!A03(0, 0, 119).equals(this.A06)) {
            str = this.A06;
        }
        if (A0B(j)) {
            java.lang.String A03 = A03(2, 3, 18);
            java.lang.String resolvedRegionId = this.A07;
            if (A03.equals(resolvedRegionId)) {
                java.lang.String resolvedRegionId2 = this.A05;
                if (resolvedRegionId2 != null) {
                    regionImageList.add(new android.util.Pair<>(str, this.A05));
                    return;
                }
            }
        }
        for (int i = 0; i < A0C(); i++) {
            A0D(i).A05(j, str, regionImageList);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0089 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(long j, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KN> map2, java.lang.String str, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04103o> map3) {
        int end;
        java.lang.String str2 = str;
        if (A0B(j)) {
            if (!A03(0, 0, 119).equals(this.A06)) {
                str2 = this.A06;
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : this.A0A.entrySet()) {
                java.lang.String key = entry.getKey();
                if (this.A0B.containsKey(key)) {
                    end = this.A0B.get(key).intValue();
                } else {
                    end = 0;
                }
                int intValue = entry.getValue().intValue();
                if (end != intValue) {
                    A09(map, (com.facebook.ads.redexgen.core.C04103o) com.facebook.ads.redexgen.core.AbstractC04203y.A01(map3.get(key)), end, intValue, ((com.facebook.ads.redexgen.core.KN) com.facebook.ads.redexgen.core.AbstractC04203y.A01(map2.get(str2))).A08);
                }
            }
            for (int i = 0; i < i; i++) {
                A0D(i).A06(j, map, map2, str2, map3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        if (r14 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(long j, boolean z, java.lang.String str, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04103o> map) {
        boolean z2;
        java.lang.String str2 = str;
        this.A0B.clear();
        this.A0A.clear();
        if (A03(5, 8, 97).equals(this.A07)) {
            return;
        }
        if (!A03(0, 0, 119).equals(this.A06)) {
            str2 = this.A06;
        }
        if (this.A09 && z) {
            android.text.SpannableStringBuilder A00 = A00(str2, map);
            java.lang.String resolvedRegionId = this.A08;
            A00.append((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC04203y.A01(resolvedRegionId));
            return;
        }
        java.lang.String A03 = A03(0, 2, 44);
        java.lang.String resolvedRegionId2 = this.A07;
        if (A03.equals(resolvedRegionId2) && z) {
            android.text.SpannableStringBuilder A002 = A00(str2, map);
            java.lang.String[] strArr = A0E;
            if (strArr[0].charAt(26) == strArr[2].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[5] = "DvePMvlINfUrHf8oCshP3y2zgWJgm1y9";
            strArr2[7] = "g33vhajkRJhloC0qEKLO4Zm1g9rQEkrd";
            A002.append('\n');
            return;
        }
        if (!A0B(j)) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.facebook.ads.redexgen.core.C04103o> entry : map.entrySet()) {
            this.A0B.put(entry.getKey(), java.lang.Integer.valueOf(((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC04203y.A01(entry.getValue().A0I())).length()));
        }
        java.lang.String A032 = A03(13, 1, 127);
        java.lang.String resolvedRegionId3 = this.A07;
        boolean equals = A032.equals(resolvedRegionId3);
        for (int i = 0; i < A0C(); i++) {
            com.facebook.ads.redexgen.core.KM A0D2 = A0D(i);
            java.lang.String[] strArr3 = A0E;
            java.lang.String str3 = strArr3[3];
            java.lang.String resolvedRegionId4 = strArr3[6];
            if (str3.length() == resolvedRegionId4.length()) {
                A0E[1] = "BxcnzhC5XqKLAs";
            }
            A0D2.A07(j, z2, str2, map);
        }
        if (equals) {
            com.facebook.ads.redexgen.core.KO.A07(A00(str2, map));
        }
        for (java.util.Map.Entry<java.lang.String, com.facebook.ads.redexgen.core.C04103o> entry2 : map.entrySet()) {
            java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = this.A0A;
            java.lang.String key = entry2.getKey();
            com.facebook.ads.redexgen.core.C04103o value = entry2.getValue();
            java.lang.String[] strArr4 = A0E;
            if (strArr4[0].charAt(26) != strArr4[2].charAt(26)) {
                java.lang.String[] strArr5 = A0E;
                strArr5[3] = "NvsWEQBQe6VAGnQhJA54b4pVjA";
                strArr5[6] = "RDTsakCOEzYFACc9hnpkZM81VS";
                hashMap.put(key, java.lang.Integer.valueOf(((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC04203y.A01(value.A0I())).length()));
            } else {
                java.lang.String[] strArr6 = A0E;
                strArr6[5] = "CHxe0vxZr8lPRHvaCG5LBeS6gh9aVBuv";
                strArr6[7] = "HeV50lBh9JGf3GNHX7ZdMbjxgTQZONIp";
                hashMap.put(key, java.lang.Integer.valueOf(((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC04203y.A01(value.A0I())).length()));
            }
        }
    }

    public static void A08(android.text.SpannableStringBuilder spannableStringBuilder) {
        for (com.facebook.ads.redexgen.core.KF kf : (com.facebook.ads.redexgen.core.KF[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.facebook.ads.redexgen.core.KF.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kf), spannableStringBuilder.getSpanEnd(kf), (java.lang.CharSequence) A03(0, 0, 119));
        }
        loop1: for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                while (i2 < spannableStringBuilder.length()) {
                    char charAt = spannableStringBuilder.charAt(i2);
                    java.lang.String[] strArr = A0E;
                    java.lang.String str = strArr[5];
                    java.lang.String str2 = strArr[7];
                    int i3 = str.charAt(24);
                    if (i3 != str2.charAt(24)) {
                        break loop1;
                    }
                    java.lang.String[] strArr2 = A0E;
                    strArr2[0] = "TbkeKkbvotKRDkL3aJkR6CKPV2CRZepO";
                    strArr2[2] = "HOyzJt7YVHsiDEtesdPQS8q1On7uoMtF";
                    if (charAt != ' ') {
                        break;
                    } else {
                        i2++;
                    }
                }
                int j = i + 1;
                java.lang.String[] strArr3 = A0E;
                java.lang.String str3 = strArr3[0];
                java.lang.String str4 = strArr3[2];
                int i4 = str3.charAt(26);
                if (i4 == str4.charAt(26)) {
                    throw new java.lang.RuntimeException();
                }
                A0E[1] = "2IIAODStabB9";
                int i5 = i2 - j;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i, i + i5);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i6 + 1) == ' ') {
                int i7 = i6 + 1;
                spannableStringBuilder.delete(i7, i6 + 2);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i8 + 1) == '\n') {
                spannableStringBuilder.delete(i8, i8 + 1);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void A09(java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map, com.facebook.ads.redexgen.core.C04103o c04103o, int i, int i2, int i3) {
        com.facebook.ads.redexgen.core.KT A02 = com.facebook.ads.redexgen.core.KO.A02(this.A04, this.A0C, map);
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) c04103o.A0I();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new android.text.SpannableStringBuilder();
            c04103o.A0G(spannableStringBuilder);
        }
        if (A02 != null) {
            com.facebook.ads.redexgen.core.KO.A06(spannableStringBuilder, i, i2, A02, this.A03, map, i3);
            if (A03(13, 1, 127).equals(this.A07)) {
                if (A02.A04() != Float.MAX_VALUE) {
                    c04103o.A05((A02.A04() * (-90.0f)) / 100.0f);
                }
                if (A02.A0C() != null) {
                    c04103o.A0F(A02.A0C());
                }
                if (A02.A0B() != null) {
                    c04103o.A0E(A02.A0B());
                }
            }
        }
    }

    private void A0A(java.util.TreeSet<java.lang.Long> treeSet, boolean z) {
        boolean equals = A03(13, 1, 127).equals(this.A07);
        boolean isPNode = A03(2, 3, 18).equals(this.A07);
        if (z || equals || (isPNode && this.A05 != null)) {
            if (this.A02 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(this.A02));
            }
            if (this.A01 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i = 0; i < this.A00.size(); i++) {
            com.facebook.ads.redexgen.core.KM km = this.A00.get(i);
            boolean isPNode2 = z || equals;
            km.A0A(treeSet, isPNode2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r2 != (-9223372036854775807L)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean A0B(long j) {
        if (this.A02 != -9223372036854775807L || this.A01 != -9223372036854775807L) {
            if (this.A02 <= j) {
                long j2 = this.A01;
                if (A0E[1].length() == 19) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0E;
                strArr[5] = "RgXDLQ3a08cIBfoVnl1r1eLIg5MUrfoW";
                strArr[7] = "Ter36j0QNwpTucwH0VATqUwzgkfFz8sj";
            }
            if ((this.A02 != -9223372036854775807L || j >= this.A01) && (this.A02 > j || j >= this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int A0C() {
        if (this.A00 == null) {
            return 0;
        }
        java.util.List<com.facebook.ads.redexgen.core.KM> list = this.A00;
        if (A0E[4].length() == 7) {
            throw new java.lang.RuntimeException();
        }
        A0E[1] = "iiL";
        return list.size();
    }

    public final com.facebook.ads.redexgen.core.KM A0D(int i) {
        if (this.A00 != null) {
            return this.A00.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A0E(long j, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KN> map2, java.util.Map<java.lang.String, java.lang.String> imageMap) {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        A05(j, this.A06, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        A07(j, false, this.A06, treeMap);
        A06(j, map, map2, this.A06, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.util.Pair<java.lang.String, java.lang.String> pair : arrayList) {
            java.lang.String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] decode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
                com.facebook.ads.redexgen.core.KN kn = (com.facebook.ads.redexgen.core.KN) com.facebook.ads.redexgen.core.AbstractC04203y.A01(map2.get(pair.first));
                arrayList2.add(new com.facebook.ads.redexgen.core.C04103o().A0D(decodeByteArray).A04(kn.A02).A0A(0).A07(kn.A01, 0).A09(kn.A05).A06(kn.A04).A03(kn.A00).A0B(kn.A08).A0H());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.facebook.ads.redexgen.core.KN kn2 = (com.facebook.ads.redexgen.core.KN) com.facebook.ads.redexgen.core.AbstractC04203y.A01(map2.get(entry.getKey()));
            com.facebook.ads.redexgen.core.C04103o c04103o = (com.facebook.ads.redexgen.core.C04103o) entry.getValue();
            A08((android.text.SpannableStringBuilder) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04103o.A0I()));
            c04103o.A07(kn2.A01, kn2.A06);
            c04103o.A09(kn2.A05);
            c04103o.A04(kn2.A02);
            c04103o.A06(kn2.A04);
            c04103o.A08(kn2.A03, kn2.A07);
            c04103o.A0B(kn2.A08);
            arrayList2.add(c04103o.A0H());
        }
        return arrayList2;
    }

    public final void A0F(com.facebook.ads.redexgen.core.KM km) {
        if (this.A00 == null) {
            this.A00 = new java.util.ArrayList();
        }
        this.A00.add(km);
    }

    public final long[] A0G() {
        java.util.TreeSet<java.lang.Long> treeSet = new java.util.TreeSet<>();
        A0A(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i = 0;
        java.util.Iterator<java.lang.Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public final java.lang.String[] A0H() {
        return this.A0C;
    }
}
