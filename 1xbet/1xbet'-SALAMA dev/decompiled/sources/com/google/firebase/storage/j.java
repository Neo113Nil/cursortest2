package com.google.firebase.storage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12036h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12029a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12030b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12031c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B3.g f12032d = B3.g.i("");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12033e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12034f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12035g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12037i = null;
    public B3.g j = B3.g.i("");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B3.g f12038k = B3.g.i("");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B3.g f12039l = B3.g.i("");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B3.g f12040m = B3.g.i("");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B3.g f12041n = B3.g.i(Collections.emptyMap());

    public final JSONObject a() {
        HashMap map = new HashMap();
        B3.g gVar = this.f12032d;
        if (gVar.f1063b) {
            map.put("contentType", (String) gVar.f1064c);
        }
        if (this.f12041n.f1063b) {
            map.put("metadata", new JSONObject((Map) this.f12041n.f1064c));
        }
        B3.g gVar2 = this.j;
        if (gVar2.f1063b) {
            map.put("cacheControl", (String) gVar2.f1064c);
        }
        B3.g gVar3 = this.f12038k;
        if (gVar3.f1063b) {
            map.put("contentDisposition", (String) gVar3.f1064c);
        }
        B3.g gVar4 = this.f12039l;
        if (gVar4.f1063b) {
            map.put("contentEncoding", (String) gVar4.f1064c);
        }
        B3.g gVar5 = this.f12040m;
        if (gVar5.f1063b) {
            map.put("contentLanguage", (String) gVar5.f1064c);
        }
        return new JSONObject(map);
    }
}
