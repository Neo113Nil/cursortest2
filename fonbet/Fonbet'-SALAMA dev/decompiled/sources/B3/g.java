package B3;

import a.AbstractC0603a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0634e;
import androidx.appcompat.widget.C0644j;
import androidx.lifecycle.C;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import com.google.firebase.storage.m;
import e3.C1018c;
import f4.o;
import i.C1218E;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m.w;
import n1.C1450e;
import org.json.JSONObject;
import p0.C1532a;
import q5.u;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class g implements w, C {

    /* renamed from: d, reason: collision with root package name */
    public static g f1061d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1062a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1063b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1064c;

    public /* synthetic */ g(int i7) {
        this.f1062a = i7;
    }

    public static String f(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static g i(Object obj) {
        return new g(obj, false);
    }

    public static g j(Serializable serializable) {
        return new g((Object) serializable, true);
    }

    public static zze k(Intent intent) {
        D.i(intent);
        Parcelable.Creator<zzahr> creator = zzahr.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        return zze.n(((zzahr) (byteArrayExtra == null ? null : AbstractC0603a.Q(byteArrayExtra, creator))).zzc(true));
    }

    public static void m(Context context) {
        g gVar = f1061d;
        gVar.f1063b = false;
        if (((BroadcastReceiver) gVar.f1064c) != null) {
            p0.b a2 = p0.b.a(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) f1061d.f1064c;
            synchronized (a2.f15669b) {
                try {
                    ArrayList arrayList = (ArrayList) a2.f15669b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C1532a c1532a = (C1532a) arrayList.get(size);
                            c1532a.f15665d = true;
                            for (int i7 = 0; i7 < c1532a.f15662a.countActions(); i7++) {
                                String action = c1532a.f15662a.getAction(i7);
                                ArrayList arrayList2 = (ArrayList) a2.f15670c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        C1532a c1532a2 = (C1532a) arrayList2.get(size2);
                                        if (c1532a2.f15663b == broadcastReceiver) {
                                            c1532a2.f15665d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        a2.f15670c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        f1061d.f1064c = null;
    }

    @Override // m.w
    public void a(m.k kVar, boolean z4) {
        C0644j c0644j;
        if (this.f1063b) {
            return;
        }
        this.f1063b = true;
        C1218E c1218e = (C1218E) this.f1064c;
        ActionMenuView actionMenuView = c1218e.f13609a.f8662a.f8532a;
        if (actionMenuView != null && (c0644j = actionMenuView.f8239K) != null) {
            c0644j.h();
            C0634e c0634e = c0644j.f8647K;
            if (c0634e != null && c0634e.b()) {
                c0634e.f15199i.dismiss();
            }
        }
        c1218e.f13610b.onPanelClosed(108, kVar);
        this.f1063b = false;
    }

    @Override // androidx.lifecycle.C
    public void b(Object obj) {
        C1450e c1450e = (C1450e) this.f1064c;
        c1450e.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c1450e.f15308b;
        signInHubActivity.setResult(signInHubActivity.f11057d, signInHubActivity.f11058e);
        signInHubActivity.finish();
        this.f1063b = true;
    }

    public void c(int i7) {
        AbstractC1664a.h(!this.f1063b);
        ((SparseBooleanArray) this.f1064c).append(i7, true);
    }

    public com.google.firebase.storage.j d() {
        com.google.firebase.storage.j jVar = new com.google.firebase.storage.j();
        jVar.f12029a = null;
        jVar.f12030b = null;
        jVar.f12031c = null;
        jVar.f12032d = i("");
        jVar.f12033e = null;
        jVar.f12034f = null;
        jVar.f12035g = null;
        jVar.f12037i = null;
        jVar.j = i("");
        jVar.f12038k = i("");
        jVar.f12039l = i("");
        jVar.f12040m = i("");
        jVar.f12041n = i(Collections.emptyMap());
        com.google.firebase.storage.j jVar2 = (com.google.firebase.storage.j) this.f1064c;
        D.i(jVar2);
        jVar.f12029a = jVar2.f12029a;
        jVar.f12030b = jVar2.f12030b;
        jVar.f12032d = jVar2.f12032d;
        jVar.j = jVar2.j;
        jVar.f12038k = jVar2.f12038k;
        jVar.f12039l = jVar2.f12039l;
        jVar.f12040m = jVar2.f12040m;
        jVar.f12041n = jVar2.f12041n;
        if (this.f1063b) {
            jVar.f12037i = jVar2.f12037i;
            jVar.f12036h = jVar2.f12036h;
            jVar.f12035g = jVar2.f12035g;
            jVar.f12034f = jVar2.f12034f;
            jVar.f12033e = jVar2.f12033e;
            jVar.f12031c = jVar2.f12031c;
        }
        return jVar;
    }

    public v2.d e() {
        AbstractC1664a.h(!this.f1063b);
        this.f1063b = true;
        return new v2.d((SparseBooleanArray) this.f1064c);
    }

    public void g(boolean z4) {
        if (this.f1063b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1063b = true;
        C0844v c0844v = (C0844v) this.f1064c;
        int i7 = c0844v.f11194a - 1;
        c0844v.f11194a = i7;
        boolean z7 = z4 | c0844v.f11195b;
        c0844v.f11195b = z7;
        if (i7 != 0 || z7) {
            return;
        }
        ((u) c0844v.f11197d).a((KeyEvent) c0844v.f11196c);
    }

    public void h(String str, String str2) {
        com.google.firebase.storage.j jVar = (com.google.firebase.storage.j) this.f1064c;
        if (!jVar.f12041n.f1063b) {
            jVar.f12041n = j(new HashMap());
        }
        ((Map) jVar.f12041n.f1064c).put(str, str2);
    }

    public void l(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f1064c = broadcastReceiver;
        p0.b a2 = p0.b.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (a2.f15669b) {
            try {
                C1532a c1532a = new C1532a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) a2.f15669b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    a2.f15669b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c1532a);
                for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                    String action = intentFilter.getAction(i7);
                    ArrayList arrayList2 = (ArrayList) a2.f15670c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        a2.f15670c.put(action, arrayList2);
                    }
                    arrayList2.add(c1532a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m.w
    public boolean n(m.k kVar) {
        ((C1218E) this.f1064c).f13610b.onMenuOpened(108, kVar);
        return true;
    }

    public boolean o(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.f1063b) {
            return false;
        }
        l(activity, new o(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.f1063b = true;
        return true;
    }

    public String toString() {
        switch (this.f1062a) {
            case 8:
                return ((C1450e) this.f1064c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g(boolean z4, Comparable comparable, int i7) {
        this.f1062a = i7;
        this.f1063b = z4;
        this.f1064c = comparable;
    }

    public g() {
        this.f1062a = 10;
        this.f1064c = new SparseBooleanArray();
    }

    public g(Object obj, boolean z4) {
        this.f1062a = 3;
        this.f1063b = z4;
        this.f1064c = obj;
    }

    public g(C0844v c0844v) {
        this.f1062a = 9;
        this.f1064c = c0844v;
        this.f1063b = false;
    }

    public g(C1018c c1018c, C1450e c1450e) {
        this.f1062a = 8;
        this.f1063b = false;
        this.f1064c = c1450e;
    }

    public g(JSONObject jSONObject, m mVar) {
        this.f1062a = 2;
        com.google.firebase.storage.j jVar = new com.google.firebase.storage.j();
        this.f1064c = jVar;
        jVar.f12031c = jSONObject.optString("generation");
        jVar.f12029a = jSONObject.optString("name");
        jVar.f12030b = jSONObject.optString("bucket");
        jVar.f12033e = jSONObject.optString("metageneration");
        jVar.f12034f = jSONObject.optString("timeCreated");
        jVar.f12035g = jSONObject.optString("updated");
        jVar.f12036h = jSONObject.optLong(RRWebVideoEvent.JsonKeys.SIZE);
        jVar.f12037i = jSONObject.optString("md5Hash");
        if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                h(next, jSONObject2.getString(next));
            }
        }
        String f7 = f(jSONObject, "contentType");
        if (f7 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12032d = j(f7);
        }
        String f8 = f(jSONObject, "cacheControl");
        if (f8 != null) {
            ((com.google.firebase.storage.j) this.f1064c).j = j(f8);
        }
        String f9 = f(jSONObject, "contentDisposition");
        if (f9 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12038k = j(f9);
        }
        String f10 = f(jSONObject, "contentEncoding");
        if (f10 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12039l = j(f10);
        }
        String f11 = f(jSONObject, "contentLanguage");
        if (f11 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12040m = j(f11);
        }
        this.f1063b = true;
        ((com.google.firebase.storage.j) this.f1064c).getClass();
    }

    public g(C1218E c1218e) {
        this.f1062a = 6;
        this.f1064c = c1218e;
    }
}
