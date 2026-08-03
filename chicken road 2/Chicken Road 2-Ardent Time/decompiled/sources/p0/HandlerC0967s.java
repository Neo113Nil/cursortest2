package p0;

/* renamed from: p0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0967s extends A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0967s(com.google.android.gms.common.internal.a aVar, android.os.Looper looper) {
        super(looper, 2);
        this.f8288a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(android.os.Message message) {
        java.lang.Boolean bool;
        if (this.f8288a.f2619v.get() != message.arg1) {
            int i2 = message.what;
            if (i2 == 2 || i2 == 1 || i2 == 7) {
                p0.AbstractC0963o abstractC0963o = (p0.AbstractC0963o) message.obj;
                abstractC0963o.getClass();
                abstractC0963o.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 != 1 && i3 != 7) {
            if (i3 == 4) {
                this.f8288a.getClass();
            }
        }
        if (!this.f8288a.a()) {
            p0.AbstractC0963o abstractC0963o2 = (p0.AbstractC0963o) message.obj;
            abstractC0963o2.getClass();
            abstractC0963o2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f8288a;
            aVar.f2617s = new m0.b(message.arg2);
            if (!aVar.t && !android.text.TextUtils.isEmpty(aVar.r()) && !android.text.TextUtils.isEmpty(null)) {
                try {
                    java.lang.Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f8288a;
                    if (!aVar2.t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f8288a;
            m0.b bVar = aVar3.f2617s;
            if (bVar == null) {
                bVar = new m0.b(8);
            }
            aVar3.f2607i.a(bVar);
            this.f8288a.getClass();
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f8288a;
            m0.b bVar2 = aVar4.f2617s;
            if (bVar2 == null) {
                bVar2 = new m0.b(8);
            }
            aVar4.f2607i.a(bVar2);
            this.f8288a.getClass();
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            java.lang.Object obj = message.obj;
            this.f8288a.f2607i.a(new m0.b(message.arg2, obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) obj : null));
            this.f8288a.getClass();
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.f8288a.v(5, null);
            p0.C0955g c0955g = this.f8288a.f2612n;
            if (c0955g != null) {
                ((n0.g) c0955g.f8255a).a(message.arg2);
            }
            this.f8288a.getClass();
            java.lang.System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.f8288a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.f8288a.c()) {
            p0.AbstractC0963o abstractC0963o3 = (p0.AbstractC0963o) message.obj;
            abstractC0963o3.getClass();
            abstractC0963o3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            android.util.Log.wtf("GmsClient", B1.a.f(i5, "Don't know how to handle message: "), new java.lang.Exception());
            return;
        }
        p0.AbstractC0963o abstractC0963o4 = (p0.AbstractC0963o) message.obj;
        synchronized (abstractC0963o4) {
            try {
                bool = abstractC0963o4.f8278a;
                if (abstractC0963o4.f8279b) {
                    android.util.Log.w("GmsClient", "Callback proxy " + abstractC0963o4.toString() + " being reused. This is not safe.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = abstractC0963o4.f8283f;
            int i6 = abstractC0963o4.f8281d;
            if (i6 != 0) {
                aVar5.v(1, null);
                android.os.Bundle bundle = abstractC0963o4.f8282e;
                abstractC0963o4.a(new m0.b(i6, bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC0963o4.b()) {
                aVar5.v(1, null);
                abstractC0963o4.a(new m0.b(8, null));
            }
        }
        synchronized (abstractC0963o4) {
            abstractC0963o4.f8279b = true;
        }
        abstractC0963o4.c();
    }
}
