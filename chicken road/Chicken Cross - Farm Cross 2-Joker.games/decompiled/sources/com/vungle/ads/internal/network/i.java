package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* loaded from: classes7.dex */
public final class i extends ForwardingSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f12050a = jVar;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return super.read(sink, j);
        } catch (IOException e) {
            this.f12050a.a(e);
            throw e;
        }
    }
}
