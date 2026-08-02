package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f37251f;

    /* renamed from: a, reason: collision with root package name */
    private int f37252a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f37253b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f37254c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f37255d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f37256e;

    public d() {
        super(null);
    }

    private void c() {
        if (this.f37253b == null) {
            this.f37253b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f37253b.setTo(theme);
            }
        }
        this.f37253b.applyStyle(this.f37252a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f37256e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f37255d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f37255d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final int b() {
        return this.f37252a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f37256e == null) {
            Configuration configuration = this.f37255d;
            if (configuration != null) {
                if (f37251f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f37251f = configuration2;
                }
                if (!configuration.equals(f37251f)) {
                    this.f37256e = createConfigurationContext(this.f37255d).getResources();
                }
            }
            this.f37256e = super.getResources();
        }
        return this.f37256e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f37254c == null) {
            this.f37254c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f37254c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f37253b;
        if (theme != null) {
            return theme;
        }
        if (this.f37252a == 0) {
            this.f37252a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.f37253b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i11) {
        if (this.f37252a != i11) {
            this.f37252a = i11;
            c();
        }
    }

    public d(Context context, int i11) {
        super(context);
        this.f37252a = i11;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f37253b = theme;
    }
}
