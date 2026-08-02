package B9;

/* loaded from: classes9.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3089a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object[][] f3090b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object[][] f3091c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[][] f3092d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object[][] f3093e;

    static {
        Object obj = new Object();
        f3089a = obj;
        f3090b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f3091c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f3092d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f3093e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    static String a(String str) throws h9.m {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw h9.m.a();
        }
        String substring = str.substring(0, 2);
        Object[][] objArr = f3090b;
        int i11 = 0;
        while (true) {
            Object obj = f3089a;
            if (i11 >= 24) {
                if (str.length() < 3) {
                    throw h9.m.a();
                }
                String substring2 = str.substring(0, 3);
                Object[][] objArr2 = f3091c;
                for (int i12 = 0; i12 < 23; i12++) {
                    Object[] objArr3 = objArr2[i12];
                    if (objArr3[0].equals(substring2)) {
                        Object obj2 = objArr3[1];
                        return obj2 == obj ? c(3, ((Integer) objArr3[2]).intValue(), str) : b(3, ((Integer) obj2).intValue(), str);
                    }
                }
                Object[][] objArr4 = f3092d;
                for (int i13 = 0; i13 < 57; i13++) {
                    Object[] objArr5 = objArr4[i13];
                    if (objArr5[0].equals(substring2)) {
                        Object obj3 = objArr5[1];
                        return obj3 == obj ? c(4, ((Integer) objArr5[2]).intValue(), str) : b(4, ((Integer) obj3).intValue(), str);
                    }
                }
                if (str.length() < 4) {
                    throw h9.m.a();
                }
                String substring3 = str.substring(0, 4);
                Object[][] objArr6 = f3093e;
                for (int i14 = 0; i14 < 18; i14++) {
                    Object[] objArr7 = objArr6[i14];
                    if (objArr7[0].equals(substring3)) {
                        Object obj4 = objArr7[1];
                        return obj4 == obj ? c(4, ((Integer) objArr7[2]).intValue(), str) : b(4, ((Integer) obj4).intValue(), str);
                    }
                }
                throw h9.m.a();
            }
            Object[] objArr8 = objArr[i11];
            if (objArr8[0].equals(substring)) {
                Object obj5 = objArr8[1];
                return obj5 == obj ? c(2, ((Integer) objArr8[2]).intValue(), str) : b(2, ((Integer) obj5).intValue(), str);
            }
            i11++;
        }
    }

    private static String b(int i11, int i12, String str) throws h9.m {
        if (str.length() < i11) {
            throw h9.m.a();
        }
        String substring = str.substring(0, i11);
        int i13 = i12 + i11;
        if (str.length() < i13) {
            throw h9.m.a();
        }
        String substring2 = str.substring(i11, i13);
        String str2 = "(" + substring + ')' + substring2;
        String a11 = a(str.substring(i13));
        return a11 == null ? str2 : U7.d.e(str2, a11);
    }

    private static String c(int i11, int i12, String str) throws h9.m {
        String substring = str.substring(0, i11);
        int min = Math.min(str.length(), i12 + i11);
        String substring2 = str.substring(i11, min);
        String str2 = "(" + substring + ')' + substring2;
        String a11 = a(str.substring(min));
        return a11 == null ? str2 : U7.d.e(str2, a11);
    }
}
