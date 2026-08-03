package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3835a;
    public final com.fyber.inneractive.sdk.cache.a b;
    public android.content.SharedPreferences c;

    public d0(android.content.Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f3835a = context;
        this.b = aVar;
    }

    public com.fyber.inneractive.sdk.cache.m a() {
        try {
            if (!this.b.d()) {
                new com.fyber.inneractive.sdk.network.c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            java.lang.Object a2 = this.b.a(a(this.b.c()));
            if (this.c == null) {
                this.c = this.f3835a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.m(a2, this.c.getString(this.b.b(), null));
        } catch (java.lang.Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public final void b(java.lang.String str) {
        if (this.c == null) {
            this.c = this.f3835a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().putString(this.b.b(), str).apply();
    }

    public final void b() {
        if (this.c == null) {
            this.c = this.f3835a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().remove(this.b.b()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public boolean a(java.lang.String str, java.lang.String str2) {
        boolean z;
        int i = 1;
        i = 1;
        i = 1;
        com.fyber.inneractive.sdk.util.IAlog.a("caching file %s", str);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f3835a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
            } catch (java.lang.Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.lang.Exception e) {
                        java.lang.Object[] objArr = new java.lang.Object[i];
                        objArr[0] = e.getMessage();
                        com.fyber.inneractive.sdk.util.IAlog.f("Failed closing cache file: %s", objArr);
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            z = false;
        }
        try {
            com.fyber.inneractive.sdk.util.IAlog.a("File cached successfully", new java.lang.Object[0]);
            try {
                fileOutputStream.close();
            } catch (java.lang.Exception e3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Failed closing cache file: %s", e3.getMessage());
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            z = true;
            com.fyber.inneractive.sdk.util.IAlog.f("Failed caching file: %s", e.getMessage());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Exception e5) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Failed closing cache file: %s", e5.getMessage());
                }
            }
            i = z;
            return i;
        }
        return i;
    }

    public final java.lang.String a(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        com.fyber.inneractive.sdk.util.IAlog.a("reading local file: %s", str);
        java.io.FileInputStream fileInputStream2 = null;
        r2 = null;
        r2 = null;
        java.lang.String str2 = null;
        try {
            fileInputStream = this.f3835a.openFileInput(str);
            try {
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    java.lang.String str3 = new java.lang.String(bArr, "UTF-8");
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Exception e) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Failed closing local file: %s", e.getMessage());
                    }
                    str2 = str3;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    if (!(e instanceof java.io.FileNotFoundException)) {
                        com.fyber.inneractive.sdk.util.IAlog.a("Failed reading local file: %s", e.getMessage());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Exception e3) {
                                com.fyber.inneractive.sdk.util.IAlog.f("Failed closing local file: %s", e3.getMessage());
                            }
                        }
                        com.fyber.inneractive.sdk.util.IAlog.a("local file %s read successfully", str);
                        return str2;
                    }
                    throw new java.io.FileNotFoundException();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (java.lang.Exception e4) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Failed closing local file: %s", e4.getMessage());
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
