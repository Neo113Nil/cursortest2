package com.google.firebase.auth;

import D6.y0;
import E5.V;
import G4.A;
import I2.C0306n;
import N4.b;
import Q3.o;
import Y3.i;
import Y3.j;
import a.AbstractC0603a;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzadn;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzz;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import d6.C0977k;
import e4.AbstractC1039m;
import e4.C1027a;
import e4.C1028b;
import e4.C1029c;
import e4.C1038l;
import e4.C1043q;
import e4.C1044r;
import e4.C1047u;
import e4.C1048v;
import e4.C1050x;
import f4.C1084A;
import f4.C1091c;
import f4.C1096h;
import f4.InterfaceC1088E;
import f4.InterfaceC1090b;
import f4.p;
import f4.s;
import f4.u;
import f4.z;
import i3.C1263a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.L;

/* loaded from: classes2.dex */
public class FirebaseAuth implements InterfaceC1090b {

    /* renamed from: A, reason: collision with root package name */
    public final Executor f11847A;

    /* renamed from: B, reason: collision with root package name */
    public String f11848B;

    /* renamed from: a, reason: collision with root package name */
    public final i f11849a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11850b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f11851c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f11852d;

    /* renamed from: e, reason: collision with root package name */
    public final zzabj f11853e;

    /* renamed from: f, reason: collision with root package name */
    public FirebaseUser f11854f;

    /* renamed from: g, reason: collision with root package name */
    public final A f11855g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f11856h;

    /* renamed from: i, reason: collision with root package name */
    public String f11857i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public String f11858k;

    /* renamed from: l, reason: collision with root package name */
    public o f11859l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f11860m;

    /* renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f11861n;

    /* renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f11862o;

    /* renamed from: p, reason: collision with root package name */
    public final RecaptchaAction f11863p;

    /* renamed from: q, reason: collision with root package name */
    public final RecaptchaAction f11864q;

    /* renamed from: r, reason: collision with root package name */
    public final RecaptchaAction f11865r;

    /* renamed from: s, reason: collision with root package name */
    public final C0977k f11866s;

    /* renamed from: t, reason: collision with root package name */
    public final C1084A f11867t;

    /* renamed from: u, reason: collision with root package name */
    public final C1091c f11868u;

    /* renamed from: v, reason: collision with root package name */
    public final b f11869v;

    /* renamed from: w, reason: collision with root package name */
    public final b f11870w;

    /* renamed from: x, reason: collision with root package name */
    public u f11871x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f11872y;

    /* renamed from: z, reason: collision with root package name */
    public final Executor f11873z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a4, code lost:
    
