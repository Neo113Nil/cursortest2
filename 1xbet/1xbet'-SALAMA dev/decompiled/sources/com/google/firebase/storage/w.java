package com.google.firebase.storage;

import A1.K0;
import C0.C0083b;
import Y4.D;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.BufferedInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f12078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S4.e f12079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Exception f12080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile int f12081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0083b f12082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BufferedInputStream f12085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public T4.a f12086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f12087u;

    @Override // com.google.firebase.storage.s
    public final m d() {
        return this.f12078l;
    }

    @Override // com.google.firebase.storage.s
    public final void e() {
        this.f12079m.f6338e = true;
        this.f12080n = i.a(Status.f11081z);
    }

    @Override // com.google.firebase.storage.s
    public final void f() {
        this.f12084r = this.f12083q;
    }

    @Override // com.google.firebase.storage.s
    public final boolean g() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.s
    public final boolean j() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.s
    public final void k() {
        if (this.f12080n != null) {
            o(64, false);
            return;
        }
        if (o(4, false)) {
            E2.l lVar = new E2.l(this, 3);
            u uVar = new u();
            uVar.f12071a = this;
            uVar.f12073c = lVar;
            this.f12085s = new BufferedInputStream(uVar);
            try {
                uVar.b();
                C0083b c0083b = this.f12082p;
                if (c0083b != null) {
                    try {
                        c0083b.B(this.f12085s);
                    } catch (Exception e7) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e7);
                        this.f12080n = e7;
                    }
                }
            } catch (IOException e8) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e8);
                this.f12080n = e8;
            }
            if (this.f12085s == null) {
                this.f12086t.o();
                this.f12086t = null;
            }
            if (this.f12080n == null && this.f12066h == 4) {
                o(4, false);
                o(128, false);
                return;
            }
            if (o(this.f12066h == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + this.f12066h);
        }
    }

    @Override // com.google.firebase.storage.s
    public final void l() {
        D.f7696h.execute(new K0(this, 23));
    }

    @Override // com.google.firebase.storage.s
    public final r n() {
        return new v(this, i.b(this.f12080n, this.f12081o));
    }
}
