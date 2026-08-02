package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bd {

    /* renamed from: a, reason: collision with root package name */
    static boolean f3414a = false;
    static boolean b = false;
    static boolean c = false;
    static boolean d = false;
    static boolean e = false;
    static boolean f = false;
    static boolean g = false;
    static boolean h = false;
    static boolean j = false;

    bd() {
    }

    static void a() {
        d = false;
        f3414a = false;
        b = false;
        e = false;
        c = false;
        f = false;
        h = false;
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_duw");
        if (str != null) {
            f3414a = str.equals("0236a982-6831-4294-a64c-27c2149a3a96");
        }
        java.lang.String str2 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_dilo");
        if (str2 != null) {
            d = str2.equals("040dfacf-ed9b-403e-81c2-564d932de5da");
        }
        java.lang.String str3 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_ner");
        if (str3 != null) {
            b = str3.equals("aeb9053d-b2a6-4145-aed5-7dd4a20c657c");
        }
        java.lang.String str4 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_croo1");
        if (str4 != null) {
            e = str4.equals("095b8251-1859-4077-bcd0-721ca94b0fe0");
        }
        java.lang.String str5 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_puw");
        if (str5 != null) {
            c = str5.equals("guq975rb-5ras-vhj3-2nya-v4trvx3214bi");
        }
        java.lang.String str6 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_rcf");
        if (str6 != null) {
            h = str6.equals("85c13fc9-c119-4729-8126-6005d67235c9");
        }
        java.lang.String str7 = com.facetec.sdk.FaceTecSDK.f3366a.p.get("ac_dm");
        if (str7 != null) {
            f = str7.equals("419f584a-170c-414c-946a-d4b3d02b353e");
        }
        g = a("ac_chri", "f8956461-4b1c-49b0-805b-678a45e48e9a");
        j = a("ac_ent", "008c70d6-0fe6-4f75-8d54-91da1c21522a");
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.facetec.sdk.FaceTecSDK.f3366a.p.get(str);
        return str3 != null && str3.equals(str2);
    }
}
