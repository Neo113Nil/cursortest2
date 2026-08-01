package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.כ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0576 implements InterfaceC1253 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1335;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f1334 = {StringFog.decrypt("8Ylb\n", "hfw1Qx8H9r0=\n"), StringFog.decrypt("ZQve\n", "FXuu1X4RcRU=\n"), StringFog.decrypt("CeTkgYo=\n", "YJSX5Ona6KY=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f1333 = {StringFog.decrypt("GtqHHg==\n", "bq/pLpaPnaE=\n"), StringFog.decrypt("e0+jxQ==\n", "Cz/T9bh5X+Q=\n")};

    public C0576(Context context) {
        this.f1335 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    public final String getName() {
        return StringFog.decrypt("GgrKyvEnhy8dAdnY7CWeABob\n", "dG++vZ5V7Gk=\n");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:0|1|(2:2|3)|(31:122|123|(1:8)|9|10|(1:12)(1:(4:96|(1:(2:98|(2:101|102)(1:100))(1:104))|103|94))|13|14|(2:16|(22:18|(1:20)|21|22|23|(1:87)|26|27|28|(1:30)(2:62|(1:64)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(2:80|(1:82)(1:83))))))))|31|32|(1:59)|35|36|(1:38)(4:50|(2:53|51)|54|55)|39|40|(1:42)(1:48)|43|44|45))|92|(0)|21|22|23|(1:25)(2:85|87)|26|27|28|(0)(0)|31|32|(1:34)(2:57|59)|35|36|(0)(0)|39|40|(0)(0)|43|44|45)|6|(0)|9|10|(0)(0)|13|14|(0)|92|(0)|21|22|23|(0)(0)|26|27|28|(0)(0)|31|32|(0)(0)|35|36|(0)(0)|39|40|(0)(0)|43|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:0|1|2|3|(31:122|123|(1:8)|9|10|(1:12)(1:(4:96|(1:(2:98|(2:101|102)(1:100))(1:104))|103|94))|13|14|(2:16|(22:18|(1:20)|21|22|23|(1:87)|26|27|28|(1:30)(2:62|(1:64)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(2:80|(1:82)(1:83))))))))|31|32|(1:59)|35|36|(1:38)(4:50|(2:53|51)|54|55)|39|40|(1:42)(1:48)|43|44|45))|92|(0)|21|22|23|(1:25)(2:85|87)|26|27|28|(0)(0)|31|32|(1:34)(2:57|59)|35|36|(0)(0)|39|40|(0)(0)|43|44|45)|6|(0)|9|10|(0)(0)|13|14|(0)|92|(0)|21|22|23|(0)(0)|26|27|28|(0)(0)|31|32|(0)(0)|35|36|(0)(0)|39|40|(0)(0)|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0069, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.C0576.f1334;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x006d, code lost:
    
        if (r8 >= r7) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0075, code lost:
    
        if (r5.startsWith(r6[r8]) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0081, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fd, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("Jx0=\n", "XGDx2xbzEb8=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b0, code lost:
    
        r8 = java.util.Collections.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("sedKSmQ8tA==\n", "xIkhJAtL2vQ=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cc, code lost:
    
        if (r6.trim().isEmpty() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #4 {Exception -> 0x009e, blocks: (B:14:0x0084, B:16:0x0092), top: B:13:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2 A[Catch: all -> 0x0162, TryCatch #3 {all -> 0x0162, blocks: (B:28:0x00d0, B:30:0x00e2, B:62:0x00ec, B:64:0x00f2, B:65:0x00fc, B:67:0x0102, B:68:0x010b, B:70:0x0111, B:71:0x011a, B:73:0x0120, B:74:0x0129, B:76:0x0130, B:77:0x0139, B:79:0x0140, B:80:0x0149, B:82:0x0150, B:83:0x0159), top: B:27:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0190 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:36:0x018a, B:38:0x0190, B:50:0x0195, B:51:0x019a, B:53:0x01a0), top: B:35:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:36:0x018a, B:38:0x0190, B:50:0x0195, B:51:0x019a, B:53:0x01a0), top: B:35:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d A[Catch: Exception -> 0x018a, TryCatch #6 {Exception -> 0x018a, blocks: (B:32:0x016a, B:57:0x017d, B:59:0x0183), top: B:31:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec A[Catch: all -> 0x0162, TryCatch #3 {all -> 0x0162, blocks: (B:28:0x00d0, B:30:0x00e2, B:62:0x00ec, B:64:0x00f2, B:65:0x00fc, B:67:0x0102, B:68:0x010b, B:70:0x0111, B:71:0x011a, B:73:0x0120, B:74:0x0129, B:76:0x0130, B:77:0x0139, B:79:0x0140, B:80:0x0149, B:82:0x0150, B:83:0x0159), top: B:27:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00be A[Catch: Exception -> 0x00cf, TryCatch #2 {Exception -> 0x00cf, blocks: (B:23:0x00ab, B:85:0x00be, B:87:0x00c4), top: B:22:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0043 A[Catch: Exception -> 0x0084, LOOP:1: B:94:0x0043->B:113:?, LOOP_LABEL: LOOP:1: B:94:0x0043->B:113:?, LOOP_START, TryCatch #7 {Exception -> 0x0084, blocks: (B:10:0x003c, B:94:0x0043, B:96:0x0049, B:98:0x005d, B:100:0x0066, B:105:0x0069, B:108:0x006f), top: B:9:0x003c }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0474 mo5481() {
        boolean z;
        boolean z2;
        String str;
        String decrypt;
        List emptyList;
        Enumeration<NetworkInterface> networkInterfaces;
        TelephonyManager telephonyManager;
        String simCountryIso;
        ConnectivityManager connectivityManager;
        TelephonyManager telephonyManager2;
        String property;
        Enumeration<NetworkInterface> networkInterfaces2;
        ConnectivityManager connectivityManager2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        try {
            connectivityManager2 = (ConnectivityManager) this.f1335.getSystemService(StringFog.decrypt("cric5FoPFK1nvobz\n", "Edfyij9sYMQ=\n"));
        } catch (Throwable unused) {
        }
        if (connectivityManager2 != null && (activeNetwork = connectivityManager2.getActiveNetwork()) != null && (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) != null) {
            z = !networkCapabilities.hasCapability(15);
            if (z) {
                arrayList.add(30);
            }
            networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces2 == null) {
                loop1: while (networkInterfaces2.hasMoreElements()) {
                    String lowerCase = networkInterfaces2.nextElement().getName().toLowerCase();
                    String[] strArr = f1333;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (lowerCase.equals(strArr[i])) {
                            break loop1;
                        }
                        i++;
                    }
                    arrayList.add(31);
                }
            }
            property = System.getProperty(StringFog.decrypt("u31eZ4pmJQercGJ412I=\n", "0wkqF6QWV2g=\n"));
            if (property != null) {
                if (!property.trim().isEmpty()) {
                    z2 = true;
                    if (z2) {
                        arrayList.add(32);
                    }
                    telephonyManager2 = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("xwfii20=\n", "t2+N5QjdB4w=\n"));
                    if (telephonyManager2 != null && (str = telephonyManager2.getNetworkOperatorName()) != null) {
                    }
                    str = null;
                    connectivityManager = (ConnectivityManager) this.f1335.getSystemService(StringFog.decrypt("c1EJgJowoyxmVxOX\n", "ED5n7v9T10U=\n"));
                    if (connectivityManager == null) {
                        decrypt = StringFog.decrypt("UDNMawyyzw==\n", "JV0nBWPFoXM=\n");
                    } else {
                        Network activeNetwork2 = connectivityManager.getActiveNetwork();
                        if (activeNetwork2 == null) {
                            decrypt = StringFog.decrypt("hwe++w==\n", "6WjQngiUMGg=\n");
                        } else {
                            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork2);
                            decrypt = networkCapabilities2 == null ? StringFog.decrypt("d14L5J0o9A==\n", "AjBgivJfmgE=\n") : networkCapabilities2.hasTransport(1) ? StringFog.decrypt("p0MaDA==\n", "0Cp8ZcVjylE=\n") : networkCapabilities2.hasTransport(0) ? StringFog.decrypt("gMDmiuLiPYY=\n", "46WK5peOXPQ=\n") : networkCapabilities2.hasTransport(3) ? StringFog.decrypt("aQeaA6wjRN0=\n", "DHPyZt5NIak=\n") : networkCapabilities2.hasTransport(2) ? StringFog.decrypt("NiVk72fH8Mw8\n", "VEkRihOon7g=\n") : networkCapabilities2.hasTransport(4) ? StringFog.decrypt("HSua\n", "a1v0x+II4XU=\n") : StringFog.decrypt("4IwqXIs=\n", "j/hCOflWBJg=\n");
                        }
                    }
                    telephonyManager = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("dY6oeQA=\n", "BebHF2Wza7k=\n"));
                    if (telephonyManager == null && (simCountryIso = telephonyManager.getSimCountryIso()) != null) {
                        simCountryIso.trim().isEmpty();
                    }
                    networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    if (networkInterfaces == null) {
                        emptyList = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        while (networkInterfaces.hasMoreElements()) {
                            arrayList2.add(networkInterfaces.nextElement().getName());
                        }
                        emptyList = arrayList2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringFog.decrypt("8qHEWn8=\n", "m9KSKhHfh/Y=\n"), z);
                    jSONObject.put(StringFog.decrypt("B/Jn1DTzqEEQ53Y=\n", "aZcTo1uBwxU=\n"), decrypt);
                    jSONObject.put(StringFog.decrypt("773N9T2pcTHpoPvuNaR6F+I=\n", "hs6dh1LRCHI=\n"), z2);
                    String decrypt2 = StringFog.decrypt("EP1zUEn5oUQd7g==\n", "eJwAEyiL0y0=\n");
                    if (str == null) {
                        z3 = false;
                    }
                    jSONObject.put(decrypt2, z3);
                    jSONObject.put(StringFog.decrypt("GCmiLq7AJ/0UBLk+stI=\n", "cUfWS9ymRp4=\n"), emptyList.size());
                    String decrypt3 = jSONObject.toString();
                    return new C0474(arrayList.isEmpty(), arrayList, decrypt3, null);
                }
            }
            z2 = false;
            if (z2) {
            }
            telephonyManager2 = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("xwfii20=\n", "t2+N5QjdB4w=\n"));
            if (telephonyManager2 != null) {
            }
            str = null;
            connectivityManager = (ConnectivityManager) this.f1335.getSystemService(StringFog.decrypt("c1EJgJowoyxmVxOX\n", "ED5n7v9T10U=\n"));
            if (connectivityManager == null) {
            }
            telephonyManager = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("dY6oeQA=\n", "BebHF2Wza7k=\n"));
            if (telephonyManager == null) {
                simCountryIso.trim().isEmpty();
            }
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringFog.decrypt("8qHEWn8=\n", "m9KSKhHfh/Y=\n"), z);
            jSONObject2.put(StringFog.decrypt("B/Jn1DTzqEEQ53Y=\n", "aZcTo1uBwxU=\n"), decrypt);
            jSONObject2.put(StringFog.decrypt("773N9T2pcTHpoPvuNaR6F+I=\n", "hs6dh1LRCHI=\n"), z2);
            String decrypt22 = StringFog.decrypt("EP1zUEn5oUQd7g==\n", "eJwAEyiL0y0=\n");
            if (str == null) {
            }
            jSONObject2.put(decrypt22, z3);
            jSONObject2.put(StringFog.decrypt("GCmiLq7AJ/0UBLk+stI=\n", "cUfWS9ymRp4=\n"), emptyList.size());
            String decrypt32 = jSONObject2.toString();
            return new C0474(arrayList.isEmpty(), arrayList, decrypt32, null);
        }
        z = false;
        if (z) {
        }
        networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces2 == null) {
        }
        property = System.getProperty(StringFog.decrypt("u31eZ4pmJQercGJ412I=\n", "0wkqF6QWV2g=\n"));
        if (property != null) {
        }
        z2 = false;
        if (z2) {
        }
        telephonyManager2 = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("xwfii20=\n", "t2+N5QjdB4w=\n"));
        if (telephonyManager2 != null) {
        }
        str = null;
        connectivityManager = (ConnectivityManager) this.f1335.getSystemService(StringFog.decrypt("c1EJgJowoyxmVxOX\n", "ED5n7v9T10U=\n"));
        if (connectivityManager == null) {
        }
        telephonyManager = (TelephonyManager) this.f1335.getSystemService(StringFog.decrypt("dY6oeQA=\n", "BebHF2Wza7k=\n"));
        if (telephonyManager == null) {
        }
        networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
        }
        JSONObject jSONObject22 = new JSONObject();
        jSONObject22.put(StringFog.decrypt("8qHEWn8=\n", "m9KSKhHfh/Y=\n"), z);
        jSONObject22.put(StringFog.decrypt("B/Jn1DTzqEEQ53Y=\n", "aZcTo1uBwxU=\n"), decrypt);
        jSONObject22.put(StringFog.decrypt("773N9T2pcTHpoPvuNaR6F+I=\n", "hs6dh1LRCHI=\n"), z2);
        String decrypt222 = StringFog.decrypt("EP1zUEn5oUQd7g==\n", "eJwAEyiL0y0=\n");
        if (str == null) {
        }
        jSONObject22.put(decrypt222, z3);
        jSONObject22.put(StringFog.decrypt("GCmiLq7AJ/0UBLk+stI=\n", "cUfWS9ymRp4=\n"), emptyList.size());
        String decrypt322 = jSONObject22.toString();
        return new C0474(arrayList.isEmpty(), arrayList, decrypt322, null);
    }
}
