package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* compiled from: DownloadFutureTask.java */
/* loaded from: classes6.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    private final h f8989a;

    c(h hVar) {
        super(hVar, null);
        this.f8989a = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f8989a;
        int i = hVar.f9001a;
        h hVar2 = cVar.f8989a;
        int i2 = hVar2.f9001a;
        return i == i2 ? hVar.b - hVar2.b : i2 - i;
    }
}
