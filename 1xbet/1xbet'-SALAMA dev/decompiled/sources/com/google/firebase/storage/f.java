package com.google.firebase.storage;

import B4.V;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import p042f4.InterfaceC0893b;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.i f12012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4.b f12013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N4.b f12014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12016e = 600000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12017f = 600000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12018g = 120000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B.v f12019h;

    public f(String str, Y3.i iVar, N4.b bVar, N4.b bVar2) {
        this.f12015d = str;
        this.f12012a = iVar;
        this.f12013b = bVar;
        this.f12014c = bVar2;
        if (bVar2 == null || bVar2.get() == null) {
            return;
        }
        ((p014b4.d) ((p026d4.b) bVar2.get())).a(new V(16));
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

    public final p026d4.b a() {
        N4.b bVar = this.f12014c;
        if (bVar != null) {
            return (p026d4.b) bVar.get();
        }
        return null;
    }

    public final InterfaceC0893b b() {
        N4.b bVar = this.f12013b;
        if (bVar != null) {
            return (InterfaceC0893b) bVar.get();
        }
        return null;
    }

    public final m d(String str) {
        String strReplace;
        D.a("location must not be null or empty", !TextUtils.isEmpty(str));
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        String str2 = this.f12015d;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        Uri uriBuild = new Uri.Builder().scheme("gs").authority(str2).path("/").build();
        D.j(uriBuild, "uri must not be null");
        D.a("The supplied bucketname does not match the storage bucket of the current instance.", TextUtils.isEmpty(str2) || uriBuild.getAuthority().equalsIgnoreCase(str2));
        D.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
        String strB = P6.b.B(str);
        Uri.Builder builderBuildUpon = uriBuild.buildUpon();
        if (TextUtils.isEmpty(strB)) {
            strReplace = "";
        } else {
            String strEncode = Uri.encode(strB);
            D.i(strEncode);
            strReplace = strEncode.replace("%2F", "/");
        }
        return new m(builderBuildUpon.appendEncodedPath(strReplace).build(), this);
    }
}
