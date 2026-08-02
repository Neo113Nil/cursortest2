package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import r3.C2350b;

/* loaded from: classes.dex */
public final /* synthetic */ class E7 implements InterfaceC1805xu, Ei {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8459k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f8460l;

    public /* synthetic */ E7(Context context, int i) {
        this.f8459k = i;
        this.f8460l = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x015d, code lost:
    
        if (new org.json.JSONObject(r6.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x002b, all -> 0x007b, blocks: (B:11:0x0024, B:13:0x0028, B:15:0x002e, B:17:0x0033, B:18:0x0035, B:20:0x0047, B:21:0x004b, B:23:0x004d, B:44:0x00c7, B:45:0x00ce, B:53:0x0100, B:59:0x0169, B:66:0x0198, B:67:0x019f, B:91:0x01a1, B:92:0x01a8, B:26:0x0062, B:28:0x0066, B:31:0x0073, B:34:0x0080, B:36:0x008c, B:37:0x0096, B:39:0x009c, B:41:0x00ac, B:43:0x00c3, B:46:0x00d1, B:48:0x00d5, B:50:0x00e5, B:52:0x00fc, B:54:0x0108, B:57:0x015f, B:60:0x0172, B:62:0x018a, B:64:0x018e, B:65:0x0191, B:68:0x0119, B:70:0x0127, B:72:0x012f, B:75:0x014f, B:77:0x0152, B:83:0x0163, B:84:0x0166, B:74:0x0133), top: B:10:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[Catch: all -> 0x007b, Merged into TryCatch #4 {all -> 0x002b, all -> 0x007b, blocks: (B:11:0x0024, B:13:0x0028, B:15:0x002e, B:17:0x0033, B:18:0x0035, B:20:0x0047, B:21:0x004b, B:23:0x004d, B:44:0x00c7, B:45:0x00ce, B:53:0x0100, B:59:0x0169, B:66:0x0198, B:67:0x019f, B:91:0x01a1, B:92:0x01a8, B:26:0x0062, B:28:0x0066, B:31:0x0073, B:34:0x0080, B:36:0x008c, B:37:0x0096, B:39:0x009c, B:41:0x00ac, B:43:0x00c3, B:46:0x00d1, B:48:0x00d5, B:50:0x00e5, B:52:0x00fc, B:54:0x0108, B:57:0x015f, B:60:0x0172, B:62:0x018a, B:64:0x018e, B:65:0x0191, B:68:0x0119, B:70:0x0127, B:72:0x012f, B:75:0x014f, B:77:0x0152, B:83:0x0163, B:84:0x0166, B:74:0x0133), top: B:10:0x0024 }, TRY_ENTER] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12a() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        switch (this.f8459k) {
            case 0:
                A7 a7 = F7.f8796a;
                D7 d7 = Q2.r.f5053d.f5056c;
                Context context2 = this.f8460l;
                if (!d7.f8169c) {
                    synchronized (d7.f8167a) {
                        try {
                            if (!d7.f8169c) {
                                if (!d7.f8170d) {
                                    d7.f8170d = true;
                                }
                                d7.i = TextUtils.equals(context2.getPackageName(), "com.google.android.gms");
                                if (context2.getApplicationContext() != null) {
                                    context2 = context2.getApplicationContext();
                                }
                                d7.f8172g = context2;
                                try {
                                    d7.f = C2350b.a(context2).b(d7.f8172g.getPackageName(), 128).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                Context context3 = d7.f8172g;
                                AtomicBoolean atomicBoolean = j3.h.f17515a;
                                try {
                                    context = context3.createPackageContext("com.google.android.gms", 3);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    context = null;
                                }
                                if (context != null || context3 == null || (context = context3.getApplicationContext()) != null) {
                                    context3 = context;
                                }
                                if (context3 != null) {
                                    C1543s1 c1543s1 = Q2.r.f5053d.f5055b;
                                    sharedPreferences = C1543s1.o(context3);
                                } else {
                                    sharedPreferences = null;
                                }
                                if (sharedPreferences != null) {
                                    AbstractC1640u8.f15795a.set(new C7(sharedPreferences));
                                }
                                if (!d7.i) {
                                    G3 g32 = AbstractC0790b8.f12768d;
                                    if (((Long) g32.s()).longValue() > 0 && AbstractC1668us.X(d7.f8172g, "crash_without_write") >= ((Long) g32.s()).longValue()) {
                                        d7.f8174j = true;
                                        d7.f8169c = true;
                                        d7.f8170d = false;
                                        d7.f8168b.open();
                                    }
                                }
                                if (!d7.i) {
                                    G3 g33 = AbstractC0790b8.f;
                                    if (((Long) g33.s()).longValue() > 0 && AbstractC1668us.X(d7.f8172g, "init_without_write") >= ((Long) g33.s()).longValue()) {
                                        d7.f8174j = true;
                                        d7.f8169c = true;
                                        d7.f8170d = false;
                                        d7.f8168b.open();
                                    }
                                }
                                Context context4 = d7.f8172g;
                                if (!((Boolean) AbstractC1058h8.f13716g.s()).booleanValue()) {
                                    if (((Boolean) AbstractC1058h8.f13717h.s()).booleanValue() && (r6 = context4.getSharedPreferences("admob", 0)) != null) {
                                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                        try {
                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                            try {
                                                break;
                                            } catch (JSONException unused3) {
                                            }
                                        } finally {
                                            StrictMode.setThreadPolicy(threadPolicy);
                                        }
                                    }
                                    if (context3 != null) {
                                        d7.f8170d = false;
                                        d7.f8168b.open();
                                    } else {
                                        C1543s1 c1543s12 = Q2.r.f5053d.f5055b;
                                        d7.f8171e = C1543s1.o(context3);
                                        if (!((Boolean) AbstractC1058h8.f13711a.s()).booleanValue() && (sharedPreferences2 = d7.f8171e) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(d7);
                                        }
                                        d7.c(d7.f8171e);
                                        d7.f8169c = true;
                                        d7.f8170d = false;
                                        d7.f8168b.open();
                                    }
                                }
                                context3 = d7.f8172g;
                                if (context3 != null) {
                                }
                            }
                        } catch (Throwable th) {
                            d7.f8170d = false;
                            d7.f8168b.open();
                            throw th;
                        } finally {
                        }
                    }
                }
                return null;
            default:
                new D();
                return new RE(this.f8460l);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((Wh) obj).d(this.f8460l);
    }
}