        if (r11.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FirebaseAuth(i iVar, b bVar, b bVar2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        JSONObject jSONObject;
        zzad u4;
        i iVar2;
        String string;
        ?? r02 = 0;
        zzabj zzabjVar = new zzabj(iVar, executor, scheduledExecutorService);
        iVar.b();
        String g3 = iVar.g();
        C0977k c0977k = new C0977k(3, (boolean) (0 == true ? 1 : 0));
        Context context = iVar.f7663a;
        D.i(context);
        D.e(g3);
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("com.google.firebase.auth.api.Store." + g3, 0);
        c0977k.f12441b = sharedPreferences;
        c0977k.f12442c = new C1263a("StorageHelpers", new String[0]);
        C1084A c1084a = C1084A.f12901c;
        C1091c c1091c = C1091c.f12931c;
        this.f11850b = new CopyOnWriteArrayList();
        this.f11851c = new CopyOnWriteArrayList();
        this.f11852d = new CopyOnWriteArrayList();
        this.f11856h = new Object();
        this.j = new Object();
        this.f11860m = RecaptchaAction.custom("getOobCode");
        this.f11861n = RecaptchaAction.custom("signInWithPassword");
        this.f11862o = RecaptchaAction.custom("signUpPassword");
        this.f11863p = RecaptchaAction.custom("sendVerificationCode");
        this.f11864q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f11865r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f11849a = iVar;
        this.f11853e = zzabjVar;
        this.f11866s = c0977k;
        A a2 = new A();
        a2.f2871a = false;
        a2.f2872b = false;
        this.f11855g = a2;
        D.i(c1084a);
        this.f11867t = c1084a;
        this.f11868u = c1091c;
        this.f11869v = bVar;
        this.f11870w = bVar2;
        this.f11872y = executor;
        this.f11873z = executor2;
        this.f11847A = executor3;
        String string2 = sharedPreferences.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                jSONObject = new JSONObject(string2);
            } catch (Exception unused) {
            }
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                u4 = c0977k.u(jSONObject);
                this.f11854f = u4;
                if (u4 != null) {
                    C0977k c0977k2 = this.f11866s;
                    c0977k2.getClass();
                    String string3 = ((SharedPreferences) c0977k2.f12441b).getString(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", u4.f11909b.f11939a), null);
                    zzagl zzb = string3 != null ? zzagl.zzb(string3) : null;
                    if (zzb != null) {
                        k(this, this.f11854f, zzb, false, false);
                    }
                }
                s sVar = this.f11867t.f12902a;
                sVar.getClass();
                iVar2 = this.f11849a;
                iVar2.b();
                SharedPreferences sharedPreferences2 = iVar2.f7663a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
                string = sharedPreferences2.getString("firebaseAppName", "");
                iVar2.b();
                if (iVar2.f7664b.equals(string)) {
                    return;
                }
                if (!sharedPreferences2.contains("verifyAssertionRequest")) {
                    if (!sharedPreferences2.contains("recaptchaToken")) {
                        if (sharedPreferences2.contains("statusCode")) {
                            Status status = new Status(sharedPreferences2.getInt("statusCode", 17062), sharedPreferences2.getString("statusMessage", ""), null, null);
                            sVar.f12966b = sharedPreferences2.getLong("timestamp", 0L);
                            s.d(sharedPreferences2);
                            Tasks.forException(zzadg.zza(status));
                            return;
                        }
                        return;
                    }
                    String string4 = sharedPreferences2.getString("recaptchaToken", "");
                    String string5 = sharedPreferences2.getString("operation", "");
                    sVar.f12966b = sharedPreferences2.getLong("timestamp", 0L);
                    string5.getClass();
                    if (string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                        sVar.f12965a = Tasks.forResult(string4);
                    } else {
                        sVar.f12965a = null;
                    }
                    s.d(sharedPreferences2);
                    return;
                }
                String string6 = sharedPreferences2.getString("verifyAssertionRequest", "");
                zzahr zzahrVar = (zzahr) AbstractC0603a.Q(string6 == null ? null : Base64.decode(string6, 10), zzahr.CREATOR);
                String string7 = sharedPreferences2.getString("operation", "");
                String string8 = sharedPreferences2.getString("tenantId", null);
                String string9 = sharedPreferences2.getString("firebaseUserUid", "");
                sVar.f12966b = sharedPreferences2.getLong("timestamp", 0L);
                if (string8 != null) {
                    e(string8);
                    zzahrVar.zzb(string8);
                }
                string7.getClass();
                switch (string7.hashCode()) {
                    case -98509410:
                        break;
                    case 175006864:
                        if (string7.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            r02 = 1;
                            break;
                        }
                        r02 = -1;
                        break;
                    case 1450464913:
                        if (string7.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            r02 = 2;
                            break;
                        }
                        r02 = -1;
                        break;
                    default:
                        r02 = -1;
                        break;
                }
                switch (r02) {
                    case 0:
                        if (((zzad) this.f11854f).f11909b.f11939a.equals(string9)) {
                            o(this.f11854f, zze.n(zzahrVar));
                            break;
                        }
                        break;
                    case 1:
                        if (((zzad) this.f11854f).f11909b.f11939a.equals(string9)) {
                            g(this.f11854f, zze.n(zzahrVar));
                            break;
                        }
                        break;
                    case 2:
                        f(zze.n(zzahrVar));
                        break;
                }
                s.d(sharedPreferences2);
                return;
            }
        }
        u4 = null;
        this.f11854f = u4;
        if (u4 != null) {
        }
        s sVar2 = this.f11867t.f12902a;
        sVar2.getClass();
        iVar2 = this.f11849a;
        iVar2.b();
        SharedPreferences sharedPreferences22 = iVar2.f7663a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        string = sharedPreferences22.getString("firebaseAppName", "");
        iVar2.b();
        if (iVar2.f7664b.equals(string)) {
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        i e7 = i.e();
        e7.b();
        return (FirebaseAuth) e7.f7666d.a(FirebaseAuth.class);
    }

    public static void i(j jVar, C1038l c1038l, String str) {
        L.n("Invoking verification failure callback for phone number/uid - ", str, "FirebaseAuth");
        AbstractC1039m zza = zzaer.zza(str, c1038l.f12685c, null);
        y0 y0Var = new y0();
        y0Var.f1891b = zza;
        y0Var.f1892c = jVar;
        c1038l.f12686d.execute(y0Var);
    }

