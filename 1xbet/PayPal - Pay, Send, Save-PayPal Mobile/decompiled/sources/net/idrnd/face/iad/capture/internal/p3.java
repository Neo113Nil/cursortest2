package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6997a;
    public final net.idrnd.face.iad.capture.internal.r3 b;

    public p3(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f6997a = context;
        this.b = new net.idrnd.face.iad.capture.internal.r3(context);
        c();
    }

    public static boolean a() {
        if (!net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
            return false;
        }
        java.lang.String str = net.idrnd.face.iad.capture.internal.s.f7002a;
        java.lang.String[] b = net.idrnd.face.iad.capture.internal.r.b();
        int length = b.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = b[i];
            java.lang.String str3 = net.idrnd.face.iad.capture.internal.s.f7002a;
            java.lang.String a2 = net.idrnd.face.iad.capture.internal.r.a();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(a2);
            strArr[i] = sb.toString();
        }
        return net.idrnd.face.iad.capture.internal.y3.a(strArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:0|1|(2:2|(7:4|5|6|8|9|10|11)(1:13))|14|(8:17|18|19|21|22|23|24|15)|26|27|28|29|(26:31|(3:33|(3:36|(1:38)(2:39|40)|34)|143)|144|41|42|(1:44)(3:93|(7:95|(3:97|(3:100|(2:102|103)(1:138)|98)|139)|140|104|(3:108|(5:110|(5:112|(3:114|(3:117|(2:119|120)(1:132)|115)|133)|134|121|(2:122|(2:124|(3:127|128|129)(1:126))(1:131)))(0)|135|136|130)|137)|106|107)|141)|45|(2:47|(18:49|50|51|52|53|54|55|56|57|59|60|(4:62|63|64|(2:77|78)(2:74|75))|79|63|64|(0)|77|78))(1:92)|91|50|51|52|53|54|55|56|57|59|60|(0)|79|63|64|(0)|77|78)|145|42|(0)(0)|45|(0)(0)|91|50|51|52|53|54|55|56|57|59|60|(0)|79|63|64|(0)|77|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020e, code lost:
    
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0215, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020c, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean z;
        java.lang.String[] strArr;
        boolean z2;
        java.util.List emptyList;
        java.lang.String[] strArr2;
        java.util.List emptyList2;
        java.lang.String str;
        int i;
        java.lang.Process process;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.Process process2;
        boolean z6;
        java.io.InputStream inputStream;
        java.util.List emptyList3;
        java.lang.String[] strArr3 = net.idrnd.face.iad.capture.internal.s.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(strArr3, strArr3.length)));
        android.content.pm.PackageManager packageManager = this.f6997a.getPackageManager();
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        java.lang.Object[] objArr = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            try {
                packageManager.getPackageInfo((java.lang.String) it.next(), 0);
                objArr = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String[] strArr4 = net.idrnd.face.iad.capture.internal.s.c;
        arrayList2.addAll(kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(strArr4, strArr4.length)));
        android.content.pm.PackageManager packageManager2 = this.f6997a.getPackageManager();
        java.util.Iterator it2 = arrayList2.iterator();
        java.lang.Object[] objArr2 = false;
        while (it2.hasNext()) {
            try {
                packageManager2.getPackageInfo((java.lang.String) it2.next(), 0);
                objArr2 = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            }
        }
        boolean a2 = a(net.idrnd.face.iad.capture.internal.s.f7002a);
        try {
            inputStream = java.lang.Runtime.getRuntime().exec("mount").getInputStream();
        } catch (java.io.IOException | java.util.NoSuchElementException unused3) {
        }
        if (inputStream != null) {
            java.lang.String next = new java.util.Scanner(inputStream).useDelimiter("\\A").next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            java.util.List<java.lang.String> split = new kotlin.text.Regex(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE).split(next, 0);
            if (!split.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList3 = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList3 = kotlin.collections.CollectionsKt.emptyList();
            strArr = (java.lang.String[]) emptyList3.toArray(new java.lang.String[0]);
            char c = 2;
            if (strArr != null) {
                z2 = false;
            } else {
                int length = strArr.length;
                z2 = false;
                int i3 = 0;
                while (i3 < length) {
                    java.util.List<java.lang.String> split2 = new kotlin.text.Regex(" ").split(strArr[i3], i2);
                    if (!split2.isEmpty()) {
                        java.util.ListIterator<java.lang.String> listIterator2 = split2.listIterator(split2.size());
                        while (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                emptyList = kotlin.collections.CollectionsKt.take(split2, listIterator2.nextIndex() + (z ? 1 : 0));
                                break;
                            }
                        }
                    }
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                    java.lang.String[] strArr5 = (java.lang.String[]) emptyList.toArray(new java.lang.String[i2]);
                    if (strArr5.length >= 6) {
                        java.lang.String str2 = strArr5[c];
                        java.lang.String str3 = strArr5[5];
                        java.lang.String[] strArr6 = net.idrnd.face.iad.capture.internal.s.e;
                        int length2 = strArr6.length;
                        java.lang.String str4 = str3;
                        int i4 = i2;
                        while (i4 < length2) {
                            if (kotlin.text.StringsKt.equals(str2, strArr6[i4], z)) {
                                java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str4, "(", "", false, 4, (java.lang.Object) null), ")", "", false, 4, (java.lang.Object) null);
                                java.util.List<java.lang.String> split3 = new kotlin.text.Regex(",").split(replace$default, i2);
                                if (!split3.isEmpty()) {
                                    java.util.ListIterator<java.lang.String> listIterator3 = split3.listIterator(split3.size());
                                    while (listIterator3.hasPrevious()) {
                                        if (listIterator3.previous().length() != 0) {
                                            emptyList2 = kotlin.collections.CollectionsKt.take(split3, listIterator3.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                                java.lang.String[] strArr7 = (java.lang.String[]) emptyList2.toArray(new java.lang.String[i2]);
                                int length3 = strArr7.length;
                                while (true) {
                                    str4 = replace$default;
                                    if (i2 >= length3) {
                                        break;
                                    }
                                    java.lang.String[] strArr8 = strArr7;
                                    strArr2 = strArr;
                                    if (kotlin.text.StringsKt.equals(strArr7[i2], "rw", true)) {
                                        z2 = true;
                                        break;
                                    }
                                    i2++;
                                    replace$default = str4;
                                    strArr7 = strArr8;
                                    strArr = strArr2;
                                }
                            }
                            strArr2 = strArr;
                            i4++;
                            strArr = strArr2;
                            i2 = 0;
                            z = true;
                        }
                    }
                    i3++;
                    strArr = strArr;
                    i2 = 0;
                    z = true;
                    c = 2;
                }
            }
            str = android.os.Build.TAGS;
            if (str == null) {
                i = 2;
                process = null;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "test-keys", false, 2, (java.lang.Object) null)) {
                    z3 = true;
                    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                    java.lang.String[] strArr9 = new java.lang.String[i];
                    z4 = false;
                    strArr9[0] = "which";
                    z5 = true;
                    strArr9[1] = net.idrnd.face.iad.capture.internal.s.f7002a;
                    process2 = runtime.exec(strArr9);
                    if (new java.io.BufferedReader(new java.io.InputStreamReader(process2.getInputStream())).readLine() != null) {
                        z6 = true;
                        process2.destroy();
                        return (!objArr == true || objArr2 == true || a2 || z2 || z3 || z6 || a() || a("magisk") || this.b.a()) ? z5 : z4;
                    }
                    z6 = z4;
                    process2.destroy();
                    if (objArr == true) {
                    }
                }
            } else {
                i = 2;
                process = null;
            }
            z3 = false;
            java.lang.Runtime runtime2 = java.lang.Runtime.getRuntime();
            java.lang.String[] strArr92 = new java.lang.String[i];
            z4 = false;
            strArr92[0] = "which";
            z5 = true;
            strArr92[1] = net.idrnd.face.iad.capture.internal.s.f7002a;
            process2 = runtime2.exec(strArr92);
            if (new java.io.BufferedReader(new java.io.InputStreamReader(process2.getInputStream())).readLine() != null) {
            }
            z6 = z4;
            process2.destroy();
            if (objArr == true) {
            }
        }
        strArr = null;
        char c2 = 2;
        if (strArr != null) {
        }
        str = android.os.Build.TAGS;
        if (str == null) {
        }
        z3 = false;
        java.lang.Runtime runtime22 = java.lang.Runtime.getRuntime();
        java.lang.String[] strArr922 = new java.lang.String[i];
        z4 = false;
        strArr922[0] = "which";
        z5 = true;
        strArr922[1] = net.idrnd.face.iad.capture.internal.s.f7002a;
        process2 = runtime22.exec(strArr922);
        if (new java.io.BufferedReader(new java.io.InputStreamReader(process2.getInputStream())).readLine() != null) {
        }
        z6 = z4;
        process2.destroy();
        if (objArr == true) {
        }
    }

    public final void c() {
        net.idrnd.face.iad.capture.internal.y3.a();
    }

    public static boolean a(java.lang.String str) {
        java.lang.String str2 = net.idrnd.face.iad.capture.internal.s.f7002a;
        boolean z = false;
        for (java.lang.String str3 : net.idrnd.face.iad.capture.internal.r.b()) {
            if (new java.io.File(str3, str).exists()) {
                z = true;
            }
        }
        return z;
    }
}
