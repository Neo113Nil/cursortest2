package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0856cm extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final int f13035k;

    public C0856cm(int i) {
        this.f13035k = i;
    }

    public C0856cm(String str, int i) {
        super(str);
        this.f13035k = i;
    }

    public C0856cm(String str, Throwable th) {
        super(str, th);
        this.f13035k = 1;
    }
}
