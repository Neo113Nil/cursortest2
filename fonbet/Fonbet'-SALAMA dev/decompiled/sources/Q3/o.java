package Q3;

import A1.AbstractC0021h;
import A1.C0043s0;
import A1.N;
import A1.P0;
import A1.R0;
import A1.v0;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.F;
import E3.L;
import E3.Q;
import E4.EnumC0172e;
import G4.Z;
import I2.J;
import K4.A;
import V3.X;
import V3.r0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.AbstractC0637f0;
import androidx.appcompat.widget.C0;
import androidx.appcompat.widget.C0665u;
import androidx.appcompat.widget.X0;
import androidx.lifecycle.C0747v;
import c2.D;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.firebase.auth.FirebaseAuth;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e3.C1023h;
import f4.C1091c;
import f4.H;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import n3.AbstractC1464a;
import q5.AbstractActivityC1559c;
import t1.C1604a;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public final class o implements InterfaceC1790b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5822a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5823b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5824c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5825d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5826e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5827f;

    public o(Context context, String str) {
        String concat;
        this.f5823b = context.getApplicationContext();
        this.f5822a = str;
        this.f5824c = new TreeMap();
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + n3.c.a(context).t(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = J.f3546b;
            J2.j.e("Unable to get package version name for reporting", e7);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f5827f = concat;
    }

    public static boolean b(int i7, int[] iArr) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static o c(String str, AbstractC0873i abstractC0873i, X x4, r0 r0Var, Integer num) {
        if (r0Var == r0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC0873i, x4, r0Var, num);
    }

    public static ColorStateList d(int i7, Context context) {
        int c3 = X0.c(R.attr.colorControlHighlight, context);
        int b7 = X0.b(R.attr.colorButtonNormal, context);
        int[] iArr = X0.f8580b;
        int[] iArr2 = X0.f8582d;
        int b8 = I.a.b(c3, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, X0.f8581c, X0.f8584f}, new int[]{b7, b8, I.a.b(c3, i7), i7});
    }

    public static D f(AbstractC0021h abstractC0021h, AbstractC0167z abstractC0167z, D d7, P0 p02) {
        int b7;
        N n2 = (N) abstractC0021h;
        R0 A7 = n2.A();
        n2.W();
        if (n2.f154b0.f585a.p()) {
            b7 = 0;
        } else {
            v0 v0Var = n2.f154b0;
            b7 = v0Var.f585a.b(v0Var.f586b.f10161a);
        }
        Object l7 = A7.p() ? null : A7.l(b7);
        int b8 = (n2.H() || A7.p()) ? -1 : A7.f(b7, p02, false).b(v2.t.E(n2.y()) - p02.f190e);
        for (int i7 = 0; i7 < abstractC0167z.size(); i7++) {
            D d8 = (D) abstractC0167z.get(i7);
            if (j(d8, l7, n2.H(), n2.v(), n2.w(), b8)) {
                return d8;
            }
        }
        if (abstractC0167z.isEmpty() && d7 != null) {
            if (j(d7, l7, n2.H(), n2.v(), n2.w(), b8)) {
                return d7;
            }
        }
        return null;
    }

    public static LayerDrawable g(C0 c0, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable c3 = c0.c(context, R.drawable.abc_star_black_48dp);
        Drawable c4 = c0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean j(D d7, Object obj, boolean z4, int i7, int i8, int i9) {
        if (!d7.f10161a.equals(obj)) {
            return false;
        }
        int i10 = d7.f10162b;
        return (z4 && i10 == i7 && d7.f10163c == i8) || (!z4 && i10 == -1 && d7.f10165e == i9);
    }

    public static void o(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter e7;
        int[] iArr = AbstractC0637f0.f8620a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0665u.f8746b;
        }
        PorterDuff.Mode mode2 = C0665u.f8746b;
        synchronized (C0665u.class) {
            e7 = C0.e(i7, mode);
        }
        mutate.setColorFilter(e7);
    }

    public void a(B1.m mVar, D d7, R0 r02) {
        if (d7 == null) {
            return;
        }
        if (r02.b(d7.f10161a) != -1) {
            mVar.o(d7, r02);
            return;
        }
        R0 r03 = (R0) ((Q) this.f5824c).get(d7);
        if (r03 != null) {
            mVar.o(d7, r03);
        }
    }

    public A e(int i7) {
        HashMap hashMap = (HashMap) this.f5823b;
        A a2 = (A) hashMap.get(Integer.valueOf(i7));
        if (a2 != null) {
            return a2;
        }
        A a4 = new A();
        hashMap.put(Integer.valueOf(i7), a4);
        return a4;
    }

    public ColorStateList h(int i7, Context context) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return G.h.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i7 == 2131165250) {
            return G.h.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return d(X0.c(R.attr.colorButtonNormal, context), context);
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return d(0, context);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return d(X0.c(R.attr.colorAccent, context), context);
            }
            if (i7 == 2131165245 || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return G.h.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (b(i7, (int[]) this.f5823b)) {
                return X0.d(R.attr.colorControlNormal, context);
            }
            if (b(i7, (int[]) this.f5826e)) {
                return G.h.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b(i7, (int[]) this.f5827f)) {
                return G.h.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return G.h.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d7 = X0.d(R.attr.colorSwitchThumbNormal, context);
        if (d7 == null || !d7.isStateful()) {
            iArr[0] = X0.f8580b;
            iArr2[0] = X0.b(R.attr.colorSwitchThumbNormal, context);
            iArr[1] = X0.f8583e;
            iArr2[1] = X0.c(R.attr.colorControlActivated, context);
            iArr[2] = X0.f8584f;
            iArr2[2] = X0.c(R.attr.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = X0.f8580b;
            iArr[0] = iArr3;
            iArr2[0] = d7.getColorForState(iArr3, 0);
            iArr[1] = X0.f8583e;
            iArr2[1] = X0.c(R.attr.colorControlActivated, context);
            iArr[2] = X0.f8584f;
            iArr2[2] = d7.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean i(int i7) {
        return l(i7) != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean k(int i7, String[] strArr, int[] iArr) {
        int i8;
        int i9 = 8;
        int i10 = 24;
        Iterator it = ((HashSet) this.f5823b).iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            t1.c cVar = (t1.c) it.next();
            if (i7 != i10) {
                cVar.f16278d = 0;
            } else if (cVar.f16279e != null) {
                if (strArr.length == 0 && iArr.length == 0) {
                    Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                } else {
                    List asList = Arrays.asList(strArr);
                    int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
                    if (indexOf >= 0) {
                        int m7 = p6.c.m(cVar.f16277c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
                        cVar.f16279e.put(36, Integer.valueOf(m7));
                        int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
                        if (indexOf2 >= 0) {
                            int m8 = p6.c.m(cVar.f16277c, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                            Integer valueOf = Integer.valueOf(m7);
                            Integer valueOf2 = Integer.valueOf(m8);
                            HashSet hashSet = new HashSet();
                            hashSet.add(valueOf);
                            hashSet.add(valueOf2);
                            Integer l7 = p6.c.l(hashSet);
                            cVar.f16279e.put(37, l7);
                            cVar.f16279e.put(0, l7);
                        }
                    }
                    int i11 = 0;
                    while (i11 < strArr.length) {
                        String str = strArr[i11];
                        if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                            int i12 = -1;
                            switch (str.hashCode()) {
                                case -2062386608:
                                    if (str.equals("android.permission.READ_SMS")) {
                                        i12 = 0;
                                        break;
                                    }
                                    break;
                                case -1928411001:
                                    if (str.equals("android.permission.READ_CALENDAR")) {
                                        i12 = 1;
                                        break;
                                    }
                                    break;
                                case -1925850455:
                                    if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                        i12 = 2;
                                        break;
                                    }
                                    break;
                                case -1921431796:
                                    if (str.equals("android.permission.READ_CALL_LOG")) {
                                        i12 = 3;
                                        break;
                                    }
                                    break;
                                case -1888586689:
                                    if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                        i12 = 4;
                                        break;
                                    }
                                    break;
                                case -1813079487:
                                    if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                        i12 = 5;
                                        break;
                                    }
                                    break;
                                case -1783097621:
                                    if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                        i12 = 6;
                                        break;
                                    }
                                    break;
                                case -1561629405:
                                    if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                        i12 = 7;
                                        break;
                                    }
                                    break;
                                case -1479758289:
                                    if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                        i12 = i9;
                                        break;
                                    }
                                    break;
                                case -1238066820:
                                    if (str.equals("android.permission.BODY_SENSORS")) {
                                        i12 = 9;
                                        break;
                                    }
                                    break;
                                case -1164582768:
                                    if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                        i12 = 10;
                                        break;
                                    }
                                    break;
                                case -909527021:
                                    if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                        i12 = 11;
                                        break;
                                    }
                                    break;
                                case -895679497:
                                    if (str.equals("android.permission.RECEIVE_MMS")) {
                                        i12 = 12;
                                        break;
                                    }
                                    break;
                                case -895673731:
                                    if (str.equals("android.permission.RECEIVE_SMS")) {
                                        i12 = 13;
                                        break;
                                    }
                                    break;
                                case -798669607:
                                    if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                        i12 = 14;
                                        break;
                                    }
                                    break;
                                case -406040016:
                                    if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                        i12 = 15;
                                        break;
                                    }
                                    break;
                                case -63024214:
                                    if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                        i12 = 16;
                                        break;
                                    }
                                    break;
                                case -5573545:
                                    if (str.equals("android.permission.READ_PHONE_STATE")) {
                                        i12 = 17;
                                        break;
                                    }
                                    break;
                                case 52602690:
                                    if (str.equals("android.permission.SEND_SMS")) {
                                        i12 = 18;
                                        break;
                                    }
                                    break;
                                case 112197485:
                                    if (str.equals("android.permission.CALL_PHONE")) {
                                        i12 = 19;
                                        break;
                                    }
                                    break;
                                case 175802396:
                                    if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                        i12 = 20;
                                        break;
                                    }
                                    break;
                                case 214526995:
                                    if (str.equals("android.permission.WRITE_CONTACTS")) {
                                        i12 = 21;
                                        break;
                                    }
                                    break;
                                case 361658321:
                                    if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                        i12 = 22;
                                        break;
                                    }
                                    break;
                                case 463403621:
                                    if (str.equals("android.permission.CAMERA")) {
                                        i12 = 23;
                                        break;
                                    }
                                    break;
                                case 603653886:
                                    if (str.equals("android.permission.WRITE_CALENDAR")) {
                                        i12 = 24;
                                        break;
                                    }
                                    break;
                                case 610633091:
                                    if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                        i12 = 25;
                                        break;
                                    }
                                    break;
                                case 691260818:
                                    if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                        i12 = 26;
                                        break;
                                    }
                                    break;
                                case 710297143:
                                    if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                        i12 = 27;
                                        break;
                                    }
                                    break;
                                case 784519842:
                                    if (str.equals("android.permission.USE_SIP")) {
                                        i12 = 28;
                                        break;
                                    }
                                    break;
                                case 970694249:
                                    if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                        i12 = 29;
                                        break;
                                    }
                                    break;
                                case 1166454870:
                                    if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                        i12 = 30;
                                        break;
                                    }
                                    break;
                                case 1271781903:
                                    if (str.equals("android.permission.GET_ACCOUNTS")) {
                                        i12 = 31;
                                        break;
                                    }
                                    break;
                                case 1365911975:
                                    if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                        i12 = 32;
                                        break;
                                    }
                                    break;
                                case 1777263169:
                                    if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                        i12 = 33;
                                        break;
                                    }
                                    break;
                                case 1780337063:
                                    if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                        i12 = 34;
                                        break;
                                    }
                                    break;
                                case 1831139720:
                                    if (str.equals("android.permission.RECORD_AUDIO")) {
                                        i12 = 35;
                                        break;
                                    }
                                    break;
                                case 1977429404:
                                    if (str.equals("android.permission.READ_CONTACTS")) {
                                        i12 = 36;
                                        break;
                                    }
                                    break;
                                case 2024715147:
                                    if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                        i12 = 37;
                                        break;
                                    }
                                    break;
                                case 2062356686:
                                    if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                        i12 = 38;
                                        break;
                                    }
                                    break;
                                case 2114579147:
                                    if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                        i12 = 39;
                                        break;
                                    }
                                    break;
                                case 2133799037:
                                    if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                        i12 = 40;
                                        break;
                                    }
                                    break;
                            }
                            switch (i12) {
                                case 0:
                                case 8:
                                case 12:
                                case 13:
                                case 18:
                                    i8 = 13;
                                    break;
                                case 1:
                                case 24:
                                    i8 = 0;
                                    break;
                                case 2:
                                    i8 = 17;
                                    break;
                                case 3:
                                case 10:
                                case 17:
                                case 19:
                                case 25:
                                case 28:
                                case 40:
                                    i8 = i9;
                                    break;
                                case 4:
                                case 16:
                                    i8 = 3;
                                    break;
                                case 5:
                                    i8 = 22;
                                    break;
                                case 6:
                                    i8 = 27;
                                    break;
                                case 7:
                                    i8 = 23;
                                    break;
                                case 9:
                                    i8 = 12;
                                    break;
                                case 11:
                                    i8 = 31;
                                    break;
                                case 14:
                                    i8 = 30;
                                    break;
                                case 15:
                                case 32:
                                    i8 = 15;
                                    break;
                                case 20:
                                    i8 = 9;
                                    break;
                                case zzbbd.zzt.zzm /* 21 */:
                                case 31:
                                case 36:
                                    i8 = 2;
                                    break;
                                case 22:
                                    i8 = 35;
                                    break;
                                case 23:
                                    i8 = 1;
                                    break;
                                case 26:
                                    i8 = 33;
                                    break;
                                case 27:
                                    i8 = 32;
                                    break;
                                case 29:
                                    i8 = 34;
                                    break;
                                case 30:
                                    i8 = 29;
                                    break;
                                case 33:
                                    i8 = 24;
                                    break;
                                case 34:
                                    i8 = 19;
                                    break;
                                case 35:
                                    i8 = 7;
                                    break;
                                case 37:
                                    i8 = 4;
                                    break;
                                case 38:
                                    i8 = 28;
                                    break;
                                case 39:
                                    i8 = 18;
                                    break;
                                default:
                                    i8 = 20;
                                    break;
                            }
                            if (i8 != 20) {
                                int i13 = iArr[i11];
                                if (i8 == i9) {
                                    Integer num = (Integer) cVar.f16279e.get(Integer.valueOf(i9));
                                    Integer valueOf3 = Integer.valueOf(p6.c.m(cVar.f16277c, str, i13));
                                    HashSet hashSet2 = new HashSet();
                                    hashSet2.add(num);
                                    hashSet2.add(valueOf3);
                                    cVar.f16279e.put(Integer.valueOf(i9), p6.c.l(hashSet2));
                                } else if (i8 == 7) {
                                    if (!cVar.f16279e.containsKey(7)) {
                                        cVar.f16279e.put(7, Integer.valueOf(p6.c.m(cVar.f16277c, str, i13)));
                                    }
                                    if (!cVar.f16279e.containsKey(14)) {
                                        cVar.f16279e.put(14, Integer.valueOf(p6.c.m(cVar.f16277c, str, i13)));
                                    }
                                } else if (i8 == 4) {
                                    int m9 = p6.c.m(cVar.f16277c, str, i13);
                                    if (!cVar.f16279e.containsKey(4)) {
                                        cVar.f16279e.put(4, Integer.valueOf(m9));
                                    }
                                } else {
                                    if (i8 == 3) {
                                        int m10 = p6.c.m(cVar.f16277c, str, i13);
                                        if (Build.VERSION.SDK_INT < 29 && !cVar.f16279e.containsKey(4)) {
                                            cVar.f16279e.put(4, Integer.valueOf(m10));
                                        }
                                        if (!cVar.f16279e.containsKey(5)) {
                                            cVar.f16279e.put(5, Integer.valueOf(m10));
                                        }
                                        cVar.f16279e.put(Integer.valueOf(i8), Integer.valueOf(m10));
                                    } else if (i8 == 9 || i8 == 32) {
                                        cVar.f16279e.put(Integer.valueOf(i8), Integer.valueOf(cVar.a(i8)));
                                    } else if (!cVar.f16279e.containsKey(Integer.valueOf(i8))) {
                                        cVar.f16279e.put(Integer.valueOf(i8), Integer.valueOf(p6.c.m(cVar.f16277c, str, i13)));
                                    }
                                    i11++;
                                    i9 = 8;
                                }
                            }
                        }
                        i11++;
                        i9 = 8;
                    }
                    int length = cVar.f16278d - iArr.length;
                    cVar.f16278d = length;
                    C1604a c1604a = cVar.f16276b;
                    if (c1604a != null && length == 0) {
                        c1604a.f16271a.success(cVar.f16279e);
                    }
                    z4 = true;
                    i10 = 24;
                    i9 = 8;
                }
            }
            if (z4) {
                z4 = true;
                i10 = 24;
                i9 = 8;
            } else {
                z4 = false;
                i10 = 24;
                i9 = 8;
            }
        }
        return z4;
    }

    public Z l(int i7) {
        A a2 = (A) ((HashMap) this.f5823b).get(Integer.valueOf(i7));
        if (a2 == null || a2.f3960a == 0) {
            return (Z) ((C0043s0) this.f5822a).f551a.get(Integer.valueOf(i7));
        }
        return null;
    }

    public void m(int i7, H4.h hVar, H4.k kVar) {
        if (i(i7)) {
            A e7 = e(i7);
            boolean l7 = ((C1023h) ((C0043s0) this.f5822a).f554d).a0(i7).f14775a.l(hVar);
            HashMap hashMap = e7.f3961b;
            if (l7) {
                EnumC0172e enumC0172e = EnumC0172e.f2174a;
                e7.f3962c = true;
                hashMap.put(hVar, enumC0172e);
            } else {
                e7.f3962c = true;
                hashMap.remove(hVar);
            }
            Set set = (Set) ((HashMap) this.f5825d).get(hVar);
            if (set == null) {
                set = new HashSet();
                ((HashMap) this.f5825d).put(hVar, set);
            }
            set.add(Integer.valueOf(i7));
            if (kVar != null) {
                ((HashMap) this.f5824c).put(hVar, kVar);
            }
        }
    }

    public void n(int i7) {
        HashMap hashMap = (HashMap) this.f5823b;
        p3.f.O("Should only reset active targets", hashMap.get(Integer.valueOf(i7)) != null && ((A) hashMap.get(Integer.valueOf(i7))).f3960a == 0, new Object[0]);
        hashMap.put(Integer.valueOf(i7), new A());
        Iterator it = ((C1023h) ((C0043s0) this.f5822a).f554d).a0(i7).iterator();
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return;
            } else {
                m(i7, (H4.h) f7.next(), null);
            }
        }
    }

    public void p(R0 r02) {
        B1.m mVar = new B1.m(4, 3);
        if (((AbstractC0167z) this.f5823b).isEmpty()) {
            a(mVar, (D) this.f5826e, r02);
            if (!AbstractC1464a.t((D) this.f5827f, (D) this.f5826e)) {
                a(mVar, (D) this.f5827f, r02);
            }
            if (!AbstractC1464a.t((D) this.f5825d, (D) this.f5826e) && !AbstractC1464a.t((D) this.f5825d, (D) this.f5827f)) {
                a(mVar, (D) this.f5825d, r02);
            }
        } else {
            for (int i7 = 0; i7 < ((AbstractC0167z) this.f5823b).size(); i7++) {
                a(mVar, (D) ((AbstractC0167z) this.f5823b).get(i7), r02);
            }
            if (!((AbstractC0167z) this.f5823b).contains((D) this.f5825d)) {
                a(mVar, (D) this.f5825d, r02);
            }
        }
        this.f5824c = mVar.i();
    }

    public Task q(String str, Boolean bool) {
        Task t7;
        if (zzag.zzc(str)) {
            str = "*";
        }
        if (!bool.booleanValue() && (t7 = t(str)) != null) {
            return t7;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f5826e;
        return firebaseAuth.f11853e.zza(firebaseAuth.f11858k, "RECAPTCHA_ENTERPRISE").continueWithTask(new w(4, (Object) this, (Object) str, false));
    }

    public Task r(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        if (zzag.zzc(str)) {
            str = "*";
        }
        Task t7 = t(str);
        if (bool.booleanValue() || t7 == null) {
            t7 = q(str, bool);
        }
        return t7.continueWithTask(new C1091c(recaptchaAction, 4));
    }

    public boolean s() {
        String zzb;
        zzagm zzagmVar = (zzagm) this.f5824c;
        if (zzagmVar == null || (zzb = zzagmVar.zzb("PHONE_PROVIDER")) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }

    public Task t(String str) {
        Task task;
        synchronized (this.f5822a) {
            task = (Task) ((HashMap) this.f5823b).get(str);
        }
        return task;
    }

    public o(Y3.i iVar, FirebaseAuth firebaseAuth) {
        H h6 = new H();
        this.f5822a = new Object();
        this.f5823b = new HashMap();
        this.f5825d = iVar;
        this.f5826e = firebaseAuth;
        this.f5827f = h6;
    }

    public o(String str, AbstractC0873i abstractC0873i, X x4, r0 r0Var, Integer num) {
        this.f5822a = str;
        this.f5823b = t.b(str);
        this.f5824c = abstractC0873i;
        this.f5825d = x4;
        this.f5826e = r0Var;
        this.f5827f = num;
    }

    public o() {
        this.f5822a = new int[]{2131165260, 2131165258, 2131165184};
        this.f5823b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f5824c = new int[]{2131165257, 2131165259, 2131165201, R.drawable.abc_text_cursor_material, 2131165254, 2131165255, 2131165256};
        this.f5825d = new int[]{2131165233, R.drawable.abc_cab_background_internal_bg, 2131165232};
        this.f5826e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f5827f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public o(H4.f fVar, C0043s0 c0043s0) {
        this.f5823b = new HashMap();
        this.f5824c = new HashMap();
        this.f5825d = new HashMap();
        this.f5826e = new HashMap();
        this.f5827f = fVar;
        this.f5822a = c0043s0;
    }

    public o(AbstractActivityC1559c abstractActivityC1559c, C0747v c0747v) {
        this.f5823b = new HashSet();
        this.f5824c = new HashSet();
        this.f5825d = new HashSet();
        this.f5826e = new HashSet();
        new HashSet();
        this.f5827f = new HashSet();
        this.f5822a = abstractActivityC1559c;
        new HiddenLifecycleReference(c0747v);
    }

    public o(P0 p02) {
        this.f5822a = p02;
        C0165x c0165x = AbstractC0167z.f2083b;
        this.f5823b = L.f2000e;
        this.f5824c = Q.f2012x;
    }
}
