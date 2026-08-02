package name.fraser.neil.plaintext;

/* loaded from: classes17.dex */
public class diff_match_patch {
    public float Diff_Timeout = 1.0f;
    public short Diff_EditCost = 4;
    public float Match_Threshold = 0.5f;
    public int Match_Distance = 1000;
    public float Patch_DeleteThreshold = 0.5f;
    public short Patch_Margin = 4;
    private short Camera2StreamConfigurationMap = 32;
    private java.util.regex.Pattern getHighSpeedVideoSizes = java.util.regex.Pattern.compile("\\n\\r?\\n\\Z", 32);
    private java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("\\A\\r?\\n\\r?\\n", 32);

    /* renamed from: name.fraser.neil.plaintext.diff_match_patch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[name.fraser.neil.plaintext.diff_match_patch.Operation.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static class Diff {
        public name.fraser.neil.plaintext.diff_match_patch.Operation operation;
        public java.lang.String text;

        public Diff(name.fraser.neil.plaintext.diff_match_patch.Operation operation, java.lang.String str) {
            this.operation = operation;
            this.text = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            name.fraser.neil.plaintext.diff_match_patch.Diff diff = (name.fraser.neil.plaintext.diff_match_patch.Diff) obj;
            if (this.operation != diff.operation) {
                return false;
            }
            java.lang.String str = this.text;
            if (str == null) {
                if (diff.text != null) {
                    return false;
                }
            } else if (!str.equals(diff.text)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation = this.operation;
            int hashCode = operation == null ? 0 : operation.hashCode();
            java.lang.String str = this.text;
            return ((str != null ? str.hashCode() : 0) * 31) + hashCode;
        }

        public java.lang.String toString() {
            java.lang.String replace = this.text.replace('\n', kotlin.text.Typography.paragraph);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Diff(");
            sb.append(this.operation);
            sb.append(",\"");
            sb.append(replace);
            sb.append("\")");
            return sb.toString();
        }
    }

    public static class LinesToCharsResult {
        protected java.lang.String chars1;
        protected java.lang.String chars2;
        protected java.util.List<java.lang.String> lineArray;

        public LinesToCharsResult(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
            this.chars1 = str;
            this.chars2 = str2;
            this.lineArray = list;
        }
    }

    public enum Operation {
        DELETE,
        INSERT,
        EQUAL
    }

    public static class Patch {
        public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diffs = new java.util.LinkedList<>();
        public int length1;
        public int length2;
        public int start1;
        public int start2;

        public java.lang.String toString() {
            java.lang.String obj;
            java.lang.String obj2;
            int i = this.length1;
            if (i == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.start1);
                sb.append(",0");
                obj = sb.toString();
            } else if (i == 1) {
                obj = java.lang.Integer.toString(this.start1 + 1);
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(this.start1 + 1);
                sb2.append(",");
                sb2.append(this.length1);
                obj = sb2.toString();
            }
            int i2 = this.length2;
            if (i2 == 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(this.start2);
                sb3.append(",0");
                obj2 = sb3.toString();
            } else if (i2 == 1) {
                obj2 = java.lang.Integer.toString(this.start2 + 1);
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(this.start2 + 1);
                sb4.append(",");
                sb4.append(this.length2);
                obj2 = sb4.toString();
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("@@ -");
            sb5.append(obj);
            sb5.append(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverviewKt.CryptoAdditionalItemSeparator);
            sb5.append(obj2);
            sb5.append(" @@\n");
            java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it = this.diffs.iterator();
            while (it.hasNext()) {
                name.fraser.neil.plaintext.diff_match_patch.Diff next = it.next();
                int i3 = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[next.operation.ordinal()];
                if (i3 == 1) {
                    sb5.append('+');
                } else if (i3 == 2) {
                    sb5.append('-');
                } else if (i3 == 3) {
                    sb5.append(' ');
                }
                try {
                    sb5.append(java.net.URLEncoder.encode(next.text, "UTF-8").replace('+', ' '));
                    sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new java.lang.Error("This system does not support UTF-8.", e);
                }
            }
            return name.fraser.neil.plaintext.diff_match_patch.getHighResolutionOutputSizeshNQ4ISI(sb5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return str.replace("%21", "!").replace("%7E", "~").replace("%27", "'").replace("%28", "(").replace("%29", ")").replace("%3B", ";").replace("%2F", androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR).replace("%3F", com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION).replace("%3A", io.ktor.sse.ServerSentEventKt.COLON).replace("%40", "@").replace("%26", "&").replace("%3D", "=").replace("%2B", "+").replace("%24", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD).replace("%2C", ",").replace("%23", "#");
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.Integer> map, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 0;
        int i3 = -1;
        while (i3 < str.length() - 1) {
            i3 = str.indexOf(10, i2);
            if (i3 == -1) {
                i3 = str.length() - 1;
            }
            java.lang.String substring = str.substring(i2, i3 + 1);
            if (map.containsKey(substring)) {
                sb.append(java.lang.String.valueOf((char) map.get(substring).intValue()));
            } else {
                if (list.size() == i) {
                    substring = str.substring(i2);
                    i3 = str.length();
                }
                list.add(substring);
                map.put(substring, java.lang.Integer.valueOf(list.size() - 1));
                sb.append(java.lang.String.valueOf((char) (list.size() - 1)));
            }
            i2 = i3 + 1;
        }
        return sb.toString();
    }

    private java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, int i, int i2, long j) {
        java.lang.String substring = str.substring(0, i);
        java.lang.String substring2 = str2.substring(0, i2);
        java.lang.String substring3 = str.substring(i);
        java.lang.String substring4 = str2.substring(i2);
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(substring, substring2, false, j);
        highSpeedVideoFpsRanges.addAll(getHighSpeedVideoFpsRanges(substring3, substring4, false, j));
        return highSpeedVideoFpsRanges;
    }

    private java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, boolean z, long j) {
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList = new java.util.LinkedList<>();
        if (str.length() == 0) {
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str2));
            return linkedList;
        }
        if (str2.length() == 0) {
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str));
            return linkedList;
        }
        java.lang.String str3 = str.length() > str2.length() ? str : str2;
        java.lang.String str4 = str.length() > str2.length() ? str2 : str;
        int indexOf = str3.indexOf(str4);
        if (indexOf != -1) {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation = str.length() > str2.length() ? name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE : name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT;
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(operation, str3.substring(0, indexOf)));
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str4));
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(operation, str3.substring(str4.length() + indexOf)));
            return linkedList;
        }
        if (str4.length() == 1) {
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str));
            linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str2));
            return linkedList;
        }
        java.lang.String[] diff_halfMatch = diff_halfMatch(str, str2);
        if (diff_halfMatch != null) {
            java.lang.String str5 = diff_halfMatch[0];
            java.lang.String str6 = diff_halfMatch[1];
            java.lang.String str7 = diff_halfMatch[2];
            java.lang.String str8 = diff_halfMatch[3];
            java.lang.String str9 = diff_halfMatch[4];
            java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str5, str7, z, j);
            java.util.Collection<? extends name.fraser.neil.plaintext.diff_match_patch.Diff> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str6, str8, z, j);
            highSpeedVideoFpsRanges.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str9));
            highSpeedVideoFpsRanges.addAll(highSpeedVideoFpsRanges2);
            return highSpeedVideoFpsRanges;
        }
        if (!z || str.length() <= 100 || str2.length() <= 100) {
            return diff_bisect(str, str2, j);
        }
        name.fraser.neil.plaintext.diff_match_patch.LinesToCharsResult diff_linesToChars = diff_linesToChars(str, str2);
        java.lang.String str10 = diff_linesToChars.chars1;
        java.lang.String str11 = diff_linesToChars.chars2;
        java.util.List<java.lang.String> list = diff_linesToChars.lineArray;
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(str10, str11, false, j);
        diff_charsToLines(highSpeedVideoFpsRanges3, list);
        diff_cleanupSemantic(highSpeedVideoFpsRanges3);
        highSpeedVideoFpsRanges3.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, ""));
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator = highSpeedVideoFpsRanges3.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next = listIterator.next();
        int i = 0;
        int i2 = 0;
        java.lang.String str12 = "";
        java.lang.String str13 = str12;
        while (next != null) {
            int i3 = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[next.operation.ordinal()];
            if (i3 == 1) {
                i++;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str13);
                sb.append(next.text);
                str13 = sb.toString();
            } else if (i3 == 2) {
                i2++;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str12);
                sb2.append(next.text);
                str12 = sb2.toString();
            } else if (i3 == 3) {
                if (i2 > 0 && i > 0) {
                    listIterator.previous();
                    for (int i4 = 0; i4 < i2 + i; i4++) {
                        listIterator.previous();
                        listIterator.remove();
                    }
                    java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it = getHighSpeedVideoFpsRanges(str12, str13, false, j).iterator();
                    while (it.hasNext()) {
                        listIterator.add(it.next());
                    }
                }
                i = 0;
                i2 = 0;
                str12 = "";
                str13 = str12;
            }
            next = listIterator.hasNext() ? listIterator.next() : null;
        }
        highSpeedVideoFpsRanges3.removeLast();
        return highSpeedVideoFpsRanges3;
    }

    private int getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return 6;
        }
        char charAt = str.charAt(str.length() - 1);
        char charAt2 = str2.charAt(0);
        boolean isLetterOrDigit = java.lang.Character.isLetterOrDigit(charAt);
        boolean isLetterOrDigit2 = java.lang.Character.isLetterOrDigit(charAt2);
        boolean z = !isLetterOrDigit && java.lang.Character.isWhitespace(charAt);
        boolean z2 = !isLetterOrDigit2 && java.lang.Character.isWhitespace(charAt2);
        boolean z3 = z && java.lang.Character.getType(charAt) == 15;
        boolean z4 = z2 && java.lang.Character.getType(charAt2) == 15;
        boolean z5 = z3 && this.getHighSpeedVideoSizes.matcher(str).find();
        boolean z6 = z4 && this.getHighResolutionOutputSizeshNQ4ISI.matcher(str2).find();
        if (z5 || z6) {
            return 5;
        }
        if (z3 || z4) {
            return 4;
        }
        if (!isLetterOrDigit && !z && z2) {
            return 3;
        }
        if (z || z2) {
            return 2;
        }
        return (isLetterOrDigit && isLetterOrDigit2) ? 0 : 1;
    }

    private double getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, java.lang.String str) {
        float length = i / str.length();
        int abs = java.lang.Math.abs(i3 - i2);
        if (this.Match_Distance != 0) {
            return (abs / r3) + length;
        }
        if (abs == 0) {
            return length;
        }
        return 1.0d;
    }

    private java.lang.String[] getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String substring = str.substring(i, (str.length() / 4) + i);
        java.lang.String str3 = "";
        int i2 = -1;
        java.lang.String str4 = "";
        java.lang.String str5 = str4;
        java.lang.String str6 = str5;
        java.lang.String str7 = str6;
        int i3 = -1;
        while (true) {
            i3 = str2.indexOf(substring, i3 + 1);
            if (i3 == i2) {
                break;
            }
            int diff_commonPrefix = diff_commonPrefix(str.substring(i), str2.substring(i3));
            int diff_commonSuffix = diff_commonSuffix(str.substring(0, i), str2.substring(0, i3));
            if (str3.length() < diff_commonSuffix + diff_commonPrefix) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = i3 - diff_commonSuffix;
                sb.append(str2.substring(i4, i3));
                int i5 = i3 + diff_commonPrefix;
                sb.append(str2.substring(i3, i5));
                str3 = sb.toString();
                java.lang.String substring2 = str.substring(0, i - diff_commonSuffix);
                java.lang.String substring3 = str.substring(i + diff_commonPrefix);
                java.lang.String substring4 = str2.substring(0, i4);
                str7 = str2.substring(i5);
                str4 = substring2;
                str5 = substring3;
                str6 = substring4;
            }
            i2 = -1;
        }
        if (str3.length() * 2 >= str.length()) {
            return new java.lang.String[]{str4, str5, str6, str7, str3};
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r7[r15 - 1] >= r7[r15 + 1]) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
    
        if (r20[r1 - 1] >= r20[r1 + 1]) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[LOOP:3: B:23:0x0077->B:27:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[EDGE_INSN: B:28:0x0092->B:29:0x0092 BREAK  A[LOOP:3: B:23:0x0077->B:27:0x0087], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121 A[LOOP:5: B:72:0x0103->B:76:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130 A[EDGE_INSN: B:77:0x0130->B:78:0x0130 BREAK  A[LOOP:5: B:72:0x0103->B:76:0x0121], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_bisect(java.lang.String str, java.lang.String str2, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        java.lang.String str3 = str;
        int length = str.length();
        int length2 = str2.length();
        int i13 = ((length + length2) + 1) / 2;
        int i14 = i13 * 2;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            iArr2[i16] = -1;
            iArr3[i16] = -1;
        }
        int i17 = i13 + 1;
        iArr2[i17] = 0;
        iArr3[i17] = 0;
        int i18 = length - length2;
        boolean z = i18 % 2 != 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i15 < i13 && java.lang.System.currentTimeMillis() <= j) {
            int i23 = -i15;
            int i24 = i21;
            int i25 = i23 + i19;
            while (i25 <= i15 - i20) {
                int i26 = i13 + i25;
                if (i25 != i23) {
                    if (i25 != i15) {
                        i7 = i15;
                        i8 = i23;
                    } else {
                        i7 = i15;
                        i8 = i23;
                    }
                    i9 = iArr2[i26 - 1] + 1;
                    i10 = i9 - i25;
                    while (i9 < length && i10 < length2) {
                        iArr = iArr3;
                        if (str3.charAt(i9) == str2.charAt(i10)) {
                            break;
                        }
                        i9++;
                        i10++;
                        str3 = str;
                        iArr3 = iArr;
                    }
                    iArr = iArr3;
                    iArr2[i26] = i9;
                    if (i9 <= length) {
                        i20 += 2;
                    } else if (i10 > length2) {
                        i19 += 2;
                    } else if (z && (i11 = (i13 + i18) - i25) >= 0 && i11 < i14 && (i12 = iArr[i11]) != -1 && i9 >= length - i12) {
                        return getHighResolutionOutputSizeshNQ4ISI(str, str2, i9, i10, j);
                    }
                    i25 += 2;
                    str3 = str;
                    iArr3 = iArr;
                    i15 = i7;
                    i23 = i8;
                } else {
                    i7 = i15;
                    i8 = i23;
                }
                i9 = iArr2[i26 + 1];
                i10 = i9 - i25;
                while (i9 < length) {
                    iArr = iArr3;
                    if (str3.charAt(i9) == str2.charAt(i10)) {
                    }
                }
                iArr = iArr3;
                iArr2[i26] = i9;
                if (i9 <= length) {
                }
                i25 += 2;
                str3 = str;
                iArr3 = iArr;
                i15 = i7;
                i23 = i8;
            }
            int[] iArr4 = iArr3;
            int i27 = i15;
            int i28 = i23;
            int i29 = i28 + i24;
            i21 = i24;
            while (i29 <= i27 - i22) {
                int i30 = i13 + i29;
                int i31 = i28;
                if (i29 != i31) {
                    i = i27;
                    if (i29 != i) {
                        i28 = i31;
                    } else {
                        i28 = i31;
                    }
                    i2 = iArr4[i30 - 1] + 1;
                    i3 = i2 - i29;
                    while (i2 < length && i3 < length2) {
                        i4 = i19;
                        i5 = i20;
                        if (str.charAt((length - i2) - 1) == str2.charAt((length2 - i3) - 1)) {
                            break;
                        }
                        i2++;
                        i3++;
                        i20 = i5;
                        i19 = i4;
                    }
                    i4 = i19;
                    i5 = i20;
                    iArr4[i30] = i2;
                    if (i2 <= length) {
                        i22 += 2;
                    } else if (i3 > length2) {
                        i21 += 2;
                    } else if (!z && (i6 = (i13 + i18) - i29) >= 0 && i6 < i14) {
                        int i32 = iArr2[i6];
                        if (i32 != -1 && i32 >= length - i2) {
                            return getHighResolutionOutputSizeshNQ4ISI(str, str2, i32, (i13 + i32) - i6, j);
                        }
                        i29 += 2;
                        i20 = i5;
                        i19 = i4;
                        i27 = i;
                    }
                    i29 += 2;
                    i20 = i5;
                    i19 = i4;
                    i27 = i;
                } else {
                    i28 = i31;
                    i = i27;
                }
                i2 = iArr4[i30 + 1];
                i3 = i2 - i29;
                while (i2 < length) {
                    i4 = i19;
                    i5 = i20;
                    if (str.charAt((length - i2) - 1) == str2.charAt((length2 - i3) - 1)) {
                    }
                }
                i4 = i19;
                i5 = i20;
                iArr4[i30] = i2;
                if (i2 <= length) {
                }
                i29 += 2;
                i20 = i5;
                i19 = i4;
                i27 = i;
            }
            i15 = i27 + 1;
            str3 = str;
            iArr3 = iArr4;
            i19 = i19;
        }
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList = new java.util.LinkedList<>();
        linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str));
        linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str2));
        return linkedList;
    }

    public void diff_charsToLines(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list, java.util.List<java.lang.String> list2) {
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < diff.text.length(); i++) {
                sb.append(list2.get(diff.text.charAt(i)));
            }
            diff.text = sb.toString();
        }
    }

    public void diff_cleanupEfficiency(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        int i;
        if (linkedList.isEmpty()) {
            return;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator = linkedList.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next = listIterator.next();
        name.fraser.neil.plaintext.diff_match_patch.Diff diff = next;
        java.lang.String str = null;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (next != null) {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation = next.operation;
            if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                if (next.text.length() >= this.Diff_EditCost || (i3 == 0 && i2 == 0)) {
                    arrayDeque.clear();
                    str = null;
                    i3 = i4;
                    i2 = i5;
                } else {
                    arrayDeque.push(next);
                    str = next.text;
                    next = diff;
                }
                diff = next;
                i5 = i2;
                i4 = i3;
                i2 = 0;
                i3 = 0;
            } else {
                if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                    i2 = 1;
                } else {
                    i3 = 1;
                }
                if (str != null && ((i4 != 0 && i5 != 0 && i3 != 0 && i2 != 0) || (str.length() < this.Diff_EditCost / 2 && i4 + i5 + i3 + i2 == 3))) {
                    while (next != arrayDeque.peek()) {
                        next = listIterator.previous();
                    }
                    listIterator.next();
                    listIterator.set(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str));
                    name.fraser.neil.plaintext.diff_match_patch.Diff diff2 = new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str);
                    listIterator.add(diff2);
                    arrayDeque.pop();
                    if (i4 == 0 || i5 == 0) {
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.pop();
                        }
                        while ((arrayDeque.isEmpty() ? diff : (name.fraser.neil.plaintext.diff_match_patch.Diff) arrayDeque.peek()) != listIterator.previous()) {
                        }
                        i = 0;
                    } else {
                        arrayDeque.clear();
                        diff = diff2;
                        i = 1;
                    }
                    i2 = i;
                    i3 = i2;
                    str = null;
                    z = true;
                }
            }
            next = listIterator.hasNext() ? listIterator.next() : null;
        }
        if (z) {
            diff_cleanupMerge(linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0279 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diff_cleanupMerge(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        boolean z;
        name.fraser.neil.plaintext.diff_match_patch.Diff diff;
        name.fraser.neil.plaintext.diff_match_patch.Diff next;
        linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, ""));
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator = linkedList.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next2 = listIterator.next();
        java.lang.String str = "";
        java.lang.String str2 = str;
        int i = 0;
        int i2 = 0;
        name.fraser.neil.plaintext.diff_match_patch.Diff diff2 = null;
        while (true) {
            if (next2 == null) {
                break;
            }
            int i3 = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[next2.operation.ordinal()];
            if (i3 == 1) {
                i++;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(next2.text);
                str = sb.toString();
            } else if (i3 != 2) {
                if (i3 == 3) {
                    if (i2 + i > 1) {
                        boolean z2 = (i2 == 0 || i == 0) ? false : true;
                        listIterator.previous();
                        while (i2 > 0) {
                            listIterator.previous();
                            listIterator.remove();
                            i2--;
                        }
                        while (i > 0) {
                            listIterator.previous();
                            listIterator.remove();
                            i--;
                        }
                        if (z2) {
                            int diff_commonPrefix = diff_commonPrefix(str, str2);
                            if (diff_commonPrefix != 0) {
                                if (listIterator.hasPrevious()) {
                                    name.fraser.neil.plaintext.diff_match_patch.Diff previous = listIterator.previous();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(previous.text);
                                    sb2.append(str.substring(0, diff_commonPrefix));
                                    previous.text = sb2.toString();
                                    listIterator.next();
                                } else {
                                    listIterator.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str.substring(0, diff_commonPrefix)));
                                }
                                java.lang.String substring = str.substring(diff_commonPrefix);
                                str2 = str2.substring(diff_commonPrefix);
                                str = substring;
                            }
                            int diff_commonSuffix = diff_commonSuffix(str, str2);
                            if (diff_commonSuffix != 0) {
                                name.fraser.neil.plaintext.diff_match_patch.Diff next3 = listIterator.next();
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append(str.substring(str.length() - diff_commonSuffix));
                                sb3.append(next3.text);
                                next3.text = sb3.toString();
                                str = str.substring(0, str.length() - diff_commonSuffix);
                                str2 = str2.substring(0, str2.length() - diff_commonSuffix);
                                listIterator.previous();
                            }
                        }
                        if (str2.length() != 0) {
                            listIterator.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str2));
                        }
                        if (str.length() != 0) {
                            listIterator.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str));
                        }
                        next2 = listIterator.hasNext() ? listIterator.next() : null;
                    } else if (diff2 != null) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(diff2.text);
                        sb4.append(next2.text);
                        diff2.text = sb4.toString();
                        listIterator.remove();
                        next2 = listIterator.previous();
                        listIterator.next();
                    }
                    diff2 = next2;
                    str = "";
                    str2 = str;
                    i = 0;
                    i2 = 0;
                }
                next2 = !listIterator.hasNext() ? listIterator.next() : null;
            } else {
                i2++;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str2);
                sb5.append(next2.text);
                str2 = sb5.toString();
            }
            diff2 = null;
            if (!listIterator.hasNext()) {
            }
        }
        if (linkedList.getLast().text.length() == 0) {
            linkedList.removeLast();
        }
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator2 = linkedList.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next4 = listIterator2.hasNext() ? listIterator2.next() : null;
        name.fraser.neil.plaintext.diff_match_patch.Diff next5 = listIterator2.hasNext() ? listIterator2.next() : null;
        if (listIterator2.hasNext()) {
            diff = listIterator2.next();
            z = false;
        } else {
            z = false;
            diff = null;
        }
        while (diff != null) {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation = next4.operation;
            name.fraser.neil.plaintext.diff_match_patch.Operation operation2 = name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL;
            if (operation == operation2 && diff.operation == operation2) {
                if (next5.text.endsWith(next4.text)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(next4.text);
                    java.lang.String str3 = next5.text;
                    sb6.append(str3.substring(0, str3.length() - next4.text.length()));
                    next5.text = sb6.toString();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(next4.text);
                    sb7.append(diff.text);
                    diff.text = sb7.toString();
                    listIterator2.previous();
                    listIterator2.previous();
                    listIterator2.previous();
                    listIterator2.remove();
                    listIterator2.next();
                    next5 = listIterator2.next();
                    if (listIterator2.hasNext()) {
                        next = listIterator2.next();
                        z = true;
                        name.fraser.neil.plaintext.diff_match_patch.Diff diff3 = next5;
                        next5 = next;
                        next4 = diff3;
                        if (listIterator2.hasNext()) {
                            diff = listIterator2.next();
                        } else {
                            z = z;
                            diff = null;
                        }
                    }
                    next = null;
                    z = true;
                    name.fraser.neil.plaintext.diff_match_patch.Diff diff32 = next5;
                    next5 = next;
                    next4 = diff32;
                    if (listIterator2.hasNext()) {
                    }
                } else if (next5.text.startsWith(diff.text)) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(next4.text);
                    sb8.append(diff.text);
                    next4.text = sb8.toString();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(next5.text.substring(diff.text.length()));
                    sb9.append(diff.text);
                    next5.text = sb9.toString();
                    listIterator2.remove();
                    if (listIterator2.hasNext()) {
                        next = listIterator2.next();
                        z = true;
                        name.fraser.neil.plaintext.diff_match_patch.Diff diff322 = next5;
                        next5 = next;
                        next4 = diff322;
                        if (listIterator2.hasNext()) {
                        }
                    }
                    next = null;
                    z = true;
                    name.fraser.neil.plaintext.diff_match_patch.Diff diff3222 = next5;
                    next5 = next;
                    next4 = diff3222;
                    if (listIterator2.hasNext()) {
                    }
                }
            }
            next4 = next5;
            next5 = diff;
            if (listIterator2.hasNext()) {
            }
        }
        if (z) {
            diff_cleanupMerge(linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194 A[LOOP:4: B:54:0x00e7->B:71:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diff_cleanupSemantic(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        name.fraser.neil.plaintext.diff_match_patch.Diff diff;
        name.fraser.neil.plaintext.diff_match_patch.Diff diff2;
        int i;
        if (linkedList.isEmpty()) {
            return;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator = linkedList.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next = listIterator.next();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        java.lang.String str = null;
        while (next != null) {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation = next.operation;
            if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                arrayDeque.push(next);
                str = next.text;
                i5 = i3;
                i6 = i4;
                i3 = 0;
                i4 = 0;
            } else {
                if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                    i3 += next.text.length();
                } else {
                    i4 += next.text.length();
                }
                if (str != null && str.length() <= java.lang.Math.max(i5, i6) && str.length() <= java.lang.Math.max(i3, i4)) {
                    while (next != arrayDeque.peek()) {
                        next = listIterator.previous();
                    }
                    listIterator.next();
                    listIterator.set(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, str));
                    listIterator.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, str));
                    arrayDeque.pop();
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.pop();
                    }
                    if (arrayDeque.isEmpty()) {
                        while (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    } else {
                        while (((name.fraser.neil.plaintext.diff_match_patch.Diff) arrayDeque.peek()) != listIterator.previous()) {
                        }
                    }
                    z = true;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    str = null;
                }
            }
            next = listIterator.hasNext() ? listIterator.next() : null;
        }
        if (z) {
            diff_cleanupMerge(linkedList);
        }
        diff_cleanupSemanticLossless(linkedList);
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator2 = linkedList.listIterator();
        if (listIterator2.hasNext()) {
            diff = listIterator2.next();
            if (listIterator2.hasNext()) {
                diff2 = listIterator2.next();
            } else {
                i = 0;
                i2 = i;
                diff2 = null;
            }
        } else {
            diff = null;
            diff2 = null;
        }
        while (diff2 != null) {
            name.fraser.neil.plaintext.diff_match_patch.Operation operation2 = diff.operation;
            name.fraser.neil.plaintext.diff_match_patch.Operation operation3 = name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE;
            if (operation2 == operation3) {
                name.fraser.neil.plaintext.diff_match_patch.Operation operation4 = diff2.operation;
                name.fraser.neil.plaintext.diff_match_patch.Operation operation5 = name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT;
                if (operation4 == operation5) {
                    java.lang.String str2 = diff.text;
                    java.lang.String str3 = diff2.text;
                    int diff_commonOverlap = diff_commonOverlap(str2, str3);
                    int diff_commonOverlap2 = diff_commonOverlap(str3, str2);
                    if (diff_commonOverlap >= diff_commonOverlap2) {
                        double d = diff_commonOverlap;
                        if (d >= str2.length() / 2.0d || d >= str3.length() / 2.0d) {
                            listIterator2.previous();
                            listIterator2.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str3.substring(i2, diff_commonOverlap)));
                            diff.text = str2.substring(i2, str2.length() - diff_commonOverlap);
                            diff2.text = str3.substring(diff_commonOverlap);
                        }
                        i = i2;
                    } else {
                        double d2 = diff_commonOverlap2;
                        if (d2 >= str2.length() / 2.0d || d2 >= str3.length() / 2.0d) {
                            listIterator2.previous();
                            i = 0;
                            listIterator2.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str2.substring(0, diff_commonOverlap2)));
                            diff.operation = operation5;
                            diff.text = str3.substring(0, str3.length() - diff_commonOverlap2);
                            diff2.operation = operation3;
                            diff2.text = str2.substring(diff_commonOverlap2);
                        } else {
                            i = 0;
                        }
                    }
                    diff = listIterator2.hasNext() ? listIterator2.next() : null;
                    if (listIterator2.hasNext()) {
                        i2 = i;
                        diff2 = null;
                        while (diff2 != null) {
                        }
                    } else {
                        diff2 = listIterator2.next();
                        i2 = i;
                    }
                }
            }
            i = i2;
            diff = diff2;
            if (listIterator2.hasNext()) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x002f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diff_cleanupSemanticLossless(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        name.fraser.neil.plaintext.diff_match_patch.Diff diff;
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Diff> listIterator = linkedList.listIterator();
        name.fraser.neil.plaintext.diff_match_patch.Diff next = listIterator.hasNext() ? listIterator.next() : null;
        name.fraser.neil.plaintext.diff_match_patch.Diff next2 = listIterator.hasNext() ? listIterator.next() : null;
        if (listIterator.hasNext()) {
            diff = listIterator.next();
            while (diff != null) {
                name.fraser.neil.plaintext.diff_match_patch.Operation operation = next.operation;
                name.fraser.neil.plaintext.diff_match_patch.Operation operation2 = name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL;
                if (operation == operation2 && diff.operation == operation2) {
                    java.lang.String str = next.text;
                    java.lang.String str2 = next2.text;
                    java.lang.String str3 = diff.text;
                    int diff_commonSuffix = diff_commonSuffix(str, str2);
                    if (diff_commonSuffix != 0) {
                        java.lang.String substring = str2.substring(str2.length() - diff_commonSuffix);
                        str = str.substring(0, str.length() - diff_commonSuffix);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(substring);
                        sb.append(str2.substring(0, str2.length() - diff_commonSuffix));
                        str2 = sb.toString();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(substring);
                        sb2.append(str3);
                        str3 = sb2.toString();
                    }
                    java.lang.String str4 = str3;
                    java.lang.String str5 = str4;
                    int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, str2) + getHighSpeedVideoFpsRanges(str2, str3);
                    java.lang.String str6 = str2;
                    java.lang.String str7 = str6;
                    java.lang.String str8 = str;
                    while (str6.length() != 0 && str4.length() != 0 && str6.charAt(0) == str4.charAt(0)) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(str8);
                        sb3.append(str6.charAt(0));
                        str8 = sb3.toString();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(str6.substring(1));
                        sb4.append(str4.charAt(0));
                        str6 = sb4.toString();
                        str4 = str4.substring(1);
                        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str8, str6) + getHighSpeedVideoFpsRanges(str6, str4);
                        if (highSpeedVideoFpsRanges2 >= highSpeedVideoFpsRanges) {
                            str = str8;
                            str7 = str6;
                            str5 = str4;
                            highSpeedVideoFpsRanges = highSpeedVideoFpsRanges2;
                        }
                    }
                    if (!next.text.equals(str)) {
                        if (str.length() != 0) {
                            next.text = str;
                        } else {
                            listIterator.previous();
                            listIterator.previous();
                            listIterator.previous();
                            listIterator.remove();
                            listIterator.next();
                            listIterator.next();
                        }
                        next2.text = str7;
                        if (str5.length() != 0) {
                            diff.text = str5;
                        } else {
                            listIterator.remove();
                            if (!listIterator.hasNext()) {
                                diff = listIterator.next();
                            }
                        }
                    }
                }
                next = next2;
                next2 = diff;
                if (!listIterator.hasNext()) {
                }
            }
            return;
        }
        diff = null;
    }

    public int diff_commonOverlap(java.lang.String str, java.lang.String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        if (length > length2) {
            str = str.substring(length - length2);
        } else if (length < length2) {
            str2 = str2.substring(0, length);
        }
        int min = java.lang.Math.min(length, length2);
        if (str.equals(str2)) {
            return min;
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            int indexOf = str2.indexOf(str.substring(min - i));
            if (indexOf == -1) {
                return i2;
            }
            i += indexOf;
            if (indexOf == 0 || str.substring(min - i).equals(str2.substring(0, i))) {
                i2 = i;
                i++;
            }
        }
    }

    public int diff_commonPrefix(java.lang.String str, java.lang.String str2) {
        int min = java.lang.Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }

    public int diff_commonSuffix(java.lang.String str, java.lang.String str2) {
        int length = str.length();
        int length2 = str2.length();
        int min = java.lang.Math.min(length, length2);
        for (int i = 1; i <= min; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return min;
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_fromDelta(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList = new java.util.LinkedList<>();
        int i = 0;
        for (java.lang.String str3 : str2.split("\t")) {
            if (str3.length() != 0) {
                java.lang.String substring = str3.substring(1);
                char charAt = str3.charAt(0);
                if (charAt == '+') {
                    java.lang.String replace = substring.replace("+", "%2B");
                    try {
                        linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, java.net.URLDecoder.decode(replace, "UTF-8")));
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.Error("This system does not support UTF-8.", e);
                    } catch (java.lang.IllegalArgumentException e2) {
                        throw new java.lang.IllegalArgumentException("Illegal escape in diff_fromDelta: ".concat(java.lang.String.valueOf(replace)), e2);
                    }
                } else {
                    if (charAt != '-' && charAt != '=') {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid diff operation in diff_fromDelta: ");
                        sb.append(str3.charAt(0));
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    try {
                        int parseInt = java.lang.Integer.parseInt(substring);
                        if (parseInt < 0) {
                            throw new java.lang.IllegalArgumentException("Negative number in diff_fromDelta: ".concat(java.lang.String.valueOf(substring)));
                        }
                        int i2 = parseInt + i;
                        try {
                            java.lang.String substring2 = str.substring(i, i2);
                            if (str3.charAt(0) == '=') {
                                linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring2));
                            } else {
                                linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, substring2));
                            }
                            i = i2;
                        } catch (java.lang.StringIndexOutOfBoundsException e3) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Delta length (");
                            sb2.append(i2);
                            sb2.append(") larger than source text length (");
                            sb2.append(str.length());
                            sb2.append(").");
                            throw new java.lang.IllegalArgumentException(sb2.toString(), e3);
                        }
                    } catch (java.lang.NumberFormatException e4) {
                        throw new java.lang.IllegalArgumentException("Invalid number in diff_fromDelta: ".concat(java.lang.String.valueOf(substring)), e4);
                    }
                }
            }
        }
        if (i == str.length()) {
            return linkedList;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Delta length (");
        sb3.append(i);
        sb3.append(") smaller than source text length (");
        sb3.append(str.length());
        sb3.append(").");
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    public java.lang.String[] diff_halfMatch(java.lang.String str, java.lang.String str2) {
        if (this.Diff_Timeout <= 0.0f) {
            return null;
        }
        java.lang.String str3 = str.length() > str2.length() ? str : str2;
        java.lang.String str4 = str.length() > str2.length() ? str2 : str;
        if (str3.length() < 4 || str4.length() * 2 < str3.length()) {
            return null;
        }
        java.lang.String[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3, str4, (str3.length() + 3) / 4);
        java.lang.String[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(str3, str4, (str3.length() + 1) / 2);
        if (highSpeedVideoFpsRangesFor == null && highSpeedVideoFpsRangesFor2 == null) {
            return null;
        }
        if (highSpeedVideoFpsRangesFor2 != null && (highSpeedVideoFpsRangesFor == null || highSpeedVideoFpsRangesFor[4].length() <= highSpeedVideoFpsRangesFor2[4].length())) {
            highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
        }
        return str.length() > str2.length() ? highSpeedVideoFpsRangesFor : new java.lang.String[]{highSpeedVideoFpsRangesFor[2], highSpeedVideoFpsRangesFor[3], highSpeedVideoFpsRangesFor[0], highSpeedVideoFpsRangesFor[1], highSpeedVideoFpsRangesFor[4]};
    }

    public int diff_levenshtein(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            int i4 = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[diff.operation.ordinal()];
            if (i4 == 1) {
                i += diff.text.length();
            } else if (i4 == 2) {
                i2 += diff.text.length();
            } else if (i4 == 3) {
                i3 += java.lang.Math.max(i, i2);
                i = 0;
                i2 = 0;
            }
        }
        return java.lang.Math.max(i, i2) + i3;
    }

    public name.fraser.neil.plaintext.diff_match_patch.LinesToCharsResult diff_linesToChars(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        arrayList.add("");
        return new name.fraser.neil.plaintext.diff_match_patch.LinesToCharsResult(getHighResolutionOutputSizeshNQ4ISI(str, arrayList, hashMap, com.google.android.gms.auth.blockstore.BlockstoreStatusCodes.MAX_SIZE_EXCEEDED), getHighResolutionOutputSizeshNQ4ISI(str2, arrayList, hashMap, 65535), arrayList);
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_main(java.lang.String str, java.lang.String str2) {
        return diff_main(str, str2, true);
    }

    public java.lang.String diff_prettyHtml(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            java.lang.String replace = diff.text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "&para;<br>");
            int i = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[diff.operation.ordinal()];
            if (i == 1) {
                sb.append("<ins style=\"background:#e6ffe6;\">");
                sb.append(replace);
                sb.append("</ins>");
            } else if (i == 2) {
                sb.append("<del style=\"background:#ffe6e6;\">");
                sb.append(replace);
                sb.append("</del>");
            } else if (i == 3) {
                sb.append("<span>");
                sb.append(replace);
                sb.append("</span>");
            }
        }
        return sb.toString();
    }

    public java.lang.String diff_text1(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            if (diff.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                sb.append(diff.text);
            }
        }
        return sb.toString();
    }

    public java.lang.String diff_text2(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            if (diff.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                sb.append(diff.text);
            }
        }
        return sb.toString();
    }

    public java.lang.String diff_toDelta(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (name.fraser.neil.plaintext.diff_match_patch.Diff diff : list) {
            int i = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[diff.operation.ordinal()];
            if (i == 1) {
                try {
                    sb.append("+");
                    sb.append(java.net.URLEncoder.encode(diff.text, "UTF-8").replace('+', ' '));
                    sb.append("\t");
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new java.lang.Error("This system does not support UTF-8.", e);
                }
            } else if (i == 2) {
                sb.append("-");
                sb.append(diff.text.length());
                sb.append("\t");
            } else if (i == 3) {
                sb.append("=");
                sb.append(diff.text.length());
                sb.append("\t");
            }
        }
        java.lang.String obj = sb.toString();
        return obj.length() != 0 ? getHighResolutionOutputSizeshNQ4ISI(obj.substring(0, obj.length() - 1)) : obj;
    }

    public int diff_xIndex(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Diff> list, int i) {
        name.fraser.neil.plaintext.diff_match_patch.Diff diff;
        java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                diff = null;
                break;
            }
            diff = it.next();
            if (diff.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                i2 = diff.text.length() + i2;
            }
            if (diff.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                i3 = diff.text.length() + i3;
            }
            if (i2 > i) {
                break;
            }
            i5 = i2;
            i4 = i3;
        }
        return (diff == null || diff.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) ? (i - i5) + i4 : i4;
    }

    public java.util.Map<java.lang.Character, java.lang.Integer> match_alphabet(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            hashMap.put(java.lang.Character.valueOf(c), 0);
        }
        int i = 0;
        for (char c2 : charArray) {
            hashMap.put(java.lang.Character.valueOf(c2), java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(java.lang.Character.valueOf(c2))).intValue() | (1 << ((str.length() - i) - 1))));
            i++;
        }
        return hashMap;
    }

    public int match_main(java.lang.String str, java.lang.String str2, int i) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Null inputs. (match_main)");
        }
        int max = java.lang.Math.max(0, java.lang.Math.min(i, str.length()));
        if (str.equals(str2)) {
            return 0;
        }
        if (str.length() == 0) {
            return -1;
        }
        return (str2.length() + max > str.length() || !str.substring(max, str2.length() + max).equals(str2)) ? match_bitap(str, str2, max) : max;
    }

    public void patch_addContext(name.fraser.neil.plaintext.diff_match_patch.Patch patch, java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        int i = patch.start2;
        java.lang.String substring = str.substring(i, patch.length1 + i);
        int i2 = 0;
        while (str.indexOf(substring) != str.lastIndexOf(substring)) {
            int length = substring.length();
            short s = this.Camera2StreamConfigurationMap;
            short s2 = this.Patch_Margin;
            if (length >= (s - s2) - s2) {
                break;
            }
            i2 += s2;
            substring = str.substring(java.lang.Math.max(0, patch.start2 - i2), java.lang.Math.min(str.length(), patch.start2 + patch.length1 + i2));
        }
        int i3 = i2 + this.Patch_Margin;
        java.lang.String substring2 = str.substring(java.lang.Math.max(0, patch.start2 - i3), patch.start2);
        if (substring2.length() != 0) {
            patch.diffs.addFirst(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring2));
        }
        java.lang.String substring3 = str.substring(patch.start2 + patch.length1, java.lang.Math.min(str.length(), patch.start2 + patch.length1 + i3));
        if (substring3.length() != 0) {
            patch.diffs.addLast(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring3));
        }
        patch.start1 -= substring2.length();
        patch.start2 -= substring2.length();
        patch.length1 = substring3.length() + substring2.length() + patch.length1;
        patch.length2 = substring3.length() + substring2.length() + patch.length2;
    }

    public java.lang.String patch_addPadding(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList) {
        short s = this.Patch_Margin;
        java.lang.String str = "";
        for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(java.lang.String.valueOf((char) s2));
            str = sb.toString();
        }
        java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Patch> it = linkedList.iterator();
        while (it.hasNext()) {
            name.fraser.neil.plaintext.diff_match_patch.Patch next = it.next();
            next.start1 += s;
            next.start2 += s;
        }
        name.fraser.neil.plaintext.diff_match_patch.Patch first = linkedList.getFirst();
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList2 = first.diffs;
        if (linkedList2.isEmpty() || linkedList2.getFirst().operation != name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
            linkedList2.addFirst(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str));
            first.start1 -= s;
            first.start2 -= s;
            first.length1 += s;
            first.length2 += s;
        } else if (s > linkedList2.getFirst().text.length()) {
            name.fraser.neil.plaintext.diff_match_patch.Diff first2 = linkedList2.getFirst();
            int length = s - first2.text.length();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str.substring(first2.text.length()));
            sb2.append(first2.text);
            first2.text = sb2.toString();
            first.start1 -= length;
            first.start2 -= length;
            first.length1 += length;
            first.length2 += length;
        }
        name.fraser.neil.plaintext.diff_match_patch.Patch last = linkedList.getLast();
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList3 = last.diffs;
        if (linkedList3.isEmpty() || linkedList3.getLast().operation != name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
            linkedList3.addLast(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str));
            last.length1 += s;
            last.length2 += s;
            return str;
        }
        if (s > linkedList3.getLast().text.length()) {
            name.fraser.neil.plaintext.diff_match_patch.Diff last2 = linkedList3.getLast();
            int length2 = s - last2.text.length();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(last2.text);
            sb3.append(str.substring(0, length2));
            last2.text = sb3.toString();
            last.length1 += length2;
            last.length2 += length2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object[] patch_apply(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList, java.lang.String str) {
        int match_main;
        int i;
        if (linkedList.isEmpty()) {
            return new java.lang.Object[]{str, new boolean[0]};
        }
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_deepCopy = patch_deepCopy(linkedList);
        java.lang.String patch_addPadding = patch_addPadding(patch_deepCopy);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(patch_addPadding);
        sb.append(str);
        sb.append(patch_addPadding);
        java.lang.String obj = sb.toString();
        patch_splitMax(patch_deepCopy);
        boolean[] zArr = new boolean[patch_deepCopy.size()];
        java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Patch> it = patch_deepCopy.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            name.fraser.neil.plaintext.diff_match_patch.Patch next = it.next();
            int i4 = next.start2 + i2;
            java.lang.String diff_text1 = diff_text1(next.diffs);
            int length = diff_text1.length();
            short s = this.Camera2StreamConfigurationMap;
            if (length > s) {
                match_main = match_main(obj, diff_text1.substring(0, s), i4);
                if (match_main != -1) {
                    i = match_main(obj, diff_text1.substring(diff_text1.length() - this.Camera2StreamConfigurationMap), (diff_text1.length() + i4) - this.Camera2StreamConfigurationMap);
                    if (i == -1 || match_main >= i) {
                        match_main = -1;
                    }
                    if (match_main != -1) {
                        zArr[i3] = false;
                        i2 -= next.length2 - next.length1;
                    } else {
                        zArr[i3] = true;
                        i2 = match_main - i4;
                        java.lang.String substring = i == -1 ? obj.substring(match_main, java.lang.Math.min(diff_text1.length() + match_main, obj.length())) : obj.substring(match_main, java.lang.Math.min(i + this.Camera2StreamConfigurationMap, obj.length()));
                        if (diff_text1.equals(substring)) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(obj.substring(0, match_main));
                            sb2.append(diff_text2(next.diffs));
                            sb2.append(obj.substring(diff_text1.length() + match_main));
                            obj = sb2.toString();
                        } else {
                            java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_main = diff_main(diff_text1, substring, false);
                            if (diff_text1.length() <= this.Camera2StreamConfigurationMap || diff_levenshtein(diff_main) / diff_text1.length() <= this.Patch_DeleteThreshold) {
                                diff_cleanupSemanticLossless(diff_main);
                                java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it2 = next.diffs.iterator();
                                int i5 = 0;
                                while (it2.hasNext()) {
                                    name.fraser.neil.plaintext.diff_match_patch.Diff next2 = it2.next();
                                    if (next2.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                                        int diff_xIndex = diff_xIndex(diff_main, i5);
                                        name.fraser.neil.plaintext.diff_match_patch.Operation operation = next2.operation;
                                        if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                            int i6 = diff_xIndex + match_main;
                                            sb3.append(obj.substring(0, i6));
                                            sb3.append(next2.text);
                                            sb3.append(obj.substring(i6));
                                            obj = sb3.toString();
                                        } else if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                            sb4.append(obj.substring(0, diff_xIndex + match_main));
                                            sb4.append(obj.substring(diff_xIndex(diff_main, next2.text.length() + i5) + match_main));
                                            obj = sb4.toString();
                                        }
                                    }
                                    if (next2.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                                        i5 += next2.text.length();
                                    }
                                }
                            } else {
                                zArr[i3] = false;
                            }
                        }
                    }
                    i3++;
                }
            } else {
                match_main = match_main(obj, diff_text1, i4);
            }
            i = -1;
            if (match_main != -1) {
            }
            i3++;
        }
        return new java.lang.Object[]{obj.substring(patch_addPadding.length(), obj.length() - patch_addPadding.length()), zArr};
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_deepCopy(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList) {
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList2 = new java.util.LinkedList<>();
        java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Patch> it = linkedList.iterator();
        while (it.hasNext()) {
            name.fraser.neil.plaintext.diff_match_patch.Patch next = it.next();
            name.fraser.neil.plaintext.diff_match_patch.Patch patch = new name.fraser.neil.plaintext.diff_match_patch.Patch();
            java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it2 = next.diffs.iterator();
            while (it2.hasNext()) {
                name.fraser.neil.plaintext.diff_match_patch.Diff next2 = it2.next();
                patch.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(next2.operation, next2.text));
            }
            patch.start1 = next.start1;
            patch.start2 = next.start2;
            patch.length1 = next.length1;
            patch.length2 = next.length2;
            linkedList2.add(patch);
        }
        return linkedList2;
    }

    public java.util.List<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_fromText(java.lang.String str) {
        char charAt;
        java.lang.String replace;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (str.length() != 0) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList(java.util.Arrays.asList(str.split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)));
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^@@ -(\\d+),?(\\d*) \\+(\\d+),?(\\d*) @@$");
            while (!linkedList2.isEmpty()) {
                java.util.regex.Matcher matcher = compile.matcher((java.lang.CharSequence) linkedList2.getFirst());
                if (!matcher.matches()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid patch string: ");
                    sb.append((java.lang.String) linkedList2.getFirst());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                name.fraser.neil.plaintext.diff_match_patch.Patch patch = new name.fraser.neil.plaintext.diff_match_patch.Patch();
                linkedList.add(patch);
                patch.start1 = java.lang.Integer.parseInt(matcher.group(1));
                if (matcher.group(2).length() == 0) {
                    patch.start1--;
                    patch.length1 = 1;
                } else if (matcher.group(2).equals("0")) {
                    patch.length1 = 0;
                } else {
                    patch.start1--;
                    patch.length1 = java.lang.Integer.parseInt(matcher.group(2));
                }
                patch.start2 = java.lang.Integer.parseInt(matcher.group(3));
                if (matcher.group(4).length() == 0) {
                    patch.start2--;
                    patch.length2 = 1;
                } else if (matcher.group(4).equals("0")) {
                    patch.length2 = 0;
                } else {
                    patch.start2--;
                    patch.length2 = java.lang.Integer.parseInt(matcher.group(4));
                }
                linkedList2.removeFirst();
                while (true) {
                    if (!linkedList2.isEmpty()) {
                        try {
                            charAt = ((java.lang.String) linkedList2.getFirst()).charAt(0);
                            replace = ((java.lang.String) linkedList2.getFirst()).substring(1).replace("+", "%2B");
                        } catch (java.lang.IndexOutOfBoundsException unused) {
                            linkedList2.removeFirst();
                        }
                        try {
                            java.lang.String decode = java.net.URLDecoder.decode(replace, "UTF-8");
                            if (charAt == '-') {
                                patch.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE, decode));
                            } else if (charAt == '+') {
                                patch.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT, decode));
                            } else if (charAt == ' ') {
                                patch.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, decode));
                            } else if (charAt != '@') {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid patch mode '");
                                sb2.append(charAt);
                                sb2.append("' in: ");
                                sb2.append(decode);
                                throw new java.lang.IllegalArgumentException(sb2.toString());
                            }
                            linkedList2.removeFirst();
                        } catch (java.io.UnsupportedEncodingException e) {
                            throw new java.lang.Error("This system does not support UTF-8.", e);
                        } catch (java.lang.IllegalArgumentException e2) {
                            throw new java.lang.IllegalArgumentException("Illegal escape in patch_fromText: ".concat(java.lang.String.valueOf(replace)), e2);
                        }
                    }
                }
            }
        }
        return linkedList;
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_make(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Null inputs. (patch_make)");
        }
        java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_main = diff_main(str, str2, true);
        if (diff_main.size() > 2) {
            diff_cleanupSemantic(diff_main);
            diff_cleanupEfficiency(diff_main);
        }
        return patch_make(str, diff_main);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0013 -> B:4:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void patch_splitMax(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList) {
        name.fraser.neil.plaintext.diff_match_patch.Patch patch;
        short s = this.Camera2StreamConfigurationMap;
        java.util.ListIterator<name.fraser.neil.plaintext.diff_match_patch.Patch> listIterator = linkedList.listIterator();
        if (listIterator.hasNext()) {
            patch = listIterator.next();
            while (patch != null) {
                if (patch.length1 > this.Camera2StreamConfigurationMap) {
                    listIterator.remove();
                    int i = patch.start1;
                    int i2 = patch.start2;
                    java.lang.String str = "";
                    while (!patch.diffs.isEmpty()) {
                        name.fraser.neil.plaintext.diff_match_patch.Patch patch2 = new name.fraser.neil.plaintext.diff_match_patch.Patch();
                        patch2.start1 = i - str.length();
                        patch2.start2 = i2 - str.length();
                        if (str.length() != 0) {
                            int length = str.length();
                            patch2.length2 = length;
                            patch2.length1 = length;
                            patch2.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str));
                        }
                        boolean z = true;
                        while (!patch.diffs.isEmpty() && patch2.length1 < s - this.Patch_Margin) {
                            name.fraser.neil.plaintext.diff_match_patch.Operation operation = patch.diffs.getFirst().operation;
                            java.lang.String str2 = patch.diffs.getFirst().text;
                            if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                                patch2.length2 = str2.length() + patch2.length2;
                                i2 += str2.length();
                                patch2.diffs.addLast(patch.diffs.removeFirst());
                            } else if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE && patch2.diffs.size() == 1 && patch2.diffs.getFirst().operation == name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL && str2.length() > s * 2) {
                                patch2.length1 = str2.length() + patch2.length1;
                                i += str2.length();
                                patch2.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(operation, str2));
                                patch.diffs.removeFirst();
                            } else {
                                java.lang.String substring = str2.substring(0, java.lang.Math.min(str2.length(), (s - patch2.length1) - this.Patch_Margin));
                                patch2.length1 = substring.length() + patch2.length1;
                                i += substring.length();
                                if (operation == name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                                    patch2.length2 = substring.length() + patch2.length2;
                                    i2 += substring.length();
                                } else {
                                    z = false;
                                }
                                patch2.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(operation, substring));
                                if (substring.equals(patch.diffs.getFirst().text)) {
                                    patch.diffs.removeFirst();
                                } else {
                                    patch.diffs.getFirst().text = patch.diffs.getFirst().text.substring(substring.length());
                                }
                            }
                            z = false;
                        }
                        java.lang.String diff_text2 = diff_text2(patch2.diffs);
                        str = diff_text2.substring(java.lang.Math.max(0, diff_text2.length() - this.Patch_Margin));
                        java.lang.String substring2 = diff_text1(patch.diffs).length() > this.Patch_Margin ? diff_text1(patch.diffs).substring(0, this.Patch_Margin) : diff_text1(patch.diffs);
                        if (substring2.length() != 0) {
                            patch2.length1 = substring2.length() + patch2.length1;
                            patch2.length2 = substring2.length() + patch2.length2;
                            if (patch2.diffs.isEmpty() || patch2.diffs.getLast().operation != name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                                patch2.diffs.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring2));
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                name.fraser.neil.plaintext.diff_match_patch.Diff last = patch2.diffs.getLast();
                                sb.append(last.text);
                                sb.append(substring2);
                                last.text = sb.toString();
                            }
                        }
                        if (!z) {
                            listIterator.add(patch2);
                        }
                    }
                    if (listIterator.hasNext()) {
                        patch = listIterator.next();
                    }
                } else if (listIterator.hasNext()) {
                    patch = listIterator.next();
                }
                while (patch != null) {
                }
            }
        }
        patch = null;
        while (patch != null) {
        }
    }

    public java.lang.String patch_toText(java.util.List<name.fraser.neil.plaintext.diff_match_patch.Patch> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Patch> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> diff_main(java.lang.String str, java.lang.String str2, boolean z) {
        return getHighSpeedVideoFpsRanges(str, str2, z, this.Diff_Timeout <= 0.0f ? Long.MAX_VALUE : java.lang.System.currentTimeMillis() + ((long) (this.Diff_Timeout * 1000.0f)));
    }

    public int match_bitap(java.lang.String str, java.lang.String str2, int i) {
        int i2;
        java.lang.String str3 = str;
        java.util.Map<java.lang.Character, java.lang.Integer> match_alphabet = match_alphabet(str2);
        double d = this.Match_Threshold;
        int indexOf = str.indexOf(str2, i);
        int i3 = 0;
        int i4 = -1;
        if (indexOf != -1) {
            d = java.lang.Math.min(getHighSpeedVideoFpsRangesFor(0, indexOf, i, str2), d);
            int lastIndexOf = str3.lastIndexOf(str2, str2.length() + i);
            if (lastIndexOf != -1) {
                d = java.lang.Math.min(getHighSpeedVideoFpsRangesFor(0, lastIndexOf, i, str2), d);
            }
        }
        int length = str2.length();
        int length2 = str.length() + str2.length();
        int[] iArr = new int[0];
        int i5 = 0;
        while (i5 < str2.length()) {
            int i6 = i3;
            int i7 = length2;
            while (i6 < length2) {
                if (getHighSpeedVideoFpsRangesFor(i5, i + length2, i, str2) <= d) {
                    i6 = length2;
                } else {
                    i7 = length2;
                }
                length2 = ((i7 - i6) / 2) + i6;
            }
            int max = java.lang.Math.max(1, (i - length2) + 1);
            int length3 = str2.length() + java.lang.Math.min(i + length2, str.length());
            int[] iArr2 = new int[length3 + 2];
            iArr2[length3 + 1] = (1 << i5) - 1;
            while (true) {
                if (length3 < max) {
                    break;
                }
                int i8 = i4;
                i4 = length3 - 1;
                int intValue = (str.length() <= i4 || !match_alphabet.containsKey(java.lang.Character.valueOf(str3.charAt(i4)))) ? 0 : match_alphabet.get(java.lang.Character.valueOf(str3.charAt(i4))).intValue();
                if (i5 == 0) {
                    i2 = 1;
                    iArr2[length3] = intValue & ((iArr2[length3 + 1] << 1) | 1);
                } else {
                    i2 = 1;
                    int i9 = length3 + 1;
                    int i10 = iArr2[i9];
                    int i11 = iArr[i9];
                    iArr2[length3] = (((i10 << 1) | 1) & intValue) | ((i11 | iArr[length3]) << 1) | 1 | i11;
                }
                if ((iArr2[length3] & (i2 << (length - 1))) != 0) {
                    double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i5, i4, i, str2);
                    if (highSpeedVideoFpsRangesFor <= d) {
                        if (i4 <= i) {
                            d = highSpeedVideoFpsRangesFor;
                            break;
                        }
                        max = java.lang.Math.max(i2, (i * 2) - i4);
                        d = highSpeedVideoFpsRangesFor;
                        length3--;
                        str3 = str;
                    }
                }
                i4 = i8;
                length3--;
                str3 = str;
            }
            i5++;
            if (getHighSpeedVideoFpsRangesFor(i5, i, i, str2) > d) {
                return i4;
            }
            str3 = str;
            iArr = iArr2;
            i3 = 0;
        }
        return i4;
    }

    private java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, boolean z, long j) {
        if (str != null && str2 != null) {
            if (str.equals(str2)) {
                java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList = new java.util.LinkedList<>();
                if (str.length() != 0) {
                    linkedList.add(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, str));
                }
                return linkedList;
            }
            int diff_commonPrefix = diff_commonPrefix(str, str2);
            java.lang.String substring = str.substring(0, diff_commonPrefix);
            java.lang.String substring2 = str.substring(diff_commonPrefix);
            java.lang.String substring3 = str2.substring(diff_commonPrefix);
            int diff_commonSuffix = diff_commonSuffix(substring2, substring3);
            java.lang.String substring4 = substring2.substring(substring2.length() - diff_commonSuffix);
            java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(substring2.substring(0, substring2.length() - diff_commonSuffix), substring3.substring(0, substring3.length() - diff_commonSuffix), z, j);
            if (substring.length() != 0) {
                highResolutionOutputSizeshNQ4ISI.addFirst(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring));
            }
            if (substring4.length() != 0) {
                highResolutionOutputSizeshNQ4ISI.addLast(new name.fraser.neil.plaintext.diff_match_patch.Diff(name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL, substring4));
            }
            diff_cleanupMerge(highResolutionOutputSizeshNQ4ISI);
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw new java.lang.IllegalArgumentException("Null inputs. (diff_main)");
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_make(java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        if (linkedList != null) {
            return patch_make(diff_text1(linkedList), linkedList);
        }
        throw new java.lang.IllegalArgumentException("Null inputs. (patch_make)");
    }

    @java.lang.Deprecated
    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_make(java.lang.String str, java.lang.String str2, java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        return patch_make(str, linkedList);
    }

    public java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> patch_make(java.lang.String str, java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Diff> linkedList) {
        if (str != null && linkedList != null) {
            java.util.LinkedList<name.fraser.neil.plaintext.diff_match_patch.Patch> linkedList2 = new java.util.LinkedList<>();
            if (!linkedList.isEmpty()) {
                name.fraser.neil.plaintext.diff_match_patch.Patch patch = new name.fraser.neil.plaintext.diff_match_patch.Patch();
                java.util.Iterator<name.fraser.neil.plaintext.diff_match_patch.Diff> it = linkedList.iterator();
                name.fraser.neil.plaintext.diff_match_patch.Patch patch2 = patch;
                int i = 0;
                int i2 = 0;
                java.lang.String str2 = str;
                while (it.hasNext()) {
                    name.fraser.neil.plaintext.diff_match_patch.Diff next = it.next();
                    if (patch2.diffs.isEmpty() && next.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.EQUAL) {
                        patch2.start1 = i;
                        patch2.start2 = i2;
                    }
                    int i3 = name.fraser.neil.plaintext.diff_match_patch.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[next.operation.ordinal()];
                    if (i3 == 1) {
                        patch2.diffs.add(next);
                        patch2.length2 = next.text.length() + patch2.length2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str2.substring(0, i2));
                        sb.append(next.text);
                        sb.append(str2.substring(i2));
                        str2 = sb.toString();
                    } else if (i3 == 2) {
                        patch2.length1 = next.text.length() + patch2.length1;
                        patch2.diffs.add(next);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str2.substring(0, i2));
                        sb2.append(str2.substring(next.text.length() + i2));
                        str2 = sb2.toString();
                    } else if (i3 == 3) {
                        if (next.text.length() <= this.Patch_Margin * 2 && !patch2.diffs.isEmpty() && next != linkedList.getLast()) {
                            patch2.diffs.add(next);
                            patch2.length1 = next.text.length() + patch2.length1;
                            patch2.length2 = next.text.length() + patch2.length2;
                        }
                        if (next.text.length() >= this.Patch_Margin * 2 && !patch2.diffs.isEmpty() && !patch2.diffs.isEmpty()) {
                            patch_addContext(patch2, str);
                            linkedList2.add(patch2);
                            patch2 = new name.fraser.neil.plaintext.diff_match_patch.Patch();
                            str = str2;
                            i = i2;
                        }
                    }
                    if (next.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.INSERT) {
                        i = next.text.length() + i;
                    }
                    if (next.operation != name.fraser.neil.plaintext.diff_match_patch.Operation.DELETE) {
                        i2 += next.text.length();
                    }
                }
                if (!patch2.diffs.isEmpty()) {
                    patch_addContext(patch2, str);
                    linkedList2.add(patch2);
                }
            }
            return linkedList2;
        }
        throw new java.lang.IllegalArgumentException("Null inputs. (patch_make)");
    }
}
