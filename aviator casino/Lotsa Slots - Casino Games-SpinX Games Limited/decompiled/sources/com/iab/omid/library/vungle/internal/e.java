package com.iab.omid.library.vungle.internal;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f4546a;
    private final java.lang.String b;
    private final com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose c;
    private final java.lang.String d;

    public e(android.view.View view, com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        this.f4546a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public java.lang.String a() {
        return this.d;
    }

    public com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f4546a;
    }

    public java.lang.String d() {
        return this.b;
    }
}
