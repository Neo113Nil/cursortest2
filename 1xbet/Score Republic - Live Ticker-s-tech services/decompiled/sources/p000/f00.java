package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2220j;

    /* JADX INFO: renamed from: k */
    public final Comparable f2221k;

    /* JADX INFO: renamed from: l */
    public final Object f2222l;

    /* JADX INFO: renamed from: m */
    public Object f2223m;

    public /* synthetic */ f00(Comparable comparable, Object obj, int i) {
        this.f2220j = i;
        this.f2221k = comparable;
        this.f2222l = obj;
    }

    /* JADX INFO: renamed from: b */
    public static f00 m1547b(Context context, Uri uri, hd1 hd1Var) {
        return new f00(uri, new f71(ComponentCallbacks2C0106a.m983a(context).f1309l.m4041a().m3818e(), hd1Var, ComponentCallbacks2C0106a.m983a(context).f1310m, context.getContentResolver()), 1);
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        switch (this.f2220j) {
            case 0:
                return ((g00) this.f2222l).mo1915a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        int i = this.f2220j;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        switch (this.f2220j) {
            case 0:
                Object obj = this.f2223m;
                if (obj != null) {
                    try {
                        ((g00) this.f2222l).mo1916b(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f2223m;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) throws Throwable {
        switch (this.f2220j) {
            case 0:
                try {
                    Object objMo1914A = ((g00) this.f2222l).mo1914A((File) this.f2221k);
                    this.f2223m = objMo1914A;
                    interfaceC0514no.mo84h(objMo1914A);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    interfaceC0514no.mo82f(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM1550h = m1550h();
                    this.f2223m = inputStreamM1550h;
                    interfaceC0514no.mo84h(inputStreamM1550h);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    interfaceC0514no.mo82f(e2);
                }
                break;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        switch (this.f2220j) {
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[PHI: r6
      0x0033: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #7 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0047, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX INFO: renamed from: h */
    public InputStream m1550h() throws Throwable {
        Cursor cursor;
        SecurityException e;
        Cursor cursorMo618n;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM5769h;
        f71 f71Var = (f71) this.f2222l;
        ContentResolver contentResolver = (ContentResolver) f71Var.f2336m;
        Uri uri = (Uri) this.f2221k;
        Cursor cursor2 = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorMo618n = ((hd1) f71Var.f2334k).mo618n(uri);
                        if (cursorMo618n != null) {
                            try {
                                if (cursorMo618n.moveToFirst()) {
                                    string = cursorMo618n.getString(0);
                                    cursorMo618n.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (cursorMo618n != null) {
                                }
                                string = null;
                                if (TextUtils.isEmpty(string)) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    file = new File(string);
                                    if (file.exists()) {
                                        inputStreamOpenInputStream = null;
                                    } else {
                                        inputStreamOpenInputStream = null;
                                    }
                                }
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        try {
                                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                            iM5769h = yd0.m5769h((ArrayList) f71Var.f2337n, inputStreamOpenInputStream2, (nk0) f71Var.f2335l);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (IOException | NullPointerException e3) {
                                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                            }
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            iM5769h = -1;
                                            if (iM5769h != -1) {
                                                return new C0487my(inputStreamOpenInputStream, iM5769h);
                                            }
                                            return inputStreamOpenInputStream;
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpenInputStream2 != null) {
                                            try {
                                                inputStreamOpenInputStream2.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        throw th;
                                    }
                                } else {
                                    iM5769h = -1;
                                }
                                if (iM5769h != -1) {
                                    return new C0487my(inputStreamOpenInputStream, iM5769h);
                                }
                                return inputStreamOpenInputStream;
                            }
                            if (TextUtils.isEmpty(string)) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists() || 0 >= file.length()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    Uri uriFromFile = Uri.fromFile(file);
                                    try {
                                        inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                    } catch (NullPointerException e4) {
                                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                                    }
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iM5769h = yd0.m5769h((ArrayList) f71Var.f2337n, inputStreamOpenInputStream2, (nk0) f71Var.f2335l);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iM5769h = -1;
                            }
                            if (iM5769h != -1) {
                                return new C0487my(inputStreamOpenInputStream, iM5769h);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (cursorMo618n != null) {
                            cursorMo618n.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorMo618n = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo618n != null) {
                            cursorMo618n.close();
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM5769h = yd0.m5769h((ArrayList) f71Var.f2337n, inputStreamOpenInputStream2, (nk0) f71Var.f2335l);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iM5769h = -1;
                        }
                        if (iM5769h != -1) {
                            return new C0487my(inputStreamOpenInputStream, iM5769h);
                        }
                        return inputStreamOpenInputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SecurityException e6) {
                e = e6;
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iM5769h = yd0.m5769h((ArrayList) f71Var.f2337n, inputStreamOpenInputStream2, (nk0) f71Var.f2335l);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iM5769h = -1;
            }
            if (iM5769h != -1) {
                return new C0487my(inputStreamOpenInputStream, iM5769h);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m1548c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m1549f() {
    }
}
