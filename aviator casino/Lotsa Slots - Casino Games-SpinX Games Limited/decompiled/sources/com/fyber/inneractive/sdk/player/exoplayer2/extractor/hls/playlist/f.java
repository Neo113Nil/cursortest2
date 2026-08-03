package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedReader f3947a;
    public final java.util.Queue b;
    public java.lang.String c;

    public f(java.util.LinkedList linkedList, java.io.BufferedReader bufferedReader) {
        this.b = linkedList;
        this.f3947a = bufferedReader;
    }

    public final boolean a() {
        java.lang.String trim;
        if (this.c != null) {
            return true;
        }
        if (!this.b.isEmpty()) {
            this.c = (java.lang.String) this.b.poll();
            return true;
        }
        do {
            java.lang.String readLine = this.f3947a.readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }
}
