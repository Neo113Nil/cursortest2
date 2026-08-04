package B3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0613e;
import androidx.appcompat.widget.C0623j;
import androidx.lifecycle.C;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import com.google.firebase.storage.m;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p042f4.o;
import p058i.E;
import p086m.w;
import p121q5.u;

/* JADX INFO: loaded from: classes.dex */
public final class g implements w, C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f1061d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
        return zze.n(((zzahr) (byteArrayExtra == null ? null : p003a.a.Q(byteArrayExtra, creator))).zzc(true));
    }

    public static void m(Context context) {
        g gVar = f1061d;
        gVar.f1063b = false;
        if (((BroadcastReceiver) gVar.f1064c) != null) {
            p110p0.b bVarA = p110p0.b.a(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) f1061d.f1064c;
            synchronized (bVarA.f15675b) {
                try {
                    ArrayList arrayList = (ArrayList) bVarA.f15675b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            p110p0.a aVar = (p110p0.a) arrayList.get(size);
                            aVar.f15671d = true;
                            for (int i7 = 0; i7 < aVar.f15668a.countActions(); i7++) {
                                String action = aVar.f15668a.getAction(i7);
                                ArrayList arrayList2 = (ArrayList) bVarA.f15676c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        p110p0.a aVar2 = (p110p0.a) arrayList2.get(size2);
                                        if (aVar2.f15669b == broadcastReceiver) {
                                            aVar2.f15671d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        bVarA.f15676c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f1061d.f1064c = null;
    }

    @Override // p086m.w
    public void a(p086m.k kVar, boolean z4) {
        C0623j c0623j;
        if (this.f1063b) {
            return;
        }
        this.f1063b = true;
        E e7 = (E) this.f1064c;
        ActionMenuView actionMenuView = e7.f13615a.f8662a.f8532a;
        if (actionMenuView != null && (c0623j = actionMenuView.f8239K) != null) {
            c0623j.h();
            C0613e c0613e = c0623j.f8647K;
            if (c0613e != null && c0613e.b()) {
                c0613e.f15205i.dismiss();
            }
        }
        e7.f13616b.onPanelClosed(108, kVar);
        this.f1063b = false;
    }

    @Override // androidx.lifecycle.C
    public void b(Object obj) {
        p096n1.e eVar = (p096n1.e) this.f1064c;
        eVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) eVar.f15314b;
        signInHubActivity.setResult(signInHubActivity.f11057d, signInHubActivity.f11058e);
        signInHubActivity.finish();
        this.f1063b = true;
    }

    public void c(int i7) {
        p151v2.a.h(!this.f1063b);
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

    public p151v2.d e() {
        p151v2.a.h(!this.f1063b);
        this.f1063b = true;
        return new p151v2.d((SparseBooleanArray) this.f1064c);
    }

    public void g(boolean z4) {
        if (this.f1063b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1063b = true;
        C0800v c0800v = (C0800v) this.f1064c;
        int i7 = c0800v.f11194a - 1;
        c0800v.f11194a = i7;
        boolean z7 = z4 | c0800v.f11195b;
        c0800v.f11195b = z7;
        if (i7 != 0 || z7) {
            return;
        }
        ((u) c0800v.f11197d).a((KeyEvent) c0800v.f11196c);
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
        p110p0.b bVarA = p110p0.b.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (bVarA.f15675b) {
            try {
                p110p0.a aVar = new p110p0.a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) bVarA.f15675b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    bVarA.f15675b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                    String action = intentFilter.getAction(i7);
                    ArrayList arrayList2 = (ArrayList) bVarA.f15676c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        bVarA.f15676c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p086m.w
    public boolean n(p086m.k kVar) {
        ((E) this.f1064c).f13616b.onMenuOpened(108, kVar);
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
                return ((p096n1.e) this.f1064c).toString();
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

    public g(C0800v c0800v) {
        this.f1062a = 9;
        this.f1064c = c0800v;
        this.f1063b = false;
    }

    public g(p033e3.c cVar, p096n1.e eVar) {
        this.f1062a = 8;
        this.f1063b = false;
        this.f1064c = eVar;
    }

    public g(JSONObject jSONObject, m mVar) throws JSONException {
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
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                h(next, jSONObject2.getString(next));
            }
        }
        String strF = f(jSONObject, "contentType");
        if (strF != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12032d = j(strF);
        }
        String strF2 = f(jSONObject, "cacheControl");
        if (strF2 != null) {
            ((com.google.firebase.storage.j) this.f1064c).j = j(strF2);
        }
        String strF3 = f(jSONObject, "contentDisposition");
        if (strF3 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12038k = j(strF3);
        }
        String strF4 = f(jSONObject, "contentEncoding");
        if (strF4 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12039l = j(strF4);
        }
        String strF5 = f(jSONObject, "contentLanguage");
        if (strF5 != null) {
            ((com.google.firebase.storage.j) this.f1064c).f12040m = j(strF5);
        }
        this.f1063b = true;
        ((com.google.firebase.storage.j) this.f1064c).getClass();
    }

    public g(E e7) {
        this.f1062a = 6;
        this.f1064c = e7;
    }
}
