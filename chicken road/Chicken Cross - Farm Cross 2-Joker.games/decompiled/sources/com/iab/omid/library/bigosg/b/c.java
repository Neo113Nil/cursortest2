package com.iab.omid.library.bigosg.b;

import android.view.View;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f6097a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f6097a = new com.iab.omid.library.bigosg.e.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f6097a;
    }

    public String b() {
        return this.b;
    }

    public FriendlyObstructionPurpose c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}
