package e5;

import A5.h;
import A5.i;
import A5.j;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import A5.v;
import Q3.o;
import android.content.Intent;
import android.util.Log;
import java.util.HashSet;
import q5.AbstractActivityC1559c;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1051a implements InterfaceC1783c, q, i, InterfaceC1789a, v {

    /* renamed from: a, reason: collision with root package name */
    public s f12727a;

    /* renamed from: b, reason: collision with root package name */
    public j f12728b;

    /* renamed from: c, reason: collision with root package name */
    public h f12729c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1790b f12730d;

    /* renamed from: e, reason: collision with root package name */
    public String f12731e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12732f = false;

    /* renamed from: x, reason: collision with root package name */
    public String f12733x;

    @Override // A5.v
    public final boolean a(Intent intent) {
        return d(intent);
    }

    @Override // A5.i
    public final void b() {
        this.f12729c = null;
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        String str;
        this.f12729c = hVar;
        if (this.f12732f || (str = this.f12731e) == null) {
            return;
        }
        this.f12732f = true;
        hVar.c(str);
    }

    public final boolean d(Intent intent) {
        String str;
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & 1048576) == 1048576) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) {
            str = null;
        } else {
            str = intent.getDataString();
            if (str != null) {
                Log.d("com.llfbandit.app_links", "Handled intent: action: " + action + " / data: " + str);
            }
        }
        if (str == null) {
            return false;
        }
        if (this.f12731e == null) {
            this.f12731e = str;
        }
        this.f12733x = str;
        h hVar = this.f12729c;
        if (hVar != null) {
            this.f12732f = true;
            hVar.c(str);
        }
        return true;
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        this.f12730d = interfaceC1790b;
        o oVar = (o) interfaceC1790b;
        ((HashSet) oVar.f5825d).add(this);
        d(((AbstractActivityC1559c) oVar.f5822a).getIntent());
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        s sVar = new s(c1782b.f18077c, "com.llfbandit.app_links/messages");
        this.f12727a = sVar;
        sVar.b(this);
        j jVar = new j(c1782b.f18077c, "com.llfbandit.app_links/events");
        this.f12728b = jVar;
        jVar.a(this);
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        InterfaceC1790b interfaceC1790b = this.f12730d;
        if (interfaceC1790b != null) {
            ((HashSet) ((o) interfaceC1790b).f5825d).remove(this);
        }
        this.f12730d = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f12727a.b(null);
        this.f12728b.a(null);
    }

    @Override // A5.q
    public final void onMethodCall(A5.o oVar, r rVar) {
        if (oVar.f676a.equals("getLatestLink")) {
            ((p) rVar).success(this.f12733x);
        } else if (!oVar.f676a.equals("getInitialLink")) {
            ((p) rVar).notImplemented();
        } else {
            ((p) rVar).success(this.f12731e);
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        this.f12730d = interfaceC1790b;
        ((HashSet) ((o) interfaceC1790b).f5825d).add(this);
    }
}
