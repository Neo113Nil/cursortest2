package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes4.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5489a;
    public final com.fyber.inneractive.sdk.cache.a b;
    public SharedPreferences c;

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f5489a = context;
        this.b = aVar;
    }

    public com.fyber.inneractive.sdk.cache.n a() {
        try {
            if (!this.b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.n();
            }
            Object a2 = this.b.a(a(this.b.c()));
            if (this.c == null) {
                this.c = this.f5489a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.n(a2, this.c.getString(this.b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.n();
        }
    }

    public final void b(String str) {
        if (this.c == null) {
            this.c = this.f5489a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().putString(this.b.b(), str).apply();
    }

    public final void b() {
        if (this.c == null) {
            this.c = this.f5489a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().remove(this.b.b()).apply();
    }

    public boolean a(String str, String str2) {
        boolean z;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        boolean z2 = false;
        try {
            try {
                fileOutputStream = this.f5489a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
                z = true;
            } finally {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing cache file: %s", e.getMessage());
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            IAlog.a("File cached successfully", new Object[0]);
            try {
                fileOutputStream.close();
            } catch (Exception e3) {
                IAlog.f("Failed closing cache file: %s", e3.getMessage());
            }
        } catch (Exception e4) {
            e = e4;
            z2 = true;
            IAlog.f("Failed caching file: %s", e.getMessage());
            z = z2;
            return z;
        }
        return z;
    }

    public final String a(String str) {
        FileInputStream fileInputStream;
        IAlog.a("reading local file: %s", str);
        FileInputStream fileInputStream2 = null;
        r1 = null;
        r1 = null;
        String str2 = null;
        try {
            fileInputStream = this.f5489a.openFileInput(str);
            try {
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    String str3 = new String(bArr, "UTF-8");
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing local file: %s", e.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e2) {
                    e = e2;
                    if (!(e instanceof FileNotFoundException)) {
                        IAlog.a("Failed reading local file: %s", e.getMessage());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e3) {
                                IAlog.f("Failed closing local file: %s", e3.getMessage());
                            }
                        }
                        IAlog.a("local file %s read successfully", str);
                        return str2;
                    }
                    throw new FileNotFoundException();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e4) {
                        IAlog.f("Failed closing local file: %s", e4.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
