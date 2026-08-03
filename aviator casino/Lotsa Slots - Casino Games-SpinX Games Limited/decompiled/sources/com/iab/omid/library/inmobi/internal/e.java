package com.iab.omid.library.inmobi.internal;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f4428a;
    private final java.lang.String b;
    private final com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose c;
    private final java.lang.String d;

    public e(android.view.View view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        this.f4428a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public java.lang.String a() {
        return this.d;
    }

    public com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f4428a;
    }

    public java.lang.String d() {
        return this.b;
    }
}
