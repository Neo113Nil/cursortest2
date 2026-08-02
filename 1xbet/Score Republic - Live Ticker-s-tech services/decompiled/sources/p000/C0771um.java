package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: um */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771um extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f7853f;

    /* JADX INFO: renamed from: a */
    public int f7854a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f7855b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f7856c;

    /* JADX INFO: renamed from: d */
    public Configuration f7857d;

    /* JADX INFO: renamed from: e */
    public Resources f7858e;

    public C0771um(Context context, int i) {
        super(context);
        this.f7854a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4935a(Configuration configuration) {
        if (this.f7858e != null) {
            C0270h1.m2191g("getResources() or getAssets() has already been called");
        } else if (this.f7857d == null) {
            this.f7857d = new Configuration(configuration);
        } else {
            C0270h1.m2191g("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m4936b() {
        if (this.f7855b == null) {
            this.f7855b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7855b.setTo(theme);
            }
        }
        this.f7855b.applyStyle(this.f7854a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f7858e == null) {
            Configuration configuration = this.f7857d;
            if (configuration == null) {
                this.f7858e = super.getResources();
            } else {
                if (f7853f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f7853f = configuration2;
                }
                if (configuration.equals(f7853f)) {
                    this.f7858e = super.getResources();
                } else {
                    this.f7858e = createConfigurationContext(this.f7857d).getResources();
                }
            }
        }
        return this.f7858e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7856c == null) {
            this.f7856c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7856c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f7855b;
        if (theme != null) {
            return theme;
        }
        if (this.f7854a == 0) {
            this.f7854a = R.style.Theme_AppCompat_Light;
        }
        m4936b();
        return this.f7855b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f7854a != i) {
            this.f7854a = i;
            m4936b();
        }
    }
}
