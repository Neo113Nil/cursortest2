package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0902y5 implements InterfaceC0289hk {

    /* JADX INFO: renamed from: a */
    public Object f9154a;

    /* JADX INFO: renamed from: b */
    public Object f9155b;

    /* JADX INFO: renamed from: c */
    public Object f9156c;

    /* JADX INFO: renamed from: d */
    public Object f9157d;

    /* JADX INFO: renamed from: e */
    public Object f9158e;

    /* JADX INFO: renamed from: f */
    public Object f9159f;

    public C0902y5(InterfaceC0350j8 interfaceC0350j8) {
        this.f9155b = new AtomicLong(-9223372034707292160L);
        this.f9156c = new AtomicReference(null);
        this.f9157d = new AtomicReference(null);
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        this.f9158e = new w61(enumC0113ct);
        g71 g71Var = new g71();
        this.f9159f = g71Var;
        j92 j92Var = new j92();
        j92Var.f3862k = interfaceC0350j8;
        j92Var.f3863l = enumC0113ct;
        this.f9154a = j92Var;
        g71Var.mo995c(j92Var, enumC0113ct);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m5726j(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static ColorStateList m5727l(Context context, int i) {
        int iM5878c = zc1.m5878c(context, R.attr.colorControlHighlight);
        int iM5877b = zc1.m5877b(context, R.attr.colorButtonNormal);
        int[] iArr = zc1.f9735b;
        int[] iArr2 = zc1.f9737d;
        int iM4923b = AbstractC0767ui.m4923b(iM5878c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, zc1.f9736c, zc1.f9739f}, new int[]{iM5877b, iM4923b, AbstractC0767ui.m4923b(iM5878c, i), i});
    }

    /* JADX INFO: renamed from: n */
    public static LayerDrawable m5728n(f21 f21Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM1579c = f21Var.m1579c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM1579c2 = f21Var.m1579c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM1579c instanceof BitmapDrawable) && drawableM1579c.getIntrinsicWidth() == dimensionPixelSize && drawableM1579c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM1579c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM1579c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM1579c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM1579c2 instanceof BitmapDrawable) && drawableM1579c2.getIntrinsicWidth() == dimensionPixelSize && drawableM1579c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM1579c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM1579c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM1579c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: q */
    public static void m5729q(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1577e;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0939z5.f9605b;
        }
        PorterDuff.Mode mode2 = C0939z5.f9605b;
        synchronized (C0939z5.class) {
            porterDuffColorFilterM1577e = f21.m1577e(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM1577e);
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: a */
    public Object mo2281a(Class cls) {
        if (!((Set) this.f9154a).contains(cz0.m1050a(cls))) {
            dd0.m1165k(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objMo2281a = ((InterfaceC0289hk) this.f9159f).mo2281a(cls);
        if (!cls.equals(wy0.class)) {
            return objMo2281a;
        }
        return new m21();
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: b */
    public tu0 mo2282b() {
        return mo2286f(cz0.m1050a(InterfaceC0826w3.class));
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: c */
    public my0 mo2283c(cz0 cz0Var) {
        if (((Set) this.f9158e).contains(cz0Var)) {
            return ((InterfaceC0289hk) this.f9159f).mo2283c(cz0Var);
        }
        dd0.m1165k(cz0Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: d */
    public Set mo2284d(cz0 cz0Var) {
        if (((Set) this.f9157d).contains(cz0Var)) {
            return ((InterfaceC0289hk) this.f9159f).mo2284d(cz0Var);
        }
        dd0.m1165k(cz0Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: e */
    public my0 mo2285e(Class cls) {
        return mo2287g(cz0.m1050a(cls));
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: f */
    public tu0 mo2286f(cz0 cz0Var) {
        if (((Set) this.f9156c).contains(cz0Var)) {
            return ((InterfaceC0289hk) this.f9159f).mo2286f(cz0Var);
        }
        dd0.m1165k(cz0Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: g */
    public my0 mo2287g(cz0 cz0Var) {
        if (((Set) this.f9155b).contains(cz0Var)) {
            return ((InterfaceC0289hk) this.f9159f).mo2287g(cz0Var);
        }
        dd0.m1165k(cz0Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: h */
    public Object mo2288h(cz0 cz0Var) {
        if (((Set) this.f9154a).contains(cz0Var)) {
            return ((InterfaceC0289hk) this.f9159f).mo2288h(cz0Var);
        }
        dd0.m1165k(cz0Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m5730i(String str, String str2) {
        HashMap map = (HashMap) this.f9159f;
        if (map != null) {
            map.put(str, str2);
        } else {
            C0270h1.m2191g("Property \"autoMetadata\" has not been set");
        }
    }

    /* JADX INFO: renamed from: k */
    public C0869x9 m5731k() {
        String strConcat = ((String) this.f9154a) == null ? " transportName" : "";
        if (((C0596pw) this.f9156c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f9157d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f9158e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f9159f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new C0869x9((String) this.f9154a, (Integer) this.f9155b, (C0596pw) this.f9156c, ((Long) this.f9157d).longValue(), ((Long) this.f9158e).longValue(), (HashMap) this.f9159f);
        }
        C0270h1.m2191g("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public v92 m5732m(v92 v92Var) {
        return v92Var.m5128d(new fn0(), new C0042ay(this));
    }

    /* JADX INFO: renamed from: o */
    public ColorStateList m5733o(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return j22.m2806o(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165252) {
            return j22.m2806o(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m5727l(context, zc1.m5878c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m5727l(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m5727l(context, zc1.m5878c(context, R.attr.colorAccent));
            }
            if (i == 2131165247 || i == R.drawable.abc_spinner_textfield_background_material) {
                return j22.m2806o(context, R.color.abc_tint_spinner);
            }
            if (m5726j((int[]) this.f9155b, i)) {
                return zc1.m5879d(context, R.attr.colorControlNormal);
            }
            if (m5726j((int[]) this.f9158e, i)) {
                return j22.m2806o(context, R.color.abc_tint_default);
            }
            if (m5726j((int[]) this.f9159f, i)) {
                return j22.m2806o(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return j22.m2806o(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM5879d = zc1.m5879d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM5879d == null || !colorStateListM5879d.isStateful()) {
            iArr[0] = zc1.f9735b;
            iArr2[0] = zc1.m5877b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = zc1.f9738e;
            iArr2[1] = zc1.m5878c(context, R.attr.colorControlActivated);
            iArr[2] = zc1.f9739f;
            iArr2[2] = zc1.m5878c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = zc1.f9735b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM5879d.getColorForState(iArr3, 0);
            iArr[1] = zc1.f9738e;
            iArr2[1] = zc1.m5878c(context, R.attr.colorControlActivated);
            iArr[2] = zc1.f9739f;
            iArr2[2] = colorStateListM5879d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: p */
    public void m5734p(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zM1152e;
        int i2;
        PackageInfo packageInfoM3402i;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        w00 w00Var = (w00) this.f9154a;
        w00Var.m5224a();
        bundle.putString("gmp_app_id", w00Var.f8320c.f6651b);
        C0475mm c0475mm = (C0475mm) this.f9155b;
        synchronized (c0475mm) {
            try {
                if (c0475mm.f5091c == 0 && (packageInfoM3402i = c0475mm.m3402i("com.google.android.gms")) != null) {
                    c0475mm.f5091c = packageInfoM3402i.versionCode;
                }
                i = c0475mm.f5091c;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C0475mm) this.f9155b).m3401g());
        C0475mm c0475mm2 = (C0475mm) this.f9155b;
        synchronized (c0475mm2) {
            try {
                if (((String) c0475mm2.f5094f) == null) {
                    c0475mm2.m3404k();
                }
                str3 = (String) c0475mm2.f5094f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        w00 w00Var2 = (w00) this.f9154a;
        w00Var2.m5224a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(w00Var2.f8319b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((C0091ca) hn0.m2310a(((l10) ((m10) this.f9159f)).m3142d())).f1178a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) hn0.m2310a(((l10) ((m10) this.f9159f)).m3141c()));
        bundle.putString("cliv", "fcm-25.0.2");
        ya0 ya0Var = (ya0) ((my0) this.f9158e).get();
        C0517nr c0517nr = (C0517nr) ((my0) this.f9157d).get();
        if (ya0Var == null || c0517nr == null) {
            return;
        }
        C0553oq c0553oq = (C0553oq) ya0Var;
        synchronized (c0553oq) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            final db0 db0Var = (db0) c0553oq.f5831a.get();
            synchronized (db0Var) {
                zM1152e = db0Var.m1152e(db0.f1609b, jCurrentTimeMillis);
            }
            if (zM1152e) {
                synchronized (db0Var) {
                    final String strM1149b = db0Var.m1149b(System.currentTimeMillis());
                    db0Var.f1612a.m5324a(new h60() { // from class: bb0
                        @Override // p000.h60
                        /* JADX INFO: renamed from: i */
                        public final Object mo170i(Object obj) {
                            zq0 zq0Var = (zq0) obj;
                            rw0 rw0Var = db0.f1611d;
                            String str5 = strM1149b;
                            zq0Var.m6024c(rw0Var, str5);
                            db0Var.m1151d(zq0Var, str5);
                            return null;
                        }
                    });
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC0024an.m292o(i2)));
            bundle.putString("Firebase-Client", c0517nr.m3583a());
        }
    }

    /* JADX INFO: renamed from: r */
    public v92 m5735r(String str, String str2, Bundle bundle) {
        int i;
        try {
            m5734p(str, str2, bundle);
            w31 w31Var = (w31) this.f9156c;
            iw1 iw1Var = iw1.f3685l;
            C0392kd c0392kd = w31Var.f8361c;
            if (c0392kd.m3006a() >= 12000000) {
                g92 g92VarM2004d = g92.m2004d(w31Var.f8360b);
                synchronized (g92VarM2004d) {
                    i = g92VarM2004d.f2671j;
                    g92VarM2004d.f2671j = i + 1;
                }
                return g92VarM2004d.m2008e(new a82(i, 1, bundle, 1)).m5128d(iw1Var, wa0.f8477q);
            }
            if (c0392kd.m3007b() != 0) {
                return w31Var.m5231a(bundle).m5129e(iw1Var, new a81(w31Var, bundle, 28, false));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            v92 v92Var = new v92();
            v92Var.m5136l(iOException);
            return v92Var;
        } catch (InterruptedException | ExecutionException e) {
            v92 v92Var2 = new v92();
            v92Var2.m5136l(e);
            return v92Var2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public AbstractC0269h0 m5736s() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFutureM2990a;
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        g71 g71Var = (g71) this.f9159f;
        if (g71Var.isDone()) {
            return g71Var;
        }
        do {
            atomicLong = (AtomicLong) this.f9155b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f9157d;
        g71 g71Var2 = new g71();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(g71Var2);
        if (listenableFuture == null) {
            a81 a81VarM2841a = ja2.m2841a(new C0678s3(i, this));
            ve1 ve1Var = new ve1();
            ve1Var.f8186r = new ue1(ve1Var, a81VarM2841a);
            enumC0113ct.execute(ve1Var);
            listenableFutureM2990a = ve1Var;
        } else {
            InterfaceC0387k8 interfaceC0387k8 = new InterfaceC0387k8() { // from class: k92
                @Override // p000.InterfaceC0387k8
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f4319a.m5740w(i);
                }
            };
            int i2 = ja2.f3889a;
            listenableFutureM2990a = k70.m2990a(listenableFuture, Throwable.class, new n72(4, s92.m4509a(), interfaceC0387k8), (w61) this.f9158e);
        }
        g71Var2.m2179n(listenableFutureM2990a);
        l92 l92Var = new l92(this, i);
        g71Var2.mo995c(new RunnableC0702sr(this, g71Var2, l92Var, 18, false), enumC0113ct);
        return l92Var;
    }

    /* JADX INFO: renamed from: t */
    public void m5737t(String str) {
        o80.m3642E(l82.f4712a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        o80.m3642E(!l82.f4714c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f9156c = str;
    }

    /* JADX INFO: renamed from: u */
    public void m5738u(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = l82.f4712a;
        this.f9158e = str;
    }

    /* JADX INFO: renamed from: v */
    public Uri m5739v() {
        String strM286i;
        String strConcat;
        String str = (String) this.f9155b;
        String str2 = (String) this.f9156c;
        Account account = h82.f3126a;
        Account account2 = (Account) this.f9157d;
        o80.m3642E(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        o80.m3642E(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        o80.m3642E(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (h82.f3126a.equals(account2)) {
            strM286i = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM286i = AbstractC0024an.m286i(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f9158e;
        StringBuilder sb = new StringBuilder(strM286i.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(strM286i);
        sb.append("/");
        sb.append(str5);
        String string = sb.toString();
        q01 q01VarM3374d = ((mc0) this.f9159f).m3374d();
        Pattern pattern = t82.f7355a;
        if (q01VarM3374d.isEmpty()) {
            strConcat = null;
        } else {
            g72 g72Var = new g72("+");
            Iterator it = q01VarM3374d.iterator();
            StringBuilder sb2 = new StringBuilder();
            g72Var.m1993a(sb2, it);
            strConcat = "transform=".concat(sb2.toString());
        }
        return new Uri.Builder().scheme("android").authority((String) this.f9154a).path(string).encodedFragment(strConcat).build();
    }

    /* JADX INFO: renamed from: w */
    public AbstractC0269h0 m5740w(int i) {
        EnumC0113ct enumC0113ct;
        AtomicLong atomicLong = (AtomicLong) this.f9155b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            hc0 hc0Var = hc0.f3163q;
            return hc0Var != null ? hc0Var : new hc0();
        }
        m92 m92Var = new m92(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f9156c;
            m92 m92Var2 = (m92) atomicReference.get();
            if (m92Var2 != null && m92Var2.f5014q > i) {
                hc0 hc0Var2 = hc0.f3163q;
                return hc0Var2 != null ? hc0Var2 : new hc0();
            }
            do {
                if (atomicReference.compareAndSet(m92Var2, m92Var)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        m92Var.cancel(true);
                        while (!atomicReference.compareAndSet(m92Var, null) && atomicReference.get() == m92Var) {
                        }
                        return m92Var;
                    }
                    j92 j92Var = (j92) this.f9154a;
                    InterfaceC0350j8 interfaceC0350j8 = (InterfaceC0350j8) j92Var.f3862k;
                    if (interfaceC0350j8 == null || (enumC0113ct = (EnumC0113ct) j92Var.f3863l) == null) {
                        m92Var.m2179n((g71) this.f9159f);
                        return m92Var;
                    }
                    a81 a81VarM2841a = ja2.m2841a(interfaceC0350j8);
                    ve1 ve1Var = new ve1();
                    ve1Var.f8186r = new ue1(ve1Var, a81VarM2841a);
                    enumC0113ct.execute(ve1Var);
                    m92Var.m2179n(ve1Var);
                    return m92Var;
                }
            } while (atomicReference.get() == m92Var2);
        }
    }

    public /* synthetic */ C0902y5(Context context) {
        this.f9155b = "files";
        this.f9156c = "common";
        this.f9157d = l82.f4713b;
        this.f9158e = "";
        this.f9159f = qc0.m4056l();
        o80.m3642E(context != null, "Context cannot be null", new Object[0]);
        this.f9154a = context.getPackageName();
    }

    public C0902y5(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f9154a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f9156c = str;
        this.f9157d = str2;
        this.f9158e = v71.f8126b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f9155b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw AbstractC0024an.m280c(it);
    }
}
