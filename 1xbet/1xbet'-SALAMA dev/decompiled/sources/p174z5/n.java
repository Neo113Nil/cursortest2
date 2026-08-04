package p174z5;

import android.os.Build;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p136t.e;
import p155w1.F0;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f18512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f18513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f18514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18515i;
    public final F0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f18516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n[] f18517l;

    public n(boolean z4, boolean z7, boolean z8, boolean z9, boolean z10, p pVar, o oVar, Integer num, String str, F0 f7, String[] strArr, n[] nVarArr) {
        this.f18507a = z4;
        this.f18508b = z7;
        this.f18509c = z8;
        this.f18510d = z9;
        this.f18511e = z10;
        this.f18512f = pVar;
        this.f18513g = oVar;
        this.f18514h = num;
        this.f18515i = str;
        this.j = f7;
        this.f18516k = strArr;
        this.f18517l = nVarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0232 A[PHI: r13
      0x0232: PHI (r13v139 java.lang.Object) = 
      (r13v16 java.lang.Object)
      (r13v17 java.lang.Object)
      (r13v18 java.lang.Object)
      (r13v21 java.lang.Object)
      (r13v23 java.lang.Object)
      (r13v25 java.lang.Object)
      (r13v27 java.lang.Object)
      (r13v30 java.lang.Object)
      (r13v34 java.lang.Object)
      (r13v38 java.lang.Object)
      (r13v42 java.lang.Object)
      (r13v46 java.lang.Object)
      (r13v49 java.lang.Object)
      (r13v53 java.lang.Object)
      (r13v55 java.lang.Object)
      (r13v59 java.lang.Object)
      (r13v63 java.lang.Object)
      (r13v67 java.lang.Object)
      (r13v70 java.lang.Object)
      (r13v73 java.lang.Object)
      (r13v77 java.lang.Object)
      (r13v80 java.lang.Object)
      (r13v83 java.lang.Object)
      (r13v87 java.lang.Object)
      (r13v91 java.lang.Object)
      (r13v95 java.lang.Object)
      (r13v99 java.lang.Object)
      (r13v102 java.lang.Object)
      (r13v106 java.lang.Object)
      (r13v110 java.lang.Object)
      (r13v114 java.lang.Object)
      (r13v118 java.lang.Object)
      (r13v122 java.lang.Object)
      (r13v126 java.lang.Object)
      (r13v130 java.lang.Object)
      (r13v136 java.lang.Object)
      (r13v140 java.lang.Object)
     binds: [B:253:0x03fd, B:249:0x03f0, B:245:0x03e2, B:384:?, B:383:?, B:382:?, B:381:?, B:380:?, B:379:?, B:378:?, B:377:?, B:376:?, B:375:?, B:374:?, B:373:?, B:372:?, B:371:?, B:370:?, B:369:?, B:368:?, B:367:?, B:366:?, B:365:?, B:364:?, B:363:?, B:362:?, B:361:?, B:360:?, B:359:?, B:358:?, B:357:?, B:356:?, B:355:?, B:354:?, B:353:?, B:352:?, B:109:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    public static n a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        int i7;
        n[] nVarArr;
        Integer num;
        String str;
        F0 f7;
        Object obj;
        byte b7;
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
        int iValueOf = Integer.valueOf(i7);
        switch (string) {
            case "TextInputAction.done":
                iValueOf = 6;
                num = iValueOf;
                break;
            case "TextInputAction.next":
                iValueOf = 5;
                num = iValueOf;
                break;
            case "TextInputAction.none":
            case "TextInputAction.newline":
                num = iValueOf;
                break;
            case "TextInputAction.send":
                iValueOf = 4;
                num = iValueOf;
                break;
            case "TextInputAction.search":
                iValueOf = 3;
                num = iValueOf;
                break;
            case "TextInputAction.go":
                iValueOf = 2;
                num = iValueOf;
                break;
            case "TextInputAction.previous":
                iValueOf = 7;
                num = iValueOf;
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
        boolean zOptBoolean = jSONObject.optBoolean("obscureText");
        boolean zOptBoolean2 = jSONObject.optBoolean("autocorrect", true);
        boolean zOptBoolean3 = jSONObject.optBoolean("enableSuggestions");
        boolean zOptBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean zOptBoolean5 = jSONObject.optBoolean("enableDeltaModel");
        String string2 = jSONObject.getString("textCapitalization");
        p[] pVarArrValues = p.values();
        int length2 = pVarArrValues.length;
        int i10 = 0;
        while (i10 < length2) {
            int i11 = length2;
            p pVar = pVarArrValues[i10];
            p[] pVarArr = pVarArrValues;
            if (pVar.f18525a.equals(string2)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                String string3 = jSONObject2.getString("name");
                int[] iArrF = e.f(13);
                int length3 = iArrF.length;
                Object obj2 = "creditCardExpirationMonth";
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = length3;
                    int i14 = iArrF[i12];
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
                    int[] iArr = iArrF;
                    if (str.equals(string3)) {
                        o oVar = new o(i14, jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
                        String string4 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                        if (jSONObject.isNull("autofill")) {
                            f7 = null;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                            String string5 = jSONObject3.getString("uniqueIdentifier");
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("hints");
                            String string6 = jSONObject3.isNull("hintText") ? null : jSONObject3.getString("hintText");
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                            String[] strArr = new String[jSONArray3.length()];
                            int i15 = 0;
                            while (i15 < jSONArray3.length()) {
                                String string7 = jSONArray3.getString(i15);
                                JSONArray jSONArray4 = jSONArray3;
                                String str2 = string5;
                                byte b8 = 26;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    string7.getClass();
                                    switch (string7.hashCode()) {
                                        case -2058889126:
                                            obj = obj2;
                                            if (string7.equals("birthdayYear")) {
                                                b8 = 0;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1917283616:
                                            obj = obj2;
                                            if (string7.equals("oneTimeCode")) {
                                                b8 = 1;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1844815832:
                                            obj = obj2;
                                            if (string7.equals(obj)) {
                                                b8 = 2;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1825589953:
                                            if (string7.equals("telephoneNumberNational")) {
                                                b8 = 3;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1821235109:
                                            if (string7.equals("newPassword")) {
                                                b8 = 4;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1757573738:
                                            if (string7.equals("creditCardSecurityCode")) {
                                                b8 = 5;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1682373820:
                                            if (string7.equals("creditCardExpirationDay")) {
                                                b8 = 6;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1658955742:
                                            if (string7.equals("fullStreetAddress")) {
                                                obj = obj2;
                                                b8 = 7;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1567118045:
                                            if (string7.equals("telephoneNumberDevice")) {
                                                b7 = 8;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1476752575:
                                            if (string7.equals("countryName")) {
                                                b7 = 9;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1413737489:
                                            if (string7.equals("middleInitial")) {
                                                b7 = 10;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1377792129:
                                            if (string7.equals("addressCity")) {
                                                b7 = 11;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1249512767:
                                            if (string7.equals("gender")) {
                                                b7 = 12;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1186060294:
                                            if (string7.equals("postalAddressExtendedPostalCode")) {
                                                b8 = 13;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -1151034798:
                                            if (string7.equals("creditCardNumber")) {
                                                b7 = 14;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -835992323:
                                            if (string7.equals("namePrefix")) {
                                                b7 = 15;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -818219584:
                                            if (string7.equals("middleName")) {
                                                b7 = 16;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -747304516:
                                            if (string7.equals("nameSuffix")) {
                                                b7 = 17;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -613980922:
                                            if (string7.equals("creditCardExpirationDate")) {
                                                b7 = 18;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -613352043:
                                            if (string7.equals("creditCardExpirationYear")) {
                                                b7 = 19;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -549230602:
                                            if (string7.equals("telephoneNumberCountryCode")) {
                                                b7 = 20;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case -265713450:
                                            if (string7.equals("username")) {
                                                b7 = 21;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 3373707:
                                            if (string7.equals("name")) {
                                                b7 = 22;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 96619420:
                                            if (string7.equals("email")) {
                                                b7 = 23;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 253202685:
                                            if (string7.equals("addressState")) {
                                                b7 = 24;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 588174851:
                                            if (string7.equals("birthdayMonth")) {
                                                b7 = 25;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 798554127:
                                            if (string7.equals("familyName")) {
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 892233837:
                                            if (string7.equals("telephoneNumber")) {
                                                b7 = 27;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 991032982:
                                            if (string7.equals("newUsername")) {
                                                b7 = 28;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 1069376125:
                                            if (string7.equals("birthday")) {
                                                b7 = 29;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 1216985755:
                                            if (string7.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
                                                b7 = 30;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 1469046696:
                                            if (string7.equals("givenName")) {
                                                b7 = 31;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 1662667945:
                                            if (string7.equals("postalAddress")) {
                                                b7 = 32;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 1921869058:
                                            if (string7.equals("postalAddressExtended")) {
                                                b7 = 33;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 2011152728:
                                            if (string7.equals("postalCode")) {
                                                b7 = 34;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        case 2011773919:
                                            if (string7.equals("birthdayDay")) {
                                                b7 = 35;
                                                b8 = b7;
                                                obj = obj2;
                                            } else {
                                                obj = obj2;
                                                b8 = -1;
                                            }
                                            break;
                                        default:
                                            obj = obj2;
                                            b8 = -1;
                                            break;
                                    }
                                    switch (b8) {
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
                                        case 8:
                                            string7 = "phoneNumberDevice";
                                            break;
                                        case 9:
                                            string7 = "addressCountry";
                                            break;
                                        case 10:
                                            string7 = "personMiddleInitial";
                                            break;
                                        case 11:
                                            string7 = "addressLocality";
                                            break;
                                        case 12:
                                            string7 = "gender";
                                            break;
                                        case 13:
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
                                        case 32:
                                            string7 = "postalAddress";
                                            break;
                                        case 33:
                                            string7 = "extendedAddress";
                                            break;
                                        case 34:
                                            string7 = "postalCode";
                                            break;
                                        case 35:
                                            string7 = "birthDateDay";
                                            break;
                                    }
                                } else {
                                    obj = obj2;
                                }
                                strArr[i15] = string7;
                                i15++;
                                obj2 = obj;
                                string5 = str2;
                                jSONArray3 = jSONArray4;
                            }
                            f7 = new F0(string5, strArr, string6, q.a(jSONObject4));
                        }
                        return new n(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, pVar, oVar, num, string4, f7, (String[]) arrayList.toArray(new String[arrayList.size()]), nVarArr);
                    }
                    i12++;
                    length3 = i13;
                    iArrF = iArr;
                }
                throw new NoSuchFieldException(L.i("No such TextInputType: ", string3));
            }
            i10++;
            length2 = i11;
            pVarArrValues = pVarArr;
        }
        throw new NoSuchFieldException(L.i("No such TextCapitalization: ", string2));
    }
}
