package com.ironsource.adqualitysdk.sdk.i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ч, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0508 implements InterfaceC1253 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1157;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f1156 = {StringFog.decrypt("yCebL4Feuf/bOpl5lRms/M86mWiI\n", "q0j2Aew3zZI=\n"), StringFog.decrypt("Ml8DYUccgb8+Rg8hRgmLtCNdQD9BGp6/NF0BO0c=\n", "UTBuTyJ77s0=\n"), StringFog.decrypt("NIFDdXpUwKcil1Y0Y0I=\n", "W/MkWwomr98=\n"), StringFog.decrypt("VIJsphnKQJNemWDxW8dCnkeZbucZxF+e\n", "N+0BiHWvNuo=\n"), StringFog.decrypt("cyR6y+vg5l1uOW3L7+TqSn83b4T6\n", "HFYd5ZiBiDk=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f1155 = {StringFog.decrypt("mCV+kWnCO3CdLjSRackpcIQwP5BjxGM3kjMkgmrMKCw=\n", "/EBQ4wagTV4=\n"), StringFog.decrypt("kBeuA1qQ0KCJF/MQXw==\n", "+XiAdTu+tdg=\n"), StringFog.decrypt("Ehto1q67AI4KUCPZuw==\n", "f35GocvSc+Y=\n"), StringFog.decrypt("/1zix3I+kNDjS+HHcyyO3vdL9w==\n", "kC6F6R5N4L8=\n"), StringFog.decrypt("7yWyo0YMY2TlIfH+QA9lYv4rq+g=\n", "jErfjTVtFhY=\n")};

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String[] f1154 = {StringFog.decrypt("5Q1e5aiqKynpCl28qes2IuELQKA=\n", "hmIzy9zFW0M=\n"), StringFog.decrypt("HA48ecXshaYfEmB/g/6ZuBwJYW8=\n", "eXsSGq2N7Mg=\n"), StringFog.decrypt("dgQnzsrTl0t9AiGE1MiWWTsYP5DEzpdLcBk=\n", "FWtK4KG84jg=\n"), StringFog.decrypt("avmocJDLLJ188Kor0MUxkXv5rDrQ1yo=\n", "CZbFXv6kX/U=\n"), StringFog.decrypt("AWjWu0D23c8Gd9rnQOeazhd33udB7dHP\n", "Yge7lTSetL0=\n"), StringFog.decrypt("e5lLi6JCUhF3gUPW9VRL\n", "GPYmpdsnPn0=\n"), StringFog.decrypt("16tcWa7L6NnbrVVZucDiz92qVlmtzODH3apWWYbLzdvEhlgbo8zizOehQwGmxumF94t4OQ==\n", "tMQxd8+ljKs=\n"), StringFog.decrypt("mPNHg8FaI5SL6VmDzlMlk4LsS9nBWg==\n", "+5wqraIyRvg=\n"), StringFog.decrypt("QfQUpLhzwzBF+hTvhHnCdg==\n", "Ipt5itsaqx4=\n"), StringFog.decrypt("LMjN0B1Wt7Is1tnQCVWuuCvbyZU=\n", "Q7qq/m40w90=\n"), StringFog.decrypt("nLD8xne3C5eb8eGDdw==\n", "/9+R6BDCauU=\n")};

    public C0508(Context context) {
        this.f1157 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    public final String getName() {
        return StringFog.decrypt("pZUkZfu4PROllSZf6rY9EKWJ\n", "wPtSDInXU34=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0474 mo5481() {
        ArrayList arrayList;
        ArrayList<String> arrayList2;
        String decrypt;
        ArrayList arrayList3 = new ArrayList();
        ArrayList m5482 = m5482(f1156);
        if (!m5482.isEmpty()) {
            arrayList3.add(40);
        }
        ArrayList m54822 = m5482(f1155);
        if (!m54822.isEmpty()) {
            arrayList3.add(41);
        }
        ArrayList m54823 = m5482(f1154);
        if (!m54823.isEmpty()) {
            arrayList3.add(42);
        }
        try {
            List<ApplicationInfo> installedApplications = this.f1157.getPackageManager().getInstalledApplications(128);
            arrayList = new ArrayList();
            for (ApplicationInfo applicationInfo : installedApplications) {
                if (applicationInfo.packageName.toLowerCase().contains(StringFog.decrypt("xR3K\n", "s22kdld2QOM=\n"))) {
                    arrayList.add(applicationInfo.packageName);
                }
            }
        } catch (Throwable unused) {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(33);
        }
        try {
            ActivityManager activityManager = (ActivityManager) this.f1157.getSystemService(StringFog.decrypt("mZMVxeGjKj8=\n", "+PBhrJfKXkY=\n"));
            if (activityManager == null) {
                arrayList2 = new ArrayList();
            } else {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    arrayList2 = new ArrayList();
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (it.hasNext()) {
                        String str = it.next().processName;
                        if (m5480(str)) {
                            arrayList4.add(str);
                        }
                    }
                    arrayList2 = arrayList4;
                }
            }
        } catch (Exception unused2) {
            arrayList2 = new ArrayList();
        }
        for (String str2 : arrayList2) {
            if (!m5482.contains(str2) && !m54822.contains(str2) && !m54823.contains(str2)) {
                arrayList3.add(43);
                break;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringFog.decrypt("WRPCRqxTj3dFEg==\n", "KWGtPtUH4Bg=\n"), new JSONArray((Collection) m5482));
            jSONObject.put(StringFog.decrypt("tDkb91wrFCqSMwf+Tg==\n", "xlxokj1Zd0I=\n"), new JSONArray((Collection) m54822));
            jSONObject.put(StringFog.decrypt("CPjQC77scwQH4w==\n", "a5C1asq4HGs=\n"), new JSONArray((Collection) m54823));
            jSONObject.put(StringFog.decrypt("47rq4rkUPQ==\n", "lcqEo8lkTuE=\n"), new JSONArray((Collection) arrayList));
            decrypt = jSONObject.toString();
        } catch (Exception unused3) {
            decrypt = StringFog.decrypt("84M=\n", "iP4z53oy7cI=\n");
        }
        return new C0474(arrayList3.isEmpty(), arrayList3, decrypt, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m5482(String[] strArr) {
        PackageManager packageManager = this.f1157.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                arrayList.add(str);
            } catch (PackageManager.NameNotFoundException | SecurityException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5480(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : f1156) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        for (String str3 : f1155) {
            if (lowerCase.contains(str3.toLowerCase())) {
                return true;
            }
        }
        for (String str4 : f1154) {
            if (lowerCase.contains(str4.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
