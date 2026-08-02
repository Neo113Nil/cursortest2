package com.google.firebase.storage;

import B4.V;
import android.net.Uri;
import android.text.TextUtils;
import b4.C0784d;
import com.google.android.gms.common.internal.D;
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Y3.i f12012a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.b f12013b;

    /* renamed from: c, reason: collision with root package name */
    public final N4.b f12014c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12015d;

    /* renamed from: e, reason: collision with root package name */
    public long f12016e = 600000;

    /* renamed from: f, reason: collision with root package name */
    public long f12017f = 600000;

    /* renamed from: g, reason: collision with root package name */
    public long f12018g = 120000;

    /* renamed from: h, reason: collision with root package name */
    public B.v f12019h;

    public f(String str, Y3.i iVar, N4.b bVar, N4.b bVar2) {
        this.f12015d = str;
        this.f12012a = iVar;
        this.f12013b = bVar;
        this.f12014c = bVar2;
        if (bVar2 == null || bVar2.get() == null) {
            return;
        }
        ((C0784d) ((InterfaceC0965b) bVar2.get())).a(new V(16));
    }

    public static f c(Y3.i iVar, Uri uri) {
        f fVar;
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        iVar.b();
        g gVar = (g) iVar.f7666d.a(g.class);
        D.j(gVar, "Firebase Storage component is not present.");
        synchronized (gVar) {
            fVar = (f) gVar.f12020a.get(host);
            if (fVar == null) {
                fVar = new f(host, gVar.f12021b, gVar.f12022c, gVar.f12023d);
                gVar.f12020a.put(host, fVar);
            }
        }
        return fVar;
    }

    public final InterfaceC0965b a() {
        N4.b bVar = this.f12014c;
        if (bVar != null) {
            return (InterfaceC0965b) bVar.get();
        }
        return null;
    }

    public final InterfaceC1090b b() {
        N4.b bVar = this.f12013b;
        if (bVar != null) {
            return (InterfaceC1090b) bVar.get();
        }
        return null;
    }

    public final m d(String str) {
        String replace;
        D.a("location must not be null or empty", !TextUtils.isEmpty(str));
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        String str2 = this.f12015d;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        Uri build = new Uri.Builder().scheme("gs").authority(str2).path("/").build();
        D.j(build, "uri must not be null");
        D.a("The supplied bucketname does not match the storage bucket of the current instance.", TextUtils.isEmpty(str2) || build.getAuthority().equalsIgnoreCase(str2));
        D.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
        String B7 = P6.b.B(str);
        Uri.Builder buildUpon = build.buildUpon();
        if (TextUtils.isEmpty(B7)) {
            replace = "";
        } else {
            String encode = Uri.encode(B7);
            D.i(encode);
            replace = encode.replace("%2F", "/");
        }
        return new m(buildUpon.appendEncodedPath(replace).build(), this);
    }
}
