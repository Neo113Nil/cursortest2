package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f14798f;

    /* renamed from: a, reason: collision with root package name */
    public int f14799a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f14800b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f14801c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f14802d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f14803e;

    public C1367e(Context context, int i7) {
        super(context);
        this.f14799a = i7;
    }

    public final void a(Configuration configuration) {
        if (this.f14803e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f14802d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f14802d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f14800b == null) {
            this.f14800b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14800b.setTo(theme);
            }
        }
        this.f14800b.applyStyle(this.f14799a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(l.C1367e.f14798f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f14803e == null) {
            Configuration configuration = this.f14802d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f14798f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f14798f = configuration2;
                    }
                }
                this.f14803e = AbstractC1366d.a(this, this.f14802d).getResources();
            }
            this.f14803e = super.getResources();
        }
        return this.f14803e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14801c == null) {
            this.f14801c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14801c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14800b;
        if (theme != null) {
            return theme;
        }
        if (this.f14799a == 0) {
            this.f14799a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f14800b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f14799a != i7) {
            this.f14799a = i7;
            b();
        }
    }
}