    public static void j(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((zzad) firebaseUser).f11909b.f11939a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f11847A.execute(new b1(firebaseAuth, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzagl zzaglVar, boolean z4, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        FirebaseUser firebaseUser2;
        ArrayList arrayList;
        ArrayList arrayList2;
        D.i(firebaseUser);
        D.i(zzaglVar);
        FirebaseUser firebaseUser3 = firebaseAuth.f11854f;
        boolean z12 = firebaseUser3 != null && ((zzad) firebaseUser).f11909b.f11939a.equals(((zzad) firebaseUser3).f11909b.f11939a);
        if (!z12 && z7) {
            return;
        }
        FirebaseUser firebaseUser4 = firebaseAuth.f11854f;
        if (firebaseUser4 == null) {
            z9 = true;
            z8 = true;
        } else {
            z8 = (z12 && ((zzad) firebaseUser4).f11908a.zzc().equals(zzaglVar.zzc())) ? false : true;
            z9 = !z12;
        }
        FirebaseUser firebaseUser5 = firebaseAuth.f11854f;
        String str = null;
        if (firebaseUser5 != null) {
            zzad zzadVar = (zzad) firebaseUser;
            if (zzadVar.f11909b.f11939a.equals(firebaseUser5 == null ? null : ((zzad) firebaseUser5).f11909b.f11939a)) {
                firebaseAuth.f11854f.n(zzadVar.f11912e);
                if (!firebaseUser.k()) {
                    ((zzad) firebaseAuth.f11854f).f11915y = Boolean.FALSE;
                }
                zzbl zzblVar = zzadVar.f11906C;
                if (zzblVar != null) {
                    arrayList2 = new ArrayList();
                    Iterator it = zzblVar.f11930a.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((PhoneMultiFactorInfo) it.next());
                    }
                    Iterator it2 = zzblVar.f11931b.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TotpMultiFactorInfo) it2.next());
                    }
                } else {
                    arrayList2 = new ArrayList();
                }
                List list = zzadVar.f11907D;
                firebaseAuth.f11854f.o(arrayList2);
                zzad zzadVar2 = (zzad) firebaseAuth.f11854f;
                if (list == null) {
                    zzadVar2.getClass();
                    list = new ArrayList();
                }
                zzadVar2.f11907D = list;
                if (z4) {
                    z10 = false;
                    z11 = true;
                } else {
                    C0977k c0977k = firebaseAuth.f11866s;
                    FirebaseUser firebaseUser6 = firebaseAuth.f11854f;
                    c0977k.getClass();
                    D.i(firebaseUser6);
                    C1263a c1263a = (C1263a) c0977k.f12442c;
                    JSONObject jSONObject = new JSONObject();
                    if (zzad.class.isAssignableFrom(firebaseUser6.getClass())) {
                        zzad zzadVar3 = (zzad) firebaseUser6;
                        try {
                            jSONObject.put("cachedTokenState", zzadVar3.f11908a.zzf());
                            i f7 = i.f(zzadVar3.f11910c);
                            f7.b();
                            jSONObject.put("applicationName", f7.f7664b);
                            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                            if (zzadVar3.f11912e != null) {
                                JSONArray jSONArray = new JSONArray();
                                ArrayList arrayList3 = zzadVar3.f11912e;
                                int size = arrayList3.size();
                                if (arrayList3.size() > 30) {
                                    c1263a.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList3.size()));
                                    size = 30;
                                }
                                boolean z13 = false;
                                for (int i7 = 0; i7 < size; i7++) {
                                    zzz zzzVar = (zzz) arrayList3.get(i7);
                                    if (zzzVar.f11940b.equals("firebase")) {
                                        z13 = true;
                                    }
                                    if (i7 == size - 1 && !z13) {
                                        break;
                                    }
                                    jSONArray.put(zzzVar.k());
                                }
                                if (z13) {
                                    z11 = true;
                                } else {
                                    int i8 = size - 1;
                                    while (true) {
                                        if (i8 >= arrayList3.size() || i8 < 0) {
                                            break;
                                        }
                                        zzz zzzVar2 = (zzz) arrayList3.get(i8);
                                        if (zzzVar2.f11940b.equals("firebase")) {
                                            jSONArray.put(zzzVar2.k());
                                            z13 = true;
                                            break;
                                        } else {
                                            if (i8 == arrayList3.size() - 1) {
                                                jSONArray.put(zzzVar2.k());
                                            }
                                            i8++;
                                        }
                                    }
                                    z11 = true;
                                    if (!z13) {
                                        c1263a.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList3.size()), Integer.valueOf(size));
                                        if (arrayList3.size() < 5) {
                                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                            Iterator it3 = arrayList3.iterator();
                                            while (it3.hasNext()) {
                                                sb.append("Provider - " + ((zzz) it3.next()).f11940b + "\n");
                                            }
                                            c1263a.f(sb.toString(), new Object[0]);
                                        }
                                    }
                                }
                                jSONObject.put("userInfos", jSONArray);
                            } else {
                                z11 = true;
                            }
                            jSONObject.put("anonymous", zzadVar3.k());
                            jSONObject.put("version", "2");
                            zzaf zzafVar = zzadVar3.f11916z;
                            if (zzafVar != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("lastSignInTimestamp", zzafVar.f11917a);
                                    jSONObject2.put("creationTimestamp", zzafVar.f11918b);
                                } catch (JSONException unused) {
                                }
                                jSONObject.put("userMetadata", jSONObject2);
                            }
                            zzbl zzblVar2 = zzadVar3.f11906C;
                            if (zzblVar2 != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = zzblVar2.f11930a.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add((PhoneMultiFactorInfo) it4.next());
                                }
                                Iterator it5 = zzblVar2.f11931b.iterator();
                                while (it5.hasNext()) {
                                    arrayList.add((TotpMultiFactorInfo) it5.next());
                                }
                            } else {
                                arrayList = new ArrayList();
                            }
                            if (!arrayList.isEmpty()) {
                                JSONArray jSONArray2 = new JSONArray();
                                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                    jSONArray2.put(((MultiFactorInfo) arrayList.get(i9)).m());
                                }
                                jSONObject.put("userMultiFactorInfo", jSONArray2);
                            }
                            List list2 = zzadVar3.f11907D;
                            if (list2 != null && !list2.isEmpty()) {
                                JSONArray jSONArray3 = new JSONArray();
                                for (int i10 = 0; i10 < list2.size(); i10++) {
                                    zzan zzanVar = (zzan) list2.get(i10);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("credentialId", zzanVar.f11948a);
                                    jSONObject3.put("name", zzanVar.f11949b);
                                    jSONObject3.put("displayName", zzanVar.f11950c);
                                    jSONArray3.put(jSONObject3);
                                }
                                jSONObject.put("passkeyInfo", jSONArray3);
                            }
                            str = jSONObject.toString();
                            z10 = false;
                        } catch (Exception e7) {
                            Log.wtf(c1263a.f13980a, c1263a.d("Failed to turn object into JSON", new Object[0]), e7);
                            throw new zzzh(e7);
                        }
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ((SharedPreferences) c0977k.f12441b).edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
                    }
                }
                if (z8) {
                    FirebaseUser firebaseUser7 = firebaseAuth.f11854f;
                    if (firebaseUser7 != null) {
                        ((zzad) firebaseUser7).f11908a = zzaglVar;
                    }
                    n(firebaseAuth, firebaseUser7);
                }
                if (z9) {
                    j(firebaseAuth, firebaseAuth.f11854f);
                }
                if (z4) {
                    C0977k c0977k2 = firebaseAuth.f11866s;
                    c0977k2.getClass();
                    ((SharedPreferences) c0977k2.f12441b).edit().putString(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).f11909b.f11939a), zzaglVar.zzf()).apply();
                }
                firebaseUser2 = firebaseAuth.f11854f;
                if (firebaseUser2 == null) {
                    if (firebaseAuth.f11871x == null) {
                        i iVar = firebaseAuth.f11849a;
                        D.i(iVar);
                        firebaseAuth.f11871x = new u(iVar);
                    }
                    u uVar = firebaseAuth.f11871x;
                    zzagl zzaglVar2 = ((zzad) firebaseUser2).f11908a;
                    uVar.getClass();
                    if (zzaglVar2 == null) {
                        return;
                    }
                    long zza = zzaglVar2.zza();
                    if (zza <= 0) {
                        zza = 3600;
                    }
                    long zzb = (zza * 1000) + zzaglVar2.zzb();
                    C1096h c1096h = uVar.f12968b;
                    c1096h.f12938a = zzb;
                    c1096h.f12939b = -1L;
                    if (uVar.f12967a > 0 && !uVar.f12969c) {
                        z10 = z11;
                    }
                    if (z10) {
                        uVar.f12968b.a();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        firebaseAuth.f11854f = firebaseUser;
        if (z4) {
        }
        if (z8) {
        }
        if (z9) {
        }
        if (z4) {
        }
        firebaseUser2 = firebaseAuth.f11854f;
        if (firebaseUser2 == null) {
        }
    }

    public static void l(C1038l c1038l) {
        String str;
        String str2;
        MultiFactorSession multiFactorSession = c1038l.f12690h;
        Executor executor = c1038l.f12686d;
        Activity activity = c1038l.f12688f;
        V v6 = c1038l.f12685c;
        PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken = c1038l.f12689g;
        FirebaseAuth firebaseAuth = c1038l.f12683a;
        if (multiFactorSession == null) {
            String str3 = c1038l.f12687e;
            D.e(str3);
            if (phoneAuthProvider$ForceResendingToken == null && zzaer.zza(str3, v6, activity, executor)) {
                return;
            }
            firebaseAuth.f11868u.a(firebaseAuth, str3, c1038l.f12688f, firebaseAuth.q(), c1038l.j, c1038l.f12692k, firebaseAuth.f11863p).addOnCompleteListener(new C1044r(firebaseAuth, c1038l, str3, 1));
            return;
        }
        zzao zzaoVar = (zzao) multiFactorSession;
        if (zzaoVar.f11925a != null) {
            String str4 = c1038l.f12687e;
            D.e(str4);
            str = str4;
            str2 = str;
        } else {
            PhoneMultiFactorInfo phoneMultiFactorInfo = c1038l.f12691i;
            D.i(phoneMultiFactorInfo);
            String str5 = phoneMultiFactorInfo.f11882a;
            D.e(str5);
            str = phoneMultiFactorInfo.f11885d;
            str2 = str5;
        }
        if (phoneAuthProvider$ForceResendingToken == null || !zzaer.zza(str2, v6, activity, executor)) {
            firebaseAuth.f11868u.a(firebaseAuth, str, c1038l.f12688f, firebaseAuth.q(), c1038l.j, c1038l.f12692k, zzaoVar.f11925a != null ? firebaseAuth.f11864q : firebaseAuth.f11865r).addOnCompleteListener(new C1044r(firebaseAuth, c1038l, str2, 0));
        }
    }

    public static void n(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((zzad) firebaseUser).f11909b.f11939a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String zzc = firebaseUser != null ? ((zzad) firebaseUser).f11908a.zzc() : null;
        O4.b bVar = new O4.b();
        bVar.f5008a = zzc;
        firebaseAuth.f11847A.execute(new y0(23, firebaseAuth, bVar));
    }

    public final String a() {
        String str;
        synchronized (this.f11856h) {
            str = this.f11857i;
        }
        return str;
    }

    public final String b() {
        String str;
        synchronized (this.j) {
            str = this.f11858k;
        }
        return str;
    }

    public final Task c(String str, ActionCodeSettings actionCodeSettings) {
        D.e(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = new ActionCodeSettings(new C0306n(1));
        }
        String str2 = this.f11857i;
        if (str2 != null) {
            actionCodeSettings.f11839y = str2;
        }
        actionCodeSettings.f11840z = 1;
        return new C1048v(this, str, actionCodeSettings, 1).i0(this, this.f11858k, this.f11860m);
    }

    public final void d(String str) {
        D.e(str);
        if (str.startsWith("chrome-extension://")) {
            this.f11848B = str;
            return;
        }
        try {
            String host = new URI(str.contains("://") ? str : "http://".concat(str)).getHost();
            D.i(host);
            this.f11848B = host;
        } catch (URISyntaxException e7) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e7.getMessage());
            }
            this.f11848B = str;
        }
    }

    public final void e(String str) {
        D.e(str);
        synchronized (this.j) {
            this.f11858k = str;
        }
    }

    public final Task f(AuthCredential authCredential) {
        C1027a c1027a;
        AuthCredential m7 = authCredential.m();
        if (!(m7 instanceof EmailAuthCredential)) {
            boolean z4 = m7 instanceof PhoneAuthCredential;
            i iVar = this.f11849a;
            zzabj zzabjVar = this.f11853e;
            return z4 ? zzabjVar.zza(iVar, (PhoneAuthCredential) m7, this.f11858k, (InterfaceC1088E) new C1028b(this)) : zzabjVar.zza(iVar, m7, this.f11858k, new C1028b(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) m7;
        String str = emailAuthCredential.f11843c;
        if (TextUtils.isEmpty(str)) {
            String str2 = emailAuthCredential.f11842b;
            D.i(str2);
            String str3 = this.f11858k;
            return new C1050x(this, emailAuthCredential.f11841a, false, null, str2, str3).i0(this, str3, this.f11861n);
        }
        D.e(str);
        zzap zzapVar = C1027a.f12669d;
        D.e(str);
        try {
            c1027a = new C1027a(str);
        } catch (IllegalArgumentException unused) {
            c1027a = null;
        }
        return c1027a != null && !TextUtils.equals(this.f11858k, c1027a.f12672c) ? Tasks.forException(zzadg.zza(new Status(17072, null, null, null))) : new C1043q(this, false, null, emailAuthCredential).i0(this, this.f11858k, this.f11860m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [e4.c, f4.z] */
    public final Task g(FirebaseUser firebaseUser, AuthCredential authCredential) {
        D.i(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new C1047u(this, firebaseUser, (EmailAuthCredential) authCredential.m(), 1).i0(this, firebaseUser.j(), this.f11862o);
        }
        AuthCredential m7 = authCredential.m();
        ?? c1029c = new C1029c(this, 0);
        return this.f11853e.zza(this.f11849a, firebaseUser, m7, (String) null, (z) c1029c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [e4.c, f4.z] */
    public final Task h(FirebaseUser firebaseUser, boolean z4) {
        if (firebaseUser == null) {
            return Tasks.forException(zzadg.zza(new Status(17495, null, null, null)));
        }
        zzagl zzaglVar = ((zzad) firebaseUser).f11908a;
        if (zzaglVar.zzg() && !z4) {
            return Tasks.forResult(p.a(zzaglVar.zzc()));
        }
        return this.f11853e.zza(this.f11849a, firebaseUser, zzaglVar.zzd(), (z) new C1029c(this, 1));
    }

    public final synchronized o m() {
        return this.f11859l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.c, f4.z] */
    public final Task o(FirebaseUser firebaseUser, AuthCredential authCredential) {
        C1027a c1027a;
        int i7 = 0;
        D.i(firebaseUser);
        AuthCredential m7 = authCredential.m();
        if (!(m7 instanceof EmailAuthCredential)) {
            if (!(m7 instanceof PhoneAuthCredential)) {
                return this.f11853e.zzc(this.f11849a, firebaseUser, m7, firebaseUser.j(), new C1029c(this, i7));
            }
            return this.f11853e.zzb(this.f11849a, firebaseUser, (PhoneAuthCredential) m7, this.f11858k, (z) new C1029c(this, i7));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) m7;
        if (URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD.equals(emailAuthCredential.k())) {
            String str = emailAuthCredential.f11842b;
            D.e(str);
            String j = firebaseUser.j();
            return new C1050x(this, emailAuthCredential.f11841a, true, firebaseUser, str, j).i0(this, j, this.f11861n);
        }
        String str2 = emailAuthCredential.f11843c;
        D.e(str2);
        zzap zzapVar = C1027a.f12669d;
        D.e(str2);
        try {
            c1027a = new C1027a(str2);
        } catch (IllegalArgumentException unused) {
            c1027a = null;
        }
        return (c1027a == null || TextUtils.equals(this.f11858k, c1027a.f12672c)) ? new C1043q(this, true, firebaseUser, emailAuthCredential).i0(this, this.f11858k, this.f11860m) : Tasks.forException(zzadg.zza(new Status(17072, null, null, null)));
    }

    public final void p() {
        C0977k c0977k = this.f11866s;
        D.i(c0977k);
        FirebaseUser firebaseUser = this.f11854f;
        if (firebaseUser != null) {
            ((SharedPreferences) c0977k.f12441b).edit().remove(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).f11909b.f11939a)).apply();
            this.f11854f = null;
        }
        ((SharedPreferences) c0977k.f12441b).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        n(this, null);
        j(this, null);
    }

    public final boolean q() {
        i iVar = this.f11849a;
        iVar.b();
        return zzadn.zza(iVar.f7663a);
    }

    @Keep
    public static FirebaseAuth getInstance(i iVar) {
        iVar.b();
        return (FirebaseAuth) iVar.f7666d.a(FirebaseAuth.class);
    }
}
