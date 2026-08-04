package p078l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f14804f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f14806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f14807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f14808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f14809e;

    public e(Context context, int i7) {
        super(context);
        this.f14805a = i7;
    }

    public final void a(Configuration configuration) {
        if (this.f14809e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f14808d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f14808d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f14806b == null) {
            this.f14806b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14806b.setTo(theme);
            }
        }
        this.f14806b.applyStyle(this.f14805a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f14809e == null) {
            Configuration configuration = this.f14808d;
            if (configuration == null) {
                this.f14809e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f14804f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f14804f = configuration2;
                    }
                    if (configuration.equals(f14804f)) {
                        this.f14809e = super.getResources();
                    }
                }
                this.f14809e = d.a(this, this.f14808d).getResources();
            }
        }
        return this.f14809e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14807c == null) {
            this.f14807c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14807c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14806b;
        if (theme != null) {
            return theme;
        }
        if (this.f14805a == 0) {
            this.f14805a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f14806b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f14805a != i7) {
            this.f14805a = i7;
            b();
        }
    }
}
