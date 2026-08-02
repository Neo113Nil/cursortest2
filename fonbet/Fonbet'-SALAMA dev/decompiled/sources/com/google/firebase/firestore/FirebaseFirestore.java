package com.google.firebase.firestore;

import A1.RunnableC0032m0;
import B1.f;
import B4.C;
import B4.C0064h;
import B4.C0070n;
import B4.H;
import B4.I;
import B4.J;
import B4.K;
import B4.L;
import B4.T;
import B4.W;
import B4.Z;
import C4.b;
import C4.d;
import E4.t;
import H4.h;
import H4.j;
import H4.m;
import K4.k;
import K4.r;
import Q0.a;
import W5.AbstractC0486a1;
import Y3.i;
import a.AbstractC0603a;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g4.C1142o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import n1.C1450e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u1.c;
import w1.C1726n0;

/* loaded from: classes2.dex */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    public final f f11962a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11963b;

    /* renamed from: c, reason: collision with root package name */
    public final H4.f f11964c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11965d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11966e;

    /* renamed from: f, reason: collision with root package name */
    public final b f11967f;

    /* renamed from: g, reason: collision with root package name */
    public final i f11968g;

    /* renamed from: h, reason: collision with root package name */
    public final c f11969h;

    /* renamed from: i, reason: collision with root package name */
    public final L f11970i;
    public K j;

    /* renamed from: k, reason: collision with root package name */
    public final C1726n0 f11971k;

    /* renamed from: l, reason: collision with root package name */
    public final k f11972l;

    /* renamed from: m, reason: collision with root package name */
    public C1450e f11973m;

    public FirebaseFirestore(Context context, H4.f fVar, String str, d dVar, b bVar, f fVar2, i iVar, L l7, k kVar) {
        context.getClass();
        this.f11963b = context;
        this.f11964c = fVar;
        this.f11969h = new c(fVar, 1);
        str.getClass();
        this.f11965d = str;
        this.f11966e = dVar;
        this.f11967f = bVar;
        this.f11962a = fVar2;
        this.f11971k = new C1726n0(new C(this));
        this.f11968g = iVar;
        this.f11970i = l7;
        this.f11972l = kVar;
        this.j = new J().a();
    }

    public static FirebaseFirestore e(i iVar, String str) {
        FirebaseFirestore firebaseFirestore;
        AbstractC0603a.f(str, "Provided database name must not be null.");
        iVar.b();
        L l7 = (L) iVar.f7666d.a(L.class);
        AbstractC0603a.f(l7, "Firestore component is not present.");
        synchronized (l7) {
            firebaseFirestore = (FirebaseFirestore) l7.f1110a.get(str);
            if (firebaseFirestore == null) {
                firebaseFirestore = g(l7.f1112c, l7.f1111b, l7.f1113d, l7.f1114e, str, l7, l7.f1115f);
                l7.f1110a.put(str, firebaseFirestore);
            }
        }
        return firebaseFirestore;
    }

    public static FirebaseFirestore g(Context context, i iVar, C1142o c1142o, C1142o c1142o2, String str, L l7, k kVar) {
        iVar.b();
        String str2 = iVar.f7665c.f7678g;
        if (str2 == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        H4.f fVar = new H4.f(str2, str);
        d dVar = new d(c1142o);
        b bVar = new b(c1142o2);
        iVar.b();
        return new FirebaseFirestore(context, fVar, iVar.f7664b, dVar, bVar, new f(7), iVar, l7, kVar);
    }

    @Keep
    public static void setClientLanguage(String str) {
        r.j = str;
    }

    public final Task a() {
        Task task;
        boolean z4;
        C1726n0 c1726n0 = this.f11971k;
        synchronized (c1726n0) {
            t tVar = (t) c1726n0.f17806c;
            if (tVar != null) {
                L4.d dVar = tVar.f2232d.f4359a;
                synchronized (dVar) {
                    z4 = dVar.f4345b;
                }
                if (!z4) {
                    task = Tasks.forException(new I("Persistence cannot be cleared while the firestore instance is running.", H.FAILED_PRECONDITION));
                }
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            A0.f fVar = new A0.f(3, this, taskCompletionSource);
            L4.d dVar2 = ((L4.f) c1726n0.f17807d).f4359a;
            dVar2.getClass();
            try {
                dVar2.f4344a.execute(fVar);
            } catch (RejectedExecutionException unused) {
                a.v(2, L4.f.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            task = taskCompletionSource.getTask();
        }
        return task;
    }

    public final C0064h b(String str) {
        AbstractC0603a.f(str, "Provided collection path must not be null.");
        this.f11971k.k();
        m y4 = m.y(str);
        C0064h c0064h = new C0064h(new E4.C(y4, null), this);
        List list = y4.f3312a;
        if (list.size() % 2 == 1) {
            return c0064h;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + y4.c() + " has " + list.size());
    }

    public final Z c(String str) {
        AbstractC0603a.f(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid collectionId '", str, "'. Collection IDs must not contain '/'."));
        }
        this.f11971k.k();
        return new Z(new E4.C(m.f3331b, str), this);
    }

    public final C0070n d(String str) {
        AbstractC0603a.f(str, "Provided document path must not be null.");
        this.f11971k.k();
        m y4 = m.y(str);
        List list = y4.f3312a;
        if (list.size() % 2 == 0) {
            return new C0070n(new h(y4), this);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + y4.c() + " has " + list.size());
    }

    public final Task f(String str) {
        Task task;
        C1726n0 c1726n0 = this.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            t tVar = (t) c1726n0.f17806c;
            tVar.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            tVar.f2232d.a(new RunnableC0032m0(tVar, str, taskCompletionSource, 3));
            task = taskCompletionSource.getTask();
        }
        return task.continueWith(new C(this));
    }

    public final void h(K k7) {
        AbstractC0603a.f(k7, "Provided settings must not be null.");
        synchronized (this.f11964c) {
            try {
                if ((((t) this.f11971k.f17806c) != null) && !this.j.equals(k7)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.j = k7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task i(String str) {
        Task a2;
        this.f11971k.k();
        K k7 = this.j;
        T t7 = k7.f1109e;
        if (!(t7 != null ? t7 instanceof W : k7.f1107c)) {
            throw new IllegalStateException("Cannot enable indexes when persistence is disabled");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i8 = 0; optJSONArray != null && i8 < optJSONArray.length(); i8++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i8);
                        j y4 = j.y(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(new H4.d(3, y4));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(new H4.d(1, y4));
                        } else {
                            arrayList2.add(new H4.d(2, y4));
                        }
                    }
                    arrayList.add(new H4.a(-1, string, arrayList2, H4.a.f3297e));
                }
            }
            C1726n0 c1726n0 = this.f11971k;
            synchronized (c1726n0) {
                c1726n0.k();
                t tVar = (t) c1726n0.f17806c;
                tVar.e();
                a2 = tVar.f2232d.a(new A0.f(8, tVar, arrayList));
            }
            return a2;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Failed to parse index configuration", e7);
        }
    }

    public final Task j() {
        Task d7;
        L l7 = this.f11970i;
        String str = this.f11964c.f3314b;
        synchronized (l7) {
            l7.f1110a.remove(str);
        }
        C1726n0 c1726n0 = this.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            d7 = ((t) c1726n0.f17806c).d();
            ((L4.f) c1726n0.f17807d).f4359a.f4344a.setCorePoolSize(0);
        }
        return d7;
    }

    public final void k(C0070n c0070n) {
        if (c0070n.f1180b != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public final Task l() {
        Task task;
        C1726n0 c1726n0 = this.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            t tVar = (t) c1726n0.f17806c;
            tVar.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            tVar.f2232d.a(new A0.f(6, tVar, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        return task;
    }
}
