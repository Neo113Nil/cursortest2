package com.iab.omid.library.bigosg.walking.a;

import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f6116a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0268b interfaceC0268b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0268b);
        this.f6116a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
