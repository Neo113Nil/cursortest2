package com.google.firebase.storage;

import U5.p0;
import Y4.D;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12020a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y3.i f12021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N4.b f12022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N4.b f12023d;

    public g(Y3.i iVar, N4.b bVar, N4.b bVar2, Executor executor, Executor executor2) {
        this.f12021b = iVar;
        this.f12022c = bVar;
        this.f12023d = bVar2;
        D.f7694f = new p0(executor, 5);
        D.f7696h = new p0(executor, 3);
        D.f7695g = new p0(executor, 2);
        D.f7697i = new p056h4.j(executor);
        D.j = executor2;
    }
}
