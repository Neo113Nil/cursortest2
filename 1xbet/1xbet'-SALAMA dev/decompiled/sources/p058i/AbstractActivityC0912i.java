package p058i;

import A0.g;
import F.AbstractC0213i;
import F.K;
import F.L;
import H.l;
import L.b;
import L.j;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0;
import androidx.appcompat.widget.C0644u;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o1;
import androidx.fragment.app.A;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p078l.a;
import p078l.e;
import p122r.f;
import p155w1.C1013m0;
import t6.h;

/* JADX INFO: renamed from: i.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0912i extends A implements j, K {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private m mDelegate;
    private Resources mResources;

    @Override // androidx.activity.o, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        v vVar = (v) getDelegate();
        vVar.x();
        ((ViewGroup) vVar.f13771R.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f13757D.a(vVar.f13756C.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01da  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:126:0x0203  */
    /* JADX WARN: Code duplicated, block: B:128:0x020b  */
    /* JADX WARN: Code duplicated, block: B:129:0x020f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0230 A[Catch: all -> 0x0224, TRY_LEAVE, TryCatch #0 {, blocks: (B:131:0x0212, B:133:0x0216, B:139:0x022e, B:140:0x0230, B:142:0x0234, B:148:0x0244, B:147:0x023b, B:138:0x0227), top: B:158:0x0212, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i7;
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        e eVar;
        Resources.Theme theme;
        Method method;
        float f7;
        float f8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        v vVar = (v) getDelegate();
        vVar.f13784f0 = true;
        int i44 = vVar.f13788j0;
        if (i44 == -100) {
            i44 = m.f13713b;
        }
        int iD = vVar.D(i44, context);
        if (m.d(context) && m.d(context)) {
            if (!b.c()) {
                synchronized (m.f13720z) {
                    try {
                        j jVar = m.f13714c;
                        if (jVar == null) {
                            if (m.f13715d == null) {
                                m.f13715d = j.a(P6.b.E(context));
                            }
                            if (!m.f13715d.f4186a.f4187a.isEmpty()) {
                                m.f13714c = m.f13715d;
                            }
                        } else if (!jVar.equals(m.f13715d)) {
                            j jVar2 = m.f13714c;
                            m.f13715d = jVar2;
                            P6.b.C(context, jVar2.f4186a.f4187a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!m.f13717f) {
                m.f13712a.execute(new g(context, 2));
            }
        }
        j jVarQ = v.q(context);
        if (v.f13751B0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.u(context, iD, jVarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof e) {
                    ((e) context).a(v.u(context, iD, jVarQ, null, false));
                } else if (v.f13750A0) {
                    i7 = Build.VERSION.SDK_INT;
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = null;
                    } else {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f7 = configuration.fontScale;
                            f8 = configuration2.fontScale;
                            if (f7 != f8) {
                                configuration3.fontScale = f8;
                            }
                            i8 = configuration.mcc;
                            i9 = configuration2.mcc;
                            if (i8 != i9) {
                                configuration3.mcc = i9;
                            }
                            i10 = configuration.mnc;
                            i11 = configuration2.mnc;
                            if (i10 != i11) {
                                configuration3.mnc = i11;
                            }
                            p.a(configuration, configuration2, configuration3);
                            i12 = configuration.touchscreen;
                            i13 = configuration2.touchscreen;
                            if (i12 != i13) {
                                configuration3.touchscreen = i13;
                            }
                            i14 = configuration.keyboard;
                            i15 = configuration2.keyboard;
                            if (i14 != i15) {
                                configuration3.keyboard = i15;
                            }
                            i16 = configuration.keyboardHidden;
                            i17 = configuration2.keyboardHidden;
                            if (i16 != i17) {
                                configuration3.keyboardHidden = i17;
                            }
                            i18 = configuration.navigation;
                            i19 = configuration2.navigation;
                            if (i18 != i19) {
                                configuration3.navigation = i19;
                            }
                            i20 = configuration.navigationHidden;
                            i21 = configuration2.navigationHidden;
                            if (i20 != i21) {
                                configuration3.navigationHidden = i21;
                            }
                            i22 = configuration.orientation;
                            i23 = configuration2.orientation;
                            if (i22 != i23) {
                                configuration3.orientation = i23;
                            }
                            i24 = configuration.screenLayout & 15;
                            i25 = configuration2.screenLayout & 15;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            i26 = configuration.screenLayout & 192;
                            i27 = configuration2.screenLayout & 192;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 48;
                            i29 = configuration2.screenLayout & 48;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 768;
                            i31 = configuration2.screenLayout & 768;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            if (i7 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i32 = configuration.uiMode & 15;
                            i33 = configuration2.uiMode & 15;
                            if (i32 != i33) {
                                configuration3.uiMode |= i33;
                            }
                            i34 = configuration.uiMode & 48;
                            i35 = configuration2.uiMode & 48;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.screenWidthDp;
                            i37 = configuration2.screenWidthDp;
                            if (i36 != i37) {
                                configuration3.screenWidthDp = i37;
                            }
                            i38 = configuration.screenHeightDp;
                            i39 = configuration2.screenHeightDp;
                            if (i38 != i39) {
                                configuration3.screenHeightDp = i39;
                            }
                            i40 = configuration.smallestScreenWidthDp;
                            i41 = configuration2.smallestScreenWidthDp;
                            if (i40 != i41) {
                                configuration3.smallestScreenWidthDp = i41;
                            }
                            i42 = configuration.densityDpi;
                            i43 = configuration2.densityDpi;
                            if (i42 != i43) {
                                configuration3.densityDpi = i43;
                            }
                        }
                    }
                    Configuration configurationU = v.u(context, iD, jVarQ, configuration3, true);
                    eVar = new e(context, com.salamadev.nabilalawadi.kisaskoran.R.style.Theme_AppCompat_Empty);
                    eVar.a(configurationU);
                    if (context.getTheme() != null) {
                        theme = eVar.getTheme();
                        if (i7 >= 29) {
                            l.a(theme);
                        } else {
                            synchronized (H.b.f3154e) {
                                if (H.b.f3156g) {
                                    method = H.b.f3155f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    H.b.f3155f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    H.b.f3156g = true;
                                    method = H.b.f3155f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = eVar;
                }
            }
        } else if (context instanceof e) {
            try {
                ((e) context).a(v.u(context, iD, jVarQ, null, false));
            } catch (IllegalStateException unused2) {
                if (v.f13750A0) {
                    i7 = Build.VERSION.SDK_INT;
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f7 = configuration.fontScale;
                            f8 = configuration2.fontScale;
                            if (f7 != f8) {
                                configuration3.fontScale = f8;
                            }
                            i8 = configuration.mcc;
                            i9 = configuration2.mcc;
                            if (i8 != i9) {
                                configuration3.mcc = i9;
                            }
                            i10 = configuration.mnc;
                            i11 = configuration2.mnc;
                            if (i10 != i11) {
                                configuration3.mnc = i11;
                            }
                            p.a(configuration, configuration2, configuration3);
                            i12 = configuration.touchscreen;
                            i13 = configuration2.touchscreen;
                            if (i12 != i13) {
                                configuration3.touchscreen = i13;
                            }
                            i14 = configuration.keyboard;
                            i15 = configuration2.keyboard;
                            if (i14 != i15) {
                                configuration3.keyboard = i15;
                            }
                            i16 = configuration.keyboardHidden;
                            i17 = configuration2.keyboardHidden;
                            if (i16 != i17) {
                                configuration3.keyboardHidden = i17;
                            }
                            i18 = configuration.navigation;
                            i19 = configuration2.navigation;
                            if (i18 != i19) {
                                configuration3.navigation = i19;
                            }
                            i20 = configuration.navigationHidden;
                            i21 = configuration2.navigationHidden;
                            if (i20 != i21) {
                                configuration3.navigationHidden = i21;
                            }
                            i22 = configuration.orientation;
                            i23 = configuration2.orientation;
                            if (i22 != i23) {
                                configuration3.orientation = i23;
                            }
                            i24 = configuration.screenLayout & 15;
                            i25 = configuration2.screenLayout & 15;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            i26 = configuration.screenLayout & 192;
                            i27 = configuration2.screenLayout & 192;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 48;
                            i29 = configuration2.screenLayout & 48;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 768;
                            i31 = configuration2.screenLayout & 768;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            if (i7 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i32 = configuration.uiMode & 15;
                            i33 = configuration2.uiMode & 15;
                            if (i32 != i33) {
                                configuration3.uiMode |= i33;
                            }
                            i34 = configuration.uiMode & 48;
                            i35 = configuration2.uiMode & 48;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.screenWidthDp;
                            i37 = configuration2.screenWidthDp;
                            if (i36 != i37) {
                                configuration3.screenWidthDp = i37;
                            }
                            i38 = configuration.screenHeightDp;
                            i39 = configuration2.screenHeightDp;
                            if (i38 != i39) {
                                configuration3.screenHeightDp = i39;
                            }
                            i40 = configuration.smallestScreenWidthDp;
                            i41 = configuration2.smallestScreenWidthDp;
                            if (i40 != i41) {
                                configuration3.smallestScreenWidthDp = i41;
                            }
                            i42 = configuration.densityDpi;
                            i43 = configuration2.densityDpi;
                            if (i42 != i43) {
                                configuration3.densityDpi = i43;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = v.u(context, iD, jVarQ, configuration3, true);
                    eVar = new e(context, com.salamadev.nabilalawadi.kisaskoran.R.style.Theme_AppCompat_Empty);
                    eVar.a(configurationU2);
                    try {
                        if (context.getTheme() != null) {
                            theme = eVar.getTheme();
                            if (i7 >= 29) {
                                l.a(theme);
                            } else {
                                synchronized (H.b.f3154e) {
                                    if (H.b.f3156g) {
                                        try {
                                            Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                            H.b.f3155f = declaredMethod2;
                                            declaredMethod2.setAccessible(true);
                                        } catch (NoSuchMethodException e7) {
                                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                                        }
                                        H.b.f3156g = true;
                                        method = H.b.f3155f;
                                        if (method != null) {
                                            try {
                                                method.invoke(theme, null);
                                            } catch (IllegalAccessException | InvocationTargetException e8) {
                                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                                H.b.f3155f = null;
                                            }
                                        }
                                    } else {
                                        method = H.b.f3155f;
                                        if (method != null) {
                                            method.invoke(theme, null);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NullPointerException unused3) {
                    }
                    context = eVar;
                }
            }
        } else if (v.f13750A0) {
            i7 = Build.VERSION.SDK_INT;
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f7 = configuration.fontScale;
                    f8 = configuration2.fontScale;
                    if (f7 != f8) {
                        configuration3.fontScale = f8;
                    }
                    i8 = configuration.mcc;
                    i9 = configuration2.mcc;
                    if (i8 != i9) {
                        configuration3.mcc = i9;
                    }
                    i10 = configuration.mnc;
                    i11 = configuration2.mnc;
                    if (i10 != i11) {
                        configuration3.mnc = i11;
                    }
                    p.a(configuration, configuration2, configuration3);
                    i12 = configuration.touchscreen;
                    i13 = configuration2.touchscreen;
                    if (i12 != i13) {
                        configuration3.touchscreen = i13;
                    }
                    i14 = configuration.keyboard;
                    i15 = configuration2.keyboard;
                    if (i14 != i15) {
                        configuration3.keyboard = i15;
                    }
                    i16 = configuration.keyboardHidden;
                    i17 = configuration2.keyboardHidden;
                    if (i16 != i17) {
                        configuration3.keyboardHidden = i17;
                    }
                    i18 = configuration.navigation;
                    i19 = configuration2.navigation;
                    if (i18 != i19) {
                        configuration3.navigation = i19;
                    }
                    i20 = configuration.navigationHidden;
                    i21 = configuration2.navigationHidden;
                    if (i20 != i21) {
                        configuration3.navigationHidden = i21;
                    }
                    i22 = configuration.orientation;
                    i23 = configuration2.orientation;
                    if (i22 != i23) {
                        configuration3.orientation = i23;
                    }
                    i24 = configuration.screenLayout & 15;
                    i25 = configuration2.screenLayout & 15;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    i26 = configuration.screenLayout & 192;
                    i27 = configuration2.screenLayout & 192;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & 48;
                    i29 = configuration2.screenLayout & 48;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 768;
                    i31 = configuration2.screenLayout & 768;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    if (i7 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i32 = configuration.uiMode & 15;
                    i33 = configuration2.uiMode & 15;
                    if (i32 != i33) {
                        configuration3.uiMode |= i33;
                    }
                    i34 = configuration.uiMode & 48;
                    i35 = configuration2.uiMode & 48;
                    if (i34 != i35) {
                        configuration3.uiMode |= i35;
                    }
                    i36 = configuration.screenWidthDp;
                    i37 = configuration2.screenWidthDp;
                    if (i36 != i37) {
                        configuration3.screenWidthDp = i37;
                    }
                    i38 = configuration.screenHeightDp;
                    i39 = configuration2.screenHeightDp;
                    if (i38 != i39) {
                        configuration3.screenHeightDp = i39;
                    }
                    i40 = configuration.smallestScreenWidthDp;
                    i41 = configuration2.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration3.smallestScreenWidthDp = i41;
                    }
                    i42 = configuration.densityDpi;
                    i43 = configuration2.densityDpi;
                    if (i42 != i43) {
                        configuration3.densityDpi = i43;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = v.u(context, iD, jVarQ, configuration3, true);
            eVar = new e(context, com.salamadev.nabilalawadi.kisaskoran.R.style.Theme_AppCompat_Empty);
            eVar.a(configurationU3);
            if (context.getTheme() != null) {
                theme = eVar.getTheme();
                if (i7 >= 29) {
                    l.a(theme);
                } else {
                    synchronized (H.b.f3154e) {
                        if (H.b.f3156g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            H.b.f3155f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            H.b.f3156g = true;
                            method = H.b.f3155f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = H.b.f3155f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0904a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        h.e(decorView, "<this>");
        decorView.setTag(com.salamadev.nabilalawadi.kisaskoran.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        h.e(decorView2, "<this>");
        decorView2.setTag(com.salamadev.nabilalawadi.kisaskoran.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        h.e(decorView3, "<this>");
        decorView3.setTag(com.salamadev.nabilalawadi.kisaskoran.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        h.e(decorView4, "<this>");
        decorView4.setTag(com.salamadev.nabilalawadi.kisaskoran.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // F.m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0904a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i7) {
        v vVar = (v) getDelegate();
        vVar.x();
        return (T) vVar.f13756C.findViewById(i7);
    }

    public m getDelegate() {
        if (this.mDelegate == null) {
            B b7 = m.f13712a;
            this.mDelegate = new v(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0905b getDrawerToggleDelegate() {
        ((v) getDelegate()).getClass();
        return new C1013m0(18);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        v vVar = (v) getDelegate();
        if (vVar.f13760G == null) {
            vVar.B();
            AbstractC0904a abstractC0904a = vVar.f13759F;
            vVar.f13760G = new p078l.j(abstractC0904a != null ? abstractC0904a.e() : vVar.f13755B);
        }
        return vVar.f13760G;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i7 = o1.f8729a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0904a getSupportActionBar() {
        v vVar = (v) getDelegate();
        vVar.B();
        return vVar.f13759F;
    }

    @Override // F.K
    public Intent getSupportParentActivityIntent() {
        return AbstractC0213i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().c();
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        v vVar = (v) getDelegate();
        if (vVar.f13776W && vVar.f13770Q) {
            vVar.B();
            AbstractC0904a abstractC0904a = vVar.f13759F;
            if (abstractC0904a != null) {
                abstractC0904a.i();
            }
        }
        C0644u c0644uA = C0644u.a();
        Context context = vVar.f13755B;
        synchronized (c0644uA) {
            C0 c0 = c0644uA.f8748a;
            synchronized (c0) {
                f fVar = (f) c0.f8323b.get(context);
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        vVar.f13787i0 = new Configuration(vVar.f13755B.getResources().getConfiguration());
        vVar.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(L l7) {
        l7.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0213i.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC0912i abstractActivityC0912i = l7.f2428b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC0912i.getPackageManager());
            }
            ArrayList arrayList = l7.f2427a;
            int size = arrayList.size();
            try {
                for (Intent intentB = AbstractC0213i.b(abstractActivityC0912i, component); intentB != null; intentB = AbstractC0213i.b(abstractActivityC0912i, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e7);
            }
        }
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC0904a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) getDelegate()).x();
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        v vVar = (v) getDelegate();
        vVar.B();
        AbstractC0904a abstractC0904a = vVar.f13759F;
        if (abstractC0904a != null) {
            abstractC0904a.q(true);
        }
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onStart() throws IllegalAccessException {
        super.onStart();
        ((v) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onStop() {
        super.onStop();
        v vVar = (v) getDelegate();
        vVar.B();
        AbstractC0904a abstractC0904a = vVar.f13759F;
        if (abstractC0904a != null) {
            abstractC0904a.q(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            L l7 = new L(this);
            onCreateSupportNavigateUpTaskStack(l7);
            onPrepareSupportNavigateUpTaskStack(l7);
            ArrayList arrayList = l7.f2427a;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            AbstractActivityC0912i abstractActivityC0912i = l7.f2428b;
            if (!G.h.startActivities(abstractActivityC0912i, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                abstractActivityC0912i.startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        getDelegate().m(charSequence);
    }

    @Override // p058i.j
    public p078l.b onWindowStartingSupportActionMode(a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0904a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(int i7) {
        d();
        getDelegate().j(i7);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        v vVar = (v) getDelegate();
        if (vVar.f13754A instanceof Activity) {
            vVar.B();
            AbstractC0904a abstractC0904a = vVar.f13759F;
            if (abstractC0904a instanceof I) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            vVar.f13760G = null;
            if (abstractC0904a != null) {
                abstractC0904a.j();
            }
            vVar.f13759F = null;
            if (toolbar != null) {
                Object obj = vVar.f13754A;
                E e7 = new E(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : vVar.f13761H, vVar.f13757D);
                vVar.f13759F = e7;
                vVar.f13757D.f13726b = e7.f13617c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                vVar.f13757D.f13726b = null;
            }
            vVar.c();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        super.setTheme(i7);
        ((v) getDelegate()).f13789k0 = i7;
    }

    public p078l.b startSupportActionMode(a aVar) {
        return getDelegate().n(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().c();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().i(i7);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view) {
        d();
        getDelegate().k(view);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        getDelegate().l(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(j jVar) {
    }

    public void onNightModeChanged(int i7) {
    }

    public void onPrepareSupportNavigateUpTaskStack(L l7) {
    }

    @Override // p058i.j
    public void onSupportActionModeFinished(p078l.b bVar) {
    }

    @Override // p058i.j
    public void onSupportActionModeStarted(p078l.b bVar) {
    }

    @Deprecated
    public void setSupportProgress(int i7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }
}
