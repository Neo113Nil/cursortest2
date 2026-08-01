package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* compiled from: ConnectionJavaSocket.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f8956a;
    private com.mbridge.msdk.config.component.common.network.result.a b;
    private com.mbridge.msdk.config.component.common.network.a c;
    private com.mbridge.msdk.config.component.common.network.retry.a d;
    private b e;
    private com.mbridge.msdk.config.component.nori.monitor.a f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f8956a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f8956a, this.b, this.c);
        this.e = bVar;
        bVar.c(str);
        this.e.a(this.d);
        c.a().a(this.e, this.f);
        return this.b;
    }

    public void a() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i, int i2, String str) {
        this.b.a(str);
        this.b.c(i);
        this.b.a(i2);
        this.b.b(0);
        return this.b;
    }
}
