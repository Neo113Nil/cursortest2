package com.iab.omid.library.ironsrc.walking.async;

/* loaded from: classes5.dex */
public abstract class a extends com.iab.omid.library.ironsrc.walking.async.b {
    protected final java.util.HashSet<java.lang.String> c;
    protected final org.json.JSONObject d;
    protected final long e;

    public a(com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0105b interfaceC0105b, java.util.HashSet<java.lang.String> hashSet, org.json.JSONObject jSONObject, long j) {
        super(interfaceC0105b);
        this.c = new java.util.HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
