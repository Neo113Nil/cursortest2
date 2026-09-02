package C0;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class t implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f116a;

    /* renamed from: b, reason: collision with root package name */
    public Object f117b;

    /* renamed from: c, reason: collision with root package name */
    public Object f118c;

    /* renamed from: d, reason: collision with root package name */
    public Object f119d;

    public /* synthetic */ t(D0.f fVar, String str, Object obj, N.i iVar) {
        this.f117b = fVar;
        this.f116a = str;
        this.f118c = obj;
        this.f119d = iVar;
    }

    public SpannableString a() {
        if (((String) this.f116a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f116a);
        ArrayList arrayList = (ArrayList) this.f118c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.l lVar = (io.flutter.view.l) it.next();
                int c2 = AbstractC0819i.c(lVar.f6025c);
                if (c2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f6023a, lVar.f6024b, 0);
                } else if (c2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f6022d)), lVar.f6023a, lVar.f6024b, 0);
                }
            }
        }
        String str = (String) this.f119d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f119d), 0, ((String) this.f116a).length(), 0);
        }
        String str2 = (String) this.f117b;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f117b)), 0, ((String) this.f116a).length(), 0);
        }
        return spannableString;
    }

    @Override // h0.c
    public void b(String str, HashMap hashMap) {
        this.f116a = "sqlite_error";
        this.f117b = str;
        this.f119d = hashMap;
    }

    @Override // h0.c
    public void c(Serializable serializable) {
        this.f118c = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(i1.u uVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f119d;
        synchronized (this) {
            if (!arrayDeque.remove(uVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f117b).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f118c).size() >= 64) {
                        break;
                    }
                    Iterator it2 = ((ArrayDeque) this.f118c).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    it.remove();
                    arrayList.add(null);
                    ((ArrayDeque) this.f118c).add(null);
                }
                synchronized (this) {
                    try {
                        ((ArrayDeque) this.f118c).size();
                        ((ArrayDeque) this.f119d).size();
                    } finally {
                    }
                }
                if (arrayList.size() <= 0) {
                    if (arrayList.get(0) != null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        if (((ThreadPoolExecutor) this.f116a) == null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            SynchronousQueue synchronousQueue = new SynchronousQueue();
                            byte[] bArr = j1.d.f6053a;
                            this.f116a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.c("OkHttp Dispatcher", false));
                        }
                    }
                    throw null;
                }
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.size() <= 0) {
        }
    }

    public File e(Context context) {
        ((N.i) this.f117b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public void f(String str, Object obj, p pVar) {
        ((D0.f) this.f117b).g((String) this.f116a, ((D0.k) this.f118c).a(new Y.e(str, obj, 9, false)), pVar == null ? null : new D0.a(1, this, pVar));
    }

    public void g(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((n) this.f119d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void h(Serializable serializable, D0.c cVar) {
        ((D0.f) this.f117b).g((String) this.f116a, ((D0.i) this.f118c).encodeMessage(serializable), cVar == null ? null : new D0.a(0, this, cVar));
    }

    public void i(D0.b bVar) {
        String str = (String) this.f116a;
        D0.f fVar = (D0.f) this.f117b;
        N.i iVar = (N.i) this.f119d;
        if (iVar != null) {
            fVar.f(str, bVar != null ? new Y.e(8, this, bVar) : null, iVar);
        } else {
            fVar.b(str, bVar != null ? new Y.e(8, this, bVar) : null);
        }
    }

    public void j(D0.j jVar) {
        String str = (String) this.f116a;
        D0.f fVar = (D0.f) this.f117b;
        N.i iVar = (N.i) this.f119d;
        if (iVar != null) {
            fVar.f(str, jVar != null ? new Y.e(10, this, jVar) : null, iVar);
        } else {
            fVar.b(str, jVar != null ? new Y.e(10, this, jVar) : null);
        }
    }

    public t(int i2) {
        switch (i2) {
            case 5:
                this.f117b = new ArrayDeque();
                this.f118c = new ArrayDeque();
                this.f119d = new ArrayDeque();
                break;
            default:
                N.i iVar = new N.i(5);
                N.i iVar2 = new N.i(4);
                this.f116a = new HashSet();
                this.f117b = iVar;
                this.f118c = iVar2;
                break;
        }
    }

    public t(D0.f fVar, String str) {
        this(fVar, str, D0.n.f167b, null);
    }
}
