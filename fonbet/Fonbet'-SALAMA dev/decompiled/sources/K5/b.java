package K5;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import w1.L;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class b implements FlutterFirebasePlugin, InterfaceC1783c, g {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f4087c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f4088d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public A5.s f4089a;

    /* renamed from: b, reason: collision with root package name */
    public A5.f f4090b;

    public static l b(com.google.firebase.storage.h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.f12025b.iterator();
        while (it.hasNext()) {
            arrayList.add(c((com.google.firebase.storage.m) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hVar.f12024a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((com.google.firebase.storage.m) it2.next()));
        }
        l lVar = new l();
        lVar.f4115a = arrayList;
        lVar.f4116b = hVar.f12026c;
        lVar.f4117c = arrayList2;
        return lVar;
    }

    public static o c(com.google.firebase.storage.m mVar) {
        String authority = mVar.f12044a.getAuthority();
        String path = mVar.f12044a.getPath();
        String a2 = mVar.a();
        o oVar = new o();
        if (authority == null) {
            throw new IllegalStateException("Nonnull field \"bucket\" is null.");
        }
        oVar.f4127a = authority;
        if (path == null) {
            throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
        }
        oVar.f4128b = path;
        if (a2 == null) {
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        oVar.f4129c = a2;
        return oVar;
    }

    public static com.google.firebase.storage.j d(m mVar) {
        B3.g gVar = new B3.g(2);
        gVar.f1064c = new com.google.firebase.storage.j();
        String str = mVar.f4122e;
        if (str != null) {
            ((com.google.firebase.storage.j) gVar.f1064c).f12032d = B3.g.j(str);
        }
        String str2 = mVar.f4118a;
        if (str2 != null) {
            ((com.google.firebase.storage.j) gVar.f1064c).j = B3.g.j(str2);
        }
        String str3 = mVar.f4119b;
        if (str3 != null) {
            ((com.google.firebase.storage.j) gVar.f1064c).f12038k = B3.g.j(str3);
        }
        String str4 = mVar.f4120c;
        if (str4 != null) {
            ((com.google.firebase.storage.j) gVar.f1064c).f12039l = B3.g.j(str4);
        }
        String str5 = mVar.f4121d;
        if (str5 != null) {
            ((com.google.firebase.storage.j) gVar.f1064c).f12040m = B3.g.j(str5);
        }
        Map map = mVar.f4123f;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                gVar.h((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return gVar.d();
    }

    public static com.google.firebase.storage.f e(n nVar) {
        Y3.i f7 = Y3.i.f(nVar.f4124a);
        String str = "gs://" + nVar.f4126c;
        D.a("Null is not a valid value for the Firebase Storage URL.", str != null);
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return com.google.firebase.storage.f.c(f7, Q0.a.G(str));
        } catch (UnsupportedEncodingException e7) {
            Log.e("FirebaseStorage", "Unable to parse url:".concat(str), e7);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public static HashMap f(com.google.firebase.storage.j jVar) {
        if (jVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = jVar.f12029a;
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else {
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
        }
        if (str != null) {
            String str2 = jVar.f12029a;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            } else {
                int lastIndexOf2 = str2.lastIndexOf(47);
                if (lastIndexOf2 != -1) {
                    str2 = str2.substring(lastIndexOf2 + 1);
                }
            }
            hashMap.put("name", str2);
        }
        String str3 = jVar.f12030b;
        if (str3 != null) {
            hashMap.put("bucket", str3);
        }
        String str4 = jVar.f12031c;
        if (str4 != null) {
            hashMap.put("generation", str4);
        }
        String str5 = jVar.f12033e;
        if (str5 != null) {
            hashMap.put("metadataGeneration", str5);
        }
        String str6 = jVar.f12029a;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("fullPath", str6);
        hashMap.put(RRWebVideoEvent.JsonKeys.SIZE, Long.valueOf(jVar.f12036h));
        hashMap.put("creationTimeMillis", Long.valueOf(Q0.a.H(jVar.f12034f)));
        hashMap.put("updatedTimeMillis", Long.valueOf(Q0.a.H(jVar.f12035g)));
        String str7 = jVar.f12037i;
        if (str7 != null) {
            hashMap.put("md5Hash", str7);
        }
        Object obj = jVar.j.f1064c;
        if (((String) obj) != null) {
            hashMap.put("cacheControl", (String) obj);
        }
        Object obj2 = jVar.f12038k.f1064c;
        if (((String) obj2) != null) {
            hashMap.put("contentDisposition", (String) obj2);
        }
        Object obj3 = jVar.f12039l.f1064c;
        if (((String) obj3) != null) {
            hashMap.put("contentEncoding", (String) obj3);
        }
        Object obj4 = jVar.f12040m.f1064c;
        if (((String) obj4) != null) {
            hashMap.put("contentLanguage", (String) obj4);
        }
        Object obj5 = jVar.f12032d.f1064c;
        if (((String) obj5) != null) {
            hashMap.put("contentType", (String) obj5);
        }
        HashMap hashMap2 = new HashMap();
        for (String str8 : ((Map) jVar.f12041n.f1064c).keySet()) {
            if ((TextUtils.isEmpty(str8) ? null : (String) ((Map) jVar.f12041n.f1064c).get(str8)) == null) {
                hashMap2.put(str8, "");
            } else {
                String str9 = TextUtils.isEmpty(str8) ? null : (String) ((Map) jVar.f12041n.f1064c).get(str8);
                Objects.requireNonNull(str9);
                hashMap2.put(str8, str9);
            }
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(0, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void g(String str, G5.b bVar) {
        A5.j jVar = new A5.j(this.f4090b, L.i("plugins.flutter.io/firebase_storage/taskEvent/", str));
        jVar.a(bVar);
        f4087c.put(str, jVar);
        f4088d.put(str, bVar);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(Y3.i iVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new F5.d(3, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final synchronized void h() {
        try {
            Iterator it = new ArrayList(f4087c.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                HashMap hashMap = f4087c;
                A5.j jVar = (A5.j) hashMap.get(str);
                if (jVar != null) {
                    jVar.a(null);
                }
                hashMap.remove(str);
            }
            Iterator it2 = new ArrayList(f4088d.keySet()).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                HashMap hashMap2 = f4088d;
                A5.i iVar = (A5.i) hashMap2.get(str2);
                if (iVar != null) {
                    iVar.b();
                }
                hashMap2.remove(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        A5.f fVar = c1782b.f18077c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
        this.f4089a = new A5.s(fVar, "plugins.flutter.io/firebase_storage");
        g.a(fVar, this);
        this.f4090b = fVar;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        c.a();
        this.f4089a.b(null);
        g.a(this.f4090b, null);
        this.f4089a = null;
        this.f4090b = null;
        h();
    }
}
