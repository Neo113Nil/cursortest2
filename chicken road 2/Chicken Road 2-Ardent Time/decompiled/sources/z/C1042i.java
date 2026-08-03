package z;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042i implements a1.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f8518a;

    public /* synthetic */ C1042i(java.lang.Object obj) {
        this.f8518a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    @Override // a1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(x0.e eVar, Z0.j jVar) {
        char c2;
        Z0.d a2;
        java.lang.CharSequence l2;
        android.content.ClipDescription primaryClipDescription;
        x0.e eVar2 = (x0.e) this.f8518a;
        if (((Z0.h) eVar2.f8410c) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) eVar.f8409b;
        try {
            boolean z2 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            java.lang.Object obj = eVar.f8410c;
            switch (c2) {
                case 0:
                    try {
                        int c3 = B1.a.c((java.lang.String) obj);
                        io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b;
                        if (c3 == 1) {
                            eVar3.f7746a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            eVar3.getClass();
                        }
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException e2) {
                        jVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((Z0.h) eVar2.f8410c).z(B1.a.b((java.lang.String) obj));
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException e3) {
                        jVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).f7746a.setRequestedOrientation(x0.e.h(eVar2, (org.json.JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException | org.json.JSONException e4) {
                        jVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        java.lang.String string = jSONObject.getString("label");
                        Z0.h hVar = (Z0.h) eVar2.f8410c;
                        int i3 = android.os.Build.VERSION.SDK_INT;
                        P0.AbstractActivityC0047e abstractActivityC0047e = ((io.flutter.plugin.platform.e) hVar.f1903b).f7746a;
                        if (i3 < 28) {
                            abstractActivityC0047e.setTaskDescription(new android.app.ActivityManager.TaskDescription(string, (android.graphics.Bitmap) null, i2));
                        } else {
                            abstractActivityC0047e.setTaskDescription(F0.e.d(i2, string));
                        }
                        jVar.c(null);
                        return;
                    } catch (org.json.JSONException e5) {
                        jVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((Z0.h) eVar2.f8410c).w(x0.e.j(eVar2, (org.json.JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException | org.json.JSONException e6) {
                        jVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((Z0.h) eVar2.f8410c).x(x0.e.k(eVar2, (java.lang.String) obj));
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException | org.json.JSONException e7) {
                        jVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b;
                    android.view.View decorView = eVar4.f7746a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar4, decorView));
                    jVar.c(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).b();
                    jVar.c(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).a(x0.e.l(eVar2, (org.json.JSONObject) obj));
                        jVar.c(null);
                        return;
                    } catch (java.lang.NoSuchFieldException | org.json.JSONException e8) {
                        jVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    P0.AbstractActivityC0047e abstractActivityC0047e2 = ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).f7748c;
                    if (abstractActivityC0047e2 != null) {
                        abstractActivityC0047e2.i(booleanValue);
                    }
                    jVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.e eVar5 = (io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b;
                    P0.AbstractActivityC0047e abstractActivityC0047e3 = eVar5.f7748c;
                    P0.AbstractActivityC0047e abstractActivityC0047e4 = eVar5.f7746a;
                    if (abstractActivityC0047e4 instanceof b.b) {
                        ((b.AbstractDialogC0090a) ((b.b) abstractActivityC0047e4)).getClass();
                        throw null;
                    }
                    abstractActivityC0047e4.finish();
                    jVar.c(null);
                    return;
                case 11:
                    java.lang.String str2 = (java.lang.String) obj;
                    if (str2 != null) {
                        try {
                            a2 = Z0.d.a(str2);
                        } catch (java.lang.NoSuchFieldException unused) {
                            jVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        l2 = ((Z0.h) eVar2.f8410c).l(a2);
                        if (l2 != null) {
                            jVar.c(null);
                            return;
                        }
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("text", l2);
                        jVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    l2 = ((Z0.h) eVar2.f8410c).l(a2);
                    if (l2 != null) {
                    }
                case '\f':
                    ((android.content.ClipboardManager) ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).f7746a.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", ((org.json.JSONObject) obj).getString("text")));
                    jVar.c(null);
                    return;
                case '\r':
                    android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) ((io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b).f7746a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("value", z2);
                    jVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar6 = (io.flutter.plugin.platform.e) ((Z0.h) eVar2.f8410c).f1903b;
                    eVar6.getClass();
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (java.lang.String) obj);
                    eVar6.f7746a.startActivity(android.content.Intent.createChooser(intent, null));
                    jVar.c(null);
                    return;
                default:
                    jVar.b();
                    return;
            }
        } catch (org.json.JSONException e9) {
            jVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        jVar.a("error", "JSON error: " + e9.getMessage(), null);
    }
}
