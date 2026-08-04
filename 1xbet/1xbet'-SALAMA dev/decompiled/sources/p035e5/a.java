package p035e5;

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
import p159w5.c;
import p164x5.b;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c, q, i, p164x5.a, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f12733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f12735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f12736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12738f = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12739x;

    @Override // A5.v
    public final boolean a(Intent intent) {
        return d(intent);
    }

    @Override // A5.i
    public final void b() {
        this.f12735c = null;
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        String str;
        this.f12735c = hVar;
        if (this.f12738f || (str = this.f12737e) == null) {
            return;
        }
        this.f12738f = true;
        hVar.c(str);
    }

    public final boolean d(Intent intent) {
        String dataString;
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & 1048576) == 1048576) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) {
            dataString = null;
        } else {
            dataString = intent.getDataString();
            if (dataString != null) {
                Log.d("com.llfbandit.app_links", "Handled intent: action: " + action + " / data: " + dataString);
            }
        }
        if (dataString == null) {
            return false;
        }
        if (this.f12737e == null) {
            this.f12737e = dataString;
        }
        this.f12739x = dataString;
        h hVar = this.f12735c;
        if (hVar != null) {
            this.f12738f = true;
            hVar.c(dataString);
        }
        return true;
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(b bVar) {
        this.f12736d = bVar;
        o oVar = (o) bVar;
        ((HashSet) oVar.f5825d).add(this);
        d(((p121q5.c) oVar.f5822a).getIntent());
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        s sVar = new s(bVar.f18083c, "com.llfbandit.app_links/messages");
        this.f12733a = sVar;
        sVar.b(this);
        j jVar = new j(bVar.f18083c, "com.llfbandit.app_links/events");
        this.f12734b = jVar;
        jVar.a(this);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        b bVar = this.f12736d;
        if (bVar != null) {
            ((HashSet) ((o) bVar).f5825d).remove(this);
        }
        this.f12736d = null;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f12733a.b(null);
        this.f12734b.a(null);
    }

    @Override // A5.q
    public final void onMethodCall(A5.o oVar, r rVar) {
        if (oVar.f676a.equals("getLatestLink")) {
            ((p) rVar).success(this.f12739x);
        } else if (!oVar.f676a.equals("getInitialLink")) {
            ((p) rVar).notImplemented();
        } else {
            ((p) rVar).success(this.f12737e);
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        this.f12736d = bVar;
        ((HashSet) ((o) bVar).f5825d).add(this);
    }
}
