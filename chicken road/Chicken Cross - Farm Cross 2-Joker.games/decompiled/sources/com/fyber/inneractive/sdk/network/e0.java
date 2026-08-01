package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class e0 extends d0 {
    public static final String e = IAlog.a(e0.class);
    public final com.fyber.inneractive.sdk.player.cache.g d;

    public e0(Context context, com.fyber.inneractive.sdk.cache.a aVar, com.fyber.inneractive.sdk.player.cache.g gVar) {
        super(context, aVar);
        this.d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: Exception -> 0x00c5, TryCatch #1 {Exception -> 0x00c5, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:21:0x007c, B:23:0x0086, B:26:0x0091, B:28:0x009e, B:29:0x00a8, B:38:0x006c, B:39:0x00ba, B:10:0x001b, B:12:0x001f, B:14:0x002b, B:18:0x003d, B:20:0x0043, B:32:0x0037, B:33:0x0048, B:34:0x0062, B:35:0x0063, B:36:0x006a), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[Catch: Exception -> 0x00c5, TryCatch #1 {Exception -> 0x00c5, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:21:0x007c, B:23:0x0086, B:26:0x0091, B:28:0x009e, B:29:0x00a8, B:38:0x006c, B:39:0x00ba, B:10:0x001b, B:12:0x001f, B:14:0x002b, B:18:0x003d, B:20:0x0043, B:32:0x0037, B:33:0x0048, B:34:0x0062, B:35:0x0063, B:36:0x006a), top: B:1:0x0000, inners: #0 }] */
    @Override // com.fyber.inneractive.sdk.network.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.cache.n a() {
        String str;
        Uri uri;
        try {
            if (this.d != null && this.b.d()) {
                com.fyber.inneractive.sdk.player.cache.g gVar = this.d;
                String c = this.b.c();
                gVar.getClass();
                try {
                } catch (Exception e2) {
                    IAlog.f("%s: failure on filePath: %s", IAlog.a(com.fyber.inneractive.sdk.player.cache.g.class), e2);
                }
                if (gVar.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                if (!com.fyber.inneractive.sdk.player.cache.g.p.matcher(c).matches()) {
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + c + "\"");
                }
                com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) gVar.j.get(c);
                File a2 = eVar == null ? null : eVar.a(0);
                if (a2 != null && a2.exists()) {
                    str = a2.getAbsolutePath();
                    uri = (Uri) this.b.a(str);
                    if (uri != null) {
                        new c0();
                        return new com.fyber.inneractive.sdk.cache.n();
                    }
                    IAlog.a("Get cached file: %s", str);
                    if (this.c == null) {
                        this.c = this.f5489a.getSharedPreferences("IAConfigurationPreferences", 0);
                    }
                    return new com.fyber.inneractive.sdk.cache.n(uri, this.c.getString(this.b.b(), null));
                }
                str = null;
                uri = (Uri) this.b.a(str);
                if (uri != null) {
                }
            }
            new c0();
            return new com.fyber.inneractive.sdk.cache.n();
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.n();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final boolean a(String str, String str2) {
        com.fyber.inneractive.sdk.player.cache.g gVar;
        try {
            byte[] decode = Base64.decode(str2, 0);
            if (decode != null && (gVar = this.d) != null) {
                com.fyber.inneractive.sdk.player.cache.d a2 = gVar.a(str);
                if (a2 == null) {
                    IAlog.f("%s: Error getting editor", e);
                    return false;
                }
                a2.a(decode);
                a2.a();
                return true;
            }
            IAlog.f("%s: Invalid content", e);
            return false;
        } catch (IOException | IllegalArgumentException e2) {
            IAlog.f("%s: Error writing cache: ", e, e2);
            return false;
        }
    }
}
