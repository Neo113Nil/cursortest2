package S1;

import android.os.Build;
import io.appmetrica.analytics.impl.C0644l9;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1438a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1440c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1441d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1442e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final n f1443g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f1444h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1445i;

    /* renamed from: j, reason: collision with root package name */
    public final D0.a f1446j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f1447k;

    /* renamed from: l, reason: collision with root package name */
    public final m[] f1448l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f1449m;

    public m(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, n nVar, Integer num, String str, D0.a aVar, String[] strArr, m[] mVarArr, Locale[] localeArr) {
        this.f1438a = z3;
        this.f1439b = z4;
        this.f1440c = z5;
        this.f1441d = z6;
        this.f1442e = z7;
        this.f = i3;
        this.f1443g = nVar;
        this.f1444h = num;
        this.f1445i = str;
        this.f1446j = aVar;
        this.f1447k = strArr;
        this.f1448l = mVarArr;
        this.f1449m = localeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0302, code lost:
    
        if (r9.equals("familyName") == false) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [D0.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [int] */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r37v1, types: [D0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m a(JSONObject jSONObject) {
        int i3;
        int i4;
        boolean z3;
        m[] mVarArr;
        int i5;
        Locale[] localeArr;
        String str;
        String str2;
        String str3;
        n nVar;
        String str4;
        char c3;
        String str5 = "creditCardExpirationMonth";
        String string = jSONObject.getString("inputAction");
        if (string == null) {
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }
        int i6 = 4;
        if (jSONObject.isNull("fields")) {
            i3 = 3;
            i4 = 2;
            z3 = 1;
            mVarArr = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            i3 = 3;
            int length = jSONArray.length();
            i4 = 2;
            m[] mVarArr2 = new m[length];
            z3 = 1;
            for (int i7 = 0; i7 < length; i7++) {
                mVarArr2[i7] = a(jSONArray.getJSONObject(i7));
            }
            mVarArr = mVarArr2;
        }
        int i8 = 0;
        switch (string.hashCode()) {
            case -737377923:
                if (string.equals("TextInputAction.done")) {
                    i5 = 0;
                    break;
                }
                i5 = -1;
                break;
            case -737089298:
                if (string.equals("TextInputAction.next")) {
                    i5 = z3;
                    break;
                }
                i5 = -1;
                break;
            case -737080013:
                if (string.equals("TextInputAction.none")) {
                    i5 = i4;
                    break;
                }
                i5 = -1;
                break;
            case -736940669:
                if (string.equals("TextInputAction.send")) {
                    i5 = i3;
                    break;
                }
                i5 = -1;
                break;
            case 469250275:
                if (string.equals("TextInputAction.search")) {
                    i5 = 4;
                    break;
                }
                i5 = -1;
                break;
            case 1241689507:
                if (string.equals("TextInputAction.go")) {
                    i5 = 5;
                    break;
                }
                i5 = -1;
                break;
            case 1539450297:
                if (string.equals("TextInputAction.newline")) {
                    i5 = 6;
                    break;
                }
                i5 = -1;
                break;
            case 2110497650:
                if (string.equals("TextInputAction.previous")) {
                    i5 = 7;
                    break;
                }
                i5 = -1;
                break;
            default:
                i5 = -1;
                break;
        }
        switch (i5) {
            case 0:
                i8 = 6;
                break;
            case 1:
                i8 = 5;
                break;
            case 2:
            case 6:
                i8 = Integer.valueOf((int) z3);
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = Integer.valueOf(i3);
                break;
            case 5:
                i8 = Integer.valueOf(i4);
                break;
            case 7:
                i8 = 7;
                break;
        }
        Integer num = i8;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
        if (jSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                arrayList.add(jSONArray2.optString(i9));
            }
        }
        if (jSONObject.isNull("hintLocales")) {
            localeArr = null;
        } else {
            JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
            Locale[] localeArr2 = new Locale[jSONArray3.length()];
            for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                localeArr2[i10] = Locale.forLanguageTag(jSONArray3.optString(i10));
            }
            localeArr = localeArr2;
        }
        boolean optBoolean = jSONObject.optBoolean("obscureText");
        boolean optBoolean2 = jSONObject.optBoolean("autocorrect", z3);
        boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
        boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
        String string2 = jSONObject.getString("textCapitalization");
        int[] c4 = M.j.c(4);
        int length2 = c4.length;
        int i11 = 0;
        while (i11 < length2) {
            int[] iArr = c4;
            int i12 = iArr[i11];
            int i13 = length2;
            if (i12 == 1) {
                str = "TextCapitalization.characters";
            } else if (i12 == i4) {
                str = "TextCapitalization.words";
            } else if (i12 == i3) {
                str = "TextCapitalization.sentences";
            } else {
                if (i12 != i6) {
                    throw null;
                }
                str = "TextCapitalization.none";
            }
            if (str.equals(string2)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                String string3 = jSONObject2.getString("name");
                int[] c5 = M.j.c(13);
                ArrayList arrayList2 = arrayList;
                int length3 = c5.length;
                int i14 = 0;
                while (i14 < length3) {
                    int i15 = length3;
                    int i16 = c5[i14];
                    switch (i16) {
                        case 1:
                            str2 = "TextInputType.text";
                            break;
                        case 2:
                            str2 = "TextInputType.datetime";
                            break;
                        case 3:
                            str2 = "TextInputType.name";
                            break;
                        case 4:
                            str2 = "TextInputType.address";
                            break;
                        case 5:
                            str2 = "TextInputType.number";
                            break;
                        case 6:
                            str2 = "TextInputType.phone";
                            break;
                        case 7:
                            str2 = "TextInputType.multiline";
                            break;
                        case 8:
                            str2 = "TextInputType.emailAddress";
                            break;
                        case 9:
                            str2 = "TextInputType.url";
                            break;
                        case 10:
                            str2 = "TextInputType.visiblePassword";
                            break;
                        case 11:
                            str2 = "TextInputType.none";
                            break;
                        case 12:
                            str2 = "TextInputType.webSearch";
                            break;
                        case 13:
                            str2 = "TextInputType.twitter";
                            break;
                        default:
                            throw null;
                    }
                    int i17 = i14;
                    if (str2.equals(string3)) {
                        String str6 = str5;
                        n nVar2 = new n(i16, jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
                        String string4 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                        if (jSONObject.isNull("autofill")) {
                            str3 = string4;
                            nVar = nVar2;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                            String string5 = jSONObject3.getString("uniqueIdentifier");
                            JSONArray jSONArray4 = jSONObject3.getJSONArray("hints");
                            String string6 = jSONObject3.isNull("hintText") ? null : jSONObject3.getString("hintText");
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                            String[] strArr = new String[jSONArray4.length()];
                            str3 = string4;
                            int i18 = 0;
                            while (i18 < jSONArray4.length()) {
                                String string7 = jSONArray4.getString(i18);
                                int i19 = i18;
                                n nVar3 = nVar2;
                                char c6 = 26;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    string7.getClass();
                                    switch (string7.hashCode()) {
                                        case -2058889126:
                                            str4 = str6;
                                            if (string7.equals("birthdayYear")) {
                                                c6 = 0;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case -1917283616:
                                            str4 = str6;
                                            if (string7.equals("oneTimeCode")) {
                                                c6 = 1;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case -1844815832:
                                            str4 = str6;
                                            if (string7.equals(str4)) {
                                                c6 = 2;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case -1825589953:
                                            if (string7.equals("telephoneNumberNational")) {
                                                str4 = str6;
                                                c6 = 3;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1821235109:
                                            if (string7.equals("newPassword")) {
                                                str4 = str6;
                                                c6 = 4;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1757573738:
                                            if (string7.equals("creditCardSecurityCode")) {
                                                c6 = 5;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1682373820:
                                            if (string7.equals("creditCardExpirationDay")) {
                                                c6 = 6;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1658955742:
                                            if (string7.equals("fullStreetAddress")) {
                                                c6 = 7;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1567118045:
                                            if (string7.equals("telephoneNumberDevice")) {
                                                c3 = '\b';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1476752575:
                                            if (string7.equals("countryName")) {
                                                c3 = '\t';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1413737489:
                                            if (string7.equals("middleInitial")) {
                                                c3 = '\n';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1377792129:
                                            if (string7.equals("addressCity")) {
                                                c3 = 11;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1249512767:
                                            if (string7.equals("gender")) {
                                                c3 = '\f';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1186060294:
                                            if (string7.equals("postalAddressExtendedPostalCode")) {
                                                c6 = '\r';
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -1151034798:
                                            if (string7.equals("creditCardNumber")) {
                                                c3 = 14;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -835992323:
                                            if (string7.equals("namePrefix")) {
                                                c3 = 15;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -818219584:
                                            if (string7.equals("middleName")) {
                                                c3 = 16;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -747304516:
                                            if (string7.equals("nameSuffix")) {
                                                c3 = 17;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -613980922:
                                            if (string7.equals("creditCardExpirationDate")) {
                                                c3 = 18;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -613352043:
                                            if (string7.equals("creditCardExpirationYear")) {
                                                c3 = 19;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -549230602:
                                            if (string7.equals("telephoneNumberCountryCode")) {
                                                c3 = 20;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case -265713450:
                                            if (string7.equals("username")) {
                                                c3 = 21;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 3373707:
                                            if (string7.equals("name")) {
                                                c3 = 22;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 96619420:
                                            if (string7.equals("email")) {
                                                c3 = 23;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 253202685:
                                            if (string7.equals("addressState")) {
                                                c3 = 24;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 588174851:
                                            if (string7.equals("birthdayMonth")) {
                                                c3 = 25;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 798554127:
                                            break;
                                        case 892233837:
                                            if (string7.equals("telephoneNumber")) {
                                                c3 = 27;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 991032982:
                                            if (string7.equals("newUsername")) {
                                                c3 = 28;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 1069376125:
                                            if (string7.equals("birthday")) {
                                                c3 = 29;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 1216985755:
                                            if (string7.equals("password")) {
                                                c3 = 30;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 1469046696:
                                            if (string7.equals("givenName")) {
                                                c3 = 31;
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 1662667945:
                                            if (string7.equals("postalAddress")) {
                                                c3 = ' ';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 1921869058:
                                            if (string7.equals("postalAddressExtended")) {
                                                c3 = '!';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 2011152728:
                                            if (string7.equals("postalCode")) {
                                                c3 = '\"';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        case 2011773919:
                                            if (string7.equals("birthdayDay")) {
                                                c3 = '#';
                                                c6 = c3;
                                                str4 = str6;
                                                break;
                                            }
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                        default:
                                            str4 = str6;
                                            c6 = 65535;
                                            break;
                                    }
                                    switch (c6) {
                                        case 0:
                                            string7 = "birthDateYear";
                                            break;
                                        case 1:
                                            string7 = "smsOTPCode";
                                            break;
                                        case 2:
                                            string7 = str4;
                                            break;
                                        case 3:
                                            string7 = "phoneNational";
                                            break;
                                        case 4:
                                            string7 = "newPassword";
                                            break;
                                        case 5:
                                            string7 = "creditCardSecurityCode";
                                            break;
                                        case 6:
                                            string7 = "creditCardExpirationDay";
                                            break;
                                        case 7:
                                            string7 = "streetAddress";
                                            break;
                                        case '\b':
                                            string7 = "phoneNumberDevice";
                                            break;
                                        case '\t':
                                            string7 = "addressCountry";
                                            break;
                                        case '\n':
                                            string7 = "personMiddleInitial";
                                            break;
                                        case 11:
                                            string7 = "addressLocality";
                                            break;
                                        case '\f':
                                            string7 = "gender";
                                            break;
                                        case '\r':
                                            string7 = "extendedPostalCode";
                                            break;
                                        case 14:
                                            string7 = "creditCardNumber";
                                            break;
                                        case 15:
                                            string7 = "personNamePrefix";
                                            break;
                                        case 16:
                                            string7 = "personMiddleName";
                                            break;
                                        case 17:
                                            string7 = "personNameSuffix";
                                            break;
                                        case 18:
                                            string7 = "creditCardExpirationDate";
                                            break;
                                        case C0644l9.f7759C /* 19 */:
                                            string7 = "creditCardExpirationYear";
                                            break;
                                        case C0644l9.f7760D /* 20 */:
                                            string7 = "phoneCountryCode";
                                            break;
                                        case C0644l9.f7761E /* 21 */:
                                            string7 = "username";
                                            break;
                                        case 22:
                                            string7 = "personName";
                                            break;
                                        case 23:
                                            string7 = "emailAddress";
                                            break;
                                        case 24:
                                            string7 = "addressRegion";
                                            break;
                                        case C0644l9.f7762F /* 25 */:
                                            string7 = "birthDateMonth";
                                            break;
                                        case C0644l9.f7763G /* 26 */:
                                            string7 = "personFamilyName";
                                            break;
                                        case C0644l9.f7764H /* 27 */:
                                            string7 = "phoneNumber";
                                            break;
                                        case 28:
                                            string7 = "newUsername";
                                            break;
                                        case C0644l9.f7765I /* 29 */:
                                            string7 = "birthDateFull";
                                            break;
                                        case 30:
                                            string7 = "password";
                                            break;
                                        case 31:
                                            string7 = "personGivenName";
                                            break;
                                        case ' ':
                                            string7 = "postalAddress";
                                            break;
                                        case '!':
                                            string7 = "extendedAddress";
                                            break;
                                        case '\"':
                                            string7 = "postalCode";
                                            break;
                                        case C0644l9.f7766J /* 35 */:
                                            string7 = "birthDateDay";
                                            break;
                                    }
                                } else {
                                    str4 = str6;
                                }
                                strArr[i19] = string7;
                                str6 = str4;
                                i18 = i19 + 1;
                                nVar2 = nVar3;
                            }
                            nVar = nVar2;
                            o a3 = o.a(jSONObject4);
                            ?? aVar = new D0.a();
                            aVar.f264d = string5;
                            aVar.f261a = strArr;
                            aVar.f263c = string6;
                            aVar.f262b = a3;
                            r18 = aVar;
                        }
                        return new m(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, i12, nVar, num, str3, r18, (String[]) arrayList2.toArray(new String[arrayList2.size()]), mVarArr, localeArr);
                    }
                    i14 = i17 + 1;
                    str5 = str5;
                    length3 = i15;
                }
                throw new NoSuchFieldException(B0.c.j("No such TextInputType: ", string3));
            }
            i11++;
            arrayList = arrayList;
            str5 = str5;
            c4 = iArr;
            length2 = i13;
            i6 = 4;
            i3 = 3;
            i4 = 2;
        }
        throw new NoSuchFieldException(B0.c.j("No such TextCapitalization: ", string2));
    }
}
