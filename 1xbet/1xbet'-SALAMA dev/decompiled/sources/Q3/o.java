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
import androidx.appcompat.widget.AbstractC0616f0;
import androidx.appcompat.widget.C0;
import androidx.appcompat.widget.C0644u;
import androidx.appcompat.widget.X0;
import androidx.lifecycle.C0726v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.firebase.auth.FirebaseAuth;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p018c2.D;
import p042f4.C0894c;
import p042f4.H;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements p164x5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5827f;

    public o(Context context, String str) {
        String strConcat;
        this.f5823b = context.getApplicationContext();
        this.f5822a = str;
        this.f5824c = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + p097n3.c.a(context).t(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = J.f3546b;
            J2.j.e("Unable to get package version name for reporting", e7);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f5827f = strConcat;
    }

    public static boolean b(int i7, int[] iArr) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static o c(String str, AbstractC0829i abstractC0829i, X x4, r0 r0Var, Integer num) throws GeneralSecurityException {
        if (r0Var == r0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC0829i, x4, r0Var, num);
    }

    public static ColorStateList d(int i7, Context context) {
        int iC = X0.c(R.attr.colorControlHighlight, context);
        int iB = X0.b(R.attr.colorButtonNormal, context);
        int[] iArr = X0.f8580b;
        int[] iArr2 = X0.f8582d;
        int iB2 = I.a.b(iC, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, X0.f8581c, X0.f8584f}, new int[]{iB, iB2, I.a.b(iC, i7), i7});
    }

    public static D f(AbstractC0021h abstractC0021h, AbstractC0167z abstractC0167z, D d7, P0 p5) {
        int iB;
        N n2 = (N) abstractC0021h;
        R0 r0A = n2.A();
        n2.W();
        if (n2.f154b0.f585a.p()) {
            iB = 0;
        } else {
            v0 v0Var = n2.f154b0;
            iB = v0Var.f585a.b(v0Var.f586b.f10161a);
        }
        Object objL = r0A.p() ? null : r0A.l(iB);
        int iB2 = (n2.H() || r0A.p()) ? -1 : r0A.f(iB, p5, false).b(p151v2.t.E(n2.y()) - p5.f190e);
        for (int i7 = 0; i7 < abstractC0167z.size(); i7++) {
            D d8 = (D) abstractC0167z.get(i7);
            if (j(d8, objL, n2.H(), n2.v(), n2.w(), iB2)) {
                return d8;
            }
        }
        if (abstractC0167z.isEmpty() && d7 != null) {
            if (j(d7, objL, n2.H(), n2.v(), n2.w(), iB2)) {
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
        Drawable drawableC = c0.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = c0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
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
        PorterDuffColorFilter porterDuffColorFilterE;
        int[] iArr = AbstractC0616f0.f8620a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0644u.f8746b;
        }
        PorterDuff.Mode mode2 = C0644u.f8746b;
        synchronized (C0644u.class) {
            porterDuffColorFilterE = C0.e(i7, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public void a(B1.m mVar, D d7, R0 r7) {
        if (d7 == null) {
            return;
        }
        if (r7.b(d7.f10161a) != -1) {
            mVar.o(d7, r7);
            return;
        }
        R0 r8 = (R0) ((Q) this.f5824c).get(d7);
        if (r8 != null) {
            mVar.o(d7, r8);
        }
    }

    public A e(int i7) {
        HashMap map = (HashMap) this.f5823b;
        A a2 = (A) map.get(Integer.valueOf(i7));
        if (a2 != null) {
            return a2;
        }
        A a4 = new A();
        map.put(Integer.valueOf(i7), a4);
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
        ColorStateList colorStateListD = X0.d(R.attr.colorSwitchThumbNormal, context);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = X0.f8580b;
            iArr2[0] = X0.b(R.attr.colorSwitchThumbNormal, context);
            iArr[1] = X0.f8583e;
            iArr2[1] = X0.c(R.attr.colorControlActivated, context);
            iArr[2] = X0.f8584f;
            iArr2[2] = X0.c(R.attr.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = X0.f8580b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = X0.f8583e;
            iArr2[1] = X0.c(R.attr.colorControlActivated, context);
            iArr[2] = X0.f8584f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean i(int i7) {
        return l(i7) != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean k(int i7, String[] strArr, int[] iArr) {
        int i8;
        int i9 = 8;
        int i10 = 24;
        boolean z4 = false;
        for (p138t1.c cVar : (HashSet) this.f5823b) {
            if (i7 != i10) {
                cVar.f16284d = 0;
            } else {
                if (cVar.f16285e != null) {
                    if (strArr.length == 0 && iArr.length == 0) {
                        Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                    } else {
                        List listAsList = Arrays.asList(strArr);
                        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
                        if (iIndexOf >= 0) {
                            int iM = p115p6.c.m(cVar.f16283c, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
                            cVar.f16285e.put(36, Integer.valueOf(iM));
                            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
                            if (iIndexOf2 >= 0) {
                                int iM2 = p115p6.c.m(cVar.f16283c, "android.permission.READ_CALENDAR", iArr[iIndexOf2]);
                                Integer numValueOf = Integer.valueOf(iM);
                                Integer numValueOf2 = Integer.valueOf(iM2);
                                HashSet hashSet = new HashSet();
                                hashSet.add(numValueOf);
                                hashSet.add(numValueOf2);
                                Integer numL = p115p6.c.l(hashSet);
                                cVar.f16285e.put(37, numL);
                                cVar.f16285e.put(0, numL);
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
                                        }
                                        break;
                                    case -1928411001:
                                        if (str.equals("android.permission.READ_CALENDAR")) {
                                            i12 = 1;
                                        }
                                        break;
                                    case -1925850455:
                                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                            i12 = 2;
                                        }
                                        break;
                                    case -1921431796:
                                        if (str.equals("android.permission.READ_CALL_LOG")) {
                                            i12 = 3;
                                        }
                                        break;
                                    case -1888586689:
                                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                            i12 = 4;
                                        }
                                        break;
                                    case -1813079487:
                                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                            i12 = 5;
                                        }
                                        break;
                                    case -1783097621:
                                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                            i12 = 6;
                                        }
                                        break;
                                    case -1561629405:
                                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                            i12 = 7;
                                        }
                                        break;
                                    case -1479758289:
                                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                            i12 = i9;
                                        }
                                        break;
                                    case -1238066820:
                                        if (str.equals("android.permission.BODY_SENSORS")) {
                                            i12 = 9;
                                        }
                                        break;
                                    case -1164582768:
                                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                            i12 = 10;
                                        }
                                        break;
                                    case -909527021:
                                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                            i12 = 11;
                                        }
                                        break;
                                    case -895679497:
                                        if (str.equals("android.permission.RECEIVE_MMS")) {
                                            i12 = 12;
                                        }
                                        break;
                                    case -895673731:
                                        if (str.equals("android.permission.RECEIVE_SMS")) {
                                            i12 = 13;
                                        }
                                        break;
                                    case -798669607:
                                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                            i12 = 14;
                                        }
                                        break;
                                    case -406040016:
                                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                            i12 = 15;
                                        }
                                        break;
                                    case -63024214:
                                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                            i12 = 16;
                                        }
                                        break;
                                    case -5573545:
                                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                                            i12 = 17;
                                        }
                                        break;
                                    case 52602690:
                                        if (str.equals("android.permission.SEND_SMS")) {
                                            i12 = 18;
                                        }
                                        break;
                                    case 112197485:
                                        if (str.equals("android.permission.CALL_PHONE")) {
                                            i12 = 19;
                                        }
                                        break;
                                    case 175802396:
                                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                            i12 = 20;
                                        }
                                        break;
                                    case 214526995:
                                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                                            i12 = 21;
                                        }
                                        break;
                                    case 361658321:
                                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                            i12 = 22;
                                        }
                                        break;
                                    case 463403621:
                                        if (str.equals("android.permission.CAMERA")) {
                                            i12 = 23;
                                        }
                                        break;
                                    case 603653886:
                                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                                            i12 = 24;
                                        }
                                        break;
                                    case 610633091:
                                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                            i12 = 25;
                                        }
                                        break;
                                    case 691260818:
                                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                            i12 = 26;
                                        }
                                        break;
                                    case 710297143:
                                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                            i12 = 27;
                                        }
                                        break;
                                    case 784519842:
                                        if (str.equals("android.permission.USE_SIP")) {
                                            i12 = 28;
                                        }
                                        break;
                                    case 970694249:
                                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                            i12 = 29;
                                        }
                                        break;
                                    case 1166454870:
                                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                            i12 = 30;
                                        }
                                        break;
                                    case 1271781903:
                                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                                            i12 = 31;
                                        }
                                        break;
                                    case 1365911975:
                                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                            i12 = 32;
                                        }
                                        break;
                                    case 1777263169:
                                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                            i12 = 33;
                                        }
                                        break;
                                    case 1780337063:
                                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                            i12 = 34;
                                        }
                                        break;
                                    case 1831139720:
                                        if (str.equals("android.permission.RECORD_AUDIO")) {
                                            i12 = 35;
                                        }
                                        break;
                                    case 1977429404:
                                        if (str.equals("android.permission.READ_CONTACTS")) {
                                            i12 = 36;
                                        }
                                        break;
                                    case 2024715147:
                                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                            i12 = 37;
                                        }
                                        break;
                                    case 2062356686:
                                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                            i12 = 38;
                                        }
                                        break;
                                    case 2114579147:
                                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                            i12 = 39;
                                        }
                                        break;
                                    case 2133799037:
                                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                            i12 = 40;
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
                                        Integer num = (Integer) cVar.f16285e.get(Integer.valueOf(i9));
                                        Integer numValueOf3 = Integer.valueOf(p115p6.c.m(cVar.f16283c, str, i13));
                                        HashSet hashSet2 = new HashSet();
                                        hashSet2.add(num);
                                        hashSet2.add(numValueOf3);
                                        cVar.f16285e.put(Integer.valueOf(i9), p115p6.c.l(hashSet2));
                                    } else if (i8 == 7) {
                                        if (!cVar.f16285e.containsKey(7)) {
                                            cVar.f16285e.put(7, Integer.valueOf(p115p6.c.m(cVar.f16283c, str, i13)));
                                        }
                                        if (!cVar.f16285e.containsKey(14)) {
                                            cVar.f16285e.put(14, Integer.valueOf(p115p6.c.m(cVar.f16283c, str, i13)));
                                        }
                                    } else if (i8 == 4) {
                                        int iM3 = p115p6.c.m(cVar.f16283c, str, i13);
                                        if (!cVar.f16285e.containsKey(4)) {
                                            cVar.f16285e.put(4, Integer.valueOf(iM3));
                                        }
                                    } else if (i8 == 3) {
                                        int iM4 = p115p6.c.m(cVar.f16283c, str, i13);
                                        if (Build.VERSION.SDK_INT < 29 && !cVar.f16285e.containsKey(4)) {
                                            cVar.f16285e.put(4, Integer.valueOf(iM4));
                                        }
                                        if (!cVar.f16285e.containsKey(5)) {
                                            cVar.f16285e.put(5, Integer.valueOf(iM4));
                                        }
                                        cVar.f16285e.put(Integer.valueOf(i8), Integer.valueOf(iM4));
                                    } else if (i8 == 9 || i8 == 32) {
                                        cVar.f16285e.put(Integer.valueOf(i8), Integer.valueOf(cVar.a(i8)));
                                    } else if (!cVar.f16285e.containsKey(Integer.valueOf(i8))) {
                                        cVar.f16285e.put(Integer.valueOf(i8), Integer.valueOf(p115p6.c.m(cVar.f16283c, str, i13)));
                                    }
                                }
                            }
                            i11++;
                            i9 = 8;
                        }
                        int length = cVar.f16284d - iArr.length;
                        cVar.f16284d = length;
                        p138t1.a aVar = cVar.f16282b;
                        if (aVar != null && length == 0) {
                            aVar.f16277a.success(cVar.f16285e);
                        }
                    }
                }
                i10 = 24;
                i9 = 8;
            }
            z4 = z4;
            i10 = 24;
            i9 = 8;
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
            A aE = e(i7);
            boolean zL = ((p033e3.h) ((C0043s0) this.f5822a).f554d).a0(i7).f14781a.l(hVar);
            HashMap map = aE.f3961b;
            if (zL) {
                EnumC0172e enumC0172e = EnumC0172e.f2174a;
                aE.f3962c = true;
                map.put(hVar, enumC0172e);
            } else {
                aE.f3962c = true;
                map.remove(hVar);
            }
            Set hashSet = (Set) ((HashMap) this.f5825d).get(hVar);
            if (hashSet == null) {
                hashSet = new HashSet();
                ((HashMap) this.f5825d).put(hVar, hashSet);
            }
            hashSet.add(Integer.valueOf(i7));
            if (kVar != null) {
                ((HashMap) this.f5824c).put(hVar, kVar);
            }
        }
    }

    public void n(int i7) {
        HashMap map = (HashMap) this.f5823b;
        p113p3.f.O("Should only reset active targets", map.get(Integer.valueOf(i7)) != null && ((A) map.get(Integer.valueOf(i7))).f3960a == 0, new Object[0]);
        map.put(Integer.valueOf(i7), new A());
        Iterator it = ((p033e3.h) ((C0043s0) this.f5822a).f554d).a0(i7).iterator();
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return;
            } else {
                m(i7, (H4.h) f7.next(), null);
            }
        }
    }

    public void p(R0 r7) {
        B1.m mVar = new B1.m(4, 3);
        if (((AbstractC0167z) this.f5823b).isEmpty()) {
            a(mVar, (D) this.f5826e, r7);
            if (!p097n3.a.t((D) this.f5827f, (D) this.f5826e)) {
                a(mVar, (D) this.f5827f, r7);
            }
            if (!p097n3.a.t((D) this.f5825d, (D) this.f5826e) && !p097n3.a.t((D) this.f5825d, (D) this.f5827f)) {
                a(mVar, (D) this.f5825d, r7);
            }
        } else {
            for (int i7 = 0; i7 < ((AbstractC0167z) this.f5823b).size(); i7++) {
                a(mVar, (D) ((AbstractC0167z) this.f5823b).get(i7), r7);
            }
            if (!((AbstractC0167z) this.f5823b).contains((D) this.f5825d)) {
                a(mVar, (D) this.f5825d, r7);
            }
        }
        this.f5824c = mVar.i();
    }

    public Task q(String str, Boolean bool) {
        Task taskT;
        if (zzag.zzc(str)) {
            str = "*";
        }
        if (!bool.booleanValue() && (taskT = t(str)) != null) {
            return taskT;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f5826e;
        return firebaseAuth.f11853e.zza(firebaseAuth.f11858k, "RECAPTCHA_ENTERPRISE").continueWithTask(new w(4, (Object) this, (Object) str, false));
    }

    public Task r(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        if (zzag.zzc(str)) {
            str = "*";
        }
        Task taskT = t(str);
        if (bool.booleanValue() || taskT == null) {
            taskT = q(str, bool);
        }
        return taskT.continueWithTask(new C0894c(recaptchaAction, 4));
    }

    public boolean s() {
        String strZzb;
        zzagm zzagmVar = (zzagm) this.f5824c;
        if (zzagmVar == null || (strZzb = zzagmVar.zzb("PHONE_PROVIDER")) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
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

    public o(String str, AbstractC0829i abstractC0829i, X x4, r0 r0Var, Integer num) {
        this.f5822a = str;
        this.f5823b = t.b(str);
        this.f5824c = abstractC0829i;
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

    public o(p121q5.c cVar, C0726v c0726v) {
        this.f5823b = new HashSet();
        this.f5824c = new HashSet();
        this.f5825d = new HashSet();
        this.f5826e = new HashSet();
        new HashSet();
        this.f5827f = new HashSet();
        this.f5822a = cVar;
        new HiddenLifecycleReference(c0726v);
    }

    public o(P0 p5) {
        this.f5822a = p5;
        C0165x c0165x = AbstractC0167z.f2083b;
        this.f5823b = L.f2000e;
        this.f5824c = Q.f2012x;
    }
}
