package p000;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0030a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0790v4 extends AbstractActivityC0252gk implements InterfaceC0938z4 {

    /* JADX INFO: renamed from: F */
    public boolean f8058F;

    /* JADX INFO: renamed from: G */
    public boolean f8059G;

    /* JADX INFO: renamed from: I */
    public LayoutInflaterFactory2C0828w5 f8061I;

    /* JADX INFO: renamed from: D */
    public final b90 f8056D = new b90(22, new e50(this));

    /* JADX INFO: renamed from: E */
    public final C0030a f8057E = new C0030a(this);

    /* JADX INFO: renamed from: H */
    public boolean f8060H = true;

    public AbstractActivityC0790v4() {
        ((C0086c5) this.f2777m.f5011m).m851e("android:support:lifecycle", new C0021ak(1, this));
        final int i = 0;
        this.f2782r.add(new InterfaceC0291hm(this) { // from class: d50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0790v4 f1556b;

            {
                this.f1556b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i2 = i;
                AbstractActivityC0790v4 abstractActivityC0790v4 = this.f1556b;
                switch (i2) {
                    case 0:
                        abstractActivityC0790v4.f8056D.m624v();
                        break;
                    default:
                        abstractActivityC0790v4.f8056D.m624v();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f2784t.add(new InterfaceC0291hm(this) { // from class: d50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0790v4 f1556b;

            {
                this.f1556b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractActivityC0790v4 abstractActivityC0790v4 = this.f1556b;
                switch (i3) {
                    case 0:
                        abstractActivityC0790v4.f8056D.m624v();
                        break;
                    default:
                        abstractActivityC0790v4.f8056D.m624v();
                        break;
                }
            }
        });
        m2117g(new C0065bk(this, 1));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5050k(t50 t50Var) {
        boolean zM5050k = false;
        for (c50 c50Var : t50Var.f7299c.m1668n()) {
            if (c50Var != null) {
                e50 e50Var = c50Var.f1100D;
                if ((e50Var == null ? null : e50Var.f1955r) != null) {
                    zM5050k |= m5050k(c50Var.m866h());
                }
                c60 c60Var = c50Var.f1121Y;
                qh0 qh0Var = qh0.f6499l;
                qh0 qh0Var2 = qh0.f6500m;
                if (c60Var != null && c60Var.mo862d().f551c.compareTo(qh0Var2) >= 0) {
                    C0030a c0030a = c50Var.f1121Y.f1153m;
                    c0030a.m439c("setCurrentState");
                    c0030a.m441e(qh0Var);
                    zM5050k = true;
                }
                if (c50Var.f1120X.f551c.compareTo(qh0Var2) >= 0) {
                    C0030a c0030a2 = c50Var.f1120X;
                    c0030a2.m439c("setCurrentState");
                    c0030a2.m441e(qh0Var);
                    zM5050k = true;
                }
            }
        }
        return zM5050k;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2119i();
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        layoutInflaterFactory2C0828w5.m5252v();
        ((ViewGroup) layoutInflaterFactory2C0828w5.f8393I.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0828w5.f8429v.m4033a(layoutInflaterFactory2C0828w5.f8428u.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0175  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        C0771um c0771um;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
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
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        layoutInflaterFactory2C0828w5.f8407W = true;
        int i41 = layoutInflaterFactory2C0828w5.f8411a0;
        if (i41 == -100) {
            i41 = AbstractC0274h5.f3054k;
        }
        int iM5238B = layoutInflaterFactory2C0828w5.m5238B(context, i41);
        int i42 = 0;
        if (AbstractC0274h5.m2209b(context) && AbstractC0274h5.m2209b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0274h5.f3061r) {
                    try {
                        tj0 tj0Var = AbstractC0274h5.f3055l;
                        if (tj0Var == null) {
                            if (AbstractC0274h5.f3056m == null) {
                                AbstractC0274h5.f3056m = tj0.m4790a(AbstractC0477mo.m3410l(context));
                            }
                            if (!AbstractC0274h5.f3056m.f7456a.f7828a.isEmpty()) {
                                AbstractC0274h5.f3055l = AbstractC0274h5.f3056m;
                            }
                        } else if (!tj0Var.equals(AbstractC0274h5.f3056m)) {
                            tj0 tj0Var2 = AbstractC0274h5.f3055l;
                            AbstractC0274h5.f3056m = tj0Var2;
                            AbstractC0477mo.m3409k(context, tj0Var2.f7456a.f7828a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC0274h5.f3058o) {
                AbstractC0274h5.f3053j.execute(new RunnableC0126d5(context, i42));
            }
        }
        tj0 tj0VarM5235o = LayoutInflaterFactory2C0828w5.m5235o(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C0771um) {
                    try {
                        ((C0771um) context).m4935a(LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C0828w5.f8384r0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    AbstractC0495n5.m3478a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    i25 = configuration.colorMode & 3;
                                    i26 = configuration2.colorMode & 3;
                                    if (i25 != i26) {
                                        configuration3.colorMode |= i26;
                                    }
                                    i27 = configuration.colorMode & 12;
                                    i28 = configuration2.colorMode & 12;
                                    if (i27 != i28) {
                                        configuration3.colorMode |= i28;
                                    }
                                    i29 = configuration.uiMode & 15;
                                    i30 = configuration2.uiMode & 15;
                                    if (i29 != i30) {
                                        configuration3.uiMode |= i30;
                                    }
                                    i31 = configuration.uiMode & 48;
                                    i32 = configuration2.uiMode & 48;
                                    if (i31 != i32) {
                                        configuration3.uiMode |= i32;
                                    }
                                    i33 = configuration.screenWidthDp;
                                    i34 = configuration2.screenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.screenWidthDp = i34;
                                    }
                                    i35 = configuration.screenHeightDp;
                                    i36 = configuration2.screenHeightDp;
                                    if (i35 != i36) {
                                        configuration3.screenHeightDp = i36;
                                    }
                                    i37 = configuration.smallestScreenWidthDp;
                                    i38 = configuration2.smallestScreenWidthDp;
                                    if (i37 != i38) {
                                        configuration3.smallestScreenWidthDp = i38;
                                    }
                                    i39 = configuration.densityDpi;
                                    i40 = configuration2.densityDpi;
                                    if (i39 != i40) {
                                        configuration3.densityDpi = i40;
                                    }
                                }
                            }
                            Configuration configurationM5236s = LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, configuration3, true);
                            c0771um = new C0771um(context, live.football.scorerepublic.R.style.Theme_AppCompat_Empty);
                            c0771um.m4935a(configurationM5236s);
                            try {
                                if (context.getTheme() != null) {
                                    c0771um.getTheme().rebase();
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c0771um;
                        }
                    }
                } else if (LayoutInflaterFactory2C0828w5.f8384r0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            AbstractC0495n5.m3478a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    }
                    Configuration configurationM5236s2 = LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, configuration3, true);
                    c0771um = new C0771um(context, live.football.scorerepublic.R.style.Theme_AppCompat_Empty);
                    c0771um.m4935a(configurationM5236s2);
                    if (context.getTheme() != null) {
                        c0771um.getTheme().rebase();
                    }
                    context = c0771um;
                }
            }
        } else if (context instanceof C0771um) {
            ((C0771um) context).m4935a(LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, null, false));
        } else if (LayoutInflaterFactory2C0828w5.f8384r0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    AbstractC0495n5.m3478a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            }
            Configuration configurationM5236s3 = LayoutInflaterFactory2C0828w5.m5236s(context, iM5238B, tj0VarM5235o, configuration3, true);
            c0771um = new C0771um(context, live.football.scorerepublic.R.style.Theme_AppCompat_Empty);
            c0771um.m4935a(configurationM5236s3);
            if (context.getTheme() != null) {
                c0771um.getTheme().rebase();
            }
            context = c0771um;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0828w5) m5051j()).m5256z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p000.AbstractActivityC0214fk, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0828w5) m5051j()).m5256z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f8058F);
        printWriter.print(" mResumed=");
        printWriter.print(this.f8059G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8060H);
        if (getApplication() != null) {
            oq0 oq0Var = new oq0(mo861c(), rj0.f6861d);
            String canonicalName = rj0.class.getCanonicalName();
            if (canonicalName == null) {
                C0270h1.m2190f("Local and anonymous classes can not be ViewModels");
                return;
            }
            g91 g91Var = ((rj0) oq0Var.m3733c(rj0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f6862c;
            if (g91Var.f2669l > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (g91Var.f2669l > 0) {
                    if (g91Var.f2668k[0] != null) {
                        dd0.m1158c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(g91Var.f2667j[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((e50) this.f8056D.f793k).f1954q.m4743w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        layoutInflaterFactory2C0828w5.m5252v();
        return layoutInflaterFactory2C0828w5.f8428u.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        if (layoutInflaterFactory2C0828w5.f8431x == null) {
            layoutInflaterFactory2C0828w5.m5256z();
            hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
            layoutInflaterFactory2C0828w5.f8431x = new vb1(hj1Var != null ? hj1Var.m2276b() : layoutInflaterFactory2C0828w5.f8427t);
        }
        return layoutInflaterFactory2C0828w5.f8431x;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = gh1.f2738a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        if (layoutInflaterFactory2C0828w5.f8430w != null) {
            layoutInflaterFactory2C0828w5.m5256z();
            layoutInflaterFactory2C0828w5.f8430w.getClass();
            layoutInflaterFactory2C0828w5.m5237A(0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0274h5 m5051j() {
        if (this.f8061I == null) {
            ExecutorC0237g5 executorC0237g5 = AbstractC0274h5.f3053j;
            this.f8061I = new LayoutInflaterFactory2C0828w5(this, null, this, this);
        }
        return this.f8061I;
    }

    /* JADX INFO: renamed from: l */
    public final void m5052l() throws Exception {
        super.onDestroy();
        ((e50) this.f8056D.f793k).f1954q.m4732l();
        this.f8057E.m440d(ph0.ON_DESTROY);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5053m(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((e50) this.f8056D.f793k).f1954q.m4730j();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m5054n() {
        super.onPostResume();
        this.f8057E.m440d(ph0.ON_RESUME);
        t50 t50Var = ((e50) this.f8056D.f793k).f1954q;
        t50Var.f7288H = false;
        t50Var.f7289I = false;
        t50Var.f7295O.f8094h = false;
        t50Var.m4741u(7);
    }

    /* JADX INFO: renamed from: o */
    public final void m5055o() {
        b90 b90Var = this.f8056D;
        b90Var.m624v();
        e50 e50Var = (e50) b90Var.f793k;
        super.onStart();
        this.f8060H = false;
        if (!this.f8058F) {
            this.f8058F = true;
            t50 t50Var = e50Var.f1954q;
            t50Var.f7288H = false;
            t50Var.f7289I = false;
            t50Var.f7295O.f8094h = false;
            t50Var.m4741u(4);
        }
        e50Var.f1954q.m4696A(true);
        this.f8057E.m440d(ph0.ON_START);
        t50 t50Var2 = e50Var.f1954q;
        t50Var2.f7288H = false;
        t50Var2.f7289I = false;
        t50Var2.f7295O.f8094h = false;
        t50Var2.m4741u(5);
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f8056D.m624v();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        if (layoutInflaterFactory2C0828w5.f8398N && layoutInflaterFactory2C0828w5.f8392H) {
            layoutInflaterFactory2C0828w5.m5256z();
            hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
            if (hj1Var != null) {
                hj1Var.m2279e(hj1Var.f3227a.getResources().getBoolean(live.football.scorerepublic.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0939z5 c0939z5M5859a = C0939z5.m5859a();
        Context context = layoutInflaterFactory2C0828w5.f8427t;
        synchronized (c0939z5M5859a) {
            f21 f21Var = c0939z5M5859a.f9607a;
            synchronized (f21Var) {
                kk0 kk0Var = (kk0) f21Var.f2277b.get(context);
                if (kk0Var != null) {
                    int i = kk0Var.f4403m;
                    Object[] objArr = kk0Var.f4402l;
                    for (int i2 = 0; i2 < i; i2++) {
                        objArr[i2] = null;
                    }
                    kk0Var.f4403m = 0;
                    kk0Var.f4400j = false;
                }
            }
        }
        layoutInflaterFactory2C0828w5.f8410Z = new Configuration(layoutInflaterFactory2C0828w5.f8427t.getResources().getConfiguration());
        layoutInflaterFactory2C0828w5.m5245m(false, false);
    }

    @Override // p000.AbstractActivityC0252gk, p000.AbstractActivityC0214fk, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8057E.m440d(ph0.ON_CREATE);
        t50 t50Var = ((e50) this.f8056D.f793k).f1954q;
        t50Var.f7288H = false;
        t50Var.f7289I = false;
        t50Var.f7295O.f8094h = false;
        t50Var.m4741u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((e50) this.f8056D.f793k).f1954q.f7302f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() throws Exception {
        m5052l();
        m5051j().mo2213d();
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM2808q;
        if (!m5053m(i, menuItem)) {
            LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
            layoutInflaterFactory2C0828w5.m5256z();
            hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
            if (menuItem.getItemId() != 16908332 || hj1Var == null || (((xd1) hj1Var.f3231e).f8897b & 4) == 0 || (intentM2808q = j22.m2808q(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM2808q)) {
                navigateUpTo(intentM2808q);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM2808q2 = j22.m2808q(this);
            if (intentM2808q2 == null) {
                intentM2808q2 = j22.m2808q(this);
            }
            if (intentM2808q2 != null) {
                ComponentName component = intentM2808q2.getComponent();
                if (component == null) {
                    component = intentM2808q2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM2809r = j22.m2809r(this, component);
                    while (intentM2809r != null) {
                        arrayList.add(size, intentM2809r);
                        intentM2809r = j22.m2809r(this, intentM2809r.getComponent());
                    }
                    arrayList.add(intentM2808q2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                C0270h1.m2191g("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f8059G = false;
        ((e50) this.f8056D.f793k).f1954q.m4741u(5);
        this.f8057E.m440d(ph0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0828w5) m5051j()).m5252v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m5054n();
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        layoutInflaterFactory2C0828w5.m5256z();
        hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
        if (hj1Var != null) {
            hj1Var.f3246t = true;
        }
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f8056D.m624v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        b90 b90Var = this.f8056D;
        b90Var.m624v();
        super.onResume();
        this.f8059G = true;
        ((e50) b90Var.f793k).f1954q.m4696A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        m5055o();
        ((LayoutInflaterFactory2C0828w5) m5051j()).m5245m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f8056D.m624v();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m5056p();
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m5051j();
        layoutInflaterFactory2C0828w5.m5256z();
        hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
        if (hj1Var != null) {
            hj1Var.f3246t = false;
            ki1 ki1Var = hj1Var.f3245s;
            if (ki1Var != null) {
                ki1Var.m3045a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m5051j().mo2218l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0828w5) m5051j()).m5256z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5056p() {
        b90 b90Var;
        super.onStop();
        this.f8060H = true;
        do {
            b90Var = this.f8056D;
        } while (m5050k(((e50) b90Var.f793k).f1954q));
        t50 t50Var = ((e50) b90Var.f793k).f1954q;
        t50Var.f7289I = true;
        t50Var.f7295O.f8094h = true;
        t50Var.m4741u(4);
        this.f8057E.m440d(ph0.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m2119i();
        m5051j().mo2215h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0828w5) m5051j()).f8412b0 = i;
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity
    public void setContentView(View view) {
        m2119i();
        m5051j().mo2216j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2119i();
        m5051j().mo2217k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((e50) this.f8056D.f793k).f1954q.f7302f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
