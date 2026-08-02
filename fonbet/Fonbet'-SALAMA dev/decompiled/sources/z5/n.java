package z5;

import android.os.Build;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.F0;
import w1.L;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18501a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18502b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18503c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18504d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18505e;

    /* renamed from: f, reason: collision with root package name */
    public final p f18506f;

    /* renamed from: g, reason: collision with root package name */
    public final o f18507g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f18508h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18509i;
    public final F0 j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f18510k;

    /* renamed from: l, reason: collision with root package name */
    public final n[] f18511l;

    public n(boolean z4, boolean z7, boolean z8, boolean z9, boolean z10, p pVar, o oVar, Integer num, String str, F0 f02, String[] strArr, n[] nVarArr) {
        this.f18501a = z4;
        this.f18502b = z7;
        this.f18503c = z8;
        this.f18504d = z9;
        this.f18505e = z10;
        this.f18506f = pVar;
        this.f18507g = oVar;
        this.f18508h = num;
        this.f18509i = str;
        this.j = f02;
        this.f18510k = strArr;
        this.f18511l = nVarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b0, code lost:
    
        if (r14.equals("familyName") == false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n a(JSONObject jSONObject) {
        int i7;
        n[] nVarArr;
        char c3;
        Integer num;
        String str;
        String str2;
        o oVar;
        F0 f02;
        Object obj;
        char c4;
        String string = jSONObject.getString("inputAction");
        if (string == null) {
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }
        if (jSONObject.isNull("fields")) {
            i7 = 1;
            nVarArr = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            int length = jSONArray.length();
            n[] nVarArr2 = new n[length];
            for (int i8 = 0; i8 < length; i8++) {
                nVarArr2[i8] = a(jSONArray.getJSONObject(i8));
            }
            i7 = 1;
            nVarArr = nVarArr2;
        }
        int valueOf = Integer.valueOf(i7);
        switch (string.hashCode()) {
            case -737377923:
                if (string.equals("TextInputAction.done")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -737089298:
                if (string.equals("TextInputAction.next")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -737080013:
                if (string.equals("TextInputAction.none")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -736940669:
                if (string.equals("TextInputAction.send")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 469250275:
                if (string.equals("TextInputAction.search")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1241689507:
                if (string.equals("TextInputAction.go")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1539450297:
                if (string.equals("TextInputAction.newline")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 2110497650:
                if (string.equals("TextInputAction.previous")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                valueOf = 6;
                num = valueOf;
                break;
            case 1:
                valueOf = 5;
                num = valueOf;
                break;
            case 2:
            case 6:
                num = valueOf;
                break;
            case 3:
                valueOf = 4;
                num = valueOf;
                break;
            case 4:
                valueOf = 3;
                num = valueOf;
                break;
            case 5:
                valueOf = 2;
                num = valueOf;
                break;
            case 7:
                valueOf = 7;
                num = valueOf;
                break;
            default:
                num = 0;
                break;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
        if (jSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                arrayList.add(jSONArray2.optString(i9));
            }
        }
        boolean optBoolean = jSONObject.optBoolean("obscureText");
        boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
        boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
        boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
        String string2 = jSONObject.getString("textCapitalization");
        p[] values = p.values();
        int length2 = values.length;
        int i10 = 0;
        while (i10 < length2) {
            int i11 = length2;
            p pVar = values[i10];
            p[] pVarArr = values;
            if (pVar.f18519a.equals(string2)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                String string3 = jSONObject2.getString("name");
                int[] f7 = t.e.f(13);
                int length3 = f7.length;
                Object obj2 = "creditCardExpirationMonth";
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = length3;
                    int i14 = f7[i12];
                    switch (i14) {
                        case 1:
                            str = "TextInputType.text";
                            break;
                        case 2:
                            str = "TextInputType.datetime";
                            break;
                        case 3:
                            str = "TextInputType.name";
                            break;
                        case 4:
                            str = "TextInputType.address";
                            break;
                        case 5:
                            str = "TextInputType.number";
                            break;
                        case 6:
                            str = "TextInputType.phone";
                            break;
                        case 7:
                            str = "TextInputType.multiline";
                            break;
                        case 8:
                            str = "TextInputType.emailAddress";
                            break;
                        case 9:
                            str = "TextInputType.url";
                            break;
                        case 10:
                            str = "TextInputType.visiblePassword";
                            break;
                        case 11:
                            str = "TextInputType.none";
                            break;
                        case 12:
                            str = "TextInputType.webSearch";
                            break;
                        case 13:
                            str = "TextInputType.twitter";
                            break;
                        default:
                            throw null;
                    }
                    int[] iArr = f7;
                    if (str.equals(string3)) {
                        o oVar2 = new o(i14, jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
                        String string4 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                        if (jSONObject.isNull("autofill")) {
                            str2 = string4;
                            oVar = oVar2;
                            f02 = null;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                            String string5 = jSONObject3.getString("uniqueIdentifier");
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("hints");
                            String string6 = jSONObject3.isNull("hintText") ? null : jSONObject3.getString("hintText");
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                            String[] strArr = new String[jSONArray3.length()];
                            str2 = string4;
                            oVar = oVar2;
                            int i15 = 0;
                            while (i15 < jSONArray3.length()) {
                                String string7 = jSONArray3.getString(i15);
                                JSONArray jSONArray4 = jSONArray3;
                                String str3 = string5;
                                char c7 = 26;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    string7.getClass();
                                    switch (string7.hashCode()) {
                                        case -2058889126:
                                            obj = obj2;
                                            if (string7.equals("birthdayYear")) {
                                                c7 = 0;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1917283616:
                                            obj = obj2;
                                            if (string7.equals("oneTimeCode")) {
                                                c7 = 1;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1844815832:
                                            obj = obj2;
                                            if (string7.equals(obj)) {
                                                c7 = 2;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1825589953:
                                            if (string7.equals("telephoneNumberNational")) {
                                                c7 = 3;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1821235109:
                                            if (string7.equals("newPassword")) {
                                                c7 = 4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1757573738:
                                            if (string7.equals("creditCardSecurityCode")) {
                                                c7 = 5;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1682373820:
                                            if (string7.equals("creditCardExpirationDay")) {
                                                c7 = 6;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1658955742:
                                            if (string7.equals("fullStreetAddress")) {
                                                obj = obj2;
                                                c7 = 7;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1567118045:
                                            if (string7.equals("telephoneNumberDevice")) {
                                                c4 = '\b';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1476752575:
                                            if (string7.equals("countryName")) {
                                                c4 = '\t';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1413737489:
                                            if (string7.equals("middleInitial")) {
                                                c4 = '\n';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1377792129:
                                            if (string7.equals("addressCity")) {
                                                c4 = 11;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1249512767:
                                            if (string7.equals("gender")) {
                                                c4 = '\f';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1186060294:
                                            if (string7.equals("postalAddressExtendedPostalCode")) {
                                                c7 = '\r';
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -1151034798:
                                            if (string7.equals("creditCardNumber")) {
                                                c4 = 14;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -835992323:
                                            if (string7.equals("namePrefix")) {
                                                c4 = 15;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -818219584:
                                            if (string7.equals("middleName")) {
                                                c4 = 16;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -747304516:
                                            if (string7.equals("nameSuffix")) {
                                                c4 = 17;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -613980922:
                                            if (string7.equals("creditCardExpirationDate")) {
                                                c4 = 18;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -613352043:
                                            if (string7.equals("creditCardExpirationYear")) {
                                                c4 = 19;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -549230602:
                                            if (string7.equals("telephoneNumberCountryCode")) {
                                                c4 = 20;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case -265713450:
                                            if (string7.equals("username")) {
                                                c4 = 21;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 3373707:
                                            if (string7.equals("name")) {
                                                c4 = 22;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 96619420:
                                            if (string7.equals("email")) {
                                                c4 = 23;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 253202685:
                                            if (string7.equals("addressState")) {
                                                c4 = 24;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 588174851:
                                            if (string7.equals("birthdayMonth")) {
                                                c4 = 25;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 798554127:
                                            break;
                                        case 892233837:
                                            if (string7.equals("telephoneNumber")) {
                                                c4 = 27;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 991032982:
                                            if (string7.equals("newUsername")) {
                                                c4 = 28;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 1069376125:
                                            if (string7.equals("birthday")) {
                                                c4 = 29;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 1216985755:
                                            if (string7.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
                                                c4 = 30;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 1469046696:
                                            if (string7.equals("givenName")) {
                                                c4 = 31;
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 1662667945:
                                            if (string7.equals("postalAddress")) {
                                                c4 = ' ';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 1921869058:
                                            if (string7.equals("postalAddressExtended")) {
                                                c4 = '!';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 2011152728:
                                            if (string7.equals("postalCode")) {
                                                c4 = '\"';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        case 2011773919:
                                            if (string7.equals("birthdayDay")) {
                                                c4 = '#';
                                                c7 = c4;
                                                obj = obj2;
                                                break;
                                            }
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                        default:
                                            obj = obj2;
                                            c7 = 65535;
                                            break;
                                    }
                                    switch (c7) {
                                        case 0:
                                            string7 = "birthDateYear";
                                            break;
                                        case 1:
                                            string7 = "smsOTPCode";
                                            break;
                                        case 2:
                                            string7 = obj;
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
                                        case 19:
                                            string7 = "creditCardExpirationYear";
                                            break;
                                        case 20:
                                            string7 = "phoneCountryCode";
                                            break;
                                        case zzbbd.zzt.zzm /* 21 */:
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
                                        case 25:
                                            string7 = "birthDateMonth";
                                            break;
                                        case 26:
                                            string7 = "personFamilyName";
                                            break;
                                        case 27:
                                            string7 = "phoneNumber";
                                            break;
                                        case 28:
                                            string7 = "newUsername";
                                            break;
                                        case 29:
                                            string7 = "birthDateFull";
                                            break;
                                        case 30:
                                            string7 = URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
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
                                        case '#':
                                            string7 = "birthDateDay";
                                            break;
                                    }
                                } else {
                                    obj = obj2;
                                }
                                strArr[i15] = string7;
                                i15++;
                                obj2 = obj;
                                string5 = str3;
                                jSONArray3 = jSONArray4;
                            }
                            f02 = new F0(string5, strArr, string6, q.a(jSONObject4));
                        }
                        return new n(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, pVar, oVar, num, str2, f02, (String[]) arrayList.toArray(new String[arrayList.size()]), nVarArr);
                    }
                    i12++;
                    length3 = i13;
                    f7 = iArr;
                }
                throw new NoSuchFieldException(L.i("No such TextInputType: ", string3));
            }
            i10++;
            length2 = i11;
            values = pVarArr;
        }
        throw new NoSuchFieldException(L.i("No such TextCapitalization: ", string2));
    }
}
