package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public a(b.InterfaceC0305b interfaceC0305b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0305b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
