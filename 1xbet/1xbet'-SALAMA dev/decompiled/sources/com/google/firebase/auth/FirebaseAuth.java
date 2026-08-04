package com.google.firebase.auth;

import D6.y0;
import E5.V;
import G4.A;
import I2.C0306n;
import N4.b;
import Q3.o;
import Y3.i;
import Y3.j;
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
import p028d6.k;
import p034e4.c;
import p034e4.l;
import p034e4.m;
import p034e4.q;
import p034e4.r;
import p034e4.v;
import p034e4.x;
import p042f4.C0894c;
import p042f4.C0899h;
import p042f4.E;
import p042f4.InterfaceC0893b;
import p042f4.p;
import p042f4.s;
import p042f4.u;
import p042f4.z;
import p062i3.a;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseAuth implements InterfaceC0893b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Executor f11847A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f11848B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f11851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f11852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzabj f11853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FirebaseUser f11854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A f11855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11857i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f11859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f11860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f11861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f11862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecaptchaAction f11863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RecaptchaAction f11864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RecaptchaAction f11865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f11866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p042f4.A f11867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894c f11868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f11869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f11870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u f11871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Executor f11872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Executor f11873z;

    /* JADX WARN: Code duplicated, block: B:4:0x00c9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "arg" is null
    	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.extractConstNumber(SwitchOverStringVisitor.java:369)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.collectPart1RegionCases(SwitchOverStringVisitor.java:207)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:108)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public FirebaseAuth(i iVar, b bVar, b bVar2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        zzad zzadVarU;
        char c3 = 0;
        zzabj zzabjVar = new zzabj(iVar, executor, scheduledExecutorService);
        iVar.b();
        String strG = iVar.g();
        k kVar = new k(3, (boolean) (0 == true ? 1 : 0));
        Context context = iVar.f7663a;
        D.i(context);
        D.e(strG);
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("com.google.firebase.auth.api.Store." + strG, 0);
        kVar.f12447b = sharedPreferences;
        kVar.f12448c = new a("StorageHelpers", new String[0]);
        p042f4.A a2 = p042f4.A.f12907c;
        C0894c c0894c = C0894c.f12937c;
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
        this.f11866s = kVar;
        A a4 = new A();
        a4.f2871a = false;
        a4.f2872b = false;
        this.f11855g = a4;
        D.i(a2);
        this.f11867t = a2;
        this.f11868u = c0894c;
        this.f11869v = bVar;
        this.f11870w = bVar2;
        this.f11872y = executor;
        this.f11873z = executor2;
        this.f11847A = executor3;
        String string = sharedPreferences.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            zzadVarU = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    zzadVarU = kVar.u(jSONObject);
                } else {
                    zzadVarU = null;
                }
            } catch (Exception unused) {
            }
        }
        this.f11854f = zzadVarU;
        if (zzadVarU != null) {
            k kVar2 = this.f11866s;
            kVar2.getClass();
            String string2 = ((SharedPreferences) kVar2.f12447b).getString(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", zzadVarU.f11909b.f11939a), null);
            zzagl zzaglVarZzb = string2 != null ? zzagl.zzb(string2) : null;
            if (zzaglVarZzb != null) {
                k(this, this.f11854f, zzaglVarZzb, false, false);
            }
        }
        s sVar = this.f11867t.f12908a;
        sVar.getClass();
        i iVar2 = this.f11849a;
        iVar2.b();
        SharedPreferences sharedPreferences2 = iVar2.f7663a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        String string3 = sharedPreferences2.getString("firebaseAppName", "");
        iVar2.b();
        if (iVar2.f7664b.equals(string3)) {
            if (!sharedPreferences2.contains("verifyAssertionRequest")) {
                if (!sharedPreferences2.contains("recaptchaToken")) {
                    if (sharedPreferences2.contains("statusCode")) {
                        Status status = new Status(sharedPreferences2.getInt("statusCode", 17062), sharedPreferences2.getString("statusMessage", ""), null, null);
                        sVar.f12972b = sharedPreferences2.getLong("timestamp", 0L);
                        s.d(sharedPreferences2);
                        Tasks.forException(zzadg.zza(status));
                        return;
                    }
                    return;
                }
                String string4 = sharedPreferences2.getString("recaptchaToken", "");
                String string5 = sharedPreferences2.getString("operation", "");
                sVar.f12972b = sharedPreferences2.getLong("timestamp", 0L);
                string5.getClass();
                if (string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    sVar.f12971a = Tasks.forResult(string4);
                } else {
                    sVar.f12971a = null;
                }
                s.d(sharedPreferences2);
                return;
            }
            String string6 = sharedPreferences2.getString("verifyAssertionRequest", "");
            zzahr zzahrVar = (zzahr) p003a.a.Q(string6 == null ? null : Base64.decode(string6, 10), zzahr.CREATOR);
            String string7 = sharedPreferences2.getString("operation", "");
            String string8 = sharedPreferences2.getString("tenantId", null);
            String string9 = sharedPreferences2.getString("firebaseUserUid", "");
            sVar.f12972b = sharedPreferences2.getLong("timestamp", 0L);
            if (string8 != null) {
                e(string8);
                zzahrVar.zzb(string8);
            }
            string7.getClass();
            switch (string7.hashCode()) {
                case -98509410:
                    if (!string7.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                        c3 = -1;
                    }
                    break;
                case 175006864:
                    c3 = !string7.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK") ? -1 : 1;
                    break;
                case 1450464913:
                    c3 = !string7.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") ? -1 : 2;
                    break;
                default:
                    c3 = -1;
                    break;
            }
            switch (c3) {
                case 0:
                    if (((zzad) this.f11854f).f11909b.f11939a.equals(string9)) {
                        o(this.f11854f, zze.n(zzahrVar));
                    }
                    break;
                case 1:
                    if (((zzad) this.f11854f).f11909b.f11939a.equals(string9)) {
                        g(this.f11854f, zze.n(zzahrVar));
                    }
                    break;
                case 2:
                    f(zze.n(zzahrVar));
                    break;
            }
            s.d(sharedPreferences2);
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        i iVarE = i.e();
        iVarE.b();
        return (FirebaseAuth) iVarE.f7666d.a(FirebaseAuth.class);
    }

    public static void i(j jVar, l lVar, String str) {
        L.n("Invoking verification failure callback for phone number/uid - ", str, "FirebaseAuth");
        m mVarZza = zzaer.zza(str, lVar.f12691c, null);
        y0 y0Var = new y0();
        y0Var.f1891b = mVarZza;
        y0Var.f1892c = jVar;
        lVar.f12692d.execute(y0Var);
    }

    public static void j(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((zzad) firebaseUser).f11909b.f11939a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f11847A.execute(new b1(firebaseAuth, 6));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    public static void k(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzagl zzaglVar, boolean z4, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        D.i(firebaseUser);
        D.i(zzaglVar);
        FirebaseUser firebaseUser2 = firebaseAuth.f11854f;
        boolean z12 = firebaseUser2 != null && ((zzad) firebaseUser).f11909b.f11939a.equals(((zzad) firebaseUser2).f11909b.f11939a);
        if (z12 || !z7) {
            FirebaseUser firebaseUser3 = firebaseAuth.f11854f;
            if (firebaseUser3 == null) {
                z9 = true;
                z8 = true;
            } else {
                z8 = (z12 && ((zzad) firebaseUser3).f11908a.zzc().equals(zzaglVar.zzc())) ? false : true;
                z9 = !z12;
            }
            FirebaseUser firebaseUser4 = firebaseAuth.f11854f;
            String string = null;
            if (firebaseUser4 != null) {
                zzad zzadVar = (zzad) firebaseUser;
                if (zzadVar.f11909b.f11939a.equals(firebaseUser4 == null ? null : ((zzad) firebaseUser4).f11909b.f11939a)) {
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
                    List arrayList3 = zzadVar.f11907D;
                    firebaseAuth.f11854f.o(arrayList2);
                    zzad zzadVar2 = (zzad) firebaseAuth.f11854f;
                    if (arrayList3 == null) {
                        zzadVar2.getClass();
                        arrayList3 = new ArrayList();
                    }
                    zzadVar2.f11907D = arrayList3;
                } else {
                    firebaseAuth.f11854f = firebaseUser;
                }
            } else {
                firebaseAuth.f11854f = firebaseUser;
            }
            if (z4) {
                k kVar = firebaseAuth.f11866s;
                FirebaseUser firebaseUser5 = firebaseAuth.f11854f;
                kVar.getClass();
                D.i(firebaseUser5);
                a aVar = (a) kVar.f12448c;
                JSONObject jSONObject = new JSONObject();
                if (zzad.class.isAssignableFrom(firebaseUser5.getClass())) {
                    zzad zzadVar3 = (zzad) firebaseUser5;
                    try {
                        jSONObject.put("cachedTokenState", zzadVar3.f11908a.zzf());
                        i iVarF = i.f(zzadVar3.f11910c);
                        iVarF.b();
                        jSONObject.put("applicationName", iVarF.f7664b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (zzadVar3.f11912e != null) {
                            JSONArray jSONArray = new JSONArray();
                            ArrayList arrayList4 = zzadVar3.f11912e;
                            int size = arrayList4.size();
                            if (arrayList4.size() > 30) {
                                aVar.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList4.size()));
                                size = 30;
                            }
                            boolean z13 = false;
                            for (int i7 = 0; i7 < size; i7++) {
                                zzz zzzVar = (zzz) arrayList4.get(i7);
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
                                for (int i8 = size - 1; i8 < arrayList4.size() && i8 >= 0; i8++) {
                                    zzz zzzVar2 = (zzz) arrayList4.get(i8);
                                    if (zzzVar2.f11940b.equals("firebase")) {
                                        jSONArray.put(zzzVar2.k());
                                        z13 = true;
                                        break;
                                    } else {
                                        if (i8 == arrayList4.size() - 1) {
                                            jSONArray.put(zzzVar2.k());
                                        }
                                    }
                                }
                                z11 = true;
                                if (!z13) {
                                    aVar.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList4.size()), Integer.valueOf(size));
                                    if (arrayList4.size() < 5) {
                                        StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                        Iterator it3 = arrayList4.iterator();
                                        while (it3.hasNext()) {
                                            sb.append("Provider - " + ((zzz) it3.next()).f11940b + "\n");
                                        }
                                        aVar.f(sb.toString(), new Object[0]);
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
                        List list = zzadVar3.f11907D;
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                zzan zzanVar = (zzan) list.get(i10);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("credentialId", zzanVar.f11948a);
                                jSONObject3.put("name", zzanVar.f11949b);
                                jSONObject3.put("displayName", zzanVar.f11950c);
                                jSONArray3.put(jSONObject3);
                            }
                            jSONObject.put("passkeyInfo", jSONArray3);
                        }
                        string = jSONObject.toString();
                        z10 = false;
                    } catch (Exception e7) {
                        Log.wtf(aVar.f13986a, aVar.d("Failed to turn object into JSON", new Object[0]), e7);
                        throw new zzzh(e7);
                    }
                } else {
                    z10 = false;
                    z11 = true;
                }
                if (!TextUtils.isEmpty(string)) {
                    ((SharedPreferences) kVar.f12447b).edit().putString("com.google.firebase.auth.FIREBASE_USER", string).apply();
                }
            } else {
                z10 = false;
                z11 = true;
            }
            if (z8) {
                FirebaseUser firebaseUser6 = firebaseAuth.f11854f;
                if (firebaseUser6 != null) {
                    ((zzad) firebaseUser6).f11908a = zzaglVar;
                }
                n(firebaseAuth, firebaseUser6);
            }
            if (z9) {
                j(firebaseAuth, firebaseAuth.f11854f);
            }
            if (z4) {
                k kVar2 = firebaseAuth.f11866s;
                kVar2.getClass();
                ((SharedPreferences) kVar2.f12447b).edit().putString(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).f11909b.f11939a), zzaglVar.zzf()).apply();
            }
            FirebaseUser firebaseUser7 = firebaseAuth.f11854f;
            if (firebaseUser7 != null) {
                if (firebaseAuth.f11871x == null) {
                    i iVar = firebaseAuth.f11849a;
                    D.i(iVar);
                    firebaseAuth.f11871x = new u(iVar);
                }
                u uVar = firebaseAuth.f11871x;
                zzagl zzaglVar2 = ((zzad) firebaseUser7).f11908a;
                uVar.getClass();
                if (zzaglVar2 == null) {
                    return;
                }
                long jZza = zzaglVar2.zza();
                if (jZza <= 0) {
                    jZza = 3600;
                }
                long jZzb = (jZza * 1000) + zzaglVar2.zzb();
                C0899h c0899h = uVar.f12974b;
                c0899h.f12944a = jZzb;
                c0899h.f12945b = -1L;
                if (uVar.f12973a > 0 && !uVar.f12975c) {
                    z10 = z11;
                }
                if (z10) {
                    uVar.f12974b.a();
                }
            }
        }
    }

    public static void l(l lVar) {
        String str;
        String str2;
        MultiFactorSession multiFactorSession = lVar.f12696h;
        Executor executor = lVar.f12692d;
        Activity activity = lVar.f12694f;
        V v6 = lVar.f12691c;
        PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken = lVar.f12695g;
        FirebaseAuth firebaseAuth = lVar.f12689a;
        if (multiFactorSession == null) {
            String str3 = lVar.f12693e;
            D.e(str3);
            if (phoneAuthProvider$ForceResendingToken == null && zzaer.zza(str3, v6, activity, executor)) {
                return;
            }
            firebaseAuth.f11868u.a(firebaseAuth, str3, lVar.f12694f, firebaseAuth.q(), lVar.j, lVar.f12698k, firebaseAuth.f11863p).addOnCompleteListener(new r(firebaseAuth, lVar, str3, 1));
            return;
        }
        zzao zzaoVar = (zzao) multiFactorSession;
        if (zzaoVar.f11925a != null) {
            String str4 = lVar.f12693e;
            D.e(str4);
            str = str4;
            str2 = str;
        } else {
            PhoneMultiFactorInfo phoneMultiFactorInfo = lVar.f12697i;
            D.i(phoneMultiFactorInfo);
            String str5 = phoneMultiFactorInfo.f11882a;
            D.e(str5);
            str = phoneMultiFactorInfo.f11885d;
            str2 = str5;
        }
        if (phoneAuthProvider$ForceResendingToken == null || !zzaer.zza(str2, v6, activity, executor)) {
            firebaseAuth.f11868u.a(firebaseAuth, str, lVar.f12694f, firebaseAuth.q(), lVar.j, lVar.f12698k, zzaoVar.f11925a != null ? firebaseAuth.f11864q : firebaseAuth.f11865r).addOnCompleteListener(new r(firebaseAuth, lVar, str2, 0));
        }
    }

    public static void n(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((zzad) firebaseUser).f11909b.f11939a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZzc = firebaseUser != null ? ((zzad) firebaseUser).f11908a.zzc() : null;
        O4.b bVar = new O4.b();
        bVar.f5008a = strZzc;
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
        return new v(this, str, actionCodeSettings, 1).i0(this, this.f11858k, this.f11860m);
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
        p034e4.a aVar;
        AuthCredential authCredentialM = authCredential.m();
        if (!(authCredentialM instanceof EmailAuthCredential)) {
            boolean z4 = authCredentialM instanceof PhoneAuthCredential;
            i iVar = this.f11849a;
            zzabj zzabjVar = this.f11853e;
            return z4 ? zzabjVar.zza(iVar, (PhoneAuthCredential) authCredentialM, this.f11858k, (E) new p034e4.b(this)) : zzabjVar.zza(iVar, authCredentialM, this.f11858k, new p034e4.b(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialM;
        String str = emailAuthCredential.f11843c;
        if (TextUtils.isEmpty(str)) {
            String str2 = emailAuthCredential.f11842b;
            D.i(str2);
            String str3 = this.f11858k;
            return new x(this, emailAuthCredential.f11841a, false, null, str2, str3).i0(this, str3, this.f11861n);
        }
        D.e(str);
        zzap zzapVar = p034e4.a.f12675d;
        D.e(str);
        try {
            aVar = new p034e4.a(str);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        return aVar != null && !TextUtils.equals(this.f11858k, aVar.f12678c) ? Tasks.forException(zzadg.zza(new Status(17072, null, null, null))) : new q(this, false, null, emailAuthCredential).i0(this, this.f11858k, this.f11860m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task g(FirebaseUser firebaseUser, AuthCredential authCredential) {
        D.i(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new p034e4.u(this, firebaseUser, (EmailAuthCredential) authCredential.m(), 1).i0(this, firebaseUser.j(), this.f11862o);
        }
        AuthCredential authCredentialM = authCredential.m();
        ?? cVar = new c(this, 0);
        return this.f11853e.zza(this.f11849a, firebaseUser, authCredentialM, (String) null, (z) cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task h(FirebaseUser firebaseUser, boolean z4) {
        if (firebaseUser == null) {
            return Tasks.forException(zzadg.zza(new Status(17495, null, null, null)));
        }
        zzagl zzaglVar = ((zzad) firebaseUser).f11908a;
        if (zzaglVar.zzg() && !z4) {
            return Tasks.forResult(p.a(zzaglVar.zzc()));
        }
        return this.f11853e.zza(this.f11849a, firebaseUser, zzaglVar.zzd(), (z) new c(this, 1));
    }

    public final synchronized o m() {
        return this.f11859l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task o(FirebaseUser firebaseUser, AuthCredential authCredential) {
        p034e4.a aVar;
        int i7 = 0;
        D.i(firebaseUser);
        AuthCredential authCredentialM = authCredential.m();
        if (!(authCredentialM instanceof EmailAuthCredential)) {
            if (!(authCredentialM instanceof PhoneAuthCredential)) {
                return this.f11853e.zzc(this.f11849a, firebaseUser, authCredentialM, firebaseUser.j(), new c(this, i7));
            }
            return this.f11853e.zzb(this.f11849a, firebaseUser, (PhoneAuthCredential) authCredentialM, this.f11858k, (z) new c(this, i7));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialM;
        if (URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD.equals(emailAuthCredential.k())) {
            String str = emailAuthCredential.f11842b;
            D.e(str);
            String strJ = firebaseUser.j();
            return new x(this, emailAuthCredential.f11841a, true, firebaseUser, str, strJ).i0(this, strJ, this.f11861n);
        }
        String str2 = emailAuthCredential.f11843c;
        D.e(str2);
        zzap zzapVar = p034e4.a.f12675d;
        D.e(str2);
        try {
            aVar = new p034e4.a(str2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        return (aVar == null || TextUtils.equals(this.f11858k, aVar.f12678c)) ? new q(this, true, firebaseUser, emailAuthCredential).i0(this, this.f11858k, this.f11860m) : Tasks.forException(zzadg.zza(new Status(17072, null, null, null)));
    }

    public final void p() {
        k kVar = this.f11866s;
        D.i(kVar);
        FirebaseUser firebaseUser = this.f11854f;
        if (firebaseUser != null) {
            ((SharedPreferences) kVar.f12447b).edit().remove(L.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).f11909b.f11939a)).apply();
            this.f11854f = null;
        }
        ((SharedPreferences) kVar.f12447b).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
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
