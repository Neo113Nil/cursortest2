package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: mm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475mm implements InterfaceC0438lm, InterfaceC0512nm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5089a;

    /* JADX INFO: renamed from: b */
    public Object f5090b;

    /* JADX INFO: renamed from: c */
    public int f5091c;

    /* JADX INFO: renamed from: d */
    public int f5092d;

    /* JADX INFO: renamed from: e */
    public Comparable f5093e;

    /* JADX INFO: renamed from: f */
    public Object f5094f;

    public C0475mm(C0475mm c0475mm) {
        this.f5089a = 1;
        ClipData clipData = (ClipData) c0475mm.f5090b;
        clipData.getClass();
        this.f5090b = clipData;
        int i = c0475mm.f5091c;
        if (i < 0) {
            Locale locale = Locale.US;
            C0270h1.m2190f("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C0270h1.m2190f("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f5091c = i;
        int i2 = c0475mm.f5092d;
        if ((i2 & 1) == i2) {
            this.f5092d = i2;
            this.f5093e = (Uri) c0475mm.f5093e;
            this.f5094f = (Bundle) c0475mm.f5094f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    /* JADX INFO: renamed from: h */
    public static String m3400h(w00 w00Var) {
        w00Var.m5224a();
        r10 r10Var = w00Var.f8320c;
        String str = r10Var.f6654e;
        if (str != null) {
            return str;
        }
        w00Var.m5224a();
        String str2 = r10Var.f6651b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: a */
    public ClipData mo3049a() {
        return (ClipData) this.f5090b;
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: b */
    public int mo3050b() {
        return this.f5092d;
    }

    @Override // p000.InterfaceC0438lm
    public C0549om build() {
        return new C0549om(new C0475mm(this));
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: c */
    public ContentInfo mo3051c() {
        return null;
    }

    @Override // p000.InterfaceC0438lm
    /* JADX INFO: renamed from: d */
    public void mo3052d(Uri uri) {
        this.f5093e = uri;
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: e */
    public int mo3053e() {
        return this.f5091c;
    }

    @Override // p000.InterfaceC0438lm
    /* JADX INFO: renamed from: f */
    public void mo3054f(int i) {
        this.f5092d = i;
    }

    /* JADX INFO: renamed from: g */
    public synchronized String m3401g() {
        try {
            if (((String) this.f5093e) == null) {
                m3404k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f5093e;
    }

    /* JADX INFO: renamed from: i */
    public PackageInfo m3402i(String str) {
        try {
            return ((Context) this.f5090b).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m3403j() {
        int i;
        synchronized (this) {
            i = this.f5092d;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f5090b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f5092d = 2;
                    } else {
                        this.f5092d = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m3404k() {
        PackageInfo packageInfoM3402i = m3402i(((Context) this.f5090b).getPackageName());
        if (packageInfoM3402i != null) {
            this.f5093e = Integer.toString(packageInfoM3402i.versionCode);
            this.f5094f = packageInfoM3402i.versionName;
        }
    }

    @Override // p000.InterfaceC0438lm
    public void setExtras(Bundle bundle) {
        this.f5094f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f5089a) {
            case 1:
                Uri uri = (Uri) this.f5093e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f5090b).getDescription());
                sb.append(", source=");
                int i = this.f5091c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f5092d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0024an.m285h(sb, ((Bundle) this.f5094f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0475mm(Context context) {
        this.f5089a = 2;
        this.f5092d = 0;
        this.f5090b = context;
    }

    public /* synthetic */ C0475mm() {
        this.f5089a = 0;
    }
}
