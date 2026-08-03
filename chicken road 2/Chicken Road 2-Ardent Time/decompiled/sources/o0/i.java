package o0;

/* loaded from: classes.dex */
public final class i implements D0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8147a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f8148b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f8149c;

    public /* synthetic */ i(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f8147a = i2;
        this.f8149c = obj;
        this.f8148b = obj2;
    }

    public void a(java.lang.Object obj, java.lang.String str) {
        ((java.util.ArrayList) this.f8148b).add(str + "=" + java.lang.String.valueOf(obj));
    }

    public void b(v.e eVar) {
        int i2 = eVar.f8370b;
        android.os.Handler handler = (android.os.Handler) this.f8149c;
        Z0.h hVar = (Z0.h) this.f8148b;
        if (i2 == 0) {
            handler.post(new D0.f(hVar, eVar.f8369a, 8, false));
        } else {
            handler.post(new C.b(hVar, i2));
        }
    }

    public void c(boolean z2, com.google.android.gms.common.api.Status status) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (((java.util.Map) this.f8148b)) {
            hashMap = new java.util.HashMap((java.util.Map) this.f8148b);
        }
        synchronized (((java.util.Map) this.f8149c)) {
            hashMap2 = new java.util.HashMap((java.util.Map) this.f8149c);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((D0.d) entry2.getKey()).a(new n0.d(status));
            }
        }
    }

    @Override // D0.a
    public void onComplete(com.google.android.gms.tasks.Task task) {
        ((java.util.Map) ((o0.i) this.f8149c).f8149c).remove((D0.d) this.f8148b);
    }

    public java.lang.String toString() {
        switch (this.f8147a) {
            case 3:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
                sb.append(this.f8149c.getClass().getSimpleName());
                sb.append('{');
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f8148b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((java.lang.String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i(android.content.Context context) {
        x0.e eVar;
        this.f8147a = 6;
        this.f8148b = new x0.g(context, m0.g.f8055b);
        synchronized (x0.e.class) {
            try {
                if (x0.e.f8405d == null) {
                    x0.e.f8405d = new x0.e(context.getApplicationContext());
                }
                eVar = x0.e.f8405d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f8149c = eVar;
    }

    public i(int i2) {
        this.f8147a = i2;
        switch (i2) {
            case 4:
                m0.f fVar = m0.f.f8053d;
                this.f8148b = new android.util.SparseIntArray();
                this.f8149c = fVar;
                break;
            default:
                this.f8148b = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                this.f8149c = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                break;
        }
    }

    public /* synthetic */ i(java.lang.Object obj) {
        this.f8147a = 3;
        this.f8149c = obj;
        this.f8148b = new java.util.ArrayList();
    }

    public i(Z0.h hVar, android.os.Handler handler) {
        this.f8147a = 5;
        this.f8148b = hVar;
        this.f8149c = handler;
    }

    public i(java.util.regex.Matcher matcher, java.lang.String str) {
        this.f8147a = 7;
        this.f8148b = matcher;
    }
}
