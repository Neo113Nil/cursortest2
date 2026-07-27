package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* compiled from: LoopTimer.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f9978a;
    private boolean b;
    private LinkedList<i> c;
    private LinkedList<i> d;
    private int e;
    private int f;
    private e g;
    private com.mbridge.msdk.videocommon.setting.a h;
    private l i;
    private g j;
    private Handler k;

    /* compiled from: LoopTimer.java */
    /* renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    class HandlerC1443a extends Handler {
        HandlerC1443a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        a.this.c();
                    }
                } else {
                    if (a.this.b) {
                        return;
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f9978a);
                    sendMessageDelayed(obtainMessage(1), a.this.f9978a);
                }
            }
        }
    }

    /* compiled from: LoopTimer.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        static a f9981a = new a(null);
    }

    /* synthetic */ a(HandlerC1443a handlerC1443a) {
        this();
    }

    /* compiled from: LoopTimer.java */
    class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f9980a;

        b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f9980a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.k.sendMessage(a.this.k.obtainMessage(2));
            this.f9980a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.k.sendMessage(a.this.k.obtainMessage(2));
            this.f9980a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    private a() {
        this.b = false;
        this.c = new LinkedList<>();
        this.d = new LinkedList<>();
        this.e = 0;
        this.f = 0;
        this.k = new HandlerC1443a();
    }

    private void b() {
        if (this.j == null) {
            this.j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.i == null) {
            this.i = l.a(this.j);
        }
        List<i> a2 = this.i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (a2 != null) {
            this.d.addAll(a2);
            for (i iVar : a2) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> a3 = this.i.a(94);
        if (a3 != null) {
            this.c.addAll(a3);
            for (i iVar2 : a3) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.g == null) {
            this.g = e.a(this.j);
        }
        if (this.h == null) {
            this.h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.c;
            if (linkedList == null || linkedList.size() <= 0 || this.e >= this.c.size()) {
                LinkedList<i> linkedList2 = this.d;
                if (linkedList2 != null && linkedList2.size() > 0 && this.f < this.d.size()) {
                    i iVar = this.d.get(this.f);
                    this.f++;
                    if (a(iVar)) {
                        c(iVar.d(), iVar.g());
                    }
                }
            } else {
                i iVar2 = this.c.get(this.e);
                this.e++;
                if (a(iVar2)) {
                    a(iVar2.d(), iVar2.g(), false);
                }
            }
        } catch (Throwable th) {
            q0.b("LoopTimer", th.getMessage(), th);
        }
    }

    public static a a() {
        return c.f9981a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        LinkedList<i> linkedList = this.c;
        if (linkedList == null || linkedList.size() <= 0 || this.e == 0 || this.c.size() <= this.e) {
            LinkedList<i> linkedList2 = this.d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f == 0 || this.d.size() == this.f) {
                this.f = 0;
                this.e = 0;
                Handler handler = this.k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z = false;
        if (iVar == null || TextUtils.isEmpty(iVar.g())) {
            return false;
        }
        String g = iVar.g();
        try {
            if (this.g != null) {
                com.mbridge.msdk.videocommon.setting.a aVar = this.h;
                int a2 = this.g.a(g, aVar != null ? aVar.e() : 0L);
                if (a2 == -1) {
                    a(g);
                } else if (a2 != 1) {
                }
                try {
                    Handler handler = this.k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    q0.b("LoopTimer", th.getMessage(), th);
                    return z;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    public void b(long j) {
        b();
        this.f9978a = j;
        this.b = false;
        Handler handler = this.k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f9978a);
    }

    public void b(String str, String str2) {
        if (this.c.contains(str2)) {
            return;
        }
        this.c.add(new i(str, str2, 94));
        l lVar = this.i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void a(String str, String str2, boolean z) {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(d, str, str2);
            cVar.d(z);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e) {
            q0.b("LoopTimer", e.getMessage(), e);
        }
    }

    private void b(String str) {
        l lVar = this.i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.d.contains(str2)) {
            return;
        }
        this.d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.c;
        if (linkedList != null && linkedList.contains(str)) {
            this.c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.d.remove(str);
            }
        }
        b(str);
    }
}
