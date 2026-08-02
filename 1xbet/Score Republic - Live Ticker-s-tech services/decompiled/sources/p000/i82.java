package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i82 implements w82 {

    /* JADX INFO: renamed from: a */
    public final Context f3477a;

    /* JADX INFO: renamed from: d */
    public String f3480d;

    /* JADX INFO: renamed from: c */
    public final Object f3479c = new Object();

    /* JADX INFO: renamed from: b */
    public final m82 f3478b = new m82();

    public i82(C0186et c0186et) {
        this.f3477a = c0186et.f2181k;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: a */
    public final p82 mo2565a(Uri uri) throws C0287hi, o82 {
        if (m2573i(uri)) {
            throw new o82("Android backend cannot perform remote operations without a remote backend");
        }
        File fileM3501j = n80.m3501j(m2572h(uri));
        return new p82(new FileInputStream(fileM3501j), fileM3501j);
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: b */
    public final boolean mo2566b(Uri uri) throws o82 {
        if (m2573i(uri)) {
            throw new o82("Android backend cannot perform remote operations without a remote backend");
        }
        return n80.m3501j(m2572h(uri)).exists();
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: c */
    public final OutputStream mo2567c(Uri uri) {
        return this.f3478b.mo2567c(m2572h(uri));
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: d */
    public final void mo2568d(Uri uri) {
        this.f3478b.mo2568d(m2572h(uri));
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: e */
    public final void mo2569e(Uri uri, Uri uri2) throws IOException {
        this.f3478b.mo2569e(m2572h(uri), m2572h(uri2));
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: f */
    public final String mo2570f() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:55:0x0112, B:57:0x0116, B:60:0x012b, B:61:0x012d), top: B:80:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.w82
    /* JADX INFO: renamed from: g */
    public final File mo2571g(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (m2573i(uri)) {
            C0270h1.m2187c("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.f3477a;
        if (!uri.getScheme().equals("android")) {
            throw new C0287hi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C0287hi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            try {
                                if (this.f3480d == null) {
                                    this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.f3480d;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new o82("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            if (this.f3480d == null) {
                                this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f3480d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new o82("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = m80.m3349p(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            if (this.f3480d == null) {
                                this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f3480d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new o82("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(m80.m3349p(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = h82.f3126a;
                            if ("shared".equals(str3)) {
                                account = h82.f3126a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                o80.m3642E(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!h82.f3126a.equals(account)) {
                                throw new C0287hi("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new C0287hi(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            if (this.f3480d == null) {
                                this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f3480d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new o82("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            if (this.f3480d == null) {
                                this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f3480d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new o82("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!j22.m2791J(context)) {
                        synchronized (this.f3479c) {
                            if (this.f3480d == null) {
                                this.f3480d = m80.m3349p(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f3480d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new o82("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new C0287hi(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    /* JADX INFO: renamed from: h */
    public final Uri m2572h(Uri uri) throws IOException {
        String strConcat;
        if (m2573i(uri)) {
            throw new C0287hi("Operation across authorities is not allowed.");
        }
        File fileMo2571g = mo2571g(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        mc0 mc0VarM4056l = qc0.m4056l();
        builderPath.path(fileMo2571g.getAbsolutePath());
        q01 q01VarM3374d = mc0VarM4056l.m3374d();
        Pattern pattern = t82.f7355a;
        if (q01VarM3374d.isEmpty()) {
            strConcat = null;
        } else {
            g72 g72Var = new g72("+");
            Iterator it = q01VarM3374d.iterator();
            StringBuilder sb = new StringBuilder();
            g72Var.m1993a(sb, it);
            strConcat = "transform=".concat(sb.toString());
        }
        return builderPath.encodedFragment(strConcat).build();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2573i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f3477a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
