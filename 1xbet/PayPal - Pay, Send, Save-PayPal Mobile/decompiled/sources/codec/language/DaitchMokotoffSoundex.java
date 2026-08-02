package codec.language;

/* loaded from: classes7.dex */
public class DaitchMokotoffSoundex implements codec.StringEncoder {
    public static final java.util.HashMap b;
    public static final java.util.HashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2781a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        b = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        c = hashMap2;
        java.util.Scanner scanner = new java.util.Scanner(codec.Resources.getInputStream("org/apache/commons/codec/language/dmrules.txt"), "UTF-8");
        try {
            a(scanner, hashMap, hashMap2);
            scanner.close();
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Collections.sort((java.util.List) ((java.util.Map.Entry) it.next()).getValue(), new codec.language.c());
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

    public DaitchMokotoffSoundex() {
        this(true);
    }

    public static void a(java.util.Scanner scanner, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        int i = 0;
        boolean z = false;
        while (scanner.hasNextLine()) {
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
                if (trim.length() == 0) {
                    continue;
                } else if (trim.contains("=")) {
                    java.lang.String[] split = trim.split("=");
                    if (split.length != 2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed folding statement split into ");
                        sb.append(split.length);
                        sb.append(" parts: ");
                        sb.append(nextLine);
                        sb.append(" in org/apache/commons/codec/language/dmrules.txt");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    java.lang.String str = split[0];
                    java.lang.String str2 = split[1];
                    if (str.length() != 1 || str2.length() != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Malformed folding statement - patterns are not single characters: ");
                        sb2.append(nextLine);
                        sb2.append(" in org/apache/commons/codec/language/dmrules.txt");
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
                        sb3.append(" in org/apache/commons/codec/language/dmrules.txt");
                        throw new java.lang.IllegalArgumentException(sb3.toString());
                    }
                    try {
                        java.lang.String a2 = a(split2[0]);
                        codec.language.e eVar = new codec.language.e(a2, a(split2[1]), a(split2[2]), a(split2[3]));
                        char charAt = a2.charAt(0);
                        java.util.List list = (java.util.List) hashMap.get(java.lang.Character.valueOf(charAt));
                        if (list == null) {
                            list = new java.util.ArrayList();
                            hashMap.put(java.lang.Character.valueOf(charAt), list);
                        }
                        list.add(eVar);
                    } catch (java.lang.IllegalArgumentException e) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Problem parsing line '");
                        sb4.append(i);
                        sb4.append("' in org/apache/commons/codec/language/dmrules.txt");
                        throw new java.lang.IllegalStateException(sb4.toString(), e);
                    }
                }
            }
        }
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }

    public java.lang.String soundex(java.lang.String str) {
        java.lang.String[] a2 = a(str, true);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.String str2 : a2) {
            sb.append(str2);
            i++;
            if (i < a2.length) {
                sb.append('|');
            }
        }
        return sb.toString();
    }

    public DaitchMokotoffSoundex(boolean z) {
        this.f2781a = z;
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return a(str, false)[0];
    }

    public static java.lang.String a(java.lang.String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public final java.lang.String[] a(java.lang.String str, boolean z) {
        java.lang.String str2;
        int i;
        java.lang.String[] strArr;
        char charAt;
        java.lang.String str3;
        int i2;
        codec.language.d dVar;
        char c2;
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (char c3 : str.toCharArray()) {
            if (!java.lang.Character.isWhitespace(c3)) {
                char lowerCase = java.lang.Character.toLowerCase(c3);
                if (this.f2781a) {
                    java.util.HashMap hashMap = c;
                    if (hashMap.containsKey(java.lang.Character.valueOf(lowerCase))) {
                        lowerCase = ((java.lang.Character) hashMap.get(java.lang.Character.valueOf(lowerCase))).charValue();
                    }
                }
                sb.append(lowerCase);
            }
        }
        java.lang.String obj = sb.toString();
        java.util.LinkedHashSet<codec.language.d> linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(new codec.language.d());
        int i3 = 0;
        char c4 = 0;
        while (i3 < obj.length()) {
            char charAt2 = obj.charAt(i3);
            if (!java.lang.Character.isWhitespace(charAt2)) {
                java.lang.String substring = obj.substring(i3);
                java.util.List list = (java.util.List) b.get(java.lang.Character.valueOf(charAt2));
                if (list != null) {
                    java.util.List arrayList = z ? new java.util.ArrayList() : java.util.Collections.EMPTY_LIST;
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = obj;
                            i = 1;
                            break;
                        }
                        codec.language.e eVar = (codec.language.e) it.next();
                        if (substring.startsWith(eVar.f2813a)) {
                            if (z) {
                                arrayList.clear();
                            }
                            if (c4 == 0) {
                                strArr = eVar.b;
                            } else {
                                int length = eVar.f2813a.length();
                                if (length < substring.length() && ((charAt = substring.charAt(length)) == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u')) {
                                    strArr = eVar.c;
                                } else {
                                    strArr = eVar.d;
                                }
                            }
                            boolean z2 = strArr.length > 1 && z;
                            for (codec.language.d dVar2 : linkedHashSet) {
                                int length2 = strArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < length2) {
                                        java.lang.String str4 = strArr[i4];
                                        if (z2) {
                                            dVar = new codec.language.d();
                                            str3 = obj;
                                            i2 = length2;
                                            dVar.f2812a.append(dVar2.toString());
                                            dVar.c = dVar2.c;
                                        } else {
                                            str3 = obj;
                                            i2 = length2;
                                            dVar = dVar2;
                                        }
                                        boolean z3 = (c4 == 'm' && charAt2 == 'n') || (c4 == 'n' && charAt2 == 'm');
                                        java.lang.String str5 = dVar.c;
                                        if ((str5 == null || !str5.endsWith(str4) || z3) && dVar.f2812a.length() < 6) {
                                            dVar.f2812a.append(str4);
                                            if (dVar.f2812a.length() > 6) {
                                                java.lang.StringBuilder sb2 = dVar.f2812a;
                                                c2 = c4;
                                                sb2.delete(6, sb2.length());
                                            } else {
                                                c2 = c4;
                                            }
                                            dVar.b = null;
                                        } else {
                                            c2 = c4;
                                        }
                                        dVar.c = str4;
                                        if (!z) {
                                            obj = str3;
                                            c4 = c2;
                                            break;
                                        }
                                        arrayList.add(dVar);
                                        i4++;
                                        obj = str3;
                                        length2 = i2;
                                        c4 = c2;
                                    }
                                }
                            }
                            str2 = obj;
                            if (z) {
                                linkedHashSet.clear();
                                linkedHashSet.addAll(arrayList);
                            }
                            i = 1;
                            i3 = (eVar.f2813a.length() - 1) + i3;
                        }
                    }
                    c4 = charAt2;
                    i3 += i;
                    obj = str2;
                }
            }
            str2 = obj;
            i = 1;
            c4 = c4;
            i3 += i;
            obj = str2;
        }
        java.lang.String[] strArr2 = new java.lang.String[linkedHashSet.size()];
        int i5 = 0;
        for (codec.language.d dVar3 : linkedHashSet) {
            while (dVar3.f2812a.length() < 6) {
                dVar3.f2812a.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                dVar3.b = null;
            }
            strArr2[i5] = dVar3.toString();
            i5++;
        }
        return strArr2;
    }
}
